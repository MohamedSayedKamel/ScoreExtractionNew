package com.alrajhi.score.ScoreExtraction.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
/**
 * The persistent class for the LGD_REQUEST database table.
 * 
 */
@Data
@Entity
@Table(name="LGD_REQUEST")
@NamedQuery(name="LGDRequest.findAll", query="SELECT request FROM LGDRequest request")

public class LGDRequest implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="LGD_REQUEST_REQUESTID_GENERATOR", sequenceName="LGD_REQUEST_ID_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LGD_REQUEST_REQUESTID_GENERATOR")
	@Column(name="REQUEST_ID")
	private long requestId;

	@Column(name="RUN_ID")
	private BigDecimal runId;
	@Column(name="CIC")
	private BigDecimal cic;
	@Column(name="PROCESS_STATUS")
	private String processStatus;
	@Column(name="CONT_CONTRACT_NUMBER")
	private String contractNumber;
	@Column(name="CONT_BALLOON_PAYMENT")
	private BigDecimal balloonPayment;
	@Column(name="CONT_DOWN_PAYMENT")
	private BigDecimal downPayment;
	@Column(name="CONT_OPEN_DATE")
	private Date openDate;
	@Column(name="CONT_DISBURSEMENT_AMOUNT")
	private BigDecimal disbursementAmount;
	@Column(name="CONT_PRINCIPAL_OUTSTANDING")
	private BigDecimal principalOutstanding;
	@Column(name="CONT_DURATION_OF_CONTARCT")
	private BigDecimal durationOfContract;
	@Column(name="CONT_PRICE_AT_ORIGINATION")
	private BigDecimal priceAtOrigination;
	@Column(name="CONT_DURATION_MONTHS")
	private BigDecimal durationMonths;
	@Column(name="CASHFLOW_DATE")
	private Date cashflowDate;
	@Column(name="PRODUCT_CODE")
	private String productCode;
	@Column(name="SALARY_TRANSFER_TYPE")
	private String salaryTransferType;
	@Column(name="MILITARY_RANK")
	private BigDecimal militaryRank;
	@Column(name="CAR_MAKE_YEAR")
	private BigDecimal carMakeYear;
	@Column(name="PROPERTY_VALUE_ACQUISITION")
	private BigDecimal propertyValueAcquisition;
	@Column(name="NEW")
	private String _new;
	@Column(name="CONT_ACCOUNT_ID")
	private String contAccountId;
	
	@Column(name="SPARE_SPARE_01")
	private String spareSpare01;

	@Column(name="SPARE_SPARE_02")
	private String spareSpare02;

	@Column(name="SPARE_SPARE_03")
	private String spareSpare03;

	@Column(name="SPARE_SPARE_04")
	private String spareSpare04;

	@Column(name="SPARE_SPARE_05")
	private String spareSpare05;

	@Column(name="SPARE_SPARE_06")
	private String spareSpare06;

	@Column(name="SPARE_SPARE_07")
	private String spareSpare07;

	@Column(name="SPARE_SPARE_08")
	private String spareSpare08;

	@Column(name="SPARE_SPARE_09")
	private String spareSpare09;

	@Column(name="SPARE_SPARE_10")
	private String spareSpare10;

	@Column(name="SPARE_SPARE_11")
	private String spareSpare11;

	@Column(name="SPARE_SPARE_12")
	private String spareSpare12;

	@Column(name="SPARE_SPARE_13")
	private String spareSpare13;

	@Column(name="SPARE_SPARE_14")
	private String spareSpare14;

	@Column(name="SPARE_SPARE_15")
	private String spareSpare15;

	@Column(name="SPARE_SPARE_16")
	private String spareSpare16;

	@Column(name="SPARE_SPARE_17")
	private String spareSpare17;

	@Column(name="SPARE_SPARE_18")
	private String spareSpare18;

	@Column(name="SPARE_SPARE_19")
	private String spareSpare19;

	@Column(name="SPARE_SPARE_20")
	private String spareSpare20;

	@Column(name="SPARE_SPARE_21")
	private String spareSpare21;

	@Column(name="SPARE_SPARE_22")
	private String spareSpare22;

	@Column(name="SPARE_SPARE_23")
	private String spareSpare23;

	@Column(name="SPARE_SPARE_24")
	private String spareSpare24;

	@Column(name="SPARE_SPARE_25")
	private String spareSpare25;

	@Column(name="SPARE_SPARE_26")
	private String spareSpare26;

	@Column(name="SPARE_SPARE_27")
	private String spareSpare27;

	@Column(name="SPARE_SPARE_28")
	private String spareSpare28;

	@Column(name="SPARE_SPARE_29")
	private String spareSpare29;

	@Column(name="SPARE_SPARE_30")
	private String spareSpare30;

	@Column(name="SPARE_SPARE_31")
	private String spareSpare31;

	@Column(name="SPARE_SPARE_32")
	private String spareSpare32;

	@Column(name="SPARE_SPARE_33")
	private String spareSpare33;

	@Column(name="SPARE_SPARE_34")
	private String spareSpare34;

	@Column(name="SPARE_SPARE_35")
	private String spareSpare35;

	@Column(name="SPARE_SPARE_36")
	private String spareSpare36;

	@Column(name="SPARE_SPARE_37")
	private String spareSpare37;

	@Column(name="SPARE_SPARE_38")
	private String spareSpare38;

	@Column(name="SPARE_SPARE_39")
	private String spareSpare39;

	@Column(name="SPARE_SPARE_40")
	private String spareSpare40;

	@Column(name="SPARE_SPARE_41")
	private String spareSpare41;

	@Column(name="SPARE_SPARE_42")
	private String spareSpare42;

	@Column(name="SPARE_SPARE_43")
	private String spareSpare43;

	@Column(name="SPARE_SPARE_44")
	private String spareSpare44;

	@Column(name="SPARE_SPARE_45")
	private String spareSpare45;

	@Column(name="SPARE_SPARE_46")
	private String spareSpare46;

	@Column(name="SPARE_SPARE_47")
	private String spareSpare47;

	@Column(name="SPARE_SPARE_48")
	private String spareSpare48;

	@Column(name="SPARE_SPARE_49")
	private String spareSpare49;

	@Column(name="SPARE_SPARE_50")
	private String spareSpare50;
	
	
	public LGDRequest() {
		
	}
	
}
