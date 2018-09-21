package com.isolver.codegenerator.codegen.util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.isolver.codegenerator.codegen.Configuration;

@Component
public class PropertiesGenerator {

	@Autowired
	private Configuration configuration;
	
	public String genPropertiesBody() {
		
//		spring.application.name=demo
//				server.port=8088
//				spring.jpa.hibernate.ddl-auto=none
//				# h2 setting
//				spring.jpa.show-sql=true
//				spring.h2.console.enabled=true
		StringBuffer body =new StringBuffer("");
		
		ClassLoader classLoader = getClass().getClassLoader();
		File application_template = new File(classLoader.getResource(configuration.getApplication_template()).getFile());
		try {
		FileInputStream in = new FileInputStream(application_template);
		Properties props = new Properties();
		props.load(in);
		in.close();

		ByteArrayOutputStream ostream =new ByteArrayOutputStream();
		props.setProperty("spring.application.name", "microserviceDemo");
		props.store(ostream, null);
		body.append(ostream.toString("utf-8"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		return body.toString();
	}
}
