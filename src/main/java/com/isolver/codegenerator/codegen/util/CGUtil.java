package com.isolver.codegenerator.codegen.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

import com.isolver.codegenerator.codegen.Configuration;

/**
 * Class Generator Util
 * */
public class CGUtil {
	public static final String SUID= "serialVersionUID";
	public static String genRepoName(EntityClassEntry ce) {
		return genSimpleClassType(ce.getClassName()) + "Repo";
	}
	
	public static String genSimpleClassType(String type) {
		int idx = type.lastIndexOf(".");
		return type.substring(idx + 1);
	}

	public static void addLineBreak(StringBuffer body) {
		body.append('\r').append('\n');
	}

	public static void addLineBreak(StringBuffer body, int num) {
		for (int i = 0; i < num; i++) {
			addLineBreak(body);
		}
	}
	
    public static void genPackageImport(StringBuffer body,String pack,List<String> ilib) {
		body.append("package ").append( pack ).append(";");
		CGUtil.addLineBreak(body, 2);

		for (String item : ilib) {
			body.append(item);
			CGUtil.addLineBreak(body);
		}
	}
    
	public static EntityClassEntry retrieveClassInfo(String className) {
		Class cl = null;
		ArrayList<RecordEntry> list = new ArrayList<>();
		EntityClassEntry classEntry=new EntityClassEntry();
		try {
			cl = Class.forName(className);
			Entity tentity =(Entity) cl.getAnnotation(Entity.class);
			
			boolean isEntity= (tentity !=null);
		
			Table ttable =(Table) cl.getAnnotation(Table.class);
			
			String tableName= null;
			if(ttable!=null) {
				tableName=ttable.name();
			}
			
			boolean embeddable =  cl.getAnnotation(Embeddable.class)==null ? false:true;
			classEntry.setClassName(className);
			classEntry.setEntity(isEntity);
			classEntry.setEmbeddable(embeddable);
			classEntry.setTableName(tableName);
			
			
			
					
			for (Field fl : cl.getDeclaredFields()) {
				if(fl.getName().equals(SUID))
					continue;
				String name = fl.getName();
				String type = fl.getType().getName();
				Column column = fl.getAnnotation( Column.class);
				String columnName="";
				int precision=0;
				int scale=0;
				String table="";
				String columnDefinition="";
				boolean unique=false;
				boolean nullable = true;
				boolean insertable = true;
				boolean updatable = true;
				int length=0;
				if(column!=null) {
					columnName =column.name();
					length=column.length();
					nullable =column.nullable();
					insertable=column.insertable();
					updatable=column.updatable();
					precision= column.precision();
					unique=column.unique();
					precision =column.precision();
					scale=column.scale();
					table = column.table();
					columnDefinition=column.columnDefinition();
				}
			
				Id id = fl.getAnnotation( Id.class);
				boolean isId= id==null? false:true;

				EmbeddedId emid = fl.getAnnotation( EmbeddedId.class);
				boolean isEmid= emid==null? false:true;
				
				Temporal temporal = fl.getAnnotation( Temporal.class);
				boolean isTemp= temporal==null? false:true;
				
				RecordEntry entry = new RecordEntry();
				entry.setName(name);
				entry.setType(type);
                entry.setId(isId);
                entry.setEmbeddedId(isEmid);
                entry.setTemporal(isTemp);
                entry.setColname(columnName);
                
                entry.setLength(length);
                entry.setNullable(nullable);
                entry.setInsertable(insertable);
                entry.setUpdatable(updatable);
                entry.setColumnDefinition(columnDefinition);
                entry.setLength(length);
                entry.setScale(scale);
                entry.setPrecision(precision);
                entry.setTable(table);
                entry.setUnique(unique);
                if(isId ||isEmid ) {
                	classEntry.setIdType(entry.getType());
                	classEntry.setIdName(name);
                }
                
                
				if(isEmid) {
					classEntry.setHasEmbedabble(true);
					entry.setEmbeddedContent(retrieveClassInfo(type));
				}
			
				list.add(entry);

			}
			classEntry.setRecords(list);
			return classEntry;

		}catch (ClassNotFoundException e) {
			throw new EntityNotFoundException("The class " + className +" does not exist!");
		}
	}
	
}
