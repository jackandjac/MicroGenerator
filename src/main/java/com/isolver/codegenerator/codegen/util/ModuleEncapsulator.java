package com.isolver.codegenerator.codegen.util;

public class ModuleEncapsulator {
    private String module_id;
    private ClassEmbody entity;
    private ClassEmbody controller;
    private ClassEmbody repo;
    
    
	public ModuleEncapsulator() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ModuleEncapsulator(String module_id, ClassEmbody entity, ClassEmbody controller, ClassEmbody repo) {
		super();
		this.module_id = module_id;
		this.entity = entity;
		this.controller = controller;
		this.repo = repo;
	}
	public String getModule_id() {
		return module_id;
	}
	public void setModule_id(String module_id) {
		this.module_id = module_id;
	}
	public ClassEmbody getEntity() {
		return entity;
	}
	public void setEntity(ClassEmbody entity) {
		this.entity = entity;
	}
	public ClassEmbody getController() {
		return controller;
	}
	public void setController(ClassEmbody controller) {
		this.controller = controller;
	}
	public ClassEmbody getRepo() {
		return repo;
	}
	public void setRepo(ClassEmbody repo) {
		this.repo = repo;
	}
  
}
