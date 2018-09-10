package com.isolver.codegenerator.codegen.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CUSTOMER_MASTER_EXTENSION database table.
 * 
 */
@Entity
@Table(name="CUSTOMER_MASTER_EXTENSION")
@NamedQuery(name="CustomerMasterExtension.findAll", query="SELECT c FROM CustomerMasterExtension c")
public class CustomerMasterExtension implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CUSTOMER_ID", unique=true, nullable=false, length=10)
	private String customerId;

	@Column(name="ACQ_DETAIL", length=100)
	private String acqDetail;

	@Column(name="ACQ_METHOD", length=20)
	private String acqMethod;

	@Column(name="ACQ_REFERRED_BY", length=100)
	private String acqReferredBy;

	@Column(name="ANTICIPATED_RETIREMENT_DATE", length=10)
	private String anticipatedRetirementDate;

	@Column(name="BIRTH_DT_LEASED_IND", length=1)
	private String birthDtLeasedInd;

	@Column(name="CHAPTER_INT_ORG_ID", length=10)
	private String chapterIntOrgId;

	@Column(name="CHAPTER_RETIRED_FROM", length=10)
	private String chapterRetiredFrom;

	@Column(name="COMPLIMENTARY_IND", length=1)
	private String complimentaryInd;

	@Column(name="FACEBOOK_URL", length=100)
	private String facebookUrl;

	@Column(name="FIRST_YEAR_ESP", length=4)
	private String firstYearEsp;

	@Column(name="FIRST_YR_STUDENT", length=4)
	private String firstYrStudent;

	@Column(name="FIRST_YR_TEACHING", length=4)
	private String firstYrTeaching;

	@Column(name="INSTAGRAM_URL", length=100)
	private String instagramUrl;

	@Column(name="INTEREST_LEVEL", length=50)
	private String interestLevel;

	@Column(name="INTRA_STATE_UPDATE_IND", length=1)
	private String intraStateUpdateInd;

	@Column(name="LINKEDIN_URL", length=100)
	private String linkedinUrl;

	@Column(name="LOCAL_INT_ORG_ID", length=10)
	private String localIntOrgId;

	@Column(name="MB_PARTICIPANT_IND", length=1)
	private String mbParticipantInd;

	@Column(length=10)
	private String organization;

	@Column(name="OTHER_CHAR_COLUMN1", length=100)
	private String otherCharColumn1;

	@Column(name="OTHER_CHAR_COLUMN2", length=100)
	private String otherCharColumn2;

	@Column(name="OTHER_CHAR_COLUMN3", length=100)
	private String otherCharColumn3;

	@Column(name="OTHER_CHAR_COLUMN4", length=100)
	private String otherCharColumn4;

	@Column(name="OTHER_CHAR_COLUMN5", length=100)
	private String otherCharColumn5;

	@Temporal(TemporalType.DATE)
	@Column(name="OTHER_DATE_COLUMN1")
	private Date otherDateColumn1;

	@Temporal(TemporalType.DATE)
	@Column(name="OTHER_DATE_COLUMN2")
	private Date otherDateColumn2;

	@Temporal(TemporalType.DATE)
	@Column(name="OTHER_DATE_COLUMN3")
	private Date otherDateColumn3;

	@Temporal(TemporalType.DATE)
	@Column(name="OTHER_DATE_COLUMN4")
	private Date otherDateColumn4;

	@Temporal(TemporalType.DATE)
	@Column(name="OTHER_DATE_COLUMN5")
	private Date otherDateColumn5;

	@Column(name="OTHER_NUMERIC_COLUMN1", precision=22)
	private BigDecimal otherNumericColumn1;

	@Column(name="OTHER_NUMERIC_COLUMN2", precision=22)
	private BigDecimal otherNumericColumn2;

	@Column(name="OTHER_NUMERIC_COLUMN3", precision=22)
	private BigDecimal otherNumericColumn3;

	@Column(name="OTHER_NUMERIC_COLUMN4", precision=22)
	private BigDecimal otherNumericColumn4;

	@Column(name="OTHER_NUMERIC_COLUMN5", precision=22)
	private BigDecimal otherNumericColumn5;

	@Column(name="PERM_ABSENTEE_VOTER_IND", length=1)
	private String permAbsenteeVoterInd;

	@Column(name="PINTEREST_URL", length=100)
	private String pinterestUrl;

	@Column(name="PRIMARY_HOME_LANGUAGE", length=50)
	private String primaryHomeLanguage;

	@Column(name="PROSPECT_MBR_TYPE", length=100)
	private String prospectMbrType;

	@Column(name="SECONDARY_HOME_LANGUAGE", length=50)
	private String secondaryHomeLanguage;

	@Column(name="STAFF_IND", length=1)
	private String staffInd;

	@Column(name="STATE_INT_ORG_ID", length=10)
	private String stateIntOrgId;

	@Column(name="TWITTER_HANDLE", length=100)
	private String twitterHandle;

	@Column(name="VOTER_STATUS", length=10)
	private String voterStatus;

	public CustomerMasterExtension() {
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getAcqDetail() {
		return this.acqDetail;
	}

	public void setAcqDetail(String acqDetail) {
		this.acqDetail = acqDetail;
	}

	public String getAcqMethod() {
		return this.acqMethod;
	}

	public void setAcqMethod(String acqMethod) {
		this.acqMethod = acqMethod;
	}

	public String getAcqReferredBy() {
		return this.acqReferredBy;
	}

	public void setAcqReferredBy(String acqReferredBy) {
		this.acqReferredBy = acqReferredBy;
	}

	public String getAnticipatedRetirementDate() {
		return this.anticipatedRetirementDate;
	}

	public void setAnticipatedRetirementDate(String anticipatedRetirementDate) {
		this.anticipatedRetirementDate = anticipatedRetirementDate;
	}

	public String getBirthDtLeasedInd() {
		return this.birthDtLeasedInd;
	}

	public void setBirthDtLeasedInd(String birthDtLeasedInd) {
		this.birthDtLeasedInd = birthDtLeasedInd;
	}

	public String getChapterIntOrgId() {
		return this.chapterIntOrgId;
	}

	public void setChapterIntOrgId(String chapterIntOrgId) {
		this.chapterIntOrgId = chapterIntOrgId;
	}

	public String getChapterRetiredFrom() {
		return this.chapterRetiredFrom;
	}

	public void setChapterRetiredFrom(String chapterRetiredFrom) {
		this.chapterRetiredFrom = chapterRetiredFrom;
	}

	public String getComplimentaryInd() {
		return this.complimentaryInd;
	}

	public void setComplimentaryInd(String complimentaryInd) {
		this.complimentaryInd = complimentaryInd;
	}

	public String getFacebookUrl() {
		return this.facebookUrl;
	}

	public void setFacebookUrl(String facebookUrl) {
		this.facebookUrl = facebookUrl;
	}

	public String getFirstYearEsp() {
		return this.firstYearEsp;
	}

	public void setFirstYearEsp(String firstYearEsp) {
		this.firstYearEsp = firstYearEsp;
	}

	public String getFirstYrStudent() {
		return this.firstYrStudent;
	}

	public void setFirstYrStudent(String firstYrStudent) {
		this.firstYrStudent = firstYrStudent;
	}

	public String getFirstYrTeaching() {
		return this.firstYrTeaching;
	}

	public void setFirstYrTeaching(String firstYrTeaching) {
		this.firstYrTeaching = firstYrTeaching;
	}

	public String getInstagramUrl() {
		return this.instagramUrl;
	}

	public void setInstagramUrl(String instagramUrl) {
		this.instagramUrl = instagramUrl;
	}

	public String getInterestLevel() {
		return this.interestLevel;
	}

	public void setInterestLevel(String interestLevel) {
		this.interestLevel = interestLevel;
	}

	public String getIntraStateUpdateInd() {
		return this.intraStateUpdateInd;
	}

	public void setIntraStateUpdateInd(String intraStateUpdateInd) {
		this.intraStateUpdateInd = intraStateUpdateInd;
	}

	public String getLinkedinUrl() {
		return this.linkedinUrl;
	}

	public void setLinkedinUrl(String linkedinUrl) {
		this.linkedinUrl = linkedinUrl;
	}

	public String getLocalIntOrgId() {
		return this.localIntOrgId;
	}

	public void setLocalIntOrgId(String localIntOrgId) {
		this.localIntOrgId = localIntOrgId;
	}

	public String getMbParticipantInd() {
		return this.mbParticipantInd;
	}

	public void setMbParticipantInd(String mbParticipantInd) {
		this.mbParticipantInd = mbParticipantInd;
	}

	public String getOrganization() {
		return this.organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getOtherCharColumn1() {
		return this.otherCharColumn1;
	}

	public void setOtherCharColumn1(String otherCharColumn1) {
		this.otherCharColumn1 = otherCharColumn1;
	}

	public String getOtherCharColumn2() {
		return this.otherCharColumn2;
	}

	public void setOtherCharColumn2(String otherCharColumn2) {
		this.otherCharColumn2 = otherCharColumn2;
	}

	public String getOtherCharColumn3() {
		return this.otherCharColumn3;
	}

	public void setOtherCharColumn3(String otherCharColumn3) {
		this.otherCharColumn3 = otherCharColumn3;
	}

	public String getOtherCharColumn4() {
		return this.otherCharColumn4;
	}

	public void setOtherCharColumn4(String otherCharColumn4) {
		this.otherCharColumn4 = otherCharColumn4;
	}

	public String getOtherCharColumn5() {
		return this.otherCharColumn5;
	}

	public void setOtherCharColumn5(String otherCharColumn5) {
		this.otherCharColumn5 = otherCharColumn5;
	}

	public Date getOtherDateColumn1() {
		return this.otherDateColumn1;
	}

	public void setOtherDateColumn1(Date otherDateColumn1) {
		this.otherDateColumn1 = otherDateColumn1;
	}

	public Date getOtherDateColumn2() {
		return this.otherDateColumn2;
	}

	public void setOtherDateColumn2(Date otherDateColumn2) {
		this.otherDateColumn2 = otherDateColumn2;
	}

	public Date getOtherDateColumn3() {
		return this.otherDateColumn3;
	}

	public void setOtherDateColumn3(Date otherDateColumn3) {
		this.otherDateColumn3 = otherDateColumn3;
	}

	public Date getOtherDateColumn4() {
		return this.otherDateColumn4;
	}

	public void setOtherDateColumn4(Date otherDateColumn4) {
		this.otherDateColumn4 = otherDateColumn4;
	}

	public Date getOtherDateColumn5() {
		return this.otherDateColumn5;
	}

	public void setOtherDateColumn5(Date otherDateColumn5) {
		this.otherDateColumn5 = otherDateColumn5;
	}

	public BigDecimal getOtherNumericColumn1() {
		return this.otherNumericColumn1;
	}

	public void setOtherNumericColumn1(BigDecimal otherNumericColumn1) {
		this.otherNumericColumn1 = otherNumericColumn1;
	}

	public BigDecimal getOtherNumericColumn2() {
		return this.otherNumericColumn2;
	}

	public void setOtherNumericColumn2(BigDecimal otherNumericColumn2) {
		this.otherNumericColumn2 = otherNumericColumn2;
	}

	public BigDecimal getOtherNumericColumn3() {
		return this.otherNumericColumn3;
	}

	public void setOtherNumericColumn3(BigDecimal otherNumericColumn3) {
		this.otherNumericColumn3 = otherNumericColumn3;
	}

	public BigDecimal getOtherNumericColumn4() {
		return this.otherNumericColumn4;
	}

	public void setOtherNumericColumn4(BigDecimal otherNumericColumn4) {
		this.otherNumericColumn4 = otherNumericColumn4;
	}

	public BigDecimal getOtherNumericColumn5() {
		return this.otherNumericColumn5;
	}

	public void setOtherNumericColumn5(BigDecimal otherNumericColumn5) {
		this.otherNumericColumn5 = otherNumericColumn5;
	}

	public String getPermAbsenteeVoterInd() {
		return this.permAbsenteeVoterInd;
	}

	public void setPermAbsenteeVoterInd(String permAbsenteeVoterInd) {
		this.permAbsenteeVoterInd = permAbsenteeVoterInd;
	}

	public String getPinterestUrl() {
		return this.pinterestUrl;
	}

	public void setPinterestUrl(String pinterestUrl) {
		this.pinterestUrl = pinterestUrl;
	}

	public String getPrimaryHomeLanguage() {
		return this.primaryHomeLanguage;
	}

	public void setPrimaryHomeLanguage(String primaryHomeLanguage) {
		this.primaryHomeLanguage = primaryHomeLanguage;
	}

	public String getProspectMbrType() {
		return this.prospectMbrType;
	}

	public void setProspectMbrType(String prospectMbrType) {
		this.prospectMbrType = prospectMbrType;
	}

	public String getSecondaryHomeLanguage() {
		return this.secondaryHomeLanguage;
	}

	public void setSecondaryHomeLanguage(String secondaryHomeLanguage) {
		this.secondaryHomeLanguage = secondaryHomeLanguage;
	}

	public String getStaffInd() {
		return this.staffInd;
	}

	public void setStaffInd(String staffInd) {
		this.staffInd = staffInd;
	}

	public String getStateIntOrgId() {
		return this.stateIntOrgId;
	}

	public void setStateIntOrgId(String stateIntOrgId) {
		this.stateIntOrgId = stateIntOrgId;
	}

	public String getTwitterHandle() {
		return this.twitterHandle;
	}

	public void setTwitterHandle(String twitterHandle) {
		this.twitterHandle = twitterHandle;
	}

	public String getVoterStatus() {
		return this.voterStatus;
	}

	public void setVoterStatus(String voterStatus) {
		this.voterStatus = voterStatus;
	}

}