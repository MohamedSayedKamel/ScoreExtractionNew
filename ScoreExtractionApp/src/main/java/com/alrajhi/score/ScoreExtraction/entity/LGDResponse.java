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
 * The persistent class for the LGD_RESPONSE database table.
 * 
 */


@Data
@Entity
@Table(name="LGD_RESPONSE")
@NamedQuery(name="LGDResponse.findAll", query="SELECT response FROM LGDResponse response")
public class LGDResponse implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name="LGD_RESPONSE_RESPONSEID_GENERATOR", sequenceName="LGD_RESPONSE_ID_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LGD_RESPONSE_RESPONSEID_GENERATOR")
	@Column(name="RESPONSE_ID")
	private long responseId;
	
	@Column(name="REQUEST_ID")
	private BigDecimal requestId;
	@Column(name="RUN_ID")
	private BigDecimal runId;
	@Column(name="YEAR")
	private BigDecimal year;
	@Column(name="MONTH")
	private BigDecimal month;
	@Column(name="PRODUCT_TYPE")
	private String productType;
	@Column(name="MODEL_ID")
	private BigDecimal modelId;
	@Column(name="MODEL_NAME")
	private String modelName;
	@Column(name="CASH_RECOVERY_SEGMENT")
	private BigDecimal cashRecoverySegment;
	@Column(name="CURE_RATE")
	private BigDecimal cureRate;
	@Column(name="NONCURED_LOSS")
	private BigDecimal noncuredLoss;
	@Column(name="CASH_RECOVERY")
	private BigDecimal cashRecovery; 
	@Column(name="COMBINED_EXPECTED_RECOVERY")
	private BigDecimal combinedExpectedRecovery;
	@Column(name="NONCURED_LOSS_STANDARD_DEVIATION")
	private BigDecimal noncuredLossStandardDeviation;
	@Column(name="EAD_PCNT")
	private BigDecimal eadPcnt;
	@Column(name="TERM_ELAPSED_DEF")
	private BigDecimal termElapsedDef;
	@Column(name="TERM_ELAPSED_DEF_PCNT")
	private BigDecimal termElapsedDefPcnt;
	@Column(name="CUR_VAL")
	private BigDecimal curVal;
	@Column(name="DEF_LTV")
	private BigDecimal defLtv;
	@Column(name="LGD_BASELINE")
	private BigDecimal lgdBaseline;
	@Column(name="IMPLIED_LGD")
	private BigDecimal impliedLgd;
	@Column(name="LGD_REC1")
	private BigDecimal lgdRec1;
	@Column(name="LGD_REC2")
	private BigDecimal lgdRec2;
	@Column(name="LGD_OPT1")
	private BigDecimal lgdOpt1;
	@Column(name="LGD_OPT2")
	private BigDecimal lgdOpt2;
	@Column(name="UNCONDICIONAL_LGD")
	private BigDecimal unicondicionalLgd;
	@Column(name="DEPLOYMENT_DATE")
	private String deploymentDate;
	@Column(name="DEPLOYMENT_VERSION")
	private String deploymentVersion;
	@Column(name="DEPLOYMENT_NOTES")
	private String deploymentNotes;
	@Column(name="EXECUTION_DATE_TIME")
	private Date executionDateTime;
	@Column(name="SCORECARD_VERSION_NUMBER")
	private String scorecardVersionNumber;
	@Column(name="SCORECARD_VERSION_DATE")
	private String scorecardVersionDate;
	@Column(name="A_SCORECARD_PRODUCT_FAMILY")
	private String aScorecardProductFamily;
	@Column(name="CAR_AGE_AT_AUCTION_IN_YEARS")
	private BigDecimal carAgeAtAuctionInYears;
	@Column(name="CAR_FAIR_VALUATION_AT_AUCTION")
	private BigDecimal carFairValuationAtAuction;
	@Column(name="CAR_POST_HAIRCUT_VALUATION_AT_AUCTION")
	private BigDecimal carPostHaircutValuationAtAuction;
	@Column(name="REALESTATE_POST_HAIRCUT_VALUATION_AT_AUCTION")
	private BigDecimal realstatePostHaircutValuationAtAuction;
	@Column(name="CAR_AGE_AT_DEFAULT")
	private BigDecimal carAgeAtDefault;
	@Column(name="EST_DEF_VEHICLE_IN_YEARS")
	private BigDecimal estDefVehicleInYear;
	@Column(name="REALESTATE_AVG_TIME_TO_REPO_IN_MONTHS")
	private BigDecimal realestateAvgTimeToRepoInMonths;
	@Column(name="CARLEASE_AVG_TIME_TO_REPO_IN_MONTHS")
	private BigDecimal carleaseAvgTimeToRepoInMonths;
	@Column(name="REALESTATE_AVG_TIME_TO_AUCTION_OR_SELL_POST_REPO_IN_MONTHS")
	private BigDecimal realestateAvgTimeToAuctionOrSellPostRepoInMonths;
	@Column(name="CARLEASE_AVG_TIME_TO_AUCTION_OR_SELL_POST_REPO_IN_MONTHS")
	private BigDecimal carleaseAvgTimeToAuctionOrSellPostRepoInMonths;
	@Column(name="DEPRICIATION_FACTOR")
	private BigDecimal depriciationFactor;
	@Column(name="PROB_OF_AUCTION")
	private BigDecimal probOfAuction;
	@Column(name="CARLEASE_DISCOUNT_RATE")
	private BigDecimal carleaseDiscountRate;
	@Column(name="REALESTATE_DISCOUNT_RATE")
	private BigDecimal realestateDiscountRate;
	@Column(name="HAIRCUT_STANDARD_DEVIATION")
	private BigDecimal haircutStandardDeviation;
	@Column(name="COLLATERAL_VALUATION_GROWTH")
	private BigDecimal collateralValuationGrowth;
	@Column(name="AVG_TIME_ON_BOOK_IN_MONTHS")
	private BigDecimal avgTimeOnBookInMonths;
	@Column(name="AVG_TIME_TO_RECOVERY_IN_MONTHS")
	private BigDecimal avgTimeToRecoveryInMonths;
	@Column(name="CARLEASE_HAIRCUT_PERCENTAGE")
	private BigDecimal carLeaseHaircutPercentage;
	@Column(name="REALSTATE_HAIRCUT_PERCENTAGE")
	private BigDecimal realestateHaircutPercentage;
	@Column(name="HAIRCUT_ADJUSTED")
	private BigDecimal hairAdjusted;
	@Column(name="PROB_OF_REPOSESSION")
	private BigDecimal probOfReposession;
	@Column(name="COLLATERAL_SALE_COST")
	private BigDecimal collateralSaleCost;
	@Column(name="DISTRESS_SALE")
	private BigDecimal DistressSale;
	@Column(name="MILITARY_LEVEL")
	private String  militaryLevel;
	@Column(name="NEW")
	private String _new;

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
	
	
	public LGDResponse() {
		
	}

		
}
