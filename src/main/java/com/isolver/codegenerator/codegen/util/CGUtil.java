package com.isolver.codegenerator.codegen.util;

import java.util.List;

/**
 * Class Generator Util
 * */
public class CGUtil {
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
		body.append("package ").append( pack );
		CGUtil.addLineBreak(body, 2);

		for (String item : ilib) {
			body.append(item);
			CGUtil.addLineBreak(body);
		}
	}
}
