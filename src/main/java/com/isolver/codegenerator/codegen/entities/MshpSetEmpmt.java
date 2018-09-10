package com.isolver.codegenerator.codegen.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the MSHP_SET_EMPMT database table.
 * 
 */
@Entity
@Table(name="MSHP_SET_EMPMT")
@NamedQuery(name="MshpSetEmpmt.findAll", query="SELECT m FROM MshpSetEmpmt m")
public class MshpSetEmpmt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="INDV_INT_ORG_EMPLR_SUB_ID", unique=true, nullable=false, precision=22)
	private long indvIntOrgEmplrSubId;

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

	@Column(name="EMPLR_ID", nullable=false, length=10)
	private String emplrId;

	@Temporal(TemporalType.DATE)
	@Column(name="END_DT")
	private Date endDt;

	@Column(name="ENDED_EMPMT_IND", length=1)
	private String endedEmpmtInd;

	@Column(name="HISTORY_MSHP_TYPE_ASSOC_ID", precision=22)
	private BigDecimal historyMshpTypeAssocId;

	@Temporal(TemporalType.DATE)
	@Column(name="INDV_EMPLR_START_DT")
	private Date indvEmplrStartDt;

	@Column(name="INDV_EMPLR_SUBCONTR_ID", precision=22)
	private BigDecimal indvEmplrSubcontrId;

	@Column(name="INDV_ID", nullable=false, length=10)
	private String indvId;

	@Column(name="LAST_BATCH_JOB_ID", length=10)
	private String lastBatchJobId;

	@Column(name="MSHP_TYPE_ASSOC_ID", precision=22)
	private BigDecimal mshpTypeAssocId;

	@Column(name="PRIMARY_EMP_IND", length=1)
	private String primaryEmpInd;

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

	@Column(name="UPDATED_BY", length=8)
	private String updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_DT")
	private Date updatedDt;

	public MshpSetEmpmt() {
	}

	public long getIndvIntOrgEmplrSubId() {
		return this.indvIntOrgEmplrSubId;
	}

	public void setIndvIntOrgEmplrSubId(long indvIntOrgEmplrSubId) {
		this.indvIntOrgEmplrSubId = indvIntOrgEmplrSubId;
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

	public String getEmplrId() {
		return this.emplrId;
	}

	public void setEmplrId(String emplrId) {
		this.emplrId = emplrId;
	}

	public Date getEndDt() {
		return this.endDt;
	}

	public void setEndDt(Date endDt) {
		this.endDt = endDt;
	}

	public String getEndedEmpmtInd() {
		return this.endedEmpmtInd;
	}

	public void setEndedEmpmtInd(String endedEmpmtInd) {
		this.endedEmpmtInd = endedEmpmtInd;
	}

	public BigDecimal getHistoryMshpTypeAssocId() {
		return this.historyMshpTypeAssocId;
	}

	public void setHistoryMshpTypeAssocId(BigDecimal historyMshpTypeAssocId) {
		this.historyMshpTypeAssocId = historyMshpTypeAssocId;
	}

	public Date getIndvEmplrStartDt() {
		return this.indvEmplrStartDt;
	}

	public void setIndvEmplrStartDt(Date indvEmplrStartDt) {
		this.indvEmplrStartDt = indvEmplrStartDt;
	}

	public BigDecimal getIndvEmplrSubcontrId() {
		return this.indvEmplrSubcontrId;
	}

	public void setIndvEmplrSubcontrId(BigDecimal indvEmplrSubcontrId) {
		this.indvEmplrSubcontrId = indvEmplrSubcontrId;
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

	public BigDecimal getMshpTypeAssocId() {
		return this.mshpTypeAssocId;
	}

	public void setMshpTypeAssocId(BigDecimal mshpTypeAssocId) {
		this.mshpTypeAssocId = mshpTypeAssocId;
	}

	public String getPrimaryEmpInd() {
		return this.primaryEmpInd;
	}

	public void setPrimaryEmpInd(String primaryEmpInd) {
		this.primaryEmpInd = primaryEmpInd;
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

}