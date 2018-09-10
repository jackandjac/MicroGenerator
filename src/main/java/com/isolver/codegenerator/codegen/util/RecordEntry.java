package com.isolver.codegenerator.codegen.util;

import java.lang.annotation.Annotation;
import java.util.List;

import javax.persistence.EmbeddedId;

public class RecordEntry {
    private String name;
    private String type;

	private boolean id;
	private boolean embeddedId;
    private boolean temporal;
    
	private String colname;
	private boolean unique;
	private boolean nullable;
	private boolean insertable;
	private boolean updatable;
	private String columnDefinition;
	private String table;
	private int length;
	private int precision;
	private int scale;
    
	private EntityClassEntry embeddedContent;

	public RecordEntry() {
		super();
		
	}
	

	public RecordEntry(String name, String type, boolean id, boolean embeddedId, boolean temporal, String colname,
			boolean unique, boolean nullable, boolean insertable, boolean updatable, String columnDefinition,
			String table, int length, int precision, int scale, EntityClassEntry embeddedContent) {
		super();
		this.name = name;
		this.type = type;
		this.id = id;
		this.embeddedId = embeddedId;
		this.temporal = temporal;
		this.colname = colname;
		this.unique = unique;
		this.nullable = nullable;
		this.insertable = insertable;
		this.updatable = updatable;
		this.columnDefinition = columnDefinition;
		this.table = table;
		this.length = length;
		this.precision = precision;
		this.scale = scale;
		this.embeddedContent = embeddedContent;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isId() {
		return id;
	}

	public void setId(boolean id) {
		this.id = id;
	}

	public boolean isEmbeddedId() {
		return embeddedId;
	}

	public void setEmbeddedId(boolean embeddedId) {
		this.embeddedId = embeddedId;
	}

	public boolean isTemporal() {
		return temporal;
	}

	public void setTemporal(boolean temporal) {
		this.temporal = temporal;
	}

	public String getColname() {
		return colname;
	}

	public void setColname(String colname) {
		this.colname = colname;
	}

	public boolean isUnique() {
		return unique;
	}

	public void setUnique(boolean unique) {
		this.unique = unique;
	}

	public boolean isNullable() {
		return nullable;
	}

	public void setNullable(boolean nullable) {
		this.nullable = nullable;
	}

	public boolean isInsertable() {
		return insertable;
	}

	public void setInsertable(boolean insertable) {
		this.insertable = insertable;
	}

	public boolean isUpdatable() {
		return updatable;
	}

	public void setUpdatable(boolean updatable) {
		this.updatable = updatable;
	}

	public String getColumnDefinition() {
		return columnDefinition;
	}

	public void setColumnDefinition(String columnDefinition) {
		this.columnDefinition = columnDefinition;
	}

	public String getTable() {
		return table;
	}

	public void setTable(String table) {
		this.table = table;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getPrecision() {
		return precision;
	}

	public void setPrecision(int precision) {
		this.precision = precision;
	}

	public int getScale() {
		return scale;
	}

	public void setScale(int scale) {
		this.scale = scale;
	}

	public EntityClassEntry getEmbeddedContent() {
		return embeddedContent;
	}

	public void setEmbeddedContent(EntityClassEntry embeddedContent) {
		this.embeddedContent = embeddedContent;
	}


	
}
