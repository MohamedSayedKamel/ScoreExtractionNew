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
	
	
	public LGDResponse() {
		
	}

		
}
