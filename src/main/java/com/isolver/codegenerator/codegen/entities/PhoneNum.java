package com.isolver.codegenerator.codegen.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the PHONE_NUM database table.
 * 
 */
@Entity
@Table(name="PHONE_NUM")
@NamedQuery(name="PhoneNum.findAll", query="SELECT p FROM PhoneNum p")
public class PhoneNum implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PHONE_ID", unique=true, nullable=false, precision=22)
	private long phoneId;

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

	@Column(name="CALLING_HOUR_TXT", length=200)
	private String callingHourTxt;

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

	@Column(name="CUSTOMER_ADDRESS_ID", precision=22)
	private BigDecimal customerAddressId;

	@Column(name="CUSTOMER_ID", nullable=false, length=10)
	private String customerId;

	@Temporal(TemporalType.DATE)
	@Column(name="END_DT")
	private Date endDt;

	@Column(name="FOREIGN_NUM_IND", length=1)
	private String foreignNumInd;

	@Column(name="LAST_BATCH_JOB_ID", length=10)
	private String lastBatchJobId;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_BATCH_UPDATE_DT")
	private Date lastBatchUpdateDt;

	@Column(name="OUT_OF_SERVICE_IND", length=1)
	private String outOfServiceInd;

	@Column(name="PHONE_NUM_TXT", nullable=false, length=20)
	private String phoneNumTxt;

	@Column(name="PHONE_TYPE_CD", nullable=false, length=8)
	private String phoneTypeCd;

	@Column(name="PRINCIPAL_PHONE_IND", length=1)
	private String principalPhoneInd;

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

	@Column(name="UNLISTED_IND", length=1)
	private String unlistedInd;

	@Column(name="UPDATED_BY", length=8)
	private String updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_DT")
	private Date updatedDt;

	public PhoneNum() {
	}

	public long getPhoneId() {
		return this.phoneId;
	}

	public void setPhoneId(long phoneId) {
		this.phoneId = phoneId;
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

	public String getCallingHourTxt() {
		return this.callingHourTxt;
	}

	public void setCallingHourTxt(String callingHourTxt) {
		this.callingHourTxt = callingHourTxt;
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

	public BigDecimal getCustomerAddressId() {
		return this.customerAddressId;
	}

	public void setCustomerAddressId(BigDecimal customerAddressId) {
		this.customerAddressId = customerAddressId;
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public Date getEndDt() {
		return this.endDt;
	}

	public void setEndDt(Date endDt) {
		this.endDt = endDt;
	}

	public String getForeignNumInd() {
		return this.foreignNumInd;
	}

	public void setForeignNumInd(String foreignNumInd) {
		this.foreignNumInd = foreignNumInd;
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

	public String getOutOfServiceInd() {
		return this.outOfServiceInd;
	}

	public void setOutOfServiceInd(String outOfServiceInd) {
		this.outOfServiceInd = outOfServiceInd;
	}

	public String getPhoneNumTxt() {
		return this.phoneNumTxt;
	}

	public void setPhoneNumTxt(String phoneNumTxt) {
		this.phoneNumTxt = phoneNumTxt;
	}

	public String getPhoneTypeCd() {
		return this.phoneTypeCd;
	}

	public void setPhoneTypeCd(String phoneTypeCd) {
		this.phoneTypeCd = phoneTypeCd;
	}

	public String getPrincipalPhoneInd() {
		return this.principalPhoneInd;
	}

	public void setPrincipalPhoneInd(String principalPhoneInd) {
		this.principalPhoneInd = principalPhoneInd;
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

	public String getUnlistedInd() {
		return this.unlistedInd;
	}

	public void setUnlistedInd(String unlistedInd) {
		this.unlistedInd = unlistedInd;
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