package com.isolver.codegenerator.codegen.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the INDV_ANNUAL_PYMT_METHOD database table.
 * 
 */
@Embeddable
public class IndvAnnualPymtMethodPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="MSHP_DUES_ID", insertable=false, updatable=false, unique=true, nullable=false, precision=22)
	private long mshpDuesId;

	@Column(name="STATE_PYMT_METHOD_ID", insertable=false, updatable=false, unique=true, nullable=false, precision=22)
	private long statePymtMethodId;

	@Temporal(TemporalType.DATE)
	@Column(name="START_DT", unique=true, nullable=false)
	private java.util.Date startDt;

	public IndvAnnualPymtMethodPK() {
	}
	public long getMshpDuesId() {
		return this.mshpDuesId;
	}
	public void setMshpDuesId(long mshpDuesId) {
		this.mshpDuesId = mshpDuesId;
	}
	public long getStatePymtMethodId() {
		return this.statePymtMethodId;
	}
	public void setStatePymtMethodId(long statePymtMethodId) {
		this.statePymtMethodId = statePymtMethodId;
	}
	public java.util.Date getStartDt() {
		return this.startDt;
	}
	public void setStartDt(java.util.Date startDt) {
		this.startDt = startDt;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof IndvAnnualPymtMethodPK)) {
			return false;
		}
		IndvAnnualPymtMethodPK castOther = (IndvAnnualPymtMethodPK)other;
		return 
			(this.mshpDuesId == castOther.mshpDuesId)
			&& (this.statePymtMethodId == castOther.statePymtMethodId)
			&& this.startDt.equals(castOther.startDt);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.mshpDuesId ^ (this.mshpDuesId >>> 32)));
		hash = hash * prime + ((int) (this.statePymtMethodId ^ (this.statePymtMethodId >>> 32)));
		hash = hash * prime + this.startDt.hashCode();
		
		return hash;
	}
}