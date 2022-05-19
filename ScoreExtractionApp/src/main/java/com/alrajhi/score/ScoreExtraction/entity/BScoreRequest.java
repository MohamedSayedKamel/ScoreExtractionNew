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
 * The persistent class for the B_SCORE_REQUEST database table.
 * 
 */
@Entity
@Table(name="B_SCORE_REQUEST")
@NamedQuery(name="BScoreRequest.findAll", query="SELECT b FROM BScoreRequest b")
public class BScoreRequest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="B_SCORE_REQUEST_REQUESTID_GENERATOR", sequenceName="B_SCORE_REQUEST_ID_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="B_SCORE_REQUEST_REQUESTID_GENERATOR")
	@Column(name="REQUEST_ID")
	private long requestId;

	@Column(name="RUN_ID")
	private BigDecimal runId;
	
	@Column(name="CASA_AVERAGE_BAL_MONTH_M0")
	private BigDecimal casaAverageBalMonthM0;

	@Column(name="CASA_AVERAGE_BAL_MONTH_M1")
	private BigDecimal casaAverageBalMonthM1;

	@Column(name="CASA_AVERAGE_BAL_MONTH_M10")
	private BigDecimal casaAverageBalMonthM10;

	@Column(name="CASA_AVERAGE_BAL_MONTH_M11")
	private BigDecimal casaAverageBalMonthM11;

	@Column(name="CASA_AVERAGE_BAL_MONTH_M12")
	private BigDecimal casaAverageBalMonthM12;

	@Column(name="CASA_AVERAGE_BAL_MONTH_M13")
	private BigDecimal casaAverageBalMonthM13;

	@Column(name="CASA_AVERAGE_BAL_MONTH_M14")
	private BigDecimal casaAverageBalMonthM14;

	@Column(name="CASA_AVERAGE_BAL_MONTH_M15")
	private BigDecimal casaAverageBalMonthM15;

	@Column(name="CASA_AVERAGE_BAL_MONTH_M16")
	private BigDecimal casaAverageBalMonthM16;

	@Column(name="CASA_AVERAGE_BAL_MONTH_M17")
	private BigDecimal casaAverageBalMonthM17;

	@Column(name="CASA_AVERAGE_BAL_MONTH_M18")
	private BigDecimal casaAverageBalMonthM18;

	@Column(name="CASA_AVERAGE_BAL_MONTH_M19")
	private BigDecimal casaAverageBalMonthM19;

	@Column(name="CASA_AVERAGE_BAL_MONTH_M2")
	private BigDecimal casaAverageBalMonthM2;

	@Column(name="CASA_AVERAGE_BAL_MONTH_M20")
	private BigDecimal casaAverageBalMonthM20;

	@Column(name="CASA_AVERAGE_BAL_MONTH_M21")
	private BigDecimal casaAverageBalMonthM21;

	@Column(name="CASA_AVERAGE_BAL_MONTH_M22")
	private BigDecimal casaAverageBalMonthM22;

	@Column(name="CASA_AVERAGE_BAL_MONTH_M23")
	private BigDecimal casaAverageBalMonthM23;

	@Column(name="CASA_AVERAGE_BAL_MONTH_M24")
	private BigDecimal casaAverageBalMonthM24;

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

	@Column(name="CUST_LATEST_EMP_COMPANY")
	private String custLatestEmpCompany;

	@Column(name="CUST_LATEST_EMP_DEPARTMENT")
	private String custLatestEmpDepartment;

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

	@Column(name="CUST_TOT_NO_ACTIVE_CONTRACTS")
	private BigDecimal custTotNoActiveContracts;

	@Column(name="PROCESS_STATUS")
	private String processStatus;

	@Column(name="PROD_ACCRUED_INT")
	private BigDecimal prodAccruedInt;

	@Column(name="PROD_ADD_RATE")
	private BigDecimal prodAddRate;

	@Column(name="PROD_ARMS_BOOK_VALUE")
	private BigDecimal prodArmsBookValue;

	@Column(name="PROD_ARMS_COLL_AREA")
	private String prodArmsCollArea;

	@Column(name="PROD_ARMS_CONTRACT_NUMBER")
	private String prodArmsContractNumber;

	@Column(name="PROD_ARMS_MANUFACTURE_YEAR")
	private BigDecimal prodArmsManufactureYear;

	@Column(name="PROD_ARMS_MITIGANT_CODE")
	private String prodArmsMitigantCode;

	@Column(name="PROD_ARMS_MITIGANT_DESC")
	private String prodArmsMitigantDesc;

	@Column(name="PROD_ARMS_MITIGANT_VAL_OWNER")
	private String prodArmsMitigantValOwner;

	@Column(name="PROD_ARMS_MITIGANT_VALUE")
	private BigDecimal prodArmsMitigantValue;

	@Column(name="PROD_ARMS_PROP_EVAL_STATUS")
	private BigDecimal prodArmsPropEvalStatus;

	@Column(name="PROD_ARMS_PROPERTY_TYPE")
	private String prodArmsPropertyType;

	@Column(name="PROD_ARMS_REGION")
	private String prodArmsRegion;

	@Column(name="PROD_ARMS_VALUATION_DIFF")
	private BigDecimal prodArmsValuationDiff;

	@Column(name="PROD_ARMS_VEHI_MANUFACT_YEAR")
	private BigDecimal prodArmsVehiManufactYear;

	@Column(name="PROD_ARMS_VEHICLE_BRAND_CAT")
	private String prodArmsVehicleBrandCat;	
	
	@Column(name="PROD_ARMS_VEHICLE_BRAND_NAME")
	private String prodArmsVehicleBrandName;

	@Column(name="PROD_ARMS_VEHICLE_BRAND_TYPE")
	private String prodArmsVehicleBrandType;

	@Column(name="PROD_BALLOON_AMOUNT")
	private BigDecimal prodBalloonAmount;

	@Column(name="PROD_BASIC_SALARY_AMOUNT")
	private BigDecimal prodBasicSalaryAmount;

	@Column(name="PROD_BRANCH_SHOWROOM_ACC")
	private String prodBranchShowroomAcc;

	@Column(name="PROD_BRANCH_SHOWROOM_ACC_CODE")
	private String prodBranchShowroomAccCode;

	@Column(name="PROD_BRANCH_SHOWROOM_CODE")
	private String prodBranchShowroomCode;

	@Column(name="PROD_BUSINESS_POSITION")
	private String prodBusinessPosition;

	@Column(name="PROD_CHANNEL_CODE")
	private String prodChannelCode;

	@Column(name="PROD_CUR_BOOK_BAL")
	private BigDecimal prodCurBookBal;

	@Column(name="PROD_CURR_PAY")
	private BigDecimal prodCurrPay;

	@Column(name="PROD_CURRENCY")
	private BigDecimal prodCurrency;

	@Column(name="PROD_CUS_SUBTYPE")
	private String prodCusSubtype;

	@Column(name="PROD_CUSTOMER_SEGMENT")
	private String prodCustomerSegment;

	@Column(name="PROD_DEBT_BURDEN_RATIO")
	private BigDecimal prodDebtBurdenRatio;

	@Column(name="PROD_DELINQ_AMOUNT_M0")
	private BigDecimal prodDelinqAmountM0;

	@Column(name="PROD_DELINQ_AMOUNT_M1")
	private BigDecimal prodDelinqAmountM1;

	@Column(name="PROD_DELINQ_AMOUNT_M10")
	private BigDecimal prodDelinqAmountM10;

	@Column(name="PROD_DELINQ_AMOUNT_M11")
	private BigDecimal prodDelinqAmountM11;

	@Column(name="PROD_DELINQ_AMOUNT_M12")
	private BigDecimal prodDelinqAmountM12;

	@Column(name="PROD_DELINQ_AMOUNT_M13")
	private BigDecimal prodDelinqAmountM13;

	@Column(name="PROD_DELINQ_AMOUNT_M14")
	private BigDecimal prodDelinqAmountM14;

	@Column(name="PROD_DELINQ_AMOUNT_M15")
	private BigDecimal prodDelinqAmountM15;

	@Column(name="PROD_DELINQ_AMOUNT_M16")
	private BigDecimal prodDelinqAmountM16;

	@Column(name="PROD_DELINQ_AMOUNT_M17")
	private BigDecimal prodDelinqAmountM17;

	@Column(name="PROD_DELINQ_AMOUNT_M18")
	private BigDecimal prodDelinqAmountM18;

	@Column(name="PROD_DELINQ_AMOUNT_M19")
	private BigDecimal prodDelinqAmountM19;

	@Column(name="PROD_DELINQ_AMOUNT_M2")
	private BigDecimal prodDelinqAmountM2;

	@Column(name="PROD_DELINQ_AMOUNT_M20")
	private BigDecimal prodDelinqAmountM20;

	@Column(name="PROD_DELINQ_AMOUNT_M21")
	private BigDecimal prodDelinqAmountM21;

	@Column(name="PROD_DELINQ_AMOUNT_M22")
	private BigDecimal prodDelinqAmountM22;

	@Column(name="PROD_DELINQ_AMOUNT_M23")
	private BigDecimal prodDelinqAmountM23;

	@Column(name="PROD_DELINQ_AMOUNT_M24")
	private BigDecimal prodDelinqAmountM24;

	@Column(name="PROD_DELINQ_AMOUNT_M3")
	private BigDecimal prodDelinqAmountM3;

	@Column(name="PROD_DELINQ_AMOUNT_M4")
	private BigDecimal prodDelinqAmountM4;

	@Column(name="PROD_DELINQ_AMOUNT_M5")
	private BigDecimal prodDelinqAmountM5;

	@Column(name="PROD_DELINQ_AMOUNT_M6")
	private BigDecimal prodDelinqAmountM6;

	@Column(name="PROD_DELINQ_AMOUNT_M7")
	private BigDecimal prodDelinqAmountM7;

	@Column(name="PROD_DELINQ_AMOUNT_M8")
	private BigDecimal prodDelinqAmountM8;

	@Column(name="PROD_DELINQ_AMOUNT_M9")
	private BigDecimal prodDelinqAmountM9;

	@Column(name="PROD_DELINQ_DAYS_M0")
	private BigDecimal prodDelinqDaysM0;

	@Column(name="PROD_DELINQ_DAYS_M1")
	private BigDecimal prodDelinqDaysM1;

	@Column(name="PROD_DELINQ_DAYS_M10")
	private BigDecimal prodDelinqDaysM10;

	@Column(name="PROD_DELINQ_DAYS_M11")
	private BigDecimal prodDelinqDaysM11;

	@Column(name="PROD_DELINQ_DAYS_M12")
	private BigDecimal prodDelinqDaysM12;

	@Column(name="PROD_DELINQ_DAYS_M13")
	private BigDecimal prodDelinqDaysM13;

	@Column(name="PROD_DELINQ_DAYS_M14")
	private BigDecimal prodDelinqDaysM14;

	@Column(name="PROD_DELINQ_DAYS_M15")
	private BigDecimal prodDelinqDaysM15;

	@Column(name="PROD_DELINQ_DAYS_M16")
	private BigDecimal prodDelinqDaysM16;

	@Column(name="PROD_DELINQ_DAYS_M17")
	private BigDecimal prodDelinqDaysM17;

	@Column(name="PROD_DELINQ_DAYS_M18")
	private BigDecimal prodDelinqDaysM18;

	@Column(name="PROD_DELINQ_DAYS_M19")
	private BigDecimal prodDelinqDaysM19;

	@Column(name="PROD_DELINQ_DAYS_M2")
	private BigDecimal prodDelinqDaysM2;

	@Column(name="PROD_DELINQ_DAYS_M20")
	private BigDecimal prodDelinqDaysM20;

	@Column(name="PROD_DELINQ_DAYS_M21")
	private BigDecimal prodDelinqDaysM21;

	@Column(name="PROD_DELINQ_DAYS_M22")
	private BigDecimal prodDelinqDaysM22;

	@Column(name="PROD_DELINQ_DAYS_M23")
	private BigDecimal prodDelinqDaysM23;

	@Column(name="PROD_DELINQ_DAYS_M24")
	private BigDecimal prodDelinqDaysM24;

	@Column(name="PROD_DELINQ_DAYS_M3")
	private BigDecimal prodDelinqDaysM3;

	@Column(name="PROD_DELINQ_DAYS_M4")
	private BigDecimal prodDelinqDaysM4;

	@Column(name="PROD_DELINQ_DAYS_M5")
	private BigDecimal prodDelinqDaysM5;

	@Column(name="PROD_DELINQ_DAYS_M6")
	private BigDecimal prodDelinqDaysM6;

	@Column(name="PROD_DELINQ_DAYS_M7")
	private BigDecimal prodDelinqDaysM7;

	@Column(name="PROD_DELINQ_DAYS_M8")
	private BigDecimal prodDelinqDaysM8;

	@Column(name="PROD_DELINQ_DAYS_M9")
	private BigDecimal prodDelinqDaysM9;

	@Column(name="PROD_DEPENDENTS")
	private BigDecimal prodDependents;

	@Column(name="PROD_DEPT_CODE")
	private String prodDeptCode;

	@Column(name="PROD_DISBURSEMENT_AMOUNT")
	private BigDecimal prodDisbursementAmount;

	@Temporal(TemporalType.DATE)
	@Column(name="PROD_DISBURSEMENT_DATE")
	private Date prodDisbursementDate;

	@Column(name="PROD_DOWNPAYMENT_AMT")
	private BigDecimal prodDownpaymentAmt;

	@Column(name="PROD_DURATION_IN_MONTH")
	private BigDecimal prodDurationInMonth;

	@Column(name="PROD_EMI_M0")
	private BigDecimal prodEmiM0;

	@Column(name="PROD_EMI_M1")
	private BigDecimal prodEmiM1;

	@Column(name="PROD_EMI_M10")
	private BigDecimal prodEmiM10;

	@Column(name="PROD_EMI_M11")
	private BigDecimal prodEmiM11;

	@Column(name="PROD_EMI_M12")
	private BigDecimal prodEmiM12;

	@Column(name="PROD_EMI_M13")
	private BigDecimal prodEmiM13;

	@Column(name="PROD_EMI_M14")
	private BigDecimal prodEmiM14;

	@Column(name="PROD_EMI_M15")
	private BigDecimal prodEmiM15;

	@Column(name="PROD_EMI_M16")
	private BigDecimal prodEmiM16;

	@Column(name="PROD_EMI_M17")
	private BigDecimal prodEmiM17;

	@Column(name="PROD_EMI_M18")
	private BigDecimal prodEmiM18;

	@Column(name="PROD_EMI_M19")
	private BigDecimal prodEmiM19;

	@Column(name="PROD_EMI_M2")
	private BigDecimal prodEmiM2;

	@Column(name="PROD_EMI_M20")
	private BigDecimal prodEmiM20;

	@Column(name="PROD_EMI_M21")
	private BigDecimal prodEmiM21;

	@Column(name="PROD_EMI_M22")
	private BigDecimal prodEmiM22;

	@Column(name="PROD_EMI_M23")
	private BigDecimal prodEmiM23;

	@Column(name="PROD_EMI_M24")
	private BigDecimal prodEmiM24;

	@Column(name="PROD_EMI_M3")
	private BigDecimal prodEmiM3;

	@Column(name="PROD_EMI_M4")
	private BigDecimal prodEmiM4;

	@Column(name="PROD_EMI_M5")
	private BigDecimal prodEmiM5;

	@Column(name="PROD_EMI_M6")
	private BigDecimal prodEmiM6;

	@Column(name="PROD_EMI_M7")
	private BigDecimal prodEmiM7;

	@Column(name="PROD_EMI_M8")
	private BigDecimal prodEmiM8;

	@Column(name="PROD_EMI_M9")
	private BigDecimal prodEmiM9;

	@Column(name="PROD_EMP_COMPANY")
	private String prodEmpCompany;

	@Column(name="PROD_EMP_DEPARTMENT")
	private String prodEmpDepartment;

	@Column(name="PROD_EMPLOYEE_TYPE")
	private String prodEmployeeType;

	@Column(name="PROD_EMPLOYER_CLASS_CODE")
	private String prodEmployerClassCode;

	@Temporal(TemporalType.DATE)
	@Column(name="PROD_EMPLOYER_ENGAGEMENT_DATE")
	private Date prodEmployerEngagementDate;

	@Column(name="PROD_END_SERVICE_BENEFIT_AMT")
	private BigDecimal prodEndServiceBenefitAmt;

	@Column(name="PROD_FEES")
	private BigDecimal prodFees;

	@Column(name="PROD_FINANCE_AMT")
	private BigDecimal prodFinanceAmt;

	@Temporal(TemporalType.DATE)
	@Column(name="PROD_FIRST_APPLICATION_DATE")
	private Date prodFirstApplicationDate;

	@Temporal(TemporalType.DATE)
	@Column(name="PROD_FIRST_APPROVAL_DATE")
	private Date prodFirstApprovalDate;

	@Temporal(TemporalType.DATE)
	@Column(name="PROD_FIRST_OPEN_DATE")
	private Date prodFirstOpenDate;

	@Column(name="PROD_GROSS_SALARY")
	private BigDecimal prodGrossSalary;

	@Column(name="PROD_INSTAL_AMT")
	private BigDecimal prodInstalAmt;

	@Column(name="PROD_INSTAL_WITH_INSURANCE")
	private String prodInstalWithInsurance;

	@Temporal(TemporalType.DATE)
	@Column(name="PROD_LAST_APPLICATION_DATE")
	private Date prodLastApplicationDate;

	@Temporal(TemporalType.DATE)
	@Column(name="PROD_LAST_APPROVAL_DATE")
	private Date prodLastApprovalDate;

	@Temporal(TemporalType.DATE)
	@Column(name="PROD_LAST_OPEN_DATE")
	private Date prodLastOpenDate;

	@Temporal(TemporalType.DATE)
	@Column(name="PROD_LAST_PAYMENT_DATE")
	private Date prodLastPaymentDate;

	@Temporal(TemporalType.DATE)
	@Column(name="PROD_MATURE_DATE")
	private Date prodMatureDate;

	@Column(name="PROD_MILITARY_RANK")
	private String prodMilitaryRank;

	@Column(name="PROD_MONTHLY_ALLOWANCE_AMT")
	private BigDecimal prodMonthlyAllowanceAmt;

	@Column(name="PROD_MONTHLY_OTHER_INCOME_AMT")
	private BigDecimal prodMonthlyOtherIncomeAmt;

	@Column(name="PROD_NET_BAL")
	private BigDecimal prodNetBal;

	@Temporal(TemporalType.DATE)
	@Column(name="PROD_NEXT_PAY_DATE")
	private Date prodNextPayDate;

	@Column(name="PROD_NO_OF_DELINQ_INST")
	private BigDecimal prodNoOfDelinqInst;

	@Column(name="PROD_ORIG_APPROVAL_AMT")
	private BigDecimal prodOrigApprovalAmt;

	@Column(name="PROD_ORIG_BALANCE")
	private BigDecimal prodOrigBalance;

	@Column(name="PROD_ORIG_PAY")
	private BigDecimal prodOrigPay;

	@Column(name="PROD_ORIG_PROFIT")
	private BigDecimal prodOrigProfit;

	@Column(name="PROD_OTH_MONTHLY_DEDUCT_AMT")
	private BigDecimal prodOthMonthlyDeductAmt;

	@Column(name="PROD_OUTSTANDING_ACCRUAL_PFT")
	private BigDecimal prodOutstandingAccrualPft;

	@Column(name="PROD_OUTSTANDING_AMOUNT_M0")
	private BigDecimal prodOutstandingAmountM0;

	@Column(name="PROD_OUTSTANDING_AMOUNT_M1")
	private BigDecimal prodOutstandingAmountM1;

	@Column(name="PROD_OUTSTANDING_AMOUNT_M10")
	private BigDecimal prodOutstandingAmountM10;

	@Column(name="PROD_OUTSTANDING_AMOUNT_M11")
	private BigDecimal prodOutstandingAmountM11;

	@Column(name="PROD_OUTSTANDING_AMOUNT_M12")
	private BigDecimal prodOutstandingAmountM12;

	@Column(name="PROD_OUTSTANDING_AMOUNT_M13")
	private BigDecimal prodOutstandingAmountM13;

	@Column(name="PROD_OUTSTANDING_AMOUNT_M14")
	private BigDecimal prodOutstandingAmountM14;

	@Column(name="PROD_OUTSTANDING_AMOUNT_M15")
	private BigDecimal prodOutstandingAmountM15;

	@Column(name="PROD_OUTSTANDING_AMOUNT_M16")
	private BigDecimal prodOutstandingAmountM16;

	@Column(name="PROD_OUTSTANDING_AMOUNT_M17")
	private BigDecimal prodOutstandingAmountM17;

	@Column(name="PROD_OUTSTANDING_AMOUNT_M18")
	private BigDecimal prodOutstandingAmountM18;

	@Column(name="PROD_OUTSTANDING_AMOUNT_M19")
	private BigDecimal prodOutstandingAmountM19;

	@Column(name="PROD_OUTSTANDING_AMOUNT_M2")
	private BigDecimal prodOutstandingAmountM2;

	@Column(name="PROD_OUTSTANDING_AMOUNT_M20")
	private BigDecimal prodOutstandingAmountM20;

	@Column(name="PROD_OUTSTANDING_AMOUNT_M21")
	private BigDecimal prodOutstandingAmountM21;

	@Column(name="PROD_OUTSTANDING_AMOUNT_M22")
	private BigDecimal prodOutstandingAmountM22;

	@Column(name="PROD_OUTSTANDING_AMOUNT_M23")
	private BigDecimal prodOutstandingAmountM23;

	@Column(name="PROD_OUTSTANDING_AMOUNT_M24")
	private BigDecimal prodOutstandingAmountM24;

	@Column(name="PROD_OUTSTANDING_AMOUNT_M3")
	private BigDecimal prodOutstandingAmountM3;

	@Column(name="PROD_OUTSTANDING_AMOUNT_M4")
	private BigDecimal prodOutstandingAmountM4;

	@Column(name="PROD_OUTSTANDING_AMOUNT_M5")
	private BigDecimal prodOutstandingAmountM5;

	@Column(name="PROD_OUTSTANDING_AMOUNT_M6")
	private BigDecimal prodOutstandingAmountM6;

	@Column(name="PROD_OUTSTANDING_AMOUNT_M7")
	private BigDecimal prodOutstandingAmountM7;

	@Column(name="PROD_OUTSTANDING_AMOUNT_M8")
	private BigDecimal prodOutstandingAmountM8;

	@Column(name="PROD_OUTSTANDING_AMOUNT_M9")
	private BigDecimal prodOutstandingAmountM9;

	@Column(name="PROD_OUTSTANDING_TOTAL_PFT")
	private BigDecimal prodOutstandingTotalPft;

	@Column(name="PROD_PAYMENT_PRINCIPAL_AMT")
	private BigDecimal prodPaymentPrincipalAmt;

	@Column(name="PROD_PRODUCT_CODE")
	private String prodProductCode;

	@Column(name="PROD_PRODUCT_TYPE")
	private String prodProductType;

	@Column(name="PROD_PROFIT_RATE_SUB_TYPE")
	private String prodProfitRateSubType;

	@Column(name="PROD_RATE")
	private BigDecimal prodRate;

	@Column(name="PROD_RELATION_CONTRACT_TYPE")
	private String prodRelationContractType;

	@Column(name="PROD_REMAIN_PAYMENTS")
	private BigDecimal prodRemainPayments;

	@Column(name="PROD_REMAIN_TERM")
	private BigDecimal prodRemainTerm;

	@Column(name="PROD_SALARY_TRANSFER_TYPE")
	private String prodSalaryTransferType;

	@Column(name="PROD_SALARY_TRANSFER_TYPE_CTF")
	private String prodSalaryTransferTypeCtf;

	@Column(name="PROD_SALES_BRANCH")
	private String prodSalesBranch;

	@Column(name="PROD_SALES_CD")
	private String prodSalesCd;

	@Column(name="PROD_SALES_USERID")
	private String prodSalesUserid;

	@Column(name="PROD_SPARE_101")
	private String prodSpare101;

	@Column(name="PROD_SPARE_102")
	private String prodSpare102;

	@Column(name="PROD_SPARE_103")
	private String prodSpare103;

	@Column(name="PROD_SPARE_104")
	private String prodSpare104;

	@Column(name="PROD_SPARE_105")
	private String prodSpare105;

	@Column(name="PROD_SPARE_106")
	private String prodSpare106;

	@Column(name="PROD_SPARE_107")
	private String prodSpare107;

	@Column(name="PROD_SPARE_108")
	private String prodSpare108;

	@Column(name="PROD_SPARE_109")
	private String prodSpare109;

	@Column(name="PROD_SPARE_110")
	private String prodSpare110;

	@Column(name="PROD_SPARE_111")
	private String prodSpare111;

	@Column(name="PROD_SPARE_112")
	private String prodSpare112;

	@Column(name="PROD_SPARE_113")
	private String prodSpare113;

	@Column(name="PROD_SPARE_114")
	private String prodSpare114;

	@Column(name="PROD_SPARE_115")
	private String prodSpare115;

	@Column(name="PROD_SPARE_116")
	private String prodSpare116;

	@Column(name="PROD_SPARE_117")
	private String prodSpare117;

	@Column(name="PROD_SPARE_118")
	private String prodSpare118;

	@Column(name="PROD_SPARE_119")
	private String prodSpare119;

	@Column(name="PROD_SPARE_120")
	private String prodSpare120;

	@Column(name="PROD_SUB_CODE")
	private BigDecimal prodSubCode;

	@Column(name="PROD_TERM")
	private BigDecimal prodTerm;

	@Column(name="PROD_TOT_GRACE_PRD_PROFIT")
	private BigDecimal prodTotGracePrdProfit;

	@Column(name="PROD_TOTAL_EARLY_PAYMENT_AMT")
	private BigDecimal prodTotalEarlyPaymentAmt;

	@Column(name="PROD_TOTAL_INSTALL_DUE_AMT")
	private BigDecimal prodTotalInstallDueAmt;

	@Column(name="PROD_TOTAL_NO_OPEN_CONTRACTS")
	private BigDecimal prodTotalNoOpenContracts;

	@Column(name="PROD_TOTAL_PAYMENTS")
	private BigDecimal prodTotalPayments;

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

	@Column(name="SCOR_NATIONAL_ID")
	private String scorNationalId;

	@Temporal(TemporalType.DATE)
	@Column(name="SCOR_PORTFOLIO_DATE")
	private Date scorPortfolioDate;

	@Column(name="SCOR_SCORING_REQUEST_TYPE")
	private String scorScoringRequestType;

	@Column(name="SCOR_SCORING_SOURCE")
	private String scorScoringSource;

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

	@Column(name="SIMAH_NO_OF_EXEC_EXJUDG")
	private BigDecimal simahNoOfExecExjudg;

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

	public BScoreRequest() {
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

	public BigDecimal getCasaAverageBalMonthM12() {
		return this.casaAverageBalMonthM12;
	}

	public void setCasaAverageBalMonthM12(BigDecimal casaAverageBalMonthM12) {
		this.casaAverageBalMonthM12 = casaAverageBalMonthM12;
	}

	public BigDecimal getCasaAverageBalMonthM13() {
		return this.casaAverageBalMonthM13;
	}

	public void setCasaAverageBalMonthM13(BigDecimal casaAverageBalMonthM13) {
		this.casaAverageBalMonthM13 = casaAverageBalMonthM13;
	}

	public BigDecimal getCasaAverageBalMonthM14() {
		return this.casaAverageBalMonthM14;
	}

	public void setCasaAverageBalMonthM14(BigDecimal casaAverageBalMonthM14) {
		this.casaAverageBalMonthM14 = casaAverageBalMonthM14;
	}

	public BigDecimal getCasaAverageBalMonthM15() {
		return this.casaAverageBalMonthM15;
	}

	public void setCasaAverageBalMonthM15(BigDecimal casaAverageBalMonthM15) {
		this.casaAverageBalMonthM15 = casaAverageBalMonthM15;
	}

	public BigDecimal getCasaAverageBalMonthM16() {
		return this.casaAverageBalMonthM16;
	}

	public void setCasaAverageBalMonthM16(BigDecimal casaAverageBalMonthM16) {
		this.casaAverageBalMonthM16 = casaAverageBalMonthM16;
	}

	public BigDecimal getCasaAverageBalMonthM17() {
		return this.casaAverageBalMonthM17;
	}

	public void setCasaAverageBalMonthM17(BigDecimal casaAverageBalMonthM17) {
		this.casaAverageBalMonthM17 = casaAverageBalMonthM17;
	}

	public BigDecimal getCasaAverageBalMonthM18() {
		return this.casaAverageBalMonthM18;
	}

	public void setCasaAverageBalMonthM18(BigDecimal casaAverageBalMonthM18) {
		this.casaAverageBalMonthM18 = casaAverageBalMonthM18;
	}

	public BigDecimal getCasaAverageBalMonthM19() {
		return this.casaAverageBalMonthM19;
	}

	public void setCasaAverageBalMonthM19(BigDecimal casaAverageBalMonthM19) {
		this.casaAverageBalMonthM19 = casaAverageBalMonthM19;
	}

	public BigDecimal getCasaAverageBalMonthM2() {
		return this.casaAverageBalMonthM2;
	}

	public void setCasaAverageBalMonthM2(BigDecimal casaAverageBalMonthM2) {
		this.casaAverageBalMonthM2 = casaAverageBalMonthM2;
	}

	public BigDecimal getCasaAverageBalMonthM20() {
		return this.casaAverageBalMonthM20;
	}

	public void setCasaAverageBalMonthM20(BigDecimal casaAverageBalMonthM20) {
		this.casaAverageBalMonthM20 = casaAverageBalMonthM20;
	}

	public BigDecimal getCasaAverageBalMonthM21() {
		return this.casaAverageBalMonthM21;
	}

	public void setCasaAverageBalMonthM21(BigDecimal casaAverageBalMonthM21) {
		this.casaAverageBalMonthM21 = casaAverageBalMonthM21;
	}

	public BigDecimal getCasaAverageBalMonthM22() {
		return this.casaAverageBalMonthM22;
	}

	public void setCasaAverageBalMonthM22(BigDecimal casaAverageBalMonthM22) {
		this.casaAverageBalMonthM22 = casaAverageBalMonthM22;
	}

	public BigDecimal getCasaAverageBalMonthM23() {
		return this.casaAverageBalMonthM23;
	}

	public void setCasaAverageBalMonthM23(BigDecimal casaAverageBalMonthM23) {
		this.casaAverageBalMonthM23 = casaAverageBalMonthM23;
	}

	public BigDecimal getCasaAverageBalMonthM24() {
		return this.casaAverageBalMonthM24;
	}

	public void setCasaAverageBalMonthM24(BigDecimal casaAverageBalMonthM24) {
		this.casaAverageBalMonthM24 = casaAverageBalMonthM24;
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

	public String getCustLatestEmpCompany() {
		return this.custLatestEmpCompany;
	}

	public void setCustLatestEmpCompany(String custLatestEmpCompany) {
		this.custLatestEmpCompany = custLatestEmpCompany;
	}

	public String getCustLatestEmpDepartment() {
		return this.custLatestEmpDepartment;
	}

	public void setCustLatestEmpDepartment(String custLatestEmpDepartment) {
		this.custLatestEmpDepartment = custLatestEmpDepartment;
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

	public BigDecimal getCustTotNoActiveContracts() {
		return this.custTotNoActiveContracts;
	}

	public void setCustTotNoActiveContracts(BigDecimal custTotNoActiveContracts) {
		this.custTotNoActiveContracts = custTotNoActiveContracts;
	}

	public String getProcessStatus() {
		return this.processStatus;
	}

	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}

	public BigDecimal getProdAccruedInt() {
		return this.prodAccruedInt;
	}

	public void setProdAccruedInt(BigDecimal prodAccruedInt) {
		this.prodAccruedInt = prodAccruedInt;
	}

	public BigDecimal getProdAddRate() {
		return this.prodAddRate;
	}

	public void setProdAddRate(BigDecimal prodAddRate) {
		this.prodAddRate = prodAddRate;
	}

	public BigDecimal getProdArmsBookValue() {
		return this.prodArmsBookValue;
	}

	public void setProdArmsBookValue(BigDecimal prodArmsBookValue) {
		this.prodArmsBookValue = prodArmsBookValue;
	}

	public String getProdArmsCollArea() {
		return this.prodArmsCollArea;
	}

	public void setProdArmsCollArea(String prodArmsCollArea) {
		this.prodArmsCollArea = prodArmsCollArea;
	}

	public String getProdArmsContractNumber() {
		return this.prodArmsContractNumber;
	}

	public void setProdArmsContractNumber(String prodArmsContractNumber) {
		this.prodArmsContractNumber = prodArmsContractNumber;
	}

	public BigDecimal getProdArmsManufactureYear() {
		return this.prodArmsManufactureYear;
	}

	public void setProdArmsManufactureYear(BigDecimal prodArmsManufactureYear) {
		this.prodArmsManufactureYear = prodArmsManufactureYear;
	}

	public String getProdArmsMitigantCode() {
		return this.prodArmsMitigantCode;
	}

	public void setProdArmsMitigantCode(String prodArmsMitigantCode) {
		this.prodArmsMitigantCode = prodArmsMitigantCode;
	}

	public String getProdArmsMitigantDesc() {
		return this.prodArmsMitigantDesc;
	}

	public void setProdArmsMitigantDesc(String prodArmsMitigantDesc) {
		this.prodArmsMitigantDesc = prodArmsMitigantDesc;
	}

	public String getProdArmsMitigantValOwner() {
		return this.prodArmsMitigantValOwner;
	}

	public void setProdArmsMitigantValOwner(String prodArmsMitigantValOwner) {
		this.prodArmsMitigantValOwner = prodArmsMitigantValOwner;
	}

	public BigDecimal getProdArmsMitigantValue() {
		return this.prodArmsMitigantValue;
	}

	public void setProdArmsMitigantValue(BigDecimal prodArmsMitigantValue) {
		this.prodArmsMitigantValue = prodArmsMitigantValue;
	}

	public BigDecimal getProdArmsPropEvalStatus() {
		return this.prodArmsPropEvalStatus;
	}

	public void setProdArmsPropEvalStatus(BigDecimal prodArmsPropEvalStatus) {
		this.prodArmsPropEvalStatus = prodArmsPropEvalStatus;
	}

	public String getProdArmsPropertyType() {
		return this.prodArmsPropertyType;
	}

	public void setProdArmsPropertyType(String prodArmsPropertyType) {
		this.prodArmsPropertyType = prodArmsPropertyType;
	}

	public String getProdArmsRegion() {
		return this.prodArmsRegion;
	}

	public void setProdArmsRegion(String prodArmsRegion) {
		this.prodArmsRegion = prodArmsRegion;
	}

	public BigDecimal getProdArmsValuationDiff() {
		return this.prodArmsValuationDiff;
	}

	public void setProdArmsValuationDiff(BigDecimal prodArmsValuationDiff) {
		this.prodArmsValuationDiff = prodArmsValuationDiff;
	}

	public BigDecimal getProdArmsVehiManufactYear() {
		return this.prodArmsVehiManufactYear;
	}

	public void setProdArmsVehiManufactYear(BigDecimal prodArmsVehiManufactYear) {
		this.prodArmsVehiManufactYear = prodArmsVehiManufactYear;
	}

	public String getprodArmsVehicleBrandCat() {
		return this.prodArmsVehicleBrandCat;
	}

	public void setprodArmsVehicleBrandCat(String prodArmsVehicleBrandCat) {
		this.prodArmsVehicleBrandCat = prodArmsVehicleBrandCat;
	}	
	
	public String getProdArmsVehicleBrandName() {
		return this.prodArmsVehicleBrandName;
	}

	public void setProdArmsVehicleBrandName(String prodArmsVehicleBrandName) {
		this.prodArmsVehicleBrandName = prodArmsVehicleBrandName;
	}

	public String getProdArmsVehicleBrandType() {
		return this.prodArmsVehicleBrandType;
	}

	public void setProdArmsVehicleBrandType(String prodArmsVehicleBrandType) {
		this.prodArmsVehicleBrandType = prodArmsVehicleBrandType;
	}

	public BigDecimal getProdBalloonAmount() {
		return this.prodBalloonAmount;
	}

	public void setProdBalloonAmount(BigDecimal prodBalloonAmount) {
		this.prodBalloonAmount = prodBalloonAmount;
	}

	public BigDecimal getProdBasicSalaryAmount() {
		return this.prodBasicSalaryAmount;
	}

	public void setProdBasicSalaryAmount(BigDecimal prodBasicSalaryAmount) {
		this.prodBasicSalaryAmount = prodBasicSalaryAmount;
	}

	public String getProdBranchShowroomAcc() {
		return this.prodBranchShowroomAcc;
	}

	public void setProdBranchShowroomAcc(String prodBranchShowroomAcc) {
		this.prodBranchShowroomAcc = prodBranchShowroomAcc;
	}

	public String getProdBranchShowroomAccCode() {
		return this.prodBranchShowroomAccCode;
	}

	public void setProdBranchShowroomAccCode(String prodBranchShowroomAccCode) {
		this.prodBranchShowroomAccCode = prodBranchShowroomAccCode;
	}

	public String getProdBranchShowroomCode() {
		return this.prodBranchShowroomCode;
	}

	public void setProdBranchShowroomCode(String prodBranchShowroomCode) {
		this.prodBranchShowroomCode = prodBranchShowroomCode;
	}

	public String getProdBusinessPosition() {
		return this.prodBusinessPosition;
	}

	public void setProdBusinessPosition(String prodBusinessPosition) {
		this.prodBusinessPosition = prodBusinessPosition;
	}

	public String getProdChannelCode() {
		return this.prodChannelCode;
	}

	public void setProdChannelCode(String prodChannelCode) {
		this.prodChannelCode = prodChannelCode;
	}

	public BigDecimal getProdCurBookBal() {
		return this.prodCurBookBal;
	}

	public void setProdCurBookBal(BigDecimal prodCurBookBal) {
		this.prodCurBookBal = prodCurBookBal;
	}

	public BigDecimal getProdCurrPay() {
		return this.prodCurrPay;
	}

	public void setProdCurrPay(BigDecimal prodCurrPay) {
		this.prodCurrPay = prodCurrPay;
	}

	public BigDecimal getProdCurrency() {
		return this.prodCurrency;
	}

	public void setProdCurrency(BigDecimal prodCurrency) {
		this.prodCurrency = prodCurrency;
	}

	public String getProdCusSubtype() {
		return this.prodCusSubtype;
	}

	public void setProdCusSubtype(String prodCusSubtype) {
		this.prodCusSubtype = prodCusSubtype;
	}

	public String getProdCustomerSegment() {
		return this.prodCustomerSegment;
	}

	public void setProdCustomerSegment(String prodCustomerSegment) {
		this.prodCustomerSegment = prodCustomerSegment;
	}

	public BigDecimal getProdDebtBurdenRatio() {
		return this.prodDebtBurdenRatio;
	}

	public void setProdDebtBurdenRatio(BigDecimal prodDebtBurdenRatio) {
		this.prodDebtBurdenRatio = prodDebtBurdenRatio;
	}

	public BigDecimal getProdDelinqAmountM0() {
		return this.prodDelinqAmountM0;
	}

	public void setProdDelinqAmountM0(BigDecimal prodDelinqAmountM0) {
		this.prodDelinqAmountM0 = prodDelinqAmountM0;
	}

	public BigDecimal getProdDelinqAmountM1() {
		return this.prodDelinqAmountM1;
	}

	public void setProdDelinqAmountM1(BigDecimal prodDelinqAmountM1) {
		this.prodDelinqAmountM1 = prodDelinqAmountM1;
	}

	public BigDecimal getProdDelinqAmountM10() {
		return this.prodDelinqAmountM10;
	}

	public void setProdDelinqAmountM10(BigDecimal prodDelinqAmountM10) {
		this.prodDelinqAmountM10 = prodDelinqAmountM10;
	}

	public BigDecimal getProdDelinqAmountM11() {
		return this.prodDelinqAmountM11;
	}

	public void setProdDelinqAmountM11(BigDecimal prodDelinqAmountM11) {
		this.prodDelinqAmountM11 = prodDelinqAmountM11;
	}

	public BigDecimal getProdDelinqAmountM12() {
		return this.prodDelinqAmountM12;
	}

	public void setProdDelinqAmountM12(BigDecimal prodDelinqAmountM12) {
		this.prodDelinqAmountM12 = prodDelinqAmountM12;
	}

	public BigDecimal getProdDelinqAmountM13() {
		return this.prodDelinqAmountM13;
	}

	public void setProdDelinqAmountM13(BigDecimal prodDelinqAmountM13) {
		this.prodDelinqAmountM13 = prodDelinqAmountM13;
	}

	public BigDecimal getProdDelinqAmountM14() {
		return this.prodDelinqAmountM14;
	}

	public void setProdDelinqAmountM14(BigDecimal prodDelinqAmountM14) {
		this.prodDelinqAmountM14 = prodDelinqAmountM14;
	}

	public BigDecimal getProdDelinqAmountM15() {
		return this.prodDelinqAmountM15;
	}

	public void setProdDelinqAmountM15(BigDecimal prodDelinqAmountM15) {
		this.prodDelinqAmountM15 = prodDelinqAmountM15;
	}

	public BigDecimal getProdDelinqAmountM16() {
		return this.prodDelinqAmountM16;
	}

	public void setProdDelinqAmountM16(BigDecimal prodDelinqAmountM16) {
		this.prodDelinqAmountM16 = prodDelinqAmountM16;
	}

	public BigDecimal getProdDelinqAmountM17() {
		return this.prodDelinqAmountM17;
	}

	public void setProdDelinqAmountM17(BigDecimal prodDelinqAmountM17) {
		this.prodDelinqAmountM17 = prodDelinqAmountM17;
	}

	public BigDecimal getProdDelinqAmountM18() {
		return this.prodDelinqAmountM18;
	}

	public void setProdDelinqAmountM18(BigDecimal prodDelinqAmountM18) {
		this.prodDelinqAmountM18 = prodDelinqAmountM18;
	}

	public BigDecimal getProdDelinqAmountM19() {
		return this.prodDelinqAmountM19;
	}

	public void setProdDelinqAmountM19(BigDecimal prodDelinqAmountM19) {
		this.prodDelinqAmountM19 = prodDelinqAmountM19;
	}

	public BigDecimal getProdDelinqAmountM2() {
		return this.prodDelinqAmountM2;
	}

	public void setProdDelinqAmountM2(BigDecimal prodDelinqAmountM2) {
		this.prodDelinqAmountM2 = prodDelinqAmountM2;
	}

	public BigDecimal getProdDelinqAmountM20() {
		return this.prodDelinqAmountM20;
	}

	public void setProdDelinqAmountM20(BigDecimal prodDelinqAmountM20) {
		this.prodDelinqAmountM20 = prodDelinqAmountM20;
	}

	public BigDecimal getProdDelinqAmountM21() {
		return this.prodDelinqAmountM21;
	}

	public void setProdDelinqAmountM21(BigDecimal prodDelinqAmountM21) {
		this.prodDelinqAmountM21 = prodDelinqAmountM21;
	}

	public BigDecimal getProdDelinqAmountM22() {
		return this.prodDelinqAmountM22;
	}

	public void setProdDelinqAmountM22(BigDecimal prodDelinqAmountM22) {
		this.prodDelinqAmountM22 = prodDelinqAmountM22;
	}

	public BigDecimal getProdDelinqAmountM23() {
		return this.prodDelinqAmountM23;
	}

	public void setProdDelinqAmountM23(BigDecimal prodDelinqAmountM23) {
		this.prodDelinqAmountM23 = prodDelinqAmountM23;
	}

	public BigDecimal getProdDelinqAmountM24() {
		return this.prodDelinqAmountM24;
	}

	public void setProdDelinqAmountM24(BigDecimal prodDelinqAmountM24) {
		this.prodDelinqAmountM24 = prodDelinqAmountM24;
	}

	public BigDecimal getProdDelinqAmountM3() {
		return this.prodDelinqAmountM3;
	}

	public void setProdDelinqAmountM3(BigDecimal prodDelinqAmountM3) {
		this.prodDelinqAmountM3 = prodDelinqAmountM3;
	}

	public BigDecimal getProdDelinqAmountM4() {
		return this.prodDelinqAmountM4;
	}

	public void setProdDelinqAmountM4(BigDecimal prodDelinqAmountM4) {
		this.prodDelinqAmountM4 = prodDelinqAmountM4;
	}

	public BigDecimal getProdDelinqAmountM5() {
		return this.prodDelinqAmountM5;
	}

	public void setProdDelinqAmountM5(BigDecimal prodDelinqAmountM5) {
		this.prodDelinqAmountM5 = prodDelinqAmountM5;
	}

	public BigDecimal getProdDelinqAmountM6() {
		return this.prodDelinqAmountM6;
	}

	public void setProdDelinqAmountM6(BigDecimal prodDelinqAmountM6) {
		this.prodDelinqAmountM6 = prodDelinqAmountM6;
	}

	public BigDecimal getProdDelinqAmountM7() {
		return this.prodDelinqAmountM7;
	}

	public void setProdDelinqAmountM7(BigDecimal prodDelinqAmountM7) {
		this.prodDelinqAmountM7 = prodDelinqAmountM7;
	}

	public BigDecimal getProdDelinqAmountM8() {
		return this.prodDelinqAmountM8;
	}

	public void setProdDelinqAmountM8(BigDecimal prodDelinqAmountM8) {
		this.prodDelinqAmountM8 = prodDelinqAmountM8;
	}

	public BigDecimal getProdDelinqAmountM9() {
		return this.prodDelinqAmountM9;
	}

	public void setProdDelinqAmountM9(BigDecimal prodDelinqAmountM9) {
		this.prodDelinqAmountM9 = prodDelinqAmountM9;
	}

	public BigDecimal getProdDelinqDaysM0() {
		return this.prodDelinqDaysM0;
	}

	public void setProdDelinqDaysM0(BigDecimal prodDelinqDaysM0) {
		this.prodDelinqDaysM0 = prodDelinqDaysM0;
	}

	public BigDecimal getProdDelinqDaysM1() {
		return this.prodDelinqDaysM1;
	}

	public void setProdDelinqDaysM1(BigDecimal prodDelinqDaysM1) {
		this.prodDelinqDaysM1 = prodDelinqDaysM1;
	}

	public BigDecimal getProdDelinqDaysM10() {
		return this.prodDelinqDaysM10;
	}

	public void setProdDelinqDaysM10(BigDecimal prodDelinqDaysM10) {
		this.prodDelinqDaysM10 = prodDelinqDaysM10;
	}

	public BigDecimal getProdDelinqDaysM11() {
		return this.prodDelinqDaysM11;
	}

	public void setProdDelinqDaysM11(BigDecimal prodDelinqDaysM11) {
		this.prodDelinqDaysM11 = prodDelinqDaysM11;
	}

	public BigDecimal getProdDelinqDaysM12() {
		return this.prodDelinqDaysM12;
	}

	public void setProdDelinqDaysM12(BigDecimal prodDelinqDaysM12) {
		this.prodDelinqDaysM12 = prodDelinqDaysM12;
	}

	public BigDecimal getProdDelinqDaysM13() {
		return this.prodDelinqDaysM13;
	}

	public void setProdDelinqDaysM13(BigDecimal prodDelinqDaysM13) {
		this.prodDelinqDaysM13 = prodDelinqDaysM13;
	}

	public BigDecimal getProdDelinqDaysM14() {
		return this.prodDelinqDaysM14;
	}

	public void setProdDelinqDaysM14(BigDecimal prodDelinqDaysM14) {
		this.prodDelinqDaysM14 = prodDelinqDaysM14;
	}

	public BigDecimal getProdDelinqDaysM15() {
		return this.prodDelinqDaysM15;
	}

	public void setProdDelinqDaysM15(BigDecimal prodDelinqDaysM15) {
		this.prodDelinqDaysM15 = prodDelinqDaysM15;
	}

	public BigDecimal getProdDelinqDaysM16() {
		return this.prodDelinqDaysM16;
	}

	public void setProdDelinqDaysM16(BigDecimal prodDelinqDaysM16) {
		this.prodDelinqDaysM16 = prodDelinqDaysM16;
	}

	public BigDecimal getProdDelinqDaysM17() {
		return this.prodDelinqDaysM17;
	}

	public void setProdDelinqDaysM17(BigDecimal prodDelinqDaysM17) {
		this.prodDelinqDaysM17 = prodDelinqDaysM17;
	}

	public BigDecimal getProdDelinqDaysM18() {
		return this.prodDelinqDaysM18;
	}

	public void setProdDelinqDaysM18(BigDecimal prodDelinqDaysM18) {
		this.prodDelinqDaysM18 = prodDelinqDaysM18;
	}

	public BigDecimal getProdDelinqDaysM19() {
		return this.prodDelinqDaysM19;
	}

	public void setProdDelinqDaysM19(BigDecimal prodDelinqDaysM19) {
		this.prodDelinqDaysM19 = prodDelinqDaysM19;
	}

	public BigDecimal getProdDelinqDaysM2() {
		return this.prodDelinqDaysM2;
	}

	public void setProdDelinqDaysM2(BigDecimal prodDelinqDaysM2) {
		this.prodDelinqDaysM2 = prodDelinqDaysM2;
	}

	public BigDecimal getProdDelinqDaysM20() {
		return this.prodDelinqDaysM20;
	}

	public void setProdDelinqDaysM20(BigDecimal prodDelinqDaysM20) {
		this.prodDelinqDaysM20 = prodDelinqDaysM20;
	}

	public BigDecimal getProdDelinqDaysM21() {
		return this.prodDelinqDaysM21;
	}

	public void setProdDelinqDaysM21(BigDecimal prodDelinqDaysM21) {
		this.prodDelinqDaysM21 = prodDelinqDaysM21;
	}

	public BigDecimal getProdDelinqDaysM22() {
		return this.prodDelinqDaysM22;
	}

	public void setProdDelinqDaysM22(BigDecimal prodDelinqDaysM22) {
		this.prodDelinqDaysM22 = prodDelinqDaysM22;
	}

	public BigDecimal getProdDelinqDaysM23() {
		return this.prodDelinqDaysM23;
	}

	public void setProdDelinqDaysM23(BigDecimal prodDelinqDaysM23) {
		this.prodDelinqDaysM23 = prodDelinqDaysM23;
	}

	public BigDecimal getProdDelinqDaysM24() {
		return this.prodDelinqDaysM24;
	}

	public void setProdDelinqDaysM24(BigDecimal prodDelinqDaysM24) {
		this.prodDelinqDaysM24 = prodDelinqDaysM24;
	}

	public BigDecimal getProdDelinqDaysM3() {
		return this.prodDelinqDaysM3;
	}

	public void setProdDelinqDaysM3(BigDecimal prodDelinqDaysM3) {
		this.prodDelinqDaysM3 = prodDelinqDaysM3;
	}

	public BigDecimal getProdDelinqDaysM4() {
		return this.prodDelinqDaysM4;
	}

	public void setProdDelinqDaysM4(BigDecimal prodDelinqDaysM4) {
		this.prodDelinqDaysM4 = prodDelinqDaysM4;
	}

	public BigDecimal getProdDelinqDaysM5() {
		return this.prodDelinqDaysM5;
	}

	public void setProdDelinqDaysM5(BigDecimal prodDelinqDaysM5) {
		this.prodDelinqDaysM5 = prodDelinqDaysM5;
	}

	public BigDecimal getProdDelinqDaysM6() {
		return this.prodDelinqDaysM6;
	}

	public void setProdDelinqDaysM6(BigDecimal prodDelinqDaysM6) {
		this.prodDelinqDaysM6 = prodDelinqDaysM6;
	}

	public BigDecimal getProdDelinqDaysM7() {
		return this.prodDelinqDaysM7;
	}

	public void setProdDelinqDaysM7(BigDecimal prodDelinqDaysM7) {
		this.prodDelinqDaysM7 = prodDelinqDaysM7;
	}

	public BigDecimal getProdDelinqDaysM8() {
		return this.prodDelinqDaysM8;
	}

	public void setProdDelinqDaysM8(BigDecimal prodDelinqDaysM8) {
		this.prodDelinqDaysM8 = prodDelinqDaysM8;
	}

	public BigDecimal getProdDelinqDaysM9() {
		return this.prodDelinqDaysM9;
	}

	public void setProdDelinqDaysM9(BigDecimal prodDelinqDaysM9) {
		this.prodDelinqDaysM9 = prodDelinqDaysM9;
	}

	public BigDecimal getProdDependents() {
		return this.prodDependents;
	}

	public void setProdDependents(BigDecimal prodDependents) {
		this.prodDependents = prodDependents;
	}

	public String getProdDeptCode() {
		return this.prodDeptCode;
	}

	public void setProdDeptCode(String prodDeptCode) {
		this.prodDeptCode = prodDeptCode;
	}

	public BigDecimal getProdDisbursementAmount() {
		return this.prodDisbursementAmount;
	}

	public void setProdDisbursementAmount(BigDecimal prodDisbursementAmount) {
		this.prodDisbursementAmount = prodDisbursementAmount;
	}

	public Date getProdDisbursementDate() {
		return this.prodDisbursementDate;
	}

	public void setProdDisbursementDate(Date prodDisbursementDate) {
		this.prodDisbursementDate = prodDisbursementDate;
	}

	public BigDecimal getProdDownpaymentAmt() {
		return this.prodDownpaymentAmt;
	}

	public void setProdDownpaymentAmt(BigDecimal prodDownpaymentAmt) {
		this.prodDownpaymentAmt = prodDownpaymentAmt;
	}

	public BigDecimal getProdDurationInMonth() {
		return this.prodDurationInMonth;
	}

	public void setProdDurationInMonth(BigDecimal prodDurationInMonth) {
		this.prodDurationInMonth = prodDurationInMonth;
	}

	public BigDecimal getProdEmiM0() {
		return this.prodEmiM0;
	}

	public void setProdEmiM0(BigDecimal prodEmiM0) {
		this.prodEmiM0 = prodEmiM0;
	}

	public BigDecimal getProdEmiM1() {
		return this.prodEmiM1;
	}

	public void setProdEmiM1(BigDecimal prodEmiM1) {
		this.prodEmiM1 = prodEmiM1;
	}

	public BigDecimal getProdEmiM10() {
		return this.prodEmiM10;
	}

	public void setProdEmiM10(BigDecimal prodEmiM10) {
		this.prodEmiM10 = prodEmiM10;
	}

	public BigDecimal getProdEmiM11() {
		return this.prodEmiM11;
	}

	public void setProdEmiM11(BigDecimal prodEmiM11) {
		this.prodEmiM11 = prodEmiM11;
	}

	public BigDecimal getProdEmiM12() {
		return this.prodEmiM12;
	}

	public void setProdEmiM12(BigDecimal prodEmiM12) {
		this.prodEmiM12 = prodEmiM12;
	}

	public BigDecimal getProdEmiM13() {
		return this.prodEmiM13;
	}

	public void setProdEmiM13(BigDecimal prodEmiM13) {
		this.prodEmiM13 = prodEmiM13;
	}

	public BigDecimal getProdEmiM14() {
		return this.prodEmiM14;
	}

	public void setProdEmiM14(BigDecimal prodEmiM14) {
		this.prodEmiM14 = prodEmiM14;
	}

	public BigDecimal getProdEmiM15() {
		return this.prodEmiM15;
	}

	public void setProdEmiM15(BigDecimal prodEmiM15) {
		this.prodEmiM15 = prodEmiM15;
	}

	public BigDecimal getProdEmiM16() {
		return this.prodEmiM16;
	}

	public void setProdEmiM16(BigDecimal prodEmiM16) {
		this.prodEmiM16 = prodEmiM16;
	}

	public BigDecimal getProdEmiM17() {
		return this.prodEmiM17;
	}

	public void setProdEmiM17(BigDecimal prodEmiM17) {
		this.prodEmiM17 = prodEmiM17;
	}

	public BigDecimal getProdEmiM18() {
		return this.prodEmiM18;
	}

	public void setProdEmiM18(BigDecimal prodEmiM18) {
		this.prodEmiM18 = prodEmiM18;
	}

	public BigDecimal getProdEmiM19() {
		return this.prodEmiM19;
	}

	public void setProdEmiM19(BigDecimal prodEmiM19) {
		this.prodEmiM19 = prodEmiM19;
	}

	public BigDecimal getProdEmiM2() {
		return this.prodEmiM2;
	}

	public void setProdEmiM2(BigDecimal prodEmiM2) {
		this.prodEmiM2 = prodEmiM2;
	}

	public BigDecimal getProdEmiM20() {
		return this.prodEmiM20;
	}

	public void setProdEmiM20(BigDecimal prodEmiM20) {
		this.prodEmiM20 = prodEmiM20;
	}

	public BigDecimal getProdEmiM21() {
		return this.prodEmiM21;
	}

	public void setProdEmiM21(BigDecimal prodEmiM21) {
		this.prodEmiM21 = prodEmiM21;
	}

	public BigDecimal getProdEmiM22() {
		return this.prodEmiM22;
	}

	public void setProdEmiM22(BigDecimal prodEmiM22) {
		this.prodEmiM22 = prodEmiM22;
	}

	public BigDecimal getProdEmiM23() {
		return this.prodEmiM23;
	}

	public void setProdEmiM23(BigDecimal prodEmiM23) {
		this.prodEmiM23 = prodEmiM23;
	}

	public BigDecimal getProdEmiM24() {
		return this.prodEmiM24;
	}

	public void setProdEmiM24(BigDecimal prodEmiM24) {
		this.prodEmiM24 = prodEmiM24;
	}

	public BigDecimal getProdEmiM3() {
		return this.prodEmiM3;
	}

	public void setProdEmiM3(BigDecimal prodEmiM3) {
		this.prodEmiM3 = prodEmiM3;
	}

	public BigDecimal getProdEmiM4() {
		return this.prodEmiM4;
	}

	public void setProdEmiM4(BigDecimal prodEmiM4) {
		this.prodEmiM4 = prodEmiM4;
	}

	public BigDecimal getProdEmiM5() {
		return this.prodEmiM5;
	}

	public void setProdEmiM5(BigDecimal prodEmiM5) {
		this.prodEmiM5 = prodEmiM5;
	}

	public BigDecimal getProdEmiM6() {
		return this.prodEmiM6;
	}

	public void setProdEmiM6(BigDecimal prodEmiM6) {
		this.prodEmiM6 = prodEmiM6;
	}

	public BigDecimal getProdEmiM7() {
		return this.prodEmiM7;
	}

	public void setProdEmiM7(BigDecimal prodEmiM7) {
		this.prodEmiM7 = prodEmiM7;
	}

	public BigDecimal getProdEmiM8() {
		return this.prodEmiM8;
	}

	public void setProdEmiM8(BigDecimal prodEmiM8) {
		this.prodEmiM8 = prodEmiM8;
	}

	public BigDecimal getProdEmiM9() {
		return this.prodEmiM9;
	}

	public void setProdEmiM9(BigDecimal prodEmiM9) {
		this.prodEmiM9 = prodEmiM9;
	}

	public String getProdEmpCompany() {
		return this.prodEmpCompany;
	}

	public void setProdEmpCompany(String prodEmpCompany) {
		this.prodEmpCompany = prodEmpCompany;
	}

	public String getProdEmpDepartment() {
		return this.prodEmpDepartment;
	}

	public void setProdEmpDepartment(String prodEmpDepartment) {
		this.prodEmpDepartment = prodEmpDepartment;
	}

	public String getProdEmployeeType() {
		return this.prodEmployeeType;
	}

	public void setProdEmployeeType(String prodEmployeeType) {
		this.prodEmployeeType = prodEmployeeType;
	}

	public String getProdEmployerClassCode() {
		return this.prodEmployerClassCode;
	}

	public void setProdEmployerClassCode(String prodEmployerClassCode) {
		this.prodEmployerClassCode = prodEmployerClassCode;
	}

	public Date getProdEmployerEngagementDate() {
		return this.prodEmployerEngagementDate;
	}

	public void setProdEmployerEngagementDate(Date prodEmployerEngagementDate) {
		this.prodEmployerEngagementDate = prodEmployerEngagementDate;
	}

	public BigDecimal getProdEndServiceBenefitAmt() {
		return this.prodEndServiceBenefitAmt;
	}

	public void setProdEndServiceBenefitAmt(BigDecimal prodEndServiceBenefitAmt) {
		this.prodEndServiceBenefitAmt = prodEndServiceBenefitAmt;
	}

	public BigDecimal getProdFees() {
		return this.prodFees;
	}

	public void setProdFees(BigDecimal prodFees) {
		this.prodFees = prodFees;
	}

	public BigDecimal getProdFinanceAmt() {
		return this.prodFinanceAmt;
	}

	public void setProdFinanceAmt(BigDecimal prodFinanceAmt) {
		this.prodFinanceAmt = prodFinanceAmt;
	}

	public Date getProdFirstApplicationDate() {
		return this.prodFirstApplicationDate;
	}

	public void setProdFirstApplicationDate(Date prodFirstApplicationDate) {
		this.prodFirstApplicationDate = prodFirstApplicationDate;
	}

	public Date getProdFirstApprovalDate() {
		return this.prodFirstApprovalDate;
	}

	public void setProdFirstApprovalDate(Date prodFirstApprovalDate) {
		this.prodFirstApprovalDate = prodFirstApprovalDate;
	}

	public Date getProdFirstOpenDate() {
		return this.prodFirstOpenDate;
	}

	public void setProdFirstOpenDate(Date prodFirstOpenDate) {
		this.prodFirstOpenDate = prodFirstOpenDate;
	}

	public BigDecimal getProdGrossSalary() {
		return this.prodGrossSalary;
	}

	public void setProdGrossSalary(BigDecimal prodGrossSalary) {
		this.prodGrossSalary = prodGrossSalary;
	}

	public BigDecimal getProdInstalAmt() {
		return this.prodInstalAmt;
	}

	public void setProdInstalAmt(BigDecimal prodInstalAmt) {
		this.prodInstalAmt = prodInstalAmt;
	}

	public String getProdInstalWithInsurance() {
		return this.prodInstalWithInsurance;
	}

	public void setProdInstalWithInsurance(String prodInstalWithInsurance) {
		this.prodInstalWithInsurance = prodInstalWithInsurance;
	}

	public Date getProdLastApplicationDate() {
		return this.prodLastApplicationDate;
	}

	public void setProdLastApplicationDate(Date prodLastApplicationDate) {
		this.prodLastApplicationDate = prodLastApplicationDate;
	}

	public Date getProdLastApprovalDate() {
		return this.prodLastApprovalDate;
	}

	public void setProdLastApprovalDate(Date prodLastApprovalDate) {
		this.prodLastApprovalDate = prodLastApprovalDate;
	}

	public Date getProdLastOpenDate() {
		return this.prodLastOpenDate;
	}

	public void setProdLastOpenDate(Date prodLastOpenDate) {
		this.prodLastOpenDate = prodLastOpenDate;
	}

	public Date getProdLastPaymentDate() {
		return this.prodLastPaymentDate;
	}

	public void setProdLastPaymentDate(Date prodLastPaymentDate) {
		this.prodLastPaymentDate = prodLastPaymentDate;
	}

	public Date getProdMatureDate() {
		return this.prodMatureDate;
	}

	public void setProdMatureDate(Date prodMatureDate) {
		this.prodMatureDate = prodMatureDate;
	}

	public String getProdMilitaryRank() {
		return this.prodMilitaryRank;
	}

	public void setProdMilitaryRank(String prodMilitaryRank) {
		this.prodMilitaryRank = prodMilitaryRank;
	}

	public BigDecimal getProdMonthlyAllowanceAmt() {
		return this.prodMonthlyAllowanceAmt;
	}

	public void setProdMonthlyAllowanceAmt(BigDecimal prodMonthlyAllowanceAmt) {
		this.prodMonthlyAllowanceAmt = prodMonthlyAllowanceAmt;
	}

	public BigDecimal getProdMonthlyOtherIncomeAmt() {
		return this.prodMonthlyOtherIncomeAmt;
	}

	public void setProdMonthlyOtherIncomeAmt(BigDecimal prodMonthlyOtherIncomeAmt) {
		this.prodMonthlyOtherIncomeAmt = prodMonthlyOtherIncomeAmt;
	}

	public BigDecimal getProdNetBal() {
		return this.prodNetBal;
	}

	public void setProdNetBal(BigDecimal prodNetBal) {
		this.prodNetBal = prodNetBal;
	}

	public Date getProdNextPayDate() {
		return this.prodNextPayDate;
	}

	public void setProdNextPayDate(Date prodNextPayDate) {
		this.prodNextPayDate = prodNextPayDate;
	}

	public BigDecimal getProdNoOfDelinqInst() {
		return this.prodNoOfDelinqInst;
	}

	public void setProdNoOfDelinqInst(BigDecimal prodNoOfDelinqInst) {
		this.prodNoOfDelinqInst = prodNoOfDelinqInst;
	}

	public BigDecimal getProdOrigApprovalAmt() {
		return this.prodOrigApprovalAmt;
	}

	public void setProdOrigApprovalAmt(BigDecimal prodOrigApprovalAmt) {
		this.prodOrigApprovalAmt = prodOrigApprovalAmt;
	}

	public BigDecimal getProdOrigBalance() {
		return this.prodOrigBalance;
	}

	public void setProdOrigBalance(BigDecimal prodOrigBalance) {
		this.prodOrigBalance = prodOrigBalance;
	}

	public BigDecimal getProdOrigPay() {
		return this.prodOrigPay;
	}

	public void setProdOrigPay(BigDecimal prodOrigPay) {
		this.prodOrigPay = prodOrigPay;
	}

	public BigDecimal getProdOrigProfit() {
		return this.prodOrigProfit;
	}

	public void setProdOrigProfit(BigDecimal prodOrigProfit) {
		this.prodOrigProfit = prodOrigProfit;
	}

	public BigDecimal getProdOthMonthlyDeductAmt() {
		return this.prodOthMonthlyDeductAmt;
	}

	public void setProdOthMonthlyDeductAmt(BigDecimal prodOthMonthlyDeductAmt) {
		this.prodOthMonthlyDeductAmt = prodOthMonthlyDeductAmt;
	}

	public BigDecimal getProdOutstandingAccrualPft() {
		return this.prodOutstandingAccrualPft;
	}

	public void setProdOutstandingAccrualPft(BigDecimal prodOutstandingAccrualPft) {
		this.prodOutstandingAccrualPft = prodOutstandingAccrualPft;
	}

	public BigDecimal getProdOutstandingAmountM0() {
		return this.prodOutstandingAmountM0;
	}

	public void setProdOutstandingAmountM0(BigDecimal prodOutstandingAmountM0) {
		this.prodOutstandingAmountM0 = prodOutstandingAmountM0;
	}

	public BigDecimal getProdOutstandingAmountM1() {
		return this.prodOutstandingAmountM1;
	}

	public void setProdOutstandingAmountM1(BigDecimal prodOutstandingAmountM1) {
		this.prodOutstandingAmountM1 = prodOutstandingAmountM1;
	}

	public BigDecimal getProdOutstandingAmountM10() {
		return this.prodOutstandingAmountM10;
	}

	public void setProdOutstandingAmountM10(BigDecimal prodOutstandingAmountM10) {
		this.prodOutstandingAmountM10 = prodOutstandingAmountM10;
	}

	public BigDecimal getProdOutstandingAmountM11() {
		return this.prodOutstandingAmountM11;
	}

	public void setProdOutstandingAmountM11(BigDecimal prodOutstandingAmountM11) {
		this.prodOutstandingAmountM11 = prodOutstandingAmountM11;
	}

	public BigDecimal getProdOutstandingAmountM12() {
		return this.prodOutstandingAmountM12;
	}

	public void setProdOutstandingAmountM12(BigDecimal prodOutstandingAmountM12) {
		this.prodOutstandingAmountM12 = prodOutstandingAmountM12;
	}

	public BigDecimal getProdOutstandingAmountM13() {
		return this.prodOutstandingAmountM13;
	}

	public void setProdOutstandingAmountM13(BigDecimal prodOutstandingAmountM13) {
		this.prodOutstandingAmountM13 = prodOutstandingAmountM13;
	}

	public BigDecimal getProdOutstandingAmountM14() {
		return this.prodOutstandingAmountM14;
	}

	public void setProdOutstandingAmountM14(BigDecimal prodOutstandingAmountM14) {
		this.prodOutstandingAmountM14 = prodOutstandingAmountM14;
	}

	public BigDecimal getProdOutstandingAmountM15() {
		return this.prodOutstandingAmountM15;
	}

	public void setProdOutstandingAmountM15(BigDecimal prodOutstandingAmountM15) {
		this.prodOutstandingAmountM15 = prodOutstandingAmountM15;
	}

	public BigDecimal getProdOutstandingAmountM16() {
		return this.prodOutstandingAmountM16;
	}

	public void setProdOutstandingAmountM16(BigDecimal prodOutstandingAmountM16) {
		this.prodOutstandingAmountM16 = prodOutstandingAmountM16;
	}

	public BigDecimal getProdOutstandingAmountM17() {
		return this.prodOutstandingAmountM17;
	}

	public void setProdOutstandingAmountM17(BigDecimal prodOutstandingAmountM17) {
		this.prodOutstandingAmountM17 = prodOutstandingAmountM17;
	}

	public BigDecimal getProdOutstandingAmountM18() {
		return this.prodOutstandingAmountM18;
	}

	public void setProdOutstandingAmountM18(BigDecimal prodOutstandingAmountM18) {
		this.prodOutstandingAmountM18 = prodOutstandingAmountM18;
	}

	public BigDecimal getProdOutstandingAmountM19() {
		return this.prodOutstandingAmountM19;
	}

	public void setProdOutstandingAmountM19(BigDecimal prodOutstandingAmountM19) {
		this.prodOutstandingAmountM19 = prodOutstandingAmountM19;
	}

	public BigDecimal getProdOutstandingAmountM2() {
		return this.prodOutstandingAmountM2;
	}

	public void setProdOutstandingAmountM2(BigDecimal prodOutstandingAmountM2) {
		this.prodOutstandingAmountM2 = prodOutstandingAmountM2;
	}

	public BigDecimal getProdOutstandingAmountM20() {
		return this.prodOutstandingAmountM20;
	}

	public void setProdOutstandingAmountM20(BigDecimal prodOutstandingAmountM20) {
		this.prodOutstandingAmountM20 = prodOutstandingAmountM20;
	}

	public BigDecimal getProdOutstandingAmountM21() {
		return this.prodOutstandingAmountM21;
	}

	public void setProdOutstandingAmountM21(BigDecimal prodOutstandingAmountM21) {
		this.prodOutstandingAmountM21 = prodOutstandingAmountM21;
	}

	public BigDecimal getProdOutstandingAmountM22() {
		return this.prodOutstandingAmountM22;
	}

	public void setProdOutstandingAmountM22(BigDecimal prodOutstandingAmountM22) {
		this.prodOutstandingAmountM22 = prodOutstandingAmountM22;
	}

	public BigDecimal getProdOutstandingAmountM23() {
		return this.prodOutstandingAmountM23;
	}

	public void setProdOutstandingAmountM23(BigDecimal prodOutstandingAmountM23) {
		this.prodOutstandingAmountM23 = prodOutstandingAmountM23;
	}

	public BigDecimal getProdOutstandingAmountM24() {
		return this.prodOutstandingAmountM24;
	}

	public void setProdOutstandingAmountM24(BigDecimal prodOutstandingAmountM24) {
		this.prodOutstandingAmountM24 = prodOutstandingAmountM24;
	}

	public BigDecimal getProdOutstandingAmountM3() {
		return this.prodOutstandingAmountM3;
	}

	public void setProdOutstandingAmountM3(BigDecimal prodOutstandingAmountM3) {
		this.prodOutstandingAmountM3 = prodOutstandingAmountM3;
	}

	public BigDecimal getProdOutstandingAmountM4() {
		return this.prodOutstandingAmountM4;
	}

	public void setProdOutstandingAmountM4(BigDecimal prodOutstandingAmountM4) {
		this.prodOutstandingAmountM4 = prodOutstandingAmountM4;
	}

	public BigDecimal getProdOutstandingAmountM5() {
		return this.prodOutstandingAmountM5;
	}

	public void setProdOutstandingAmountM5(BigDecimal prodOutstandingAmountM5) {
		this.prodOutstandingAmountM5 = prodOutstandingAmountM5;
	}

	public BigDecimal getProdOutstandingAmountM6() {
		return this.prodOutstandingAmountM6;
	}

	public void setProdOutstandingAmountM6(BigDecimal prodOutstandingAmountM6) {
		this.prodOutstandingAmountM6 = prodOutstandingAmountM6;
	}

	public BigDecimal getProdOutstandingAmountM7() {
		return this.prodOutstandingAmountM7;
	}

	public void setProdOutstandingAmountM7(BigDecimal prodOutstandingAmountM7) {
		this.prodOutstandingAmountM7 = prodOutstandingAmountM7;
	}

	public BigDecimal getProdOutstandingAmountM8() {
		return this.prodOutstandingAmountM8;
	}

	public void setProdOutstandingAmountM8(BigDecimal prodOutstandingAmountM8) {
		this.prodOutstandingAmountM8 = prodOutstandingAmountM8;
	}

	public BigDecimal getProdOutstandingAmountM9() {
		return this.prodOutstandingAmountM9;
	}

	public void setProdOutstandingAmountM9(BigDecimal prodOutstandingAmountM9) {
		this.prodOutstandingAmountM9 = prodOutstandingAmountM9;
	}

	public BigDecimal getProdOutstandingTotalPft() {
		return this.prodOutstandingTotalPft;
	}

	public void setProdOutstandingTotalPft(BigDecimal prodOutstandingTotalPft) {
		this.prodOutstandingTotalPft = prodOutstandingTotalPft;
	}

	public BigDecimal getProdPaymentPrincipalAmt() {
		return this.prodPaymentPrincipalAmt;
	}

	public void setProdPaymentPrincipalAmt(BigDecimal prodPaymentPrincipalAmt) {
		this.prodPaymentPrincipalAmt = prodPaymentPrincipalAmt;
	}

	public String getProdProductCode() {
		return this.prodProductCode;
	}

	public void setProdProductCode(String prodProductCode) {
		this.prodProductCode = prodProductCode;
	}

	public String getProdProductType() {
		return this.prodProductType;
	}

	public void setProdProductType(String prodProductType) {
		this.prodProductType = prodProductType;
	}

	public String getProdProfitRateSubType() {
		return this.prodProfitRateSubType;
	}

	public void setProdProfitRateSubType(String prodProfitRateSubType) {
		this.prodProfitRateSubType = prodProfitRateSubType;
	}

	public BigDecimal getProdRate() {
		return this.prodRate;
	}

	public void setProdRate(BigDecimal prodRate) {
		this.prodRate = prodRate;
	}

	public String getProdRelationContractType() {
		return this.prodRelationContractType;
	}

	public void setProdRelationContractType(String prodRelationContractType) {
		this.prodRelationContractType = prodRelationContractType;
	}

	public BigDecimal getProdRemainPayments() {
		return this.prodRemainPayments;
	}

	public void setProdRemainPayments(BigDecimal prodRemainPayments) {
		this.prodRemainPayments = prodRemainPayments;
	}

	public BigDecimal getProdRemainTerm() {
		return this.prodRemainTerm;
	}

	public void setProdRemainTerm(BigDecimal prodRemainTerm) {
		this.prodRemainTerm = prodRemainTerm;
	}

	public String getProdSalaryTransferType() {
		return this.prodSalaryTransferType;
	}

	public void setProdSalaryTransferType(String prodSalaryTransferType) {
		this.prodSalaryTransferType = prodSalaryTransferType;
	}

	public String getProdSalaryTransferTypeCtf() {
		return this.prodSalaryTransferTypeCtf;
	}

	public void setProdSalaryTransferTypeCtf(String prodSalaryTransferTypeCtf) {
		this.prodSalaryTransferTypeCtf = prodSalaryTransferTypeCtf;
	}

	public String getProdSalesBranch() {
		return this.prodSalesBranch;
	}

	public void setProdSalesBranch(String prodSalesBranch) {
		this.prodSalesBranch = prodSalesBranch;
	}

	public String getProdSalesCd() {
		return this.prodSalesCd;
	}

	public void setProdSalesCd(String prodSalesCd) {
		this.prodSalesCd = prodSalesCd;
	}

	public String getProdSalesUserid() {
		return this.prodSalesUserid;
	}

	public void setProdSalesUserid(String prodSalesUserid) {
		this.prodSalesUserid = prodSalesUserid;
	}

	public String getProdSpare101() {
		return this.prodSpare101;
	}

	public void setProdSpare101(String prodSpare101) {
		this.prodSpare101 = prodSpare101;
	}

	public String getProdSpare102() {
		return this.prodSpare102;
	}

	public void setProdSpare102(String prodSpare102) {
		this.prodSpare102 = prodSpare102;
	}

	public String getProdSpare103() {
		return this.prodSpare103;
	}

	public void setProdSpare103(String prodSpare103) {
		this.prodSpare103 = prodSpare103;
	}

	public String getProdSpare104() {
		return this.prodSpare104;
	}

	public void setProdSpare104(String prodSpare104) {
		this.prodSpare104 = prodSpare104;
	}

	public String getProdSpare105() {
		return this.prodSpare105;
	}

	public void setProdSpare105(String prodSpare105) {
		this.prodSpare105 = prodSpare105;
	}

	public String getProdSpare106() {
		return this.prodSpare106;
	}

	public void setProdSpare106(String prodSpare106) {
		this.prodSpare106 = prodSpare106;
	}

	public String getProdSpare107() {
		return this.prodSpare107;
	}

	public void setProdSpare107(String prodSpare107) {
		this.prodSpare107 = prodSpare107;
	}

	public String getProdSpare108() {
		return this.prodSpare108;
	}

	public void setProdSpare108(String prodSpare108) {
		this.prodSpare108 = prodSpare108;
	}

	public String getProdSpare109() {
		return this.prodSpare109;
	}

	public void setProdSpare109(String prodSpare109) {
		this.prodSpare109 = prodSpare109;
	}

	public String getProdSpare110() {
		return this.prodSpare110;
	}

	public void setProdSpare110(String prodSpare110) {
		this.prodSpare110 = prodSpare110;
	}

	public String getProdSpare111() {
		return this.prodSpare111;
	}

	public void setProdSpare111(String prodSpare111) {
		this.prodSpare111 = prodSpare111;
	}

	public String getProdSpare112() {
		return this.prodSpare112;
	}

	public void setProdSpare112(String prodSpare112) {
		this.prodSpare112 = prodSpare112;
	}

	public String getProdSpare113() {
		return this.prodSpare113;
	}

	public void setProdSpare113(String prodSpare113) {
		this.prodSpare113 = prodSpare113;
	}

	public String getProdSpare114() {
		return this.prodSpare114;
	}

	public void setProdSpare114(String prodSpare114) {
		this.prodSpare114 = prodSpare114;
	}

	public String getProdSpare115() {
		return this.prodSpare115;
	}

	public void setProdSpare115(String prodSpare115) {
		this.prodSpare115 = prodSpare115;
	}

	public String getProdSpare116() {
		return this.prodSpare116;
	}

	public void setProdSpare116(String prodSpare116) {
		this.prodSpare116 = prodSpare116;
	}

	public String getProdSpare117() {
		return this.prodSpare117;
	}

	public void setProdSpare117(String prodSpare117) {
		this.prodSpare117 = prodSpare117;
	}

	public String getProdSpare118() {
		return this.prodSpare118;
	}

	public void setProdSpare118(String prodSpare118) {
		this.prodSpare118 = prodSpare118;
	}

	public String getProdSpare119() {
		return this.prodSpare119;
	}

	public void setProdSpare119(String prodSpare119) {
		this.prodSpare119 = prodSpare119;
	}

	public String getProdSpare120() {
		return this.prodSpare120;
	}

	public void setProdSpare120(String prodSpare120) {
		this.prodSpare120 = prodSpare120;
	}

	public BigDecimal getProdSubCode() {
		return this.prodSubCode;
	}

	public void setProdSubCode(BigDecimal prodSubCode) {
		this.prodSubCode = prodSubCode;
	}

	public BigDecimal getProdTerm() {
		return this.prodTerm;
	}

	public void setProdTerm(BigDecimal prodTerm) {
		this.prodTerm = prodTerm;
	}

	public BigDecimal getProdTotGracePrdProfit() {
		return this.prodTotGracePrdProfit;
	}

	public void setProdTotGracePrdProfit(BigDecimal prodTotGracePrdProfit) {
		this.prodTotGracePrdProfit = prodTotGracePrdProfit;
	}

	public BigDecimal getProdTotalEarlyPaymentAmt() {
		return this.prodTotalEarlyPaymentAmt;
	}

	public void setProdTotalEarlyPaymentAmt(BigDecimal prodTotalEarlyPaymentAmt) {
		this.prodTotalEarlyPaymentAmt = prodTotalEarlyPaymentAmt;
	}

	public BigDecimal getProdTotalInstallDueAmt() {
		return this.prodTotalInstallDueAmt;
	}

	public void setProdTotalInstallDueAmt(BigDecimal prodTotalInstallDueAmt) {
		this.prodTotalInstallDueAmt = prodTotalInstallDueAmt;
	}

	public BigDecimal getProdTotalNoOpenContracts() {
		return this.prodTotalNoOpenContracts;
	}

	public void setProdTotalNoOpenContracts(BigDecimal prodTotalNoOpenContracts) {
		this.prodTotalNoOpenContracts = prodTotalNoOpenContracts;
	}

	public BigDecimal getProdTotalPayments() {
		return this.prodTotalPayments;
	}

	public void setProdTotalPayments(BigDecimal prodTotalPayments) {
		this.prodTotalPayments = prodTotalPayments;
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

	public BigDecimal getSimahNoOfExecExjudg() {
		return this.simahNoOfExecExjudg;
	}

	public void setSimahNoOfExecExjudg(BigDecimal simahNoOfExecExjudg) {
		this.simahNoOfExecExjudg = simahNoOfExecExjudg;
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