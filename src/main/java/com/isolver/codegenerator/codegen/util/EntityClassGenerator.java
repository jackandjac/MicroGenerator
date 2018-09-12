package com.isolver.codegenerator.codegen.util;

import java.io.File;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.isolver.codegenerator.codegen.Configuration;
@Component
public class EntityClassGenerator {
	public static final String SUID= "serialVersionUID";
	public static final String EMBEDDABLE_TAG="@Embeddable";
	public static final String EMBEDD_ID_TAG="@EmbeddedId";
	public static final String ID_TAG="@Id";
	public static final String ENTITY_TAG="@Entity";
	public static final String TEMPORAL_TAG= "@Temporal(TemporalType.DATE)";
	public static final String SUID_TEMPLATE="private static final long serialVersionUID = 1L;";
	
	@Autowired
	Configuration configuration;
	

	
	public void genEntity(EntityClassEntry entry, OutputStream out) {
		PrintWriter pout =new PrintWriter(out,true);
	}
	
	private String genImportLib() {

		StringBuffer sb =new StringBuffer("");
		sb.append("import java.io.Serializable;").append('\r').append('\n');
		sb.append("import javax.persistence.*;").append('\r').append('\n');
		sb.append("import java.math.*;").append('\r').append('\n');
		sb.append("import java.util.*;").append('\r').append('\n');
		return sb.toString();
	}
	
	private String genPackageInfo(EntityClassEntry ce) {
		return "package " + ce.getBasePackageName()+".entities;";
	}

	
	public String genEmbeddableClassHeader(EntityClassEntry ce) {
		StringBuffer header =new StringBuffer("");
		header.append(this.genPackageInfo(ce));
		CGUtil.addLineBreak(header,2);

		
		header.append(this.genImportLib());
		CGUtil.addLineBreak(header,2);

		
		header.append(EMBEDDABLE_TAG).append('\r').append('\n');
		header.append(genGenericClassHeader(CGUtil.genSimpleClassType(ce.getClassName())));
		header.append(SUID_TEMPLATE).append('\r').append('\n');
        CGUtil.addLineBreak(header,3);

        return header.toString();
		
	}
	
	public String genClass(EntityClassEntry ce) {
		StringBuffer cd=new StringBuffer("");
		
		if(ce.isEmbeddable()) {
		   cd.append(this.genEmbeddableClassHeader(ce));

			
		}else {
		   cd.append(this.genEntityClassHeader(ce));
		}
		   CGUtil.addLineBreak(cd);
		   cd.append(this.genClassBody(ce.getRecords()));
		   CGUtil.addLineBreak(cd);
		   cd.append(this.end());
		   return cd.toString();
	}
	public String genClassBody(List<RecordEntry> entries){
		StringBuffer body =new StringBuffer("");
		
		for(int i =0 ;i< entries.size();i++) {
			body.append(this.genField(entries.get(i)));
			CGUtil.addLineBreak(body);
		}
		
		
		for(int i =0 ;i< entries.size();i++) {
			body.append(this.genGetter(entries.get(i)));
			CGUtil.addLineBreak(body, 2);

			body.append(this.genSetter(entries.get(i)));
			CGUtil.addLineBreak(body,2);
			
		}
		
		
		return body.toString();
	}
	
	private String genField(RecordEntry entry) {
		StringBuffer field=new StringBuffer("");
		if(entry.isEmbeddedId()) {
			field.append(EMBEDD_ID_TAG );
		}else if(entry.isId()) {
			field.append(ID_TAG ).append('\r').append('\n');;
			field.append(this.genColumnTag(entry));
		}else if(entry.isTemporal()) {
			field.append(TEMPORAL_TAG).append('\r').append('\n');;
			field.append(this.genSimpleColumnTag(entry.getColname()));
		}else {
			field.append(this.genColumnTag(entry));
		}
	
		CGUtil.addLineBreak(field);
		String simpleType =CGUtil.genSimpleClassType( entry.getType());
		field.append("private ").append(simpleType).append(" ").append(entry.getName()).append(";");
		CGUtil.addLineBreak(field);
		
		return field.toString();
	}
	
	public String genSimpleClassType(String type) {
		int idx = type.lastIndexOf(".");
		return type.substring(idx+1);
	}
	
	private String genSimpleColumnTag(String name) {
		return 	"@Column(name=\"" + name+ "\")";
	}
	
