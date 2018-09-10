package com.isolver.codegenerator.codegen.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the COMM_VAL database table.
 * 
 */
@Entity
@Table(name="COMM_VAL")
@NamedQuery(name="CommVal.findAll", query="SELECT c FROM CommVal c")
public class CommVal implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CommValPK id;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DT")
	private Date createdDt;

	@Column(name="CUSTOMER_ID")
	private String customerId;

	@Column(name="DETAIL_DESCR")
	private String detailDescr;

	@Column(name="OPTION_1")
	private String option1;

	private BigDecimal rowversion;

	@Column(name="STATUS_CD")
	private String statusCd;

	@Temporal(TemporalType.DATE)
	@Column(name="STATUS_DT")
	private Date statusDt;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_DT")
	private Date updatedDt;

	@Column(name="VAL_CD_DESC")
	private String valCdDesc;

	@Column(name="VAL_FLAG")
	private String valFlag;

	public CommVal() {
	}

	public CommValPK getId() {
		return this.id;
	}

	public void setId(CommValPK id) {
		this.id = id;
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

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getDetailDescr() {
		return this.detailDescr;
	}

	public void setDetailDescr(String detailDescr) {
		this.detailDescr = detailDescr;
	}

	public String getOption1() {
		return this.option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public BigDecimal getRowversion() {
		return this.rowversion;
	}

	public void setRowversion(BigDecimal rowversion) {
		this.rowversion = rowversion;
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

	public String getValCdDesc() {
		return this.valCdDesc;
	}

	public void setValCdDesc(String valCdDesc) {
		this.valCdDesc = valCdDesc;
	}

	public String getValFlag() {
		return this.valFlag;
	}

	public void setValFlag(String valFlag) {
		this.valFlag = valFlag;
	}

}