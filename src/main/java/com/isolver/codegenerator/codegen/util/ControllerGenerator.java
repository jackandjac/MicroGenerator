package com.isolver.codegenerator.codegen.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isolver.codegenerator.codegen.Configuration;

@Component
public class ControllerGenerator {
	/**
	 * 
	 * 
	 * import java.util.ArrayList; import java.util.List; import
	 * org.springframework.beans.factory.annotation.Autowired; import
	 * org.springframework.web.bind.annotation.GetMapping; import
	 * org.springframework.web.bind.annotation.PathVariable; import
	 * org.springframework.web.bind.annotation.RestController;
	 * 
	 * import java.util.*; import org.springframework.beans.factory.annotation.*;
	 * import org.springframework.web.bind.annotation.*
	 */
	@Autowired
	private Configuration configuration;

	private List<String> importLib;

	public static final String REST_CONTROLLER_TAG = "@RestController";
	public static final String GET_MAPPING_TAG = "@GetMapping";
	public static final String POST_MAPPING_TAG = "@PostMapping";
	public static final String DELETE_MAPPING_TAG = "@DeleteMapping";
	public static final String PUT_MAPPING_TAG = "@PutMapping";
	public static final String REQUEST_BODY_TAG = "@RequestBody";
	public static final String PATH_VARIABLE_TAG = "@PathVariable";
	public static final String AUTOWIRED_TAG = "@Autowired";

	public ControllerGenerator() {
		importLib =new ArrayList<>();
		importLib.add("import java.util.*;");
		importLib.add("import org.springframework.data.jpa.repository.*;");
		importLib.add("import org.springframework.web.bind.annotation.*");
		importLib.add("import org.springframework.beans.factory.annotation.*;");
		importLib.add("import org.springframework.stereotype.*;");

	}
	public String genControllerName(EntityClassEntry ce) {
		return this.genClassHeader(ce);
	}
	public String genController(EntityClassEntry ce) {
		StringBuffer body = new StringBuffer("");
		importLib.add("import " +configuration.getPackage_name()+".repos.*;");
		importLib.add("import " +configuration.getPackage_name()+".controllers.*;");
		importLib.add("import " +configuration.getPackage_name()+".entities.*;");
		CGUtil.genPackageImport(body,ce.getBasePackageName()+".controllers", this.importLib);
		CGUtil.addLineBreak(body, 2);

		body.append(REST_CONTROLLER_TAG);
		CGUtil.addLineBreak(body);
		body.append("public class ").append(this.genClassHeader(ce)).append(" { ");
		CGUtil.addLineBreak(body,2);
		body.append(AUTOWIRED_TAG);
		CGUtil.addLineBreak(body);
		String repoName= CGUtil.genRepoName(ce);
		
		body.append("private ").append(repoName).append(" ").append("service;");
		CGUtil.addLineBreak(body,2);
		body.append(this.genFindAll(ce));
		CGUtil.addLineBreak(body,3);
		body.append(this.genFindById(ce));
		CGUtil.addLineBreak(body,3);
		body.append(this.genDeleteById(ce));
		CGUtil.addLineBreak(body,3);
		body.append(this.genUpdate(ce));
		CGUtil.addLineBreak(body,3);
		body.append(this.genCreate(ce));
		CGUtil.addLineBreak(body,3);
		body.append("}");

		return body.toString();
	}

	public String genFindAll(EntityClassEntry ce) {
		String packageName = configuration.getController_package_name();
		String ph = this.genPath(packageName, "findall");
		StringBuffer sb = new StringBuffer("");
		sb.append(this.genMappingAnnotate(GET_MAPPING_TAG,ph, Optional.ofNullable(null)));
		CGUtil.addLineBreak(sb);
		String simpleName = CGUtil.genSimpleClassType(ce.getClassName());
		String findAll = "retrieveAll" + simpleName.substring(0, 1).toUpperCase() + simpleName.substring(1) + "(){";

		sb.append("public List<").append(simpleName).append("> ");
		sb.append(findAll);
		CGUtil.addLineBreak(sb);
		sb.append(" return service.findAll(); ");
		CGUtil.addLineBreak(sb);
		sb.append("}");
		CGUtil.addLineBreak(sb);
		return sb.toString();
	}

	public String genPath(String packageName, String methodName) {
		String[] path = packageName.split("\\.");
		StringBuffer pathmap = new StringBuffer("");

		for (String item : path) {
			pathmap.append("/").append(item);
		}
		pathmap.append("/").append(methodName);
		return pathmap.toString();
	}

