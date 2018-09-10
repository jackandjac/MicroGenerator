package com.isolver.codegenerator.codegen.controllers;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.isolver.codegenerator.codegen.Configuration;
import com.isolver.codegenerator.codegen.util.EntityClassEntry;
import com.isolver.codegenerator.codegen.util.ControllerGenerator;
import com.isolver.codegenerator.codegen.util.EntityClassGenerator;
import com.isolver.codegenerator.codegen.util.EntityNotFoundException;
import com.isolver.codegenerator.codegen.util.MainClassGenerator;
import com.isolver.codegenerator.codegen.util.PomGenerator;
import com.isolver.codegenerator.codegen.util.PropertiesGenerator;
import com.isolver.codegenerator.codegen.util.RecordEntry;
import com.isolver.codegenerator.codegen.util.RepositoryGenerator;

@RestController
public class GenericMetaDataController {
	// to do: needs to pull all the column names, data types, id or EmbeddedId 
	//
//	public static final String PACKAGE_NAME = "com.isolver.codegenerator.codegen.entities";
	@Autowired
	private EntityClassGenerator entityClassGenerator;
	@Autowired
	private RepositoryGenerator repositoryGenerator;

	@Autowired
	private ControllerGenerator controllerGenerator;
	@Autowired
	private MainClassGenerator mainclassGenerator;
	
	@Autowired
	private PomGenerator pomGenerator;
	
	@Autowired
	private Configuration configuration;
	
	@Autowired
	private PropertiesGenerator propertiesGenerator;

	@GetMapping(path = "/isolver/generic/{className}")
	public EntityClassEntry getGenericEntityInfo(@PathVariable String className) {
		String PACKAGE_NAME=configuration.getEntity_package_name();
		className =PACKAGE_NAME + "." + className;
		return entityClassGenerator.retrieveClassInfo(className);
	}
	
	@GetMapping(path = "/isolver/testing")
	public List<String> testService() {
		ArrayList<String> list=new ArrayList<String>();
		list.add(entityClassGenerator.genEmbeddableClassHeader("CommValPK"));
		list.add(entityClassGenerator.genEntityClassHeader("CommVal", "COMM_VAL"));
		return list;
	}
	
	@GetMapping(path = "/isolver/testclass/{className}")
	public String testClassGeneration(@PathVariable String className) {
		String PACKAGE_NAME=configuration.getEntity_package_name();
		EntityClassEntry ce=entityClassGenerator.retrieveClassInfo(PACKAGE_NAME + "."+className);
		String content = entityClassGenerator.genClass(ce);
		String repo=this.repositoryGenerator.genJpaRepo(ce);
		System.out.println(content);
		System.out.println(repo);
		return content + "\r\n" + repo;
	}
	@GetMapping(path = "/isolver/controller/{className}")
	public String testControllerGeneration(@PathVariable String className) {
		String PACKAGE_NAME=configuration.getEntity_package_name();
		EntityClassEntry ce=entityClassGenerator.retrieveClassInfo(PACKAGE_NAME + "."+className);
		String output=this.controllerGenerator.genController(ce);
        System.out.println(output);
        String outputb =this.mainclassGenerator.genMainClassBody();
        System.out.println(outputb);
        
        String outputc = this.pomGenerator.genPomBody("com.isolver.demo", "Demo App", "1.0");
        System.out.println(outputc);
        String outputd = this.propertiesGenerator.genPropertiesBody();
        System.out.println(outputd);
		return output; 
	}

}
