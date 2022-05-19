package com.alrajhi.score.ScoreExtraction.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the APP_PARAM database table.
 * 
 */
@Entity
@Table(name="APP_PARAM")
@NamedQuery(name="AppParam.findAll", query="SELECT a FROM AppParam a")
public class AppParam implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PARAM_CODE")
	private String paramCode;

	@Column(name="ATTRIBUTE_VALUE_C1")
	private String attributeValueC1;

	@Column(name="ATTRIBUTE_VALUE_C2")
	private String attributeValueC2;

	@Column(name="ATTRIBUTE_VALUE_C3")
	private String attributeValueC3;

	@Column(name="ATTRIBUTE_VALUE_C4")
	private String attributeValueC4;

	@Column(name="ATTRIBUTE_VALUE_C5")
	private String attributeValueC5;

	@Temporal(TemporalType.DATE)
	@Column(name="ATTRIBUTE_VALUE_D1")
	private Date attributeValueD1;

	@Temporal(TemporalType.DATE)
	@Column(name="ATTRIBUTE_VALUE_D2")
	private Date attributeValueD2;

	@Column(name="ATTRIBUTE_VALUE_N1")
	private BigDecimal attributeValueN1;

	@Column(name="ATTRIBUTE_VALUE_N2")
	private BigDecimal attributeValueN2;

	@Column(name="ATTRIBUTE_VALUE_N3")
	private BigDecimal attributeValueN3;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_UPDATE_DATE")
	private Date lastUpdateDate;

	@Column(name="LAST_UPDATE_USER")
	private String lastUpdateUser;

	@Column(name="PARAM_DESC")
	private String paramDesc;

	public AppParam() {
	}

	public String getParamCode() {
		return this.paramCode;
	}

	public void setParamCode(String paramCode) {
		this.paramCode = paramCode;
	}

	public String getAttributeValueC1() {
		return this.attributeValueC1;
	}

	public void setAttributeValueC1(String attributeValueC1) {
		this.attributeValueC1 = attributeValueC1;
	}

	public String getAttributeValueC2() {
		return this.attributeValueC2;
	}

	public void setAttributeValueC2(String attributeValueC2) {
		this.attributeValueC2 = attributeValueC2;
	}

	public String getAttributeValueC3() {
		return this.attributeValueC3;
	}

	public void setAttributeValueC3(String attributeValueC3) {
		this.attributeValueC3 = attributeValueC3;
	}

	public String getAttributeValueC4() {
		return this.attributeValueC4;
	}

	public void setAttributeValueC4(String attributeValueC4) {
		this.attributeValueC4 = attributeValueC4;
	}

	public String getAttributeValueC5() {
		return this.attributeValueC5;
	}

	public void setAttributeValueC5(String attributeValueC5) {
		this.attributeValueC5 = attributeValueC5;
	}

	public Date getAttributeValueD1() {
		return this.attributeValueD1;
	}

	public void setAttributeValueD1(Date attributeValueD1) {
		this.attributeValueD1 = attributeValueD1;
	}

	public Date getAttributeValueD2() {
		return this.attributeValueD2;
	}

	public void setAttributeValueD2(Date attributeValueD2) {
		this.attributeValueD2 = attributeValueD2;
	}

	public BigDecimal getAttributeValueN1() {
		return this.attributeValueN1;
	}

	public void setAttributeValueN1(BigDecimal attributeValueN1) {
		this.attributeValueN1 = attributeValueN1;
	}

	public BigDecimal getAttributeValueN2() {
		return this.attributeValueN2;
	}

	public void setAttributeValueN2(BigDecimal attributeValueN2) {
		this.attributeValueN2 = attributeValueN2;
	}

	public BigDecimal getAttributeValueN3() {
		return this.attributeValueN3;
	}

	public void setAttributeValueN3(BigDecimal attributeValueN3) {
		this.attributeValueN3 = attributeValueN3;
	}

	public Date getLastUpdateDate() {
		return this.lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public String getLastUpdateUser() {
		return this.lastUpdateUser;
	}

	public void setLastUpdateUser(String lastUpdateUser) {
		this.lastUpdateUser = lastUpdateUser;
	}

	public String getParamDesc() {
		return this.paramDesc;
	}

	public void setParamDesc(String paramDesc) {
		this.paramDesc = paramDesc;
	}

}