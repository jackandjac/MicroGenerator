package com.isolver.codegenerator.codegen.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the ADDRESSES database table.
 * 
 */
@Entity
@Table(name="ADDRESSES")
@NamedQuery(name="Address.findAll", query="SELECT a FROM Address a")
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ADDRESS_ID", unique=true, nullable=false, length=10)
	private String addressId;

	@Column(name="ADDRESS_LINE_1", length=44)
	private String addressLine1;

	@Column(name="ADDRESS_LINE_2", length=44)
	private String addressLine2;

	@Column(name="ADDRESS_LINE_3", length=44)
	private String addressLine3;

	@Column(name="ADDRESS_LINE_4", length=44)
	private String addressLine4;

	@Temporal(TemporalType.DATE)
	@Column(name="BAD_ADDRESS_DT")
	private Date badAddressDt;

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

	@Column(length=35)
	private String city;

	@Column(name="COUNTRY_CD", length=8)
	private String countryCd;

	@Column(name="CREATED_BY", nullable=false, length=8)
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DT", nullable=false)
	private Date createdDt;

	@Column(length=254)
	private String directions;

	@Column(name="GROUP1_VALIDATED_IND", length=1)
	private String group1ValidatedInd;

	@Column(name="HISTORY_FLG", length=1)
	private String historyFlg;

	@Column(name="LAST_BATCH_JOB_ID", length=10)
	private String lastBatchJobId;

	@Column(name="OFFICE_HOURS", length=20)
	private String officeHours;

	@Column(name="OVER_RIDE_CD", length=10)
	private String overRideCd;

	@Column(name="OWNER_ID", length=10)
	private String ownerId;

	@Column(name="PO_BOX_IND", length=1)
	private String poBoxInd;

	@Column(precision=5)
	private BigDecimal rowversion;

	@Column(name="STATE_PROVINCE_CD", length=3)
	private String stateProvinceCd;

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

	@Column(name="USPS_CD", length=10)
	private String uspsCd;

	@Column(name="ZIP_CD", length=15)
	private String zipCd;

	public Address() {
	}

	public String getAddressId() {
		return this.addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getAddressLine1() {
		return this.addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return this.addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return this.addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public String getAddressLine4() {
		return this.addressLine4;
	}

	public void setAddressLine4(String addressLine4) {
		this.addressLine4 = addressLine4;
	}

	public Date getBadAddressDt() {
		return this.badAddressDt;
	}

	public void setBadAddressDt(Date badAddressDt) {
		this.badAddressDt = badAddressDt;
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

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountryCd() {
		return this.countryCd;
	}

	public void setCountryCd(String countryCd) {
		this.countryCd = countryCd;
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

	public String getDirections() {
		return this.directions;
	}

	public void setDirections(String directions) {
		this.directions = directions;
	}

	public String getGroup1ValidatedInd() {
		return this.group1ValidatedInd;
	}

	public void setGroup1ValidatedInd(String group1ValidatedInd) {
		this.group1ValidatedInd = group1ValidatedInd;
	}

	public String getHistoryFlg() {
		return this.historyFlg;
	}

	public void setHistoryFlg(String historyFlg) {
		this.historyFlg = historyFlg;
	}

	public String getLastBatchJobId() {
		return this.lastBatchJobId;
	}

	public void setLastBatchJobId(String lastBatchJobId) {
		this.lastBatchJobId = lastBatchJobId;
	}

	public String getOfficeHours() {
		return this.officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public String getOverRideCd() {
		return this.overRideCd;
	}

	public void setOverRideCd(String overRideCd) {
		this.overRideCd = overRideCd;
	}

	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getPoBoxInd() {
		return this.poBoxInd;
	}

	public void setPoBoxInd(String poBoxInd) {
		this.poBoxInd = poBoxInd;
	}

	public BigDecimal getRowversion() {
		return this.rowversion;
	}

	public void setRowversion(BigDecimal rowversion) {
		this.rowversion = rowversion;
	}

	public String getStateProvinceCd() {
		return this.stateProvinceCd;
	}

	public void setStateProvinceCd(String stateProvinceCd) {
		this.stateProvinceCd = stateProvinceCd;
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

	public String getUspsCd() {
		return this.uspsCd;
	}

	public void setUspsCd(String uspsCd) {
		this.uspsCd = uspsCd;
	}

	public String getZipCd() {
		return this.zipCd;
	}

	public void setZipCd(String zipCd) {
		this.zipCd = zipCd;
	}

}