	public String genFindById(EntityClassEntry ce) {
		StringBuffer body = new StringBuffer("");
		String paraTag = ce.isHasEmbedabble() ? REQUEST_BODY_TAG : PATH_VARIABLE_TAG;
		String path = this.genPath(configuration.getController_package_name(), "findbyid");
		if (ce.isHasEmbedabble()) {
			body.append(this.genMappingAnnotate(POST_MAPPING_TAG,path, Optional.ofNullable(null)));
		} else {
			body.append(this.genMappingAnnotate(GET_MAPPING_TAG,path, Optional.ofNullable(ce.getIdName())));
		}
		CGUtil.addLineBreak(body);

		String simpleName = CGUtil.genSimpleClassType(ce.getClassName());
		String simpleId = CGUtil.genSimpleClassType(ce.getIdType());

		body.append("public Optional<");
		body.append(simpleName);
		body.append("> retrieve").append(simpleName.substring(0, 1).toUpperCase()).append(simpleName.substring(1))
				.append("ById(").append(paraTag).append(" ").append(simpleId).append(" ").append(ce.getIdName())
				.append(" ) { ");
		CGUtil.addLineBreak(body, 2);

		body.append("    ");
		body.append("return service.findById(").append(ce.getIdName()).append(");");
		CGUtil.addLineBreak(body, 2);
		body.append("}");

		return body.toString();
	}


	public String genMappingAnnotate(String mappingTag,String path, Optional<String> param) {
		String res = mappingTag + "(path = \"" + path;
		if (param.isPresent()) {
			res += "/" + "{" + param.get() + "}";
		}
		return res + "\")";
	}
	public String genPostMappingAnnotate(String path) {
		return POST_MAPPING_TAG + "(path = \"" + path + "\")";
	}

	public String genUpdate(EntityClassEntry ce) {
		StringBuffer body = new StringBuffer("");
		String path = this.genPath(configuration.getController_package_name(), "update");
		body.append(this.genMappingAnnotate(PUT_MAPPING_TAG,path, Optional.ofNullable(null)));
		CGUtil.addLineBreak(body);
		String simpleName = CGUtil.genSimpleClassType(ce.getClassName());
		String simpleId = CGUtil.genSimpleClassType(ce.getIdType());

		body.append("public void ");
		body.append("update").append(simpleName.substring(0, 1).toUpperCase()).append(simpleName.substring(1))
				.append("(").append(REQUEST_BODY_TAG).append(" ").append(simpleId).append(" ").append(ce.getIdName())
				.append(" ) { ");
		CGUtil.addLineBreak(body, 2);
		body.append("    ");
		
		body.append("return service.save(").append(ce.getIdName()).append(");");
		CGUtil.addLineBreak(body, 2);
		body.append("}");

		return body.toString();
		
	}
	
	public String genCreate(EntityClassEntry ce) {
		StringBuffer body = new StringBuffer("");
		String path = this.genPath(configuration.getController_package_name(), "create");
		body.append(this.genMappingAnnotate(PUT_MAPPING_TAG,path, Optional.ofNullable(null)));
		CGUtil.addLineBreak(body);
		String simpleName = CGUtil.genSimpleClassType(ce.getClassName());
		String simpleId = CGUtil.genSimpleClassType(ce.getIdType());

		body.append("public void ");
		body.append("create").append(simpleName.substring(0, 1).toUpperCase()).append(simpleName.substring(1))
				.append("(").append(REQUEST_BODY_TAG).append(" ").append(simpleId).append(" ").append(ce.getIdName())
				.append(" ) { ");
		CGUtil.addLineBreak(body, 2);
		body.append("    ");
		
		body.append("return service.save(").append(ce.getIdName()).append(");");
		CGUtil.addLineBreak(body, 2);
		body.append("}");

		return body.toString();
		
	}

	public String genDeleteById(EntityClassEntry ce) {
		StringBuffer sb = new StringBuffer("");
		String paraTag = ce.isHasEmbedabble() ? REQUEST_BODY_TAG : PATH_VARIABLE_TAG;
		String path = this.genPath(configuration.getController_package_name(), "deletebyid");
		if (ce.isHasEmbedabble()) {
			sb.append(this.genMappingAnnotate(DELETE_MAPPING_TAG, path, Optional.ofNullable(null)));
		    CGUtil.addLineBreak(sb);
		} else {
			sb.append(this.genMappingAnnotate(DELETE_MAPPING_TAG, path, Optional.ofNullable(ce.getIdName())));
		    CGUtil.addLineBreak(sb);
		}
		String simpleName = CGUtil.genSimpleClassType(ce.getClassName());
		String simpleId = CGUtil.genSimpleClassType(ce.getIdType());

		sb.append("public void ");
		sb.append("delete").append(simpleName.substring(0, 1).toUpperCase()).append(simpleName.substring(1))
				.append("ById(").append(paraTag).append(" ").append(simpleId).append(" ").append(ce.getIdName())
				.append(" ) { ");
		CGUtil.addLineBreak(sb, 2);
		sb.append("    ");
		
		sb.append("return service.deleteById(").append(ce.getIdName()).append(");");
		CGUtil.addLineBreak(sb, 2);
		sb.append("}");

		return sb.toString();
	}

	private String genClassHeader(EntityClassEntry ce) {
		return CGUtil.genSimpleClassType( ce.getClassName()) + "Controller";

	}



}
