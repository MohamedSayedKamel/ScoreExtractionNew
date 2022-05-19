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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the B_SCORE_RESPONSE database table.
 * 
 */
@Entity
@Table(name="B_SCORE_RESPONSE")
@NamedQuery(name="BScoreResponse.findAll", query="SELECT b FROM BScoreResponse b")
public class BScoreResponse implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="B_SCORE_RESPONSE_RESPONSEID_GENERATOR", sequenceName="B_SCORE_RESPONSE_ID_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="B_SCORE_RESPONSE_RESPONSEID_GENERATOR")
	@Column(name="RESPONSE_ID")
	private long responseId;

	@Column(name="RUN_ID")
	private BigDecimal runId;
	
	@Column(name="B_SCOR_ELEMENT_01")
	private String bScorElement01;

	@Column(name="B_SCOR_ELEMENT_02")
	private String bScorElement02;

	@Column(name="B_SCOR_ELEMENT_03")
	private String bScorElement03;

	@Column(name="B_SCOR_ELEMENT_04")
	private String bScorElement04;

	@Column(name="B_SCOR_ELEMENT_05")
	private String bScorElement05;

	@Column(name="B_SCOR_ELEMENT_06")
	private String bScorElement06;

	@Column(name="B_SCOR_ELEMENT_07")
	private String bScorElement07;

	@Column(name="B_SCOR_ELEMENT_08")
	private String bScorElement08;

	@Column(name="B_SCOR_ELEMENT_09")
	private String bScorElement09;

	@Column(name="B_SCOR_ELEMENT_10")
	private String bScorElement10;

	@Column(name="B_SCOR_ELEMENT_11")
	private String bScorElement11;

	@Column(name="B_SCOR_ELEMENT_12")
	private String bScorElement12;

	@Column(name="B_SCOR_ELEMENT_13")
	private String bScorElement13;

	@Column(name="B_SCOR_ELEMENT_14")
	private String bScorElement14;

	@Column(name="B_SCOR_ELEMENT_15")
	private String bScorElement15;

	@Column(name="B_SCOR_ELEMENT_16")
	private String bScorElement16;

	@Column(name="B_SCOR_ELEMENT_17")
	private String bScorElement17;

	@Column(name="B_SCOR_ELEMENT_18")
	private String bScorElement18;

	@Column(name="B_SCOR_ELEMENT_19")
	private String bScorElement19;

	@Column(name="B_SCOR_ELEMENT_20")
	private String bScorElement20;

	@Column(name="B_SCOR_FIELD_01")
	private String bScorField01;

	@Column(name="B_SCOR_FIELD_02")
	private String bScorField02;

	@Column(name="B_SCOR_FIELD_03")
	private String bScorField03;

	@Column(name="B_SCOR_FIELD_04")
	private String bScorField04;

	@Column(name="B_SCOR_FIELD_05")
	private String bScorField05;

	@Column(name="B_SCOR_FIELD_06")
	private String bScorField06;

	@Column(name="B_SCOR_FIELD_07")
	private String bScorField07;

	@Column(name="B_SCOR_FIELD_08")
	private String bScorField08;

	@Column(name="B_SCOR_FIELD_09")
	private String bScorField09;

	@Column(name="B_SCOR_FIELD_10")
	private String bScorField10;

	@Column(name="B_SCOR_FIELD_11")
	private String bScorField11;

	@Column(name="B_SCOR_FIELD_12")
	private String bScorField12;

	@Column(name="B_SCOR_FIELD_13")
	private String bScorField13;

	@Column(name="B_SCOR_FIELD_14")
	private String bScorField14;

	@Column(name="B_SCOR_FIELD_15")
	private String bScorField15;

	@Column(name="B_SCOR_FIELD_16")
	private String bScorField16;

	@Column(name="B_SCOR_FIELD_17")
	private String bScorField17;

	@Column(name="B_SCOR_FIELD_18")
	private String bScorField18;

	@Column(name="B_SCOR_FIELD_19")
	private String bScorField19;

	@Column(name="B_SCOR_FIELD_20")
	private String bScorField20;

	@Column(name="B_SCOR_FINAL_SCORE_POINTS")
	private BigDecimal bScorFinalScorePoints;

	@Column(name="B_SCOR_INITIAL_SCORE_POINTS")
	private BigDecimal bScorInitialScorePoints;

	@Column(name="B_SCOR_OUTCOME_01")
	private String bScorOutcome01;

	@Column(name="B_SCOR_OUTCOME_02")
	private String bScorOutcome02;

	@Column(name="B_SCOR_OUTCOME_03")
	private String bScorOutcome03;

	@Column(name="B_SCOR_OUTCOME_04")
	private String bScorOutcome04;

	@Column(name="B_SCOR_OUTCOME_05")
	private String bScorOutcome05;

	@Column(name="B_SCOR_OUTCOME_06")
	private String bScorOutcome06;

	@Column(name="B_SCOR_OUTCOME_07")
	private String bScorOutcome07;

	@Column(name="B_SCOR_OUTCOME_08")
	private String bScorOutcome08;

	@Column(name="B_SCOR_OUTCOME_09")
	private String bScorOutcome09;

	@Column(name="B_SCOR_OUTCOME_10")
	private String bScorOutcome10;

	@Column(name="B_SCOR_OUTCOME_11")
	private String bScorOutcome11;

	@Column(name="B_SCOR_OUTCOME_12")
	private String bScorOutcome12;

	@Column(name="B_SCOR_OUTCOME_13")
	private String bScorOutcome13;

	@Column(name="B_SCOR_OUTCOME_14")
	private String bScorOutcome14;

	@Column(name="B_SCOR_OUTCOME_15")
	private String bScorOutcome15;

	@Column(name="B_SCOR_OUTCOME_16")
	private String bScorOutcome16;

	@Column(name="B_SCOR_OUTCOME_17")
	private String bScorOutcome17;

	@Column(name="B_SCOR_OUTCOME_18")
	private String bScorOutcome18;

	@Column(name="B_SCOR_OUTCOME_19")
	private String bScorOutcome19;

	@Column(name="B_SCOR_OUTCOME_20")
	private String bScorOutcome20;

	@Column(name="B_SCOR_PD_ESTIMATE")
	private BigDecimal bScorPdEstimate;

	@Column(name="B_SCOR_PD_FACTOR")
	private BigDecimal bScorPdFactor;

	@Column(name="B_SCOR_PD_OFFSET")
	private BigDecimal bScorPdOffset;

	@Column(name="B_SCOR_PRODUCT_FAMILY")
	private String bScorProductFamily;

	@Column(name="B_SCOR_RISK_PROFILE")
	private String bScorRiskProfile;

	@Column(name="B_SCOR_RISK_RATING")
	private String bScorRiskRating;

	@Column(name="B_SCOR_SCORE_VALUE_01")
	private BigDecimal bScorScoreValue01;

	@Column(name="B_SCOR_SCORE_VALUE_02")
	private BigDecimal bScorScoreValue02;

	@Column(name="B_SCOR_SCORE_VALUE_03")
	private BigDecimal bScorScoreValue03;

	@Column(name="B_SCOR_SCORE_VALUE_04")
	private BigDecimal bScorScoreValue04;

	@Column(name="B_SCOR_SCORE_VALUE_05")
	private BigDecimal bScorScoreValue05;

	@Column(name="B_SCOR_SCORE_VALUE_06")
	private BigDecimal bScorScoreValue06;

	@Column(name="B_SCOR_SCORE_VALUE_07")
	private BigDecimal bScorScoreValue07;

	@Column(name="B_SCOR_SCORE_VALUE_08")
	private BigDecimal bScorScoreValue08;

	@Column(name="B_SCOR_SCORE_VALUE_09")
	private BigDecimal bScorScoreValue09;

	@Column(name="B_SCOR_SCORE_VALUE_10")
	private BigDecimal bScorScoreValue10;

	@Column(name="B_SCOR_SCORE_VALUE_11")
	private BigDecimal bScorScoreValue11;

	@Column(name="B_SCOR_SCORE_VALUE_12")
	private BigDecimal bScorScoreValue12;

	@Column(name="B_SCOR_SCORE_VALUE_13")
	private BigDecimal bScorScoreValue13;

	@Column(name="B_SCOR_SCORE_VALUE_14")
	private BigDecimal bScorScoreValue14;

	@Column(name="B_SCOR_SCORE_VALUE_15")
	private BigDecimal bScorScoreValue15;

	@Column(name="B_SCOR_SCORE_VALUE_16")
	private BigDecimal bScorScoreValue16;

	@Column(name="B_SCOR_SCORE_VALUE_17")
	private BigDecimal bScorScoreValue17;

	@Column(name="B_SCOR_SCORE_VALUE_18")
	private BigDecimal bScorScoreValue18;

	@Column(name="B_SCOR_SCORE_VALUE_19")
	private BigDecimal bScorScoreValue19;

	@Column(name="B_SCOR_SCORE_VALUE_20")
	private BigDecimal bScorScoreValue20;

	@Column(name="B_SCOR_SCORECARD_ID")
	private String bScorScorecardId;

	@Column(name="B_SCOR_SCORECARD_NAME")
	private String bScorScorecardName;

	@Column(name="B_SCOR_SCORING_SEGMENT")
	private String bScorScoringSegment;

	@Column(name="B_SCOR_VALUEA_01")
	private String bScorValuea01;

	@Column(name="B_SCOR_VALUEA_02")
	private String bScorValuea02;

	@Column(name="B_SCOR_VALUEA_03")
	private String bScorValuea03;

	@Column(name="B_SCOR_VALUEA_04")
	private String bScorValuea04;

	@Column(name="B_SCOR_VALUEA_05")
	private String bScorValuea05;

	@Column(name="B_SCOR_VALUEA_06")
	private String bScorValuea06;

	@Column(name="B_SCOR_VALUEA_07")
	private String bScorValuea07;

	@Column(name="B_SCOR_VALUEA_08")
	private String bScorValuea08;

	@Column(name="B_SCOR_VALUEA_09")
	private String bScorValuea09;

	@Column(name="B_SCOR_VALUEA_10")
	private String bScorValuea10;

	@Column(name="B_SCOR_VALUEA_11")
	private String bScorValuea11;

	@Column(name="B_SCOR_VALUEA_12")
	private String bScorValuea12;

	@Column(name="B_SCOR_VALUEA_13")
	private String bScorValuea13;

	@Column(name="B_SCOR_VALUEA_14")
	private String bScorValuea14;

	@Column(name="B_SCOR_VALUEA_15")
	private String bScorValuea15;

	@Column(name="B_SCOR_VALUEA_16")
	private String bScorValuea16;

	@Column(name="B_SCOR_VALUEA_17")
	private String bScorValuea17;

	@Column(name="B_SCOR_VALUEA_18")
	private String bScorValuea18;

	@Column(name="B_SCOR_VALUEA_19")
	private String bScorValuea19;

	@Column(name="B_SCOR_VALUEA_20")
	private String bScorValuea20;

	@Column(name="B_SCOR_VALUEB_01")
	private String bScorValueb01;

	@Column(name="B_SCOR_VALUEB_02")
	private String bScorValueb02;

	@Column(name="B_SCOR_VALUEB_03")
	private String bScorValueb03;

	@Column(name="B_SCOR_VALUEB_04")
	private String bScorValueb04;

	@Column(name="B_SCOR_VALUEB_05")
	private String bScorValueb05;

	@Column(name="B_SCOR_VALUEB_06")
	private String bScorValueb06;

	@Column(name="B_SCOR_VALUEB_07")
	private String bScorValueb07;

	@Column(name="B_SCOR_VALUEB_08")
	private String bScorValueb08;

	@Column(name="B_SCOR_VALUEB_09")
	private String bScorValueb09;

	@Column(name="B_SCOR_VALUEB_10")
	private String bScorValueb10;

	@Column(name="B_SCOR_VALUEB_11")
	private String bScorValueb11;

	@Column(name="B_SCOR_VALUEB_12")
	private String bScorValueb12;

	@Column(name="B_SCOR_VALUEB_13")
	private String bScorValueb13;

	@Column(name="B_SCOR_VALUEB_14")
	private String bScorValueb14;

	@Column(name="B_SCOR_VALUEB_15")
	private String bScorValueb15;

	@Column(name="B_SCOR_VALUEB_16")
	private String bScorValueb16;

	@Column(name="B_SCOR_VALUEB_17")
	private String bScorValueb17;

	@Column(name="B_SCOR_VALUEB_18")
	private String bScorValueb18;

	@Column(name="B_SCOR_VALUEB_19")
	private String bScorValueb19;

	@Column(name="B_SCOR_VALUEB_20")
	private String bScorValueb20;

	@Column(name="B_SCOR_VERSION_DATE")
	private String bScorVersionDate;

	@Column(name="B_SCOR_VERSION_NUMBER")
	private String bScorVersionNumber;

	@Column(name="REQUEST_ID")
	private BigDecimal requestId;

	@Column(name="SCOR_CIC")
	private BigDecimal scorCic;

	@Column(name="SCOR_CODE_01")
	private String scorCode01;

	@Column(name="SCOR_CODE_02")
	private String scorCode02;

	@Column(name="SCOR_CODE_03")
	private String scorCode03;

	@Column(name="SCOR_CODE_04")
	private String scorCode04;

	@Column(name="SCOR_CODE_05")
	private String scorCode05;

	@Column(name="SCOR_CODE_06")
	private String scorCode06;

	@Column(name="SCOR_CODE_07")
	private String scorCode07;

	@Column(name="SCOR_CODE_08")
	private String scorCode08;

	@Column(name="SCOR_CODE_09")
	private String scorCode09;

	@Column(name="SCOR_CODE_10")
	private String scorCode10;

	@Column(name="SCOR_CUSTOMER_SEGMENT")
	private String scorCustomerSegment;

	@Column(name="SCOR_DEPLOYMENT_DATE")
	private String scorDeploymentDate;

	@Column(name="SCOR_DEPLOYMENT_NOTES")
	private String scorDeploymentNotes;

	@Column(name="SCOR_DEPLOYMENT_VERSION")
	private String scorDeploymentVersion;

	@Column(name="SCOR_EXECUTION_DATE_TIME")
	private String scorExecutionDateTime;

	@Column(name="SCOR_NATIONAL_ID")
	private String scorNationalId;

	@Temporal(TemporalType.DATE)
	@Column(name="SCOR_PORTFOLIO_DATE")
	private Date scorPortfolioDate;

	@Column(name="SCOR_PRODUCT_TYPE")
	private String scorProductType;

	@Column(name="SCOR_SCORING_REQUEST_TYPE")
	private String scorScoringRequestType;

	@Column(name="SCOR_SCORING_SOURCE")
	private String scorScoringSource;

	@Column(name="SCOR_TRANSACTION_ID")
	private String scorTransactionId;

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

	@Column(name="TEST_GRP_RANDOM_NUMBER")
	private Integer testGrpRandomNumber;

	@Column(name="TEST_GRP_TEST_GROUP_ID")
	private String testGrpTestGroupId;

	@Column(name="TEST_GRP_TEST_GROUP_NAME")
	private String testGrpTestGroupName;

	@Column(name="TEST_GRP_TEST_GROUP_SET_ID")
	private String testGrpTestGroupSetId;

	@Column(name="TEST_GRP_TEST_GROUP_SET_NAME")
	private String testGrpTestGroupSetName;

	public BScoreResponse() {
	}

	public long getResponseId() {
		return this.responseId;
	}

	public void setResponseId(long responseId) {
		this.responseId = responseId;
	}

	public BigDecimal getRunId() {
		return this.runId;
	}

	public void setRunId(BigDecimal runId) {
		this.runId = runId;
	}
	
	public String getBScorElement01() {
		return this.bScorElement01;
	}

	public void setBScorElement01(String bScorElement01) {
		this.bScorElement01 = bScorElement01;
	}

	public String getBScorElement02() {
		return this.bScorElement02;
	}

	public void setBScorElement02(String bScorElement02) {
		this.bScorElement02 = bScorElement02;
	}

	public String getBScorElement03() {
		return this.bScorElement03;
	}

	public void setBScorElement03(String bScorElement03) {
		this.bScorElement03 = bScorElement03;
	}

	public String getBScorElement04() {
		return this.bScorElement04;
	}

	public void setBScorElement04(String bScorElement04) {
		this.bScorElement04 = bScorElement04;
	}

	public String getBScorElement05() {
		return this.bScorElement05;
	}

	public void setBScorElement05(String bScorElement05) {
		this.bScorElement05 = bScorElement05;
	}

	public String getBScorElement06() {
		return this.bScorElement06;
	}

	public void setBScorElement06(String bScorElement06) {
		this.bScorElement06 = bScorElement06;
	}

	public String getBScorElement07() {
		return this.bScorElement07;
	}

	public void setBScorElement07(String bScorElement07) {
		this.bScorElement07 = bScorElement07;
	}

	public String getBScorElement08() {
		return this.bScorElement08;
	}

	public void setBScorElement08(String bScorElement08) {
		this.bScorElement08 = bScorElement08;
	}

	public String getBScorElement09() {
		return this.bScorElement09;
	}

	public void setBScorElement09(String bScorElement09) {
		this.bScorElement09 = bScorElement09;
	}

	public String getBScorElement10() {
		return this.bScorElement10;
	}

	public void setBScorElement10(String bScorElement10) {
		this.bScorElement10 = bScorElement10;
	}

	public String getBScorElement11() {
		return this.bScorElement11;
	}

	public void setBScorElement11(String bScorElement11) {
		this.bScorElement11 = bScorElement11;
	}

	public String getBScorElement12() {
		return this.bScorElement12;
	}

	public void setBScorElement12(String bScorElement12) {
		this.bScorElement12 = bScorElement12;
	}

	public String getBScorElement13() {
		return this.bScorElement13;
	}

	public void setBScorElement13(String bScorElement13) {
		this.bScorElement13 = bScorElement13;
	}

	public String getBScorElement14() {
		return this.bScorElement14;
	}

	public void setBScorElement14(String bScorElement14) {
		this.bScorElement14 = bScorElement14;
	}

	public String getBScorElement15() {
		return this.bScorElement15;
	}

	public void setBScorElement15(String bScorElement15) {
		this.bScorElement15 = bScorElement15;
	}

	public String getBScorElement16() {
		return this.bScorElement16;
	}

	public void setBScorElement16(String bScorElement16) {
		this.bScorElement16 = bScorElement16;
	}

	public String getBScorElement17() {
		return this.bScorElement17;
	}

	public void setBScorElement17(String bScorElement17) {
		this.bScorElement17 = bScorElement17;
	}

	public String getBScorElement18() {
		return this.bScorElement18;
	}

	public void setBScorElement18(String bScorElement18) {
		this.bScorElement18 = bScorElement18;
	}

	public String getBScorElement19() {
		return this.bScorElement19;
	}

	public void setBScorElement19(String bScorElement19) {
		this.bScorElement19 = bScorElement19;
	}

	public String getBScorElement20() {
		return this.bScorElement20;
	}

	public void setBScorElement20(String bScorElement20) {
		this.bScorElement20 = bScorElement20;
	}

	public String getBScorField01() {
		return this.bScorField01;
	}

	public void setBScorField01(String bScorField01) {
		this.bScorField01 = bScorField01;
	}

	public String getBScorField02() {
		return this.bScorField02;
	}

	public void setBScorField02(String bScorField02) {
		this.bScorField02 = bScorField02;
	}

	public String getBScorField03() {
		return this.bScorField03;
	}

	public void setBScorField03(String bScorField03) {
		this.bScorField03 = bScorField03;
	}

	public String getBScorField04() {
		return this.bScorField04;
	}

	public void setBScorField04(String bScorField04) {
		this.bScorField04 = bScorField04;
	}

	public String getBScorField05() {
		return this.bScorField05;
	}

	public void setBScorField05(String bScorField05) {
		this.bScorField05 = bScorField05;
	}

	public String getBScorField06() {
		return this.bScorField06;
	}

	public void setBScorField06(String bScorField06) {
		this.bScorField06 = bScorField06;
	}

	public String getBScorField07() {
		return this.bScorField07;
	}

	public void setBScorField07(String bScorField07) {
		this.bScorField07 = bScorField07;
	}

	public String getBScorField08() {
		return this.bScorField08;
	}

	public void setBScorField08(String bScorField08) {
		this.bScorField08 = bScorField08;
	}

	public String getBScorField09() {
		return this.bScorField09;
	}

	public void setBScorField09(String bScorField09) {
		this.bScorField09 = bScorField09;
	}

	public String getBScorField10() {
		return this.bScorField10;
	}

	public void setBScorField10(String bScorField10) {
		this.bScorField10 = bScorField10;
	}

	public String getBScorField11() {
		return this.bScorField11;
	}

	public void setBScorField11(String bScorField11) {
		this.bScorField11 = bScorField11;
	}

	public String getBScorField12() {
		return this.bScorField12;
	}

	public void setBScorField12(String bScorField12) {
		this.bScorField12 = bScorField12;
	}

	public String getBScorField13() {
		return this.bScorField13;
	}

	public void setBScorField13(String bScorField13) {
		this.bScorField13 = bScorField13;
	}

	public String getBScorField14() {
		return this.bScorField14;
	}

	public void setBScorField14(String bScorField14) {
		this.bScorField14 = bScorField14;
	}

	public String getBScorField15() {
		return this.bScorField15;
	}

	public void setBScorField15(String bScorField15) {
		this.bScorField15 = bScorField15;
	}

	public String getBScorField16() {
		return this.bScorField16;
	}

	public void setBScorField16(String bScorField16) {
		this.bScorField16 = bScorField16;
	}

	public String getBScorField17() {
		return this.bScorField17;
	}

	public void setBScorField17(String bScorField17) {
		this.bScorField17 = bScorField17;
	}

	public String getBScorField18() {
		return this.bScorField18;
	}

	public void setBScorField18(String bScorField18) {
		this.bScorField18 = bScorField18;
	}

	public String getBScorField19() {
		return this.bScorField19;
	}

	public void setBScorField19(String bScorField19) {
		this.bScorField19 = bScorField19;
	}

	public String getBScorField20() {
		return this.bScorField20;
	}

	public void setBScorField20(String bScorField20) {
		this.bScorField20 = bScorField20;
	}

	public BigDecimal getBScorFinalScorePoints() {
		return this.bScorFinalScorePoints;
	}

	public void setBScorFinalScorePoints(BigDecimal bScorFinalScorePoints) {
		this.bScorFinalScorePoints = bScorFinalScorePoints;
	}

	public BigDecimal getBScorInitialScorePoints() {
		return this.bScorInitialScorePoints;
	}

	public void setBScorInitialScorePoints(BigDecimal bScorInitialScorePoints) {
		this.bScorInitialScorePoints = bScorInitialScorePoints;
	}

	public String getBScorOutcome01() {
		return this.bScorOutcome01;
	}

	public void setBScorOutcome01(String bScorOutcome01) {
		this.bScorOutcome01 = bScorOutcome01;
	}

	public String getBScorOutcome02() {
		return this.bScorOutcome02;
	}

	public void setBScorOutcome02(String bScorOutcome02) {
		this.bScorOutcome02 = bScorOutcome02;
	}

	public String getBScorOutcome03() {
		return this.bScorOutcome03;
	}

	public void setBScorOutcome03(String bScorOutcome03) {
		this.bScorOutcome03 = bScorOutcome03;
	}

	public String getBScorOutcome04() {
		return this.bScorOutcome04;
	}

	public void setBScorOutcome04(String bScorOutcome04) {
		this.bScorOutcome04 = bScorOutcome04;
	}

	public String getBScorOutcome05() {
		return this.bScorOutcome05;
	}

	public void setBScorOutcome05(String bScorOutcome05) {
		this.bScorOutcome05 = bScorOutcome05;
	}

	public String getBScorOutcome06() {
		return this.bScorOutcome06;
	}

	public void setBScorOutcome06(String bScorOutcome06) {
		this.bScorOutcome06 = bScorOutcome06;
	}

	public String getBScorOutcome07() {
		return this.bScorOutcome07;
	}

	public void setBScorOutcome07(String bScorOutcome07) {
		this.bScorOutcome07 = bScorOutcome07;
	}

	public String getBScorOutcome08() {
		return this.bScorOutcome08;
	}

	public void setBScorOutcome08(String bScorOutcome08) {
		this.bScorOutcome08 = bScorOutcome08;
	}

	public String getBScorOutcome09() {
		return this.bScorOutcome09;
	}

	public void setBScorOutcome09(String bScorOutcome09) {
		this.bScorOutcome09 = bScorOutcome09;
	}

	public String getBScorOutcome10() {
		return this.bScorOutcome10;
	}

	public void setBScorOutcome10(String bScorOutcome10) {
		this.bScorOutcome10 = bScorOutcome10;
	}

	public String getBScorOutcome11() {
		return this.bScorOutcome11;
	}

	public void setBScorOutcome11(String bScorOutcome11) {
		this.bScorOutcome11 = bScorOutcome11;
	}

	public String getBScorOutcome12() {
		return this.bScorOutcome12;
	}

	public void setBScorOutcome12(String bScorOutcome12) {
		this.bScorOutcome12 = bScorOutcome12;
	}

	public String getBScorOutcome13() {
		return this.bScorOutcome13;
	}

	public void setBScorOutcome13(String bScorOutcome13) {
		this.bScorOutcome13 = bScorOutcome13;
	}

	public String getBScorOutcome14() {
		return this.bScorOutcome14;
	}

	public void setBScorOutcome14(String bScorOutcome14) {
		this.bScorOutcome14 = bScorOutcome14;
	}

	public String getBScorOutcome15() {
		return this.bScorOutcome15;
	}

	public void setBScorOutcome15(String bScorOutcome15) {
		this.bScorOutcome15 = bScorOutcome15;
	}

	public String getBScorOutcome16() {
		return this.bScorOutcome16;
	}

	public void setBScorOutcome16(String bScorOutcome16) {
		this.bScorOutcome16 = bScorOutcome16;
	}

	public String getBScorOutcome17() {
		return this.bScorOutcome17;
	}

	public void setBScorOutcome17(String bScorOutcome17) {
		this.bScorOutcome17 = bScorOutcome17;
	}

	public String getBScorOutcome18() {
		return this.bScorOutcome18;
	}

	public void setBScorOutcome18(String bScorOutcome18) {
		this.bScorOutcome18 = bScorOutcome18;
	}

	public String getBScorOutcome19() {
		return this.bScorOutcome19;
	}

	public void setBScorOutcome19(String bScorOutcome19) {
		this.bScorOutcome19 = bScorOutcome19;
	}

	public String getBScorOutcome20() {
		return this.bScorOutcome20;
	}

	public void setBScorOutcome20(String bScorOutcome20) {
		this.bScorOutcome20 = bScorOutcome20;
	}

	public BigDecimal getBScorPdEstimate() {
		return this.bScorPdEstimate;
	}

	public void setBScorPdEstimate(BigDecimal bScorPdEstimate) {
		this.bScorPdEstimate = bScorPdEstimate;
	}

	public BigDecimal getBScorPdFactor() {
		return this.bScorPdFactor;
	}

	public void setBScorPdFactor(BigDecimal bScorPdFactor) {
		this.bScorPdFactor = bScorPdFactor;
	}

	public BigDecimal getBScorPdOffset() {
		return this.bScorPdOffset;
	}

	public void setBScorPdOffset(BigDecimal bScorPdOffset) {
		this.bScorPdOffset = bScorPdOffset;
	}

	public String getBScorProductFamily() {
		return this.bScorProductFamily;
	}

	public void setBScorProductFamily(String bScorProductFamily) {
		this.bScorProductFamily = bScorProductFamily;
	}

	public String getBScorRiskProfile() {
		return this.bScorRiskProfile;
	}

	public void setBScorRiskProfile(String bScorRiskProfile) {
		this.bScorRiskProfile = bScorRiskProfile;
	}

	public String getBScorRiskRating() {
		return this.bScorRiskRating;
	}

	public void setBScorRiskRating(String bScorRiskRating) {
		this.bScorRiskRating = bScorRiskRating;
	}

	public BigDecimal getBScorScoreValue01() {
		return this.bScorScoreValue01;
	}

	public void setBScorScoreValue01(BigDecimal bScorScoreValue01) {
		this.bScorScoreValue01 = bScorScoreValue01;
	}

	public BigDecimal getBScorScoreValue02() {
		return this.bScorScoreValue02;
	}

	public void setBScorScoreValue02(BigDecimal bScorScoreValue02) {
		this.bScorScoreValue02 = bScorScoreValue02;
	}

	public BigDecimal getBScorScoreValue03() {
		return this.bScorScoreValue03;
	}

	public void setBScorScoreValue03(BigDecimal bScorScoreValue03) {
		this.bScorScoreValue03 = bScorScoreValue03;
	}

	public BigDecimal getBScorScoreValue04() {
		return this.bScorScoreValue04;
	}

	public void setBScorScoreValue04(BigDecimal bScorScoreValue04) {
		this.bScorScoreValue04 = bScorScoreValue04;
	}

	public BigDecimal getBScorScoreValue05() {
		return this.bScorScoreValue05;
	}

	public void setBScorScoreValue05(BigDecimal bScorScoreValue05) {
		this.bScorScoreValue05 = bScorScoreValue05;
	}

	public BigDecimal getBScorScoreValue06() {
		return this.bScorScoreValue06;
	}

	public void setBScorScoreValue06(BigDecimal bScorScoreValue06) {
		this.bScorScoreValue06 = bScorScoreValue06;
	}

	public BigDecimal getBScorScoreValue07() {
		return this.bScorScoreValue07;
	}

	public void setBScorScoreValue07(BigDecimal bScorScoreValue07) {
		this.bScorScoreValue07 = bScorScoreValue07;
	}

	public BigDecimal getBScorScoreValue08() {
		return this.bScorScoreValue08;
	}

	public void setBScorScoreValue08(BigDecimal bScorScoreValue08) {
		this.bScorScoreValue08 = bScorScoreValue08;
	}

	public BigDecimal getBScorScoreValue09() {
		return this.bScorScoreValue09;
	}

	public void setBScorScoreValue09(BigDecimal bScorScoreValue09) {
		this.bScorScoreValue09 = bScorScoreValue09;
	}

	public BigDecimal getBScorScoreValue10() {
		return this.bScorScoreValue10;
	}

	public void setBScorScoreValue10(BigDecimal bScorScoreValue10) {
		this.bScorScoreValue10 = bScorScoreValue10;
	}

	public BigDecimal getBScorScoreValue11() {
		return this.bScorScoreValue11;
	}

	public void setBScorScoreValue11(BigDecimal bScorScoreValue11) {
		this.bScorScoreValue11 = bScorScoreValue11;
	}

	public BigDecimal getBScorScoreValue12() {
		return this.bScorScoreValue12;
	}

	public void setBScorScoreValue12(BigDecimal bScorScoreValue12) {
		this.bScorScoreValue12 = bScorScoreValue12;
	}

	public BigDecimal getBScorScoreValue13() {
		return this.bScorScoreValue13;
	}

	public void setBScorScoreValue13(BigDecimal bScorScoreValue13) {
		this.bScorScoreValue13 = bScorScoreValue13;
	}

	public BigDecimal getBScorScoreValue14() {
		return this.bScorScoreValue14;
	}

	public void setBScorScoreValue14(BigDecimal bScorScoreValue14) {
		this.bScorScoreValue14 = bScorScoreValue14;
	}

	public BigDecimal getBScorScoreValue15() {
		return this.bScorScoreValue15;
	}

	public void setBScorScoreValue15(BigDecimal bScorScoreValue15) {
		this.bScorScoreValue15 = bScorScoreValue15;
	}

	public BigDecimal getBScorScoreValue16() {
		return this.bScorScoreValue16;
	}

	public void setBScorScoreValue16(BigDecimal bScorScoreValue16) {
		this.bScorScoreValue16 = bScorScoreValue16;
	}

	public BigDecimal getBScorScoreValue17() {
		return this.bScorScoreValue17;
	}

	public void setBScorScoreValue17(BigDecimal bScorScoreValue17) {
		this.bScorScoreValue17 = bScorScoreValue17;
	}

	public BigDecimal getBScorScoreValue18() {
		return this.bScorScoreValue18;
	}

	public void setBScorScoreValue18(BigDecimal bScorScoreValue18) {
		this.bScorScoreValue18 = bScorScoreValue18;
	}

	public BigDecimal getBScorScoreValue19() {
		return this.bScorScoreValue19;
	}

	public void setBScorScoreValue19(BigDecimal bScorScoreValue19) {
		this.bScorScoreValue19 = bScorScoreValue19;
	}

	public BigDecimal getBScorScoreValue20() {
		return this.bScorScoreValue20;
	}

	public void setBScorScoreValue20(BigDecimal bScorScoreValue20) {
		this.bScorScoreValue20 = bScorScoreValue20;
	}

	public String getBScorScorecardId() {
		return this.bScorScorecardId;
	}

	public void setBScorScorecardId(String bScorScorecardId) {
		this.bScorScorecardId = bScorScorecardId;
	}

	public String getBScorScorecardName() {
		return this.bScorScorecardName;
	}

	public void setBScorScorecardName(String bScorScorecardName) {
		this.bScorScorecardName = bScorScorecardName;
	}

	public String getBScorScoringSegment() {
		return this.bScorScoringSegment;
	}

	public void setBScorScoringSegment(String bScorScoringSegment) {
		this.bScorScoringSegment = bScorScoringSegment;
	}

	public String getBScorValuea01() {
		return this.bScorValuea01;
	}

	public void setBScorValuea01(String bScorValuea01) {
		this.bScorValuea01 = bScorValuea01;
	}

	public String getBScorValuea02() {
		return this.bScorValuea02;
	}

	public void setBScorValuea02(String bScorValuea02) {
		this.bScorValuea02 = bScorValuea02;
	}

	public String getBScorValuea03() {
		return this.bScorValuea03;
	}

	public void setBScorValuea03(String bScorValuea03) {
		this.bScorValuea03 = bScorValuea03;
	}

	public String getBScorValuea04() {
		return this.bScorValuea04;
	}

	public void setBScorValuea04(String bScorValuea04) {
		this.bScorValuea04 = bScorValuea04;
	}

	public String getBScorValuea05() {
		return this.bScorValuea05;
	}

	public void setBScorValuea05(String bScorValuea05) {
		this.bScorValuea05 = bScorValuea05;
	}

	public String getBScorValuea06() {
		return this.bScorValuea06;
	}

	public void setBScorValuea06(String bScorValuea06) {
		this.bScorValuea06 = bScorValuea06;
	}

	public String getBScorValuea07() {
		return this.bScorValuea07;
	}

	public void setBScorValuea07(String bScorValuea07) {
		this.bScorValuea07 = bScorValuea07;
	}

	public String getBScorValuea08() {
		return this.bScorValuea08;
	}

	public void setBScorValuea08(String bScorValuea08) {
		this.bScorValuea08 = bScorValuea08;
	}

	public String getBScorValuea09() {
		return this.bScorValuea09;
	}

	public void setBScorValuea09(String bScorValuea09) {
		this.bScorValuea09 = bScorValuea09;
	}

	public String getBScorValuea10() {
		return this.bScorValuea10;
	}

	public void setBScorValuea10(String bScorValuea10) {
		this.bScorValuea10 = bScorValuea10;
	}

	public String getBScorValuea11() {
		return this.bScorValuea11;
	}

	public void setBScorValuea11(String bScorValuea11) {
		this.bScorValuea11 = bScorValuea11;
	}

	public String getBScorValuea12() {
		return this.bScorValuea12;
	}

	public void setBScorValuea12(String bScorValuea12) {
		this.bScorValuea12 = bScorValuea12;
	}

	public String getBScorValuea13() {
		return this.bScorValuea13;
	}

	public void setBScorValuea13(String bScorValuea13) {
		this.bScorValuea13 = bScorValuea13;
	}

	public String getBScorValuea14() {
		return this.bScorValuea14;
	}

	public void setBScorValuea14(String bScorValuea14) {
		this.bScorValuea14 = bScorValuea14;
	}

	public String getBScorValuea15() {
		return this.bScorValuea15;
	}

	public void setBScorValuea15(String bScorValuea15) {
		this.bScorValuea15 = bScorValuea15;
	}

	public String getBScorValuea16() {
		return this.bScorValuea16;
	}

	public void setBScorValuea16(String bScorValuea16) {
		this.bScorValuea16 = bScorValuea16;
	}

	public String getBScorValuea17() {
		return this.bScorValuea17;
	}

	public void setBScorValuea17(String bScorValuea17) {
		this.bScorValuea17 = bScorValuea17;
	}

	public String getBScorValuea18() {
		return this.bScorValuea18;
	}

	public void setBScorValuea18(String bScorValuea18) {
		this.bScorValuea18 = bScorValuea18;
	}

	public String getBScorValuea19() {
		return this.bScorValuea19;
	}

	public void setBScorValuea19(String bScorValuea19) {
		this.bScorValuea19 = bScorValuea19;
	}

	public String getBScorValuea20() {
		return this.bScorValuea20;
	}

	public void setBScorValuea20(String bScorValuea20) {
		this.bScorValuea20 = bScorValuea20;
	}

	public String getBScorValueb01() {
		return this.bScorValueb01;
	}

	public void setBScorValueb01(String bScorValueb01) {
		this.bScorValueb01 = bScorValueb01;
	}

	public String getBScorValueb02() {
		return this.bScorValueb02;
	}

	public void setBScorValueb02(String bScorValueb02) {
		this.bScorValueb02 = bScorValueb02;
	}

	public String getBScorValueb03() {
		return this.bScorValueb03;
	}

	public void setBScorValueb03(String bScorValueb03) {
		this.bScorValueb03 = bScorValueb03;
	}

	public String getBScorValueb04() {
		return this.bScorValueb04;
	}

	public void setBScorValueb04(String bScorValueb04) {
		this.bScorValueb04 = bScorValueb04;
	}

	public String getBScorValueb05() {
		return this.bScorValueb05;
	}

	public void setBScorValueb05(String bScorValueb05) {
		this.bScorValueb05 = bScorValueb05;
	}

	public String getBScorValueb06() {
		return this.bScorValueb06;
	}

	public void setBScorValueb06(String bScorValueb06) {
		this.bScorValueb06 = bScorValueb06;
	}

	public String getBScorValueb07() {
		return this.bScorValueb07;
	}

	public void setBScorValueb07(String bScorValueb07) {
		this.bScorValueb07 = bScorValueb07;
	}

	public String getBScorValueb08() {
		return this.bScorValueb08;
	}

	public void setBScorValueb08(String bScorValueb08) {
		this.bScorValueb08 = bScorValueb08;
	}

	public String getBScorValueb09() {
		return this.bScorValueb09;
	}

	public void setBScorValueb09(String bScorValueb09) {
		this.bScorValueb09 = bScorValueb09;
	}

	public String getBScorValueb10() {
		return this.bScorValueb10;
	}

	public void setBScorValueb10(String bScorValueb10) {
		this.bScorValueb10 = bScorValueb10;
	}

	public String getBScorValueb11() {
		return this.bScorValueb11;
	}

	public void setBScorValueb11(String bScorValueb11) {
		this.bScorValueb11 = bScorValueb11;
	}

	public String getBScorValueb12() {
		return this.bScorValueb12;
	}

	public void setBScorValueb12(String bScorValueb12) {
		this.bScorValueb12 = bScorValueb12;
	}

	public String getBScorValueb13() {
		return this.bScorValueb13;
	}

	public void setBScorValueb13(String bScorValueb13) {
		this.bScorValueb13 = bScorValueb13;
	}

	public String getBScorValueb14() {
		return this.bScorValueb14;
	}

	public void setBScorValueb14(String bScorValueb14) {
		this.bScorValueb14 = bScorValueb14;
	}

	public String getBScorValueb15() {
		return this.bScorValueb15;
	}

	public void setBScorValueb15(String bScorValueb15) {
		this.bScorValueb15 = bScorValueb15;
	}

	public String getBScorValueb16() {
		return this.bScorValueb16;
	}

	public void setBScorValueb16(String bScorValueb16) {
		this.bScorValueb16 = bScorValueb16;
	}

	public String getBScorValueb17() {
		return this.bScorValueb17;
	}

	public void setBScorValueb17(String bScorValueb17) {
		this.bScorValueb17 = bScorValueb17;
	}

	public String getBScorValueb18() {
		return this.bScorValueb18;
	}

	public void setBScorValueb18(String bScorValueb18) {
		this.bScorValueb18 = bScorValueb18;
	}

	public String getBScorValueb19() {
		return this.bScorValueb19;
	}

	public void setBScorValueb19(String bScorValueb19) {
		this.bScorValueb19 = bScorValueb19;
	}

	public String getBScorValueb20() {
		return this.bScorValueb20;
	}

	public void setBScorValueb20(String bScorValueb20) {
		this.bScorValueb20 = bScorValueb20;
	}

	public String getBScorVersionDate() {
		return this.bScorVersionDate;
	}

	public void setBScorVersionDate(String bScorVersionDate) {
		this.bScorVersionDate = bScorVersionDate;
	}

	public String getBScorVersionNumber() {
		return this.bScorVersionNumber;
	}

	public void setBScorVersionNumber(String bScorVersionNumber) {
		this.bScorVersionNumber = bScorVersionNumber;
	}

	public BigDecimal getRequestId() {
		return this.requestId;
	}

	public void setRequestId(BigDecimal requestId) {
		this.requestId = requestId;
	}

	public BigDecimal getScorCic() {
		return this.scorCic;
	}

	public void setScorCic(BigDecimal scorCic) {
		this.scorCic = scorCic;
	}

	public String getScorCode01() {
		return this.scorCode01;
	}

	public void setScorCode01(String scorCode01) {
		this.scorCode01 = scorCode01;
	}

	public String getScorCode02() {
		return this.scorCode02;
	}

	public void setScorCode02(String scorCode02) {
		this.scorCode02 = scorCode02;
	}

	public String getScorCode03() {
		return this.scorCode03;
	}

	public void setScorCode03(String scorCode03) {
		this.scorCode03 = scorCode03;
	}

	public String getScorCode04() {
		return this.scorCode04;
	}

	public void setScorCode04(String scorCode04) {
		this.scorCode04 = scorCode04;
	}

	public String getScorCode05() {
		return this.scorCode05;
	}

	public void setScorCode05(String scorCode05) {
		this.scorCode05 = scorCode05;
	}

	public String getScorCode06() {
		return this.scorCode06;
	}

	public void setScorCode06(String scorCode06) {
		this.scorCode06 = scorCode06;
	}

	public String getScorCode07() {
		return this.scorCode07;
	}

	public void setScorCode07(String scorCode07) {
		this.scorCode07 = scorCode07;
	}

	public String getScorCode08() {
		return this.scorCode08;
	}

	public void setScorCode08(String scorCode08) {
		this.scorCode08 = scorCode08;
	}

	public String getScorCode09() {
		return this.scorCode09;
	}

	public void setScorCode09(String scorCode09) {
		this.scorCode09 = scorCode09;
	}

	public String getScorCode10() {
		return this.scorCode10;
	}

	public void setScorCode10(String scorCode10) {
		this.scorCode10 = scorCode10;
	}

	public String getScorCustomerSegment() {
		return this.scorCustomerSegment;
	}

	public void setScorCustomerSegment(String scorCustomerSegment) {
		this.scorCustomerSegment = scorCustomerSegment;
	}

	public String getScorDeploymentDate() {
		return this.scorDeploymentDate;
	}

	public void setScorDeploymentDate(String scorDeploymentDate) {
		this.scorDeploymentDate = scorDeploymentDate;
	}

	public String getScorDeploymentNotes() {
		return this.scorDeploymentNotes;
	}

	public void setScorDeploymentNotes(String scorDeploymentNotes) {
		this.scorDeploymentNotes = scorDeploymentNotes;
	}

	public String getScorDeploymentVersion() {
		return this.scorDeploymentVersion;
	}

	public void setScorDeploymentVersion(String scorDeploymentVersion) {
		this.scorDeploymentVersion = scorDeploymentVersion;
	}

	public String getScorExecutionDateTime() {
		return this.scorExecutionDateTime;
	}

	public void setScorExecutionDateTime(String scorExecutionDateTime) {
		this.scorExecutionDateTime = scorExecutionDateTime;
	}

	public String getScorNationalId() {
		return this.scorNationalId;
	}

	public void setScorNationalId(String scorNationalId) {
		this.scorNationalId = scorNationalId;
	}

	public Date getScorPortfolioDate() {
		return this.scorPortfolioDate;
	}

	public void setScorPortfolioDate(Date scorPortfolioDate) {
		this.scorPortfolioDate = scorPortfolioDate;
	}

	public String getScorProductType() {
		return this.scorProductType;
	}

	public void setScorProductType(String scorProductType) {
		this.scorProductType = scorProductType;
	}

	public String getScorScoringRequestType() {
		return this.scorScoringRequestType;
	}

	public void setScorScoringRequestType(String scorScoringRequestType) {
		this.scorScoringRequestType = scorScoringRequestType;
	}

	public String getScorScoringSource() {
		return this.scorScoringSource;
	}

	public void setScorScoringSource(String scorScoringSource) {
		this.scorScoringSource = scorScoringSource;
	}

	public String getScorTransactionId() {
		return this.scorTransactionId;
	}

	public void setScorTransactionId(String scorTransactionId) {
		this.scorTransactionId = scorTransactionId;
	}

	public String getSpareSpare01() {
		return this.spareSpare01;
	}

	public void setSpareSpare01(String spareSpare01) {
		this.spareSpare01 = spareSpare01;
	}

	public String getSpareSpare02() {
		return this.spareSpare02;
	}

	public void setSpareSpare02(String spareSpare02) {
		this.spareSpare02 = spareSpare02;
	}

	public String getSpareSpare03() {
		return this.spareSpare03;
	}

	public void setSpareSpare03(String spareSpare03) {
		this.spareSpare03 = spareSpare03;
	}

	public String getSpareSpare04() {
		return this.spareSpare04;
	}

	public void setSpareSpare04(String spareSpare04) {
		this.spareSpare04 = spareSpare04;
	}

	public String getSpareSpare05() {
		return this.spareSpare05;
	}

	public void setSpareSpare05(String spareSpare05) {
		this.spareSpare05 = spareSpare05;
	}

	public String getSpareSpare06() {
		return this.spareSpare06;
	}

	public void setSpareSpare06(String spareSpare06) {
		this.spareSpare06 = spareSpare06;
	}

	public String getSpareSpare07() {
		return this.spareSpare07;
	}

	public void setSpareSpare07(String spareSpare07) {
		this.spareSpare07 = spareSpare07;
	}

	public String getSpareSpare08() {
		return this.spareSpare08;
	}

	public void setSpareSpare08(String spareSpare08) {
		this.spareSpare08 = spareSpare08;
	}

	public String getSpareSpare09() {
		return this.spareSpare09;
	}

	public void setSpareSpare09(String spareSpare09) {
		this.spareSpare09 = spareSpare09;
	}

	public String getSpareSpare10() {
		return this.spareSpare10;
	}

	public void setSpareSpare10(String spareSpare10) {
		this.spareSpare10 = spareSpare10;
	}

	public String getSpareSpare11() {
		return this.spareSpare11;
	}

	public void setSpareSpare11(String spareSpare11) {
		this.spareSpare11 = spareSpare11;
	}

	public String getSpareSpare12() {
		return this.spareSpare12;
	}

	public void setSpareSpare12(String spareSpare12) {
		this.spareSpare12 = spareSpare12;
	}

	public String getSpareSpare13() {
		return this.spareSpare13;
	}

	public void setSpareSpare13(String spareSpare13) {
		this.spareSpare13 = spareSpare13;
	}

	public String getSpareSpare14() {
		return this.spareSpare14;
	}

	public void setSpareSpare14(String spareSpare14) {
		this.spareSpare14 = spareSpare14;
	}

	public String getSpareSpare15() {
		return this.spareSpare15;
	}

	public void setSpareSpare15(String spareSpare15) {
		this.spareSpare15 = spareSpare15;
	}

	public String getSpareSpare16() {
		return this.spareSpare16;
	}

	public void setSpareSpare16(String spareSpare16) {
		this.spareSpare16 = spareSpare16;
	}

	public String getSpareSpare17() {
		return this.spareSpare17;
	}

	public void setSpareSpare17(String spareSpare17) {
		this.spareSpare17 = spareSpare17;
	}

	public String getSpareSpare18() {
		return this.spareSpare18;
	}

	public void setSpareSpare18(String spareSpare18) {
		this.spareSpare18 = spareSpare18;
	}

	public String getSpareSpare19() {
		return this.spareSpare19;
	}

	public void setSpareSpare19(String spareSpare19) {
		this.spareSpare19 = spareSpare19;
	}

	public String getSpareSpare20() {
		return this.spareSpare20;
	}

	public void setSpareSpare20(String spareSpare20) {
		this.spareSpare20 = spareSpare20;
	}

	public String getSpareSpare21() {
		return this.spareSpare21;
	}

	public void setSpareSpare21(String spareSpare21) {
		this.spareSpare21 = spareSpare21;
	}

	public String getSpareSpare22() {
		return this.spareSpare22;
	}

	public void setSpareSpare22(String spareSpare22) {
		this.spareSpare22 = spareSpare22;
	}

	public String getSpareSpare23() {
		return this.spareSpare23;
	}

	public void setSpareSpare23(String spareSpare23) {
		this.spareSpare23 = spareSpare23;
	}

	public String getSpareSpare24() {
		return this.spareSpare24;
	}

	public void setSpareSpare24(String spareSpare24) {
		this.spareSpare24 = spareSpare24;
	}

	public String getSpareSpare25() {
		return this.spareSpare25;
	}

	public void setSpareSpare25(String spareSpare25) {
		this.spareSpare25 = spareSpare25;
	}

	public String getSpareSpare26() {
		return this.spareSpare26;
	}

	public void setSpareSpare26(String spareSpare26) {
		this.spareSpare26 = spareSpare26;
	}

	public String getSpareSpare27() {
		return this.spareSpare27;
	}

	public void setSpareSpare27(String spareSpare27) {
		this.spareSpare27 = spareSpare27;
	}

	public String getSpareSpare28() {
		return this.spareSpare28;
	}

	public void setSpareSpare28(String spareSpare28) {
		this.spareSpare28 = spareSpare28;
	}

	public String getSpareSpare29() {
		return this.spareSpare29;
	}

	public void setSpareSpare29(String spareSpare29) {
		this.spareSpare29 = spareSpare29;
	}

	public String getSpareSpare30() {
		return this.spareSpare30;
	}

	public void setSpareSpare30(String spareSpare30) {
		this.spareSpare30 = spareSpare30;
	}

	public String getSpareSpare31() {
		return this.spareSpare31;
	}

	public void setSpareSpare31(String spareSpare31) {
		this.spareSpare31 = spareSpare31;
	}

	public String getSpareSpare32() {
		return this.spareSpare32;
	}

	public void setSpareSpare32(String spareSpare32) {
		this.spareSpare32 = spareSpare32;
	}

	public String getSpareSpare33() {
		return this.spareSpare33;
	}

	public void setSpareSpare33(String spareSpare33) {
		this.spareSpare33 = spareSpare33;
	}

	public String getSpareSpare34() {
		return this.spareSpare34;
	}

	public void setSpareSpare34(String spareSpare34) {
		this.spareSpare34 = spareSpare34;
	}

	public String getSpareSpare35() {
		return this.spareSpare35;
	}

	public void setSpareSpare35(String spareSpare35) {
		this.spareSpare35 = spareSpare35;
	}

	public String getSpareSpare36() {
		return this.spareSpare36;
	}

	public void setSpareSpare36(String spareSpare36) {
		this.spareSpare36 = spareSpare36;
	}

	public String getSpareSpare37() {
		return this.spareSpare37;
	}

	public void setSpareSpare37(String spareSpare37) {
		this.spareSpare37 = spareSpare37;
	}

	public String getSpareSpare38() {
		return this.spareSpare38;
	}

	public void setSpareSpare38(String spareSpare38) {
		this.spareSpare38 = spareSpare38;
	}

	public String getSpareSpare39() {
		return this.spareSpare39;
	}

	public void setSpareSpare39(String spareSpare39) {
		this.spareSpare39 = spareSpare39;
	}

	public String getSpareSpare40() {
		return this.spareSpare40;
	}

	public void setSpareSpare40(String spareSpare40) {
		this.spareSpare40 = spareSpare40;
	}

	public String getSpareSpare41() {
		return this.spareSpare41;
	}

	public void setSpareSpare41(String spareSpare41) {
		this.spareSpare41 = spareSpare41;
	}

	public String getSpareSpare42() {
		return this.spareSpare42;
	}

	public void setSpareSpare42(String spareSpare42) {
		this.spareSpare42 = spareSpare42;
	}

	public String getSpareSpare43() {
		return this.spareSpare43;
	}

	public void setSpareSpare43(String spareSpare43) {
		this.spareSpare43 = spareSpare43;
	}

	public String getSpareSpare44() {
		return this.spareSpare44;
	}

	public void setSpareSpare44(String spareSpare44) {
		this.spareSpare44 = spareSpare44;
	}

	public String getSpareSpare45() {
		return this.spareSpare45;
	}

	public void setSpareSpare45(String spareSpare45) {
		this.spareSpare45 = spareSpare45;
	}

	public String getSpareSpare46() {
		return this.spareSpare46;
	}

	public void setSpareSpare46(String spareSpare46) {
		this.spareSpare46 = spareSpare46;
	}

	public String getSpareSpare47() {
		return this.spareSpare47;
	}

	public void setSpareSpare47(String spareSpare47) {
		this.spareSpare47 = spareSpare47;
	}

	public String getSpareSpare48() {
		return this.spareSpare48;
	}

	public void setSpareSpare48(String spareSpare48) {
		this.spareSpare48 = spareSpare48;
	}

	public String getSpareSpare49() {
		return this.spareSpare49;
	}

	public void setSpareSpare49(String spareSpare49) {
		this.spareSpare49 = spareSpare49;
	}

	public String getSpareSpare50() {
		return this.spareSpare50;
	}

	public void setSpareSpare50(String spareSpare50) {
		this.spareSpare50 = spareSpare50;
	}

	public Integer getTestGrpRandomNumber() {
		return this.testGrpRandomNumber;
	}

	public void setTestGrpRandomNumber(Integer testGrpRandomNumber) {
		this.testGrpRandomNumber = testGrpRandomNumber;
	}

	public String getTestGrpTestGroupId() {
		return this.testGrpTestGroupId;
	}

	public void setTestGrpTestGroupId(String testGrpTestGroupId) {
		this.testGrpTestGroupId = testGrpTestGroupId;
	}

	public String getTestGrpTestGroupName() {
		return this.testGrpTestGroupName;
	}

	public void setTestGrpTestGroupName(String testGrpTestGroupName) {
		this.testGrpTestGroupName = testGrpTestGroupName;
	}

	public String getTestGrpTestGroupSetId() {
		return this.testGrpTestGroupSetId;
	}

	public void setTestGrpTestGroupSetId(String testGrpTestGroupSetId) {
		this.testGrpTestGroupSetId = testGrpTestGroupSetId;
	}

	public String getTestGrpTestGroupSetName() {
		return this.testGrpTestGroupSetName;
	}

	public void setTestGrpTestGroupSetName(String testGrpTestGroupSetName) {
		this.testGrpTestGroupSetName = testGrpTestGroupSetName;
	}

}