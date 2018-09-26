package com.isolver.codegenerator.codegen.util;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BusinessLayerGeneratorTest {
	private BusinessLayerGenerator blg;
	@Before
	public void setUp() throws Exception {
		blg=new BusinessLayerGenerator();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGenRulesOnRecord() {
		RecordEntry re=new RecordEntry();
		re.setName("name");
		re.setType("java.lang.String");
		List<Rule> rules =new ArrayList<>(); 
		Rule r1=new Rule();
		r1.setData_type("java.lang.String");
		r1.setType(Rule.CONTAINS_TYPE);
		r1.setContent("@");
		
		Rule r2=new Rule();
		r2.setType(Rule.STRING_LENGTH_TYPE);
		r2.setContent("<10");
		rules.add(r1);
		rules.add(r2);
		String res =blg.genRulesOnRecord("user",re, rules);
		
		assertEquals("((user.name.contains(\"@\")) && (user.name.length()<10))",res);
	}

}
