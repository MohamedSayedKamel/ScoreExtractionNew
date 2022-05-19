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
	
	
	public LGDRequest() {
		
	}
	
}
