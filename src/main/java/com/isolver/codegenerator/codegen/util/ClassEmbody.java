package com.isolver.codegenerator.codegen.util;

public class ClassEmbody {
	private String package_name;
	private String name;
	private String content;
	private String ext;
	 
	public static final String JAVA_EXT =".java";
	public static final String XML_EXT =".xml";
	public static final String PROP_EXT = ".properties";
			
	public ClassEmbody() {
		super();
		
	}
	

	public ClassEmbody(String package_name, String name, String content) {
	       this(package_name,  name,  content,null);
	}


	public ClassEmbody(String package_name, String name, String content, String ext) {
		super();
		this.package_name = package_name;
		this.name = name;
		this.content = content;
		this.ext = ext;
	}


	public String getExt() {
		return ext;
	}


	public void setExt(String ext) {
		this.ext = ext;
	}


	public String getPackage_name() {
		return package_name;
	}


	public void setPackage_name(String package_name) {
		this.package_name = package_name;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
