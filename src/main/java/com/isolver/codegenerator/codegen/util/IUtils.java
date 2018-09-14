package com.isolver.codegenerator.codegen.util;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import com.google.common.io.Files;

public class IUtils {
   // src/main/java
   // src/main/resources
   // src/test/java
    public static final String SRC_JAVA="src\\main\\java";
    public static final String SRC_RESOURCES="src\\main\\resources";
	public static void genFolderStructure() {
		
	}
	public static void genFolderStructure(File source) {
		 String path = source.getAbsolutePath();
		 
		 File javaFolder = new File( path+ File.separator+"src"+ File.separator +"main"+ File.separator+"java");
		 javaFolder.mkdirs();
		 File resourceFolder = new File( path+ File.separator+"src"+ File.separator+"main"+ File.separator+"resources");
		 resourceFolder.mkdirs();	
		 File testFolder = new File( path+ File.separator+"test"+ File.separator+"java");
		 testFolder.mkdirs();	
     
	     
	}
	
	 public static void zip(File directory, File zipfile) throws IOException {
		    URI base = directory.toURI();
		    Deque<File> queue = new LinkedList<File>();
		    queue.push(directory);
		    OutputStream out = new FileOutputStream(zipfile);
		    Closeable res = out;
		    try {
		      ZipOutputStream zout = new ZipOutputStream(out);
		      res = zout;
		      while (!queue.isEmpty()) {
		        directory = queue.pop();
		        for (File kid : directory.listFiles()) {
		          String name = base.relativize(kid.toURI()).getPath();
		          if (kid.isDirectory()) {
		            queue.push(kid);
		            name = name.endsWith("/") ? name : name + "/";
		            zout.putNextEntry(new ZipEntry(name));
		          } else {
		            zout.putNextEntry(new ZipEntry(name));
		             copy(kid, zout);
		            zout.closeEntry();
		          }
		        }
		      }
		    } finally {
		      res.close();
		    }
		  }
	 
	 public static void copy(File src, OutputStream out) throws IOException {
        FileInputStream fin=new FileInputStream(src);
        byte[] buffer =new byte[1024*1024];
        int len=0;
        while((len=fin.read(buffer))!=-1 ) {
     	   out.write(buffer,0, len);
        }
        out.flush();
        fin.close();
	 }
	 
	public static void packageGen(String pname, File cur) {
		     String[] res=pname.split("\\.");
		     String path=cur.getAbsolutePath();
		     for(int i=0;i<res.length;i++) {
		        path=path+File.separator+res[i];
		     }
		     new File(path).mkdirs();
		}
	
	public static String  packagePathGen(String pname, String basepath) {
	     String[] res=pname.split("\\.");
	     String path=basepath;
	     for(int i=0;i<res.length;i++) {
	        path=path+File.separator+res[i];
	     }
	    return path;
	}
	public static void filesGenerate(List<ClassEmbody> files, File baseFolder) {
		for(ClassEmbody item: files) {
			if(item.getExt().equals(ClassEmbody.JAVA_EXT)) { // write to the SRC_JAVA folder
				String path =packagePathGen(item.getPackage_name(),baseFolder.getAbsolutePath()+File.separator+SRC_JAVA);
				File tf=new File(path);
			    if(!tf.exists()) {//create the folders if it does not exist
			    	tf.mkdirs();
			    }
			    File tar=new File(path+File.separator+item.getName()+ClassEmbody.JAVA_EXT);
			    try {
 			    	if(!tar.exists() ) {
			    		tar.createNewFile();
			    	}
					Files.asCharSink(tar, Charset.forName("utf-8")).write(item.getContent());
				} catch (IOException e) {
					e.printStackTrace();
				};  		
			    
			}else if(item.getExt().equals(ClassEmbody.PROP_EXT)) { // write to the SRC_RESOURCES
				String path =packagePathGen("", baseFolder.getAbsolutePath()+File.separator+SRC_RESOURCES);
				File tf=new File(path);
			    if(!tf.exists()) {//create the folders if it does not exist
			    	tf.mkdirs();
			    }
			    File tar=new File(path+File.separator+item.getName()+ClassEmbody.PROP_EXT);
			    try {
			    	if(!tar.exists() ) {
			    		tar.createNewFile();
			    	}
					Files.asCharSink(tar, Charset.forName("utf-8")).write(item.getContent());
				} catch (IOException e) {
					e.printStackTrace();
				};
			}else { // pom.xml write to the BASE folder
				String path =baseFolder.getAbsolutePath();
				File tf=new File(path);
			    if(!tf.exists()) {//create the folders if it does not exist
			    	tf.mkdirs();
			    }
			    File tar=new File(path+File.separator+item.getName()+ClassEmbody.XML_EXT);
			    try {
			    	if(!tar.exists() ) {
			    		tar.createNewFile();
			    	}
					Files.asCharSink(tar, Charset.forName("utf-8")).write(item.getContent());
				} catch (IOException e) {
					e.printStackTrace();
				};
			}
		}
	}
	
}
