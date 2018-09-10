package com.isolver.codegenerator.codegen.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the MSHP_TYPE_ASSOC database table.
 * 
 */
@Entity
@Table(name="MSHP_TYPE_ASSOC")
@NamedQuery(name="MshpTypeAssoc.findAll", query="SELECT m FROM MshpTypeAssoc m")
public class MshpTypeAssoc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MSHP_TYPE_ASSOC_ID", unique=true, nullable=false, precision=22)
	private long mshpTypeAssocId;

	@Column(name="ASSOC_STATUS_CD", length=6)
	private String assocStatusCd;

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

	@Column(name="CANCEL_PERCENT_REMAINING", precision=6, scale=3)
	private BigDecimal cancelPercentRemaining;

	@Column(name="CHAPTER_ID", length=10)
	private String chapterId;

	@Column(name="CONT_IND", length=1)
	private String contInd;

	@Column(name="CREATED_BY", nullable=false, length=8)
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DT", nullable=false)
	private Date createdDt;

	@Column(name="DFIX_UPDATED_BY", length=8)
	private String dfixUpdatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="DFIX_UPDATED_DT")
	private Date dfixUpdatedDt;

	@Column(name="DUPLICATE_TAG_CD", length=6)
	private String duplicateTagCd;

	@Column(name="EARLY_ENRLMNT_IND", length=1)
	private String earlyEnrlmntInd;

	@Temporal(TemporalType.DATE)
	@Column(name="ENRLMNT_RENEWAL_DT")
	private Date enrlmntRenewalDt;

	@Column(name="FYMP_RENEW_IND", nullable=false, length=1)
	private String fympRenewInd;

	@Column(name="INDV_ID", nullable=false, length=10)
	private String indvId;

	@Column(name="LAST_BATCH_JOB_ID", length=10)
	private String lastBatchJobId;

	@Column(name="LEA_ASSOC_STATUS_CD", length=6)
	private String leaAssocStatusCd;

	@Temporal(TemporalType.DATE)
	@Column(name="LEA_CANCEL_EFF_DT")
	private Date leaCancelEffDt;

	@Temporal(TemporalType.DATE)
	@Column(name="LEA_CANCEL_PROC_DT")
	private Date leaCancelProcDt;

	@Column(name="LEA_CANCEL_REASON_CD", length=6)
	private String leaCancelReasonCd;

	@Temporal(TemporalType.DATE)
	@Column(name="LEA_CANCEL_REASON_DT")
	private Date leaCancelReasonDt;

	@Temporal(TemporalType.DATE)
	@Column(name="LEA_END_DT")
	private Date leaEndDt;

	@Column(name="LEA_INT_ORG_ID", length=10)
	private String leaIntOrgId;

	@Column(name="LEA_MEMB_TYPE", length=15)
	private String leaMembType;

	@Column(name="LEA_OBLIG_DESIG_USER_ID", length=4)
	private String leaObligDesigUserId;

	@Temporal(TemporalType.DATE)
	@Column(name="LEA_START_DT")
	private Date leaStartDt;

	@Column(name="LEA_STATUS_CD", length=6)
	private String leaStatusCd;

	@Column(name="LEA_USER_MSHP_CLASS_ID", length=4)
	private String leaUserMshpClassId;

	@Column(name="LEA_USER_MSHP_SCLASS_ID", length=4)
	private String leaUserMshpSclassId;

	@Column(name="MSHP_ADD_CARD_IND", length=1)
	private String mshpAddCardInd;

	@Column(name="MSHP_ADD_LABEL_IND", length=1)
	private String mshpAddLabelInd;

	@Column(name="MSHP_CHECK_DIGIT", length=1)
	private String mshpCheckDigit;

	@Column(name="MSHP_PRINT_CARD_IND", length=1)
	private String mshpPrintCardInd;

	@Column(name="MSHP_PRINT_LABEL_IND", length=1)
	private String mshpPrintLabelInd;

	@Column(name="MSHP_RENEW_CARD_IND", length=1)
	private String mshpRenewCardInd;

	@Column(name="MSHP_RENEW_LABEL_IND", length=1)
	private String mshpRenewLabelInd;

	@Column(name="MSHP_SET_STATUS_CD", length=1)
	private String mshpSetStatusCd;

	@Temporal(TemporalType.DATE)
	@Column(name="MSHP_STAT_PRCS_DT")
	private Date mshpStatPrcsDt;

	@Column(name="MSHP_YR", length=4)
	private String mshpYr;

	@Column(name="NEA_ASSOC_STATUS_CD", length=6)
	private String neaAssocStatusCd;

	@Temporal(TemporalType.DATE)
	@Column(name="NEA_CANCEL_EFF_DT")
	private Date neaCancelEffDt;

	@Temporal(TemporalType.DATE)
	@Column(name="NEA_CANCEL_PROC_DT")
	private Date neaCancelProcDt;

	@Column(name="NEA_CANCEL_REASON_CD", length=6)
	private String neaCancelReasonCd;

	@Temporal(TemporalType.DATE)
	@Column(name="NEA_CANCEL_REASON_DT")
	private Date neaCancelReasonDt;

	@Temporal(TemporalType.DATE)
	@Column(name="NEA_END_DT")
	private Date neaEndDt;

	@Column(name="NEA_MEMB_TYPE", length=15)
	private String neaMembType;

	@Column(name="NEA_OBLIG_DESIG_USER_ID", length=4)
	private String neaObligDesigUserId;

	@Temporal(TemporalType.DATE)
	@Column(name="NEA_START_DT")
	private Date neaStartDt;

	@Column(name="NEA_STATUS_CD", length=6)
	private String neaStatusCd;

	@Column(name="NEA_USER_MSHP_CLASS_ID", length=4)
	private String neaUserMshpClassId;

	@Column(name="NEA_USER_MSHP_SCLASS_ID", length=4)
	private String neaUserMshpSclassId;

	@Column(name="PAYROLL_DEDUCTION_CNT", precision=22)
	private BigDecimal payrollDeductionCnt;

	@Column(name="PRIOR_MSHP_TYPE_ASSOC_ID", precision=22)
	private BigDecimal priorMshpTypeAssocId;

	@Column(name="RENEWAL_PROCESS_IND", length=1)
	private String renewalProcessInd;

	@Column(precision=5)
	private BigDecimal rowversion;

	@Column(name="SEA_ASSOC_STATUS_CD", length=6)
	private String seaAssocStatusCd;

	@Temporal(TemporalType.DATE)
	@Column(name="SEA_CANCEL_EFF_DT")
	private Date seaCancelEffDt;

	@Temporal(TemporalType.DATE)
	@Column(name="SEA_CANCEL_PROC_DT")
	private Date seaCancelProcDt;

	@Column(name="SEA_CANCEL_REASON_CD", length=6)
	private String seaCancelReasonCd;

	@Temporal(TemporalType.DATE)
	@Column(name="SEA_CANCEL_REASON_DT")
	private Date seaCancelReasonDt;

	@Temporal(TemporalType.DATE)
	@Column(name="SEA_END_DT")
	private Date seaEndDt;

	@Column(name="SEA_INT_ORG_ID", length=10)
	private String seaIntOrgId;

	@Column(name="SEA_MEMB_TYPE", length=15)
	private String seaMembType;

	@Column(name="SEA_OBLIG_DESIG_USER_ID", length=4)
	private String seaObligDesigUserId;

	@Temporal(TemporalType.DATE)
	@Column(name="SEA_START_DT")
	private Date seaStartDt;

	@Column(name="SEA_STATUS_CD", length=6)
	private String seaStatusCd;

	@Column(name="SEA_USER_MSHP_CLASS_ID", length=4)
	private String seaUserMshpClassId;

	@Column(name="SEA_USER_MSHP_SCLASS_ID", length=4)
	private String seaUserMshpSclassId;

	@Temporal(TemporalType.DATE)
	@Column(name="START_DT")
	private Date startDt;

	@Column(name="STATE_INT_ORG_ID", length=10)
	private String stateIntOrgId;

	@Column(name="STATUS_CD", nullable=false, length=8)
	private String statusCd;

	@Temporal(TemporalType.DATE)
	@Column(name="STATUS_DT", nullable=false)
	private Date statusDt;

	@Column(name="UNISERV_INT_ORG_ID", length=10)
	private String uniservIntOrgId;

	@Column(name="UPDATED_BY", length=8)
	private String updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_DT")
	private Date updatedDt;

	@Temporal(TemporalType.DATE)
	@Column(name="WKLY_PROCESS_DT")
	private Date wklyProcessDt;

	@Column(name="WKLY_PROCESS_SOURCE", length=20)
	private String wklyProcessSource;

	public MshpTypeAssoc() {
	}

	public long getMshpTypeAssocId() {
		return this.mshpTypeAssocId;
	}

	public void setMshpTypeAssocId(long mshpTypeAssocId) {
		this.mshpTypeAssocId = mshpTypeAssocId;
	}

	public String getAssocStatusCd() {
		return this.assocStatusCd;
	}

	public void setAssocStatusCd(String assocStatusCd) {
		this.assocStatusCd = assocStatusCd;
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

	public BigDecimal getCancelPercentRemaining() {
		return this.cancelPercentRemaining;
	}

	public void setCancelPercentRemaining(BigDecimal cancelPercentRemaining) {
		this.cancelPercentRemaining = cancelPercentRemaining;
	}

	public String getChapterId() {
		return this.chapterId;
	}

	public void setChapterId(String chapterId) {
		this.chapterId = chapterId;
	}

	public String getContInd() {
		return this.contInd;
	}

	public void setContInd(String contInd) {
		this.contInd = contInd;
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

	public String getDfixUpdatedBy() {
		return this.dfixUpdatedBy;
	}

	public void setDfixUpdatedBy(String dfixUpdatedBy) {
		this.dfixUpdatedBy = dfixUpdatedBy;
	}

	public Date getDfixUpdatedDt() {
		return this.dfixUpdatedDt;
	}

	public void setDfixUpdatedDt(Date dfixUpdatedDt) {
		this.dfixUpdatedDt = dfixUpdatedDt;
	}

	public String getDuplicateTagCd() {
		return this.duplicateTagCd;
	}

	public void setDuplicateTagCd(String duplicateTagCd) {
		this.duplicateTagCd = duplicateTagCd;
	}

	public String getEarlyEnrlmntInd() {
		return this.earlyEnrlmntInd;
	}

	public void setEarlyEnrlmntInd(String earlyEnrlmntInd) {
		this.earlyEnrlmntInd = earlyEnrlmntInd;
	}

	public Date getEnrlmntRenewalDt() {
		return this.enrlmntRenewalDt;
	}

	public void setEnrlmntRenewalDt(Date enrlmntRenewalDt) {
		this.enrlmntRenewalDt = enrlmntRenewalDt;
	}

	public String getFympRenewInd() {
		return this.fympRenewInd;
	}

	public void setFympRenewInd(String fympRenewInd) {
		this.fympRenewInd = fympRenewInd;
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

	public String getLeaAssocStatusCd() {
		return this.leaAssocStatusCd;
	}

	public void setLeaAssocStatusCd(String leaAssocStatusCd) {
		this.leaAssocStatusCd = leaAssocStatusCd;
	}

	public Date getLeaCancelEffDt() {
		return this.leaCancelEffDt;
	}

	public void setLeaCancelEffDt(Date leaCancelEffDt) {
		this.leaCancelEffDt = leaCancelEffDt;
	}

	public Date getLeaCancelProcDt() {
		return this.leaCancelProcDt;
	}

	public void setLeaCancelProcDt(Date leaCancelProcDt) {
		this.leaCancelProcDt = leaCancelProcDt;
	}

	public String getLeaCancelReasonCd() {
		return this.leaCancelReasonCd;
	}

	public void setLeaCancelReasonCd(String leaCancelReasonCd) {
		this.leaCancelReasonCd = leaCancelReasonCd;
	}

	public Date getLeaCancelReasonDt() {
		return this.leaCancelReasonDt;
	}

	public void setLeaCancelReasonDt(Date leaCancelReasonDt) {
		this.leaCancelReasonDt = leaCancelReasonDt;
	}

	public Date getLeaEndDt() {
		return this.leaEndDt;
	}

	public void setLeaEndDt(Date leaEndDt) {
		this.leaEndDt = leaEndDt;
	}

	public String getLeaIntOrgId() {
		return this.leaIntOrgId;
	}

	public void setLeaIntOrgId(String leaIntOrgId) {
		this.leaIntOrgId = leaIntOrgId;
	}

	public String getLeaMembType() {
		return this.leaMembType;
	}

	public void setLeaMembType(String leaMembType) {
		this.leaMembType = leaMembType;
	}

	public String getLeaObligDesigUserId() {
		return this.leaObligDesigUserId;
	}

	public void setLeaObligDesigUserId(String leaObligDesigUserId) {
		this.leaObligDesigUserId = leaObligDesigUserId;
	}

	public Date getLeaStartDt() {
		return this.leaStartDt;
	}

	public void setLeaStartDt(Date leaStartDt) {
		this.leaStartDt = leaStartDt;
	}

	public String getLeaStatusCd() {
		return this.leaStatusCd;
	}

	public void setLeaStatusCd(String leaStatusCd) {
		this.leaStatusCd = leaStatusCd;
	}

	public String getLeaUserMshpClassId() {
		return this.leaUserMshpClassId;
	}

	public void setLeaUserMshpClassId(String leaUserMshpClassId) {
		this.leaUserMshpClassId = leaUserMshpClassId;
	}

	public String getLeaUserMshpSclassId() {
		return this.leaUserMshpSclassId;
	}

	public void setLeaUserMshpSclassId(String leaUserMshpSclassId) {
		this.leaUserMshpSclassId = leaUserMshpSclassId;
	}

	public String getMshpAddCardInd() {
		return this.mshpAddCardInd;
	}

	public void setMshpAddCardInd(String mshpAddCardInd) {
		this.mshpAddCardInd = mshpAddCardInd;
	}

	public String getMshpAddLabelInd() {
		return this.mshpAddLabelInd;
	}

	public void setMshpAddLabelInd(String mshpAddLabelInd) {
		this.mshpAddLabelInd = mshpAddLabelInd;
	}

	public String getMshpCheckDigit() {
		return this.mshpCheckDigit;
	}

	public void setMshpCheckDigit(String mshpCheckDigit) {
		this.mshpCheckDigit = mshpCheckDigit;
	}

	public String getMshpPrintCardInd() {
		return this.mshpPrintCardInd;
	}

	public void setMshpPrintCardInd(String mshpPrintCardInd) {
		this.mshpPrintCardInd = mshpPrintCardInd;
	}

	public String getMshpPrintLabelInd() {
		return this.mshpPrintLabelInd;
	}

	public void setMshpPrintLabelInd(String mshpPrintLabelInd) {
		this.mshpPrintLabelInd = mshpPrintLabelInd;
	}

	public String getMshpRenewCardInd() {
		return this.mshpRenewCardInd;
	}

	public void setMshpRenewCardInd(String mshpRenewCardInd) {
		this.mshpRenewCardInd = mshpRenewCardInd;
	}

	public String getMshpRenewLabelInd() {
		return this.mshpRenewLabelInd;
	}

	public void setMshpRenewLabelInd(String mshpRenewLabelInd) {
		this.mshpRenewLabelInd = mshpRenewLabelInd;
	}

	public String getMshpSetStatusCd() {
		return this.mshpSetStatusCd;
	}

	public void setMshpSetStatusCd(String mshpSetStatusCd) {
		this.mshpSetStatusCd = mshpSetStatusCd;
	}

	public Date getMshpStatPrcsDt() {
		return this.mshpStatPrcsDt;
	}

	public void setMshpStatPrcsDt(Date mshpStatPrcsDt) {
		this.mshpStatPrcsDt = mshpStatPrcsDt;
	}

	public String getMshpYr() {
		return this.mshpYr;
	}

	public void setMshpYr(String mshpYr) {
		this.mshpYr = mshpYr;
	}

	public String getNeaAssocStatusCd() {
		return this.neaAssocStatusCd;
	}

	public void setNeaAssocStatusCd(String neaAssocStatusCd) {
		this.neaAssocStatusCd = neaAssocStatusCd;
	}

	public Date getNeaCancelEffDt() {
		return this.neaCancelEffDt;
	}

	public void setNeaCancelEffDt(Date neaCancelEffDt) {
		this.neaCancelEffDt = neaCancelEffDt;
	}

	public Date getNeaCancelProcDt() {
		return this.neaCancelProcDt;
	}

	public void setNeaCancelProcDt(Date neaCancelProcDt) {
		this.neaCancelProcDt = neaCancelProcDt;
	}

	public String getNeaCancelReasonCd() {
		return this.neaCancelReasonCd;
	}

	public void setNeaCancelReasonCd(String neaCancelReasonCd) {
		this.neaCancelReasonCd = neaCancelReasonCd;
	}

	public Date getNeaCancelReasonDt() {
		return this.neaCancelReasonDt;
	}

	public void setNeaCancelReasonDt(Date neaCancelReasonDt) {
		this.neaCancelReasonDt = neaCancelReasonDt;
	}

	public Date getNeaEndDt() {
		return this.neaEndDt;
	}

	public void setNeaEndDt(Date neaEndDt) {
		this.neaEndDt = neaEndDt;
	}

	public String getNeaMembType() {
		return this.neaMembType;
	}

	public void setNeaMembType(String neaMembType) {
		this.neaMembType = neaMembType;
	}

	public String getNeaObligDesigUserId() {
		return this.neaObligDesigUserId;
	}

	public void setNeaObligDesigUserId(String neaObligDesigUserId) {
		this.neaObligDesigUserId = neaObligDesigUserId;
	}

	public Date getNeaStartDt() {
		return this.neaStartDt;
	}

	public void setNeaStartDt(Date neaStartDt) {
		this.neaStartDt = neaStartDt;
	}

	public String getNeaStatusCd() {
		return this.neaStatusCd;
	}

	public void setNeaStatusCd(String neaStatusCd) {
		this.neaStatusCd = neaStatusCd;
	}

	public String getNeaUserMshpClassId() {
		return this.neaUserMshpClassId;
	}

	public void setNeaUserMshpClassId(String neaUserMshpClassId) {
		this.neaUserMshpClassId = neaUserMshpClassId;
	}

	public String getNeaUserMshpSclassId() {
		return this.neaUserMshpSclassId;
	}

	public void setNeaUserMshpSclassId(String neaUserMshpSclassId) {
		this.neaUserMshpSclassId = neaUserMshpSclassId;
	}

	public BigDecimal getPayrollDeductionCnt() {
		return this.payrollDeductionCnt;
	}

	public void setPayrollDeductionCnt(BigDecimal payrollDeductionCnt) {
		this.payrollDeductionCnt = payrollDeductionCnt;
	}

	public BigDecimal getPriorMshpTypeAssocId() {
		return this.priorMshpTypeAssocId;
	}

	public void setPriorMshpTypeAssocId(BigDecimal priorMshpTypeAssocId) {
		this.priorMshpTypeAssocId = priorMshpTypeAssocId;
	}

	public String getRenewalProcessInd() {
		return this.renewalProcessInd;
	}

	public void setRenewalProcessInd(String renewalProcessInd) {
		this.renewalProcessInd = renewalProcessInd;
	}

	public BigDecimal getRowversion() {
		return this.rowversion;
	}

	public void setRowversion(BigDecimal rowversion) {
		this.rowversion = rowversion;
	}

	public String getSeaAssocStatusCd() {
		return this.seaAssocStatusCd;
	}

	public void setSeaAssocStatusCd(String seaAssocStatusCd) {
		this.seaAssocStatusCd = seaAssocStatusCd;
	}

	public Date getSeaCancelEffDt() {
		return this.seaCancelEffDt;
	}

	public void setSeaCancelEffDt(Date seaCancelEffDt) {
		this.seaCancelEffDt = seaCancelEffDt;
	}

	public Date getSeaCancelProcDt() {
		return this.seaCancelProcDt;
	}

	public void setSeaCancelProcDt(Date seaCancelProcDt) {
		this.seaCancelProcDt = seaCancelProcDt;
	}

	public String getSeaCancelReasonCd() {
		return this.seaCancelReasonCd;
	}

	public void setSeaCancelReasonCd(String seaCancelReasonCd) {
		this.seaCancelReasonCd = seaCancelReasonCd;
	}

	public Date getSeaCancelReasonDt() {
		return this.seaCancelReasonDt;
	}

	public void setSeaCancelReasonDt(Date seaCancelReasonDt) {
		this.seaCancelReasonDt = seaCancelReasonDt;
	}

	public Date getSeaEndDt() {
		return this.seaEndDt;
	}

	public void setSeaEndDt(Date seaEndDt) {
		this.seaEndDt = seaEndDt;
	}

	public String getSeaIntOrgId() {
		return this.seaIntOrgId;
	}

	public void setSeaIntOrgId(String seaIntOrgId) {
		this.seaIntOrgId = seaIntOrgId;
	}

	public String getSeaMembType() {
		return this.seaMembType;
	}

	public void setSeaMembType(String seaMembType) {
		this.seaMembType = seaMembType;
	}

	public String getSeaObligDesigUserId() {
		return this.seaObligDesigUserId;
	}

	public void setSeaObligDesigUserId(String seaObligDesigUserId) {
		this.seaObligDesigUserId = seaObligDesigUserId;
	}

	public Date getSeaStartDt() {
		return this.seaStartDt;
	}

	public void setSeaStartDt(Date seaStartDt) {
		this.seaStartDt = seaStartDt;
	}

	public String getSeaStatusCd() {
		return this.seaStatusCd;
	}

	public void setSeaStatusCd(String seaStatusCd) {
		this.seaStatusCd = seaStatusCd;
	}

	public String getSeaUserMshpClassId() {
		return this.seaUserMshpClassId;
	}

	public void setSeaUserMshpClassId(String seaUserMshpClassId) {
		this.seaUserMshpClassId = seaUserMshpClassId;
	}

	public String getSeaUserMshpSclassId() {
		return this.seaUserMshpSclassId;
	}

	public void setSeaUserMshpSclassId(String seaUserMshpSclassId) {
		this.seaUserMshpSclassId = seaUserMshpSclassId;
	}

	public Date getStartDt() {
		return this.startDt;
	}

	public void setStartDt(Date startDt) {
		this.startDt = startDt;
	}

	public String getStateIntOrgId() {
		return this.stateIntOrgId;
	}

	public void setStateIntOrgId(String stateIntOrgId) {
		this.stateIntOrgId = stateIntOrgId;
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

	public String getUniservIntOrgId() {
		return this.uniservIntOrgId;
	}

	public void setUniservIntOrgId(String uniservIntOrgId) {
		this.uniservIntOrgId = uniservIntOrgId;
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

	public Date getWklyProcessDt() {
		return this.wklyProcessDt;
	}

	public void setWklyProcessDt(Date wklyProcessDt) {
		this.wklyProcessDt = wklyProcessDt;
	}

	public String getWklyProcessSource() {
		return this.wklyProcessSource;
	}

	public void setWklyProcessSource(String wklyProcessSource) {
		this.wklyProcessSource = wklyProcessSource;
	}

}