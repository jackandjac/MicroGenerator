package com.isolver.codegenerator.codegen.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the COMM_VAL database table.
 * 
 */
@Embeddable
public class CommValPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="VAL_SUBJECT", insertable=false, updatable=false)
	private String valSubject;

	@Column(name="VAL_CD")
	private String valCd;

	public CommValPK() {
	}
	public String getValSubject() {
		return this.valSubject;
	}
	public void setValSubject(String valSubject) {
		this.valSubject = valSubject;
	}
	public String getValCd() {
		return this.valCd;
	}
	public void setValCd(String valCd) {
		this.valCd = valCd;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CommValPK)) {
			return false;
		}
		CommValPK castOther = (CommValPK)other;
		return 
			this.valSubject.equals(castOther.valSubject)
			&& this.valCd.equals(castOther.valCd);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.valSubject.hashCode();
		hash = hash * prime + this.valCd.hashCode();
		
		return hash;
	}
}