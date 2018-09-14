package com.isolver.codegenerator.codegen.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.isolver.codegenerator.codegen.Configuration;
@Component
public class RepositoryGenerator {
	private String packageName = null;
	private List<String> importList = null;
	@Autowired
	private Configuration configuration;
	public static final String REPO_TAG="@Repository";

	// public interface AddressRepo extends JpaRepository<Address, String> {
	//
	// }

	static HashMap<String,String> boxMap;
	static {
		boxMap=new HashMap<>();
		boxMap.put("byte", "java.lang.Byte");
		boxMap.put("short", "java.lang.Short");
		boxMap.put("int", "java.lang.Integer");
		boxMap.put("long", "java.lang.Long");
		boxMap.put("float", "java.lang.Float");
		boxMap.put("double", "java.lang.Double");
		boxMap.put("boolean", "java.lang.Boolean");
		boxMap.put("char", "java.lang.Character");
	}

	public RepositoryGenerator(){
		importList =new ArrayList<>();
		importList.add("import org.springframework.data.jpa.repository.*;");
		importList.add("import org.springframework.data.repository.query.*;");
		importList.add("import org.springframework.beans.factory.annotation.*;");
		importList.add("import org.springframework.stereotype.*;");
		
	}

	public String genJpaRepo(EntityClassEntry ce) {
		StringBuffer repo = new StringBuffer("");

		packageName ="package "+ce.getBasePackageName()+".repos;";
		repo.append(packageName);
		CGUtil.addLineBreak(repo, 2);

		for (String line : importList) {
			repo.append(line);
			CGUtil.addLineBreak(repo);
		}
		repo.append("import ").append(ce.getBasePackageName()).append(".entities.").append(CGUtil.genSimpleClassType( ce.getClassName()) ).append(";");
	    CGUtil.addLineBreak(repo);
	    if(ce.isHasEmbedabble()) {
		    repo.append("import ").append(ce.getBasePackageName()).append(".entities.").append(CGUtil.genSimpleClassType(ce.getIdType()) ).append(";");

	    }else {
	    	repo.append("import ").append( replaceElementaryTyp( ce.getIdType()) ).append(";");
	    }
	    CGUtil.addLineBreak(repo);
	    
        repo.append(REPO_TAG);
        CGUtil.addLineBreak(repo);
		repo.append("public interface ")
		    .append(CGUtil.genRepoName(ce))
		    .append(" extends JpaRepository<")
			.append(CGUtil.genSimpleClassType(ce.getClassName()))
			.append(",")
			.append(replaceElementaryTyp(CGUtil.genSimpleClassType(ce.getIdType()) ))
		    .append("> {");
		CGUtil.addLineBreak(repo, 2);
		repo.append("}");
		CGUtil.addLineBreak(repo);

		return repo.toString();
	}
	
	public String replaceElementaryTyp(String type) {
		    if(boxMap.containsKey(type)) {
		    	return boxMap.get(type);
		    }
		    return type;
	}


	public String genRepoName(EntityClassEntry ce) {
		return CGUtil.genSimpleClassType(ce.getClassName()) + "Repo";
	}
	


	





}
