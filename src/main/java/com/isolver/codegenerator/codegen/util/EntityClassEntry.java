 package com.isolver.codegenerator.codegen.util;

import java.util.List;

import javax.persistence.Embeddable;

public class EntityClassEntry {
	// Table Entity NamedQuery @Embeddable
	private String className;
	private String TableName;
	private String packageName;
	private String idType;
	private String idName;
	private boolean entity;
	private boolean embeddable;
	private boolean hasEmbedabble;
	private List<RecordEntry> records;
	
	public EntityClassEntry() {

	}
	
	public EntityClassEntry(String className, String tableName, String packageName, String idType, String idName,
			boolean entity, boolean embeddable, boolean hasEmbedabble, List<RecordEntry> records) {
		super();
		this.className = className;
		TableName = tableName;
		this.packageName = packageName;
		this.idType = idType;
		this.idName = idName;
		this.entity = entity;
		this.embeddable = embeddable;
		this.hasEmbedabble = hasEmbedabble;
		this.records = records;
	}

	public boolean isHasEmbedabble() {
		return hasEmbedabble;
	}
	public void setHasEmbedabble(boolean hasEmbedabble) {
		this.hasEmbedabble = hasEmbedabble;
	}

	public String getIdName() {
		return idName;
	}

	public void setIdName(String idName) {
		this.idName = idName;
	}


	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getTableName() {
		return TableName;
	}
	public void setTableName(String tableName) {
		TableName = tableName;
	}
	public boolean isEntity() {
		return entity;
	}
	public void setEntity(boolean entity) {
		this.entity = entity;
	}
	public boolean isEmbeddable() {
		return embeddable;
	}
	public void setEmbeddable(boolean embeddable) {
		this.embeddable = embeddable;
	}
	public List<RecordEntry> getRecords() {
		return records;
	}
	public void setRecords(List<RecordEntry> records) {
		this.records = records;
	}


	public String getIdType() {
		return idType;
	}


	public void setIdType(String idType) {
		this.idType = idType;
	}
	

}
