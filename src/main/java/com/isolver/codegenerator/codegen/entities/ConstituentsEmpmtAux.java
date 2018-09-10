package com.isolver.codegenerator.codegen.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CONSTITUENTS_EMPMT_AUX database table.
 * 
 */
@Entity
@Table(name="CONSTITUENTS_EMPMT_AUX")
@NamedQuery(name="ConstituentsEmpmtAux.findAll", query="SELECT c FROM ConstituentsEmpmtAux c")
public class ConstituentsEmpmtAux implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="INDV_INT_ORG_EMPLR_SUB_ID", unique=true, nullable=false, precision=22)
	private long indvIntOrgEmplrSubId;

	@Temporal(TemporalType.DATE)
	@Column(name="ACTUAL_RETIRED_DT")
	private Date actualRetiredDt;

	@Column(name="BATCH_CREATE_SOURCE", length=20)
	private String batchCreateSource;

	@Column(name="BATCH_CREATED_BY", length=8)
	private String batchCreatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="BATCH_CREATED_DT")
	private Date batchCreatedDt;

	@Column(name="BATCH_UPDATE_SOURCE", length=20)
	private String batchUpdateSource;

	@Column(name="BATCH_UPDATED_BY", length=8)
	private String batchUpdatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="BATCH_UPDATED_DT")
	private Date batchUpdatedDt;

	@Column(name="COMMENT_TXT", length=40)
	private String commentTxt;

	@Column(name="CREATED_BY", nullable=false, length=8)
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DT", nullable=false)
	private Date createdDt;

	@Column(name="CRT_SRC_DESC_TXT", length=20)
	private String crtSrcDescTxt;

	@Temporal(TemporalType.DATE)
	@Column(name="CRT_SRC_START_DT")
	private Date crtSrcStartDt;

	@Column(name="DERIVED_EMPLR_IND", length=1)
	private String derivedEmplrInd;

	@Column(name="EMPL_NUM_TXT", length=15)
	private String emplNumTxt;

	@Column(name="EMPLR_ID", nullable=false, length=10)
	private String emplrId;

	@Temporal(TemporalType.DATE)
	@Column(name="ESTIMATED_RETIREMENT_DT")
	private Date estimatedRetirementDt;

	@Column(name="FIRST_HIRE_YR", length=4)
	private String firstHireYr;

	@Temporal(TemporalType.DATE)
	@Column(name="HIRE_DT")
	private Date hireDt;

	@Column(name="INDV_ID", nullable=false, length=10)
	private String indvId;

	@Column(name="LAST_BATCH_JOB_ID", length=8)
	private String lastBatchJobId;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_BATCH_UPDATE_DT")
	private Date lastBatchUpdateDt;

	@Column(name="LOCAL_INT_ORG_ID", length=10)
	private String localIntOrgId;

	@Column(name="NEA_UNIF_EXEMPT_IND", length=1)
	private String neaUnifExemptInd;

	@Column(name="PENSION_STATE", length=2)
	private String pensionState;

	@Column(length=1)
	private String rank;

	@Column(name="RETIRED_FROM_LCL_ID", length=10)
	private String retiredFromLclId;

	@Column(precision=5)
	private BigDecimal rowversion;

	@Column(name="SALARY_AMT", precision=22)
	private BigDecimal salaryAmt;

	@Column(name="SEA_UNIF_EXEMPT_IND", length=1)
	private String seaUnifExemptInd;

	@Column(name="SRC_OF_FUNDING_CD", length=6)
	private String srcOfFundingCd;

	@Column(name="STATUS_CD", nullable=false, length=8)
	private String statusCd;

	@Temporal(TemporalType.DATE)
	@Column(name="STATUS_DT", nullable=false)
	private Date statusDt;

	@Column(length=3)
	private String step;

	@Column(name="TENURE_IND", length=1)
	private String tenureInd;

	@Column(name="UPDATED_BY", length=8)
	private String updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_DT")
	private Date updatedDt;

	@Column(name="YR_ROUND_TRACK_CD", length=30)
	private String yrRoundTrackCd;

	public ConstituentsEmpmtAux() {
	}

	public long getIndvIntOrgEmplrSubId() {
		return this.indvIntOrgEmplrSubId;
	}

	public void setIndvIntOrgEmplrSubId(long indvIntOrgEmplrSubId) {
		this.indvIntOrgEmplrSubId = indvIntOrgEmplrSubId;
	}

	public Date getActualRetiredDt() {
		return this.actualRetiredDt;
	}

	public void setActualRetiredDt(Date actualRetiredDt) {
		this.actualRetiredDt = actualRetiredDt;
	}

	public String getBatchCreateSource() {
		return this.batchCreateSource;
	}

	public void setBatchCreateSource(String batchCreateSource) {
		this.batchCreateSource = batchCreateSource;
	}

	public String getBatchCreatedBy() {
		return this.batchCreatedBy;
	}

	public void setBatchCreatedBy(String batchCreatedBy) {
		this.batchCreatedBy = batchCreatedBy;
	}

	public Date getBatchCreatedDt() {
		return this.batchCreatedDt;
	}

	public void setBatchCreatedDt(Date batchCreatedDt) {
		this.batchCreatedDt = batchCreatedDt;
	}

	public String getBatchUpdateSource() {
		return this.batchUpdateSource;
	}

	public void setBatchUpdateSource(String batchUpdateSource) {
		this.batchUpdateSource = batchUpdateSource;
	}

	public String getBatchUpdatedBy() {
		return this.batchUpdatedBy;
	}

	public void setBatchUpdatedBy(String batchUpdatedBy) {
		this.batchUpdatedBy = batchUpdatedBy;
	}

	public Date getBatchUpdatedDt() {
		return this.batchUpdatedDt;
	}

	public void setBatchUpdatedDt(Date batchUpdatedDt) {
		this.batchUpdatedDt = batchUpdatedDt;
	}

	public String getCommentTxt() {
		return this.commentTxt;
	}

	public void setCommentTxt(String commentTxt) {
		this.commentTxt = commentTxt;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDt() {
		return this.createdDt;
	}

	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}

	public String getCrtSrcDescTxt() {
		return this.crtSrcDescTxt;
	}

	public void setCrtSrcDescTxt(String crtSrcDescTxt) {
		this.crtSrcDescTxt = crtSrcDescTxt;
	}

	public Date getCrtSrcStartDt() {
		return this.crtSrcStartDt;
	}

	public void setCrtSrcStartDt(Date crtSrcStartDt) {
		this.crtSrcStartDt = crtSrcStartDt;
	}

	public String getDerivedEmplrInd() {
		return this.derivedEmplrInd;
	}

	public void setDerivedEmplrInd(String derivedEmplrInd) {
		this.derivedEmplrInd = derivedEmplrInd;
	}

	public String getEmplNumTxt() {
		return this.emplNumTxt;
	}

	public void setEmplNumTxt(String emplNumTxt) {
		this.emplNumTxt = emplNumTxt;
	}

	public String getEmplrId() {
		return this.emplrId;
	}

	public void setEmplrId(String emplrId) {
		this.emplrId = emplrId;
	}

	public Date getEstimatedRetirementDt() {
		return this.estimatedRetirementDt;
	}

	public void setEstimatedRetirementDt(Date estimatedRetirementDt) {
		this.estimatedRetirementDt = estimatedRetirementDt;
	}

	public String getFirstHireYr() {
		return this.firstHireYr;
	}

	public void setFirstHireYr(String firstHireYr) {
		this.firstHireYr = firstHireYr;
	}

	public Date getHireDt() {
		return this.hireDt;
	}

	public void setHireDt(Date hireDt) {
		this.hireDt = hireDt;
	}

	public String getIndvId() {
		return this.indvId;
	}

	public void setIndvId(String indvId) {
		this.indvId = indvId;
	}

	public String getLastBatchJobId() {
		return this.lastBatchJobId;
	}

	public void setLastBatchJobId(String lastBatchJobId) {
		this.lastBatchJobId = lastBatchJobId;
	}

	public Date getLastBatchUpdateDt() {
		return this.lastBatchUpdateDt;
	}

	public void setLastBatchUpdateDt(Date lastBatchUpdateDt) {
		this.lastBatchUpdateDt = lastBatchUpdateDt;
	}

	public String getLocalIntOrgId() {
		return this.localIntOrgId;
	}

	public void setLocalIntOrgId(String localIntOrgId) {
		this.localIntOrgId = localIntOrgId;
	}

	public String getNeaUnifExemptInd() {
		return this.neaUnifExemptInd;
	}

	public void setNeaUnifExemptInd(String neaUnifExemptInd) {
		this.neaUnifExemptInd = neaUnifExemptInd;
	}

	public String getPensionState() {
		return this.pensionState;
	}

	public void setPensionState(String pensionState) {
		this.pensionState = pensionState;
	}

	public String getRank() {
		return this.rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getRetiredFromLclId() {
		return this.retiredFromLclId;
	}

	public void setRetiredFromLclId(String retiredFromLclId) {
		this.retiredFromLclId = retiredFromLclId;
	}

	public BigDecimal getRowversion() {
		return this.rowversion;
	}

	public void setRowversion(BigDecimal rowversion) {
		this.rowversion = rowversion;
	}

	public BigDecimal getSalaryAmt() {
		return this.salaryAmt;
	}

	public void setSalaryAmt(BigDecimal salaryAmt) {
		this.salaryAmt = salaryAmt;
	}

	public String getSeaUnifExemptInd() {
		return this.seaUnifExemptInd;
	}

	public void setSeaUnifExemptInd(String seaUnifExemptInd) {
		this.seaUnifExemptInd = seaUnifExemptInd;
	}

	public String getSrcOfFundingCd() {
		return this.srcOfFundingCd;
	}

	public void setSrcOfFundingCd(String srcOfFundingCd) {
		this.srcOfFundingCd = srcOfFundingCd;
	}

	public String getStatusCd() {
		return this.statusCd;
	}

	public void setStatusCd(String statusCd) {
		this.statusCd = statusCd;
	}

	public Date getStatusDt() {
		return this.statusDt;
	}

	public void setStatusDt(Date statusDt) {
		this.statusDt = statusDt;
	}

	public String getStep() {
		return this.step;
	}

	public void setStep(String step) {
		this.step = step;
	}

	public String getTenureInd() {
		return this.tenureInd;
	}

	public void setTenureInd(String tenureInd) {
		this.tenureInd = tenureInd;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDt() {
		return this.updatedDt;
	}

	public void setUpdatedDt(Date updatedDt) {
		this.updatedDt = updatedDt;
	}

	public String getYrRoundTrackCd() {
		return this.yrRoundTrackCd;
	}

	public void setYrRoundTrackCd(String yrRoundTrackCd) {
		this.yrRoundTrackCd = yrRoundTrackCd;
	}

}