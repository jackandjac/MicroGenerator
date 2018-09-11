package com.isolver.codegenerator.codegen.controllers;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.isolver.codegenerator.codegen.Configuration;
import com.isolver.codegenerator.codegen.util.EntityClassEntry;
import com.isolver.codegenerator.codegen.util.CGUtil;
import com.isolver.codegenerator.codegen.util.ClassEmbody;
import com.isolver.codegenerator.codegen.util.ControllerGenerator;
import com.isolver.codegenerator.codegen.util.EntityClassGenerator;
import com.isolver.codegenerator.codegen.util.EntityNotFoundException;
import com.isolver.codegenerator.codegen.util.MainClassGenerator;
import com.isolver.codegenerator.codegen.util.ModuleEncapsulator;
import com.isolver.codegenerator.codegen.util.PomGenerator;
import com.isolver.codegenerator.codegen.util.PropertiesGenerator;
import com.isolver.codegenerator.codegen.util.RecordEntry;
import com.isolver.codegenerator.codegen.util.RepositoryGenerator;

@RestController
public class GenericMetaDataController {
	// to do: needs to pull all the column names, data types, id or EmbeddedId 
	//

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
	
	private Map<String,ModuleEncapsulator> map=new HashMap<>();

	private LoadingCache<String,ModuleEncapsulator> cache;
	
	public GenericMetaDataController() {
		cache=CacheBuilder.newBuilder().maximumSize(1000).expireAfterAccess(1, TimeUnit.DAYS).build(new CacheLoader<String,ModuleEncapsulator>() {

			@Override
			public ModuleEncapsulator load(String id) throws Exception {
				
				return map.get(id);
			}

			} );
	}
	
	@GetMapping(path = "/isolver/generic/{className}")
	public EntityClassEntry getGenericEntityInfo(@PathVariable String className) {
		String PACKAGE_NAME=configuration.getEntity_package_name();
		className =PACKAGE_NAME + "." + className;
		return CGUtil.retrieveClassInfo(className);
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
		EntityClassEntry ce=CGUtil.retrieveClassInfo(PACKAGE_NAME + "."+className);
		String content = entityClassGenerator.genClass(ce);
		String repo=this.repositoryGenerator.genJpaRepo(ce);
		System.out.println(content);
		System.out.println(repo);
		return content + "\r\n" + repo;
	}
	@GetMapping(path = "/isolver/controller/{className}")
	public String testControllerGeneration(@PathVariable String className) {
		String PACKAGE_NAME=configuration.getEntity_package_name();
		EntityClassEntry ce=CGUtil.retrieveClassInfo(PACKAGE_NAME + "."+className);
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
	@GetMapping(path = "/isolver/modgen/{className}")
	public String generateModule(@PathVariable String className) {
		String PACKAGE_NAME=configuration.getEntity_package_name();
		EntityClassEntry ce=CGUtil.retrieveClassInfo(PACKAGE_NAME + "."+className);
		return this.generateModuleByEntity(ce);
	}
	@GetMapping(path = "/isolver/cache/{uid}")
	public Optional<ModuleEncapsulator> retrieveFromCache(@PathVariable String uid) {
	
		ModuleEncapsulator me=null;
		try {
			me= cache.get(uid);
			System.out.println(me.getController().getContent());
			System.out.println(me.getEntity().getContent());
			System.out.println(me.getRepo().getContent());
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Optional.ofNullable(me);
	}
	@GetMapping(path = "/isolver/cacheall")
	public Set<String> retrieveAllIDFromCache() {
	       return map.keySet();
	}	
	
	
	@PutMapping(path = "/isolver/modgenentity")
	public String generateModuleByEntity(@RequestBody EntityClassEntry ce) {

		ModuleEncapsulator me=new ModuleEncapsulator();
		String uniqueID = UUID.randomUUID().toString();
		String controller=this.controllerGenerator.genController(ce);
		String ctrlClassName= this.controllerGenerator.genControllerName(ce);
		String entity = entityClassGenerator.genClass(ce);
		String entityClassName =	 CGUtil.genSimpleClassType( ce.getClassName()) ;
		String repo=this.repositoryGenerator.genJpaRepo(ce);
		String repoClassName = this.repositoryGenerator.genRepoName(ce);
		me.setController(new ClassEmbody(ctrlClassName,controller) );
        me.setEntity(new ClassEmbody(entityClassName,entity) );
		me.setRepo(new ClassEmbody(repoClassName,repo) );
		me.setModule_id(uniqueID);
		map.put(uniqueID, me);
		return uniqueID;
	}	
	
	@RequestMapping(path = "/isolver/modapp")
	public void genApp(@RequestBody List<String> list) {
		
	}

}
