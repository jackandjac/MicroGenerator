
package com.isolver.codegenerator.codegen.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.isolver.codegenerator.codegen.CodegenApplication;
import com.isolver.codegenerator.codegen.Configuration;

@Component
public class MainClassGenerator {

	public static final String SPRINGBOOTAPPLICATION_TAG = "@SpringBootApplication";

	private List<String> importLib;
	@Autowired
	private Configuration configuration;

	public MainClassGenerator() {
		importLib = new ArrayList<>();
		importLib.add("import org.springframework.boot.SpringApplication;");
		importLib.add("import org.springframework.boot.autoconfigure.SpringBootApplication;");

	}

	public String genMainClassBody() {
		return this.genMainClassBody(configuration.getMainclass_name());
	}

	public String genMainClassBody(String mname) {
		return this.genMainClassBody(mname, configuration.getMainclass_package_name());
	}
	
	public String genMainClassBody(String name, String package_name) {
		StringBuffer body = new StringBuffer("");
		CGUtil.genPackageImport(body, package_name, importLib);
		CGUtil.addLineBreak(body, 3);
		body.append(SPRINGBOOTAPPLICATION_TAG);
		CGUtil.addLineBreak(body);
		body.append("public class ").append(name).append(" {");
		CGUtil.addLineBreak(body, 2);

		body.append("    ").append("public static void main(String args[]) {");
		CGUtil.addLineBreak(body);
		body.append("        ").append("SpringApplication.run(").append(name)
				.append(".class").append(",args);");
		CGUtil.addLineBreak(body, 2);
		body.append("}");
		CGUtil.addLineBreak(body);
		body.append("    ").append("}");

		return body.toString();
	}

}
