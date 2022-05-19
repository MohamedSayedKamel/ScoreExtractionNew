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
 * The persistent class for the A_SCORE_REQUEST database table.
 * 
 */
@Entity
@Table(name="A_SCORE_REQUEST")
@NamedQuery(name="AScoreRequest.findAll", query="SELECT a FROM AScoreRequest a")
public class AScoreRequest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="A_SCORE_REQUEST_REQUESTID_GENERATOR", sequenceName="A_SCORE_REQUEST_ID_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="A_SCORE_REQUEST_REQUESTID_GENERATOR")
	@Column(name="REQUEST_ID")
	private long requestId;

	@Column(name="RUN_ID")
	private BigDecimal runId;
	
	@Column(name="ARMS_ARMS_BOOK_VALUE")
	private BigDecimal armsArmsBookValue;

	@Column(name="ARMS_ARMS_COLL_AREA")
	private String armsArmsCollArea;

	@Column(name="ARMS_ARMS_CONTRACT_NUMBER")
	private String armsArmsContractNumber;

	@Column(name="ARMS_ARMS_MANUFACTURE_YEAR")
	private BigDecimal armsArmsManufactureYear;

	@Column(name="ARMS_ARMS_MITIGANT_CODE")
	private String armsArmsMitigantCode;

	@Column(name="ARMS_ARMS_MITIGANT_DESC")
	private String armsArmsMitigantDesc;

	@Column(name="ARMS_ARMS_MITIGANT_VAL_OWNER")
	private String armsArmsMitigantValOwner;

	@Column(name="ARMS_ARMS_MITIGANT_VALUE")
	private BigDecimal armsArmsMitigantValue;

	@Column(name="ARMS_ARMS_PROP_EVAL_STATUS")
	private BigDecimal armsArmsPropEvalStatus;

	@Column(name="ARMS_ARMS_PROPERTY_TYPE")
	private String armsArmsPropertyType;

	@Column(name="ARMS_ARMS_REGION")
	private String armsArmsRegion;

	@Column(name="ARMS_ARMS_VALUATION_DIFF")
	private BigDecimal armsArmsValuationDiff;

	@Column(name="ARMS_ARMS_VEHI_MANUFACT_YEAR")
	private BigDecimal armsArmsVehiManufactYear;

	@Column(name="ARMS_ARMS_VEHICLE_BRAND_NAME")
	private String armsArmsVehicleBrandName;

	@Column(name="ARMS_ARMS_VEHICLE_BRAND_TYPE")
	private String armsArmsVehicleBrandType;

	@Column(name="CARD_BRANCH_SHOWROOM_ACC")
	private String cardBranchShowroomAcc;

	@Column(name="CARD_PRIMARY_CARD_FLG")
	private String cardPrimaryCardFlg;

	@Column(name="CARD_SUPPLEMENTARY_CARD_LIMIT")
	private BigDecimal cardSupplementaryCardLimit;

	@Column(name="CASA_AVERAGE_BAL_MONTH_M0")
	private BigDecimal casaAverageBalMonthM0;

	@Column(name="CASA_AVERAGE_BAL_MONTH_M1")
	private BigDecimal casaAverageBalMonthM1;

	@Column(name="CASA_AVERAGE_BAL_MONTH_M10")
	private BigDecimal casaAverageBalMonthM10;

	@Column(name="CASA_AVERAGE_BAL_MONTH_M11")
	private BigDecimal casaAverageBalMonthM11;

	@Column(name="CASA_AVERAGE_BAL_MONTH_M2")
	private BigDecimal casaAverageBalMonthM2;

	@Column(name="CASA_AVERAGE_BAL_MONTH_M3")
	private BigDecimal casaAverageBalMonthM3;

	@Column(name="CASA_AVERAGE_BAL_MONTH_M4")
	private BigDecimal casaAverageBalMonthM4;

	@Column(name="CASA_AVERAGE_BAL_MONTH_M5")
	private BigDecimal casaAverageBalMonthM5;

	@Column(name="CASA_AVERAGE_BAL_MONTH_M6")
	private BigDecimal casaAverageBalMonthM6;

	@Column(name="CASA_AVERAGE_BAL_MONTH_M7")
	private BigDecimal casaAverageBalMonthM7;

	@Column(name="CASA_AVERAGE_BAL_MONTH_M8")
	private BigDecimal casaAverageBalMonthM8;

	@Column(name="CASA_AVERAGE_BAL_MONTH_M9")
	private BigDecimal casaAverageBalMonthM9;

	@Column(name="CONT_ACCOUNT_ID")
	private String contAccountId;

	@Column(name="CONT_ACCRUED_INT")
	private BigDecimal contAccruedInt;

	@Column(name="CONT_ADD_RATE")
	private BigDecimal contAddRate;

	@Temporal(TemporalType.DATE)
	@Column(name="CONT_APPLICATION_DATE")
	private Date contApplicationDate;

	@Temporal(TemporalType.DATE)
	@Column(name="CONT_APPROVAL_DATE")
	private Date contApprovalDate;

	@Column(name="CONT_BALLOON_AMOUNT")
	private BigDecimal contBalloonAmount;

	@Column(name="CONT_BASIC_SALARY_AMOUNT")
	private BigDecimal contBasicSalaryAmount;

	@Column(name="CONT_BRANCH_LOAN_APPLIED")
	private String contBranchLoanApplied;

	@Column(name="CONT_BRANCH_SHOWROOM_ACC")
	private String contBranchShowroomAcc;

	@Column(name="CONT_BRANCH_SHOWROOM_ACC_CODE")
	private String contBranchShowroomAccCode;

	@Column(name="CONT_BRANCH_SHOWROOM_CODE")
	private String contBranchShowroomCode;

	@Column(name="CONT_BUSINESS_POSITION")
	private String contBusinessPosition;

	@Column(name="CONT_CHANNEL_CODE")
	private String contChannelCode;

	@Column(name="CONT_CIC")
	private BigDecimal contCic;

	@Column(name="CONT_CONTRACT_NUMBER")
	private BigDecimal contContractNumber;

	@Column(name="CONT_CUR_BOOK_BAL")
	private BigDecimal contCurBookBal;

	@Column(name="CONT_CURR_PAY")
	private BigDecimal contCurrPay;

	@Column(name="CONT_CURRENCY")
	private String contCurrency;

	@Column(name="CONT_CUS_SUBTYPE")
	private String contCusSubtype;

	@Column(name="CONT_CUSTOMER_SEGMENT")
	private String contCustomerSegment;

	@Column(name="CONT_DEBT_BURDEN_RATIO")
	private BigDecimal contDebtBurdenRatio;

	@Column(name="CONT_DELINQ_DAYS")
	private BigDecimal contDelinqDays;

	@Column(name="CONT_DEPENDENTS")
	private BigDecimal contDependents;

	@Column(name="CONT_DEPT_CODE")
	private String contDeptCode;

	@Column(name="CONT_DISBURSEMENT_AMOUNT")
	private BigDecimal contDisbursementAmount;

	@Temporal(TemporalType.DATE)
	@Column(name="CONT_DISBURSEMENT_DATE")
	private Date contDisbursementDate;

	@Column(name="CONT_DOWNPAYMENT_AMT")
	private BigDecimal contDownpaymentAmt;

	@Column(name="CONT_DURATION_IN_MONTH")
	private BigDecimal contDurationInMonth;

	@Column(name="CONT_EMP_COMPANY")
	private String contEmpCompany;

	@Column(name="CONT_EMP_DEPARTMENT")
	private String contEmpDepartment;

	@Column(name="CONT_EMPLOYEE_TYPE")
	private String contEmployeeType;

	@Column(name="CONT_EMPLOYER_CLASS_CODE")
	private String contEmployerClassCode;

	@Temporal(TemporalType.DATE)
	@Column(name="CONT_EMPLOYER_ENGAGEMENT_DATE")
	private Date contEmployerEngagementDate;

	@Column(name="CONT_END_SERVICE_BENEFIT_AMT")
	private BigDecimal contEndServiceBenefitAmt;

	@Column(name="CONT_FEES")
	private BigDecimal contFees;

	@Column(name="CONT_FINANCE_AMT")
	private BigDecimal contFinanceAmt;

	@Column(name="CONT_GROSS_SALARY")
	private BigDecimal contGrossSalary;

	@Column(name="CONT_H_CATEGORY_PRODUCT")
	private String contHCategoryProduct;

	@Column(name="CONT_INSTAL_AMT")
	private BigDecimal contInstalAmt;

	@Column(name="CONT_INSTAL_WITH_INSURANCE")
	private String contInstalWithInsurance;

	@Temporal(TemporalType.DATE)
	@Column(name="CONT_LAST_PAYMENT_DATE")
	private Date contLastPaymentDate;

	@Temporal(TemporalType.DATE)
	@Column(name="CONT_MATURE_DATE")
	private Date contMatureDate;

	@Column(name="CONT_MILITARY_RANK")
	private String contMilitaryRank;

	@Column(name="CONT_MONTHLY_ALLOWANCE_AMOUNT")
	private BigDecimal contMonthlyAllowanceAmount;

	@Column(name="CONT_MONTHLY_OTHER_INCOME_AMT")
	private BigDecimal contMonthlyOtherIncomeAmt;

	@Column(name="CONT_NET_BAL")
	private BigDecimal contNetBal;

	@Temporal(TemporalType.DATE)
	@Column(name="CONT_NEXT_PAY_DATE")
	private Date contNextPayDate;

	@Column(name="CONT_NO_OF_DELINQ_INST")
	private BigDecimal contNoOfDelinqInst;

	@Temporal(TemporalType.DATE)
	@Column(name="CONT_OPEN_DATE")
	private Date contOpenDate;

	@Column(name="CONT_ORG_UNIT")
	private String contOrgUnit;

	@Column(name="CONT_ORIG_APPROVAL_AMT")
	private BigDecimal contOrigApprovalAmt;

	@Column(name="CONT_ORIG_BALANCE")
	private BigDecimal contOrigBalance;

	@Column(name="CONT_ORIG_PAY")
	private BigDecimal contOrigPay;

	@Column(name="CONT_ORIG_PROFIT")
	private BigDecimal contOrigProfit;

	@Column(name="CONT_ORIG_TERM")
	private BigDecimal contOrigTerm;

	@Column(name="CONT_OTHER_MONTHLY_DEDUCT_AMT")
	private BigDecimal contOtherMonthlyDeductAmt;

	@Column(name="CONT_OUTSTANDING_ACCRUVAL_PFT")
	private BigDecimal contOutstandingAccruvalPft;

	@Column(name="CONT_OUTSTANDING_TOTAL_PFT")
	private BigDecimal contOutstandingTotalPft;

	@Column(name="CONT_PAY_FREQUENCY")
	private String contPayFrequency;

	@Column(name="CONT_PAYMENT_PRINCIPAL_AMT")
	private BigDecimal contPaymentPrincipalAmt;

	@Column(name="CONT_PRINCIPAL_OUTSTANDING")
	private BigDecimal contPrincipalOutstanding;

	@Column(name="CONT_PRODUCT_CODE")
	private String contProductCode;

	@Column(name="CONT_PRODUCT_TYPE")
	private String contProductType;

	@Column(name="CONT_PROFIT_RATE_SUB_TYPE")
	private String contProfitRateSubType;

	@Column(name="CONT_RATE")
	private BigDecimal contRate;

	@Column(name="CONT_RELATION_CONTRACT_TYPE")
	private String contRelationContractType;

	@Column(name="CONT_REMAIN_PAYMENTS")
	private BigDecimal contRemainPayments;

	@Column(name="CONT_REMAIN_TERM")
	private BigDecimal contRemainTerm;

	@Temporal(TemporalType.DATE)
	@Column(name="CONT_RUN_DATE")
	private Date contRunDate;

	@Column(name="CONT_SALARY_TRANSFER_TYPE")
	private String contSalaryTransferType;

	@Column(name="CONT_SALARY_TRANSFER_TYPE_CTF")
	private String contSalaryTransferTypeCtf;

	@Column(name="CONT_SALES_BRANCH")
	private String contSalesBranch;

	@Column(name="CONT_SALES_CD")
	private String contSalesCd;

	@Column(name="CONT_SALES_USERID")
	private String contSalesUserid;

	@Column(name="CONT_SUB_CODE")
	private String contSubCode;

	@Column(name="CONT_TERM")
	private BigDecimal contTerm;

	@Column(name="CONT_TOT_GRACE_PRD_PROFIT")
	private BigDecimal contTotGracePrdProfit;

	@Column(name="CONT_TOTAL_EARLY_PAYMENT_AMT")
	private BigDecimal contTotalEarlyPaymentAmt;

	@Column(name="CONT_TOTAL_INSTAL_DUE_AMT")
	private BigDecimal contTotalInstalDueAmt;

	@Column(name="CONT_TOTAL_PAYMENTS")
	private BigDecimal contTotalPayments;

	@Temporal(TemporalType.DATE)
	@Column(name="CONT_TRANSACTION_DATE")
	private Date contTransactionDate;

	@Temporal(TemporalType.DATE)
	@Column(name="CUST_CIC_OPEN_DATE")
	private Date custCicOpenDate;

	@Column(name="CUST_CITY")
	private String custCity;

	@Column(name="CUST_CIVIL_STATUS")
	private String custCivilStatus;

	@Temporal(TemporalType.DATE)
	@Column(name="CUST_DATE_OF_BIRTH")
	private Date custDateOfBirth;

	@Column(name="CUST_DISTRICT_CODE")
	private String custDistrictCode;

	@Column(name="CUST_EDUCATION_LEVEL")
	private String custEducationLevel;

	@Column(name="CUST_GENDER")
	private String custGender;

	@Column(name="CUST_HOUSE_OWNED_STATUS")
	private String custHouseOwnedStatus;

	@Column(name="CUST_MARITAL_STATUS")
	private String custMaritalStatus;

	@Column(name="CUST_NATIONALITY")
	private String custNationality;

	@Column(name="CUST_NUMBER_OF_CARS")
	private BigDecimal custNumberOfCars;

	@Column(name="CUST_OCCUPATION_TYPE")
	private String custOccupationType;

	@Column(name="CUST_REGION")
	private String custRegion;

	@Column(name="CUST_RESIDENT_STATUS")
	private String custResidentStatus;

	@Column(name="CUST_RESIDENT_TYPE")
	private String custResidentType;

	@Column(name="CUST_SALARY_TRANSFER_TYPE_CIF")
	private String custSalaryTransferTypeCif;

	@Column(name="PROCESS_STATUS")
	private String processStatus;

	@Column(name="RESP_RL_COMMUNICATIONS")
	private BigDecimal respRlCommunications;

	@Column(name="RESP_RL_EDUCATION_FEES")
	private BigDecimal respRlEducationFees;

	@Column(name="RESP_RL_FEES_ON_EXPATS")
	private BigDecimal respRlFeesOnExpats;

	@Column(name="RESP_RL_FOOD_BEVERAGES")
	private BigDecimal respRlFoodBeverages;

	@Column(name="RESP_RL_HEALTHCARE")
	private BigDecimal respRlHealthcare;

	@Column(name="RESP_RL_HOME_SERVANTS")
	private BigDecimal respRlHomeServants;

	@Column(name="RESP_RL_HOUSING")
	private BigDecimal respRlHousing;

	@Column(name="RESP_RL_OTHER_FUTURE_EXPENSES")
	private BigDecimal respRlOtherFutureExpenses;

	@Column(name="RESP_RL_OTHER_INCOME")
	private BigDecimal respRlOtherIncome;

	@Column(name="RESP_RL_OTHER_OBLIGATIONS")
	private BigDecimal respRlOtherObligations;

	@Column(name="RESP_RL_TOTAL_EXPENSES")
	private BigDecimal respRlTotalExpenses;

	@Column(name="RESP_RL_TRANSPORT")
	private BigDecimal respRlTransport;

	@Column(name="RESP_RL_UTILITIES")
	private BigDecimal respRlUtilities;

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

	@Temporal(TemporalType.DATE)
	@Column(name="SCOR_EXECUTION_DATE_TIME")
	private Date scorExecutionDateTime;

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

	@Column(name="SIMAH_CARD_OUTSTANDING_BAL")
	private BigDecimal simahCardOutstandingBal;

	@Column(name="SIMAH_CARD_PRODUCT_CODE")
	private String simahCardProductCode;

	@Column(name="SIMAH_CARD_PRODUCT_LIMIT")
	private BigDecimal simahCardProductLimit;

	@Column(name="SIMAH_CONTRACTUAL_PAY_AUTO")
	private BigDecimal simahContractualPayAuto;

	@Column(name="SIMAH_CONTRACTUAL_PAY_CRC")
	private BigDecimal simahContractualPayCrc;

	@Column(name="SIMAH_CONTRACTUAL_PAY_MTG")
	private BigDecimal simahContractualPayMtg;

	@Column(name="SIMAH_CONTRACTUAL_PAY_OTHER")
	private BigDecimal simahContractualPayOther;

	@Column(name="SIMAH_CONTRACTUAL_PAY_PLN")
	private BigDecimal simahContractualPayPln;

	@Column(name="SIMAH_CUR_WORST_DELINQ_AUTO")
	private String simahCurWorstDelinqAuto;

	@Column(name="SIMAH_CUR_WORST_DELINQ_CRC")
	private String simahCurWorstDelinqCrc;

	@Column(name="SIMAH_CUR_WORST_DELINQ_MTG")
	private String simahCurWorstDelinqMtg;

	@Column(name="SIMAH_CUR_WORST_DELINQ_OTHER")
	private String simahCurWorstDelinqOther;

	@Column(name="SIMAH_CUR_WORST_DELINQ_PLN")
	private String simahCurWorstDelinqPln;

	@Column(name="SIMAH_DEBT_BURDEN")
	private BigDecimal simahDebtBurden;

	@Column(name="SIMAH_DEBT_BURDEN_RATIO")
	private BigDecimal simahDebtBurdenRatio;

	@Column(name="SIMAH_NO_OF_BOUNCED_CHEQUE")
	private BigDecimal simahNoOfBouncedCheque;

	@Column(name="SIMAH_NO_OF_CI_DEFAULT_AUTO")
	private BigDecimal simahNoOfCiDefaultAuto;

	@Column(name="SIMAH_NO_OF_CI_DEFAULT_CRC")
	private BigDecimal simahNoOfCiDefaultCrc;

	@Column(name="SIMAH_NO_OF_CI_DEFAULT_MTG")
	private BigDecimal simahNoOfCiDefaultMtg;

	@Column(name="SIMAH_NO_OF_CI_DEFAULT_OTHER")
	private BigDecimal simahNoOfCiDefaultOther;

	@Column(name="SIMAH_NO_OF_CI_DEFAULT_PLN")
	private BigDecimal simahNoOfCiDefaultPln;

	@Column(name="SIMAH_NO_OF_DEFAULT_AUTO")
	private BigDecimal simahNoOfDefaultAuto;

	@Column(name="SIMAH_NO_OF_DEFAULT_CRC")
	private BigDecimal simahNoOfDefaultCrc;

	@Column(name="SIMAH_NO_OF_DEFAULT_MTG")
	private BigDecimal simahNoOfDefaultMtg;

	@Column(name="SIMAH_NO_OF_DEFAULT_OTHER")
	private BigDecimal simahNoOfDefaultOther;

	@Column(name="SIMAH_NO_OF_DEFAULT_PLN")
	private BigDecimal simahNoOfDefaultPln;

	@Column(name="SIMAH_NO_OF_ENQUIRIES_12M")
	private BigDecimal simahNoOfEnquiries12m;

	@Column(name="SIMAH_NO_OF_ENQUIRIES_30D")
	private BigDecimal simahNoOfEnquiries30d;

	@Column(name="SIMAH_NO_OF_EXECUTED_EXJUDG")
	private BigDecimal simahNoOfExecutedExjudg;

	@Column(name="SIMAH_NO_OF_LOANS")
	private BigDecimal simahNoOfLoans;

	@Column(name="SIMAH_NO_OF_NOTEXEC_EXJUDG")
	private BigDecimal simahNoOfNotexecExjudg;

	@Column(name="SIMAH_OUTSTAND_BAL_NOTEXJUDG")
	private BigDecimal simahOutstandBalNotexjudg;

	@Column(name="SIMAH_SIMAH_SCORE")
	private BigDecimal simahSimahScore;

	@Column(name="SIMAH_SIMAH_SCORE_VERSION")
	private String simahSimahScoreVersion;

	@Column(name="SIMAH_SUMMED_SALARY")
	private BigDecimal simahSummedSalary;

	@Column(name="SIMAH_TOTAL_LIABILITIES")
	private BigDecimal simahTotalLiabilities;

	@Column(name="SIMAH_TOTAL_LIMIT")
	private BigDecimal simahTotalLimit;

	@Column(name="SIMAH_TOTAL_REVOLVING_LIAB")
	private BigDecimal simahTotalRevolvingLiab;

	@Column(name="SIMAH_TOTAL_REVOLVING_LIMIT")
	private BigDecimal simahTotalRevolvingLimit;

	@Column(name="SIMAH_WORST_DELINQ_24M_AUTO")
	private String simahWorstDelinq24mAuto;

	@Column(name="SIMAH_WORST_DELINQ_24M_CRC")
	private String simahWorstDelinq24mCrc;

	@Column(name="SIMAH_WORST_DELINQ_24M_MTG")
	private String simahWorstDelinq24mMtg;

	@Column(name="SIMAH_WORST_DELINQ_24M_OTHER")
	private String simahWorstDelinq24mOther;

	@Column(name="SIMAH_WORST_DELINQ_24M_PLN")
	private String simahWorstDelinq24mPln;

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

	public AScoreRequest() {
	}

	public long getRequestId() {
		return this.requestId;
	}

	public void setRequestId(long requestId) {
		this.requestId = requestId;
	}

	public BigDecimal getRunId() {
		return this.runId;
	}

	public void setRunId(BigDecimal runId) {
		this.runId = runId;
	}
	
	public BigDecimal getArmsArmsBookValue() {
		return this.armsArmsBookValue;
	}

	public void setArmsArmsBookValue(BigDecimal armsArmsBookValue) {
		this.armsArmsBookValue = armsArmsBookValue;
	}

	public String getArmsArmsCollArea() {
		return this.armsArmsCollArea;
	}

	public void setArmsArmsCollArea(String armsArmsCollArea) {
		this.armsArmsCollArea = armsArmsCollArea;
	}

	public String getArmsArmsContractNumber() {
		return this.armsArmsContractNumber;
	}

	public void setArmsArmsContractNumber(String armsArmsContractNumber) {
		this.armsArmsContractNumber = armsArmsContractNumber;
	}

	public BigDecimal getArmsArmsManufactureYear() {
		return this.armsArmsManufactureYear;
	}

	public void setArmsArmsManufactureYear(BigDecimal armsArmsManufactureYear) {
		this.armsArmsManufactureYear = armsArmsManufactureYear;
	}

	public String getArmsArmsMitigantCode() {
		return this.armsArmsMitigantCode;
	}

	public void setArmsArmsMitigantCode(String armsArmsMitigantCode) {
		this.armsArmsMitigantCode = armsArmsMitigantCode;
	}

	public String getArmsArmsMitigantDesc() {
		return this.armsArmsMitigantDesc;
	}

	public void setArmsArmsMitigantDesc(String armsArmsMitigantDesc) {
		this.armsArmsMitigantDesc = armsArmsMitigantDesc;
	}

	public String getArmsArmsMitigantValOwner() {
		return this.armsArmsMitigantValOwner;
	}

	public void setArmsArmsMitigantValOwner(String armsArmsMitigantValOwner) {
		this.armsArmsMitigantValOwner = armsArmsMitigantValOwner;
	}

	public BigDecimal getArmsArmsMitigantValue() {
		return this.armsArmsMitigantValue;
	}

	public void setArmsArmsMitigantValue(BigDecimal armsArmsMitigantValue) {
		this.armsArmsMitigantValue = armsArmsMitigantValue;
	}

	public BigDecimal getArmsArmsPropEvalStatus() {
		return this.armsArmsPropEvalStatus;
	}

	public void setArmsArmsPropEvalStatus(BigDecimal armsArmsPropEvalStatus) {
		this.armsArmsPropEvalStatus = armsArmsPropEvalStatus;
	}

	public String getArmsArmsPropertyType() {
		return this.armsArmsPropertyType;
	}

	public void setArmsArmsPropertyType(String armsArmsPropertyType) {
		this.armsArmsPropertyType = armsArmsPropertyType;
	}

	public String getArmsArmsRegion() {
		return this.armsArmsRegion;
	}

	public void setArmsArmsRegion(String armsArmsRegion) {
		this.armsArmsRegion = armsArmsRegion;
	}

	public BigDecimal getArmsArmsValuationDiff() {
		return this.armsArmsValuationDiff;
	}

	public void setArmsArmsValuationDiff(BigDecimal armsArmsValuationDiff) {
		this.armsArmsValuationDiff = armsArmsValuationDiff;
	}

	public BigDecimal getArmsArmsVehiManufactYear() {
		return this.armsArmsVehiManufactYear;
	}

	public void setArmsArmsVehiManufactYear(BigDecimal armsArmsVehiManufactYear) {
		this.armsArmsVehiManufactYear = armsArmsVehiManufactYear;
	}

	public String getArmsArmsVehicleBrandName() {
		return this.armsArmsVehicleBrandName;
	}

	public void setArmsArmsVehicleBrandName(String armsArmsVehicleBrandName) {
		this.armsArmsVehicleBrandName = armsArmsVehicleBrandName;
	}

	public String getArmsArmsVehicleBrandType() {
		return this.armsArmsVehicleBrandType;
	}

	public void setArmsArmsVehicleBrandType(String armsArmsVehicleBrandType) {
		this.armsArmsVehicleBrandType = armsArmsVehicleBrandType;
	}

	public String getCardBranchShowroomAcc() {
		return this.cardBranchShowroomAcc;
	}

	public void setCardBranchShowroomAcc(String cardBranchShowroomAcc) {
		this.cardBranchShowroomAcc = cardBranchShowroomAcc;
	}

	public String getCardPrimaryCardFlg() {
		return this.cardPrimaryCardFlg;
	}

	public void setCardPrimaryCardFlg(String cardPrimaryCardFlg) {
		this.cardPrimaryCardFlg = cardPrimaryCardFlg;
	}

	public BigDecimal getCardSupplementaryCardLimit() {
		return this.cardSupplementaryCardLimit;
	}

	public void setCardSupplementaryCardLimit(BigDecimal cardSupplementaryCardLimit) {
		this.cardSupplementaryCardLimit = cardSupplementaryCardLimit;
	}

	public BigDecimal getCasaAverageBalMonthM0() {
		return this.casaAverageBalMonthM0;
	}

	public void setCasaAverageBalMonthM0(BigDecimal casaAverageBalMonthM0) {
		this.casaAverageBalMonthM0 = casaAverageBalMonthM0;
	}

	public BigDecimal getCasaAverageBalMonthM1() {
		return this.casaAverageBalMonthM1;
	}

	public void setCasaAverageBalMonthM1(BigDecimal casaAverageBalMonthM1) {
		this.casaAverageBalMonthM1 = casaAverageBalMonthM1;
	}

	public BigDecimal getCasaAverageBalMonthM10() {
		return this.casaAverageBalMonthM10;
	}

	public void setCasaAverageBalMonthM10(BigDecimal casaAverageBalMonthM10) {
		this.casaAverageBalMonthM10 = casaAverageBalMonthM10;
	}

	public BigDecimal getCasaAverageBalMonthM11() {
		return this.casaAverageBalMonthM11;
	}

	public void setCasaAverageBalMonthM11(BigDecimal casaAverageBalMonthM11) {
		this.casaAverageBalMonthM11 = casaAverageBalMonthM11;
	}

	public BigDecimal getCasaAverageBalMonthM2() {
		return this.casaAverageBalMonthM2;
	}

	public void setCasaAverageBalMonthM2(BigDecimal casaAverageBalMonthM2) {
		this.casaAverageBalMonthM2 = casaAverageBalMonthM2;
	}

	public BigDecimal getCasaAverageBalMonthM3() {
		return this.casaAverageBalMonthM3;
	}

	public void setCasaAverageBalMonthM3(BigDecimal casaAverageBalMonthM3) {
		this.casaAverageBalMonthM3 = casaAverageBalMonthM3;
	}

	public BigDecimal getCasaAverageBalMonthM4() {
		return this.casaAverageBalMonthM4;
	}

	public void setCasaAverageBalMonthM4(BigDecimal casaAverageBalMonthM4) {
		this.casaAverageBalMonthM4 = casaAverageBalMonthM4;
	}

	public BigDecimal getCasaAverageBalMonthM5() {
		return this.casaAverageBalMonthM5;
	}

	public void setCasaAverageBalMonthM5(BigDecimal casaAverageBalMonthM5) {
		this.casaAverageBalMonthM5 = casaAverageBalMonthM5;
	}

	public BigDecimal getCasaAverageBalMonthM6() {
		return this.casaAverageBalMonthM6;
	}

	public void setCasaAverageBalMonthM6(BigDecimal casaAverageBalMonthM6) {
		this.casaAverageBalMonthM6 = casaAverageBalMonthM6;
	}

	public BigDecimal getCasaAverageBalMonthM7() {
		return this.casaAverageBalMonthM7;
	}

	public void setCasaAverageBalMonthM7(BigDecimal casaAverageBalMonthM7) {
		this.casaAverageBalMonthM7 = casaAverageBalMonthM7;
	}

	public BigDecimal getCasaAverageBalMonthM8() {
		return this.casaAverageBalMonthM8;
	}

	public void setCasaAverageBalMonthM8(BigDecimal casaAverageBalMonthM8) {
		this.casaAverageBalMonthM8 = casaAverageBalMonthM8;
	}

	public BigDecimal getCasaAverageBalMonthM9() {
		return this.casaAverageBalMonthM9;
	}

	public void setCasaAverageBalMonthM9(BigDecimal casaAverageBalMonthM9) {
		this.casaAverageBalMonthM9 = casaAverageBalMonthM9;
	}

	public String getContAccountId() {
		return this.contAccountId;
	}

	public void setContAccountId(String contAccountId) {
		this.contAccountId = contAccountId;
	}

	public BigDecimal getContAccruedInt() {
		return this.contAccruedInt;
	}

	public void setContAccruedInt(BigDecimal contAccruedInt) {
		this.contAccruedInt = contAccruedInt;
	}

	public BigDecimal getContAddRate() {
		return this.contAddRate;
	}

	public void setContAddRate(BigDecimal contAddRate) {
		this.contAddRate = contAddRate;
	}

	public Date getContApplicationDate() {
		return this.contApplicationDate;
	}

	public void setContApplicationDate(Date contApplicationDate) {
		this.contApplicationDate = contApplicationDate;
	}

	public Date getContApprovalDate() {
		return this.contApprovalDate;
	}

	public void setContApprovalDate(Date contApprovalDate) {
		this.contApprovalDate = contApprovalDate;
	}

	public BigDecimal getContBalloonAmount() {
		return this.contBalloonAmount;
	}

	public void setContBalloonAmount(BigDecimal contBalloonAmount) {
		this.contBalloonAmount = contBalloonAmount;
	}

	public BigDecimal getContBasicSalaryAmount() {
		return this.contBasicSalaryAmount;
	}

	public void setContBasicSalaryAmount(BigDecimal contBasicSalaryAmount) {
		this.contBasicSalaryAmount = contBasicSalaryAmount;
	}

	public String getContBranchLoanApplied() {
		return this.contBranchLoanApplied;
	}

	public void setContBranchLoanApplied(String contBranchLoanApplied) {
		this.contBranchLoanApplied = contBranchLoanApplied;
	}

	public String getContBranchShowroomAcc() {
		return this.contBranchShowroomAcc;
	}

	public void setContBranchShowroomAcc(String contBranchShowroomAcc) {
		this.contBranchShowroomAcc = contBranchShowroomAcc;
	}

	public String getContBranchShowroomAccCode() {
		return this.contBranchShowroomAccCode;
	}

	public void setContBranchShowroomAccCode(String contBranchShowroomAccCode) {
		this.contBranchShowroomAccCode = contBranchShowroomAccCode;
	}

	public String getContBranchShowroomCode() {
		return this.contBranchShowroomCode;
	}

	public void setContBranchShowroomCode(String contBranchShowroomCode) {
		this.contBranchShowroomCode = contBranchShowroomCode;
	}

	public String getContBusinessPosition() {
		return this.contBusinessPosition;
	}

	public void setContBusinessPosition(String contBusinessPosition) {
		this.contBusinessPosition = contBusinessPosition;
	}

	public String getContChannelCode() {
		return this.contChannelCode;
	}

	public void setContChannelCode(String contChannelCode) {
		this.contChannelCode = contChannelCode;
	}

	public BigDecimal getContCic() {
		return this.contCic;
	}

	public void setContCic(BigDecimal contCic) {
		this.contCic = contCic;
	}

	public BigDecimal getContContractNumber() {
		return this.contContractNumber;
	}

	public void setContContractNumber(BigDecimal contContractNumber) {
		this.contContractNumber = contContractNumber;
	}

	public BigDecimal getContCurBookBal() {
		return this.contCurBookBal;
	}

	public void setContCurBookBal(BigDecimal contCurBookBal) {
		this.contCurBookBal = contCurBookBal;
	}

	public BigDecimal getContCurrPay() {
		return this.contCurrPay;
	}

	public void setContCurrPay(BigDecimal contCurrPay) {
		this.contCurrPay = contCurrPay;
	}

	public String getContCurrency() {
		return this.contCurrency;
	}

	public void setContCurrency(String contCurrency) {
		this.contCurrency = contCurrency;
	}

	public String getContCusSubtype() {
		return this.contCusSubtype;
	}

	public void setContCusSubtype(String contCusSubtype) {
		this.contCusSubtype = contCusSubtype;
	}

	public String getContCustomerSegment() {
		return this.contCustomerSegment;
	}

	public void setContCustomerSegment(String contCustomerSegment) {
		this.contCustomerSegment = contCustomerSegment;
	}

	public BigDecimal getContDebtBurdenRatio() {
		return this.contDebtBurdenRatio;
	}

	public void setContDebtBurdenRatio(BigDecimal contDebtBurdenRatio) {
		this.contDebtBurdenRatio = contDebtBurdenRatio;
	}

	public BigDecimal getContDelinqDays() {
		return this.contDelinqDays;
	}

	public void setContDelinqDays(BigDecimal contDelinqDays) {
		this.contDelinqDays = contDelinqDays;
	}

	public BigDecimal getContDependents() {
		return this.contDependents;
	}

	public void setContDependents(BigDecimal contDependents) {
		this.contDependents = contDependents;
	}

	public String getContDeptCode() {
		return this.contDeptCode;
	}

	public void setContDeptCode(String contDeptCode) {
		this.contDeptCode = contDeptCode;
	}

	public BigDecimal getContDisbursementAmount() {
		return this.contDisbursementAmount;
	}

	public void setContDisbursementAmount(BigDecimal contDisbursementAmount) {
		this.contDisbursementAmount = contDisbursementAmount;
	}

	public Date getContDisbursementDate() {
		return this.contDisbursementDate;
	}

	public void setContDisbursementDate(Date contDisbursementDate) {
		this.contDisbursementDate = contDisbursementDate;
	}

	public BigDecimal getContDownpaymentAmt() {
		return this.contDownpaymentAmt;
	}

	public void setContDownpaymentAmt(BigDecimal contDownpaymentAmt) {
		this.contDownpaymentAmt = contDownpaymentAmt;
	}

	public BigDecimal getContDurationInMonth() {
		return this.contDurationInMonth;
	}

	public void setContDurationInMonth(BigDecimal contDurationInMonth) {
		this.contDurationInMonth = contDurationInMonth;
	}

	public String getContEmpCompany() {
		return this.contEmpCompany;
	}

	public void setContEmpCompany(String contEmpCompany) {
		this.contEmpCompany = contEmpCompany;
	}

	public String getContEmpDepartment() {
		return this.contEmpDepartment;
	}

	public void setContEmpDepartment(String contEmpDepartment) {
		this.contEmpDepartment = contEmpDepartment;
	}

	public String getContEmployeeType() {
		return this.contEmployeeType;
	}

	public void setContEmployeeType(String contEmployeeType) {
		this.contEmployeeType = contEmployeeType;
	}

	public String getContEmployerClassCode() {
		return this.contEmployerClassCode;
	}

	public void setContEmployerClassCode(String contEmployerClassCode) {
		this.contEmployerClassCode = contEmployerClassCode;
	}

	public Date getContEmployerEngagementDate() {
		return this.contEmployerEngagementDate;
	}

	public void setContEmployerEngagementDate(Date contEmployerEngagementDate) {
		this.contEmployerEngagementDate = contEmployerEngagementDate;
	}

	public BigDecimal getContEndServiceBenefitAmt() {
		return this.contEndServiceBenefitAmt;
	}

	public void setContEndServiceBenefitAmt(BigDecimal contEndServiceBenefitAmt) {
		this.contEndServiceBenefitAmt = contEndServiceBenefitAmt;
	}

	public BigDecimal getContFees() {
		return this.contFees;
	}

	public void setContFees(BigDecimal contFees) {
		this.contFees = contFees;
	}

	public BigDecimal getContFinanceAmt() {
		return this.contFinanceAmt;
	}

	public void setContFinanceAmt(BigDecimal contFinanceAmt) {
		this.contFinanceAmt = contFinanceAmt;
	}

	public BigDecimal getContGrossSalary() {
		return this.contGrossSalary;
	}

	public void setContGrossSalary(BigDecimal contGrossSalary) {
		this.contGrossSalary = contGrossSalary;
	}

	public String getContHCategoryProduct() {
		return this.contHCategoryProduct;
	}

	public void setContHCategoryProduct(String contHCategoryProduct) {
		this.contHCategoryProduct = contHCategoryProduct;
	}

	public BigDecimal getContInstalAmt() {
		return this.contInstalAmt;
	}

	public void setContInstalAmt(BigDecimal contInstalAmt) {
		this.contInstalAmt = contInstalAmt;
	}

	public String getContInstalWithInsurance() {
		return this.contInstalWithInsurance;
	}

	public void setContInstalWithInsurance(String contInstalWithInsurance) {
		this.contInstalWithInsurance = contInstalWithInsurance;
	}

	public Date getContLastPaymentDate() {
		return this.contLastPaymentDate;
	}

	public void setContLastPaymentDate(Date contLastPaymentDate) {
		this.contLastPaymentDate = contLastPaymentDate;
	}

	public Date getContMatureDate() {
		return this.contMatureDate;
	}

	public void setContMatureDate(Date contMatureDate) {
		this.contMatureDate = contMatureDate;
	}

	public String getContMilitaryRank() {
		return this.contMilitaryRank;
	}

	public void setContMilitaryRank(String contMilitaryRank) {
		this.contMilitaryRank = contMilitaryRank;
	}

	public BigDecimal getContMonthlyAllowanceAmount() {
		return this.contMonthlyAllowanceAmount;
	}

	public void setContMonthlyAllowanceAmount(BigDecimal contMonthlyAllowanceAmount) {
		this.contMonthlyAllowanceAmount = contMonthlyAllowanceAmount;
	}

	public BigDecimal getContMonthlyOtherIncomeAmt() {
		return this.contMonthlyOtherIncomeAmt;
	}

	public void setContMonthlyOtherIncomeAmt(BigDecimal contMonthlyOtherIncomeAmt) {
		this.contMonthlyOtherIncomeAmt = contMonthlyOtherIncomeAmt;
	}

	public BigDecimal getContNetBal() {
		return this.contNetBal;
	}

	public void setContNetBal(BigDecimal contNetBal) {
		this.contNetBal = contNetBal;
	}

	public Date getContNextPayDate() {
		return this.contNextPayDate;
	}

	public void setContNextPayDate(Date contNextPayDate) {
		this.contNextPayDate = contNextPayDate;
	}

	public BigDecimal getContNoOfDelinqInst() {
		return this.contNoOfDelinqInst;
	}

	public void setContNoOfDelinqInst(BigDecimal contNoOfDelinqInst) {
		this.contNoOfDelinqInst = contNoOfDelinqInst;
	}

	public Date getContOpenDate() {
		return this.contOpenDate;
	}

	public void setContOpenDate(Date contOpenDate) {
		this.contOpenDate = contOpenDate;
	}

	public String getContOrgUnit() {
		return this.contOrgUnit;
	}

	public void setContOrgUnit(String contOrgUnit) {
		this.contOrgUnit = contOrgUnit;
	}

	public BigDecimal getContOrigApprovalAmt() {
		return this.contOrigApprovalAmt;
	}

	public void setContOrigApprovalAmt(BigDecimal contOrigApprovalAmt) {
		this.contOrigApprovalAmt = contOrigApprovalAmt;
	}

	public BigDecimal getContOrigBalance() {
		return this.contOrigBalance;
	}

	public void setContOrigBalance(BigDecimal contOrigBalance) {
		this.contOrigBalance = contOrigBalance;
	}

	public BigDecimal getContOrigPay() {
		return this.contOrigPay;
	}

	public void setContOrigPay(BigDecimal contOrigPay) {
		this.contOrigPay = contOrigPay;
	}

	public BigDecimal getContOrigProfit() {
		return this.contOrigProfit;
	}

	public void setContOrigProfit(BigDecimal contOrigProfit) {
		this.contOrigProfit = contOrigProfit;
	}

	public BigDecimal getContOrigTerm() {
		return this.contOrigTerm;
	}

	public void setContOrigTerm(BigDecimal contOrigTerm) {
		this.contOrigTerm = contOrigTerm;
	}

	public BigDecimal getContOtherMonthlyDeductAmt() {
		return this.contOtherMonthlyDeductAmt;
	}

	public void setContOtherMonthlyDeductAmt(BigDecimal contOtherMonthlyDeductAmt) {
		this.contOtherMonthlyDeductAmt = contOtherMonthlyDeductAmt;
	}

	public BigDecimal getContOutstandingAccruvalPft() {
		return this.contOutstandingAccruvalPft;
	}

	public void setContOutstandingAccruvalPft(BigDecimal contOutstandingAccruvalPft) {
		this.contOutstandingAccruvalPft = contOutstandingAccruvalPft;
	}

	public BigDecimal getContOutstandingTotalPft() {
		return this.contOutstandingTotalPft;
	}

	public void setContOutstandingTotalPft(BigDecimal contOutstandingTotalPft) {
		this.contOutstandingTotalPft = contOutstandingTotalPft;
	}

	public String getContPayFrequency() {
		return this.contPayFrequency;
	}

	public void setContPayFrequency(String contPayFrequency) {
		this.contPayFrequency = contPayFrequency;
	}

	public BigDecimal getContPaymentPrincipalAmt() {
		return this.contPaymentPrincipalAmt;
	}

	public void setContPaymentPrincipalAmt(BigDecimal contPaymentPrincipalAmt) {
		this.contPaymentPrincipalAmt = contPaymentPrincipalAmt;
	}

	public BigDecimal getContPrincipalOutstanding() {
		return this.contPrincipalOutstanding;
	}

	public void setContPrincipalOutstanding(BigDecimal contPrincipalOutstanding) {
		this.contPrincipalOutstanding = contPrincipalOutstanding;
	}

	public String getContProductCode() {
		return this.contProductCode;
	}

	public void setContProductCode(String contProductCode) {
		this.contProductCode = contProductCode;
	}

	public String getContProductType() {
		return this.contProductType;
	}

	public void setContProductType(String contProductType) {
		this.contProductType = contProductType;
	}

	public String getContProfitRateSubType() {
		return this.contProfitRateSubType;
	}

	public void setContProfitRateSubType(String contProfitRateSubType) {
		this.contProfitRateSubType = contProfitRateSubType;
	}

	public BigDecimal getContRate() {
		return this.contRate;
	}

	public void setContRate(BigDecimal contRate) {
		this.contRate = contRate;
	}

	public String getContRelationContractType() {
		return this.contRelationContractType;
	}

	public void setContRelationContractType(String contRelationContractType) {
		this.contRelationContractType = contRelationContractType;
	}

	public BigDecimal getContRemainPayments() {
		return this.contRemainPayments;
	}

	public void setContRemainPayments(BigDecimal contRemainPayments) {
		this.contRemainPayments = contRemainPayments;
	}

	public BigDecimal getContRemainTerm() {
		return this.contRemainTerm;
	}

	public void setContRemainTerm(BigDecimal contRemainTerm) {
		this.contRemainTerm = contRemainTerm;
	}

	public Date getContRunDate() {
		return this.contRunDate;
	}

	public void setContRunDate(Date contRunDate) {
		this.contRunDate = contRunDate;
	}

	public String getContSalaryTransferType() {
		return this.contSalaryTransferType;
	}

	public void setContSalaryTransferType(String contSalaryTransferType) {
		this.contSalaryTransferType = contSalaryTransferType;
	}

	public String getContSalaryTransferTypeCtf() {
		return this.contSalaryTransferTypeCtf;
	}

	public void setContSalaryTransferTypeCtf(String contSalaryTransferTypeCtf) {
		this.contSalaryTransferTypeCtf = contSalaryTransferTypeCtf;
	}

	public String getContSalesBranch() {
		return this.contSalesBranch;
	}

	public void setContSalesBranch(String contSalesBranch) {
		this.contSalesBranch = contSalesBranch;
	}

	public String getContSalesCd() {
		return this.contSalesCd;
	}

	public void setContSalesCd(String contSalesCd) {
		this.contSalesCd = contSalesCd;
	}

	public String getContSalesUserid() {
		return this.contSalesUserid;
	}

	public void setContSalesUserid(String contSalesUserid) {
		this.contSalesUserid = contSalesUserid;
	}

	public String getContSubCode() {
		return this.contSubCode;
	}

	public void setContSubCode(String contSubCode) {
		this.contSubCode = contSubCode;
	}

	public BigDecimal getContTerm() {
		return this.contTerm;
	}

	public void setContTerm(BigDecimal contTerm) {
		this.contTerm = contTerm;
	}

	public BigDecimal getContTotGracePrdProfit() {
		return this.contTotGracePrdProfit;
	}

	public void setContTotGracePrdProfit(BigDecimal contTotGracePrdProfit) {
		this.contTotGracePrdProfit = contTotGracePrdProfit;
	}

	public BigDecimal getContTotalEarlyPaymentAmt() {
		return this.contTotalEarlyPaymentAmt;
	}

	public void setContTotalEarlyPaymentAmt(BigDecimal contTotalEarlyPaymentAmt) {
		this.contTotalEarlyPaymentAmt = contTotalEarlyPaymentAmt;
	}

	public BigDecimal getContTotalInstalDueAmt() {
		return this.contTotalInstalDueAmt;
	}

	public void setContTotalInstalDueAmt(BigDecimal contTotalInstalDueAmt) {
		this.contTotalInstalDueAmt = contTotalInstalDueAmt;
	}

	public BigDecimal getContTotalPayments() {
		return this.contTotalPayments;
	}

	public void setContTotalPayments(BigDecimal contTotalPayments) {
		this.contTotalPayments = contTotalPayments;
	}

	public Date getContTransactionDate() {
		return this.contTransactionDate;
	}

	public void setContTransactionDate(Date contTransactionDate) {
		this.contTransactionDate = contTransactionDate;
	}

	public Date getCustCicOpenDate() {
		return this.custCicOpenDate;
	}

	public void setCustCicOpenDate(Date custCicOpenDate) {
		this.custCicOpenDate = custCicOpenDate;
	}

	public String getCustCity() {
		return this.custCity;
	}

	public void setCustCity(String custCity) {
		this.custCity = custCity;
	}

	public String getCustCivilStatus() {
		return this.custCivilStatus;
	}

	public void setCustCivilStatus(String custCivilStatus) {
		this.custCivilStatus = custCivilStatus;
	}

	public Date getCustDateOfBirth() {
		return this.custDateOfBirth;
	}

	public void setCustDateOfBirth(Date custDateOfBirth) {
		this.custDateOfBirth = custDateOfBirth;
	}

	public String getCustDistrictCode() {
		return this.custDistrictCode;
	}

	public void setCustDistrictCode(String custDistrictCode) {
		this.custDistrictCode = custDistrictCode;
	}

	public String getCustEducationLevel() {
		return this.custEducationLevel;
	}

	public void setCustEducationLevel(String custEducationLevel) {
		this.custEducationLevel = custEducationLevel;
	}

	public String getCustGender() {
		return this.custGender;
	}

	public void setCustGender(String custGender) {
		this.custGender = custGender;
	}

	public String getCustHouseOwnedStatus() {
		return this.custHouseOwnedStatus;
	}

	public void setCustHouseOwnedStatus(String custHouseOwnedStatus) {
		this.custHouseOwnedStatus = custHouseOwnedStatus;
	}

	public String getCustMaritalStatus() {
		return this.custMaritalStatus;
	}

	public void setCustMaritalStatus(String custMaritalStatus) {
		this.custMaritalStatus = custMaritalStatus;
	}

	public String getCustNationality() {
		return this.custNationality;
	}

	public void setCustNationality(String custNationality) {
		this.custNationality = custNationality;
	}

	public BigDecimal getCustNumberOfCars() {
		return this.custNumberOfCars;
	}

	public void setCustNumberOfCars(BigDecimal custNumberOfCars) {
		this.custNumberOfCars = custNumberOfCars;
	}

	public String getCustOccupationType() {
		return this.custOccupationType;
	}

	public void setCustOccupationType(String custOccupationType) {
		this.custOccupationType = custOccupationType;
	}

	public String getCustRegion() {
		return this.custRegion;
	}

	public void setCustRegion(String custRegion) {
		this.custRegion = custRegion;
	}

	public String getCustResidentStatus() {
		return this.custResidentStatus;
	}

	public void setCustResidentStatus(String custResidentStatus) {
		this.custResidentStatus = custResidentStatus;
	}

	public String getCustResidentType() {
		return this.custResidentType;
	}

	public void setCustResidentType(String custResidentType) {
		this.custResidentType = custResidentType;
	}

	public String getCustSalaryTransferTypeCif() {
		return this.custSalaryTransferTypeCif;
	}

	public void setCustSalaryTransferTypeCif(String custSalaryTransferTypeCif) {
		this.custSalaryTransferTypeCif = custSalaryTransferTypeCif;
	}

	public String getProcessStatus() {
		return this.processStatus;
	}

	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}

	public BigDecimal getRespRlCommunications() {
		return this.respRlCommunications;
	}

	public void setRespRlCommunications(BigDecimal respRlCommunications) {
		this.respRlCommunications = respRlCommunications;
	}

	public BigDecimal getRespRlEducationFees() {
		return this.respRlEducationFees;
	}

	public void setRespRlEducationFees(BigDecimal respRlEducationFees) {
		this.respRlEducationFees = respRlEducationFees;
	}

	public BigDecimal getRespRlFeesOnExpats() {
		return this.respRlFeesOnExpats;
	}

	public void setRespRlFeesOnExpats(BigDecimal respRlFeesOnExpats) {
		this.respRlFeesOnExpats = respRlFeesOnExpats;
	}

	public BigDecimal getRespRlFoodBeverages() {
		return this.respRlFoodBeverages;
	}

	public void setRespRlFoodBeverages(BigDecimal respRlFoodBeverages) {
		this.respRlFoodBeverages = respRlFoodBeverages;
	}

	public BigDecimal getRespRlHealthcare() {
		return this.respRlHealthcare;
	}

	public void setRespRlHealthcare(BigDecimal respRlHealthcare) {
		this.respRlHealthcare = respRlHealthcare;
	}

	public BigDecimal getRespRlHomeServants() {
		return this.respRlHomeServants;
	}

	public void setRespRlHomeServants(BigDecimal respRlHomeServants) {
		this.respRlHomeServants = respRlHomeServants;
	}

	public BigDecimal getRespRlHousing() {
		return this.respRlHousing;
	}

	public void setRespRlHousing(BigDecimal respRlHousing) {
		this.respRlHousing = respRlHousing;
	}

	public BigDecimal getRespRlOtherFutureExpenses() {
		return this.respRlOtherFutureExpenses;
	}

	public void setRespRlOtherFutureExpenses(BigDecimal respRlOtherFutureExpenses) {
		this.respRlOtherFutureExpenses = respRlOtherFutureExpenses;
	}

	public BigDecimal getRespRlOtherIncome() {
		return this.respRlOtherIncome;
	}

	public void setRespRlOtherIncome(BigDecimal respRlOtherIncome) {
		this.respRlOtherIncome = respRlOtherIncome;
	}

	public BigDecimal getRespRlOtherObligations() {
		return this.respRlOtherObligations;
	}

	public void setRespRlOtherObligations(BigDecimal respRlOtherObligations) {
		this.respRlOtherObligations = respRlOtherObligations;
	}

	public BigDecimal getRespRlTotalExpenses() {
		return this.respRlTotalExpenses;
	}

	public void setRespRlTotalExpenses(BigDecimal respRlTotalExpenses) {
		this.respRlTotalExpenses = respRlTotalExpenses;
	}

	public BigDecimal getRespRlTransport() {
		return this.respRlTransport;
	}

	public void setRespRlTransport(BigDecimal respRlTransport) {
		this.respRlTransport = respRlTransport;
	}

	public BigDecimal getRespRlUtilities() {
		return this.respRlUtilities;
	}

	public void setRespRlUtilities(BigDecimal respRlUtilities) {
		this.respRlUtilities = respRlUtilities;
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

	public Date getScorExecutionDateTime() {
		return this.scorExecutionDateTime;
	}

	public void setScorExecutionDateTime(Date scorExecutionDateTime) {
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

	public BigDecimal getSimahCardOutstandingBal() {
		return this.simahCardOutstandingBal;
	}

	public void setSimahCardOutstandingBal(BigDecimal simahCardOutstandingBal) {
		this.simahCardOutstandingBal = simahCardOutstandingBal;
	}

	public String getSimahCardProductCode() {
		return this.simahCardProductCode;
	}

	public void setSimahCardProductCode(String simahCardProductCode) {
		this.simahCardProductCode = simahCardProductCode;
	}

	public BigDecimal getSimahCardProductLimit() {
		return this.simahCardProductLimit;
	}

	public void setSimahCardProductLimit(BigDecimal simahCardProductLimit) {
		this.simahCardProductLimit = simahCardProductLimit;
	}

	public BigDecimal getSimahContractualPayAuto() {
		return this.simahContractualPayAuto;
	}

	public void setSimahContractualPayAuto(BigDecimal simahContractualPayAuto) {
		this.simahContractualPayAuto = simahContractualPayAuto;
	}

	public BigDecimal getSimahContractualPayCrc() {
		return this.simahContractualPayCrc;
	}

	public void setSimahContractualPayCrc(BigDecimal simahContractualPayCrc) {
		this.simahContractualPayCrc = simahContractualPayCrc;
	}

	public BigDecimal getSimahContractualPayMtg() {
		return this.simahContractualPayMtg;
	}

	public void setSimahContractualPayMtg(BigDecimal simahContractualPayMtg) {
		this.simahContractualPayMtg = simahContractualPayMtg;
	}

	public BigDecimal getSimahContractualPayOther() {
		return this.simahContractualPayOther;
	}

	public void setSimahContractualPayOther(BigDecimal simahContractualPayOther) {
		this.simahContractualPayOther = simahContractualPayOther;
	}

	public BigDecimal getSimahContractualPayPln() {
		return this.simahContractualPayPln;
	}

	public void setSimahContractualPayPln(BigDecimal simahContractualPayPln) {
		this.simahContractualPayPln = simahContractualPayPln;
	}

	public String getSimahCurWorstDelinqAuto() {
		return this.simahCurWorstDelinqAuto;
	}

	public void setSimahCurWorstDelinqAuto(String simahCurWorstDelinqAuto) {
		this.simahCurWorstDelinqAuto = simahCurWorstDelinqAuto;
	}

	public String getSimahCurWorstDelinqCrc() {
		return this.simahCurWorstDelinqCrc;
	}

	public void setSimahCurWorstDelinqCrc(String simahCurWorstDelinqCrc) {
		this.simahCurWorstDelinqCrc = simahCurWorstDelinqCrc;
	}

	public String getSimahCurWorstDelinqMtg() {
		return this.simahCurWorstDelinqMtg;
	}

	public void setSimahCurWorstDelinqMtg(String simahCurWorstDelinqMtg) {
		this.simahCurWorstDelinqMtg = simahCurWorstDelinqMtg;
	}

	public String getSimahCurWorstDelinqOther() {
		return this.simahCurWorstDelinqOther;
	}

	public void setSimahCurWorstDelinqOther(String simahCurWorstDelinqOther) {
		this.simahCurWorstDelinqOther = simahCurWorstDelinqOther;
	}

	public String getSimahCurWorstDelinqPln() {
		return this.simahCurWorstDelinqPln;
	}

	public void setSimahCurWorstDelinqPln(String simahCurWorstDelinqPln) {
		this.simahCurWorstDelinqPln = simahCurWorstDelinqPln;
	}

	public BigDecimal getSimahDebtBurden() {
		return this.simahDebtBurden;
	}

	public void setSimahDebtBurden(BigDecimal simahDebtBurden) {
		this.simahDebtBurden = simahDebtBurden;
	}

	public BigDecimal getSimahDebtBurdenRatio() {
		return this.simahDebtBurdenRatio;
	}

	public void setSimahDebtBurdenRatio(BigDecimal simahDebtBurdenRatio) {
		this.simahDebtBurdenRatio = simahDebtBurdenRatio;
	}

	public BigDecimal getSimahNoOfBouncedCheque() {
		return this.simahNoOfBouncedCheque;
	}

	public void setSimahNoOfBouncedCheque(BigDecimal simahNoOfBouncedCheque) {
		this.simahNoOfBouncedCheque = simahNoOfBouncedCheque;
	}

	public BigDecimal getSimahNoOfCiDefaultAuto() {
		return this.simahNoOfCiDefaultAuto;
	}

	public void setSimahNoOfCiDefaultAuto(BigDecimal simahNoOfCiDefaultAuto) {
		this.simahNoOfCiDefaultAuto = simahNoOfCiDefaultAuto;
	}

	public BigDecimal getSimahNoOfCiDefaultCrc() {
		return this.simahNoOfCiDefaultCrc;
	}

	public void setSimahNoOfCiDefaultCrc(BigDecimal simahNoOfCiDefaultCrc) {
		this.simahNoOfCiDefaultCrc = simahNoOfCiDefaultCrc;
	}

	public BigDecimal getSimahNoOfCiDefaultMtg() {
		return this.simahNoOfCiDefaultMtg;
	}

	public void setSimahNoOfCiDefaultMtg(BigDecimal simahNoOfCiDefaultMtg) {
		this.simahNoOfCiDefaultMtg = simahNoOfCiDefaultMtg;
	}

	public BigDecimal getSimahNoOfCiDefaultOther() {
		return this.simahNoOfCiDefaultOther;
	}

	public void setSimahNoOfCiDefaultOther(BigDecimal simahNoOfCiDefaultOther) {
		this.simahNoOfCiDefaultOther = simahNoOfCiDefaultOther;
	}

	public BigDecimal getSimahNoOfCiDefaultPln() {
		return this.simahNoOfCiDefaultPln;
	}

	public void setSimahNoOfCiDefaultPln(BigDecimal simahNoOfCiDefaultPln) {
		this.simahNoOfCiDefaultPln = simahNoOfCiDefaultPln;
	}

	public BigDecimal getSimahNoOfDefaultAuto() {
		return this.simahNoOfDefaultAuto;
	}

	public void setSimahNoOfDefaultAuto(BigDecimal simahNoOfDefaultAuto) {
		this.simahNoOfDefaultAuto = simahNoOfDefaultAuto;
	}

	public BigDecimal getSimahNoOfDefaultCrc() {
		return this.simahNoOfDefaultCrc;
	}

	public void setSimahNoOfDefaultCrc(BigDecimal simahNoOfDefaultCrc) {
		this.simahNoOfDefaultCrc = simahNoOfDefaultCrc;
	}

	public BigDecimal getSimahNoOfDefaultMtg() {
		return this.simahNoOfDefaultMtg;
	}

	public void setSimahNoOfDefaultMtg(BigDecimal simahNoOfDefaultMtg) {
		this.simahNoOfDefaultMtg = simahNoOfDefaultMtg;
	}

	public BigDecimal getSimahNoOfDefaultOther() {
		return this.simahNoOfDefaultOther;
	}

	public void setSimahNoOfDefaultOther(BigDecimal simahNoOfDefaultOther) {
		this.simahNoOfDefaultOther = simahNoOfDefaultOther;
	}

	public BigDecimal getSimahNoOfDefaultPln() {
		return this.simahNoOfDefaultPln;
	}

	public void setSimahNoOfDefaultPln(BigDecimal simahNoOfDefaultPln) {
		this.simahNoOfDefaultPln = simahNoOfDefaultPln;
	}

	public BigDecimal getSimahNoOfEnquiries12m() {
		return this.simahNoOfEnquiries12m;
	}

	public void setSimahNoOfEnquiries12m(BigDecimal simahNoOfEnquiries12m) {
		this.simahNoOfEnquiries12m = simahNoOfEnquiries12m;
	}

	public BigDecimal getSimahNoOfEnquiries30d() {
		return this.simahNoOfEnquiries30d;
	}

	public void setSimahNoOfEnquiries30d(BigDecimal simahNoOfEnquiries30d) {
		this.simahNoOfEnquiries30d = simahNoOfEnquiries30d;
	}

	public BigDecimal getSimahNoOfExecutedExjudg() {
		return this.simahNoOfExecutedExjudg;
	}

	public void setSimahNoOfExecutedExjudg(BigDecimal simahNoOfExecutedExjudg) {
		this.simahNoOfExecutedExjudg = simahNoOfExecutedExjudg;
	}

	public BigDecimal getSimahNoOfLoans() {
		return this.simahNoOfLoans;
	}

	public void setSimahNoOfLoans(BigDecimal simahNoOfLoans) {
		this.simahNoOfLoans = simahNoOfLoans;
	}

	public BigDecimal getSimahNoOfNotexecExjudg() {
		return this.simahNoOfNotexecExjudg;
	}

	public void setSimahNoOfNotexecExjudg(BigDecimal simahNoOfNotexecExjudg) {
		this.simahNoOfNotexecExjudg = simahNoOfNotexecExjudg;
	}

	public BigDecimal getSimahOutstandBalNotexjudg() {
		return this.simahOutstandBalNotexjudg;
	}

	public void setSimahOutstandBalNotexjudg(BigDecimal simahOutstandBalNotexjudg) {
		this.simahOutstandBalNotexjudg = simahOutstandBalNotexjudg;
	}

	public BigDecimal getSimahSimahScore() {
		return this.simahSimahScore;
	}

	public void setSimahSimahScore(BigDecimal simahSimahScore) {
		this.simahSimahScore = simahSimahScore;
	}

	public String getSimahSimahScoreVersion() {
		return this.simahSimahScoreVersion;
	}

	public void setSimahSimahScoreVersion(String simahSimahScoreVersion) {
		this.simahSimahScoreVersion = simahSimahScoreVersion;
	}

	public BigDecimal getSimahSummedSalary() {
		return this.simahSummedSalary;
	}

	public void setSimahSummedSalary(BigDecimal simahSummedSalary) {
		this.simahSummedSalary = simahSummedSalary;
	}

	public BigDecimal getSimahTotalLiabilities() {
		return this.simahTotalLiabilities;
	}

	public void setSimahTotalLiabilities(BigDecimal simahTotalLiabilities) {
		this.simahTotalLiabilities = simahTotalLiabilities;
	}

	public BigDecimal getSimahTotalLimit() {
		return this.simahTotalLimit;
	}

	public void setSimahTotalLimit(BigDecimal simahTotalLimit) {
		this.simahTotalLimit = simahTotalLimit;
	}

	public BigDecimal getSimahTotalRevolvingLiab() {
		return this.simahTotalRevolvingLiab;
	}

	public void setSimahTotalRevolvingLiab(BigDecimal simahTotalRevolvingLiab) {
		this.simahTotalRevolvingLiab = simahTotalRevolvingLiab;
	}

	public BigDecimal getSimahTotalRevolvingLimit() {
		return this.simahTotalRevolvingLimit;
	}

	public void setSimahTotalRevolvingLimit(BigDecimal simahTotalRevolvingLimit) {
		this.simahTotalRevolvingLimit = simahTotalRevolvingLimit;
	}

	public String getSimahWorstDelinq24mAuto() {
		return this.simahWorstDelinq24mAuto;
	}

	public void setSimahWorstDelinq24mAuto(String simahWorstDelinq24mAuto) {
		this.simahWorstDelinq24mAuto = simahWorstDelinq24mAuto;
	}

	public String getSimahWorstDelinq24mCrc() {
		return this.simahWorstDelinq24mCrc;
	}

	public void setSimahWorstDelinq24mCrc(String simahWorstDelinq24mCrc) {
		this.simahWorstDelinq24mCrc = simahWorstDelinq24mCrc;
	}

	public String getSimahWorstDelinq24mMtg() {
		return this.simahWorstDelinq24mMtg;
	}

	public void setSimahWorstDelinq24mMtg(String simahWorstDelinq24mMtg) {
		this.simahWorstDelinq24mMtg = simahWorstDelinq24mMtg;
	}

	public String getSimahWorstDelinq24mOther() {
		return this.simahWorstDelinq24mOther;
	}

	public void setSimahWorstDelinq24mOther(String simahWorstDelinq24mOther) {
		this.simahWorstDelinq24mOther = simahWorstDelinq24mOther;
	}

	public String getSimahWorstDelinq24mPln() {
		return this.simahWorstDelinq24mPln;
	}

	public void setSimahWorstDelinq24mPln(String simahWorstDelinq24mPln) {
		this.simahWorstDelinq24mPln = simahWorstDelinq24mPln;
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

}