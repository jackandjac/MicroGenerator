package com.isolver.codegenerator.codegen.util;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import com.isolver.codegenerator.codegen.Configuration;
@Component
public class PomGenerator {
	@Autowired
    private Configuration configuration;
	public String genPomBody(String artifactId, String groupId,String version) {
		StringBuffer body =new StringBuffer("");
		
		ClassLoader classLoader = getClass().getClassLoader();
		File pom_template = new File(classLoader.getResource(configuration.getPom_template()).getFile());
		DocumentBuilderFactory dbfact = DocumentBuilderFactory.newInstance();
		DocumentBuilder dbuilder =null;
		
		try {
			dbuilder =dbfact.newDocumentBuilder();
			Document doc = dbuilder.parse(pom_template);
			doc.getDocumentElement().normalize();

			Node gpid =doc.getElementsByTagName("groupId").item(0).getFirstChild();
			gpid.setNodeValue(groupId);
			Node afid=doc.getElementsByTagName("artifactId").item(0).getFirstChild();
			afid.setNodeValue(artifactId);
			Node vers = doc.getElementsByTagName("version").item(0).getFirstChild();
			vers.setNodeValue(version);
			doc.getDocumentElement().normalize();
			TransformerFactory tfFactory =TransformerFactory.newInstance();
			Transformer tf = tfFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			ByteArrayOutputStream ostream =new ByteArrayOutputStream();
			StreamResult reseult =new StreamResult(ostream);
			tf.setOutputProperty(OutputKeys.INDENT, "yes");
			tf.transform(source, reseult);
			body.append(ostream.toString("utf-8"));
			
			
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return body.toString();
	}
}
