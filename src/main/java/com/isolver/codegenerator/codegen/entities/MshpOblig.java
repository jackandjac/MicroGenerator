package com.isolver.codegenerator.codegen.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the MSHP_OBLIG database table.
 * 
 */
@Entity
@Table(name="MSHP_OBLIG")
@NamedQuery(name="MshpOblig.findAll", query="SELECT m FROM MshpOblig m")
public class MshpOblig implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MSHP_DUES_ID", unique=true, nullable=false, precision=22)
	private long mshpDuesId;

	@Column(name="AMOUNT_DUE", precision=15, scale=2)
	private BigDecimal amountDue;

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

	@Column(name="BILBL_PARTY_ID", precision=22)
	private BigDecimal bilblPartyId;

	@Column(name="BILL_CLASS", length=5)
	private String billClass;

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

	@Column(name="FUND_SORT_CD", length=6)
	private String fundSortCd;

	@Column(name="FUND_TYPE_CD", length=6)
	private String fundTypeCd;

	@Column(name="INDV_ID", length=10)
	private String indvId;

	@Column(name="INT_ORG_ID", length=10)
	private String intOrgId;

	@Column(name="LAST_BATCH_JOB_ID", length=10)
	private String lastBatchJobId;

	@Column(name="MEMB_TYPE", length=15)
	private String membType;

	@Column(name="MSHP_LVL_SORT_CD", length=6)
	private String mshpLvlSortCd;

	@Column(name="MSHP_LVL_TYPE_CD", length=6)
	private String mshpLvlTypeCd;

	@Column(name="MSHP_TYPE_ASSOC_ID", nullable=false, precision=22)
	private BigDecimal mshpTypeAssocId;

	@Column(name="MSHP_YR", length=4)
	private String mshpYr;

	@Column(name="NEA_BILBL_PARTY_ID", precision=22)
	private BigDecimal neaBilblPartyId;

	@Column(name="OVERWRITE_FLG", length=1)
	private String overwriteFlg;

	@Column(name="PAC_REFUND_OPT_OUT_CD", length=8)
	private String pacRefundOptOutCd;

	@Column(name="PAC_REFUND_OPT_OUT_COMMENT", length=40)
	private String pacRefundOptOutComment;

	@Temporal(TemporalType.DATE)
	@Column(name="PAC_REFUND_OPT_OUT_DT")
	private Date pacRefundOptOutDt;

	@Column(name="PROD_PRICE_SEQ", nullable=false, precision=22)
	private BigDecimal prodPriceSeq;

	@Column(name="PROD_TRANS_CD", length=10)
	private String prodTransCd;

	@Column(name="PRORATE_CD", length=8)
	private String prorateCd;

	@Column(name="PRORATE_RSN_CD", length=8)
	private String prorateRsnCd;

	@Column(name="REDUCTION_TYPE_CD", length=8)
	private String reductionTypeCd;

	@Column(nullable=false, precision=5)
	private BigDecimal rowversion;

	@Column(name="SOURCE_PROD_PRICE_SEQ", precision=22)
	private BigDecimal sourceProdPriceSeq;

	@Column(name="SOURCE_REDUCTION_TYPE_CD", length=8)
	private String sourceReductionTypeCd;

	@Column(name="STATE_PYMT_METHOD_ID", precision=22)
	private BigDecimal statePymtMethodId;

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

	public MshpOblig() {
	}

	public long getMshpDuesId() {
		return this.mshpDuesId;
	}

	public void setMshpDuesId(long mshpDuesId) {
		this.mshpDuesId = mshpDuesId;
	}

	public BigDecimal getAmountDue() {
		return this.amountDue;
	}

	public void setAmountDue(BigDecimal amountDue) {
		this.amountDue = amountDue;
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

	public BigDecimal getBilblPartyId() {
		return this.bilblPartyId;
	}

	public void setBilblPartyId(BigDecimal bilblPartyId) {
		this.bilblPartyId = bilblPartyId;
	}

	public String getBillClass() {
		return this.billClass;
	}

	public void setBillClass(String billClass) {
		this.billClass = billClass;
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

	public String getFundSortCd() {
		return this.fundSortCd;
	}

	public void setFundSortCd(String fundSortCd) {
		this.fundSortCd = fundSortCd;
	}

	public String getFundTypeCd() {
		return this.fundTypeCd;
	}

	public void setFundTypeCd(String fundTypeCd) {
		this.fundTypeCd = fundTypeCd;
	}

	public String getIndvId() {
		return this.indvId;
	}

	public void setIndvId(String indvId) {
		this.indvId = indvId;
	}

	public String getIntOrgId() {
		return this.intOrgId;
	}

	public void setIntOrgId(String intOrgId) {
		this.intOrgId = intOrgId;
	}

	public String getLastBatchJobId() {
		return this.lastBatchJobId;
	}

	public void setLastBatchJobId(String lastBatchJobId) {
		this.lastBatchJobId = lastBatchJobId;
	}

	public String getMembType() {
		return this.membType;
	}

	public void setMembType(String membType) {
		this.membType = membType;
	}

	public String getMshpLvlSortCd() {
		return this.mshpLvlSortCd;
	}

	public void setMshpLvlSortCd(String mshpLvlSortCd) {
		this.mshpLvlSortCd = mshpLvlSortCd;
	}

	public String getMshpLvlTypeCd() {
		return this.mshpLvlTypeCd;
	}

	public void setMshpLvlTypeCd(String mshpLvlTypeCd) {
		this.mshpLvlTypeCd = mshpLvlTypeCd;
	}

	public BigDecimal getMshpTypeAssocId() {
		return this.mshpTypeAssocId;
	}

	public void setMshpTypeAssocId(BigDecimal mshpTypeAssocId) {
		this.mshpTypeAssocId = mshpTypeAssocId;
	}

	public String getMshpYr() {
		return this.mshpYr;
	}

	public void setMshpYr(String mshpYr) {
		this.mshpYr = mshpYr;
	}

	public BigDecimal getNeaBilblPartyId() {
		return this.neaBilblPartyId;
	}

	public void setNeaBilblPartyId(BigDecimal neaBilblPartyId) {
		this.neaBilblPartyId = neaBilblPartyId;
	}

	public String getOverwriteFlg() {
		return this.overwriteFlg;
	}

	public void setOverwriteFlg(String overwriteFlg) {
		this.overwriteFlg = overwriteFlg;
	}

	public String getPacRefundOptOutCd() {
		return this.pacRefundOptOutCd;
	}

	public void setPacRefundOptOutCd(String pacRefundOptOutCd) {
		this.pacRefundOptOutCd = pacRefundOptOutCd;
	}

	public String getPacRefundOptOutComment() {
		return this.pacRefundOptOutComment;
	}

	public void setPacRefundOptOutComment(String pacRefundOptOutComment) {
		this.pacRefundOptOutComment = pacRefundOptOutComment;
	}

	public Date getPacRefundOptOutDt() {
		return this.pacRefundOptOutDt;
	}

	public void setPacRefundOptOutDt(Date pacRefundOptOutDt) {
		this.pacRefundOptOutDt = pacRefundOptOutDt;
	}

	public BigDecimal getProdPriceSeq() {
		return this.prodPriceSeq;
	}

	public void setProdPriceSeq(BigDecimal prodPriceSeq) {
		this.prodPriceSeq = prodPriceSeq;
	}

	public String getProdTransCd() {
		return this.prodTransCd;
	}

	public void setProdTransCd(String prodTransCd) {
		this.prodTransCd = prodTransCd;
	}

	public String getProrateCd() {
		return this.prorateCd;
	}

	public void setProrateCd(String prorateCd) {
		this.prorateCd = prorateCd;
	}

	public String getProrateRsnCd() {
		return this.prorateRsnCd;
	}

	public void setProrateRsnCd(String prorateRsnCd) {
		this.prorateRsnCd = prorateRsnCd;
	}

	public String getReductionTypeCd() {
		return this.reductionTypeCd;
	}

	public void setReductionTypeCd(String reductionTypeCd) {
		this.reductionTypeCd = reductionTypeCd;
	}

	public BigDecimal getRowversion() {
		return this.rowversion;
	}

	public void setRowversion(BigDecimal rowversion) {
		this.rowversion = rowversion;
	}

	public BigDecimal getSourceProdPriceSeq() {
		return this.sourceProdPriceSeq;
	}

	public void setSourceProdPriceSeq(BigDecimal sourceProdPriceSeq) {
		this.sourceProdPriceSeq = sourceProdPriceSeq;
	}

	public String getSourceReductionTypeCd() {
		return this.sourceReductionTypeCd;
	}

	public void setSourceReductionTypeCd(String sourceReductionTypeCd) {
		this.sourceReductionTypeCd = sourceReductionTypeCd;
	}

	public BigDecimal getStatePymtMethodId() {
		return this.statePymtMethodId;
	}

	public void setStatePymtMethodId(BigDecimal statePymtMethodId) {
		this.statePymtMethodId = statePymtMethodId;
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