    public String genGetter(RecordEntry entry) {
    	StringBuffer getter=new StringBuffer("");
    	String fieldName =entry.getName();
    	String gmethod ="get" +fieldName.substring(0,1).toUpperCase() + fieldName.substring(1)+"(){";
    	String simpleType = CGUtil.genSimpleClassType(entry.getType());
    	getter.append("public ").append(simpleType).append(" ").append(gmethod).append('\r').append('\n');
    	getter.append("    ").append("return this.").append(fieldName).append(";");
    	CGUtil.addLineBreak(getter);
        getter.append("}");
        
    	return getter.toString();
    }
    public String genSetter(RecordEntry entry) {
    	StringBuffer setter=new StringBuffer("");
    	String fieldName =entry.getName();
    	
    	String simpleType = CGUtil.genSimpleClassType(entry.getType());
    	String smethod ="set" +fieldName.substring(0,1).toUpperCase() + fieldName.substring(1)+"("+simpleType+" "+fieldName +"){";
    	setter.append("public void").append(" ").append(smethod).append('\r').append('\n');
    	setter.append("    ").append("this.").append(fieldName).append("=").append(fieldName).append(";");
        setter.append('\r').append('\n');
        setter.append("}");
        
    	return setter.toString();
    }	
	private String genColumnTag(RecordEntry entry) {
		 StringBuffer db =new StringBuffer("@Column("); 
		 String name=entry.getColname();   // default is "";
		 boolean unique =entry.isUnique();  // default is false
		 boolean nullable= entry.isNullable(); // default is true
		 boolean insertable= entry.isInsertable();// default is true
		 boolean updatable= entry.isUpdatable();// default is true
		 String columnDefinition= entry.getColumnDefinition();// default is ""
		 String table= entry.getTable();// default is ""
		 int length= entry.getLength();// default is 255
		 int precision= entry.getPrecision();// default is 0
		 int scale= entry.getScale();// default is 0
		 if(!name.isEmpty()) {
			 db.append("name=\"").append(entry.getColname()).append("\", ");
		 }
		 if(unique) {
			 db.append("unique=").append(entry.isUnique()).append(", ");
		 }
		 if(!nullable) {
			 db.append("nullable=").append(entry.isNullable()).append(", ");
		 }	
		 
		 if(!insertable) {
			 db.append("insertable=").append(entry.isInsertable()).append(", ");
		 }
		 
		 if(!updatable) {
			 db.append("updatable=").append(entry.isUpdatable()).append(", ");
		 }
		 if(!columnDefinition.isEmpty()) {
			 db.append("columnDefinition=\"").append(entry.getColumnDefinition()).append("\", ");
		 }
		 if(!table.isEmpty()) {
			 db.append("table=\"").append(entry.getTable()).append("\", ");
		 }	
		 
		 if(length !=255) {
			 db.append("length=").append(entry.getLength()).append(", ");
		 }	
		 
		 if(scale !=0) {
			 db.append("scale=").append(entry.getScale() ).append(", ");
		 }	
		 
		 if(precision !=0) {
			 db.append("precision=").append(entry.getPrecision()).append(", ");
		 }	
		 int lcomma =db.lastIndexOf(",");
		 String res = db.substring(0, lcomma);
		 return res+")";
	}

	private String genGenericClassHeader(String className) {
		StringBuffer sb =new StringBuffer("");
		return sb.append("public class ").append(className).append(" implements Serializable { ").append('\r').append('\n').toString();
	}
	
	public String end(){
		return " } ";	
	}
	
	public String genEntityClassHeader(EntityClassEntry ce) {
		String tableName=ce.getTableName();
		String className=ce.getClassName();

		StringBuffer header = new StringBuffer("");
		
		header.append(this.genPackageInfo(ce));
		CGUtil.addLineBreak(header,2);

		
		header.append(this.genImportLib());
		CGUtil.addLineBreak(header,2);

		
		header.append(ENTITY_TAG);
		CGUtil.addLineBreak(header);
		
		header.append(this.genTableTag(tableName));
		CGUtil.addLineBreak(header);
		
		header.append(this.genNamedQueryTag(CGUtil.genSimpleClassType(className)));
		CGUtil.addLineBreak(header);
		
		header.append(this.genGenericClassHeader(CGUtil.genSimpleClassType(className)));
		CGUtil.addLineBreak(header);
		
		header.append(SUID_TEMPLATE).append('\r').append('\n');
		CGUtil.addLineBreak(header,3);

        return header.toString();
		

	}
	public String genTableTag(String tableName) {
		return "@Table(name=\""+tableName+"\")";
	}
	
	public String genNamedQueryTag(String className) {
	
		char initial=className.toLowerCase().charAt(0);
		return "@NamedQuery(name=\"" + className+".findAll\", query=\"SELECT "+initial+ " from " + className+" "+initial+"\")";
	}

}
