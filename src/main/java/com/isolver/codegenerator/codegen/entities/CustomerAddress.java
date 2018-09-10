package com.isolver.codegenerator.codegen.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CUSTOMER_ADDRESS database table.
 * 
 */
@Entity
@Table(name="CUSTOMER_ADDRESS")
@NamedQuery(name="CustomerAddress.findAll", query="SELECT c FROM CustomerAddress c")
public class CustomerAddress implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CUSTOMER_ADDRESS_ID", unique=true, nullable=false, precision=22)
	private long customerAddressId;

	@Column(name="ADDRESS_ID", nullable=false, length=10)
	private String addressId;

	@Column(name="ADDRESS_TYPE", nullable=false, length=20)
	private String addressType;

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

	@Column(name="CENSUS_BLOCK_GROUP_CD", length=1)
	private String censusBlockGroupCd;

	@Column(name="CENSUS_TRACT_CD", length=6)
	private String censusTractCd;

	@Column(name="COMMENT_TXT", length=30)
	private String commentTxt;

	@Column(name="CREATED_BY", nullable=false, length=8)
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DT", nullable=false)
	private Date createdDt;

	@Column(name="CRT_SRC_DESC", length=20)
	private String crtSrcDesc;

	@Column(name="CUSTOMER_ID", nullable=false, length=10)
	private String customerId;

	@Column(name="DFIX_UPDATED_BY", length=8)
	private String dfixUpdatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="DFIX_UPDATED_DT")
	private Date dfixUpdatedDt;

	@Column(name="ELEM_NCES_SCHOOL_DISTRICT_CD", length=100)
	private String elemNcesSchoolDistrictCd;

	@Temporal(TemporalType.DATE)
	@Column(name="END_DT")
	private Date endDt;

	@Column(name="END_REASON_CD", length=6)
	private String endReasonCd;

	@Column(name="FIPS_COUNTY_CD", length=3)
	private String fipsCountyCd;

	@Column(name="FIPS_STATE_CD", length=2)
	private String fipsStateCd;

	@Column(name="FOREIGN_ADDRESS_IND", length=1)
	private String foreignAddressInd;

	@Column(name="HIGH_NCES_SCHOOL_DISTRICT_ID", length=100)
	private String highNcesSchoolDistrictId;

	@Column(name="LAST_BATCH_JOB_ID", length=10)
	private String lastBatchJobId;

	@Column(name="LATITUDE_CD", length=8)
	private String latitudeCd;

	@Column(name="LEGAL_RES_IND", length=1)
	private String legalResInd;

	@Column(name="LONGITUDE_CD", length=8)
	private String longitudeCd;

	@Column(name="MAIL_STOP", length=30)
	private String mailStop;

	@Column(name="MCD_CCD_CD", length=5)
	private String mcdCcdCd;

	@Column(name="MID_NCES_SCHOOL_DISTRICT_ID", length=100)
	private String midNcesSchoolDistrictId;

	@Column(name="MSA_CD", length=4)
	private String msaCd;

	@Column(name="OVER_RIDE_CD", length=10)
	private String overRideCd;

	@Column(name="PLACE_CD", length=5)
	private String placeCd;

	@Column(name="PRECINCT_CD", length=15)
	private String precinctCd;

	@Column(name="REACTIVATE_IND", length=1)
	private String reactivateInd;

	@Column(name="REP_STATE_PROVINCE_CD", length=3)
	private String repStateProvinceCd;

	@Column(name="REP_ZIP_CD", length=15)
	private String repZipCd;

	@Column(precision=5)
	private BigDecimal rowversion;

	@Column(name="SEASON_END_DAY", length=10)
	private String seasonEndDay;

	@Column(name="SEASON_END_MO", length=10)
	private String seasonEndMo;

	@Column(name="SEASON_START_DAY", length=10)
	private String seasonStartDay;

	@Column(name="SEASON_START_MO", length=10)
	private String seasonStartMo;

	@Temporal(TemporalType.DATE)
	@Column(name="START_DT", nullable=false)
	private Date startDt;

	@Column(name="STATE_CONG_DISTRICT_CD", length=3)
	private String stateCongDistrictCd;

	@Column(name="STATE_SENATE_DISTRICT_CD", length=3)
	private String stateSenateDistrictCd;

	@Column(name="STATUS_CD", nullable=false, length=8)
	private String statusCd;

	@Temporal(TemporalType.DATE)
	@Column(name="STATUS_DT", nullable=false)
	private Date statusDt;

	@Column(name="UNIF_NCES_SCHOOL_DISTRICT_ID", length=100)
	private String unifNcesSchoolDistrictId;

	@Column(name="UPDATED_BY", length=8)
	private String updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_DT")
	private Date updatedDt;

	@Column(name="US_CONG_DISTRICT_CD", length=3)
	private String usCongDistrictCd;

	@Column(name="WARD_CD", length=6)
	private String wardCd;

	public CustomerAddress() {
	}

	public long getCustomerAddressId() {
		return this.customerAddressId;
	}

	public void setCustomerAddressId(long customerAddressId) {
		this.customerAddressId = customerAddressId;
	}

	public String getAddressId() {
		return this.addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getAddressType() {
		return this.addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
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

	public String getCensusBlockGroupCd() {
		return this.censusBlockGroupCd;
	}

	public void setCensusBlockGroupCd(String censusBlockGroupCd) {
		this.censusBlockGroupCd = censusBlockGroupCd;
	}

	public String getCensusTractCd() {
		return this.censusTractCd;
	}

	public void setCensusTractCd(String censusTractCd) {
		this.censusTractCd = censusTractCd;
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

	public String getCrtSrcDesc() {
		return this.crtSrcDesc;
	}

	public void setCrtSrcDesc(String crtSrcDesc) {
		this.crtSrcDesc = crtSrcDesc;
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
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

	public String getElemNcesSchoolDistrictCd() {
		return this.elemNcesSchoolDistrictCd;
	}

	public void setElemNcesSchoolDistrictCd(String elemNcesSchoolDistrictCd) {
		this.elemNcesSchoolDistrictCd = elemNcesSchoolDistrictCd;
	}

	public Date getEndDt() {
		return this.endDt;
	}

	public void setEndDt(Date endDt) {
		this.endDt = endDt;
	}

	public String getEndReasonCd() {
		return this.endReasonCd;
	}

	public void setEndReasonCd(String endReasonCd) {
		this.endReasonCd = endReasonCd;
	}

	public String getFipsCountyCd() {
		return this.fipsCountyCd;
	}

	public void setFipsCountyCd(String fipsCountyCd) {
		this.fipsCountyCd = fipsCountyCd;
	}

	public String getFipsStateCd() {
		return this.fipsStateCd;
	}

	public void setFipsStateCd(String fipsStateCd) {
		this.fipsStateCd = fipsStateCd;
	}

	public String getForeignAddressInd() {
		return this.foreignAddressInd;
	}

	public void setForeignAddressInd(String foreignAddressInd) {
		this.foreignAddressInd = foreignAddressInd;
	}

	public String getHighNcesSchoolDistrictId() {
		return this.highNcesSchoolDistrictId;
	}

	public void setHighNcesSchoolDistrictId(String highNcesSchoolDistrictId) {
		this.highNcesSchoolDistrictId = highNcesSchoolDistrictId;
	}

	public String getLastBatchJobId() {
		return this.lastBatchJobId;
	}

	public void setLastBatchJobId(String lastBatchJobId) {
		this.lastBatchJobId = lastBatchJobId;
	}

	public String getLatitudeCd() {
		return this.latitudeCd;
	}

	public void setLatitudeCd(String latitudeCd) {
		this.latitudeCd = latitudeCd;
	}

	public String getLegalResInd() {
		return this.legalResInd;
	}

	public void setLegalResInd(String legalResInd) {
		this.legalResInd = legalResInd;
	}

	public String getLongitudeCd() {
		return this.longitudeCd;
	}

	public void setLongitudeCd(String longitudeCd) {
		this.longitudeCd = longitudeCd;
	}

	public String getMailStop() {
		return this.mailStop;
	}

	public void setMailStop(String mailStop) {
		this.mailStop = mailStop;
	}

	public String getMcdCcdCd() {
		return this.mcdCcdCd;
	}

	public void setMcdCcdCd(String mcdCcdCd) {
		this.mcdCcdCd = mcdCcdCd;
	}

	public String getMidNcesSchoolDistrictId() {
		return this.midNcesSchoolDistrictId;
	}

	public void setMidNcesSchoolDistrictId(String midNcesSchoolDistrictId) {
		this.midNcesSchoolDistrictId = midNcesSchoolDistrictId;
	}

	public String getMsaCd() {
		return this.msaCd;
	}

	public void setMsaCd(String msaCd) {
		this.msaCd = msaCd;
	}

	public String getOverRideCd() {
		return this.overRideCd;
	}

	public void setOverRideCd(String overRideCd) {
		this.overRideCd = overRideCd;
	}

	public String getPlaceCd() {
		return this.placeCd;
	}

	public void setPlaceCd(String placeCd) {
		this.placeCd = placeCd;
	}

	public String getPrecinctCd() {
		return this.precinctCd;
	}

	public void setPrecinctCd(String precinctCd) {
		this.precinctCd = precinctCd;
	}

	public String getReactivateInd() {
		return this.reactivateInd;
	}

	public void setReactivateInd(String reactivateInd) {
		this.reactivateInd = reactivateInd;
	}

	public String getRepStateProvinceCd() {
		return this.repStateProvinceCd;
	}

	public void setRepStateProvinceCd(String repStateProvinceCd) {
		this.repStateProvinceCd = repStateProvinceCd;
	}

	public String getRepZipCd() {
		return this.repZipCd;
	}

	public void setRepZipCd(String repZipCd) {
		this.repZipCd = repZipCd;
	}

	public BigDecimal getRowversion() {
		return this.rowversion;
	}

	public void setRowversion(BigDecimal rowversion) {
		this.rowversion = rowversion;
	}

	public String getSeasonEndDay() {
		return this.seasonEndDay;
	}

	public void setSeasonEndDay(String seasonEndDay) {
		this.seasonEndDay = seasonEndDay;
	}

	public String getSeasonEndMo() {
		return this.seasonEndMo;
	}

	public void setSeasonEndMo(String seasonEndMo) {
		this.seasonEndMo = seasonEndMo;
	}

	public String getSeasonStartDay() {
		return this.seasonStartDay;
	}

	public void setSeasonStartDay(String seasonStartDay) {
		this.seasonStartDay = seasonStartDay;
	}

	public String getSeasonStartMo() {
		return this.seasonStartMo;
	}

	public void setSeasonStartMo(String seasonStartMo) {
		this.seasonStartMo = seasonStartMo;
	}

	public Date getStartDt() {
		return this.startDt;
	}

	public void setStartDt(Date startDt) {
		this.startDt = startDt;
	}

	public String getStateCongDistrictCd() {
		return this.stateCongDistrictCd;
	}

	public void setStateCongDistrictCd(String stateCongDistrictCd) {
		this.stateCongDistrictCd = stateCongDistrictCd;
	}

	public String getStateSenateDistrictCd() {
		return this.stateSenateDistrictCd;
	}

	public void setStateSenateDistrictCd(String stateSenateDistrictCd) {
		this.stateSenateDistrictCd = stateSenateDistrictCd;
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

	public String getUnifNcesSchoolDistrictId() {
		return this.unifNcesSchoolDistrictId;
	}

	public void setUnifNcesSchoolDistrictId(String unifNcesSchoolDistrictId) {
		this.unifNcesSchoolDistrictId = unifNcesSchoolDistrictId;
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

	public String getUsCongDistrictCd() {
		return this.usCongDistrictCd;
	}

	public void setUsCongDistrictCd(String usCongDistrictCd) {
		this.usCongDistrictCd = usCongDistrictCd;
	}

	public String getWardCd() {
		return this.wardCd;
	}

	public void setWardCd(String wardCd) {
		this.wardCd = wardCd;
	}

}