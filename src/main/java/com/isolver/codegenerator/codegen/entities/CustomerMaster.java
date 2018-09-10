package com.isolver.codegenerator.codegen.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CUSTOMER_MASTER database table.
 * 
 */
@Entity
@Table(name="CUSTOMER_MASTER")
@NamedQuery(name="CustomerMaster.findAll", query="SELECT c FROM CustomerMaster c")
public class CustomerMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CUSTOMER_ID", unique=true, nullable=false, length=10)
	private String customerId;

	@Column(name="ABBREV_NM", length=10)
	private String abbrevNm;

	@Column(name="ACCT_COMPANY", length=4)
	private String acctCompany;

	@Column(name="AFT_AFF_IND", length=1)
	private String aftAffInd;

	@Column(name="AFT_NATIONAL_OBLIG_PCT", precision=22)
	private BigDecimal aftNationalObligPct;

	@Column(name="AGENCY_SHOP_IND", length=1)
	private String agencyShopInd;

	@Column(name="ALT_ID", length=10)
	private String altId;

	@Column(name="ALT_ID_CHECK_DIGIT", length=1)
	private String altIdCheckDigit;

	@Column(name="ALT_KEY_COLUMN", length=10)
	private String altKeyColumn;

	@Column(name="ANNUAL_ELECTION_MTH", precision=2)
	private BigDecimal annualElectionMth;

	@Temporal(TemporalType.DATE)
	@Column(name="ANNUAL_MEETING_DT")
	private Date annualMeetingDt;

	@Column(name="ANNUAL_MEETING_TXT", length=75)
	private String annualMeetingTxt;

	@Column(name="BANK_PROFILE_ID", precision=22)
	private BigDecimal bankProfileId;

	@Column(name="BARGAINING_MINORITY_LOCAL_IND", length=1)
	private String bargainingMinorityLocalInd;

	@Column(name="BARGAINING_OPT_ALLOWED_IND", length=1)
	private String bargainingOptAllowedInd;

	@Column(name="BARGAINING_OPT_EXERCISED_IND", length=1)
	private String bargainingOptExercisedInd;

	@Column(name="BARGAINING_PROHIBITED_IND", length=1)
	private String bargainingProhibitedInd;

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

	@Column(name="BILL_CLASS", length=5)
	private String billClass;

	@Temporal(TemporalType.DATE)
	@Column(name="BIRTH_DT")
	private Date birthDt;

	@Column(name="BIRTH_DT_IND", length=1)
	private String birthDtInd;

	@Column(name="BIRTH_YR", length=4)
	private String birthYr;

	@Column(length=12)
	private String certification;

	@Column(name="CHARTER_APPLICATION_TO_CD", length=8)
	private String charterApplicationToCd;

	@Column(name="CHARTER_APPLN_RECPNT_NM", length=75)
	private String charterApplnRecpntNm;

	@Column(name="CHARTER_APPROVED_BY_CD", length=8)
	private String charterApprovedByCd;

	@Column(name="CHARTER_APPRV_BY_NM", length=75)
	private String charterApprvByNm;

	@Column(name="CHARTER_BY_TYPE_CD", length=6)
	private String charterByTypeCd;

	@Temporal(TemporalType.DATE)
	@Column(name="CHARTER_DT")
	private Date charterDt;

	@Column(name="CHARTER_SPONSOR_NAME", length=40)
	private String charterSponsorName;

	@Column(name="CHARTER_SPONSOR_TYPE", length=8)
	private String charterSponsorType;

	@Column(name="COLLECT_DUES_CHAPTER_IND", length=1)
	private String collectDuesChapterInd;

	@Column(name="COMP_SCHOOL_DISTRICT_ID", length=10)
	private String compSchoolDistrictId;

	@Column(name="CREATED_BY", nullable=false, length=8)
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DT", nullable=false)
	private Date createdDt;

	@Column(name="CREDIT_LIMIT", precision=10)
	private BigDecimal creditLimit;

	@Column(name="CRT_SRC_DESC_TXT", length=20)
	private String crtSrcDescTxt;

	@Temporal(TemporalType.DATE)
	@Column(name="CRT_SRC_START_DT")
	private Date crtSrcStartDt;

	@Temporal(TemporalType.DATE)
	@Column(name="CURR_AFT_END_DT")
	private Date currAftEndDt;

	@Temporal(TemporalType.DATE)
	@Column(name="CURR_AFT_START_DT")
	private Date currAftStartDt;

	@Column(name="CURR_NEA_MSHP_IND", length=1)
	private String currNeaMshpInd;

	@Column(name="CUSTOMER_STATUS_CD", length=5)
	private String customerStatusCd;

	@Column(name="CUSTOMER_TYPE", nullable=false, length=1)
	private String customerType;

	@Column(name="DEATH_IND", length=1)
	private String deathInd;

	@Column(name="DEATH_NOTC_IND", length=1)
	private String deathNotcInd;

	@Column(name="EMP_LOCALE", length=3)
	private String empLocale;

	@Column(name="EMPLR_ASSGN_CD", length=10)
	private String emplrAssgnCd;

	@Column(name="EMPLR_ASSGN_RELATIONSHIP_CD", length=10)
	private String emplrAssgnRelationshipCd;

	@Column(name="EMPLR_ORG_TYPE_CD", length=10)
	private String emplrOrgTypeCd;

	@Column(name="EMPLR_TYPE_GOVERNANCE_CD", length=10)
	private String emplrTypeGovernanceCd;

	@Column(name="END_RSN", length=20)
	private String endRsn;

	@Column(name="END_RSN_CD", length=10)
	private String endRsnCd;

	@Column(name="END_RSN_TXT", length=40)
	private String endRsnTxt;

	@Temporal(TemporalType.DATE)
	@Column(name="EXPIRATION_DT")
	private Date expirationDt;

	@Column(name="EXT_FREQUENT_VOTER_IND", length=1)
	private String extFrequentVoterInd;

	@Column(name="FIRST_NM", length=35)
	private String firstNm;

	@Column(name="GEN_LVL_CD", length=10)
	private String genLvlCd;

	@Column(name="GENDER_CD", length=5)
	private String genderCd;

	@Temporal(TemporalType.DATE)
	@Column(name="GRADUATION_DT")
	private Date graduationDt;

	@Column(name="HIGHEST_DEG_CD", length=5)
	private String highestDegCd;

	@Column(name="HOLD_MAIL_FLG", length=2)
	private String holdMailFlg;

	@Column(name="INCLUDE_IN_PORTAL_IND", length=1)
	private String includeInPortalInd;

	@Column(name="INDUSTRY_TYPE", length=5)
	private String industryType;

	@Column(name="INDV_CHECK_DIGIT", length=1)
	private String indvCheckDigit;

	@Column(name="INDV_ORIGN_CD", length=10)
	private String indvOrignCd;

	@Column(name="INDV_ORIGN_RSN_CD", length=10)
	private String indvOrignRsnCd;

	@Column(name="IPED_HIGHER_EDU_ID", length=8)
	private String ipedHigherEduId;

	@Column(name="JOB_DESC_CD", length=5)
	private String jobDescCd;

	@Temporal(TemporalType.DATE)
	@Column(name="JOIN_DT")
	private Date joinDt;

	@Column(name="LABEL_NM", length=30)
	private String labelNm;

	@Column(name="LAST_BATCH_JOB_ID", length=10)
	private String lastBatchJobId;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_BATCH_UPDATE_DT")
	private Date lastBatchUpdateDt;

	@Column(name="LAST_NM", length=35)
	private String lastNm;

	@Column(name="LEGAL_RESIDENCE_ID", precision=22)
	private BigDecimal legalResidenceId;

	@Column(name="LOCAL_INT_ORG_ID", length=10)
	private String localIntOrgId;

	@Column(name="LOCAL_ORIGN_CD", length=6)
	private String localOrignCd;

	@Column(name="LVL_ID", precision=22)
	private BigDecimal lvlId;

	@Column(name="MARITAL_STATUS_CD", length=5)
	private String maritalStatusCd;

	@Temporal(TemporalType.DATE)
	@Column(name="MATERIALS_PROCESSED_DT")
	private Date materialsProcessedDt;

	@Temporal(TemporalType.DATE)
	@Column(name="MATERIALS_RECEIVED_DT")
	private Date materialsReceivedDt;

	@Column(name="MBC_MKTG_AGRMT_IND", length=1)
	private String mbcMktgAgrmtInd;

	@Column(name="MEMB_START_MTH", precision=2)
	private BigDecimal membStartMth;

	@Column(name="MEMB_STATUS_CD", length=5)
	private String membStatusCd;

	@Column(name="MEMB_TYPE", length=5)
	private String membType;

	@Column(name="MEMB_YR_TYPE", length=1)
	private String membYrType;

	@Column(name="MIDDLE_NM", length=35)
	private String middleNm;

	@Column(name="NAME_UPPERCASE", length=72)
	private String nameUppercase;

	@Column(name="NCES_AGENCY_TYPE_CD", length=8)
	private String ncesAgencyTypeCd;

	@Column(name="NCES_BUILDING_ID", length=8)
	private String ncesBuildingId;

	@Column(name="NCES_SCHOOL_DISTRICT_ID", precision=22)
	private BigDecimal ncesSchoolDistrictId;

	@Column(name="NCES_STATE_AGENCY_ID", length=14)
	private String ncesStateAgencyId;

	@Column(name="NEA_MEMB_BENEFIT_IND", length=1)
	private String neaMembBenefitInd;

	@Column(name="NEA_NATIONAL_OBLIG_PCT", precision=22)
	private BigDecimal neaNationalObligPct;

	@Column(name="NEA_RESEARCH_STATE_ID", length=2)
	private String neaResearchStateId;

	@Column(length=35)
	private String nickname;

	@Column(name="OPEN_LEGAL_CASES_IND", length=1)
	private String openLegalCasesInd;

	@Column(name="ORG_AVAILABLE_ROLE_ID", precision=22)
	private BigDecimal orgAvailableRoleId;

	@Column(name="ORG_NM_1", length=50)
	private String orgNm1;

	@Column(name="ORG_NM_2", length=30)
	private String orgNm2;

	@Column(name="OTHER_INS_TYPE_CD", length=10)
	private String otherInsTypeCd;

	@Column(name="PAC_EXISTENCE_IND", length=1)
	private String pacExistenceInd;

	@Column(name="PARENT_ORG_ID", length=10)
	private String parentOrgId;

	@Column(name="PAYROLL_DEDUCTION_CNT", precision=22)
	private BigDecimal payrollDeductionCnt;

	@Column(name="PAYROLL_SLOT_CNT", precision=22)
	private BigDecimal payrollSlotCnt;

	@Column(name="PHYS_CHALLENGED_IND", length=1)
	private String physChallengedInd;

	@Column(name="POL_PARTY_CD", length=10)
	private String polPartyCd;

	@Column(name="POT_DUP_IND", length=1)
	private String potDupInd;

	@Column(name="PREFIX_CD", length=5)
	private String prefixCd;

	@Column(name="PRIMARY_FIRM_IND", length=10)
	private String primaryFirmInd;

	@Column(name="PRINCIPAL_ADDR_ID", precision=22)
	private BigDecimal principalAddrId;

	@Column(name="PRINCIPAL_CONTACT_ID", length=10)
	private String principalContactId;

	@Column(name="PRINCIPAL_SUBGROUP_ID", length=10)
	private String principalSubgroupId;

	@Column(name="PURGE_IND", length=1)
	private String purgeInd;

	@Column(name="RACE_CD", length=5)
	private String raceCd;

	@Column(name="REACTIVATE_RSN_CD", length=10)
	private String reactivateRsnCd;

	@Column(name="RECORD_TYPE", length=5)
	private String recordType;

	@Column(name="REGISTERED_VOTER_IND", length=1)
	private String registeredVoterInd;

	@Temporal(TemporalType.DATE)
	@Column(name="REINSTATION_DT")
	private Date reinstationDt;

	@Column(name="REPORT_NM", length=50)
	private String reportNm;

	@Column(name="RETAINED_CUSTOMER_ID", length=10)
	private String retainedCustomerId;

	@Column(precision=5)
	private BigDecimal rowversion;

	@Column(length=30)
	private String salutation;

	@Column(name="SCHOOL_DISTRICT_LONG_TXT", length=30)
	private String schoolDistrictLongTxt;

	@Column(name="SOCIAL_SECURITY_NO", length=11)
	private String socialSecurityNo;

	@Column(name="SPONSOR_ID", length=10)
	private String sponsorId;

	@Column(name="SSN_CHECK_DIGIT", length=1)
	private String ssnCheckDigit;

	@Column(name="SSN_IND", length=1)
	private String ssnInd;

	@Column(name="SSN_OPTION", length=4)
	private String ssnOption;

	@Column(length=4)
	private String ssn4;

	@Temporal(TemporalType.DATE)
	@Column(name="START_DT")
	private Date startDt;

	@Column(name="STATE_AFF_NUM", precision=2)
	private BigDecimal stateAffNum;

	@Column(name="STATE_ID", length=5)
	private String stateId;

	@Column(name="STATE_INT_ORG_ID", length=10)
	private String stateIntOrgId;

	@Temporal(TemporalType.DATE)
	@Column(name="STATE_NEA_AFT_MERGE_DT")
	private Date stateNeaAftMergeDt;

	@Column(name="STATEWIDE_LCL_IND", length=1)
	private String statewideLclInd;

	@Column(name="STATUS_CD", nullable=false, length=8)
	private String statusCd;

	@Temporal(TemporalType.DATE)
	@Column(name="STATUS_DT", nullable=false)
	private Date statusDt;

	@Column(name="SUB_RECORD_TYPE", length=6)
	private String subRecordType;

	@Column(name="SUFFIX_CD", length=10)
	private String suffixCd;

	@Column(name="TAX_EXEMPT_FLG", length=1)
	private String taxExemptFlg;

	@Column(name="TAX_EXEMPT_ID", length=18)
	private String taxExemptId;

	@Temporal(TemporalType.DATE)
	@Column(name="TERMINATION_DT")
	private Date terminationDt;

	@Column(name="TERMINATION_REASON_CD", length=5)
	private String terminationReasonCd;

	@Column(length=30)
	private String title;

	@Column(name="TITLE_CD", length=5)
	private String titleCd;

	@Column(name="TYPE_CD", length=5)
	private String typeCd;

	@Column(name="UNI_OBLIG_STRUCTURE_CD", length=10)
	private String uniObligStructureCd;

	@Column(name="UNISERV_INT_ORG_ID", length=10)
	private String uniservIntOrgId;

	@Column(name="UNIT_COUNT", precision=22)
	private BigDecimal unitCount;

	@Column(name="UPDATED_BY", length=8)
	private String updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_DT")
	private Date updatedDt;

	@Column(name="USE_ALT_ADDRESS_IND", length=1)
	private String useAltAddressInd;

	@Column(name="USER_IDENTIFIER_ID", length=30)
	private String userIdentifierId;

	@Column(name="USER_STATE_AFF_ID", length=10)
	private String userStateAffId;

	@Temporal(TemporalType.DATE)
	@Column(name="VOTER_REG_DT")
	private Date voterRegDt;

	@Column(name="VOTER_TYPE_CD", length=8)
	private String voterTypeCd;

	@Column(name="WL_GENERIC_ASSN_REP_IND", length=1)
	private String wlGenericAssnRepInd;

	@Column(name="YRS_EXP_NUM", precision=22)
	private BigDecimal yrsExpNum;

	public CustomerMaster() {
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getAbbrevNm() {
		return this.abbrevNm;
	}

	public void setAbbrevNm(String abbrevNm) {
		this.abbrevNm = abbrevNm;
	}

	public String getAcctCompany() {
		return this.acctCompany;
	}

	public void setAcctCompany(String acctCompany) {
		this.acctCompany = acctCompany;
	}

	public String getAftAffInd() {
		return this.aftAffInd;
	}

	public void setAftAffInd(String aftAffInd) {
		this.aftAffInd = aftAffInd;
	}

	public BigDecimal getAftNationalObligPct() {
		return this.aftNationalObligPct;
	}

	public void setAftNationalObligPct(BigDecimal aftNationalObligPct) {
		this.aftNationalObligPct = aftNationalObligPct;
	}

	public String getAgencyShopInd() {
		return this.agencyShopInd;
	}

	public void setAgencyShopInd(String agencyShopInd) {
		this.agencyShopInd = agencyShopInd;
	}

	public String getAltId() {
		return this.altId;
	}

	public void setAltId(String altId) {
		this.altId = altId;
	}

	public String getAltIdCheckDigit() {
		return this.altIdCheckDigit;
	}

	public void setAltIdCheckDigit(String altIdCheckDigit) {
		this.altIdCheckDigit = altIdCheckDigit;
	}

	public String getAltKeyColumn() {
		return this.altKeyColumn;
	}

	public void setAltKeyColumn(String altKeyColumn) {
		this.altKeyColumn = altKeyColumn;
	}

	public BigDecimal getAnnualElectionMth() {
		return this.annualElectionMth;
	}

	public void setAnnualElectionMth(BigDecimal annualElectionMth) {
		this.annualElectionMth = annualElectionMth;
	}

	public Date getAnnualMeetingDt() {
		return this.annualMeetingDt;
	}

	public void setAnnualMeetingDt(Date annualMeetingDt) {
		this.annualMeetingDt = annualMeetingDt;
	}

	public String getAnnualMeetingTxt() {
		return this.annualMeetingTxt;
	}

	public void setAnnualMeetingTxt(String annualMeetingTxt) {
		this.annualMeetingTxt = annualMeetingTxt;
	}

	public BigDecimal getBankProfileId() {
		return this.bankProfileId;
	}

	public void setBankProfileId(BigDecimal bankProfileId) {
		this.bankProfileId = bankProfileId;
	}

	public String getBargainingMinorityLocalInd() {
		return this.bargainingMinorityLocalInd;
	}

	public void setBargainingMinorityLocalInd(String bargainingMinorityLocalInd) {
		this.bargainingMinorityLocalInd = bargainingMinorityLocalInd;
	}

	public String getBargainingOptAllowedInd() {
		return this.bargainingOptAllowedInd;
	}

	public void setBargainingOptAllowedInd(String bargainingOptAllowedInd) {
		this.bargainingOptAllowedInd = bargainingOptAllowedInd;
	}

	public String getBargainingOptExercisedInd() {
		return this.bargainingOptExercisedInd;
	}

	public void setBargainingOptExercisedInd(String bargainingOptExercisedInd) {
		this.bargainingOptExercisedInd = bargainingOptExercisedInd;
	}

	public String getBargainingProhibitedInd() {
		return this.bargainingProhibitedInd;
	}

	public void setBargainingProhibitedInd(String bargainingProhibitedInd) {
		this.bargainingProhibitedInd = bargainingProhibitedInd;
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

	public String getBillClass() {
		return this.billClass;
	}

	public void setBillClass(String billClass) {
		this.billClass = billClass;
	}

	public Date getBirthDt() {
		return this.birthDt;
	}

	public void setBirthDt(Date birthDt) {
		this.birthDt = birthDt;
	}

	public String getBirthDtInd() {
		return this.birthDtInd;
	}

	public void setBirthDtInd(String birthDtInd) {
		this.birthDtInd = birthDtInd;
	}

	public String getBirthYr() {
		return this.birthYr;
	}

	public void setBirthYr(String birthYr) {
		this.birthYr = birthYr;
	}

	public String getCertification() {
		return this.certification;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}

	public String getCharterApplicationToCd() {
		return this.charterApplicationToCd;
	}

	public void setCharterApplicationToCd(String charterApplicationToCd) {
		this.charterApplicationToCd = charterApplicationToCd;
	}

	public String getCharterApplnRecpntNm() {
		return this.charterApplnRecpntNm;
	}

	public void setCharterApplnRecpntNm(String charterApplnRecpntNm) {
		this.charterApplnRecpntNm = charterApplnRecpntNm;
	}

	public String getCharterApprovedByCd() {
		return this.charterApprovedByCd;
	}

	public void setCharterApprovedByCd(String charterApprovedByCd) {
		this.charterApprovedByCd = charterApprovedByCd;
	}

	public String getCharterApprvByNm() {
		return this.charterApprvByNm;
	}

	public void setCharterApprvByNm(String charterApprvByNm) {
		this.charterApprvByNm = charterApprvByNm;
	}

	public String getCharterByTypeCd() {
		return this.charterByTypeCd;
	}

	public void setCharterByTypeCd(String charterByTypeCd) {
		this.charterByTypeCd = charterByTypeCd;
	}

	public Date getCharterDt() {
		return this.charterDt;
	}

	public void setCharterDt(Date charterDt) {
		this.charterDt = charterDt;
	}

	public String getCharterSponsorName() {
		return this.charterSponsorName;
	}

	public void setCharterSponsorName(String charterSponsorName) {
		this.charterSponsorName = charterSponsorName;
	}

	public String getCharterSponsorType() {
		return this.charterSponsorType;
	}

	public void setCharterSponsorType(String charterSponsorType) {
		this.charterSponsorType = charterSponsorType;
	}

	public String getCollectDuesChapterInd() {
		return this.collectDuesChapterInd;
	}

	public void setCollectDuesChapterInd(String collectDuesChapterInd) {
		this.collectDuesChapterInd = collectDuesChapterInd;
	}

	public String getCompSchoolDistrictId() {
		return this.compSchoolDistrictId;
	}

	public void setCompSchoolDistrictId(String compSchoolDistrictId) {
		this.compSchoolDistrictId = compSchoolDistrictId;
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

	public BigDecimal getCreditLimit() {
		return this.creditLimit;
	}

	public void setCreditLimit(BigDecimal creditLimit) {
		this.creditLimit = creditLimit;
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

	public Date getCurrAftEndDt() {
		return this.currAftEndDt;
	}

	public void setCurrAftEndDt(Date currAftEndDt) {
		this.currAftEndDt = currAftEndDt;
	}

	public Date getCurrAftStartDt() {
		return this.currAftStartDt;
	}

	public void setCurrAftStartDt(Date currAftStartDt) {
		this.currAftStartDt = currAftStartDt;
	}

	public String getCurrNeaMshpInd() {
		return this.currNeaMshpInd;
	}

	public void setCurrNeaMshpInd(String currNeaMshpInd) {
		this.currNeaMshpInd = currNeaMshpInd;
	}

	public String getCustomerStatusCd() {
		return this.customerStatusCd;
	}

	public void setCustomerStatusCd(String customerStatusCd) {
		this.customerStatusCd = customerStatusCd;
	}

	public String getCustomerType() {
		return this.customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getDeathInd() {
		return this.deathInd;
	}

	public void setDeathInd(String deathInd) {
		this.deathInd = deathInd;
	}

	public String getDeathNotcInd() {
		return this.deathNotcInd;
	}

	public void setDeathNotcInd(String deathNotcInd) {
		this.deathNotcInd = deathNotcInd;
	}

	public String getEmpLocale() {
		return this.empLocale;
	}

	public void setEmpLocale(String empLocale) {
		this.empLocale = empLocale;
	}

	public String getEmplrAssgnCd() {
		return this.emplrAssgnCd;
	}

	public void setEmplrAssgnCd(String emplrAssgnCd) {
		this.emplrAssgnCd = emplrAssgnCd;
	}

	public String getEmplrAssgnRelationshipCd() {
		return this.emplrAssgnRelationshipCd;
	}

	public void setEmplrAssgnRelationshipCd(String emplrAssgnRelationshipCd) {
		this.emplrAssgnRelationshipCd = emplrAssgnRelationshipCd;
	}

	public String getEmplrOrgTypeCd() {
		return this.emplrOrgTypeCd;
	}

	public void setEmplrOrgTypeCd(String emplrOrgTypeCd) {
		this.emplrOrgTypeCd = emplrOrgTypeCd;
	}

	public String getEmplrTypeGovernanceCd() {
		return this.emplrTypeGovernanceCd;
	}

	public void setEmplrTypeGovernanceCd(String emplrTypeGovernanceCd) {
		this.emplrTypeGovernanceCd = emplrTypeGovernanceCd;
	}

	public String getEndRsn() {
		return this.endRsn;
	}

	public void setEndRsn(String endRsn) {
		this.endRsn = endRsn;
	}

	public String getEndRsnCd() {
		return this.endRsnCd;
	}

	public void setEndRsnCd(String endRsnCd) {
		this.endRsnCd = endRsnCd;
	}

	public String getEndRsnTxt() {
		return this.endRsnTxt;
	}

	public void setEndRsnTxt(String endRsnTxt) {
		this.endRsnTxt = endRsnTxt;
	}

	public Date getExpirationDt() {
		return this.expirationDt;
	}

	public void setExpirationDt(Date expirationDt) {
		this.expirationDt = expirationDt;
	}

	public String getExtFrequentVoterInd() {
		return this.extFrequentVoterInd;
	}

	public void setExtFrequentVoterInd(String extFrequentVoterInd) {
		this.extFrequentVoterInd = extFrequentVoterInd;
	}

	public String getFirstNm() {
		return this.firstNm;
	}

	public void setFirstNm(String firstNm) {
		this.firstNm = firstNm;
	}

	public String getGenLvlCd() {
		return this.genLvlCd;
	}

	public void setGenLvlCd(String genLvlCd) {
		this.genLvlCd = genLvlCd;
	}

	public String getGenderCd() {
		return this.genderCd;
	}

	public void setGenderCd(String genderCd) {
		this.genderCd = genderCd;
	}

	public Date getGraduationDt() {
		return this.graduationDt;
	}

	public void setGraduationDt(Date graduationDt) {
		this.graduationDt = graduationDt;
	}

	public String getHighestDegCd() {
		return this.highestDegCd;
	}

	public void setHighestDegCd(String highestDegCd) {
		this.highestDegCd = highestDegCd;
	}

	public String getHoldMailFlg() {
		return this.holdMailFlg;
	}

	public void setHoldMailFlg(String holdMailFlg) {
		this.holdMailFlg = holdMailFlg;
	}

	public String getIncludeInPortalInd() {
		return this.includeInPortalInd;
	}

	public void setIncludeInPortalInd(String includeInPortalInd) {
		this.includeInPortalInd = includeInPortalInd;
	}

	public String getIndustryType() {
		return this.industryType;
	}

	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}

	public String getIndvCheckDigit() {
		return this.indvCheckDigit;
	}

	public void setIndvCheckDigit(String indvCheckDigit) {
		this.indvCheckDigit = indvCheckDigit;
	}

	public String getIndvOrignCd() {
		return this.indvOrignCd;
	}

	public void setIndvOrignCd(String indvOrignCd) {
		this.indvOrignCd = indvOrignCd;
	}

	public String getIndvOrignRsnCd() {
		return this.indvOrignRsnCd;
	}

	public void setIndvOrignRsnCd(String indvOrignRsnCd) {
		this.indvOrignRsnCd = indvOrignRsnCd;
	}

	public String getIpedHigherEduId() {
		return this.ipedHigherEduId;
	}

	public void setIpedHigherEduId(String ipedHigherEduId) {
		this.ipedHigherEduId = ipedHigherEduId;
	}

	public String getJobDescCd() {
		return this.jobDescCd;
	}

	public void setJobDescCd(String jobDescCd) {
		this.jobDescCd = jobDescCd;
	}

	public Date getJoinDt() {
		return this.joinDt;
	}

	public void setJoinDt(Date joinDt) {
		this.joinDt = joinDt;
	}

	public String getLabelNm() {
		return this.labelNm;
	}

	public void setLabelNm(String labelNm) {
		this.labelNm = labelNm;
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

	public String getLastNm() {
		return this.lastNm;
	}

	public void setLastNm(String lastNm) {
		this.lastNm = lastNm;
	}

	public BigDecimal getLegalResidenceId() {
		return this.legalResidenceId;
	}

	public void setLegalResidenceId(BigDecimal legalResidenceId) {
		this.legalResidenceId = legalResidenceId;
	}

	public String getLocalIntOrgId() {
		return this.localIntOrgId;
	}

	public void setLocalIntOrgId(String localIntOrgId) {
		this.localIntOrgId = localIntOrgId;
	}

	public String getLocalOrignCd() {
		return this.localOrignCd;
	}

	public void setLocalOrignCd(String localOrignCd) {
		this.localOrignCd = localOrignCd;
	}

	public BigDecimal getLvlId() {
		return this.lvlId;
	}

	public void setLvlId(BigDecimal lvlId) {
		this.lvlId = lvlId;
	}

	public String getMaritalStatusCd() {
		return this.maritalStatusCd;
	}

	public void setMaritalStatusCd(String maritalStatusCd) {
		this.maritalStatusCd = maritalStatusCd;
	}

	public Date getMaterialsProcessedDt() {
		return this.materialsProcessedDt;
	}

	public void setMaterialsProcessedDt(Date materialsProcessedDt) {
		this.materialsProcessedDt = materialsProcessedDt;
	}

	public Date getMaterialsReceivedDt() {
		return this.materialsReceivedDt;
	}

	public void setMaterialsReceivedDt(Date materialsReceivedDt) {
		this.materialsReceivedDt = materialsReceivedDt;
	}

	public String getMbcMktgAgrmtInd() {
		return this.mbcMktgAgrmtInd;
	}

	public void setMbcMktgAgrmtInd(String mbcMktgAgrmtInd) {
		this.mbcMktgAgrmtInd = mbcMktgAgrmtInd;
	}

	public BigDecimal getMembStartMth() {
		return this.membStartMth;
	}

	public void setMembStartMth(BigDecimal membStartMth) {
		this.membStartMth = membStartMth;
	}

	public String getMembStatusCd() {
		return this.membStatusCd;
	}

	public void setMembStatusCd(String membStatusCd) {
		this.membStatusCd = membStatusCd;
	}

	public String getMembType() {
		return this.membType;
	}

	public void setMembType(String membType) {
		this.membType = membType;
	}

	public String getMembYrType() {
		return this.membYrType;
	}

	public void setMembYrType(String membYrType) {
		this.membYrType = membYrType;
	}

	public String getMiddleNm() {
		return this.middleNm;
	}

	public void setMiddleNm(String middleNm) {
		this.middleNm = middleNm;
	}

	public String getNameUppercase() {
		return this.nameUppercase;
	}

	public void setNameUppercase(String nameUppercase) {
		this.nameUppercase = nameUppercase;
	}

	public String getNcesAgencyTypeCd() {
		return this.ncesAgencyTypeCd;
	}

	public void setNcesAgencyTypeCd(String ncesAgencyTypeCd) {
		this.ncesAgencyTypeCd = ncesAgencyTypeCd;
	}

	public String getNcesBuildingId() {
		return this.ncesBuildingId;
	}

	public void setNcesBuildingId(String ncesBuildingId) {
		this.ncesBuildingId = ncesBuildingId;
	}

	public BigDecimal getNcesSchoolDistrictId() {
		return this.ncesSchoolDistrictId;
	}

	public void setNcesSchoolDistrictId(BigDecimal ncesSchoolDistrictId) {
		this.ncesSchoolDistrictId = ncesSchoolDistrictId;
	}

	public String getNcesStateAgencyId() {
		return this.ncesStateAgencyId;
	}

	public void setNcesStateAgencyId(String ncesStateAgencyId) {
		this.ncesStateAgencyId = ncesStateAgencyId;
	}

	public String getNeaMembBenefitInd() {
		return this.neaMembBenefitInd;
	}

	public void setNeaMembBenefitInd(String neaMembBenefitInd) {
		this.neaMembBenefitInd = neaMembBenefitInd;
	}

	public BigDecimal getNeaNationalObligPct() {
		return this.neaNationalObligPct;
	}

	public void setNeaNationalObligPct(BigDecimal neaNationalObligPct) {
		this.neaNationalObligPct = neaNationalObligPct;
	}

	public String getNeaResearchStateId() {
		return this.neaResearchStateId;
	}

	public void setNeaResearchStateId(String neaResearchStateId) {
		this.neaResearchStateId = neaResearchStateId;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getOpenLegalCasesInd() {
		return this.openLegalCasesInd;
	}

	public void setOpenLegalCasesInd(String openLegalCasesInd) {
		this.openLegalCasesInd = openLegalCasesInd;
	}

	public BigDecimal getOrgAvailableRoleId() {
		return this.orgAvailableRoleId;
	}

	public void setOrgAvailableRoleId(BigDecimal orgAvailableRoleId) {
		this.orgAvailableRoleId = orgAvailableRoleId;
	}

	public String getOrgNm1() {
		return this.orgNm1;
	}

	public void setOrgNm1(String orgNm1) {
		this.orgNm1 = orgNm1;
	}

	public String getOrgNm2() {
		return this.orgNm2;
	}

	public void setOrgNm2(String orgNm2) {
		this.orgNm2 = orgNm2;
	}

	public String getOtherInsTypeCd() {
		return this.otherInsTypeCd;
	}

	public void setOtherInsTypeCd(String otherInsTypeCd) {
		this.otherInsTypeCd = otherInsTypeCd;
	}

	public String getPacExistenceInd() {
		return this.pacExistenceInd;
	}

	public void setPacExistenceInd(String pacExistenceInd) {
		this.pacExistenceInd = pacExistenceInd;
	}

	public String getParentOrgId() {
		return this.parentOrgId;
	}

	public void setParentOrgId(String parentOrgId) {
		this.parentOrgId = parentOrgId;
	}

	public BigDecimal getPayrollDeductionCnt() {
		return this.payrollDeductionCnt;
	}

	public void setPayrollDeductionCnt(BigDecimal payrollDeductionCnt) {
		this.payrollDeductionCnt = payrollDeductionCnt;
	}

	public BigDecimal getPayrollSlotCnt() {
		return this.payrollSlotCnt;
	}

	public void setPayrollSlotCnt(BigDecimal payrollSlotCnt) {
		this.payrollSlotCnt = payrollSlotCnt;
	}

	public String getPhysChallengedInd() {
		return this.physChallengedInd;
	}

	public void setPhysChallengedInd(String physChallengedInd) {
		this.physChallengedInd = physChallengedInd;
	}

	public String getPolPartyCd() {
		return this.polPartyCd;
	}

	public void setPolPartyCd(String polPartyCd) {
		this.polPartyCd = polPartyCd;
	}

	public String getPotDupInd() {
		return this.potDupInd;
	}

	public void setPotDupInd(String potDupInd) {
		this.potDupInd = potDupInd;
	}

	public String getPrefixCd() {
		return this.prefixCd;
	}

	public void setPrefixCd(String prefixCd) {
		this.prefixCd = prefixCd;
	}

	public String getPrimaryFirmInd() {
		return this.primaryFirmInd;
	}

	public void setPrimaryFirmInd(String primaryFirmInd) {
		this.primaryFirmInd = primaryFirmInd;
	}

	public BigDecimal getPrincipalAddrId() {
		return this.principalAddrId;
	}

	public void setPrincipalAddrId(BigDecimal principalAddrId) {
		this.principalAddrId = principalAddrId;
	}

	public String getPrincipalContactId() {
		return this.principalContactId;
	}

	public void setPrincipalContactId(String principalContactId) {
		this.principalContactId = principalContactId;
	}

	public String getPrincipalSubgroupId() {
		return this.principalSubgroupId;
	}

	public void setPrincipalSubgroupId(String principalSubgroupId) {
		this.principalSubgroupId = principalSubgroupId;
	}

	public String getPurgeInd() {
		return this.purgeInd;
	}

	public void setPurgeInd(String purgeInd) {
		this.purgeInd = purgeInd;
	}

	public String getRaceCd() {
		return this.raceCd;
	}

	public void setRaceCd(String raceCd) {
		this.raceCd = raceCd;
	}

	public String getReactivateRsnCd() {
		return this.reactivateRsnCd;
	}

	public void setReactivateRsnCd(String reactivateRsnCd) {
		this.reactivateRsnCd = reactivateRsnCd;
	}

	public String getRecordType() {
		return this.recordType;
	}

	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}

	public String getRegisteredVoterInd() {
		return this.registeredVoterInd;
	}

	public void setRegisteredVoterInd(String registeredVoterInd) {
		this.registeredVoterInd = registeredVoterInd;
	}

	public Date getReinstationDt() {
		return this.reinstationDt;
	}

	public void setReinstationDt(Date reinstationDt) {
		this.reinstationDt = reinstationDt;
	}

	public String getReportNm() {
		return this.reportNm;
	}

	public void setReportNm(String reportNm) {
		this.reportNm = reportNm;
	}

	public String getRetainedCustomerId() {
		return this.retainedCustomerId;
	}

	public void setRetainedCustomerId(String retainedCustomerId) {
		this.retainedCustomerId = retainedCustomerId;
	}

	public BigDecimal getRowversion() {
		return this.rowversion;
	}

	public void setRowversion(BigDecimal rowversion) {
		this.rowversion = rowversion;
	}

	public String getSalutation() {
		return this.salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public String getSchoolDistrictLongTxt() {
		return this.schoolDistrictLongTxt;
	}

	public void setSchoolDistrictLongTxt(String schoolDistrictLongTxt) {
		this.schoolDistrictLongTxt = schoolDistrictLongTxt;
	}

	public String getSocialSecurityNo() {
		return this.socialSecurityNo;
	}

	public void setSocialSecurityNo(String socialSecurityNo) {
		this.socialSecurityNo = socialSecurityNo;
	}

	public String getSponsorId() {
		return this.sponsorId;
	}

	public void setSponsorId(String sponsorId) {
		this.sponsorId = sponsorId;
	}

	public String getSsnCheckDigit() {
		return this.ssnCheckDigit;
	}

	public void setSsnCheckDigit(String ssnCheckDigit) {
		this.ssnCheckDigit = ssnCheckDigit;
	}

	public String getSsnInd() {
		return this.ssnInd;
	}

	public void setSsnInd(String ssnInd) {
		this.ssnInd = ssnInd;
	}

	public String getSsnOption() {
		return this.ssnOption;
	}

	public void setSsnOption(String ssnOption) {
		this.ssnOption = ssnOption;
	}

	public String getSsn4() {
		return this.ssn4;
	}

	public void setSsn4(String ssn4) {
		this.ssn4 = ssn4;
	}

	public Date getStartDt() {
		return this.startDt;
	}

	public void setStartDt(Date startDt) {
		this.startDt = startDt;
	}

	public BigDecimal getStateAffNum() {
		return this.stateAffNum;
	}

	public void setStateAffNum(BigDecimal stateAffNum) {
		this.stateAffNum = stateAffNum;
	}

	public String getStateId() {
		return this.stateId;
	}

	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

	public String getStateIntOrgId() {
		return this.stateIntOrgId;
	}

	public void setStateIntOrgId(String stateIntOrgId) {
		this.stateIntOrgId = stateIntOrgId;
	}

	public Date getStateNeaAftMergeDt() {
		return this.stateNeaAftMergeDt;
	}

	public void setStateNeaAftMergeDt(Date stateNeaAftMergeDt) {
		this.stateNeaAftMergeDt = stateNeaAftMergeDt;
	}

	public String getStatewideLclInd() {
		return this.statewideLclInd;
	}

	public void setStatewideLclInd(String statewideLclInd) {
		this.statewideLclInd = statewideLclInd;
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

	public String getSubRecordType() {
		return this.subRecordType;
	}

	public void setSubRecordType(String subRecordType) {
		this.subRecordType = subRecordType;
	}

	public String getSuffixCd() {
		return this.suffixCd;
	}

	public void setSuffixCd(String suffixCd) {
		this.suffixCd = suffixCd;
	}

	public String getTaxExemptFlg() {
		return this.taxExemptFlg;
	}

	public void setTaxExemptFlg(String taxExemptFlg) {
		this.taxExemptFlg = taxExemptFlg;
	}

	public String getTaxExemptId() {
		return this.taxExemptId;
	}

	public void setTaxExemptId(String taxExemptId) {
		this.taxExemptId = taxExemptId;
	}

	public Date getTerminationDt() {
		return this.terminationDt;
	}

	public void setTerminationDt(Date terminationDt) {
		this.terminationDt = terminationDt;
	}

	public String getTerminationReasonCd() {
		return this.terminationReasonCd;
	}

	public void setTerminationReasonCd(String terminationReasonCd) {
		this.terminationReasonCd = terminationReasonCd;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitleCd() {
		return this.titleCd;
	}

	public void setTitleCd(String titleCd) {
		this.titleCd = titleCd;
	}

	public String getTypeCd() {
		return this.typeCd;
	}

	public void setTypeCd(String typeCd) {
		this.typeCd = typeCd;
	}

	public String getUniObligStructureCd() {
		return this.uniObligStructureCd;
	}

	public void setUniObligStructureCd(String uniObligStructureCd) {
		this.uniObligStructureCd = uniObligStructureCd;
	}

	public String getUniservIntOrgId() {
		return this.uniservIntOrgId;
	}

	public void setUniservIntOrgId(String uniservIntOrgId) {
		this.uniservIntOrgId = uniservIntOrgId;
	}

	public BigDecimal getUnitCount() {
		return this.unitCount;
	}

	public void setUnitCount(BigDecimal unitCount) {
		this.unitCount = unitCount;
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

	public String getUseAltAddressInd() {
		return this.useAltAddressInd;
	}

	public void setUseAltAddressInd(String useAltAddressInd) {
		this.useAltAddressInd = useAltAddressInd;
	}

	public String getUserIdentifierId() {
		return this.userIdentifierId;
	}

	public void setUserIdentifierId(String userIdentifierId) {
		this.userIdentifierId = userIdentifierId;
	}

	public String getUserStateAffId() {
		return this.userStateAffId;
	}

	public void setUserStateAffId(String userStateAffId) {
		this.userStateAffId = userStateAffId;
	}

	public Date getVoterRegDt() {
		return this.voterRegDt;
	}

	public void setVoterRegDt(Date voterRegDt) {
		this.voterRegDt = voterRegDt;
	}

	public String getVoterTypeCd() {
		return this.voterTypeCd;
	}

	public void setVoterTypeCd(String voterTypeCd) {
		this.voterTypeCd = voterTypeCd;
	}

	public String getWlGenericAssnRepInd() {
		return this.wlGenericAssnRepInd;
	}

	public void setWlGenericAssnRepInd(String wlGenericAssnRepInd) {
		this.wlGenericAssnRepInd = wlGenericAssnRepInd;
	}

	public BigDecimal getYrsExpNum() {
		return this.yrsExpNum;
	}

	public void setYrsExpNum(BigDecimal yrsExpNum) {
		this.yrsExpNum = yrsExpNum;
	}

}