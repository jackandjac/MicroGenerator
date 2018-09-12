package com.isolver.codegenerator.codegen.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Component
public class RepositoryGenerator {
	private String packageName = null;
	private List<String> importList = null;
	public static final String REPO_TAG="@Repository";

	// public interface AddressRepo extends JpaRepository<Address, String> {
	//
	// }

	public RepositoryGenerator(){
		importList =new ArrayList<>();
		importList.add("import org.springframework.data.jpa.repository.*;");
		importList.add("import org.springframework.data.repository.query.*;");
		importList.add("import org.springframework.beans.factory.annotation.*;");
		importList.add("import org.springframework.stereotype.*;");
		
	}

	public String genJpaRepo(EntityClassEntry ce) {
		StringBuffer repo = new StringBuffer("");

		packageName ="pakcage "+ce.getBasePackageName()+".repos;";
		repo.append(packageName);
		CGUtil.addLineBreak(repo, 2);

		for (String line : importList) {
			repo.append(line);
			CGUtil.addLineBreak(repo);
		}
		repo.append("import ").append(ce.getClassName()).append(";");
	    CGUtil.addLineBreak(repo);
	    repo.append("import ").append(ce.getIdType()).append(";");
	    CGUtil.addLineBreak(repo);
	    
        repo.append(REPO_TAG);
        CGUtil.addLineBreak(repo);
		repo.append("public interface ")
		    .append(CGUtil.genRepoName(ce))
		    .append(" extends JpaRepository<")
			.append(CGUtil.genSimpleClassType(ce.getClassName()))
			.append(",")
			.append(CGUtil.genSimpleClassType(ce.getIdType()) )
		    .append("> {");
		CGUtil.addLineBreak(repo, 2);
		repo.append("}");
		CGUtil.addLineBreak(repo);

		return repo.toString();
	}


	public String genRepoName(EntityClassEntry ce) {
		return CGUtil.genSimpleClassType(ce.getClassName()) + "Repo";
	}
	

	





}
