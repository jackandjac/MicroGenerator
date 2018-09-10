package com.isolver.codegenerator.codegen.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the EMPMT_POSITION_SUBJECT database table.
 * 
 */
@Entity
@Table(name="EMPMT_POSITION_SUBJECT")
@NamedQuery(name="EmpmtPositionSubject.findAll", query="SELECT e FROM EmpmtPositionSubject e")
public class EmpmtPositionSubject implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="EMPMT_POSITION_SUBJECT_ID", unique=true, nullable=false, precision=22)
	private long empmtPositionSubjectId;

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

	@Column(name="CANCELLED_MSHP_IND", length=1)
	private String cancelledMshpInd;

	@Column(name="CREATED_BY", nullable=false, length=8)
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DT", nullable=false)
	private Date createdDt;

	@Column(name="CRT_SRC_DESC_TXT", length=30)
	private String crtSrcDescTxt;

	@Temporal(TemporalType.DATE)
	@Column(name="CRT_SRC_START_DT")
	private Date crtSrcStartDt;

	@Column(name="DERIVED_POSITION_IND", length=1)
	private String derivedPositionInd;

	@Column(name="DERIVED_SUBJECT_IND", length=1)
	private String derivedSubjectInd;

	@Column(name="EMPLR_ID", nullable=false, length=10)
	private String emplrId;

	@Column(name="EMPMT_POSITION_ID", precision=22)
	private BigDecimal empmtPositionId;

	@Temporal(TemporalType.DATE)
	@Column(name="END_DT")
	private Date endDt;

	@Column(name="INDV_ID", nullable=false, length=10)
	private String indvId;

	@Column(name="INDV_INT_ORG_EMPLR_SUB_ID", nullable=false, precision=22)
	private BigDecimal indvIntOrgEmplrSubId;

	@Column(name="LAST_BATCH_JOB_ID", length=8)
	private String lastBatchJobId;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_BATCH_UPDATE_DT")
	private Date lastBatchUpdateDt;

	@Column(precision=5)
	private BigDecimal rowversion;

	@Temporal(TemporalType.DATE)
	@Column(name="START_DT")
	private Date startDt;

	@Column(name="STATUS_CD", nullable=false, length=8)
	private String statusCd;

	@Temporal(TemporalType.DATE)
	@Column(name="STATUS_DT", nullable=false)
	private Date statusDt;

	@Column(name="SUBJECT_ID", precision=22)
	private BigDecimal subjectId;

	@Column(name="TIME_WORKED_TXT", length=30)
	private String timeWorkedTxt;

	@Column(name="UPDATED_BY", length=8)
	private String updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_DT")
	private Date updatedDt;

	@Column(name="WL_ID", length=10)
	private String wlId;

	public EmpmtPositionSubject() {
	}

	public long getEmpmtPositionSubjectId() {
		return this.empmtPositionSubjectId;
	}

	public void setEmpmtPositionSubjectId(long empmtPositionSubjectId) {
		this.empmtPositionSubjectId = empmtPositionSubjectId;
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

	public String getCancelledMshpInd() {
		return this.cancelledMshpInd;
	}

	public void setCancelledMshpInd(String cancelledMshpInd) {
		this.cancelledMshpInd = cancelledMshpInd;
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

	public String getDerivedPositionInd() {
		return this.derivedPositionInd;
	}

	public void setDerivedPositionInd(String derivedPositionInd) {
		this.derivedPositionInd = derivedPositionInd;
	}

	public String getDerivedSubjectInd() {
		return this.derivedSubjectInd;
	}

	public void setDerivedSubjectInd(String derivedSubjectInd) {
		this.derivedSubjectInd = derivedSubjectInd;
	}

	public String getEmplrId() {
		return this.emplrId;
	}

	public void setEmplrId(String emplrId) {
		this.emplrId = emplrId;
	}

	public BigDecimal getEmpmtPositionId() {
		return this.empmtPositionId;
	}

	public void setEmpmtPositionId(BigDecimal empmtPositionId) {
		this.empmtPositionId = empmtPositionId;
	}

	public Date getEndDt() {
		return this.endDt;
	}

	public void setEndDt(Date endDt) {
		this.endDt = endDt;
	}

	public String getIndvId() {
		return this.indvId;
	}

	public void setIndvId(String indvId) {
		this.indvId = indvId;
	}

	public BigDecimal getIndvIntOrgEmplrSubId() {
		return this.indvIntOrgEmplrSubId;
	}

	public void setIndvIntOrgEmplrSubId(BigDecimal indvIntOrgEmplrSubId) {
		this.indvIntOrgEmplrSubId = indvIntOrgEmplrSubId;
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

	public BigDecimal getRowversion() {
		return this.rowversion;
	}

	public void setRowversion(BigDecimal rowversion) {
		this.rowversion = rowversion;
	}

	public Date getStartDt() {
		return this.startDt;
	}

	public void setStartDt(Date startDt) {
		this.startDt = startDt;
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

	public BigDecimal getSubjectId() {
		return this.subjectId;
	}

	public void setSubjectId(BigDecimal subjectId) {
		this.subjectId = subjectId;
	}

	public String getTimeWorkedTxt() {
		return this.timeWorkedTxt;
	}

	public void setTimeWorkedTxt(String timeWorkedTxt) {
		this.timeWorkedTxt = timeWorkedTxt;
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

	public String getWlId() {
		return this.wlId;
	}

	public void setWlId(String wlId) {
		this.wlId = wlId;
	}

}