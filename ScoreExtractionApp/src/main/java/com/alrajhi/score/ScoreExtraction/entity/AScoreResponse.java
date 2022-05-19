package com.alrajhi.score.ScoreExtraction.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


/**
 * The persistent class for the A_SCORE_RESPONSE database table.
 * 
 */
@Entity
@Table(name="A_SCORE_RESPONSE")
@NamedQuery(name="AScoreResponse.findAll", query="SELECT a FROM AScoreResponse a")
public class AScoreResponse implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="A_SCORE_RESPONSE_RESPONSEID_GENERATOR", sequenceName="A_SCORE_RESPONSE_ID_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="A_SCORE_RESPONSE_RESPONSEID_GENERATOR")
	@Column(name="RESPONSE_ID")
	private long responseId;

	@Column(name="RUN_ID")
	private BigDecimal runId;
	
	@Column(name="A_SCOR_APPROVAL_DELEGATION")
	private String aScorApprovalDelegation;

	@Column(name="A_SCOR_ELEMENT_01")
	private String aScorElement01;

	@Column(name="A_SCOR_ELEMENT_02")
	private String aScorElement02;

	@Column(name="A_SCOR_ELEMENT_03")
	private String aScorElement03;

	@Column(name="A_SCOR_ELEMENT_04")
	private String aScorElement04;

	@Column(name="A_SCOR_ELEMENT_05")
	private String aScorElement05;

	@Column(name="A_SCOR_ELEMENT_06")
	private String aScorElement06;

	@Column(name="A_SCOR_ELEMENT_07")
	private String aScorElement07;

	@Column(name="A_SCOR_ELEMENT_08")
	private String aScorElement08;

	@Column(name="A_SCOR_ELEMENT_09")
	private String aScorElement09;

	@Column(name="A_SCOR_ELEMENT_10")
	private String aScorElement10;

	@Column(name="A_SCOR_ELEMENT_11")
	private String aScorElement11;

	@Column(name="A_SCOR_ELEMENT_12")
	private String aScorElement12;

	@Column(name="A_SCOR_ELEMENT_13")
	private String aScorElement13;

	@Column(name="A_SCOR_ELEMENT_14")
	private String aScorElement14;

	@Column(name="A_SCOR_ELEMENT_15")
	private String aScorElement15;

	@Column(name="A_SCOR_ELEMENT_16")
	private String aScorElement16;

	@Column(name="A_SCOR_ELEMENT_17")
	private String aScorElement17;

	@Column(name="A_SCOR_ELEMENT_18")
	private String aScorElement18;

	@Column(name="A_SCOR_ELEMENT_19")
	private String aScorElement19;

	@Column(name="A_SCOR_ELEMENT_20")
	private String aScorElement20;

	@Column(name="A_SCOR_FIELD_01")
	private String aScorField01;

	@Column(name="A_SCOR_FIELD_02")
	private String aScorField02;

	@Column(name="A_SCOR_FIELD_03")
	private String aScorField03;

	@Column(name="A_SCOR_FIELD_04")
	private String aScorField04;

	@Column(name="A_SCOR_FIELD_05")
	private String aScorField05;

	@Column(name="A_SCOR_FIELD_06")
	private String aScorField06;

	@Column(name="A_SCOR_FIELD_07")
	private String aScorField07;

	@Column(name="A_SCOR_FIELD_08")
	private String aScorField08;

	@Column(name="A_SCOR_FIELD_09")
	private String aScorField09;

	@Column(name="A_SCOR_FIELD_10")
	private String aScorField10;

	@Column(name="A_SCOR_FIELD_11")
	private String aScorField11;

	@Column(name="A_SCOR_FIELD_12")
	private String aScorField12;

	@Column(name="A_SCOR_FIELD_13")
	private String aScorField13;

	@Column(name="A_SCOR_FIELD_14")
	private String aScorField14;

	@Column(name="A_SCOR_FIELD_15")
	private String aScorField15;

	@Column(name="A_SCOR_FIELD_16")
	private String aScorField16;

	@Column(name="A_SCOR_FIELD_17")
	private String aScorField17;

	@Column(name="A_SCOR_FIELD_18")
	private String aScorField18;

	@Column(name="A_SCOR_FIELD_19")
	private String aScorField19;

	@Column(name="A_SCOR_FIELD_20")
	private String aScorField20;

	@Column(name="A_SCOR_OUTCOME_01")
	private String aScorOutcome01;

	@Column(name="A_SCOR_OUTCOME_02")
	private String aScorOutcome02;

	@Column(name="A_SCOR_OUTCOME_03")
	private String aScorOutcome03;

	@Column(name="A_SCOR_OUTCOME_04")
	private String aScorOutcome04;

	@Column(name="A_SCOR_OUTCOME_05")
	private String aScorOutcome05;

	@Column(name="A_SCOR_OUTCOME_06")
	private String aScorOutcome06;

	@Column(name="A_SCOR_OUTCOME_07")
	private String aScorOutcome07;

	@Column(name="A_SCOR_OUTCOME_08")
	private String aScorOutcome08;

	@Column(name="A_SCOR_OUTCOME_09")
	private String aScorOutcome09;

	@Column(name="A_SCOR_OUTCOME_10")
	private String aScorOutcome10;

	@Column(name="A_SCOR_OUTCOME_11")
	private String aScorOutcome11;

	@Column(name="A_SCOR_OUTCOME_12")
	private String aScorOutcome12;

	@Column(name="A_SCOR_OUTCOME_13")
	private String aScorOutcome13;

	@Column(name="A_SCOR_OUTCOME_14")
	private String aScorOutcome14;

	@Column(name="A_SCOR_OUTCOME_15")
	private String aScorOutcome15;

	@Column(name="A_SCOR_OUTCOME_16")
	private String aScorOutcome16;

	@Column(name="A_SCOR_OUTCOME_17")
	private String aScorOutcome17;

	@Column(name="A_SCOR_OUTCOME_18")
	private String aScorOutcome18;

	@Column(name="A_SCOR_OUTCOME_19")
	private String aScorOutcome19;

	@Column(name="A_SCOR_OUTCOME_20")
	private String aScorOutcome20;

	@Column(name="A_SCOR_PD_ESTIMATE")
	private BigDecimal aScorPdEstimate;

	@Column(name="A_SCOR_PD_FACTOR")
	private BigDecimal aScorPdFactor;

	@Column(name="A_SCOR_PD_OFFSET")
	private BigDecimal aScorPdOffset;

	@Column(name="A_SCOR_PRODUCT_FAMILY")
	private String aScorProductFamily;

	@Column(name="A_SCOR_RISK_PROFILE")
	private String aScorRiskProfile;

	@Column(name="A_SCOR_RISK_RATING")
	private String aScorRiskRating;

	@Column(name="A_SCOR_SCORE")
	private BigDecimal aScorScore;

	@Column(name="A_SCOR_SCORE_VALUE_01")
	private BigDecimal aScorScoreValue01;

	@Column(name="A_SCOR_SCORE_VALUE_02")
	private BigDecimal aScorScoreValue02;

	@Column(name="A_SCOR_SCORE_VALUE_03")
	private BigDecimal aScorScoreValue03;

	@Column(name="A_SCOR_SCORE_VALUE_04")
	private BigDecimal aScorScoreValue04;

	@Column(name="A_SCOR_SCORE_VALUE_05")
	private BigDecimal aScorScoreValue05;

	@Column(name="A_SCOR_SCORE_VALUE_06")
	private BigDecimal aScorScoreValue06;

	@Column(name="A_SCOR_SCORE_VALUE_07")
	private BigDecimal aScorScoreValue07;

	@Column(name="A_SCOR_SCORE_VALUE_08")
	private BigDecimal aScorScoreValue08;

	@Column(name="A_SCOR_SCORE_VALUE_09")
	private BigDecimal aScorScoreValue09;

	@Column(name="A_SCOR_SCORE_VALUE_10")
	private BigDecimal aScorScoreValue10;

	@Column(name="A_SCOR_SCORE_VALUE_11")
	private BigDecimal aScorScoreValue11;

	@Column(name="A_SCOR_SCORE_VALUE_12")
	private BigDecimal aScorScoreValue12;

	@Column(name="A_SCOR_SCORE_VALUE_13")
	private BigDecimal aScorScoreValue13;

	@Column(name="A_SCOR_SCORE_VALUE_14")
	private BigDecimal aScorScoreValue14;

	@Column(name="A_SCOR_SCORE_VALUE_15")
	private BigDecimal aScorScoreValue15;

	@Column(name="A_SCOR_SCORE_VALUE_16")
	private BigDecimal aScorScoreValue16;

	@Column(name="A_SCOR_SCORE_VALUE_17")
	private BigDecimal aScorScoreValue17;

	@Column(name="A_SCOR_SCORE_VALUE_18")
	private BigDecimal aScorScoreValue18;

	@Column(name="A_SCOR_SCORE_VALUE_19")
	private BigDecimal aScorScoreValue19;

	@Column(name="A_SCOR_SCORE_VALUE_20")
	private BigDecimal aScorScoreValue20;

	@Column(name="A_SCOR_SCORECARD_ID")
	private String aScorScorecardId;

	@Column(name="A_SCOR_SCORECARD_NAME")
	private String aScorScorecardName;

	@Column(name="A_SCOR_SUM_SCORES")
	private BigDecimal aScorSumScores;

	@Column(name="A_SCOR_VALUEA_01")
	private String aScorValuea01;

	@Column(name="A_SCOR_VALUEA_02")
	private String aScorValuea02;

	@Column(name="A_SCOR_VALUEA_03")
	private String aScorValuea03;

	@Column(name="A_SCOR_VALUEA_04")
	private String aScorValuea04;

	@Column(name="A_SCOR_VALUEA_05")
	private String aScorValuea05;

	@Column(name="A_SCOR_VALUEA_06")
	private String aScorValuea06;

	@Column(name="A_SCOR_VALUEA_07")
	private String aScorValuea07;

	@Column(name="A_SCOR_VALUEA_08")
	private String aScorValuea08;

	@Column(name="A_SCOR_VALUEA_09")
	private String aScorValuea09;

	@Column(name="A_SCOR_VALUEA_10")
	private String aScorValuea10;

	@Column(name="A_SCOR_VALUEA_11")
	private String aScorValuea11;

	@Column(name="A_SCOR_VALUEA_12")
	private String aScorValuea12;

	@Column(name="A_SCOR_VALUEA_13")
	private String aScorValuea13;

	@Column(name="A_SCOR_VALUEA_14")
	private String aScorValuea14;

	@Column(name="A_SCOR_VALUEA_15")
	private String aScorValuea15;

	@Column(name="A_SCOR_VALUEA_16")
	private String aScorValuea16;

	@Column(name="A_SCOR_VALUEA_17")
	private String aScorValuea17;

	@Column(name="A_SCOR_VALUEA_18")
	private String aScorValuea18;

	@Column(name="A_SCOR_VALUEA_19")
	private String aScorValuea19;

	@Column(name="A_SCOR_VALUEA_20")
	private String aScorValuea20;

	@Column(name="A_SCOR_VALUEB_01")
	private String aScorValueb01;

	@Column(name="A_SCOR_VALUEB_02")
	private String aScorValueb02;

	@Column(name="A_SCOR_VALUEB_03")
	private String aScorValueb03;

	@Column(name="A_SCOR_VALUEB_04")
	private String aScorValueb04;

	@Column(name="A_SCOR_VALUEB_05")
	private String aScorValueb05;

	@Column(name="A_SCOR_VALUEB_06")
	private String aScorValueb06;

	@Column(name="A_SCOR_VALUEB_07")
	private String aScorValueb07;

	@Column(name="A_SCOR_VALUEB_08")
	private String aScorValueb08;

	@Column(name="A_SCOR_VALUEB_09")
	private String aScorValueb09;

	@Column(name="A_SCOR_VALUEB_10")
	private String aScorValueb10;

	@Column(name="A_SCOR_VALUEB_11")
	private String aScorValueb11;

	@Column(name="A_SCOR_VALUEB_12")
	private String aScorValueb12;

	@Column(name="A_SCOR_VALUEB_13")
	private String aScorValueb13;

	@Column(name="A_SCOR_VALUEB_14")
	private String aScorValueb14;

	@Column(name="A_SCOR_VALUEB_15")
	private String aScorValueb15;

	@Column(name="A_SCOR_VALUEB_16")
	private String aScorValueb16;

	@Column(name="A_SCOR_VALUEB_17")
	private String aScorValueb17;

	@Column(name="A_SCOR_VALUEB_18")
	private String aScorValueb18;

	@Column(name="A_SCOR_VALUEB_19")
	private String aScorValueb19;

	@Column(name="A_SCOR_VALUEB_20")
	private String aScorValueb20;

	@Column(name="A_SCOR_VERSION_DATE")
	private String aScorVersionDate;

	@Column(name="A_SCOR_VERSION_NUMBER")
	private String aScorVersionNumber;

	private BigDecimal cic;

	@Column(name="COMP_TREE_LEAF_NODE_ID")
	private String compTreeLeafNodeId;

	@Column(name="COMP_TREE_LEAF_NODE_NAME")
	private String compTreeLeafNodeName;

	@Column(name="CONTRACT_NUMBER")
	private BigDecimal contractNumber;

	@Column(name="REQUEST_ID")
	private BigDecimal requestId;

	@Column(name="SCOR_APPEND_DB_CODE")
	private String scorAppendDbCode;

	@Column(name="SCOR_APPLICATION_ID")
	private String scorApplicationId;

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

	@Column(name="SCOR_DB_TABLE_CODE")
	private String scorDbTableCode;

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

	@Column(name="SCOR_PROGRESS_NUMBER")
	private BigDecimal scorProgressNumber;

	@Column(name="SCOR_SCORING_REQUEST_TYPE")
	private String scorScoringRequestType;

	@Column(name="SCOR_SCORING_SOURCE")
	private String scorScoringSource;

	@Column(name="SCOR_SCORING_STAGE")
	private String scorScoringStage;

	@Column(name="SCOR_TRANSACTION_ID")
	private String scorTransactionId;

	@Column(name="SCORING_RUN_DATE")
	private String scoringRunDate;

	@Column(name="SCORING_SEGMENT")
	private String scoringSegment;

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
	private BigDecimal testGrpRandomNumber;

	@Column(name="TEST_GRP_TEST_GROUP_ID")
	private String testGrpTestGroupId;

	@Column(name="TEST_GRP_TEST_GROUP_NAME")
	private String testGrpTestGroupName;

	@Column(name="TEST_GRP_TEST_GROUP_SET_ID")
	private String testGrpTestGroupSetId;

	@Column(name="TEST_GRP_TEST_GROUP_SET_NAME")
	private String testGrpTestGroupSetName;

	@Column(name="UNIQUE_GENERATED_ID")
	private String uniqueGeneratedId;

	@Column(name="UNIQUE_ID")
	private BigDecimal uniqueId;

	public AScoreResponse() {
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
	
	public String getAScorApprovalDelegation() {
		return this.aScorApprovalDelegation;
	}

	public void setAScorApprovalDelegation(String aScorApprovalDelegation) {
		this.aScorApprovalDelegation = aScorApprovalDelegation;
	}

	public String getAScorElement01() {
		return this.aScorElement01;
	}

	public void setAScorElement01(String aScorElement01) {
		this.aScorElement01 = aScorElement01;
	}

	public String getAScorElement02() {
		return this.aScorElement02;
	}

	public void setAScorElement02(String aScorElement02) {
		this.aScorElement02 = aScorElement02;
	}

	public String getAScorElement03() {
		return this.aScorElement03;
	}

	public void setAScorElement03(String aScorElement03) {
		this.aScorElement03 = aScorElement03;
	}

	public String getAScorElement04() {
		return this.aScorElement04;
	}

	public void setAScorElement04(String aScorElement04) {
		this.aScorElement04 = aScorElement04;
	}

	public String getAScorElement05() {
		return this.aScorElement05;
	}

	public void setAScorElement05(String aScorElement05) {
		this.aScorElement05 = aScorElement05;
	}

	public String getAScorElement06() {
		return this.aScorElement06;
	}

	public void setAScorElement06(String aScorElement06) {
		this.aScorElement06 = aScorElement06;
	}

	public String getAScorElement07() {
		return this.aScorElement07;
	}

	public void setAScorElement07(String aScorElement07) {
		this.aScorElement07 = aScorElement07;
	}

	public String getAScorElement08() {
		return this.aScorElement08;
	}

	public void setAScorElement08(String aScorElement08) {
		this.aScorElement08 = aScorElement08;
	}

	public String getAScorElement09() {
		return this.aScorElement09;
	}

	public void setAScorElement09(String aScorElement09) {
		this.aScorElement09 = aScorElement09;
	}

	public String getAScorElement10() {
		return this.aScorElement10;
	}

	public void setAScorElement10(String aScorElement10) {
		this.aScorElement10 = aScorElement10;
	}

	public String getAScorElement11() {
		return this.aScorElement11;
	}

	public void setAScorElement11(String aScorElement11) {
		this.aScorElement11 = aScorElement11;
	}

	public String getAScorElement12() {
		return this.aScorElement12;
	}

	public void setAScorElement12(String aScorElement12) {
		this.aScorElement12 = aScorElement12;
	}

	public String getAScorElement13() {
		return this.aScorElement13;
	}

	public void setAScorElement13(String aScorElement13) {
		this.aScorElement13 = aScorElement13;
	}

	public String getAScorElement14() {
		return this.aScorElement14;
	}

	public void setAScorElement14(String aScorElement14) {
		this.aScorElement14 = aScorElement14;
	}

	public String getAScorElement15() {
		return this.aScorElement15;
	}

	public void setAScorElement15(String aScorElement15) {
		this.aScorElement15 = aScorElement15;
	}

	public String getAScorElement16() {
		return this.aScorElement16;
	}

	public void setAScorElement16(String aScorElement16) {
		this.aScorElement16 = aScorElement16;
	}

	public String getAScorElement17() {
		return this.aScorElement17;
	}

	public void setAScorElement17(String aScorElement17) {
		this.aScorElement17 = aScorElement17;
	}

	public String getAScorElement18() {
		return this.aScorElement18;
	}

	public void setAScorElement18(String aScorElement18) {
		this.aScorElement18 = aScorElement18;
	}

	public String getAScorElement19() {
		return this.aScorElement19;
	}

	public void setAScorElement19(String aScorElement19) {
		this.aScorElement19 = aScorElement19;
	}

	public String getAScorElement20() {
		return this.aScorElement20;
	}

	public void setAScorElement20(String aScorElement20) {
		this.aScorElement20 = aScorElement20;
	}

	public String getAScorField01() {
		return this.aScorField01;
	}

	public void setAScorField01(String aScorField01) {
		this.aScorField01 = aScorField01;
	}

	public String getAScorField02() {
		return this.aScorField02;
	}

	public void setAScorField02(String aScorField02) {
		this.aScorField02 = aScorField02;
	}

	public String getAScorField03() {
		return this.aScorField03;
	}

	public void setAScorField03(String aScorField03) {
		this.aScorField03 = aScorField03;
	}

	public String getAScorField04() {
		return this.aScorField04;
	}

	public void setAScorField04(String aScorField04) {
		this.aScorField04 = aScorField04;
	}

	public String getAScorField05() {
		return this.aScorField05;
	}

	public void setAScorField05(String aScorField05) {
		this.aScorField05 = aScorField05;
	}

	public String getAScorField06() {
		return this.aScorField06;
	}

	public void setAScorField06(String aScorField06) {
		this.aScorField06 = aScorField06;
	}

	public String getAScorField07() {
		return this.aScorField07;
	}

	public void setAScorField07(String aScorField07) {
		this.aScorField07 = aScorField07;
	}

	public String getAScorField08() {
		return this.aScorField08;
	}

	public void setAScorField08(String aScorField08) {
		this.aScorField08 = aScorField08;
	}

	public String getAScorField09() {
		return this.aScorField09;
	}

	public void setAScorField09(String aScorField09) {
		this.aScorField09 = aScorField09;
	}

	public String getAScorField10() {
		return this.aScorField10;
	}

	public void setAScorField10(String aScorField10) {
		this.aScorField10 = aScorField10;
	}

	public String getAScorField11() {
		return this.aScorField11;
	}

	public void setAScorField11(String aScorField11) {
		this.aScorField11 = aScorField11;
	}

	public String getAScorField12() {
		return this.aScorField12;
	}

	public void setAScorField12(String aScorField12) {
		this.aScorField12 = aScorField12;
	}

	public String getAScorField13() {
		return this.aScorField13;
	}

	public void setAScorField13(String aScorField13) {
		this.aScorField13 = aScorField13;
	}

	public String getAScorField14() {
		return this.aScorField14;
	}

	public void setAScorField14(String aScorField14) {
		this.aScorField14 = aScorField14;
	}

	public String getAScorField15() {
		return this.aScorField15;
	}

	public void setAScorField15(String aScorField15) {
		this.aScorField15 = aScorField15;
	}

	public String getAScorField16() {
		return this.aScorField16;
	}

	public void setAScorField16(String aScorField16) {
		this.aScorField16 = aScorField16;
	}

	public String getAScorField17() {
		return this.aScorField17;
	}

	public void setAScorField17(String aScorField17) {
		this.aScorField17 = aScorField17;
	}

	public String getAScorField18() {
		return this.aScorField18;
	}

	public void setAScorField18(String aScorField18) {
		this.aScorField18 = aScorField18;
	}

	public String getAScorField19() {
		return this.aScorField19;
	}

	public void setAScorField19(String aScorField19) {
		this.aScorField19 = aScorField19;
	}

	public String getAScorField20() {
		return this.aScorField20;
	}

	public void setAScorField20(String aScorField20) {
		this.aScorField20 = aScorField20;
	}

	public String getAScorOutcome01() {
		return this.aScorOutcome01;
	}

	public void setAScorOutcome01(String aScorOutcome01) {
		this.aScorOutcome01 = aScorOutcome01;
	}

	public String getAScorOutcome02() {
		return this.aScorOutcome02;
	}

	public void setAScorOutcome02(String aScorOutcome02) {
		this.aScorOutcome02 = aScorOutcome02;
	}

	public String getAScorOutcome03() {
		return this.aScorOutcome03;
	}

	public void setAScorOutcome03(String aScorOutcome03) {
		this.aScorOutcome03 = aScorOutcome03;
	}

	public String getAScorOutcome04() {
		return this.aScorOutcome04;
	}

	public void setAScorOutcome04(String aScorOutcome04) {
		this.aScorOutcome04 = aScorOutcome04;
	}

	public String getAScorOutcome05() {
		return this.aScorOutcome05;
	}

	public void setAScorOutcome05(String aScorOutcome05) {
		this.aScorOutcome05 = aScorOutcome05;
	}

	public String getAScorOutcome06() {
		return this.aScorOutcome06;
	}

	public void setAScorOutcome06(String aScorOutcome06) {
		this.aScorOutcome06 = aScorOutcome06;
	}

	public String getAScorOutcome07() {
		return this.aScorOutcome07;
	}

	public void setAScorOutcome07(String aScorOutcome07) {
		this.aScorOutcome07 = aScorOutcome07;
	}

	public String getAScorOutcome08() {
		return this.aScorOutcome08;
	}

	public void setAScorOutcome08(String aScorOutcome08) {
		this.aScorOutcome08 = aScorOutcome08;
	}

	public String getAScorOutcome09() {
		return this.aScorOutcome09;
	}

	public void setAScorOutcome09(String aScorOutcome09) {
		this.aScorOutcome09 = aScorOutcome09;
	}

	public String getAScorOutcome10() {
		return this.aScorOutcome10;
	}

	public void setAScorOutcome10(String aScorOutcome10) {
		this.aScorOutcome10 = aScorOutcome10;
	}

	public String getAScorOutcome11() {
		return this.aScorOutcome11;
	}

	public void setAScorOutcome11(String aScorOutcome11) {
		this.aScorOutcome11 = aScorOutcome11;
	}

	public String getAScorOutcome12() {
		return this.aScorOutcome12;
	}

	public void setAScorOutcome12(String aScorOutcome12) {
		this.aScorOutcome12 = aScorOutcome12;
	}

	public String getAScorOutcome13() {
		return this.aScorOutcome13;
	}

	public void setAScorOutcome13(String aScorOutcome13) {
		this.aScorOutcome13 = aScorOutcome13;
	}

	public String getAScorOutcome14() {
		return this.aScorOutcome14;
	}

	public void setAScorOutcome14(String aScorOutcome14) {
		this.aScorOutcome14 = aScorOutcome14;
	}

	public String getAScorOutcome15() {
		return this.aScorOutcome15;
	}

	public void setAScorOutcome15(String aScorOutcome15) {
		this.aScorOutcome15 = aScorOutcome15;
	}

	public String getAScorOutcome16() {
		return this.aScorOutcome16;
	}

	public void setAScorOutcome16(String aScorOutcome16) {
		this.aScorOutcome16 = aScorOutcome16;
	}

	public String getAScorOutcome17() {
		return this.aScorOutcome17;
	}

	public void setAScorOutcome17(String aScorOutcome17) {
		this.aScorOutcome17 = aScorOutcome17;
	}

	public String getAScorOutcome18() {
		return this.aScorOutcome18;
	}

	public void setAScorOutcome18(String aScorOutcome18) {
		this.aScorOutcome18 = aScorOutcome18;
	}

	public String getAScorOutcome19() {
		return this.aScorOutcome19;
	}

	public void setAScorOutcome19(String aScorOutcome19) {
		this.aScorOutcome19 = aScorOutcome19;
	}

	public String getAScorOutcome20() {
		return this.aScorOutcome20;
	}

	public void setAScorOutcome20(String aScorOutcome20) {
		this.aScorOutcome20 = aScorOutcome20;
	}

	public BigDecimal getAScorPdEstimate() {
		return this.aScorPdEstimate;
	}

	public void setAScorPdEstimate(BigDecimal aScorPdEstimate) {
		this.aScorPdEstimate = aScorPdEstimate;
	}

	public BigDecimal getAScorPdFactor() {
		return this.aScorPdFactor;
	}

	public void setAScorPdFactor(BigDecimal aScorPdFactor) {
		this.aScorPdFactor = aScorPdFactor;
	}

	public BigDecimal getAScorPdOffset() {
		return this.aScorPdOffset;
	}

	public void setAScorPdOffset(BigDecimal aScorPdOffset) {
		this.aScorPdOffset = aScorPdOffset;
	}

	public String getAScorProductFamily() {
		return this.aScorProductFamily;
	}

	public void setAScorProductFamily(String aScorProductFamily) {
		this.aScorProductFamily = aScorProductFamily;
	}

	public String getAScorRiskProfile() {
		return this.aScorRiskProfile;
	}

	public void setAScorRiskProfile(String aScorRiskProfile) {
		this.aScorRiskProfile = aScorRiskProfile;
	}

	public String getAScorRiskRating() {
		return this.aScorRiskRating;
	}

	public void setAScorRiskRating(String aScorRiskRating) {
		this.aScorRiskRating = aScorRiskRating;
	}

	public BigDecimal getAScorScore() {
		return this.aScorScore;
	}

	public void setAScorScore(BigDecimal aScorScore) {
		this.aScorScore = aScorScore;
	}

	public BigDecimal getAScorScoreValue01() {
		return this.aScorScoreValue01;
	}

	public void setAScorScoreValue01(BigDecimal aScorScoreValue01) {
		this.aScorScoreValue01 = aScorScoreValue01;
	}

	public BigDecimal getAScorScoreValue02() {
		return this.aScorScoreValue02;
	}

	public void setAScorScoreValue02(BigDecimal aScorScoreValue02) {
		this.aScorScoreValue02 = aScorScoreValue02;
	}

	public BigDecimal getAScorScoreValue03() {
		return this.aScorScoreValue03;
	}

	public void setAScorScoreValue03(BigDecimal aScorScoreValue03) {
		this.aScorScoreValue03 = aScorScoreValue03;
	}

	public BigDecimal getAScorScoreValue04() {
		return this.aScorScoreValue04;
	}

	public void setAScorScoreValue04(BigDecimal aScorScoreValue04) {
		this.aScorScoreValue04 = aScorScoreValue04;
	}

	public BigDecimal getAScorScoreValue05() {
		return this.aScorScoreValue05;
	}

	public void setAScorScoreValue05(BigDecimal aScorScoreValue05) {
		this.aScorScoreValue05 = aScorScoreValue05;
	}

	public BigDecimal getAScorScoreValue06() {
		return this.aScorScoreValue06;
	}

	public void setAScorScoreValue06(BigDecimal aScorScoreValue06) {
		this.aScorScoreValue06 = aScorScoreValue06;
	}

	public BigDecimal getAScorScoreValue07() {
		return this.aScorScoreValue07;
	}

	public void setAScorScoreValue07(BigDecimal aScorScoreValue07) {
		this.aScorScoreValue07 = aScorScoreValue07;
	}

	public BigDecimal getAScorScoreValue08() {
		return this.aScorScoreValue08;
	}

	public void setAScorScoreValue08(BigDecimal aScorScoreValue08) {
		this.aScorScoreValue08 = aScorScoreValue08;
	}

	public BigDecimal getAScorScoreValue09() {
		return this.aScorScoreValue09;
	}

	public void setAScorScoreValue09(BigDecimal aScorScoreValue09) {
		this.aScorScoreValue09 = aScorScoreValue09;
	}

	public BigDecimal getAScorScoreValue10() {
		return this.aScorScoreValue10;
	}

	public void setAScorScoreValue10(BigDecimal aScorScoreValue10) {
		this.aScorScoreValue10 = aScorScoreValue10;
	}

	public BigDecimal getAScorScoreValue11() {
		return this.aScorScoreValue11;
	}

	public void setAScorScoreValue11(BigDecimal aScorScoreValue11) {
		this.aScorScoreValue11 = aScorScoreValue11;
	}

	public BigDecimal getAScorScoreValue12() {
		return this.aScorScoreValue12;
	}

	public void setAScorScoreValue12(BigDecimal aScorScoreValue12) {
		this.aScorScoreValue12 = aScorScoreValue12;
	}

	public BigDecimal getAScorScoreValue13() {
		return this.aScorScoreValue13;
	}

	public void setAScorScoreValue13(BigDecimal aScorScoreValue13) {
		this.aScorScoreValue13 = aScorScoreValue13;
	}

	public BigDecimal getAScorScoreValue14() {
		return this.aScorScoreValue14;
	}

	public void setAScorScoreValue14(BigDecimal aScorScoreValue14) {
		this.aScorScoreValue14 = aScorScoreValue14;
	}

	public BigDecimal getAScorScoreValue15() {
		return this.aScorScoreValue15;
	}

	public void setAScorScoreValue15(BigDecimal aScorScoreValue15) {
		this.aScorScoreValue15 = aScorScoreValue15;
	}

	public BigDecimal getAScorScoreValue16() {
		return this.aScorScoreValue16;
	}

	public void setAScorScoreValue16(BigDecimal aScorScoreValue16) {
		this.aScorScoreValue16 = aScorScoreValue16;
	}

	public BigDecimal getAScorScoreValue17() {
		return this.aScorScoreValue17;
	}

	public void setAScorScoreValue17(BigDecimal aScorScoreValue17) {
		this.aScorScoreValue17 = aScorScoreValue17;
	}

	public BigDecimal getAScorScoreValue18() {
		return this.aScorScoreValue18;
	}

	public void setAScorScoreValue18(BigDecimal aScorScoreValue18) {
		this.aScorScoreValue18 = aScorScoreValue18;
	}

	public BigDecimal getAScorScoreValue19() {
		return this.aScorScoreValue19;
	}

	public void setAScorScoreValue19(BigDecimal aScorScoreValue19) {
		this.aScorScoreValue19 = aScorScoreValue19;
	}

	public BigDecimal getAScorScoreValue20() {
		return this.aScorScoreValue20;
	}

	public void setAScorScoreValue20(BigDecimal aScorScoreValue20) {
		this.aScorScoreValue20 = aScorScoreValue20;
	}

	public String getAScorScorecardId() {
		return this.aScorScorecardId;
	}

	public void setAScorScorecardId(String aScorScorecardId) {
		this.aScorScorecardId = aScorScorecardId;
	}

	public String getAScorScorecardName() {
		return this.aScorScorecardName;
	}

	public void setAScorScorecardName(String aScorScorecardName) {
		this.aScorScorecardName = aScorScorecardName;
	}

	public BigDecimal getAScorSumScores() {
		return this.aScorSumScores;
	}

	public void setAScorSumScores(BigDecimal aScorSumScores) {
		this.aScorSumScores = aScorSumScores;
	}

	public String getAScorValuea01() {
		return this.aScorValuea01;
	}

	public void setAScorValuea01(String aScorValuea01) {
		this.aScorValuea01 = aScorValuea01;
	}

	public String getAScorValuea02() {
		return this.aScorValuea02;
	}

	public void setAScorValuea02(String aScorValuea02) {
		this.aScorValuea02 = aScorValuea02;
	}

	public String getAScorValuea03() {
		return this.aScorValuea03;
	}

	public void setAScorValuea03(String aScorValuea03) {
		this.aScorValuea03 = aScorValuea03;
	}

	public String getAScorValuea04() {
		return this.aScorValuea04;
	}

	public void setAScorValuea04(String aScorValuea04) {
		this.aScorValuea04 = aScorValuea04;
	}

	public String getAScorValuea05() {
		return this.aScorValuea05;
	}

	public void setAScorValuea05(String aScorValuea05) {
		this.aScorValuea05 = aScorValuea05;
	}

	public String getAScorValuea06() {
		return this.aScorValuea06;
	}

	public void setAScorValuea06(String aScorValuea06) {
		this.aScorValuea06 = aScorValuea06;
	}

	public String getAScorValuea07() {
		return this.aScorValuea07;
	}

	public void setAScorValuea07(String aScorValuea07) {
		this.aScorValuea07 = aScorValuea07;
	}

	public String getAScorValuea08() {
		return this.aScorValuea08;
	}

	public void setAScorValuea08(String aScorValuea08) {
		this.aScorValuea08 = aScorValuea08;
	}

	public String getAScorValuea09() {
		return this.aScorValuea09;
	}

	public void setAScorValuea09(String aScorValuea09) {
		this.aScorValuea09 = aScorValuea09;
	}

	public String getAScorValuea10() {
		return this.aScorValuea10;
	}

	public void setAScorValuea10(String aScorValuea10) {
		this.aScorValuea10 = aScorValuea10;
	}

	public String getAScorValuea11() {
		return this.aScorValuea11;
	}

	public void setAScorValuea11(String aScorValuea11) {
		this.aScorValuea11 = aScorValuea11;
	}

	public String getAScorValuea12() {
		return this.aScorValuea12;
	}

	public void setAScorValuea12(String aScorValuea12) {
		this.aScorValuea12 = aScorValuea12;
	}

	public String getAScorValuea13() {
		return this.aScorValuea13;
	}

	public void setAScorValuea13(String aScorValuea13) {
		this.aScorValuea13 = aScorValuea13;
	}

	public String getAScorValuea14() {
		return this.aScorValuea14;
	}

	public void setAScorValuea14(String aScorValuea14) {
		this.aScorValuea14 = aScorValuea14;
	}

	public String getAScorValuea15() {
		return this.aScorValuea15;
	}

	public void setAScorValuea15(String aScorValuea15) {
		this.aScorValuea15 = aScorValuea15;
	}

	public String getAScorValuea16() {
		return this.aScorValuea16;
	}

	public void setAScorValuea16(String aScorValuea16) {
		this.aScorValuea16 = aScorValuea16;
	}

	public String getAScorValuea17() {
		return this.aScorValuea17;
	}

	public void setAScorValuea17(String aScorValuea17) {
		this.aScorValuea17 = aScorValuea17;
	}

	public String getAScorValuea18() {
		return this.aScorValuea18;
	}

	public void setAScorValuea18(String aScorValuea18) {
		this.aScorValuea18 = aScorValuea18;
	}

	public String getAScorValuea19() {
		return this.aScorValuea19;
	}

	public void setAScorValuea19(String aScorValuea19) {
		this.aScorValuea19 = aScorValuea19;
	}

	public String getAScorValuea20() {
		return this.aScorValuea20;
	}

	public void setAScorValuea20(String aScorValuea20) {
		this.aScorValuea20 = aScorValuea20;
	}

	public String getAScorValueb01() {
		return this.aScorValueb01;
	}

	public void setAScorValueb01(String aScorValueb01) {
		this.aScorValueb01 = aScorValueb01;
	}

	public String getAScorValueb02() {
		return this.aScorValueb02;
	}

	public void setAScorValueb02(String aScorValueb02) {
		this.aScorValueb02 = aScorValueb02;
	}

	public String getAScorValueb03() {
		return this.aScorValueb03;
	}

	public void setAScorValueb03(String aScorValueb03) {
		this.aScorValueb03 = aScorValueb03;
	}

	public String getAScorValueb04() {
		return this.aScorValueb04;
	}

	public void setAScorValueb04(String aScorValueb04) {
		this.aScorValueb04 = aScorValueb04;
	}

	public String getAScorValueb05() {
		return this.aScorValueb05;
	}

	public void setAScorValueb05(String aScorValueb05) {
		this.aScorValueb05 = aScorValueb05;
	}

	public String getAScorValueb06() {
		return this.aScorValueb06;
	}

	public void setAScorValueb06(String aScorValueb06) {
		this.aScorValueb06 = aScorValueb06;
	}

	public String getAScorValueb07() {
		return this.aScorValueb07;
	}

	public void setAScorValueb07(String aScorValueb07) {
		this.aScorValueb07 = aScorValueb07;
	}

	public String getAScorValueb08() {
		return this.aScorValueb08;
	}

	public void setAScorValueb08(String aScorValueb08) {
		this.aScorValueb08 = aScorValueb08;
	}

	public String getAScorValueb09() {
		return this.aScorValueb09;
	}

	public void setAScorValueb09(String aScorValueb09) {
		this.aScorValueb09 = aScorValueb09;
	}

	public String getAScorValueb10() {
		return this.aScorValueb10;
	}

	public void setAScorValueb10(String aScorValueb10) {
		this.aScorValueb10 = aScorValueb10;
	}

	public String getAScorValueb11() {
		return this.aScorValueb11;
	}

	public void setAScorValueb11(String aScorValueb11) {
		this.aScorValueb11 = aScorValueb11;
	}

	public String getAScorValueb12() {
		return this.aScorValueb12;
	}

	public void setAScorValueb12(String aScorValueb12) {
		this.aScorValueb12 = aScorValueb12;
	}

	public String getAScorValueb13() {
		return this.aScorValueb13;
	}

	public void setAScorValueb13(String aScorValueb13) {
		this.aScorValueb13 = aScorValueb13;
	}

	public String getAScorValueb14() {
		return this.aScorValueb14;
	}

	public void setAScorValueb14(String aScorValueb14) {
		this.aScorValueb14 = aScorValueb14;
	}

	public String getAScorValueb15() {
		return this.aScorValueb15;
	}

	public void setAScorValueb15(String aScorValueb15) {
		this.aScorValueb15 = aScorValueb15;
	}

	public String getAScorValueb16() {
		return this.aScorValueb16;
	}

	public void setAScorValueb16(String aScorValueb16) {
		this.aScorValueb16 = aScorValueb16;
	}

	public String getAScorValueb17() {
		return this.aScorValueb17;
	}

	public void setAScorValueb17(String aScorValueb17) {
		this.aScorValueb17 = aScorValueb17;
	}

	public String getAScorValueb18() {
		return this.aScorValueb18;
	}

	public void setAScorValueb18(String aScorValueb18) {
		this.aScorValueb18 = aScorValueb18;
	}

	public String getAScorValueb19() {
		return this.aScorValueb19;
	}

	public void setAScorValueb19(String aScorValueb19) {
		this.aScorValueb19 = aScorValueb19;
	}

	public String getAScorValueb20() {
		return this.aScorValueb20;
	}

	public void setAScorValueb20(String aScorValueb20) {
		this.aScorValueb20 = aScorValueb20;
	}

	public String getAScorVersionDate() {
		return this.aScorVersionDate;
	}

	public void setAScorVersionDate(String aScorVersionDate) {
		this.aScorVersionDate = aScorVersionDate;
	}

	public String getAScorVersionNumber() {
		return this.aScorVersionNumber;
	}

	public void setAScorVersionNumber(String aScorVersionNumber) {
		this.aScorVersionNumber = aScorVersionNumber;
	}

	public BigDecimal getCic() {
		return this.cic;
	}

	public void setCic(BigDecimal cic) {
		this.cic = cic;
	}

	public String getCompTreeLeafNodeId() {
		return this.compTreeLeafNodeId;
	}

	public void setCompTreeLeafNodeId(String compTreeLeafNodeId) {
		this.compTreeLeafNodeId = compTreeLeafNodeId;
	}

	public String getCompTreeLeafNodeName() {
		return this.compTreeLeafNodeName;
	}

	public void setCompTreeLeafNodeName(String compTreeLeafNodeName) {
		this.compTreeLeafNodeName = compTreeLeafNodeName;
	}

	public BigDecimal getContractNumber() {
		return this.contractNumber;
	}

	public void setContractNumber(BigDecimal contractNumber) {
		this.contractNumber = contractNumber;
	}

	public BigDecimal getRequestId() {
		return this.requestId;
	}

	public void setRequestId(BigDecimal requestId) {
		this.requestId = requestId;
	}

	public String getScorAppendDbCode() {
		return this.scorAppendDbCode;
	}

	public void setScorAppendDbCode(String scorAppendDbCode) {
		this.scorAppendDbCode = scorAppendDbCode;
	}

	public String getScorApplicationId() {
		return this.scorApplicationId;
	}

	public void setScorApplicationId(String scorApplicationId) {
		this.scorApplicationId = scorApplicationId;
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

	public String getScorDbTableCode() {
		return this.scorDbTableCode;
	}

	public void setScorDbTableCode(String scorDbTableCode) {
		this.scorDbTableCode = scorDbTableCode;
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

	public BigDecimal getScorProgressNumber() {
		return this.scorProgressNumber;
	}

	public void setScorProgressNumber(BigDecimal scorProgressNumber) {
		this.scorProgressNumber = scorProgressNumber;
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

	public String getScorScoringStage() {
		return this.scorScoringStage;
	}

	public void setScorScoringStage(String scorScoringStage) {
		this.scorScoringStage = scorScoringStage;
	}

	public String getScorTransactionId() {
		return this.scorTransactionId;
	}

	public void setScorTransactionId(String scorTransactionId) {
		this.scorTransactionId = scorTransactionId;
	}

	public String getScoringRunDate() {
		return this.scoringRunDate;
	}

	public void setScoringRunDate(String scoringRunDate) {
		this.scoringRunDate = scoringRunDate;
	}

	public String getScoringSegment() {
		return this.scoringSegment;
	}

	public void setScoringSegment(String scoringSegment) {
		this.scoringSegment = scoringSegment;
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

	public BigDecimal getTestGrpRandomNumber() {
		return this.testGrpRandomNumber;
	}

	public void setTestGrpRandomNumber(BigDecimal testGrpRandomNumber) {
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

	public String getUniqueGeneratedId() {
		return this.uniqueGeneratedId;
	}

	public void setUniqueGeneratedId(String uniqueGeneratedId) {
		this.uniqueGeneratedId = uniqueGeneratedId;
	}

	public BigDecimal getUniqueId() {
		return this.uniqueId;
	}

	public void setUniqueId(BigDecimal uniqueId) {
		this.uniqueId = uniqueId;
	}

}