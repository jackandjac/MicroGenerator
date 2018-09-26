package com.isolver.codegenerator.codegen.util;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class BusinessLayerGenerator {
	public static final String ZIP_PATTERN = "^[0-9]{5}(?:-[0-9]{4})?$";
	
	public static final String REST_CONTROLLER_TAG = "@RestController";
	public static final String GET_MAPPING_TAG = "@GetMapping";
	public static final String POST_MAPPING_TAG = "@PostMapping";
	public static final String DELETE_MAPPING_TAG = "@DeleteMapping";
	public static final String PUT_MAPPING_TAG = "@PutMapping";
	public static final String REQUEST_BODY_TAG = "@RequestBody";
	public static final String PATH_VARIABLE_TAG = "@PathVariable";
	public static final String AUTOWIRED_TAG = "@Autowired";

	public String genRulesOnRecord(String insName,RecordEntry re, List<Rule> rules) {
		StringBuffer body =new StringBuffer("(");
		
		for(Rule rul:rules) {
			if(this.isStringType(re)) {
				if(rul.getType().equals(Rule.ZIP_TYPE)) {//zip code verification
					body.append("(").append("Pattern.matches(").append(ZIP_PATTERN).append(",").append(insName).append(".").append(re.getName()).append("))");
				}else if(rul.getType().equals(Rule.REGEX_TYPE)) {
					body.append("(").append("Pattern.matches(").append(rul.getContent()).append(",").append(insName).append(".").append(re.getName()).append("))");
				
				}else if(rul.getType().equals(Rule.STRING_LENGTH_TYPE)) {
					body.append("(").append(insName).append(".").append(re.getName()).append(".length()").append(rul.getContent()).append(")");
				}else if(rul.getType().equals(Rule.CONTAINS_TYPE)) {
					
					body.append("(").append(insName).append(".").append(re.getName()).append(".contains(\"").append(rul.getContent()).append("\"))"); 
				}
				
			}else if(this.isElementaryType(re) ) {
				if(this.isValueType(re)) {
					body.append("(").append(insName).append(".").append( re.getName() ).append(rul.getContent()).append(")");
				}
			}else if(this.isDateType(re)) {
				
			}
			body.append(" && ");
			
		}
		
		String res = body.toString();
		res=res.substring(0, res.lastIndexOf("&&"));
		return res.trim()+")";
	}
	
	public String genUpdate(EntityClassEntry ce,Map<RecordEntry,List<Rule>> constraint) {
		StringBuffer body = new StringBuffer("");
		String path = this.genPath(ce, "update");
		body.append(this.genMappingAnnotate(PUT_MAPPING_TAG,path, Optional.ofNullable(null)));
		CGUtil.addLineBreak(body);
		String simpleName = CGUtil.genSimpleClassType(ce.getClassName());
		String simpleId = CGUtil.genSimpleClassType(ce.getIdType());

		body.append("public void ");
		body.append("verify").append("Update").append(simpleName.substring(0, 1).toUpperCase()).append(simpleName.substring(1))
				.append("(").append(REQUEST_BODY_TAG).append(" ").append(simpleName).append(" ").append(simpleName.toLowerCase())
				.append(" ) { ");
		CGUtil.addLineBreak(body, 2);
		body.append("    ");
		body.append("if(");
		for(Map.Entry<RecordEntry, List<Rule>> entry: constraint.entrySet()) {
		body.append(this.genRulesOnRecord(simpleName, entry.getKey(), entry.getValue())).append(" && ");
		}
		
		
		body.append(" service.save(").append(simpleName.toLowerCase()).append(");");
		CGUtil.addLineBreak(body, 2);
		body.append("}");

		return body.toString();
		
	}
	public String genBusPath(EntityClassEntry ce, String methodName) {
		String packageName=ce.getBasePackageName();
		String[] path = packageName.split("\\.");
		StringBuffer pathmap = new StringBuffer("");
        pathmap.append("/bus");         
		for (String item : path) {
			pathmap.append("/").append(item);
		}
		pathmap.append("/");
		pathmap.append(CGUtil.genSimpleClassType(ce.getClassName()));
	
		pathmap.append("/").append(methodName);
		return pathmap.toString();
	}
	public String genPath(EntityClassEntry ce, String methodName) {
		String packageName=ce.getBasePackageName();
		String[] path = packageName.split("\\.");
		StringBuffer pathmap = new StringBuffer("");       
		for (String item : path) {
			pathmap.append("/").append(item);
		}
		pathmap.append("/");
		pathmap.append(CGUtil.genSimpleClassType(ce.getClassName()));
	
		pathmap.append("/").append(methodName);
		return pathmap.toString();
	}
	public String genMappingAnnotate(String mappingTag,String path, Optional<String> param) {
		String res = mappingTag + "(path = \"" + path;
		if (param.isPresent()) {
			res += "/" + "{" + param.get() + "}";
		}
		return res + "\")";
	}
	public String genCreate(EntityClassEntry ce) {
		StringBuffer body = new StringBuffer("");
		String path = this.genPath(ce, "create");
		body.append(this.genMappingAnnotate(PUT_MAPPING_TAG,path, Optional.ofNullable(null)));
		CGUtil.addLineBreak(body);
		String simpleName = CGUtil.genSimpleClassType(ce.getClassName());
		
		body.append("public void ");
		body.append("create").append(simpleName.substring(0, 1).toUpperCase()).append(simpleName.substring(1))
				.append("(").append(REQUEST_BODY_TAG).append(" ").append(simpleName).append(" ").append(simpleName.toLowerCase())
				.append(" ) { ");
		CGUtil.addLineBreak(body, 2);
		body.append("    ");
		
		body.append(" service.save(").append(simpleName.toLowerCase()).append(");");
		CGUtil.addLineBreak(body, 2);
		body.append("}");

		return body.toString();
		
	}
	
	public boolean isStringType(RecordEntry rec) {
		return rec.getType().endsWith("String");
	}
	
	public boolean isDateType(RecordEntry rec) {
		return rec.getType().endsWith("Date");
	}
	
	public boolean isElementaryType(RecordEntry rec) {
		return (rec.getType().equals("int")     || 
		   rec.getType().equals("byte")    ||
		   rec.getType().equals("short")   || 
		   rec.getType().equals("long")    ||
		   rec.getType().equals("char")    || 
		   rec.getType().equals("boolean") ||
		   rec.getType().equals("float")   ||
		   rec.getTable().equals("double"))
			||
		(rec.getType().endsWith("Integer")||
		   rec.getType().endsWith("Byte")  ||
		   rec.getType().endsWith("Short")  ||
		   rec.getType().endsWith("Long")  ||
		   rec.getType().endsWith("Character")  ||
		   rec.getType().endsWith("Boolean")  ||
		   rec.getType().endsWith("Float")  ||
		   rec.getType().endsWith("Double")  
		   );
	}
	
	public boolean isValueType(RecordEntry rec) {
		return (rec.getType().equals("int")     || 
				   rec.getType().equals("byte")    ||
				   rec.getType().equals("short")   || 
				   rec.getType().equals("long")    ||
				   rec.getType().equals("float")   ||
				   rec.getTable().equals("double"))
					||
				(rec.getType().endsWith("Integer")||
				   rec.getType().endsWith("Byte")  ||
				   rec.getType().endsWith("Short")  ||
				   rec.getType().endsWith("Long")  ||
				   rec.getType().endsWith("Float")  ||
				   rec.getType().endsWith("Double")  
				   );
	}
	
	
	public boolean isBooleanType(RecordEntry rec) {
		return  rec.getType().equals("boolean") || rec.getType().endsWith("Boolean");
	}
	
	public boolean isCharType(RecordEntry rec) {
		return  rec.getType().equals("char") || rec.getType().endsWith("Character");
	}
		
	

}
