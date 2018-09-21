package com.isolver.codegenerator.codegen.util;

public class Rule {
    public static final String CONTAINS_TYPE="CONTAINS";
    public static final String DIGIT_VALUE_TYPE="DIGIT_VALUE";
    public static final String DATE_TYPE="DATE";
    public static final String ZIP_TYPE="ZIP";
    public static final String REGEX_TYPE="REGEX";
    public static final String STRING_LENGTH_TYPE="STRING_LENGTH";
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getData_type() {
		return data_type;
	}
	public void setData_type(String data_type) {
		this.data_type = data_type;
	}

	private String type;
	private String content;
	private String data_type;
	
}
