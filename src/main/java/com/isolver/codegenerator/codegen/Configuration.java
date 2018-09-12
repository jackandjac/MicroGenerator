package com.isolver.codegenerator.codegen;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("isolvers.classinfo")
public class Configuration {
   private String package_name;
   private String entity_package_name;
   private String controller_package_name;
   private String mainclass_package_name;
   private String mainclass_name;
   private String pom_template;
   private String application_template;
   private String tempdir;
   
public String getTempdir() {
	return tempdir;
}

public void setTempdir(String tempdir) {
	this.tempdir = tempdir;
}

public String getApplication_template() {
	return application_template;
}

public void setApplication_template(String application_template) {
	this.application_template = application_template;
}

public String getPom_template() {
	return pom_template;
}

public void setPom_template(String pom_template) {
	this.pom_template = pom_template;
}

public String getMainclass_name() {
	return mainclass_name;
}

public void setMainclass_name(String mainclass_name) {
	this.mainclass_name = mainclass_name;
}

public String getMainclass_package_name() {
	return mainclass_package_name;
}

public void setMainclass_package_name(String mainclass_package_name) {
	this.mainclass_package_name = mainclass_package_name;
}

public String getController_package_name() {
	return controller_package_name;
}

public void setController_package_name(String controller_package_name) {
	this.controller_package_name = controller_package_name;
}

public String getEntity_package_name() {
	return entity_package_name;
}

public void setEntity_package_name(String entity_package_name) {
	this.entity_package_name = entity_package_name;
}

public String getPackage_name() {
	return package_name;
}

public void setPackage_name(String package_name) {
	this.package_name = package_name;
}
   
}
