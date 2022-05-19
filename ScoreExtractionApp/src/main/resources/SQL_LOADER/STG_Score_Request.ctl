OPTIONS (SKIP=1)
LOAD DATA
INFILE 'D:\ScoreExtractionGitHub\ScoreExtraction\ScoreExtractionApp\src\main\resources\PROCESSING\STG_Score_Request.csv'
APPEND
INTO TABLE STG_SCORE_REQUEST
 FIELDS TERMINATED BY ","
 TRAILING NULLCOLS
 ( 
    RUN_ID "RUN_ID_FNC",
    RUN_DATE "TO_DATE(:RUN_DATE,'YYYYMMDD')",
    CONTRACT_NUMBER,
    CIC,
    PRODUCT_CODE,
    SALARY_TRANSFER,
    OPEN_DATE "TO_DATE(:OPEN_DATE,'YYYYMMDD')",
    BRANCH_SHOWROOM_ACC,
    EMP_COMPANY,
    EMP_DEPARTMENT,
    MILITARY_RANK,
    DURATION_IN_MONTH,
    GROSS_SALARY,
    DEPENDENTS,
    DATE_OF_BIRTH "TO_DATE(:DATE_OF_BIRTH,'YYYYMMDD')",
    EMPLOYER_ENGAGEMENT_DT "TO_DATE(:EMPLOYER_ENGAGEMENT_DT,'YYYYMMDD')",
    ARMS_PROPERTY_TYPE,
    ARMS_REGION,
    DOWNPAYMENT_AMT,
    BALLOON_AMOUNT,
    ARMS_VEHICLE_BRAND_NAME,
    ARMS_VEHICLE_BRAND_CAT,
    RATE,
    ADD_RATE,
    ORIG_APPROVAL_AMT,
    SUB_CODE,
    DELINQ_DAYS,
    PRINCIPAL_OUTSTANDING,
    DELINQ_DAYS_M24,
    DELINQ_DAYS_M23,
    DELINQ_DAYS_M22,
    DELINQ_DAYS_M21,
    DELINQ_DAYS_M20,
    DELINQ_DAYS_M19,
    DELINQ_DAYS_M18,
    DELINQ_DAYS_M17,
    DELINQ_DAYS_M16,
    DELINQ_DAYS_M15,
    DELINQ_DAYS_M14,
    DELINQ_DAYS_M13,
    DELINQ_DAYS_M12,
    DELINQ_DAYS_M11,
    DELINQ_DAYS_M10,
    DELINQ_DAYS_M9,
    DELINQ_DAYS_M8,
    DELINQ_DAYS_M7,
    DELINQ_DAYS_M6,
    DELINQ_DAYS_M5,
    DELINQ_DAYS_M4,
    DELINQ_DAYS_M3,
    DELINQ_DAYS_M2,
    DELINQ_DAYS_M1,
    DELINQ_DAYS_M0,
    EMI_M24,
    EMI_M23,
    EMI_M22,
    EMI_M21,
    EMI_M20,
    EMI_M19,
    EMI_M18,
    EMI_M17,
    EMI_M16,
    EMI_M15,
    EMI_M14,
    EMI_M13,
    EMI_M12,
    EMI_M11,
    EMI_M10,
    EMI_M9,
    EMI_M8,
    EMI_M7,
    EMI_M6,
    EMI_M5,
    EMI_M4,
    EMI_M3,
    EMI_M2,
    EMI_M1,
    EMI_M0,
    DELINQ_AMOUNT_M24,
    DELINQ_AMOUNT_M23,
    DELINQ_AMOUNT_M22,
    DELINQ_AMOUNT_M21,
    DELINQ_AMOUNT_M20,
    DELINQ_AMOUNT_M19,
    DELINQ_AMOUNT_M18,
    DELINQ_AMOUNT_M17,
    DELINQ_AMOUNT_M16,
    DELINQ_AMOUNT_M15,
    DELINQ_AMOUNT_M14,
    DELINQ_AMOUNT_M13,
    DELINQ_AMOUNT_M12,
    DELINQ_AMOUNT_M11,
    DELINQ_AMOUNT_M10,
    DELINQ_AMOUNT_M9,
    DELINQ_AMOUNT_M8,
    DELINQ_AMOUNT_M7,
    DELINQ_AMOUNT_M6,
    DELINQ_AMOUNT_M5,
    DELINQ_AMOUNT_M4,
    DELINQ_AMOUNT_M3,
    DELINQ_AMOUNT_M2,
    DELINQ_AMOUNT_M1,
    DELINQ_AMOUNT_M0,
    OUTSTANDING_AMOUNT_M24,
    OUTSTANDING_AMOUNT_M23,
    OUTSTANDING_AMOUNT_M22,
    OUTSTANDING_AMOUNT_M21,
    OUTSTANDING_AMOUNT_M20,
    OUTSTANDING_AMOUNT_M19,
    OUTSTANDING_AMOUNT_M18,
    OUTSTANDING_AMOUNT_M17,
    OUTSTANDING_AMOUNT_M16,
    OUTSTANDING_AMOUNT_M15,
    OUTSTANDING_AMOUNT_M14,
    OUTSTANDING_AMOUNT_M13,
    OUTSTANDING_AMOUNT_M12,
    OUTSTANDING_AMOUNT_M11,
    OUTSTANDING_AMOUNT_M10,
    OUTSTANDING_AMOUNT_M9,
    OUTSTANDING_AMOUNT_M8,
    OUTSTANDING_AMOUNT_M7,
    OUTSTANDING_AMOUNT_M6,
    OUTSTANDING_AMOUNT_M5,
    OUTSTANDING_AMOUNT_M4,
    OUTSTANDING_AMOUNT_M3,
    OUTSTANDING_AMOUNT_M2,
    OUTSTANDING_AMOUNT_M1,
    OUTSTANDING_AMOUNT_M0,
    AVERAGE_BALANCE_MONTH_M24,
    AVERAGE_BALANCE_MONTH_M23,
    AVERAGE_BALANCE_MONTH_M22,
    AVERAGE_BALANCE_MONTH_M21,
    AVERAGE_BALANCE_MONTH_M20,
    AVERAGE_BALANCE_MONTH_M19,
    AVERAGE_BALANCE_MONTH_M18,
    AVERAGE_BALANCE_MONTH_M17,
    AVERAGE_BALANCE_MONTH_M16,
    AVERAGE_BALANCE_MONTH_M15,
    AVERAGE_BALANCE_MONTH_M14,
    AVERAGE_BALANCE_MONTH_M13,
    AVERAGE_BALANCE_MONTH_M12,
    AVERAGE_BALANCE_MONTH_M11,
    AVERAGE_BALANCE_MONTH_M10,
    AVERAGE_BALANCE_MONTH_M9,
    AVERAGE_BALANCE_MONTH_M8,
    AVERAGE_BALANCE_MONTH_M7,
    AVERAGE_BALANCE_MONTH_M6,
    AVERAGE_BALANCE_MONTH_M5,
    AVERAGE_BALANCE_MONTH_M4,
    AVERAGE_BALANCE_MONTH_M3,
    AVERAGE_BALANCE_MONTH_M2,
    AVERAGE_BALANCE_MONTH_M1,
    AVERAGE_BALANCE_MONTH_M0,
    ARMS_MITIGANT_CODE,
    ARMS_MITIGANT_DESC,
    ARMS_MITIGANT_VALUE,
    ARMS_COLL_AREA,
    ARMS_VEHICLE_BRAND_TYPE,
    ARMS_PROPERTY_EVAL_STATUS,
    ARMS_MITIGANT_VALUE_BY_OWNER,
    ARMS_BOOK_VALUE,
    ARMS_VALUATION_DIFF,
    ARMS_CONTRACT_NUMBER,
    ARMS_MANUFACTURE_YEAR,
    ARMS_VEHICLE_MANUFACTURE_YEAR,
    PRIMARY_CARD_FLG,
    SUPPLEMENTARY_CARD_LIMIT,
    RESIDENT_STATUS,
    RESIDENT_TYPE,
    SALARY_TRANSFER_TYPE_CIF,
    GENDER,
    MARITAL_STATUS,
    CITY,
    CIVIL_STATUS,
    DISTRICT_CODE,
    EDUCATION_LEVEL,
    HOUSE_OWNED_STATUS,
    NATIONALITY,
    NUMBER_OF_CARS,
    OCCUPATION_TYPE,
    REGION,
    CIC_OPEN_DATE "TO_DATE(:CIC_OPEN_DATE,'YYYYMMDD')",
    TOTAL_NO_ACTIVE_CONTRACTS,
    ACCRUED_INT,
    BASIC_SALARY_AMOUNT,
    BRANCH_SHOWROOM_ACCOUNT,
    BRANCH_SHOWROOM_ACCOUNT_CODE,
    BRANCH_SHOWROOM_CODE,
    BUSINESS_POSITION,
    CHANNEL_CODE,
    CUR_BOOK_BAL,
    CURR_PAY,
    CURRENCY,
    CUS_SUBTYPE,
    DEBT_BURDEN_RATIO,
    DEPT_CODE,
    DISBURSEMENT_AMOUNT,
    DISBURSEMENT_DATE "TO_DATE(:DISBURSEMENT_DATE,'YYYYMMDD')",
    EMPLOYEE_TYPE,
    EMPLOYER_CLASS_CODE,
    END_OF_SERVICE_BENEFIT_AMOUNT,
    FEES,
    FINANCE_AMT,
    INSTAL_AMT,
    INSTALMENT_WITH_INSURANCE,
    MATURE_DATE "TO_DATE(:MATURE_DATE,'YYYYMMDD')",
    MONTHLY_ALLOWANCE_AMOUNT,
    MONTHLY_OTHER_INCOME_AMOUNT,
    NET_BAL,
    NO_OF_DELINQ_INST,
    ORIG_BALANCE,
    ORIG_PAY,
    ORIG_PROFIT,
    OTHER_MONTHLY_DEDUCTION_AMT,
    OUTSTANDING_WITH_TOTAL_PROFIT,
    PAYMENT_PRINCIPAL_AMT,
    PRODUCT_TYPE,
    PROFIT_RATE_SUB_TYPE,
    RELATION_CONTRACT_TYPE,
    REMAIN_PAYMENTS,
    REMAIN_TERM,
    SALARY_TRANSFER_TYPE,
    CUSTOMER_SEGMENT,
    SALES_BRANCH,
    SALES_CD,
    SALES_USERID,
    TERM,
    TOT_GRACE_PRD_PROFIT,
    TOTAL_PAYMENTS,
    TOTAL_EARLY_PAYMENT_AMT,
    TOTAL_INSTALLMENT_DUE_AMT,
    TOTAL_NO_OPEN_CONTRACTS,
    SPARE_101,
    SPARE_102,
    SPARE_103,
    SPARE_104,
    SPARE_105,
    SPARE_106,
    SPARE_107,
    SPARE_108,
    SPARE_109,
    SPARE_110,
    SPARE_111,
    SPARE_112,
    SPARE_113,
    SPARE_114,
    SPARE_115,
    SPARE_116,
    SPARE_117,
    SPARE_118,
    SPARE_119,
    SPARE_120,
    RL_FOOD_BEVERAGES,
    RL_HOUSING,
    RL_UTILITIES,
    RL_HEALTHCARE,
    RL_TRANSPORT,
    RL_COMMUNICATIONS,
    RL_EDUCATION_FEES,
    RL_HOME_SERVANTS,
    RL_FEES_ON_EXPATS,
    RL_OTHER_FUTURE_EXPENSES,
    RL_OTHER_INCOME,
    RL_TOTAL_EXPENSES,
    RL_OTHER_OBLIGATIONS,
    SCORING_REQUEST_TYPE,
    SCORING_STAGE,
    SCORING_SOURCE,
    APPEND_DB_CODE,
    APPLICATION_ID,
    NATIONAL_ID,
    DB_TABLE_CODE,
    TRANSACTION_ID,
    EXECUTION_DATE_TIME "TO_DATE(:EXECUTION_DATE_TIME,'YYYYMMDD')",
    CODE_1,
    CODE_2,
    CODE_3,
    CODE_4,
    CODE_5,
    CODE_6,
    CODE_7,
    CODE_8,
    CODE_9,
    CODE_10,
    PROGRESS_NUMBER,
    PORTFOLIO_DATE "TO_DATE(:PORTFOLIO_DATE,'YYYYMMDD')",
    TOTAL_LIABILITIES,
    NO_OF_LOANS,
    TOTAL_LIMIT,
    TOTAL_REVOLVING_LIMIT,
    TOTAL_REVOLVING_LIAB,
    NO_OF_ENQUIRIES_12M,
    NO_OF_ENQUIRIES_30D,
    NO_OF_BOUNCED_CHEQUE,
    SIMAH_SCORE,
    SIMAH_SCORE_VERSION,
    WORST_DELINQUENT_24M_CRC,
    WORST_DELINQUENT_24M_PLN,
    WORST_DELINQUENT_24M_AUTO,
    WORST_DELINQUENT_24M_MTG,
    WORST_DELINQUENT_24M_OTHER,
    CURRENT_WORST_DELINQUENT_CRC,
    CURRENT_WORST_DELINQUENT_PLN,
    CURRENT_WORST_DELINQUENT_AUTO,
    CURRENT_WORST_DELINQUENT_MTG,
    CURRENT_WORST_DELINQUENT_OTHER,
    CONTRACTUAL_PAYMENT_CRC,
    CONTRACTUAL_PAYMENT_PLN,
    CONTRACTUAL_PAYMENT_AUTO,
    CONTRACTUAL_PAYMENT_MTG,
    CONTRACTUAL_PAYMENT_OTHER,
    NUMBER_OF_DEFAULT_CRC,
    NUMBER_OF_DEFAULT_PLN,
    NUMBER_OF_DEFAULT_AUTO,
    NUMBER_OF_DEFAULT_MTG,
    NUMBER_OF_DEFAULT_OTHER,
    NUMBER_OF_CI_DEFAULT_CRC,
    NUMBER_OF_CI_DEFAULT_PLN,
    NUMBER_OF_CI_DEFAULT_AUTO,
    NUMBER_OF_CI_DEFAULT_MTG,
    NUMBER_OF_CI_DEFAULT_OTHER,
    SUMMED_SALARY,
    DEBT_BURDEN,
    DEBT_BURDEN_RATE,
    NUMBER_OF_EXECUTED_EXJUDG,
    NUMBER_OF_NOT_EXECUTED_EXJUDG,
    OUTSTANDING_BALANCE_NOTEXJUDG,
    CARD_PRODUCT_LIMIT,
    CARD_PRODUCT_CODE,
    CARD_OUTSTANDING_BALANCE,
    SPARE_01,
    SPARE_02,
    SPARE_03,
    SPARE_04,
    SPARE_05,
    SPARE_06,
    SPARE_07,
    SPARE_08,
    SPARE_09,
    SPARE_10,
    SPARE_11,
    SPARE_12,
    SPARE_13,
    SPARE_14,
    SPARE_15,
    SPARE_16,
    SPARE_17,
    SPARE_18,
    SPARE_19,
    SPARE_20,
    SPARE_21,
    SPARE_22,
    SPARE_23,
    SPARE_24,
    SPARE_25,
    SPARE_26,
    SPARE_27,
    SPARE_28,
    SPARE_29,
    SPARE_30,
    SPARE_31,
    SPARE_32,
    SPARE_33,
    SPARE_34,
    SPARE_35,
    SPARE_36,
    SPARE_37,
    SPARE_38,
    SPARE_39,
    SPARE_40,
    SPARE_41,
    SPARE_42,
    SPARE_43,
    SPARE_44,
    SPARE_45,
    SPARE_46,
    SPARE_47,
    SPARE_48,
    SPARE_49,
    SPARE_50,
    ACCOUNT_1,
    APPLICATION_DATE "TO_DATE(:APPLICATION_DATE,'YYYYMMDD')",
    APPROVAL_DATE "TO_DATE(:APPROVAL_DATE,'YYYYMMDD')",
    BRANCH_LOAN_APPLIED,
    H_CATEGORY_PRODUCT,
    LAST_PAYMENT,
    NEXT_PAY,
    ORG_UNIT,
    ORIG_TERM,
    PAY_FREQUENCY,
    FTV,
    OUTSTANDING_WITH_ACCRUAL_PFT,
    TRANSACTION_DATE "TO_DATE(:TRANSACTION_DATE,'YYYYMMDD')",
    B_CODE_01,
    B_CODE_02,
    B_CODE_03,
    B_CODE_04,
    B_CODE_05,
    B_CODE_06,
    B_CODE_07,
    B_CODE_08,
    B_CODE_09,
    B_CODE_10,
    B_SPARE_01,
    B_SPARE_02,
    B_SPARE_03,
    B_SPARE_04,
    B_SPARE_05,
    B_SPARE_06,
    B_SPARE_07,
    B_SPARE_08,
    B_SPARE_09,
    B_SPARE_10,
    B_SPARE_11,
    B_SPARE_12,
    B_SPARE_13,
    B_SPARE_14,
    B_SPARE_15,
    B_SPARE_16,
    B_SPARE_17,
    B_SPARE_18,
    B_SPARE_19,
    B_SPARE_20,
    B_SPARE_21,
    B_SPARE_22,
    B_SPARE_23,
    B_SPARE_24,
    B_SPARE_25,
    B_SPARE_26,
    B_SPARE_27,
    B_SPARE_28,
    B_SPARE_29,
    B_SPARE_30,
    B_SPARE_31,
    B_SPARE_32,
    B_SPARE_33,
    B_SPARE_34,
    B_SPARE_35,
    B_SPARE_36,
    B_SPARE_37,
    B_SPARE_38,
    B_SPARE_39,
    B_SPARE_40,
    B_SPARE_41,
    B_SPARE_42,
    B_SPARE_43,
    B_SPARE_44,
    B_SPARE_45,
    B_SPARE_46,
    B_SPARE_47,
    B_SPARE_48,
    B_SPARE_49,
    B_SPARE_50
  )