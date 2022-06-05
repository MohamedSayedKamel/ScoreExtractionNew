DROP TABLE LGD_REQUEST CASCADE CONSTRAINTS;

CREATE TABLE LGD_REQUEST
(
  REQUEST_ID                  NUMBER,
  RUN_ID                      NUMBER,
  CIC                         NUMBER(18,6),
  PROCESS_STATUS              VARCHAR2(500 BYTE),
  CONT_ACCOUNT_ID             VARCHAR2(100 CHAR),
  CONT_CONTRACT_NUMBER        VARCHAR2(100 CHAR),
  CONT_BALLOON_PAYMENT        NUMBER(18,6),
  CONT_DOWN_PAYMENT           NUMBER(18,6),
  CONT_OPEN_DATE              DATE,
  CONT_DISBURSEMENT_AMOUNT    NUMBER(18,6),
  CONT_PRINCIPAL_OUTSTANDING  NUMBER(18,6),
  CONT_DURATION_OF_CONTARCT   NUMBER(8),
  CONT_PRICE_AT_ORIGINATION   NUMBER(18,6),
  CONT_DURATION_MONTHS        NUMBER(8),
  CASHFLOW_DATE               DATE,
  PRODUCT_CODE                VARCHAR2(100 CHAR),
  SALARY_TRANSFER_TYPE        VARCHAR2(100 CHAR),
  MILITARY_RANK               NUMBER(18,6),
  CAR_MAKE_YEAR               NUMBER(18,6),
  PROPERTY_VALUE_ACQUISITION  NUMBER(18,6),
  NEW                         VARCHAR2(100 CHAR)
)
TABLESPACE USERS
PCTFREE    10
INITRANS   1
MAXTRANS   255
STORAGE    (
            INITIAL          64K
            NEXT             1M
            MINEXTENTS       1
            MAXEXTENTS       UNLIMITED
            PCTINCREASE      0
            BUFFER_POOL      DEFAULT
           )
LOGGING 
NOCOMPRESS 
NOCACHE;


ALTER TABLE LGD_REQUEST ADD (
  PRIMARY KEY
  (REQUEST_ID)
  USING INDEX
    TABLESPACE USERS
    PCTFREE    10
    INITRANS   2
    MAXTRANS   255
    STORAGE    (
                INITIAL          64K
                NEXT             1M
                MINEXTENTS       1
                MAXEXTENTS       UNLIMITED
                PCTINCREASE      0
                BUFFER_POOL      DEFAULT
               )
  ENABLE VALIDATE);


--  There is no statement for index SYS_C007620.
--  The object is created when the parent object is created.
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
DROP TABLE LGD_REQUEST_HIST CASCADE CONSTRAINTS;

CREATE TABLE LGD_REQUEST_HIST
(
  REQUEST_ID                  NUMBER,
  RUN_ID                      NUMBER,
  CIC                         NUMBER(18,6),
  PROCESS_STATUS              VARCHAR2(500 BYTE),
  CONT_ACCOUNT_ID             VARCHAR2(100 CHAR),
  CONT_CONTRACT_NUMBER        VARCHAR2(100 CHAR),
  CONT_BALLOON_PAYMENT        NUMBER(18,6),
  CONT_DOWN_PAYMENT           NUMBER(18,6),
  CONT_OPEN_DATE              DATE,
  CONT_DISBURSEMENT_AMOUNT    NUMBER(18,6),
  CONT_PRINCIPAL_OUTSTANDING  NUMBER(18,6),
  CONT_DURATION_OF_CONTARCT   NUMBER(8),
  CONT_PRICE_AT_ORIGINATION   NUMBER(18,6),
  CONT_DURATION_MONTHS        NUMBER(8),
  CASHFLOW_DATE               DATE,
  PRODUCT_CODE                VARCHAR2(100 CHAR),
  SALARY_TRANSFER_TYPE        VARCHAR2(100 CHAR),
  MILITARY_RANK               NUMBER(18,6),
  CAR_MAKE_YEAR               NUMBER(18,6),
  PROPERTY_VALUE_ACQUISITION  NUMBER(18,6),
  NEW                         VARCHAR2(100 CHAR)
)
TABLESPACE USERS
PCTFREE    10
INITRANS   1
MAXTRANS   255
STORAGE    (
            INITIAL          64K
            NEXT             1M
            MINEXTENTS       1
            MAXEXTENTS       UNLIMITED
            PCTINCREASE      0
            BUFFER_POOL      DEFAULT
           )
LOGGING 
NOCOMPRESS 
NOCACHE;


ALTER TABLE LGD_REQUEST_HIST ADD (
  PRIMARY KEY
  (REQUEST_ID)
  USING INDEX
    TABLESPACE USERS
    PCTFREE    10
    INITRANS   2
    MAXTRANS   255
    STORAGE    (
                INITIAL          64K
                NEXT             1M
                MINEXTENTS       1
                MAXEXTENTS       UNLIMITED
                PCTINCREASE      0
                BUFFER_POOL      DEFAULT
               )
  ENABLE VALIDATE);


--  There is no statement for index SYS_C007621.
--  The object is created when the parent object is created.
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
DROP TABLE LGD_TEMP CASCADE CONSTRAINTS;

CREATE TABLE LGD_TEMP
(
  CONTRACT_NUMBER   VARCHAR2(50 CHAR),
  PRODUCT_TYPE      VARCHAR2(100 BYTE),
  PRODUCT_CODE      VARCHAR2(50 CHAR),
  CUSTOMER_SEGMENT  VARCHAR2(50 CHAR)
)
TABLESPACE USERS
PCTFREE    10
INITRANS   1
MAXTRANS   255
STORAGE    (
            INITIAL          64K
            NEXT             1M
            MINEXTENTS       1
            MAXEXTENTS       UNLIMITED
            PCTINCREASE      0
            BUFFER_POOL      DEFAULT
           )
LOGGING 
NOCOMPRESS 
NOCACHE;
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
DROP TABLE LGD_RESPONSE CASCADE CONSTRAINTS;

CREATE TABLE LGD_RESPONSE
(
  RESPONSE_ID                                                 NUMBER,
  REQUEST_ID                                                  NUMBER,
  RUN_ID                                                      NUMBER,
  YEAR                                                        NUMBER(18,6),
  MONTH                                                       NUMBER(18,6),
  PRODUCT_TYPE                                                VARCHAR2(100 CHAR),
  MODEL_ID                                                    NUMBER(18,6),
  MODEL_NAME                                                  VARCHAR2(100 CHAR),
  CASH_RECOVERY_SEGMENT                                       NUMBER(18,6),
  CURE_RATE                                                   NUMBER(18,6),
  NONCURED_LOSS                                               NUMBER(18,6),
  CASH_RECOVERY                                               NUMBER(18,6),
  COMBINED_EXPECTED_RECOVERY                                  NUMBER(18,6),
  NONCURED_LOSS_STANDARD_DEVIATION                            NUMBER(18,6),
  EAD_PCNT                                                    NUMBER(18,6),
  TERM_ELAPSED_DEF                                            NUMBER(18,6),
  TERM_ELAPSED_DEF_PCNT                                       NUMBER(18,6),
  CUR_VAL                                                     NUMBER(18,6),
  DEF_LTV                                                     NUMBER(18,6),
  LGD_BASELINE                                                NUMBER(18,6),
  IMPLIED_LGD                                                 NUMBER(18,6),
  LGD_REC1                                                    NUMBER(18,6),
  LGD_REC2                                                    NUMBER(18,6),
  LGD_OPT1                                                    NUMBER(18,6),
  LGD_OPT2                                                    NUMBER(18,6),
  UNCONDICIONAL_LGD                                           NUMBER(18,6),
  DEPLOYMENT_DATE                                             VARCHAR2(100 CHAR),
  DEPLOYMENT_VERSION                                          VARCHAR2(100 CHAR),
  DEPLOYMENT_NOTES                                            VARCHAR2(100 CHAR),
  EXECUTION_DATE_TIME                                         DATE,
  SCORECARD_VERSION_NUMBER                                    VARCHAR2(100 CHAR),
  SCORECARD_VERSION_DATE                                      VARCHAR2(100 CHAR),
  A_SCORECARD_PRODUCT_FAMILY                                  VARCHAR2(100 CHAR),
  CAR_AGE_AT_AUCTION_IN_YEARS                                 NUMBER(18,6),
  CAR_FAIR_VALUATION_AT_AUCTION                               NUMBER(18,6),
  CAR_POST_HAIRCUT_VALUATION_AT_AUCTION                       NUMBER(18,6),
  REALESTATE_POST_HAIRCUT_VALUATION_AT_AUCTION                NUMBER(18,6),
  CAR_AGE_AT_DEFAULT                                          NUMBER(18,6),
  EST_DEF_VEHICLE_IN_YEARS                                    NUMBER(18,6),
  CARLEASE_AVG_TIME_TO_REPO_IN_MONTHS                         NUMBER(18,6),
  REALESTATE_AVG_TIME_TO_REPO_IN_MONTHS                       NUMBER(18,6),
  CARLEASE_AVG_TIME_TO_AUCTION_OR_SELL_POST_REPO_IN_MONTHS    NUMBER(18,6),
  REALESTATE_AVG_TIME_TO_AUCTION_OR_SELL_POST_REPO_IN_MONTHS  NUMBER(18,6),
  DEPRICIATION_FACTOR                                         NUMBER(18,6),
  PROB_OF_AUCTION                                             NUMBER(18,6),
  CARLEASE_DISCOUNT_RATE                                      NUMBER(18,6),
  REALESTATE_DISCOUNT_RATE                                    NUMBER(18,6),
  HAIRCUT_STANDARD_DEVIATION                                  NUMBER(18,6),
  COLLATERAL_VALUATION_GROWTH                                 NUMBER(18,6),
  AVG_TIME_ON_BOOK_IN_MONTHS                                  NUMBER(18,6),
  AVG_TIME_TO_RECOVERY_IN_MONTHS                              NUMBER(18,6),
  HAIRCUT_PERCENTAGE                                          NUMBER(18,6),
  HAIRCUT_ADJUSTED                                            NUMBER(18,6),
  PROB_OF_REPOSESSION                                         NUMBER(18,6),
  COLLATERAL_SALE_COST                                        NUMBER(18,6),
  DISTRESS_SALE                                               NUMBER(18,6),
  MILITARY_LEVEL                                              VARCHAR2(100 CHAR),
  NEW                                                         VARCHAR2(100 CHAR),
  CARLEASE_HAIRCUT_PERCENTAGE                                 NUMBER(19,6),
  REALSTATE_HAIRCUT_PERCENTAGE                                NUMBER(19,6)
)
TABLESPACE USERS
PCTFREE    10
INITRANS   1
MAXTRANS   255
STORAGE    (
            INITIAL          64K
            NEXT             1M
            MINEXTENTS       1
            MAXEXTENTS       UNLIMITED
            PCTINCREASE      0
            BUFFER_POOL      DEFAULT
           )
LOGGING 
NOCOMPRESS 
NOCACHE;


ALTER TABLE LGD_RESPONSE ADD (
  PRIMARY KEY
  (RESPONSE_ID)
  USING INDEX
    TABLESPACE USERS
    PCTFREE    10
    INITRANS   2
    MAXTRANS   255
    STORAGE    (
                INITIAL          64K
                NEXT             1M
                MINEXTENTS       1
                MAXEXTENTS       UNLIMITED
                PCTINCREASE      0
                BUFFER_POOL      DEFAULT
               )
  ENABLE VALIDATE);


--  There is no statement for index SYS_C007622.
--  The object is created when the parent object is created.
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
DROP SEQUENCE LGD_REQUEST_ID_SEQ;

CREATE SEQUENCE LGD_REQUEST_ID_SEQ
  START WITH 1
  MAXVALUE 9999999999999999999999999999
  MINVALUE 1
  CYCLE
  CACHE 20
  NOORDER
  NOKEEP
  NOSCALE
  GLOBAL;
  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  DROP SEQUENCE LGD_RESPONSE_ID_SEQ;

CREATE SEQUENCE LGD_RESPONSE_ID_SEQ
  START WITH 1
  MAXVALUE 9999999999999999999999999999
  MINVALUE 1
  CYCLE
  CACHE 20
  NOORDER
  NOKEEP
  NOSCALE
  GLOBAL;
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
DROP VIEW COUNT_REC_PER_EXECUTION_REPORT;

CREATE OR REPLACE FORCE VIEW COUNT_REC_PER_EXECUTION_REPORT
(STG_RUN_ID, STG_RUN_DATE, A_START_EXECUTION_DATE, B_START_EXECUTION_DATE, LGD_START_EXECUTION_DATE, 
 A_END_EXECUTION_DATE, B_END_EXECUTION_DATE, LGD_END_EXECUTION_DATE, STG_ACCEPTED_RECORDS, STG_REJECTED_RECORDS, 
 A_SCORE_SUCCESSFUL_RECORDS, A_SCORE_FAILED_RECORDS, B_SCORE_SUCCESSFUL_RECORDS, B_SCORE_FAILED_RECORDS, LGD_SUCCESSFUL_RECORDS, 
 LGD_FAILED_RECORDS)
BEQUEATH DEFINER
AS 
SELECT /*+ PARALLEL(8)*/
       STG.RUN_ID           AS STG_RUN_ID, 
       STG.RUN_DATE         AS STG_RUN_DATE, 
       ARES.S_RUN_DATE      AS A_START_EXECUTION_DATE,
       BRES.S_RUN_DATE      AS B_START_EXECUTION_DATE,
       LGDRES.S_RUN_DATE    AS LGD_START_EXECUTION_DATE,
       ARES.E_RUN_DATE      AS A_END_EXECUTION_DATE,
       BRES.E_RUN_DATE      AS B_END_EXECUTION_DATE,
       LGDRES.E_RUN_DATE    AS LGD_END_EXECUTION_DATE,
       
       STG.ACCEPTED         AS STG_ACCEPTED_RECORDS, 
       NVL(BAD.REJECTED, 0) AS STG_REJECTED_RECORDS, 
       NVL(AREQ.SUCCESS, 0) AS A_SCORE_SUCCESSFUL_RECORDS, 
       NVL(AREQ.FAILED, 0)  AS A_SCORE_FAILED_RECORDS, 
       NVL(BREQ.SUCCESS, 0) AS B_SCORE_SUCCESSFUL_RECORDS, 
       NVL(BREQ.FAILED, 0)  AS B_SCORE_FAILED_RECORDS,
       NVL(LGDREQ.SUCCESS, 0) AS LGD_SUCCESSFUL_RECORDS, 
       NVL(LGDREQ.FAILED, 0)  AS LGD_FAILED_RECORDS 
FROM   (SELECT RUN_ID, 
               MIN(RUN_DATE) AS RUN_DATE, 
               COUNT(*)      AS ACCEPTED 
        FROM   STG_SCORE_REQUEST_HIST 
        GROUP  BY RUN_ID) STG, 
       (SELECT RUN_ID, 
               MIN(CONT_RUN_DATE) AS RUN_DATE, 
               SUM(CASE 
                     WHEN PROCESS_STATUS = 'Proceed' THEN 1 
                     ELSE 0 
                   END)           AS SUCCESS, 
               SUM(CASE 
                     WHEN PROCESS_STATUS = 'Failed' THEN 1 
                     ELSE 0 
                   END)           AS FAILED 
        FROM   A_SCORE_REQUEST_HIST A 
        GROUP  BY RUN_ID) AREQ, 
       (SELECT RUN_ID, 
               MIN(SCOR_PORTFOLIO_DATE) AS RUN_DATE, 
               SUM(CASE 
                     WHEN PROCESS_STATUS = 'Proceed' THEN 1 
                     ELSE 0 
                   END)                 AS SUCCESS, 
               SUM(CASE 
                     WHEN PROCESS_STATUS = 'Failed' THEN 1 
                     ELSE 0 
                   END)                 AS FAILED 
        FROM   B_SCORE_REQUEST_HIST 
        GROUP  BY RUN_ID) BREQ, 
        
          (SELECT RUN_ID, 
               MIN(CASHFLOW_DATE) AS RUN_DATE, 
               SUM(CASE 
                     WHEN PROCESS_STATUS = 'Proceed' THEN 1 
                     ELSE 0 
                   END)                 AS SUCCESS, 
               SUM(CASE 
                     WHEN PROCESS_STATUS = 'Failed' THEN 1 
                     ELSE 0 
                   END)                 AS FAILED 
        FROM   LGD_REQUEST_HIST 
        GROUP  BY RUN_ID) LGDREQ, 
        
        
       (SELECT RUN_ID, 
               MIN(SCOR_EXECUTION_DATE_TIME) AS S_RUN_DATE, 
               MAX(SCOR_EXECUTION_DATE_TIME) AS E_RUN_DATE 
        FROM   A_SCORE_RESPONSE 
        GROUP  BY RUN_ID) ARES, 
       (SELECT RUN_ID, 
               MIN(SCOR_EXECUTION_DATE_TIME) AS S_RUN_DATE, 
               MAX(SCOR_EXECUTION_DATE_TIME) AS E_RUN_DATE
        FROM   B_SCORE_RESPONSE 
        GROUP  BY RUN_ID) BRES, 
        
        (SELECT RUN_ID, 
               MIN(EXECUTION_DATE_TIME) AS S_RUN_DATE, 
               MAX(EXECUTION_DATE_TIME) AS E_RUN_DATE
        FROM   LGD_RESPONSE 
        GROUP  BY RUN_ID) LGDRES,
        
        
        
       (SELECT RUN_ID, 
               COUNT(*) AS REJECTED 
        FROM   STG_SCORE_REQUEST_BAD_RECORDS 
        GROUP  BY RUN_ID) BAD 
WHERE  STG.RUN_ID = AREQ.RUN_ID(+)
       AND STG.RUN_ID = BREQ.RUN_ID(+)
       AND STG.RUN_ID = ARES.RUN_ID(+)
       AND STG.RUN_ID = BRES.RUN_ID(+)
       AND STG.RUN_ID = LGDRES.RUN_ID(+)
       AND STG.RUN_ID = BAD.RUN_ID(+) 
ORDER  BY STG.RUN_ID DESC;
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
DROP VIEW LGD_INFORMATION;

CREATE OR REPLACE FORCE VIEW LGD_INFORMATION
(RUN_ID, MODEL_NAME, YEAR, MONTH, SEGMENT, 
 NUMBER_OF_RECORDS, CURE_RATE, NONCURED_LOSS)
BEQUEATH DEFINER
AS 
SELECT R.RUN_ID,
             R.MODEL_NAME,
             R.YEAR,
             R.Month,
             R.CASH_RECOVERY_SEGMENT,
             COUNT (R.RESPONSE_ID),
             CAST (AVG (R.CURE_RATE) AS DECIMAL (18, 4)),
             R.NONCURED_LOSS
        FROM LGD_RESPONSE R
    GROUP BY R.RUN_ID,
             R.MODEL_NAME,
             R.YEAR,
             R.Month,
             R.CASH_RECOVERY_SEGMENT,
             R.NONCURED_LOSS
    ORDER BY R.RUN_ID DESC,
             R.MODEL_NAME,
             R.YEAR,
             R.Month,
             R.CASH_RECOVERY_SEGMENT,
             R.NONCURED_LOSS;
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
DROP VIEW LGD_REQ_FAILED_REPORT;

CREATE OR REPLACE FORCE VIEW LGD_REQ_FAILED_REPORT
(RUN_ID, REQUEST_ID, PROCESS_STATUS, CIC, CONT_ACCOUNT_ID, 
 CONT_CONTRACT_NUMBER, CONT_BALLOON_PAYMENT, CONT_DOWN_PAYMENT, CONT_OPEN_DATE, CONT_DISBURSEMENT_AMOUNT, 
 CONT_PRINCIPAL_OUTSTANDING, CONT_DURATION_OF_CONTARCT, CONT_PRICE_AT_ORIGINATION, CONT_DURATION_MONTHS, CASHFLOW_DATE, 
 PRODUCT_CODE, SALARY_TRANSFER_TYPE, MILITARY_RANK, CAR_MAKE_YEAR, PROPERTY_VALUE_ACQUISITION, 
 NEW)
BEQUEATH DEFINER
AS 
SELECT /*+ PARALLEL(8)*/
             RUN_ID,
             REQUEST_ID,
             PROCESS_STATUS,
             CIC,
             CONT_ACCOUNT_ID,
             CONT_CONTRACT_NUMBER,
             CONT_BALLOON_PAYMENT,
             CONT_DOWN_PAYMENT,
             CONT_OPEN_DATE,
             CONT_DISBURSEMENT_AMOUNT,
             CONT_PRINCIPAL_OUTSTANDING,
             CONT_DURATION_OF_CONTARCT,
             CONT_PRICE_AT_ORIGINATION,
             CONT_DURATION_MONTHS,
             CASHFLOW_DATE,
             PRODUCT_CODE,
             SALARY_TRANSFER_TYPE,
             MILITARY_RANK,
             CAR_MAKE_YEAR,
             PROPERTY_VALUE_ACQUISITION,
             NEW
        FROM LGD_REQUEST_HIST
       WHERE UPPER (PROCESS_STATUS) = 'FAILED'
    ORDER BY RUN_ID DESC, REQUEST_ID DESC;
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
DROP VIEW LGD_REQ_PROCEED_REPORT;

CREATE OR REPLACE FORCE VIEW LGD_REQ_PROCEED_REPORT
(RUN_ID, REQUEST_ID, PROCESS_STATUS, CIC, CONT_ACCOUNT_ID, 
 CONT_CONTRACT_NUMBER, CONT_BALLOON_PAYMENT, CONT_DOWN_PAYMENT, CONT_OPEN_DATE, CONT_DISBURSEMENT_AMOUNT, 
 CONT_PRINCIPAL_OUTSTANDING, CONT_DURATION_OF_CONTARCT, CONT_PRICE_AT_ORIGINATION, CONT_DURATION_MONTHS, CASHFLOW_DATE, 
 PRODUCT_CODE, SALARY_TRANSFER_TYPE, MILITARY_RANK, CAR_MAKE_YEAR, PROPERTY_VALUE_ACQUISITION, 
 NEW)
BEQUEATH DEFINER
AS 
SELECT /*+ PARALLEL(8)*/
             RUN_ID,
             REQUEST_ID,
             PROCESS_STATUS,
             CIC,
             CONT_ACCOUNT_ID,
             CONT_CONTRACT_NUMBER,
             CONT_BALLOON_PAYMENT,
             CONT_DOWN_PAYMENT,
             CONT_OPEN_DATE,
             CONT_DISBURSEMENT_AMOUNT,
             CONT_PRINCIPAL_OUTSTANDING,
             CONT_DURATION_OF_CONTARCT,
             CONT_PRICE_AT_ORIGINATION,
             CONT_DURATION_MONTHS,
             CASHFLOW_DATE,
             PRODUCT_CODE,
             SALARY_TRANSFER_TYPE,
             MILITARY_RANK,
             CAR_MAKE_YEAR,
             PROPERTY_VALUE_ACQUISITION,
             NEW
        FROM LGD_REQUEST_HIST
       WHERE UPPER (PROCESS_STATUS) = 'PROCEED'
    ORDER BY RUN_ID DESC, REQUEST_ID DESC;
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
DROP VIEW LGD_REQ_RESPONSE_REPORT;

CREATE OR REPLACE FORCE VIEW LGD_REQ_RESPONSE_REPORT
(RUN_ID, RUN_DATE, REQUEST_ID, PROCESS_STATUS, SCOR_CIC, 
 PROD_PRODUCT_CODE, PROD_PRODUCT_TYPE, PROD_CUSTOMER_SEGMENT, PROD_SALARY_TRANSFER_TYPE, CONT_CONTRACT_NUMBER, 
 CONT_OPEN_DATE, CONT_DISBURSEMENT_AMOUNT, CONT_PRINCIPAL_OUTSTANDING, MILITARY_RANK, CONT_DURATION_OF_CONTARCT, 
 MILITARY_LEVEL, CASH_RECOVERY_SEGMENT, UNCONDICIONAL_LGD, CURE_RATE, CASH_RECOVERY, 
 COMBINED_EXPECTED_RECOVERY, IMPLIED_LGD, LGD_BASELINE, LGD_REC1, LGD_REC2, 
 LGD_OPT1, LGD_OPT2, CONT_PRICE_AT_ORIGINATION, CONT_BALLOON_PAYMENT, CONT_DOWN_PAYMENT, 
 CONT_DURATION_MONTHS, PROPERTY_VALUE_ACQUISITION, YEAR, MONTH, NONCURED_LOSS, 
 NONCURED_LOSS_STANDARD_DEVIATION, EAD_PCNT, TERM_ELAPSED_DEF, TERM_ELAPSED_DEF_PCNT, CAR_AGE_AT_DEFAULT, 
 EST_DEF_VEHICLE_YEARS, CUR_VAL, DEF_LTV)
BEQUEATH DEFINER
AS 
SELECT LGD_REQ.RUN_ID,
             LGD_REQ.CASHFLOW_DATE,
             LGD_REQ.REQUEST_ID,
             LGD_REQ.PROCESS_STATUS,
             LGD_REQ.CIC,
             LGD_REQ.PRODUCT_CODE,
             LGD_RES.PRODUCT_TYPE,
             LGD_RES.MODEL_NAME,
             LGD_REQ.SALARY_TRANSFER_TYPE,
             LGD_REQ.CONT_CONTRACT_NUMBER,
             LGD_REQ.CONT_OPEN_DATE,
             LGD_REQ.CONT_DISBURSEMENT_AMOUNT,
             LGD_REQ.CONT_PRINCIPAL_OUTSTANDING,
             LGD_REQ.MILITARY_RANK,
             LGD_REQ.CONT_DURATION_OF_CONTARCT,
             LGD_RES.MILITARY_LEVEL,
             LGD_RES.CASH_RECOVERY_SEGMENT,
             LGD_RES.UNCONDICIONAL_LGD,
             LGD_RES.CURE_RATE,
             LGD_RES.CASH_RECOVERY,
             LGD_RES.COMBINED_EXPECTED_RECOVERY,
             LGD_RES.IMPLIED_LGD,
             LGD_RES.LGD_BASELINE,
             LGD_RES.LGD_REC1,
             LGD_RES.LGD_REC2,
             LGD_RES.LGD_OPT1,
             LGD_RES.LGD_OPT2,
             LGD_REQ.CONT_PRICE_AT_ORIGINATION,
             LGD_REQ.CONT_BALLOON_PAYMENT,
             LGD_REQ.CONT_DOWN_PAYMENT,
             LGD_REQ.CONT_DURATION_MONTHS,
             LGD_REQ.PROPERTY_VALUE_ACQUISITION,
             LGD_RES.YEAR,
             LGD_RES.MONTH,
             LGD_RES.NONCURED_LOSS,
             LGD_RES.NONCURED_LOSS_STANDARD_DEVIATION,
             LGD_RES.EAD_PCNT,
             LGD_RES.TERM_ELAPSED_DEF,
             LGD_RES.TERM_ELAPSED_DEF_PCNT,
             LGD_RES.CAR_AGE_AT_DEFAULT,
             LGD_RES.EST_DEF_VEHICLE_IN_YEARS,
             LGD_RES.CUR_VAL,
             LGD_RES.DEF_LTV
        FROM LGD_REQUEST_HIST LGD_REQ, LGD_RESPONSE LGD_RES
       WHERE LGD_REQ.REQUEST_ID = LGD_RES.REQUEST_ID
    ORDER BY LGD_REQ.RUN_ID DESC, LGD_REQ.REQUEST_ID DESC;
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
CREATE OR REPLACE PACKAGE DATA_LOAD AS 
PROCEDURE LOAD_A_SCORE_REQUEST (P_STATUS OUT NUMBER);
PROCEDURE LOAD_B_SCORE_REQUEST (P_STATUS OUT NUMBER);
PROCEDURE LOAD_LGD_REQUEST (P_STATUS OUT NUMBER);
PROCEDURE MOVE_DATA_STG_SCORE_REQUEST (P_STATUS OUT NUMBER);
PROCEDURE MOVE_DATA_A_SCORE_REQUEST (P_STATUS OUT NUMBER);
PROCEDURE MOVE_DATA_B_SCORE_REQUEST (P_STATUS OUT NUMBER);
PROCEDURE MOVE_DATA_LGD_REQUEST (P_STATUS OUT NUMBER);
PROCEDURE LOAD_STG_SCORE_REQUEST (P_STATUS OUT NUMBER);
END DATA_LOAD;
/
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
CREATE OR REPLACE PACKAGE BODY DATA_LOAD AS

    /******************************************************************************
    NAME:    DATA_LOAD
    PURPOSE: Load scoring input data from staging table
    COMPANY: EJADA SYSTEMS

    REVISIONS:
    Version   Date        Author
    --------- ----------- ---------------
    1.0       25-OCT-2020  mgebba@ejada.com

    ******************************************************************************/

PROCEDURE LOAD_A_SCORE_REQUEST (P_STATUS OUT NUMBER) AS
    /******************************************************************************
    NAME:    LOAD_A_SCORE_REQUEST
    PURPOSE: Insert Data into A_SCORE_REQUEST table.
    COMPANY: EJADA SYSTEMS

    REVISIONS:
    Version   Date        Author
    --------- ----------- ---------------
    1.0       24-AUG-2020  mgebba@ejada.com

    ******************************************************************************/
    --  General use variable declaration
    V_ROWCOUNT                                        NUMBER(9)         := 0;
    V_LOG_MSG                                         VARCHAR2(1000)    := NULL;
    V_LOG_PARAM                                       VARCHAR2(250)     := NULL;
    V_PROCEDURE_NAME                                  VARCHAR(32)       := 'LOAD_A_SCORE_REQUEST';
    V_PACKAGE_NAME                                    VARCHAR(32)       := 'DATA_LOAD';
    V_SQL_STMT                                        CLOB;
    V_RUN_ID                                          NUMBER := 0;
    -------------------------------------------------------------------------------
BEGIN
    --  Inserting data into A_SCORE_REQUEST -- START
        P_STATUS := 0;

        BEGIN
            SELECT NVL(MAX(RUN_ID),0) INTO V_RUN_ID FROM STG_SCORE_REQUEST;
        EXCEPTION
            WHEN OTHERS THEN
            V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                          SQLERRM || ' -- Error in fetching RUN_ID from STG_SCORE_REQUEST table -- STOPPED';
            DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
            PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,V_RUN_ID);
        END;

        BEGIN
            V_SQL_STMT := 'TRUNCATE TABLE A_SCORE_TEMP';
            EXECUTE IMMEDIATE V_SQL_STMT;
        EXCEPTION
            WHEN OTHERS THEN
            V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                          SQLERRM || ' -- Error in truncating A_SCORE_TEMP table -- STOPPED';
            DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
            PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,V_RUN_ID);
        END;

        BEGIN
            INSERT INTO         A_SCORE_TEMP
            SELECT DISTINCT T3.CONTRACT_NUMBER, P.PRODUCT_TYPE, T3.PRODUCT_CODE,
                    ( SELECT CUSTOMER_SEGMENT FROM ST_MAPPING S3
                        WHERE
                            (S3.PRODUCT_CODE = T3.PRODUCT_CODE AND S3.SALATRY_TRANSFER_TYPE_CTF = T3.SALARY_TRANSFER)
                          OR(S3.PRODUCT_CODE = T3.PRODUCT_CODE AND S3.SALATRY_TRANSFER_TYPE_CTF = 'Others' AND NVL(T3.SALARY_TRANSFER,'XYZ') NOT IN (SELECT S1.SALATRY_TRANSFER_TYPE_CTF FROM ST_MAPPING S1 WHERE S1.PRODUCT_CODE = T3.PRODUCT_CODE ) )
                          OR(S3.SALATRY_TRANSFER_TYPE_CTF = T3.SALARY_TRANSFER AND S3.PRODUCT_CODE = 'Others' AND NVL(T3.PRODUCT_CODE,'XYZ') NOT IN (SELECT S2.PRODUCT_CODE FROM ST_MAPPING S2 WHERE S2.SALATRY_TRANSFER_TYPE_CTF = T3.SALARY_TRANSFER ) )
                          OR(S3.SALATRY_TRANSFER_TYPE_CTF = 'Others' AND S3.PRODUCT_CODE = 'Others'  AND NVL(T3.SALARY_TRANSFER,'XYZ') NOT IN (SELECT SALATRY_TRANSFER_TYPE_CTF FROM ST_MAPPING )
                          AND NVL(T3.PRODUCT_CODE,'XYZ') NOT IN (SELECT PRODUCT_CODE FROM ST_MAPPING ) )) CUSTOMER_SEGMENT
                    FROM
                    STG_SCORE_REQUEST T3 , PRODUCT P
                    WHERE
                    T3.PRODUCT_CODE   = P.PRODUCT_CODE
                    AND T3.OPEN_DATE >= ADD_MONTHS(T3.RUN_DATE,-12) ;
        EXCEPTION
            WHEN OTHERS THEN
            V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                          SQLERRM || ' -- Error in populating A_SCORE_TEMP table -- STOPPED';
            DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
            PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,V_RUN_ID);
        END;

        BEGIN
            INSERT INTO A_SCORE_REQUEST (
                REQUEST_ID,
                RUN_ID,
                PROCESS_STATUS,
                CONT_ACCOUNT_ID,
                CONT_ACCRUED_INT,
                CONT_ADD_RATE,
                CONT_APPLICATION_DATE,
                CONT_APPROVAL_DATE,
                CONT_BALLOON_AMOUNT,
                CONT_BASIC_SALARY_AMOUNT,
                CONT_BRANCH_LOAN_APPLIED,
                CONT_BRANCH_SHOWROOM_ACC,
                CONT_BUSINESS_POSITION,
                CONT_CIC,
                CONT_CONTRACT_NUMBER,
                CONT_CUR_BOOK_BAL,
                CONT_CURR_PAY,
                CONT_CURRENCY,
                CONT_CUS_SUBTYPE,
                CONT_DEBT_BURDEN_RATIO,
                CONT_DELINQ_DAYS,
                CONT_DEPENDENTS,
                CONT_DEPT_CODE,
                CONT_DISBURSEMENT_DATE,
                CONT_DISBURSEMENT_AMOUNT,
                CONT_DOWNPAYMENT_AMT,
                CONT_RUN_DATE,
                CONT_EMP_DEPARTMENT,
                CONT_EMP_COMPANY,
                CONT_EMPLOYER_ENGAGEMENT_DATE,
                CONT_FEES,
                CONT_FINANCE_AMT,
                CONT_GROSS_SALARY,
                CONT_H_CATEGORY_PRODUCT,
                CONT_INSTAL_AMT,
                CONT_INSTAL_WITH_INSURANCE,
                CONT_LAST_PAYMENT_DATE,
                CONT_MATURE_DATE,
                CONT_MILITARY_RANK,
                CONT_NET_BAL,
                CONT_NEXT_PAY_DATE,
                CONT_NO_OF_DELINQ_INST,
                CONT_OPEN_DATE,
                CONT_ORG_UNIT,
                CONT_ORIG_APPROVAL_AMT,
                CONT_ORIG_BALANCE,
                CONT_ORIG_PAY,
                CONT_ORIG_PROFIT,
                CONT_ORIG_TERM,
                CONT_PAY_FREQUENCY,
                CONT_PAYMENT_PRINCIPAL_AMT,
                CONT_PROFIT_RATE_SUB_TYPE,
                CONT_RATE,
                CONT_TOTAL_PAYMENTS,
                CONT_REMAIN_PAYMENTS,
                CONT_REMAIN_TERM,
                CUST_RESIDENT_STATUS,
                CUST_RESIDENT_TYPE,
                CONT_SALARY_TRANSFER_TYPE,
                CUST_SALARY_TRANSFER_TYPE_CIF,
                CONT_SALARY_TRANSFER_TYPE_CTF,
                CONT_SALES_BRANCH,
                CONT_SALES_CD,
                CONT_SALES_USERID,
                CONT_TERM,
                CONT_TOT_GRACE_PRD_PROFIT,
                CONT_TOTAL_EARLY_PAYMENT_AMT,
                CONT_TOTAL_INSTAL_DUE_AMT,
                CUST_GENDER,
                CUST_MARITAL_STATUS,
                CUST_DATE_OF_BIRTH,
                CONT_BRANCH_SHOWROOM_ACC_CODE,
                CONT_BRANCH_SHOWROOM_CODE,
                CONT_CHANNEL_CODE,
                CUST_CITY,
                CUST_CIVIL_STATUS,
                CONT_CUSTOMER_SEGMENT,
                CUST_DISTRICT_CODE,
                CONT_DURATION_IN_MONTH,
                CUST_EDUCATION_LEVEL,
                CONT_EMPLOYEE_TYPE,
                CONT_EMPLOYER_CLASS_CODE,
                CONT_END_SERVICE_BENEFIT_AMT,
                CUST_HOUSE_OWNED_STATUS,
                CONT_MONTHLY_ALLOWANCE_AMOUNT,
                CONT_MONTHLY_OTHER_INCOME_AMT,
                CUST_NATIONALITY,
                CUST_NUMBER_OF_CARS,
                CUST_OCCUPATION_TYPE,
                CONT_OTHER_MONTHLY_DEDUCT_AMT,
                CONT_PRODUCT_CODE,
                CONT_PRODUCT_TYPE,
                CUST_REGION,
                CONT_RELATION_CONTRACT_TYPE,
                RESP_RL_FOOD_BEVERAGES,
                RESP_RL_HOUSING,
                RESP_RL_UTILITIES,
                RESP_RL_HEALTHCARE,
                RESP_RL_TRANSPORT,
                RESP_RL_COMMUNICATIONS,
                RESP_RL_EDUCATION_FEES,
                RESP_RL_HOME_SERVANTS,
                RESP_RL_FEES_ON_EXPATS,
                RESP_RL_OTHER_FUTURE_EXPENSES,
                RESP_RL_OTHER_INCOME,
                RESP_RL_TOTAL_EXPENSES,
                RESP_RL_OTHER_OBLIGATIONS,
                ARMS_ARMS_MITIGANT_CODE,
                ARMS_ARMS_MITIGANT_DESC,
                ARMS_ARMS_MITIGANT_VALUE,
                ARMS_ARMS_COLL_AREA,
                ARMS_ARMS_VEHICLE_BRAND_NAME,
                ARMS_ARMS_VEHICLE_BRAND_TYPE,
                ARMS_ARMS_PROP_EVAL_STATUS,
                ARMS_ARMS_MITIGANT_VAL_OWNER,
                ARMS_ARMS_BOOK_VALUE,
                ARMS_ARMS_VALUATION_DIFF,
                ARMS_ARMS_CONTRACT_NUMBER,
                ARMS_ARMS_MANUFACTURE_YEAR,
                ARMS_ARMS_VEHI_MANUFACT_YEAR,
                ARMS_ARMS_REGION,
                ARMS_ARMS_PROPERTY_TYPE,
                SIMAH_TOTAL_LIABILITIES,
                SIMAH_NO_OF_LOANS,
                SIMAH_TOTAL_LIMIT,
                SIMAH_TOTAL_REVOLVING_LIMIT,
                SIMAH_TOTAL_REVOLVING_LIAB,
                SIMAH_NO_OF_ENQUIRIES_12M,
                SIMAH_NO_OF_ENQUIRIES_30D,
                SIMAH_NO_OF_BOUNCED_CHEQUE,
                SIMAH_SIMAH_SCORE,
                SIMAH_SIMAH_SCORE_VERSION,
                SIMAH_WORST_DELINQ_24M_CRC,
                SIMAH_WORST_DELINQ_24M_PLN,
                SIMAH_WORST_DELINQ_24M_AUTO,
                SIMAH_WORST_DELINQ_24M_MTG,
                SIMAH_WORST_DELINQ_24M_OTHER,
                SIMAH_CUR_WORST_DELINQ_CRC,
                SIMAH_CUR_WORST_DELINQ_PLN,
                SIMAH_CUR_WORST_DELINQ_AUTO,
                SIMAH_CUR_WORST_DELINQ_MTG,
                SIMAH_CUR_WORST_DELINQ_OTHER,
                SIMAH_CONTRACTUAL_PAY_CRC,
                SIMAH_CONTRACTUAL_PAY_PLN,
                SIMAH_CONTRACTUAL_PAY_AUTO,
                SIMAH_CONTRACTUAL_PAY_MTG,
                SIMAH_CONTRACTUAL_PAY_OTHER,
                SIMAH_NO_OF_DEFAULT_CRC,
                SIMAH_NO_OF_DEFAULT_PLN,
                SIMAH_NO_OF_DEFAULT_AUTO,
                SIMAH_NO_OF_DEFAULT_MTG,
                SIMAH_NO_OF_DEFAULT_OTHER,
                SIMAH_NO_OF_CI_DEFAULT_CRC,
                SIMAH_NO_OF_CI_DEFAULT_PLN,
                SIMAH_NO_OF_CI_DEFAULT_AUTO,
                SIMAH_NO_OF_CI_DEFAULT_MTG,
                SIMAH_NO_OF_CI_DEFAULT_OTHER,
                SIMAH_SUMMED_SALARY,
                SIMAH_DEBT_BURDEN,
                SIMAH_DEBT_BURDEN_RATIO,
                SIMAH_NO_OF_EXECUTED_EXJUDG,
                SIMAH_NO_OF_NOTEXEC_EXJUDG,
                SIMAH_OUTSTAND_BAL_NOTEXJUDG,
                CONT_PRINCIPAL_OUTSTANDING,
                CONT_OUTSTANDING_ACCRUVAL_PFT,
                CONT_OUTSTANDING_TOTAL_PFT,
                CONT_SUB_CODE,
                CASA_AVERAGE_BAL_MONTH_M0,
                CASA_AVERAGE_BAL_MONTH_M1,
                CASA_AVERAGE_BAL_MONTH_M2,
                CASA_AVERAGE_BAL_MONTH_M3,
                CASA_AVERAGE_BAL_MONTH_M4,
                CASA_AVERAGE_BAL_MONTH_M5,
                CASA_AVERAGE_BAL_MONTH_M6,
                CASA_AVERAGE_BAL_MONTH_M7,
                CASA_AVERAGE_BAL_MONTH_M8,
                CASA_AVERAGE_BAL_MONTH_M9,
                CASA_AVERAGE_BAL_MONTH_M10,
                CASA_AVERAGE_BAL_MONTH_M11,
                CARD_BRANCH_SHOWROOM_ACC,
                SIMAH_CARD_PRODUCT_LIMIT,
                SIMAH_CARD_PRODUCT_CODE,
                SIMAH_CARD_OUTSTANDING_BAL,
                CARD_PRIMARY_CARD_FLG,
                CARD_SUPPLEMENTARY_CARD_LIMIT,
                SCOR_SCORING_REQUEST_TYPE,
                SCOR_SCORING_STAGE,
                SCOR_SCORING_SOURCE,
                SCOR_APPEND_DB_CODE,
                SCOR_APPLICATION_ID,
                SCOR_NATIONAL_ID,
                SCOR_DB_TABLE_CODE,
                SCOR_TRANSACTION_ID,
                SCOR_EXECUTION_DATE_TIME,
                SCOR_CODE_01,
                SCOR_CODE_02,
                SCOR_CODE_03,
                SCOR_CODE_04,
                SCOR_CODE_05,
                SCOR_CODE_06,
                SCOR_CODE_07,
                SCOR_CODE_08,
                SCOR_CODE_09,
                SCOR_CODE_10,
                SCOR_PROGRESS_NUMBER,
                SPARE_SPARE_01,
                SPARE_SPARE_02,
                SPARE_SPARE_03,
                SPARE_SPARE_04,
                SPARE_SPARE_05,
                SPARE_SPARE_06,
                SPARE_SPARE_07,
                SPARE_SPARE_08,
                SPARE_SPARE_09,
                SPARE_SPARE_10,
                SPARE_SPARE_11,
                SPARE_SPARE_12,
                SPARE_SPARE_13,
                SPARE_SPARE_14,
                SPARE_SPARE_15,
                SPARE_SPARE_16,
                SPARE_SPARE_17,
                SPARE_SPARE_18,
                SPARE_SPARE_19,
                SPARE_SPARE_20,
                SPARE_SPARE_21,
                SPARE_SPARE_22,
                SPARE_SPARE_23,
                SPARE_SPARE_24,
                SPARE_SPARE_25,
                SPARE_SPARE_26,
                SPARE_SPARE_27,
                SPARE_SPARE_28,
                SPARE_SPARE_29,
                SPARE_SPARE_30,
                SPARE_SPARE_31,
                SPARE_SPARE_32,
                SPARE_SPARE_33,
                SPARE_SPARE_34,
                SPARE_SPARE_35,
                SPARE_SPARE_36,
                SPARE_SPARE_37,
                SPARE_SPARE_38,
                SPARE_SPARE_39,
                SPARE_SPARE_40,
                SPARE_SPARE_41,
                SPARE_SPARE_42,
                SPARE_SPARE_43,
                SPARE_SPARE_44,
                SPARE_SPARE_45,
                SPARE_SPARE_46,
                SPARE_SPARE_47,
                SPARE_SPARE_48,
                SPARE_SPARE_49,
                SPARE_SPARE_50,
                CUST_CIC_OPEN_DATE,
                CONT_TRANSACTION_DATE)
            SELECT
                A_SCORE_REQUEST_ID_SEQ.NEXTVAL   		                        AS REQUEST_ID,
                RUN_ID                                                          AS RUN_ID,
                NULL 													        AS PROCESS_STATUS,
                S.ACCOUNT_1 											        AS CONT_ACCOUNT_ID,
                NVL(S.ACCRUED_INT, 0)  							                AS CONT_ACCRUED_INT,
                NVL(S.ADD_RATE, 0) 								                AS CONT_ADD_RATE,
                NVL(S.APPLICATION_DATE, TO_DATE('19000101','YYYYMMDD'))         AS CONT_APPLICATION_DATE,
                NVL(S.APPROVAL_DATE, TO_DATE('19000101','YYYYMMDD'))  	        AS CONT_APPROVAL_DATE,
                NVL(S.BALLOON_AMOUNT, 0) 							            AS CONT_BALLOON_AMOUNT,
                NVL(S.BASIC_SALARY_AMOUNT, 0) 					                AS CONT_BASIC_SALARY_AMOUNT,
                S.BRANCH_LOAN_APPLIED 									        AS CONT_BRANCH_LOAN_APPLIED,
                S.BRANCH_SHOWROOM_ACC 									        AS CONT_BRANCH_SHOWROOM_ACC,
                S.BUSINESS_POSITION 									        AS CONT_BUSINESS_POSITION,
                NVL(S.CIC, 0) 									                AS CONT_CIC,
                NVL(S.CONTRACT_NUMBER, 0) 						                AS CONT_CONTRACT_NUMBER,
                NVL(S.CUR_BOOK_BAL, 0) 							                AS CONT_CUR_BOOK_BAL,
                NVL(S.CURR_PAY, 0) 								                AS CONT_CURR_PAY,
                S.CURRENCY 												        AS CONT_CURRENCY,
                S.CUS_SUBTYPE 											        AS CONT_CUS_SUBTYPE,
                NVL(S.DEBT_BURDEN_RATIO, 0)  						            AS CONT_DEBT_BURDEN_RATIO,
                NVL(S.DELINQ_DAYS, 0)  							                AS CONT_DELINQ_DAYS,
                NVL(S.DEPENDENTS, 0)  							                AS CONT_DEPENDENTS,
                S.DEPT_CODE 											        AS CONT_DEPT_CODE,
                NVL(S.DISBURSEMENT_DATE, TO_DATE('19000101','YYYYMMDD'))        AS CONT_DISBURSEMENT_DATE,
                NVL(S.DISBURSEMENT_AMOUNT, 0)  					                AS CONT_DISBURSEMENT_AMOUNT,
                NVL(S.DOWNPAYMENT_AMT, 0)  						                AS CONT_DOWNPAYMENT_AMT,
                NVL(S.RUN_DATE, TO_DATE('19000101','YYYYMMDD')) 		        AS CONT_RUN_DATE,
                NVL(S.EMP_DEPARTMENT, 0)  						                AS CONT_EMP_DEPARTMENT,
                NVL(S.EMP_COMPANY, 0)  							                AS CONT_EMP_COMPANY,
                NVL(S.EMPLOYER_ENGAGEMENT_DT, TO_DATE('19000101','YYYYMMDD'))   AS CONT_EMPLOYER_ENGAGEMENT_DATE,
                NVL(S.FEES, 0)  									            AS CONT_FEES,
                NVL(S.FINANCE_AMT, 0)  							                AS CONT_FINANCE_AMT,
                NVL(S.GROSS_SALARY, 0)  							            AS CONT_GROSS_SALARY,
                S.H_CATEGORY_PRODUCT 									        AS CONT_H_CATEGORY_PRODUCT,
                NVL(S.INSTAL_AMT, 0)  							                AS CONT_INSTAL_AMT,
                S.INSTALMENT_WITH_INSURANCE 							        AS CONT_INSTAL_WITH_INSURANCE,
                NVL(S.LAST_PAYMENT, TO_DATE('19000101','YYYYMMDD')) 	        AS CONT_LAST_PAYMENT_DATE,
                NVL(S.MATURE_DATE, TO_DATE('19000101','YYYYMMDD')) 		        AS CONT_MATURE_DATE,
                S.MILITARY_RANK 										        AS CONT_MILITARY_RANK,
                NVL(S.NET_BAL, 0)  								                AS CONT_NET_BAL,
                NVL(S.NEXT_PAY, TO_DATE('19000101','YYYYMMDD')) 		        AS CONT_NEXT_PAY_DATE,
                NVL(S.NO_OF_DELINQ_INST, 0)  						            AS CONT_NO_OF_DELINQ_INST,
                NVL(S.OPEN_DATE, TO_DATE('19000101','YYYYMMDD')) 		        AS CONT_OPEN_DATE,
                S.ORG_UNIT 												        AS CONT_ORG_UNIT,
                NVL(S.ORIG_APPROVAL_AMT, 0)  						            AS CONT_ORIG_APPROVAL_AMT,
                NVL(S.ORIG_BALANCE, 0)  							            AS CONT_ORIG_BALANCE,
                NVL(S.ORIG_PAY, 0)  								            AS CONT_ORIG_PAY,
                NVL(S.ORIG_PROFIT, 0)  							                AS CONT_ORIG_PROFIT,
                NVL(S.ORIG_TERM, 0)  								            AS CONT_ORIG_TERM,
                NVL(S.PAY_FREQUENCY, 0)  							            AS CONT_PAY_FREQUENCY,
                NVL(S.PAYMENT_PRINCIPAL_AMT, 0)  					            AS CONT_PAYMENT_PRINCIPAL_AMT,
                S.PROFIT_RATE_SUB_TYPE 									        AS CONT_PROFIT_RATE_SUB_TYPE,
                NVL(S.RATE, 0)  									            AS CONT_RATE,
                NVL(S.TOTAL_PAYMENTS, 0)  						                AS CONT_TOTAL_PAYMENTS,
                NVL(S.REMAIN_PAYMENTS, 0)  						                AS CONT_REMAIN_PAYMENTS,
                NVL(S.REMAIN_TERM, 0)  							                AS CONT_REMAIN_TERM,
                S.RESIDENT_STATUS 										        AS CUST_RESIDENT_STATUS,
                S.RESIDENT_TYPE 										        AS CUST_RESIDENT_TYPE,
                NVL(S.SALARY_TRANSFER,'Others') 								AS CONT_SALARY_TRANSFER_TYPE,
                S.SALARY_TRANSFER_TYPE_CIF 								        AS CUST_SALARY_TRANSFER_TYPE_CIF,
                S.SALARY_TRANSFER 								                AS CONT_SALARY_TRANSFER_TYPE_CTF,
                S.SALES_BRANCH 											        AS CONT_SALES_BRANCH,
                S.SALES_CD 												        AS CONT_SALES_CD,
                S.SALES_USERID 											        AS CONT_SALES_USERID,
                NVL(S.TERM, 0) 									                AS CONT_TERM,
                NVL(S.TOT_GRACE_PRD_PROFIT, 0)  					            AS CONT_TOT_GRACE_PRD_PROFIT,
                NVL(S.TOTAL_EARLY_PAYMENT_AMT, 0)  				                AS CONT_TOTAL_EARLY_PAYMENT_AMT,
                NVL(S.TOTAL_INSTALLMENT_DUE_AMT, 0)  				            AS CONT_TOTAL_INSTAL_DUE_AMT,
                S.GENDER 												        AS CUST_GENDER,
                S.MARITAL_STATUS 										        AS CUST_MARITAL_STATUS,
                NVL(S.DATE_OF_BIRTH, TO_DATE('19000101','YYYYMMDD')) 	        AS CUST_DATE_OF_BIRTH,
                S.BRANCH_SHOWROOM_ACCOUNT_CODE 							        AS CONT_BRANCH_SHOWROOM_ACC_CODE,
                S.BRANCH_SHOWROOM_CODE 									        AS CONT_BRANCH_SHOWROOM_CODE,
                S.CHANNEL_CODE 											        AS CONT_CHANNEL_CODE,
                S.CITY 													        AS CUST_CITY,
                S.CIVIL_STATUS 											        AS CUST_CIVIL_STATUS,
                NVL(M.CUSTOMER_SEGMENT,'OTHER')                                 AS CONT_CUSTOMER_SEGMENT,
                S.DISTRICT_CODE 										        AS CUST_DISTRICT_CODE,
                NVL(S.DURATION_IN_MONTH, 0)  						            AS CONT_DURATION_IN_MONTH,
                S.EDUCATION_LEVEL 										        AS CUST_EDUCATION_LEVEL,
                S.EMPLOYEE_TYPE 										        AS CONT_EMPLOYEE_TYPE,
                S.EMPLOYER_CLASS_CODE 									        AS CONT_EMPLOYER_CLASS_CODE,
                NVL(S.END_OF_SERVICE_BENEFIT_AMOUNT, 0)  		                AS CONT_END_SERVICE_BENEFIT_AMT,
                S.HOUSE_OWNED_STATUS 									        AS CUST_HOUSE_OWNED_STATUS,
                NVL(S.MONTHLY_ALLOWANCE_AMOUNT, 0)  				            AS CONT_MONTHLY_ALLOWANCE_AMOUNT,
                NVL(S.MONTHLY_OTHER_INCOME_AMOUNT, 0)  			                AS CONT_MONTHLY_OTHER_INCOME_AMT,
                S.NATIONALITY 											        AS CUST_NATIONALITY,
                NVL(S.NUMBER_OF_CARS, 0)  						                AS CUST_NUMBER_OF_CARS,
                S.OCCUPATION_TYPE 										        AS CUST_OCCUPATION_TYPE,
                NVL(S.OTHER_MONTHLY_DEDUCTION_AMT, 0)  			                AS CONT_OTHER_MONTHLY_DEDUCT_AMT,
                S.PRODUCT_CODE 											        AS CONT_PRODUCT_CODE,
                NVL(M.PRODUCT_TYPE, 'OTHER') 							        AS CONT_PRODUCT_TYPE,
                S.REGION 												        AS CUST_REGION,
                S.RELATION_CONTRACT_TYPE 								        AS CONT_RELATION_CONTRACT_TYPE,
                NVL(S.RL_FOOD_BEVERAGES, 0)  						            AS RESP_RL_FOOD_BEVERAGES,
                NVL(S.RL_HOUSING, 0)  							                AS RESP_RL_HOUSING,
                NVL(S.RL_UTILITIES, 0) 	 						                AS RESP_RL_UTILITIES,
                NVL(S.RL_HEALTHCARE, 0)  							            AS RESP_RL_HEALTHCARE,
                NVL(S.RL_TRANSPORT, 0)  							            AS RESP_RL_TRANSPORT,
                NVL(S.RL_COMMUNICATIONS, 0)  						            AS RESP_RL_COMMUNICATIONS,
                NVL(S.RL_EDUCATION_FEES, 0)  						            AS RESP_RL_EDUCATION_FEES,
                NVL(S.RL_HOME_SERVANTS, 0)  						            AS RESP_RL_HOME_SERVANTS,
                NVL(S.RL_FEES_ON_EXPATS, 0)  						            AS RESP_RL_FEES_ON_EXPATS,
                NVL(S.RL_OTHER_FUTURE_EXPENSES, 0)  				            AS RESP_RL_OTHER_FUTURE_EXPENSES,
                NVL(S.RL_OTHER_INCOME, 0)  						                AS RESP_RL_OTHER_INCOME,
                NVL(S.RL_TOTAL_EXPENSES, 0)  						            AS RESP_RL_TOTAL_EXPENSES,
                NVL(S.RL_OTHER_OBLIGATIONS, 0)  					            AS RESP_RL_OTHER_OBLIGATIONS,
                S.ARMS_MITIGANT_CODE 									        AS ARMS_ARMS_MITIGANT_CODE,
                S.ARMS_MITIGANT_DESC 									        AS ARMS_ARMS_MITIGANT_DESC,
                NVL(S.ARMS_MITIGANT_VALUE, 0)  					                AS ARMS_ARMS_MITIGANT_VALUE,
                S.ARMS_COLL_AREA 										        AS ARMS_ARMS_COLL_AREA,
                S.ARMS_VEHICLE_BRAND_NAME 								        AS ARMS_ARMS_VEHICLE_BRAND_NAME,
                S.ARMS_VEHICLE_BRAND_TYPE 								        AS ARMS_ARMS_VEHICLE_BRAND_TYPE,
                NVL(S.ARMS_PROPERTY_EVAL_STATUS, 0)  				            AS ARMS_ARMS_PROP_EVAL_STATUS,
                S.ARMS_MITIGANT_VALUE_BY_OWNER 							        AS ARMS_ARMS_MITIGANT_VAL_OWNER,
                NVL(S.ARMS_BOOK_VALUE, 0)  						                AS ARMS_ARMS_BOOK_VALUE,
                NVL(S.ARMS_VALUATION_DIFF, 0)  					                AS ARMS_ARMS_VALUATION_DIFF,
                S.ARMS_CONTRACT_NUMBER 									        AS ARMS_ARMS_CONTRACT_NUMBER,
                NVL(S.ARMS_MANUFACTURE_YEAR, 0) 		 			            AS ARMS_ARMS_MANUFACTURE_YEAR,
                NVL(S.ARMS_VEHICLE_MANUFACTURE_YEAR, 0)  			            AS ARMS_ARMS_VEHI_MANUFACT_YEAR,
                S.ARMS_REGION 											        AS ARMS_ARMS_REGION,
                S.ARMS_PROPERTY_TYPE 									        AS ARMS_ARMS_PROPERTY_TYPE,
                NVL(S.TOTAL_LIABILITIES, 0)  						            AS SIMAH_TOTAL_LIABILITIES,
                NVL(S.NO_OF_LOANS, 0)  							                AS SIMAH_NO_OF_LOANS,
                NVL(S.TOTAL_LIMIT, 0)  							                AS SIMAH_TOTAL_LIMIT,
                NVL(S.TOTAL_REVOLVING_LIMIT, 0)  					            AS SIMAH_TOTAL_REVOLVING_LIMIT,
                NVL(S.TOTAL_REVOLVING_LIAB, 0)  					            AS SIMAH_TOTAL_REVOLVING_LIAB,
                NVL(S.NO_OF_ENQUIRIES_12M, 0)  					                AS SIMAH_NO_OF_ENQUIRIES_12M,
                NVL(S.NO_OF_ENQUIRIES_30D, 0)  					                AS SIMAH_NO_OF_ENQUIRIES_30D,
                NVL(S.NO_OF_BOUNCED_CHEQUE, 0)  					            AS SIMAH_NO_OF_BOUNCED_CHEQUE,
                NVL(S.SIMAH_SCORE, 0)  							                AS SIMAH_SIMAH_SCORE,
                S.SIMAH_SCORE_VERSION 									        AS SIMAH_SIMAH_SCORE_VERSION,
                S.WORST_DELINQUENT_24M_CRC 								        AS SIMAH_WORST_DELINQ_24M_CRC,
                S.WORST_DELINQUENT_24M_PLN 								        AS SIMAH_WORST_DELINQ_24M_PLN,
                S.WORST_DELINQUENT_24M_AUTO 							        AS SIMAH_WORST_DELINQ_24M_AUTO,
                S.WORST_DELINQUENT_24M_MTG 								        AS SIMAH_WORST_DELINQ_24M_MTG,
                S.WORST_DELINQUENT_24M_OTHER 							        AS SIMAH_WORST_DELINQ_24M_OTHER,
                S.CURRENT_WORST_DELINQUENT_CRC 							        AS SIMAH_CUR_WORST_DELINQ_CRC,
                S.CURRENT_WORST_DELINQUENT_PLN 							        AS SIMAH_CUR_WORST_DELINQ_PLN,
                S.CURRENT_WORST_DELINQUENT_AUTO 						        AS SIMAH_CUR_WORST_DELINQ_AUTO,
                S.CURRENT_WORST_DELINQUENT_MTG 							        AS SIMAH_CUR_WORST_DELINQ_MTG,
                S.CURRENT_WORST_DELINQUENT_OTHER 						        AS SIMAH_CUR_WORST_DELINQ_OTHER,
                NVL(S.CONTRACTUAL_PAYMENT_CRC, 0)  				                AS SIMAH_CONTRACTUAL_PAY_CRC,
                NVL(S.CONTRACTUAL_PAYMENT_PLN, 0)  				                AS SIMAH_CONTRACTUAL_PAY_PLN,
                NVL(S.CONTRACTUAL_PAYMENT_AUTO, 0)  				            AS SIMAH_CONTRACTUAL_PAY_AUTO,
                NVL(S.CONTRACTUAL_PAYMENT_MTG, 0)  				                AS SIMAH_CONTRACTUAL_PAY_MTG,
                NVL(S.CONTRACTUAL_PAYMENT_OTHER, 0)  				            AS SIMAH_CONTRACTUAL_PAY_OTHER,
                NVL(S.NUMBER_OF_DEFAULT_CRC, 0)  					            AS SIMAH_NO_OF_DEFAULT_CRC,
                NVL(S.NUMBER_OF_DEFAULT_PLN, 0)  					            AS SIMAH_NO_OF_DEFAULT_PLN,
                NVL(S.NUMBER_OF_DEFAULT_AUTO, 0)  				                AS SIMAH_NO_OF_DEFAULT_AUTO,
                NVL(S.NUMBER_OF_DEFAULT_MTG, 0)  					            AS SIMAH_NO_OF_DEFAULT_MTG,
                NVL(S.NUMBER_OF_DEFAULT_OTHER, 0) 	 			                AS SIMAH_NO_OF_DEFAULT_OTHER,
                NVL(S.NUMBER_OF_CI_DEFAULT_CRC, 0)  				            AS SIMAH_NO_OF_CI_DEFAULT_CRC,
                NVL(S.NUMBER_OF_CI_DEFAULT_PLN, 0)  				            AS SIMAH_NO_OF_CI_DEFAULT_PLN,
                NVL(S.NUMBER_OF_CI_DEFAULT_AUTO, 0)  				            AS SIMAH_NO_OF_CI_DEFAULT_AUTO,
                NVL(S.NUMBER_OF_CI_DEFAULT_MTG, 0) 				                AS SIMAH_NO_OF_CI_DEFAULT_MTG,
                NVL(S.NUMBER_OF_CI_DEFAULT_OTHER, 0)  			                AS SIMAH_NO_OF_CI_DEFAULT_OTHER,
                NVL(S.SUMMED_SALARY, 0)  							            AS SIMAH_SUMMED_SALARY,
                NVL(S.DEBT_BURDEN, 0)  							                AS SIMAH_DEBT_BURDEN,
                NVL(S.DEBT_BURDEN_RATIO, 0)  						            AS SIMAH_DEBT_BURDEN_RATIO,
                NVL(S.NUMBER_OF_EXECUTED_EXJUDG, 0)  				            AS SIMAH_NO_OF_EXECUTED_EXJUDG,
                NVL(S.NUMBER_OF_NOT_EXECUTED_EXJUDG, 0)  			            AS SIMAH_NO_OF_NOTEXEC_EXJUDG,
                NVL(S.OUTSTANDING_BALANCE_NOTEXJUDG, 0)  			            AS SIMAH_OUTSTAND_BAL_NOTEXJUDG,
                NVL(S.PRINCIPAL_OUTSTANDING, 0)  					            AS CONT_PRINCIPAL_OUTSTANDING,
                NVL(S.OUTSTANDING_WITH_ACCRUAL_PFT, 0)  			            AS CONT_OUTSTANDING_ACCRUVAL_PFT,
                NVL(S.OUTSTANDING_WITH_TOTAL_PROFIT, 0)  			            AS CONT_OUTSTANDING_TOTAL_PFT,
                S.SUB_CODE 												        AS CONT_SUB_CODE,
                NVL(S.AVERAGE_BALANCE_MONTH_M0, 0)  				            AS CASA_AVERAGE_BAL_MONTH_M0,
                NVL(S.AVERAGE_BALANCE_MONTH_M1, 0)  				            AS CASA_AVERAGE_BAL_MONTH_M1,
                NVL(S.AVERAGE_BALANCE_MONTH_M2, 0)  				            AS CASA_AVERAGE_BAL_MONTH_M2,
                NVL(S.AVERAGE_BALANCE_MONTH_M3, 0)  				            AS CASA_AVERAGE_BAL_MONTH_M3,
                NVL(S.AVERAGE_BALANCE_MONTH_M4, 0)  				            AS CASA_AVERAGE_BAL_MONTH_M4,
                NVL(S.AVERAGE_BALANCE_MONTH_M5, 0)  				            AS CASA_AVERAGE_BAL_MONTH_M5,
                NVL(S.AVERAGE_BALANCE_MONTH_M6, 0)  				            AS CASA_AVERAGE_BAL_MONTH_M6,
                NVL(S.AVERAGE_BALANCE_MONTH_M7, 0)  				            AS CASA_AVERAGE_BAL_MONTH_M7,
                NVL(S.AVERAGE_BALANCE_MONTH_M8, 0)  				            AS CASA_AVERAGE_BAL_MONTH_M8,
                NVL(S.AVERAGE_BALANCE_MONTH_M9, 0)  				            AS CASA_AVERAGE_BAL_MONTH_M9,
                NVL(S.AVERAGE_BALANCE_MONTH_M10, 0)  				            AS CASA_AVERAGE_BAL_MONTH_M10,
                NVL(S.AVERAGE_BALANCE_MONTH_M11, 0)  				            AS CASA_AVERAGE_BAL_MONTH_M11,
                S.BRANCH_SHOWROOM_ACC 									        AS CARD_BRANCH_SHOWROOM_ACC,
                NVL(S.CARD_PRODUCT_LIMIT, 0)  					                AS SIMAH_CARD_PRODUCT_LIMIT,
                S.CARD_PRODUCT_CODE 									        AS SIMAH_CARD_PRODUCT_CODE,
                NVL(S.CARD_OUTSTANDING_BALANCE, 0) 	 			                AS SIMAH_CARD_OUTSTANDING_BAL,
                S.PRIMARY_CARD_FLG 										        AS CARD_PRIMARY_CARD_FLG,
                NVL(S.SUPPLEMENTARY_CARD_LIMIT, 0)  				            AS CARD_SUPPLEMENTARY_CARD_LIMIT,
                S.SCORING_REQUEST_TYPE 									        AS SCOR_SCORING_REQUEST_TYPE,
                S.SCORING_STAGE 										        AS SCOR_SCORING_STAGE,
                S.SCORING_SOURCE 										        AS SCOR_SCORING_SOURCE,
                S.APPEND_DB_CODE 										        AS SCOR_APPEND_DB_CODE,
                S.APPLICATION_ID 										        AS SCOR_APPLICATION_ID,
                S.NATIONAL_ID 											        AS SCOR_NATIONAL_ID,
                S.DB_TABLE_CODE 										        AS SCOR_DB_TABLE_CODE,
                S.TRANSACTION_ID 										        AS SCOR_TRANSACTION_ID,
                NVL(S.EXECUTION_DATE_TIME, TO_DATE('19000101','YYYYMMDD'))      AS SCOR_EXECUTION_DATE_TIME,
                S.CODE_1 												        AS SCOR_CODE_01,
                S.CODE_2 												        AS SCOR_CODE_02,
                S.CODE_3 												        AS SCOR_CODE_03,
                S.CODE_4 												        AS SCOR_CODE_04,
                S.CODE_5 												        AS SCOR_CODE_05,
                S.CODE_6 												        AS SCOR_CODE_06,
                S.CODE_7 												        AS SCOR_CODE_07,
                S.CODE_8 												        AS SCOR_CODE_08,
                S.CODE_9 												        AS SCOR_CODE_09,
                S.CODE_10 												        AS SCOR_CODE_10,
                NVL(S.PROGRESS_NUMBER, 0)  						                AS SCOR_PROGRESS_NUMBER,
                S.SPARE_01 												        AS SPARE_SPARE_01,
                S.SPARE_02 												        AS SPARE_SPARE_02,
                S.SPARE_03 												        AS SPARE_SPARE_03,
                S.SPARE_04 												        AS SPARE_SPARE_04,
                S.SPARE_05 												        AS SPARE_SPARE_05,
                S.SPARE_06 												        AS SPARE_SPARE_06,
                S.SPARE_07 												        AS SPARE_SPARE_07,
                S.SPARE_08 												        AS SPARE_SPARE_08,
                S.SPARE_09 												        AS SPARE_SPARE_09,
                S.SPARE_10 												        AS SPARE_SPARE_10,
                S.SPARE_11 												        AS SPARE_SPARE_11,
                S.SPARE_12 												        AS SPARE_SPARE_12,
                S.SPARE_13 												        AS SPARE_SPARE_13,
                S.SPARE_14 												        AS SPARE_SPARE_14,
                S.SPARE_15 												        AS SPARE_SPARE_15,
                S.SPARE_16 												        AS SPARE_SPARE_16,
                S.SPARE_17 												        AS SPARE_SPARE_17,
                S.SPARE_18 												        AS SPARE_SPARE_18,
                S.SPARE_19 												        AS SPARE_SPARE_19,
                S.SPARE_20 												        AS SPARE_SPARE_20,
                S.SPARE_21 												        AS SPARE_SPARE_21,
                S.SPARE_22 												        AS SPARE_SPARE_22,
                S.SPARE_23 												        AS SPARE_SPARE_23,
                S.SPARE_24 												        AS SPARE_SPARE_24,
                S.SPARE_25 												        AS SPARE_SPARE_25,
                S.SPARE_26 												        AS SPARE_SPARE_26,
                S.SPARE_27 												        AS SPARE_SPARE_27,
                S.SPARE_28 												        AS SPARE_SPARE_28,
                S.SPARE_29 												        AS SPARE_SPARE_29,
                S.SPARE_30 												        AS SPARE_SPARE_30,
                S.SPARE_31 												        AS SPARE_SPARE_31,
                S.SPARE_32 												        AS SPARE_SPARE_32,
                S.SPARE_33 												        AS SPARE_SPARE_33,
                S.SPARE_34 												        AS SPARE_SPARE_34,
                S.SPARE_35 												        AS SPARE_SPARE_35,
                S.SPARE_36 												        AS SPARE_SPARE_36,
                S.SPARE_37 												        AS SPARE_SPARE_37,
                S.SPARE_38 												        AS SPARE_SPARE_38,
                S.SPARE_39 												        AS SPARE_SPARE_39,
                S.SPARE_40 												        AS SPARE_SPARE_40,
                S.SPARE_41 												        AS SPARE_SPARE_41,
                S.SPARE_42 												        AS SPARE_SPARE_42,
                S.SPARE_43 												        AS SPARE_SPARE_43,
                S.SPARE_44 												        AS SPARE_SPARE_44,
                S.SPARE_45 												        AS SPARE_SPARE_45,
                S.SPARE_46 												        AS SPARE_SPARE_46,
                S.SPARE_47 												        AS SPARE_SPARE_47,
                S.SPARE_48 												        AS SPARE_SPARE_48,
                S.SPARE_49 												        AS SPARE_SPARE_49,
                S.SPARE_50 												        AS SPARE_SPARE_50,
                NVL(S.CIC_OPEN_DATE, TO_DATE('19000101','YYYYMMDD'))  	        AS CUST_CIC_OPEN_DATE,
                NVL(S.TRANSACTION_DATE, TO_DATE('19000101','YYYYMMDD'))         AS CONT_TRANSACTION_DATE
        FROM    STG_SCORE_REQUEST S, A_SCORE_TEMP M
        WHERE   S.CONTRACT_NUMBER = M.CONTRACT_NUMBER;

        V_ROWCOUNT := V_ROWCOUNT + SQL%ROWCOUNT;
    EXCEPTION 
        WHEN OTHERS THEN
        V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                      SQLERRM || ' -- Error in inserting data into A_SCORE_REQUEST -- STOPPED';
        DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
        PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,V_RUN_ID);
        P_STATUS := 1;
        RETURN;
    END;

    --  Logging the completion of inserting data into A_SCORE_REQUEST 
    V_LOG_MSG := 'Records are successfully inserted into A_SCORE_REQUEST, RECORD_COUNT = ' || V_ROWCOUNT ;
    DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
    PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'I',NULL,V_LOG_MSG,V_RUN_ID);
    COMMIT;
    V_ROWCOUNT := 0;
    --  Inserting data into A_SCORE_REQUEST -- END

    --  Updating aggregation completion flag in APP_PARAM for A-SCORE -- START   
    BEGIN
        UPDATE  APP_PARAM 
        SET     ATTRIBUTE_VALUE_C1 = 1                
        WHERE   PARAM_CODE = 'AGG_COMPLETE';        
    EXCEPTION 
        WHEN OTHERS THEN
        V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                      SQLERRM || ' -- Error in updating aggregation completion flag in APP_PARAM table for A-SCORE -- STOPPED';
        DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
        PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,V_RUN_ID);
    END;
    --  Updating aggregation completion flag in APP_PARAM for A-SCORE -- END
    COMMIT;

EXCEPTION
  WHEN OTHERS THEN
    V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                  SQLERRM ||' -- Error in LOAD_A_SCORE_REQUEST -- ROLLBACKED';
    DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
    PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,V_RUN_ID);
    ROLLBACK;
    P_STATUS := 1;
END LOAD_A_SCORE_REQUEST;

---------------------------------------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------------------------------------------
PROCEDURE LOAD_B_SCORE_REQUEST (P_STATUS OUT NUMBER) AS
    /******************************************************************************
    NAME:    LOAD_B_SCORE_REQUEST
    PURPOSE: Insert Data into B_SCORE_REQUEST table.
    COMPANY: EJADA SYSTEMS

    REVISIONS:
    Version   Date        Author
    --------- ----------- ---------------
    1.0       24-AUG-2020  mgebba@ejada.com

    ******************************************************************************/
    --  General use variable declaration
    --V_AS_OF_DATE                   DATE ;
    V_ROWCOUNT                      NUMBER(9) := 0;
    V_LOG_MSG                       VARCHAR2(1000) := NULL;
    V_LOG_PARAM                     VARCHAR2(250)  := NULL;
    V_PROCEDURE_NAME                VARCHAR(32)    := 'LOAD_B_SCORE_REQUEST';
    V_PACKAGE_NAME                  VARCHAR(32)    := 'DATA_LOAD';  
    V_SQL_STMT                      CLOB;
    V_RUN_ID                        NUMBER := 0;
    -------------------------------------------------------------------------------
BEGIN
    --  Inserting data into B_SCORE_REQUEST -- START
    P_STATUS := 0;

    BEGIN
        SELECT NVL(MAX(RUN_ID),0) INTO V_RUN_ID FROM STG_SCORE_REQUEST;
    EXCEPTION 
        WHEN OTHERS THEN
        V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                      SQLERRM || ' -- Error in fetching RUN_ID from STG_SCORE_REQUEST table -- STOPPED';
        DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
        PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,V_RUN_ID);
    END;

    BEGIN
        V_SQL_STMT := 'TRUNCATE TABLE B_SCORE_TEMP';
        EXECUTE IMMEDIATE V_SQL_STMT;
    EXCEPTION 
        WHEN OTHERS THEN
        V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                      SQLERRM || ' -- Error in truncating B_SCORE_TEMP table -- STOPPED';
        DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
        PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,V_RUN_ID);
    END;

    BEGIN

       INSERT INTO         B_SCORE_TEMP
       SELECT DISTINCT Q1.CIC, Q1.PRODUCT_TYPE, Q1.CONTRACT_NUMBER, Q1.CUSTOMER_SEGMENT , Q1.ARMS_VEHICLE_BRAND_NAME , 
        CASE WHEN (Q1.CAR_BRAND_CATEGORY IS NULL AND (Q1.ARMS_VEHICLE_BRAND_NAME IS NULL OR Q1.ARMS_VEHICLE_BRAND_NAME IN (' ' , '.')) ) THEN NULL
             WHEN (Q1.CAR_BRAND_CATEGORY IS NULL AND  Q1.ARMS_VEHICLE_BRAND_NAME IS NOT NULL  ) THEN (SELECT CAR_BRAND_CATEGORY FROM VEHICLE_CATEGORY WHERE CAR_BRAND_NAME = 'others' )
             ELSE  Q1.CAR_BRAND_CATEGORY END ARMS_VEHICLE_BRAND_CAT
             FROM          
        (SELECT T3.CIC, P.PRODUCT_TYPE, T3.CONTRACT_NUMBER, T3.ARMS_VEHICLE_BRAND_NAME , C.CAR_BRAND_CATEGORY ,
        ( SELECT CUSTOMER_SEGMENT FROM ST_MAPPING S3 
            WHERE 
                (S3.PRODUCT_CODE = T3.PRODUCT_CODE AND S3.SALATRY_TRANSFER_TYPE_CTF = T3.SALARY_TRANSFER)
              OR(S3.PRODUCT_CODE = T3.PRODUCT_CODE AND S3.SALATRY_TRANSFER_TYPE_CTF = 'Others' AND NVL(T3.SALARY_TRANSFER,'XYZ') NOT IN (SELECT S1.SALATRY_TRANSFER_TYPE_CTF FROM ST_MAPPING S1 WHERE S1.PRODUCT_CODE = T3.PRODUCT_CODE ) ) 
              OR(S3.SALATRY_TRANSFER_TYPE_CTF = T3.SALARY_TRANSFER AND S3.PRODUCT_CODE = 'Others' AND NVL(T3.PRODUCT_CODE,'XYZ') NOT IN (SELECT S2.PRODUCT_CODE FROM ST_MAPPING S2 WHERE S2.SALATRY_TRANSFER_TYPE_CTF = T3.SALARY_TRANSFER ) )
              OR(S3.SALATRY_TRANSFER_TYPE_CTF = 'Others' AND S3.PRODUCT_CODE = 'Others'  AND NVL(T3.SALARY_TRANSFER,'XYZ') NOT IN (SELECT SALATRY_TRANSFER_TYPE_CTF FROM ST_MAPPING )
              AND NVL(T3.PRODUCT_CODE,'XYZ') NOT IN (SELECT PRODUCT_CODE FROM ST_MAPPING ) )) CUSTOMER_SEGMENT
        FROM
        STG_SCORE_REQUEST T3 , PRODUCT P , VEHICLE_CATEGORY C
        WHERE
        T3.PRODUCT_CODE   = P.PRODUCT_CODE 
        AND UPPER(REPLACE(T3.ARMS_VEHICLE_BRAND_NAME,' ')) = C.CAR_BRAND_NAME(+))Q1 ,
        (SELECT T3.CIC, P.PRODUCT_TYPE,
        ( SELECT CUSTOMER_SEGMENT FROM ST_MAPPING S3 
            WHERE 
                (S3.PRODUCT_CODE = T3.PRODUCT_CODE AND S3.SALATRY_TRANSFER_TYPE_CTF = T3.SALARY_TRANSFER)
              OR(S3.PRODUCT_CODE = T3.PRODUCT_CODE AND S3.SALATRY_TRANSFER_TYPE_CTF = 'Others' AND NVL(T3.SALARY_TRANSFER,'XYZ') NOT IN (SELECT S1.SALATRY_TRANSFER_TYPE_CTF FROM ST_MAPPING S1 WHERE S1.PRODUCT_CODE = T3.PRODUCT_CODE ) ) 
              OR(S3.SALATRY_TRANSFER_TYPE_CTF = T3.SALARY_TRANSFER AND S3.PRODUCT_CODE = 'Others' AND NVL(T3.PRODUCT_CODE,'XYZ') NOT IN (SELECT S2.PRODUCT_CODE FROM ST_MAPPING S2 WHERE S2.SALATRY_TRANSFER_TYPE_CTF = T3.SALARY_TRANSFER ) )
              OR(S3.SALATRY_TRANSFER_TYPE_CTF = 'Others' AND S3.PRODUCT_CODE = 'Others'  AND NVL(T3.SALARY_TRANSFER,'XYZ') NOT IN (SELECT SALATRY_TRANSFER_TYPE_CTF FROM ST_MAPPING )
              AND NVL(T3.PRODUCT_CODE,'XYZ') NOT IN (SELECT PRODUCT_CODE FROM ST_MAPPING ) )) CUSTOMER_SEGMENT
        FROM
        STG_SCORE_REQUEST T3 , PRODUCT P
        WHERE
        T3.PRODUCT_CODE   = P.PRODUCT_CODE
        AND T3.OPEN_DATE < ADD_MONTHS(T3.RUN_DATE,-12))Q2
         WHERE  Q1.CIC               = Q2.CIC
           AND  Q1.PRODUCT_TYPE      = Q2.PRODUCT_TYPE
           AND  Q1.CUSTOMER_SEGMENT  = Q2.CUSTOMER_SEGMENT;   

    EXCEPTION 
        WHEN OTHERS THEN
        V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                      SQLERRM || ' -- Error in populating B_SCORE_TEMP table -- STOPPED';
        DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
        PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,V_RUN_ID);
    END;   

    BEGIN
        INSERT INTO B_SCORE_REQUEST (
            REQUEST_ID,
            RUN_ID,
            PROCESS_STATUS,
            CASA_AVERAGE_BAL_MONTH_M0,
            CASA_AVERAGE_BAL_MONTH_M1,
            CASA_AVERAGE_BAL_MONTH_M2,
            CASA_AVERAGE_BAL_MONTH_M3,
            CASA_AVERAGE_BAL_MONTH_M4,
            CASA_AVERAGE_BAL_MONTH_M5,
            CASA_AVERAGE_BAL_MONTH_M6,
            CASA_AVERAGE_BAL_MONTH_M7,
            CASA_AVERAGE_BAL_MONTH_M8,
            CASA_AVERAGE_BAL_MONTH_M9,
            CASA_AVERAGE_BAL_MONTH_M10,
            CASA_AVERAGE_BAL_MONTH_M11,
            CASA_AVERAGE_BAL_MONTH_M12,
            CASA_AVERAGE_BAL_MONTH_M13,
            CASA_AVERAGE_BAL_MONTH_M14,
            CASA_AVERAGE_BAL_MONTH_M15,
            CASA_AVERAGE_BAL_MONTH_M16,
            CASA_AVERAGE_BAL_MONTH_M17,
            CASA_AVERAGE_BAL_MONTH_M18,
            CASA_AVERAGE_BAL_MONTH_M19,
            CASA_AVERAGE_BAL_MONTH_M20,
            CASA_AVERAGE_BAL_MONTH_M21,
            CASA_AVERAGE_BAL_MONTH_M22,
            CASA_AVERAGE_BAL_MONTH_M23,
            CASA_AVERAGE_BAL_MONTH_M24,
            CUST_CIC_OPEN_DATE,
            CUST_CITY,
            CUST_CIVIL_STATUS,
            CUST_DATE_OF_BIRTH,
            CUST_DISTRICT_CODE,
            CUST_EDUCATION_LEVEL,
            CUST_GENDER,
            CUST_HOUSE_OWNED_STATUS,
            CUST_LATEST_EMP_COMPANY,
            CUST_LATEST_EMP_DEPARTMENT,
            CUST_MARITAL_STATUS,
            CUST_NATIONALITY,
            CUST_NUMBER_OF_CARS,
            CUST_OCCUPATION_TYPE,
            CUST_REGION,
            CUST_RESIDENT_STATUS,
            CUST_RESIDENT_TYPE,
            CUST_SALARY_TRANSFER_TYPE_CIF,
            CUST_TOT_NO_ACTIVE_CONTRACTS,
            PROD_ARMS_BOOK_VALUE,
            PROD_ARMS_COLL_AREA,
            PROD_ARMS_CONTRACT_NUMBER,
            PROD_ARMS_MANUFACTURE_YEAR,
            PROD_ARMS_MITIGANT_CODE,
            PROD_ARMS_MITIGANT_DESC,
            PROD_ARMS_MITIGANT_VALUE,
            PROD_ARMS_MITIGANT_VAL_OWNER,
            PROD_ARMS_PROPERTY_TYPE,
            PROD_ARMS_PROP_EVAL_STATUS,
            PROD_ARMS_REGION,
            PROD_ARMS_VALUATION_DIFF,
            PROD_ARMS_VEHICLE_BRAND_CAT ,  
            PROD_ARMS_VEHICLE_BRAND_NAME,
            PROD_ARMS_VEHICLE_BRAND_TYPE,
            PROD_ARMS_VEHI_MANUFACT_YEAR,
            PROD_DELINQ_AMOUNT_M0,
            PROD_DELINQ_AMOUNT_M1,
            PROD_DELINQ_AMOUNT_M2,
            PROD_DELINQ_AMOUNT_M3,
            PROD_DELINQ_AMOUNT_M4,
            PROD_DELINQ_AMOUNT_M5,
            PROD_DELINQ_AMOUNT_M6,
            PROD_DELINQ_AMOUNT_M7,
            PROD_DELINQ_AMOUNT_M8,
            PROD_DELINQ_AMOUNT_M9,
            PROD_DELINQ_AMOUNT_M10,
            PROD_DELINQ_AMOUNT_M11,
            PROD_DELINQ_AMOUNT_M12,
            PROD_DELINQ_AMOUNT_M13,
            PROD_DELINQ_AMOUNT_M14,
            PROD_DELINQ_AMOUNT_M15,
            PROD_DELINQ_AMOUNT_M16,
            PROD_DELINQ_AMOUNT_M17,
            PROD_DELINQ_AMOUNT_M18,
            PROD_DELINQ_AMOUNT_M19,
            PROD_DELINQ_AMOUNT_M20,
            PROD_DELINQ_AMOUNT_M21,
            PROD_DELINQ_AMOUNT_M22,
            PROD_DELINQ_AMOUNT_M23,
            PROD_DELINQ_AMOUNT_M24,
            PROD_DELINQ_DAYS_M0,
            PROD_DELINQ_DAYS_M1,
            PROD_DELINQ_DAYS_M2,
            PROD_DELINQ_DAYS_M3,
            PROD_DELINQ_DAYS_M4,
            PROD_DELINQ_DAYS_M5,
            PROD_DELINQ_DAYS_M6,
            PROD_DELINQ_DAYS_M7,
            PROD_DELINQ_DAYS_M8,
            PROD_DELINQ_DAYS_M9,
            PROD_DELINQ_DAYS_M10,
            PROD_DELINQ_DAYS_M11,
            PROD_DELINQ_DAYS_M12,
            PROD_DELINQ_DAYS_M13,
            PROD_DELINQ_DAYS_M14,
            PROD_DELINQ_DAYS_M15,
            PROD_DELINQ_DAYS_M16,
            PROD_DELINQ_DAYS_M17,
            PROD_DELINQ_DAYS_M18,
            PROD_DELINQ_DAYS_M19,
            PROD_DELINQ_DAYS_M20,
            PROD_DELINQ_DAYS_M21,
            PROD_DELINQ_DAYS_M22,
            PROD_DELINQ_DAYS_M23,
            PROD_DELINQ_DAYS_M24,
            PROD_EMI_M0,
            PROD_EMI_M1,
            PROD_EMI_M2,
            PROD_EMI_M3,
            PROD_EMI_M4,
            PROD_EMI_M5,
            PROD_EMI_M6,
            PROD_EMI_M7,
            PROD_EMI_M8,
            PROD_EMI_M9,
            PROD_EMI_M10,
            PROD_EMI_M11,
            PROD_EMI_M12,
            PROD_EMI_M13,
            PROD_EMI_M14,
            PROD_EMI_M15,
            PROD_EMI_M16,
            PROD_EMI_M17,
            PROD_EMI_M18,
            PROD_EMI_M19,
            PROD_EMI_M20,
            PROD_EMI_M21,
            PROD_EMI_M22,
            PROD_EMI_M23,
            PROD_EMI_M24,
            PROD_OUTSTANDING_AMOUNT_M0,
            PROD_OUTSTANDING_AMOUNT_M1,
            PROD_OUTSTANDING_AMOUNT_M2,
            PROD_OUTSTANDING_AMOUNT_M3,
            PROD_OUTSTANDING_AMOUNT_M4,
            PROD_OUTSTANDING_AMOUNT_M5,
            PROD_OUTSTANDING_AMOUNT_M6,
            PROD_OUTSTANDING_AMOUNT_M7,
            PROD_OUTSTANDING_AMOUNT_M8,
            PROD_OUTSTANDING_AMOUNT_M9,
            PROD_OUTSTANDING_AMOUNT_M10,
            PROD_OUTSTANDING_AMOUNT_M11,
            PROD_OUTSTANDING_AMOUNT_M12,
            PROD_OUTSTANDING_AMOUNT_M13,
            PROD_OUTSTANDING_AMOUNT_M14,
            PROD_OUTSTANDING_AMOUNT_M15,
            PROD_OUTSTANDING_AMOUNT_M16,
            PROD_OUTSTANDING_AMOUNT_M17,
            PROD_OUTSTANDING_AMOUNT_M18,
            PROD_OUTSTANDING_AMOUNT_M19,
            PROD_OUTSTANDING_AMOUNT_M20,
            PROD_OUTSTANDING_AMOUNT_M21,
            PROD_OUTSTANDING_AMOUNT_M22,
            PROD_OUTSTANDING_AMOUNT_M23,
            PROD_OUTSTANDING_AMOUNT_M24,
            PROD_ACCRUED_INT,
            PROD_ADD_RATE,
            PROD_BALLOON_AMOUNT,
            PROD_BASIC_SALARY_AMOUNT,
            PROD_BRANCH_SHOWROOM_ACC,
            PROD_BRANCH_SHOWROOM_ACC_CODE,
            PROD_BRANCH_SHOWROOM_CODE,
            PROD_BUSINESS_POSITION,
            PROD_CHANNEL_CODE,
            PROD_CUR_BOOK_BAL,
            PROD_CURR_PAY,
            PROD_CURRENCY,
            PROD_CUS_SUBTYPE,
            PROD_CUSTOMER_SEGMENT,
            PROD_DEBT_BURDEN_RATIO,
            PROD_DEPENDENTS,
            PROD_DEPT_CODE,
            PROD_DISBURSEMENT_AMOUNT,
            PROD_DISBURSEMENT_DATE,
            PROD_DOWNPAYMENT_AMT,
            PROD_DURATION_IN_MONTH,
            PROD_EMP_COMPANY,
            PROD_EMP_DEPARTMENT,
            PROD_EMPLOYEE_TYPE,
            PROD_EMPLOYER_CLASS_CODE,
            PROD_EMPLOYER_ENGAGEMENT_DATE,
            PROD_END_SERVICE_BENEFIT_AMT,
            PROD_FEES,
            PROD_FINANCE_AMT,
            PROD_FIRST_APPLICATION_DATE,
            PROD_FIRST_APPROVAL_DATE,
            PROD_FIRST_OPEN_DATE,
            PROD_GROSS_SALARY,
            PROD_INSTAL_AMT,
            PROD_INSTAL_WITH_INSURANCE,
            PROD_LAST_APPLICATION_DATE,
            PROD_LAST_APPROVAL_DATE,
            PROD_LAST_OPEN_DATE,
            PROD_LAST_PAYMENT_DATE,
            PROD_MATURE_DATE,
            PROD_MILITARY_RANK,
            PROD_MONTHLY_ALLOWANCE_AMT,
            PROD_MONTHLY_OTHER_INCOME_AMT,
            PROD_NET_BAL,
            PROD_NEXT_PAY_DATE,
            PROD_NO_OF_DELINQ_INST,
            PROD_ORIG_APPROVAL_AMT,
            PROD_ORIG_BALANCE,
            PROD_ORIG_PAY,
            PROD_ORIG_PROFIT,
            PROD_OTH_MONTHLY_DEDUCT_AMT,
            PROD_OUTSTANDING_ACCRUAL_PFT,
            PROD_OUTSTANDING_TOTAL_PFT,
            PROD_PAYMENT_PRINCIPAL_AMT,
            PROD_PRODUCT_CODE,
            PROD_PRODUCT_TYPE,
            PROD_PROFIT_RATE_SUB_TYPE,
            PROD_RATE,
            PROD_RELATION_CONTRACT_TYPE,
            PROD_REMAIN_PAYMENTS,
            PROD_REMAIN_TERM,
            PROD_SALARY_TRANSFER_TYPE,
            PROD_SALARY_TRANSFER_TYPE_CTF,
            PROD_SALES_BRANCH,
            PROD_SALES_CD,
            PROD_SALES_USERID,
            PROD_SUB_CODE,
            PROD_TERM,
            PROD_TOT_GRACE_PRD_PROFIT,
            PROD_TOTAL_PAYMENTS,
            PROD_TOTAL_EARLY_PAYMENT_AMT,
            PROD_TOTAL_INSTALL_DUE_AMT,
            PROD_TOTAL_NO_OPEN_CONTRACTS,
            PROD_SPARE_101,
            PROD_SPARE_102,
            PROD_SPARE_103,
            PROD_SPARE_104,
            PROD_SPARE_105,
            PROD_SPARE_106,
            PROD_SPARE_107,
            PROD_SPARE_108,
            PROD_SPARE_109,
            PROD_SPARE_110,
            PROD_SPARE_111,
            PROD_SPARE_112,
            PROD_SPARE_113,
            PROD_SPARE_114,
            PROD_SPARE_115,
            PROD_SPARE_116,
            PROD_SPARE_117,
            PROD_SPARE_118,
            PROD_SPARE_119,
            PROD_SPARE_120,
            RESP_RL_COMMUNICATIONS,
            RESP_RL_EDUCATION_FEES,
            RESP_RL_FEES_ON_EXPATS,
            RESP_RL_FOOD_BEVERAGES,
            RESP_RL_HEALTHCARE,
            RESP_RL_HOME_SERVANTS,
            RESP_RL_HOUSING,
            RESP_RL_OTHER_FUTURE_EXPENSES,
            RESP_RL_OTHER_INCOME,
            RESP_RL_OTHER_OBLIGATIONS,
            RESP_RL_TOTAL_EXPENSES,
            RESP_RL_TRANSPORT,
            RESP_RL_UTILITIES,
            SCOR_CIC,
            SCOR_CODE_01,
            SCOR_CODE_02,
            SCOR_CODE_03,
            SCOR_CODE_04,
            SCOR_CODE_05,
            SCOR_CODE_06,
            SCOR_CODE_07,
            SCOR_CODE_08,
            SCOR_CODE_09,
            SCOR_CODE_10,
            SCOR_NATIONAL_ID,
            SCOR_PORTFOLIO_DATE,
            SCOR_SCORING_REQUEST_TYPE,
            SCOR_SCORING_SOURCE,
            SCOR_TRANSACTION_ID,
            SIMAH_CARD_OUTSTANDING_BAL,
            SIMAH_CARD_PRODUCT_CODE,
            SIMAH_CARD_PRODUCT_LIMIT,
            SIMAH_CONTRACTUAL_PAY_AUTO,
            SIMAH_CONTRACTUAL_PAY_CRC,
            SIMAH_CONTRACTUAL_PAY_MTG,
            SIMAH_CONTRACTUAL_PAY_OTHER,
            SIMAH_CONTRACTUAL_PAY_PLN,
            SIMAH_CUR_WORST_DELINQ_AUTO,
            SIMAH_CUR_WORST_DELINQ_CRC,
            SIMAH_CUR_WORST_DELINQ_MTG,
            SIMAH_CUR_WORST_DELINQ_OTHER,
            SIMAH_CUR_WORST_DELINQ_PLN,
            SIMAH_DEBT_BURDEN,
            SIMAH_DEBT_BURDEN_RATIO,
            SIMAH_NO_OF_BOUNCED_CHEQUE,
            SIMAH_NO_OF_ENQUIRIES_12M,
            SIMAH_NO_OF_ENQUIRIES_30D,
            SIMAH_NO_OF_LOANS,
            SIMAH_NO_OF_CI_DEFAULT_AUTO,
            SIMAH_NO_OF_CI_DEFAULT_CRC,
            SIMAH_NO_OF_CI_DEFAULT_MTG,
            SIMAH_NO_OF_CI_DEFAULT_OTHER,
            SIMAH_NO_OF_CI_DEFAULT_PLN,
            SIMAH_NO_OF_DEFAULT_AUTO,
            SIMAH_NO_OF_DEFAULT_CRC,
            SIMAH_NO_OF_DEFAULT_MTG,
            SIMAH_NO_OF_DEFAULT_OTHER,
            SIMAH_NO_OF_DEFAULT_PLN,
            SIMAH_NO_OF_EXEC_EXJUDG,
            SIMAH_NO_OF_NOTEXEC_EXJUDG,
            SIMAH_OUTSTAND_BAL_NOTEXJUDG,
            SIMAH_SIMAH_SCORE,
            SIMAH_SIMAH_SCORE_VERSION,
            SIMAH_SUMMED_SALARY,
            SIMAH_TOTAL_LIABILITIES,
            SIMAH_TOTAL_LIMIT,
            SIMAH_TOTAL_REVOLVING_LIAB,
            SIMAH_TOTAL_REVOLVING_LIMIT,
            SIMAH_WORST_DELINQ_24M_AUTO,
            SIMAH_WORST_DELINQ_24M_OTHER,
            SIMAH_WORST_DELINQ_24M_PLN,
            SIMAH_WORST_DELINQ_24M_CRC,
            SIMAH_WORST_DELINQ_24M_MTG,
            SPARE_SPARE_01,
            SPARE_SPARE_02,
            SPARE_SPARE_03,
            SPARE_SPARE_04,
            SPARE_SPARE_05,
            SPARE_SPARE_06,
            SPARE_SPARE_07,
            SPARE_SPARE_08,
            SPARE_SPARE_09,
            SPARE_SPARE_10,
            SPARE_SPARE_11,
            SPARE_SPARE_12,
            SPARE_SPARE_13,
            SPARE_SPARE_14,
            SPARE_SPARE_15,
            SPARE_SPARE_16,
            SPARE_SPARE_17,
            SPARE_SPARE_18,
            SPARE_SPARE_19,
            SPARE_SPARE_20,
            SPARE_SPARE_21,
            SPARE_SPARE_22,
            SPARE_SPARE_23,
            SPARE_SPARE_24,
            SPARE_SPARE_25,
            SPARE_SPARE_26,
            SPARE_SPARE_27,
            SPARE_SPARE_28,
            SPARE_SPARE_29,
            SPARE_SPARE_30,
            SPARE_SPARE_31,
            SPARE_SPARE_32,
            SPARE_SPARE_33,
            SPARE_SPARE_34,
            SPARE_SPARE_35,
            SPARE_SPARE_36,
            SPARE_SPARE_37,
            SPARE_SPARE_38,
            SPARE_SPARE_39,
            SPARE_SPARE_40,
            SPARE_SPARE_41,
            SPARE_SPARE_42,
            SPARE_SPARE_43,
            SPARE_SPARE_44,
            SPARE_SPARE_45,
            SPARE_SPARE_46,
            SPARE_SPARE_47,
            SPARE_SPARE_48,
            SPARE_SPARE_49,
            SPARE_SPARE_50)
        SELECT 
            B_SCORE_REQUEST_ID_SEQ.NEXTVAL AS REQUEST_ID,
            RUN_ID AS RUN_ID,
            NULL AS PROCESS_STATUS,
            NVL(CASA_AVERAGE_BAL_MONTH_M0, 0),
            NVL(CASA_AVERAGE_BAL_MONTH_M1, 0),
            NVL(CASA_AVERAGE_BAL_MONTH_M2, 0),
            NVL(CASA_AVERAGE_BAL_MONTH_M3, 0),
            NVL(CASA_AVERAGE_BAL_MONTH_M4, 0),
            NVL(CASA_AVERAGE_BAL_MONTH_M5, 0),
            NVL(CASA_AVERAGE_BAL_MONTH_M6, 0),
            NVL(CASA_AVERAGE_BAL_MONTH_M7, 0),
            NVL(CASA_AVERAGE_BAL_MONTH_M8, 0),
            NVL(CASA_AVERAGE_BAL_MONTH_M9, 0),
            NVL(CASA_AVERAGE_BAL_MONTH_M10, 0),
            NVL(CASA_AVERAGE_BAL_MONTH_M11, 0),
            NVL(CASA_AVERAGE_BAL_MONTH_M12, 0),
            NVL(CASA_AVERAGE_BAL_MONTH_M13, 0),
            NVL(CASA_AVERAGE_BAL_MONTH_M14, 0),
            NVL(CASA_AVERAGE_BAL_MONTH_M15, 0),
            NVL(CASA_AVERAGE_BAL_MONTH_M16, 0),
            NVL(CASA_AVERAGE_BAL_MONTH_M17, 0),
            NVL(CASA_AVERAGE_BAL_MONTH_M18, 0),
            NVL(CASA_AVERAGE_BAL_MONTH_M19, 0),
            NVL(CASA_AVERAGE_BAL_MONTH_M20, 0),
            NVL(CASA_AVERAGE_BAL_MONTH_M21, 0),
            NVL(CASA_AVERAGE_BAL_MONTH_M22, 0),
            NVL(CASA_AVERAGE_BAL_MONTH_M23, 0),
            NVL(CASA_AVERAGE_BAL_MONTH_M24, 0),
            NVL(CUST_CIC_OPEN_DATE, TO_DATE('19000101','YYYYMMDD')),
            CUST_CITY,                                                                    
            CUST_CIVIL_STATUS,                                                            
            NVL(CUST_DATE_OF_BIRTH, TO_DATE('19000101','YYYYMMDD')),
            CUST_DISTRICT_CODE,                                               
            CUST_EDUCATION_LEVEL,                                             
            CUST_GENDER,                                                      
            CUST_HOUSE_OWNED_STATUS,                                          
            CUST_LATEST_EMP_COMPANY,                                          
            CUST_LATEST_EMP_DEPARTMENT,                                       
            CUST_MARITAL_STATUS,                                              
            CUST_NATIONALITY,                                                 
            NVL(CUST_NUMBER_OF_CARS, 0),
            CUST_OCCUPATION_TYPE,                                             
            CUST_REGION,                                                      
            CUST_RESIDENT_STATUS,                                             
            CUST_RESIDENT_TYPE,                                               
            CUST_SALARY_TRANSFER_TYPE_CIF,                                    
            NVL(CUST_TOT_NO_ACTIVE_CONTRACTS, 0),
            NVL(PROD_ARMS_BOOK_VALUE, 0),
            PROD_ARMS_COLL_AREA,                                              
            PROD_ARMS_CONTRACT_NUMBER,                                        
            NVL(PROD_ARMS_MANUFACTURE_YEAR, 0),
            PROD_ARMS_MITIGANT_CODE,                                          
            PROD_ARMS_MITIGANT_DESC,                                          
            NVL(PROD_ARMS_MITIGANT_VALUE, 0),
            PROD_ARMS_MITIGANT_VAL_OWNER,                                     
            PROD_ARMS_PROPERTY_TYPE,                                          
            NVL(PROD_ARMS_PROP_EVAL_STATUS, 0),
            PROD_ARMS_REGION,                                                 
            NVL(PROD_ARMS_VALUATION_DIFF, 0),
            PROD_ARMS_VEHICLE_BRAND_CAT,  
            PROD_ARMS_VEHICLE_BRAND_NAME,                                     
            PROD_ARMS_VEHICLE_BRAND_TYPE,                                     
            NVL(PROD_ARMS_VEHI_MANUFACT_YEAR, 0),
            NVL(PROD_DELINQ_AMOUNT_M0, 0),
            NVL(PROD_DELINQ_AMOUNT_M1, 0),
            NVL(PROD_DELINQ_AMOUNT_M2, 0),
            NVL(PROD_DELINQ_AMOUNT_M3, 0),
            NVL(PROD_DELINQ_AMOUNT_M4, 0),
            NVL(PROD_DELINQ_AMOUNT_M5, 0),
            NVL(PROD_DELINQ_AMOUNT_M6, 0),
            NVL(PROD_DELINQ_AMOUNT_M7, 0),
            NVL(PROD_DELINQ_AMOUNT_M8, 0),
            NVL(PROD_DELINQ_AMOUNT_M9, 0),
            NVL(PROD_DELINQ_AMOUNT_M10, 0),
            NVL(PROD_DELINQ_AMOUNT_M11, 0),
            NVL(PROD_DELINQ_AMOUNT_M12, 0),
            NVL(PROD_DELINQ_AMOUNT_M13, 0),
            NVL(PROD_DELINQ_AMOUNT_M14, 0),
            NVL(PROD_DELINQ_AMOUNT_M15, 0),
            NVL(PROD_DELINQ_AMOUNT_M16, 0),
            NVL(PROD_DELINQ_AMOUNT_M17, 0),
            NVL(PROD_DELINQ_AMOUNT_M18, 0),
            NVL(PROD_DELINQ_AMOUNT_M19, 0),
            NVL(PROD_DELINQ_AMOUNT_M20, 0),
            NVL(PROD_DELINQ_AMOUNT_M21, 0),
            NVL(PROD_DELINQ_AMOUNT_M22, 0),
            NVL(PROD_DELINQ_AMOUNT_M23, 0),
            NVL(PROD_DELINQ_AMOUNT_M24, 0),
            NVL(PROD_DELINQ_DAYS_M0, 0),
            NVL(PROD_DELINQ_DAYS_M1, 0),
            NVL(PROD_DELINQ_DAYS_M2, 0),
            NVL(PROD_DELINQ_DAYS_M3, 0),
            NVL(PROD_DELINQ_DAYS_M4, 0),
            NVL(PROD_DELINQ_DAYS_M5, 0),
            NVL(PROD_DELINQ_DAYS_M6, 0),
            NVL(PROD_DELINQ_DAYS_M7, 0),
            NVL(PROD_DELINQ_DAYS_M8, 0),
            NVL(PROD_DELINQ_DAYS_M9, 0),
            NVL(PROD_DELINQ_DAYS_M10, 0),
            NVL(PROD_DELINQ_DAYS_M11, 0),
            NVL(PROD_DELINQ_DAYS_M12, 0),
            NVL(PROD_DELINQ_DAYS_M13, 0),
            NVL(PROD_DELINQ_DAYS_M14, 0),
            NVL(PROD_DELINQ_DAYS_M15, 0),
            NVL(PROD_DELINQ_DAYS_M16, 0),
            NVL(PROD_DELINQ_DAYS_M17, 0),
            NVL(PROD_DELINQ_DAYS_M18, 0),
            NVL(PROD_DELINQ_DAYS_M19, 0),
            NVL(PROD_DELINQ_DAYS_M20, 0),
            NVL(PROD_DELINQ_DAYS_M21, 0),
            NVL(PROD_DELINQ_DAYS_M22, 0),
            NVL(PROD_DELINQ_DAYS_M23, 0),
            NVL(PROD_DELINQ_DAYS_M24, 0),
            NVL(PROD_EMI_M0, 0),
            NVL(PROD_EMI_M1, 0),
            NVL(PROD_EMI_M2, 0),
            NVL(PROD_EMI_M3, 0),
            NVL(PROD_EMI_M4, 0),
            NVL(PROD_EMI_M5, 0),
            NVL(PROD_EMI_M6, 0),
            NVL(PROD_EMI_M7, 0),
            NVL(PROD_EMI_M8, 0),
            NVL(PROD_EMI_M9, 0),
            NVL(PROD_EMI_M10, 0),
            NVL(PROD_EMI_M11, 0),
            NVL(PROD_EMI_M12, 0),
            NVL(PROD_EMI_M13, 0),
            NVL(PROD_EMI_M14, 0),
            NVL(PROD_EMI_M15, 0),
            NVL(PROD_EMI_M16, 0),
            NVL(PROD_EMI_M17, 0),
            NVL(PROD_EMI_M18, 0),
            NVL(PROD_EMI_M19, 0),
            NVL(PROD_EMI_M20, 0),
            NVL(PROD_EMI_M21, 0),
            NVL(PROD_EMI_M22, 0),
            NVL(PROD_EMI_M23, 0),
            NVL(PROD_EMI_M24, 0),
            NVL(PROD_OUTSTANDING_AMOUNT_M0, 0),
            NVL(PROD_OUTSTANDING_AMOUNT_M1, 0),
            NVL(PROD_OUTSTANDING_AMOUNT_M2, 0),
            NVL(PROD_OUTSTANDING_AMOUNT_M3, 0),
            NVL(PROD_OUTSTANDING_AMOUNT_M4, 0),
            NVL(PROD_OUTSTANDING_AMOUNT_M5, 0),
            NVL(PROD_OUTSTANDING_AMOUNT_M6, 0),
            NVL(PROD_OUTSTANDING_AMOUNT_M7, 0),
            NVL(PROD_OUTSTANDING_AMOUNT_M8, 0),
            NVL(PROD_OUTSTANDING_AMOUNT_M9, 0),
            NVL(PROD_OUTSTANDING_AMOUNT_M10, 0),
            NVL(PROD_OUTSTANDING_AMOUNT_M11, 0),
            NVL(PROD_OUTSTANDING_AMOUNT_M12, 0),
            NVL(PROD_OUTSTANDING_AMOUNT_M13, 0),
            NVL(PROD_OUTSTANDING_AMOUNT_M14, 0),
            NVL(PROD_OUTSTANDING_AMOUNT_M15, 0),
            NVL(PROD_OUTSTANDING_AMOUNT_M16, 0),
            NVL(PROD_OUTSTANDING_AMOUNT_M17, 0),
            NVL(PROD_OUTSTANDING_AMOUNT_M18, 0),
            NVL(PROD_OUTSTANDING_AMOUNT_M19, 0),
            NVL(PROD_OUTSTANDING_AMOUNT_M20, 0),
            NVL(PROD_OUTSTANDING_AMOUNT_M21, 0),
            NVL(PROD_OUTSTANDING_AMOUNT_M22, 0),
            NVL(PROD_OUTSTANDING_AMOUNT_M23, 0),
            NVL(PROD_OUTSTANDING_AMOUNT_M24, 0),
            NVL(PROD_ACCRUED_INT, 0),
            PROD_ADD_RATE * PROD_OUTSTANDING_AMOUNT_M0 / CASE WHEN PROD_OUTSTANDING_AMOUNT_M0 = 0 THEN 1 ELSE PROD_OUTSTANDING_AMOUNT_M0 END AS PROD_ADD_RATE ,
            NVL(PROD_BALLOON_AMOUNT, 0),
            NVL(PROD_BASIC_SALARY_AMOUNT, 0),
            PROD_BRANCH_SHOWROOM_ACC,                                         
            PROD_BRANCH_SHOWROOM_ACC_CODE,                                    
            PROD_BRANCH_SHOWROOM_CODE,                                        
            PROD_BUSINESS_POSITION,                                           
            PROD_CHANNEL_CODE,                                                
            NVL(PROD_CUR_BOOK_BAL, 0),
            NVL(PROD_CURR_PAY, 0),
            NVL(PROD_CURRENCY, 0),
            PROD_CUS_SUBTYPE,                                                 
            CUSTOMER_SEGMENT AS PROD_CUSTOMER_SEGMENT,                      
            NVL(PROD_DEBT_BURDEN_RATIO, 0),
            NVL(PROD_DEPENDENTS, 0),
            PROD_DEPT_CODE,                                                   
            NVL(PROD_DISBURSEMENT_AMOUNT, 0),
            NVL(PROD_DISBURSEMENT_DATE, TO_DATE('19000101','YYYYMMDD')),
            NVL(PROD_DOWNPAYMENT_AMT, 0),
            NVL(PROD_DURATION_IN_MONTH, 0),
            PROD_EMP_COMPANY,                                                 
            PROD_EMP_DEPARTMENT,                                              
            PROD_EMPLOYEE_TYPE,                                               
            PROD_EMPLOYER_CLASS_CODE,                                         
            NVL(PROD_EMPLOYER_ENGAGEMENT_DATE, TO_DATE('19000101','YYYYMMDD')),
            NVL(PROD_END_SERVICE_BENEFIT_AMT, 0),
            NVL(PROD_FEES, 0),
            NVL(PROD_FINANCE_AMT,0),
            NVL(PROD_FIRST_APPLICATION_DATE, TO_DATE('19000101','YYYYMMDD')),
            NVL(PROD_FIRST_APPROVAL_DATE, TO_DATE('19000101','YYYYMMDD')),
            NVL(PROD_FIRST_OPEN_DATE, TO_DATE('19000101','YYYYMMDD')),
            NVL(PROD_GROSS_SALARY, 0),
            NVL(PROD_INSTAL_AMT, 0),
            PROD_INSTAL_WITH_INSURANCE,                                       
            NVL(PROD_LAST_APPLICATION_DATE, TO_DATE('19000101','YYYYMMDD')),
            NVL(PROD_LAST_APPROVAL_DATE, TO_DATE('19000101','YYYYMMDD')),
            NVL(PROD_LAST_OPEN_DATE, TO_DATE('19000101','YYYYMMDD')),
            NVL(PROD_LAST_PAYMENT_DATE, TO_DATE('19000101','YYYYMMDD')),
            NVL(PROD_MATURE_DATE, TO_DATE('19000101','YYYYMMDD')),
            PROD_MILITARY_RANK,                                               
            NVL(PROD_MONTHLY_ALLOWANCE_AMT, 0),
            NVL(PROD_MONTHLY_OTHER_INCOME_AMT, 0),
            NVL(PROD_NET_BAL, 0),
            NVL(PROD_NEXT_PAY_DATE, TO_DATE('19000101','YYYYMMDD')),		
            NVL(PROD_NO_OF_DELINQ_INST, 0),
            NVL(PROD_ORIG_APPROVAL_AMT, 0),
            NVL(PROD_ORIG_BALANCE, 0),
            NVL(PROD_ORIG_PAY, 0),
            NVL(PROD_ORIG_PROFIT, 0),
            NVL(PROD_OTH_MONTHLY_DEDUCT_AMT, 0),
            NVL(PROD_OUTSTANDING_ACCRUAL_PFT, 0),
            NVL(PROD_OUTSTANDING_TOTAL_PFT, 0),
            NVL(PROD_PAYMENT_PRINCIPAL_AMT, 0),
            PRODUCT_TYPE  AS PROD_PRODUCT_CODE,                             
            PRODUCT_TYPE  AS PROD_PRODUCT_TYPE,                             
            PROD_PROFIT_RATE_SUB_TYPE,                                        
            NVL(PROD_RATE, 0),
            PROD_RELATION_CONTRACT_TYPE,                                      
            NVL(PROD_REMAIN_PAYMENTS, 0),
            NVL(PROD_REMAIN_TERM, 0),
            NVL(PROD_SALARY_TRANSFER_TYPE,'Others'),                                        
            PROD_SALARY_TRANSFER_TYPE_CTF,                                    
            PROD_SALES_BRANCH,                                                
            PROD_SALES_CD,                                                    
            PROD_SALES_USERID,                                                
            NVL(PROD_SUB_CODE, 0),
            NVL(PROD_TERM, 0),
            NVL(PROD_TOT_GRACE_PRD_PROFIT, 0),
            NVL(PROD_TOTAL_PAYMENTS, 0),
            NVL(PROD_TOTAL_EARLY_PAYMENT_AMT, 0),
            NVL(PROD_TOTAL_INSTALL_DUE_AMT, 0),
            NVL(PROD_TOTAL_NO_OPEN_CONTRACTS, 0),
            NULL AS PROD_SPARE_101,                                           
            NULL AS PROD_SPARE_102,                                           
            NULL AS PROD_SPARE_103,                                           
            NULL AS PROD_SPARE_104,                                           
            NULL AS PROD_SPARE_105,                                           
            NULL AS PROD_SPARE_106,                                           
            NULL AS PROD_SPARE_107,                                           
            NULL AS PROD_SPARE_108,                                           
            NULL AS PROD_SPARE_109,                                           
            NULL AS PROD_SPARE_110,                                           
            NULL AS PROD_SPARE_111,                                           
            NULL AS PROD_SPARE_112,                                           
            NULL AS PROD_SPARE_113,                                           
            NULL AS PROD_SPARE_114,                                           
            NULL AS PROD_SPARE_115,                                           
            NULL AS PROD_SPARE_116,                                           
            NULL AS PROD_SPARE_117,                                           
            NULL AS PROD_SPARE_118,                                           
            NULL AS PROD_SPARE_119,                                           
            NULL AS PROD_SPARE_120,                                           
            NVL(RESP_RL_COMMUNICATIONS, 0),
            NVL(RESP_RL_EDUCATION_FEES, 0),
            NVL(RESP_RL_FEES_ON_EXPATS, 0),
            NVL(RESP_RL_FOOD_BEVERAGES, 0),
            NVL(RESP_RL_HEALTHCARE, 0),
            NVL(RESP_RL_HOME_SERVANTS, 0),
            NVL(RESP_RL_HOUSING, 0),
            NVL(RESP_RL_OTHER_FUTURE_EXPENSES, 0),
            NVL(RESP_RL_OTHER_INCOME, 0),
            NVL(RESP_RL_OTHER_OBLIGATIONS, 0),
            NVL(RESP_RL_TOTAL_EXPENSES, 0),
            NVL(RESP_RL_TRANSPORT, 0),
            NVL(RESP_RL_UTILITIES, 0),
            NVL(CIC, 0)  AS SCOR_CIC ,
            NULL AS SCOR_CODE_01,                                             
            NULL AS SCOR_CODE_02,                                             
            NULL AS SCOR_CODE_03,                                             
            NULL AS SCOR_CODE_04,                                             
            NULL AS SCOR_CODE_05,                                             
            NULL AS SCOR_CODE_06,                                             
            NULL AS SCOR_CODE_07,                                             
            NULL AS SCOR_CODE_08,                                             
            NULL AS SCOR_CODE_09,                                             
            NULL AS SCOR_CODE_10,                                             
            SCOR_NATIONAL_ID,                                                 
            NVL(SCOR_PORTFOLIO_DATE, TO_DATE('19000101','YYYYMMDD')),
            'B'      AS SCOR_SCORING_REQUEST_TYPE,                            
            'B'      AS SCOR_SCORING_SOURCE,                                  
            NULL     AS SCOR_TRANSACTION_ID,                                  
            NVL(SIMAH_CARD_OUTSTANDING_BAL, 0),
            SIMAH_CARD_PRODUCT_CODE,                                          
            NVL(SIMAH_CARD_PRODUCT_LIMIT, 0),
            NVL(SIMAH_CONTRACTUAL_PAY_AUTO, 0),
            NVL(SIMAH_CONTRACTUAL_PAY_CRC, 0),
            NVL(SIMAH_CONTRACTUAL_PAY_MTG, 0),
            NVL(SIMAH_CONTRACTUAL_PAY_OTHER, 0),
            NVL(SIMAH_CONTRACTUAL_PAY_PLN, 0),
            SIMAH_CUR_WORST_DELINQ_AUTO,                                      
            SIMAH_CUR_WORST_DELINQ_CRC,                                       
            SIMAH_CUR_WORST_DELINQ_MTG,                                       
            SIMAH_CUR_WORST_DELINQ_OTHER,                                     
            SIMAH_CUR_WORST_DELINQ_PLN,                                       
            NVL(SIMAH_DEBT_BURDEN, 0),
            NVL(SIMAH_DEBT_BURDEN_RATIO, 0),
            NVL(SIMAH_NO_OF_BOUNCED_CHEQUE, 0),
            NVL(SIMAH_NO_OF_ENQUIRIES_12M, 0),
            NVL(SIMAH_NO_OF_ENQUIRIES_30D, 0),
            NVL(SIMAH_NO_OF_LOANS, 0),
            NVL(SIMAH_NO_OF_CI_DEFAULT_AUTO, 0),
            NVL(SIMAH_NO_OF_CI_DEFAULT_CRC, 0),
            NVL(SIMAH_NO_OF_CI_DEFAULT_MTG, 0),
            NVL(SIMAH_NO_OF_CI_DEFAULT_OTHER, 0),
            NVL(SIMAH_NO_OF_CI_DEFAULT_PLN, 0),
            NVL(SIMAH_NO_OF_DEFAULT_AUTO, 0),
            NVL(SIMAH_NO_OF_DEFAULT_CRC, 0),
            NVL(SIMAH_NO_OF_DEFAULT_MTG, 0),
            NVL(SIMAH_NO_OF_DEFAULT_OTHER, 0),
            NVL(SIMAH_NO_OF_DEFAULT_PLN, 0),
            NVL(SIMAH_NO_OF_EXEC_EXJUDG, 0),
            NVL(SIMAH_NO_OF_NOTEXEC_EXJUDG, 0),
            NVL(SIMAH_OUTSTAND_BAL_NOTEXJUDG, 0),
            NVL(SIMAH_SIMAH_SCORE, 0),
            SIMAH_SIMAH_SCORE_VERSION,                                        
            NVL(SIMAH_SUMMED_SALARY, 0),
            NVL(SIMAH_TOTAL_LIABILITIES, 0),
            NVL(SIMAH_TOTAL_LIMIT, 0),
            NVL(SIMAH_TOTAL_REVOLVING_LIAB, 0),
            NVL(SIMAH_TOTAL_REVOLVING_LIMIT, 0),
            SIMAH_WORST_DELINQ_24M_AUTO,
            SIMAH_WORST_DELINQ_24M_OTHER,
            SIMAH_WORST_DELINQ_24M_PLN,
            SIMAH_WORST_DELINQ_24M_CRC,
            SIMAH_WORST_DELINQ_24M_MTG,
            NULL AS SPARE_SPARE_01,
            NULL AS SPARE_SPARE_02,
            NULL AS SPARE_SPARE_03,
            NULL AS SPARE_SPARE_04,
            NULL AS SPARE_SPARE_05,
            NULL AS SPARE_SPARE_06,
            NULL AS SPARE_SPARE_07,
            NULL AS SPARE_SPARE_08,
            NULL AS SPARE_SPARE_09,
            NULL AS SPARE_SPARE_10,
            NULL AS SPARE_SPARE_11,
            NULL AS SPARE_SPARE_12,
            NULL AS SPARE_SPARE_13,
            NULL AS SPARE_SPARE_14,
            NULL AS SPARE_SPARE_15,
            NULL AS SPARE_SPARE_16,
            NULL AS SPARE_SPARE_17,
            NULL AS SPARE_SPARE_18,
            NULL AS SPARE_SPARE_19,
            NULL AS SPARE_SPARE_20,
            NULL AS SPARE_SPARE_21,
            NULL AS SPARE_SPARE_22,
            NULL AS SPARE_SPARE_23,
            NULL AS SPARE_SPARE_24,
            NULL AS SPARE_SPARE_25,
            NULL AS SPARE_SPARE_26,
            NULL AS SPARE_SPARE_27,
            NULL AS SPARE_SPARE_28,
            NULL AS SPARE_SPARE_29,
            NULL AS SPARE_SPARE_30,
            NULL AS SPARE_SPARE_31,
            NULL AS SPARE_SPARE_32,
            NULL AS SPARE_SPARE_33,
            NULL AS SPARE_SPARE_34,
            NULL AS SPARE_SPARE_35,
            NULL AS SPARE_SPARE_36,
            NULL AS SPARE_SPARE_37,
            NULL AS SPARE_SPARE_38,
            NULL AS SPARE_SPARE_39,
            NULL AS SPARE_SPARE_40,
            NULL AS SPARE_SPARE_41,
            NULL AS SPARE_SPARE_42,
            NULL AS SPARE_SPARE_43,
            NULL AS SPARE_SPARE_44,
            NULL AS SPARE_SPARE_45,
            NULL AS SPARE_SPARE_46,
            NULL AS SPARE_SPARE_47,
            NULL AS SPARE_SPARE_48,
            NULL AS SPARE_SPARE_49,
            NULL AS SPARE_SPARE_50
        FROM 
        (SELECT DISTINCT T1.RUN_ID, T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT, 
            FIRST_VALUE (T1.AVERAGE_BALANCE_MONTH_M0)       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS CASA_AVERAGE_BAL_MONTH_M0,
            FIRST_VALUE (T1.AVERAGE_BALANCE_MONTH_M1)       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS CASA_AVERAGE_BAL_MONTH_M1,
            FIRST_VALUE (T1.AVERAGE_BALANCE_MONTH_M2)       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS CASA_AVERAGE_BAL_MONTH_M2,
            FIRST_VALUE (T1.AVERAGE_BALANCE_MONTH_M3)       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS CASA_AVERAGE_BAL_MONTH_M3,
            FIRST_VALUE (T1.AVERAGE_BALANCE_MONTH_M4)       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS CASA_AVERAGE_BAL_MONTH_M4,
            FIRST_VALUE (T1.AVERAGE_BALANCE_MONTH_M5)       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS CASA_AVERAGE_BAL_MONTH_M5,
            FIRST_VALUE (T1.AVERAGE_BALANCE_MONTH_M6)       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS CASA_AVERAGE_BAL_MONTH_M6,
            FIRST_VALUE (T1.AVERAGE_BALANCE_MONTH_M7)       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS CASA_AVERAGE_BAL_MONTH_M7,
            FIRST_VALUE (T1.AVERAGE_BALANCE_MONTH_M8)       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS CASA_AVERAGE_BAL_MONTH_M8,
            FIRST_VALUE (T1.AVERAGE_BALANCE_MONTH_M9)       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS CASA_AVERAGE_BAL_MONTH_M9,
            FIRST_VALUE (T1.AVERAGE_BALANCE_MONTH_M10)      OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS CASA_AVERAGE_BAL_MONTH_M10,
            FIRST_VALUE (T1.AVERAGE_BALANCE_MONTH_M11)      OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS CASA_AVERAGE_BAL_MONTH_M11,
            FIRST_VALUE (T1.AVERAGE_BALANCE_MONTH_M12)      OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS CASA_AVERAGE_BAL_MONTH_M12,
            FIRST_VALUE (T1.AVERAGE_BALANCE_MONTH_M13)      OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS CASA_AVERAGE_BAL_MONTH_M13,
            FIRST_VALUE (T1.AVERAGE_BALANCE_MONTH_M14)      OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS CASA_AVERAGE_BAL_MONTH_M14,
            FIRST_VALUE (T1.AVERAGE_BALANCE_MONTH_M15)      OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS CASA_AVERAGE_BAL_MONTH_M15,
            FIRST_VALUE (T1.AVERAGE_BALANCE_MONTH_M16)      OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS CASA_AVERAGE_BAL_MONTH_M16,
            FIRST_VALUE (T1.AVERAGE_BALANCE_MONTH_M17)      OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS CASA_AVERAGE_BAL_MONTH_M17,
            FIRST_VALUE (T1.AVERAGE_BALANCE_MONTH_M18)      OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS CASA_AVERAGE_BAL_MONTH_M18,
            FIRST_VALUE (T1.AVERAGE_BALANCE_MONTH_M19)      OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS CASA_AVERAGE_BAL_MONTH_M19,
            FIRST_VALUE (T1.AVERAGE_BALANCE_MONTH_M20)      OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS CASA_AVERAGE_BAL_MONTH_M20,
            FIRST_VALUE (T1.AVERAGE_BALANCE_MONTH_M21)      OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS CASA_AVERAGE_BAL_MONTH_M21,
            FIRST_VALUE (T1.AVERAGE_BALANCE_MONTH_M22)      OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS CASA_AVERAGE_BAL_MONTH_M22,
            FIRST_VALUE (T1.AVERAGE_BALANCE_MONTH_M23)      OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS CASA_AVERAGE_BAL_MONTH_M23,
            FIRST_VALUE (T1.AVERAGE_BALANCE_MONTH_M24)      OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS CASA_AVERAGE_BAL_MONTH_M24,
            FIRST_VALUE (T1.CITY)                           OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS CUST_CITY,
            FIRST_VALUE (T1.CIVIL_STATUS)                   OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS CUST_CIVIL_STATUS,
            FIRST_VALUE (T1.DISTRICT_CODE)                  OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS CUST_DISTRICT_CODE,
            FIRST_VALUE (T1.EDUCATION_LEVEL)                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS CUST_EDUCATION_LEVEL,
            FIRST_VALUE (T1.GENDER)                         OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS CUST_GENDER,
            FIRST_VALUE (T1.HOUSE_OWNED_STATUS)             OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS CUST_HOUSE_OWNED_STATUS,
            FIRST_VALUE (T1.EMP_COMPANY)                    OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS CUST_LATEST_EMP_COMPANY,
            FIRST_VALUE (T1.EMP_DEPARTMENT)                 OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS CUST_LATEST_EMP_DEPARTMENT,
            FIRST_VALUE (T1.MARITAL_STATUS)                 OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS CUST_MARITAL_STATUS,
            FIRST_VALUE (T1.NATIONALITY)                    OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS CUST_NATIONALITY,
            FIRST_VALUE (T1.OCCUPATION_TYPE)                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS CUST_OCCUPATION_TYPE,
            FIRST_VALUE (T1.REGION)                         OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS CUST_REGION,
            FIRST_VALUE (T1.RESIDENT_STATUS)                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS CUST_RESIDENT_STATUS,
            FIRST_VALUE (T1.RESIDENT_TYPE)                  OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS CUST_RESIDENT_TYPE,
            FIRST_VALUE (T1.SALARY_TRANSFER_TYPE_CIF)       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS CUST_SALARY_TRANSFER_TYPE_CIF,    
            FIRST_VALUE (T1.ARMS_COLL_AREA)                 OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS PROD_ARMS_COLL_AREA,
            FIRST_VALUE (T1.ARMS_CONTRACT_NUMBER)           OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS PROD_ARMS_CONTRACT_NUMBER,    
            FIRST_VALUE (T1.ARMS_MITIGANT_CODE)             OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS PROD_ARMS_MITIGANT_CODE,
            FIRST_VALUE (T1.ARMS_MITIGANT_DESC)             OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS PROD_ARMS_MITIGANT_DESC,
            FIRST_VALUE (T1.ARMS_MITIGANT_VALUE_BY_OWNER)   OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS PROD_ARMS_MITIGANT_VAL_OWNER,
            FIRST_VALUE (T1.ARMS_PROPERTY_TYPE)             OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS PROD_ARMS_PROPERTY_TYPE,        
            FIRST_VALUE (T1.ARMS_COLL_AREA)                 OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS PROD_ARMS_REGION,
            FIRST_VALUE (T1.ARMS_VEHICLE_BRAND_NAME)        OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, M1.ARMS_VEHICLE_BRAND_CAT DESC NULLS LAST) AS PROD_ARMS_VEHICLE_BRAND_NAME,
            FIRST_VALUE (T1.ARMS_VEHICLE_BRAND_TYPE)        OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, M1.ARMS_VEHICLE_BRAND_CAT DESC NULLS LAST) AS PROD_ARMS_VEHICLE_BRAND_TYPE,
            FIRST_VALUE (M1.ARMS_VEHICLE_BRAND_CAT)         OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, M1.ARMS_VEHICLE_BRAND_CAT DESC NULLS LAST) AS PROD_ARMS_VEHICLE_BRAND_CAT,
            FIRST_VALUE (T1.BASIC_SALARY_AMOUNT)            OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS PROD_BASIC_SALARY_AMOUNT,
            FIRST_VALUE (T1.BRANCH_SHOWROOM_ACC)            OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS PROD_BRANCH_SHOWROOM_ACC,
            FIRST_VALUE (T1.BRANCH_SHOWROOM_ACCOUNT_CODE)   OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS PROD_BRANCH_SHOWROOM_ACC_CODE,
            FIRST_VALUE (T1.BRANCH_SHOWROOM_CODE)           OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS PROD_BRANCH_SHOWROOM_CODE,
            FIRST_VALUE (T1.BUSINESS_POSITION)              OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS PROD_BUSINESS_POSITION,
            FIRST_VALUE (T1.CHANNEL_CODE)                   OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS PROD_CHANNEL_CODE,
            FIRST_VALUE (T1.CURRENCY)                       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS PROD_CURRENCY,
            FIRST_VALUE (T1.CUS_SUBTYPE)                    OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS PROD_CUS_SUBTYPE,
            FIRST_VALUE (T1.DEBT_BURDEN_RATIO)              OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS PROD_DEBT_BURDEN_RATIO,
            FIRST_VALUE (T1.DEPENDENTS)                     OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS PROD_DEPENDENTS,
            FIRST_VALUE (T1.DEPT_CODE)                      OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS PROD_DEPT_CODE,
            FIRST_VALUE (T1.DURATION_IN_MONTH)              OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS PROD_DURATION_IN_MONTH,
            FIRST_VALUE (T1.EMP_COMPANY)                    OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS PROD_EMP_COMPANY,
            FIRST_VALUE (T1.EMP_DEPARTMENT)                 OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS PROD_EMP_DEPARTMENT,
            FIRST_VALUE (T1.EMPLOYEE_TYPE)                  OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS PROD_EMPLOYEE_TYPE,
            FIRST_VALUE (T1.EMPLOYER_CLASS_CODE)            OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS PROD_EMPLOYER_CLASS_CODE,
            FIRST_VALUE (T1.EMPLOYER_ENGAGEMENT_DT)         OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS PROD_EMPLOYER_ENGAGEMENT_DATE,
            FIRST_VALUE (T1.END_OF_SERVICE_BENEFIT_AMOUNT)  OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS PROD_END_SERVICE_BENEFIT_AMT,
            FIRST_VALUE (T1.GROSS_SALARY)                   OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS PROD_GROSS_SALARY,
            FIRST_VALUE (T1.MILITARY_RANK)                  OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS PROD_MILITARY_RANK,
            FIRST_VALUE (T1.MONTHLY_ALLOWANCE_AMOUNT)       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS PROD_MONTHLY_ALLOWANCE_AMT,
            FIRST_VALUE (T1.MONTHLY_OTHER_INCOME_AMOUNT)    OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS PROD_MONTHLY_OTHER_INCOME_AMT,
            FIRST_VALUE (T1.PROFIT_RATE_SUB_TYPE)           OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS PROD_PROFIT_RATE_SUB_TYPE,
            FIRST_VALUE (T1.RATE)                           OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS PROD_RATE,
            FIRST_VALUE (T1.RELATION_CONTRACT_TYPE)         OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS PROD_RELATION_CONTRACT_TYPE,
            FIRST_VALUE (T1.OTHER_MONTHLY_DEDUCTION_AMT)    OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS PROD_OTH_MONTHLY_DEDUCT_AMT,
            FIRST_VALUE (T1.SALARY_TRANSFER)                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS PROD_SALARY_TRANSFER_TYPE,
            FIRST_VALUE (T1.SALARY_TRANSFER)                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS PROD_SALARY_TRANSFER_TYPE_CTF,
            FIRST_VALUE (T1.SALES_BRANCH)                   OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS PROD_SALES_BRANCH,
            FIRST_VALUE (T1.SALES_CD)                       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS PROD_SALES_CD,
            FIRST_VALUE (T1.SALES_USERID)                   OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS PROD_SALES_USERID,
            FIRST_VALUE (T1.TOT_GRACE_PRD_PROFIT)           OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS PROD_TOT_GRACE_PRD_PROFIT,
            FIRST_VALUE (T1.RL_COMMUNICATIONS) 		        OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS RESP_RL_COMMUNICATIONS,
            FIRST_VALUE (T1.RL_EDUCATION_FEES) 		        OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS RESP_RL_EDUCATION_FEES,
            FIRST_VALUE (T1.RL_FEES_ON_EXPATS) 		        OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS RESP_RL_FEES_ON_EXPATS,
            FIRST_VALUE (T1.RL_FOOD_BEVERAGES) 		        OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS RESP_RL_FOOD_BEVERAGES,
            FIRST_VALUE (T1.RL_HEALTHCARE)     		        OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS RESP_RL_HEALTHCARE,
            FIRST_VALUE (T1.RL_HOME_SERVANTS)  		        OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS RESP_RL_HOME_SERVANTS,
            FIRST_VALUE (T1.RL_HOUSING)        		        OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS RESP_RL_HOUSING,
            FIRST_VALUE (T1.RL_OTHER_FUTURE_EXPENSES) 	    OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS RESP_RL_OTHER_FUTURE_EXPENSES,
            FIRST_VALUE (T1.RL_OTHER_INCOME)   		        OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS RESP_RL_OTHER_INCOME,
            FIRST_VALUE (T1.RL_OTHER_OBLIGATIONS) 		    OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS RESP_RL_OTHER_OBLIGATIONS,
            FIRST_VALUE (T1.RL_TOTAL_EXPENSES) 		        OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS RESP_RL_TOTAL_EXPENSES,
            FIRST_VALUE (T1.RL_TRANSPORT)      		        OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS RESP_RL_TRANSPORT,
            FIRST_VALUE (T1.RL_UTILITIES)       		    OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS RESP_RL_UTILITIES,
            FIRST_VALUE (T1.NATIONAL_ID)                    OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SCOR_NATIONAL_ID,
            FIRST_VALUE (T1.RUN_DATE)                       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SCOR_PORTFOLIO_DATE,    
            FIRST_VALUE (T1.CARD_OUTSTANDING_BALANCE)       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_CARD_OUTSTANDING_BAL,
            FIRST_VALUE (T1.CARD_PRODUCT_CODE)              OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_CARD_PRODUCT_CODE,
            FIRST_VALUE (T1.CARD_PRODUCT_LIMIT)             OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_CARD_PRODUCT_LIMIT,
            FIRST_VALUE (T1.CONTRACTUAL_PAYMENT_AUTO)       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_CONTRACTUAL_PAY_AUTO,
            FIRST_VALUE (T1.CONTRACTUAL_PAYMENT_CRC)        OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_CONTRACTUAL_PAY_CRC,
            FIRST_VALUE (T1.CONTRACTUAL_PAYMENT_MTG)        OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_CONTRACTUAL_PAY_MTG,
            FIRST_VALUE (T1.CONTRACTUAL_PAYMENT_OTHER)      OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_CONTRACTUAL_PAY_OTHER,
            FIRST_VALUE (T1.CONTRACTUAL_PAYMENT_PLN)        OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_CONTRACTUAL_PAY_PLN,
            FIRST_VALUE (T1.CURRENT_WORST_DELINQUENT_AUTO)  OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_CUR_WORST_DELINQ_AUTO,
            FIRST_VALUE (T1.CURRENT_WORST_DELINQUENT_CRC)   OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_CUR_WORST_DELINQ_CRC,
            FIRST_VALUE (T1.CURRENT_WORST_DELINQUENT_MTG)   OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_CUR_WORST_DELINQ_MTG,
            FIRST_VALUE (T1.CURRENT_WORST_DELINQUENT_OTHER) OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_CUR_WORST_DELINQ_OTHER,
            FIRST_VALUE (T1.CURRENT_WORST_DELINQUENT_PLN)   OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_CUR_WORST_DELINQ_PLN,
            FIRST_VALUE (T1.DEBT_BURDEN)                    OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_DEBT_BURDEN,
            FIRST_VALUE (T1.DEBT_BURDEN_RATIO)              OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_DEBT_BURDEN_RATIO,
            FIRST_VALUE (T1.NO_OF_BOUNCED_CHEQUE)           OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_NO_OF_BOUNCED_CHEQUE,
            FIRST_VALUE (T1.NO_OF_ENQUIRIES_12M)            OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_NO_OF_ENQUIRIES_12M,
            FIRST_VALUE (T1.NO_OF_ENQUIRIES_30D)            OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_NO_OF_ENQUIRIES_30D,
            FIRST_VALUE (T1.NO_OF_LOANS)                    OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_NO_OF_LOANS,
            FIRST_VALUE (T1.NUMBER_OF_CI_DEFAULT_AUTO)      OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_NO_OF_CI_DEFAULT_AUTO,
            FIRST_VALUE (T1.NUMBER_OF_CI_DEFAULT_CRC)       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_NO_OF_CI_DEFAULT_CRC,
            FIRST_VALUE (T1.NUMBER_OF_CI_DEFAULT_MTG)       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_NO_OF_CI_DEFAULT_MTG,
            FIRST_VALUE (T1.NUMBER_OF_CI_DEFAULT_OTHER)     OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_NO_OF_CI_DEFAULT_OTHER,
            FIRST_VALUE (T1.NUMBER_OF_CI_DEFAULT_PLN)       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_NO_OF_CI_DEFAULT_PLN,
            FIRST_VALUE (T1.NUMBER_OF_DEFAULT_AUTO)         OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_NO_OF_DEFAULT_AUTO,
            FIRST_VALUE (T1.NUMBER_OF_DEFAULT_CRC)          OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_NO_OF_DEFAULT_CRC,
            FIRST_VALUE (T1.NUMBER_OF_DEFAULT_MTG)          OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_NO_OF_DEFAULT_MTG,
            FIRST_VALUE (T1.NUMBER_OF_DEFAULT_OTHER)        OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_NO_OF_DEFAULT_OTHER,
            FIRST_VALUE (T1.NUMBER_OF_DEFAULT_PLN)          OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_NO_OF_DEFAULT_PLN,
            FIRST_VALUE (T1.NUMBER_OF_EXECUTED_EXJUDG)      OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_NO_OF_EXEC_EXJUDG,
            FIRST_VALUE (T1.NUMBER_OF_NOT_EXECUTED_EXJUDG)  OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_NO_OF_NOTEXEC_EXJUDG,
            FIRST_VALUE (T1.OUTSTANDING_BALANCE_NOTEXJUDG)  OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_OUTSTAND_BAL_NOTEXJUDG,
            FIRST_VALUE (T1.SIMAH_SCORE)                    OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_SIMAH_SCORE,
            FIRST_VALUE (T1.SIMAH_SCORE_VERSION)            OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_SIMAH_SCORE_VERSION,
            FIRST_VALUE (T1.SUMMED_SALARY)                  OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_SUMMED_SALARY,
            FIRST_VALUE (T1.TOTAL_LIABILITIES)              OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_TOTAL_LIABILITIES,
            FIRST_VALUE (T1.TOTAL_LIMIT)                    OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_TOTAL_LIMIT,
            FIRST_VALUE (T1.TOTAL_REVOLVING_LIAB)           OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_TOTAL_REVOLVING_LIAB,
            FIRST_VALUE (T1.TOTAL_REVOLVING_LIMIT)          OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_TOTAL_REVOLVING_LIMIT,
            FIRST_VALUE (T1.WORST_DELINQUENT_24M_AUTO)      OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_WORST_DELINQ_24M_AUTO,
            FIRST_VALUE (T1.WORST_DELINQUENT_24M_OTHER)     OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_WORST_DELINQ_24M_OTHER,
            FIRST_VALUE (T1.WORST_DELINQUENT_24M_PLN)       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_WORST_DELINQ_24M_PLN,
            FIRST_VALUE (T1.WORST_DELINQUENT_24M_CRC)       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_WORST_DELINQ_24M_CRC,
            FIRST_VALUE (T1.WORST_DELINQUENT_24M_MTG)       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT ORDER BY T1.OPEN_DATE DESC, TO_NUMBER(T1.CONTRACT_NUMBER) DESC) AS SIMAH_WORST_DELINQ_24M_MTG,
            MAX(T1.CIC_OPEN_DATE)                           OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS CUST_CIC_OPEN_DATE,
            MAX(T1.DATE_OF_BIRTH)                           OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS CUST_DATE_OF_BIRTH,
            MAX(T1.NUMBER_OF_CARS)                          OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS CUST_NUMBER_OF_CARS,
            SUM(T1.ARMS_BOOK_VALUE)                         OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_ARMS_BOOK_VALUE,
            MAX(T1.ARMS_MANUFACTURE_YEAR)                   OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_ARMS_MANUFACTURE_YEAR,
            SUM(T1.ARMS_MITIGANT_VALUE )                    OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_ARMS_MITIGANT_VALUE,
            SUM(T1.ARMS_PROPERTY_EVAL_STATUS)               OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_ARMS_PROP_EVAL_STATUS,
            SUM(T1.ARMS_VALUATION_DIFF)                     OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_ARMS_VALUATION_DIFF,
            MAX(T1.ARMS_VEHICLE_MANUFACTURE_YEAR)           OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_ARMS_VEHI_MANUFACT_YEAR,  
            SUM(T1.DELINQ_AMOUNT_M0)                        OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_AMOUNT_M0,
            SUM(T1.DELINQ_AMOUNT_M1)                        OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_AMOUNT_M1,
            SUM(T1.DELINQ_AMOUNT_M2)                        OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_AMOUNT_M2,
            SUM(T1.DELINQ_AMOUNT_M3)                        OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_AMOUNT_M3,
            SUM(T1.DELINQ_AMOUNT_M4)                        OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_AMOUNT_M4,
            SUM(T1.DELINQ_AMOUNT_M5)                        OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_AMOUNT_M5,
            SUM(T1.DELINQ_AMOUNT_M6)                        OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_AMOUNT_M6,
            SUM(T1.DELINQ_AMOUNT_M7)                        OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_AMOUNT_M7,
            SUM(T1.DELINQ_AMOUNT_M8)                        OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_AMOUNT_M8,
            SUM(T1.DELINQ_AMOUNT_M9)                        OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_AMOUNT_M9,
            SUM(T1.DELINQ_AMOUNT_M10)                       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_AMOUNT_M10,
            SUM(T1.DELINQ_AMOUNT_M11)                       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_AMOUNT_M11,
            SUM(T1.DELINQ_AMOUNT_M12)                       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_AMOUNT_M12,
            SUM(T1.DELINQ_AMOUNT_M13)                       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_AMOUNT_M13,
            SUM(T1.DELINQ_AMOUNT_M14)                       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_AMOUNT_M14,
            SUM(T1.DELINQ_AMOUNT_M15)                       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_AMOUNT_M15,
            SUM(T1.DELINQ_AMOUNT_M16)                       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_AMOUNT_M16,
            SUM(T1.DELINQ_AMOUNT_M17)                       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_AMOUNT_M17,
            SUM(T1.DELINQ_AMOUNT_M18)                       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_AMOUNT_M18,
            SUM(T1.DELINQ_AMOUNT_M19)                       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_AMOUNT_M19,
            SUM(T1.DELINQ_AMOUNT_M20)                       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_AMOUNT_M20,
            SUM(T1.DELINQ_AMOUNT_M21)                       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_AMOUNT_M21,
            SUM(T1.DELINQ_AMOUNT_M22)                       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_AMOUNT_M22,
            SUM(T1.DELINQ_AMOUNT_M23)                       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_AMOUNT_M23,
            SUM(T1.DELINQ_AMOUNT_M24)                       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_AMOUNT_M24,
            MAX(T1.DELINQ_DAYS_M0)                          OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_DAYS_M0,
            MAX(T1.DELINQ_DAYS_M1)                          OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_DAYS_M1,
            MAX(T1.DELINQ_DAYS_M2)                          OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_DAYS_M2,
            MAX(T1.DELINQ_DAYS_M3)                          OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_DAYS_M3,
            MAX(T1.DELINQ_DAYS_M4)                          OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_DAYS_M4,
            MAX(T1.DELINQ_DAYS_M5)                          OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_DAYS_M5,
            MAX(T1.DELINQ_DAYS_M6)                          OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_DAYS_M6,
            MAX(T1.DELINQ_DAYS_M7)                          OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_DAYS_M7,
            MAX(T1.DELINQ_DAYS_M8)                          OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_DAYS_M8,
            MAX(T1.DELINQ_DAYS_M9)                          OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_DAYS_M9,
            MAX(T1.DELINQ_DAYS_M10)                         OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_DAYS_M10,
            MAX(T1.DELINQ_DAYS_M11)                         OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_DAYS_M11,
            MAX(T1.DELINQ_DAYS_M12)                         OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_DAYS_M12,
            MAX(T1.DELINQ_DAYS_M13)                         OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_DAYS_M13,
            MAX(T1.DELINQ_DAYS_M14)                         OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_DAYS_M14,
            MAX(T1.DELINQ_DAYS_M15)                         OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_DAYS_M15,
            MAX(T1.DELINQ_DAYS_M16)                         OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_DAYS_M16,
            MAX(T1.DELINQ_DAYS_M17)                         OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_DAYS_M17,
            MAX(T1.DELINQ_DAYS_M18)                         OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_DAYS_M18,
            MAX(T1.DELINQ_DAYS_M19)                         OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_DAYS_M19,
            MAX(T1.DELINQ_DAYS_M20)                         OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_DAYS_M20,
            MAX(T1.DELINQ_DAYS_M21)                         OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_DAYS_M21,
            MAX(T1.DELINQ_DAYS_M22)                         OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_DAYS_M22,
            MAX(T1.DELINQ_DAYS_M23)                         OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_DAYS_M23,
            MAX(T1.DELINQ_DAYS_M24)                         OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DELINQ_DAYS_M24,
            SUM(T1.EMI_M0)   					            OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_EMI_M0,
            SUM(T1.EMI_M1)   					            OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_EMI_M1,
            SUM(T1.EMI_M2)   					            OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_EMI_M2,
            SUM(T1.EMI_M3)   					            OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_EMI_M3,
            SUM(T1.EMI_M4)   					            OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_EMI_M4,
            SUM(T1.EMI_M5)   					            OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_EMI_M5,
            SUM(T1.EMI_M6)     				                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_EMI_M6,
            SUM(T1.EMI_M7)     				                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_EMI_M7,
            SUM(T1.EMI_M8)     				                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_EMI_M8,
            SUM(T1.EMI_M9)     				                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_EMI_M9,
            SUM(T1.EMI_M10)    				                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_EMI_M10,
            SUM(T1.EMI_M11)    				                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_EMI_M11,
            SUM(T1.EMI_M12)    				                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_EMI_M12,
            SUM(T1.EMI_M13)    				                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_EMI_M13,
            SUM(T1.EMI_M14)    				                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_EMI_M14,
            SUM(T1.EMI_M15)    				                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_EMI_M15,
            SUM(T1.EMI_M16)    				                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_EMI_M16,
            SUM(T1.EMI_M17)    				                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_EMI_M17,
            SUM(T1.EMI_M18)    				                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_EMI_M18,
            SUM(T1.EMI_M19)    				                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_EMI_M19,
            SUM(T1.EMI_M20)    				                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_EMI_M20,
            SUM(T1.EMI_M21)    				                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_EMI_M21,
            SUM(T1.EMI_M22)    				                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_EMI_M22,
            SUM(T1.EMI_M23)    				                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_EMI_M23,
            SUM(T1.EMI_M24)    				                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_EMI_M24,
            SUM(T1.OUTSTANDING_AMOUNT_M0) 		            OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_OUTSTANDING_AMOUNT_M0,
            SUM(T1.OUTSTANDING_AMOUNT_M1) 		            OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_OUTSTANDING_AMOUNT_M1,
            SUM(T1.OUTSTANDING_AMOUNT_M2) 		            OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_OUTSTANDING_AMOUNT_M2,
            SUM(T1.OUTSTANDING_AMOUNT_M3) 		            OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_OUTSTANDING_AMOUNT_M3,
            SUM(T1.OUTSTANDING_AMOUNT_M4) 		            OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_OUTSTANDING_AMOUNT_M4,
            SUM(T1.OUTSTANDING_AMOUNT_M5) 		            OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_OUTSTANDING_AMOUNT_M5,
            SUM(T1.OUTSTANDING_AMOUNT_M6) 		            OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_OUTSTANDING_AMOUNT_M6,
            SUM(T1.OUTSTANDING_AMOUNT_M7) 		            OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_OUTSTANDING_AMOUNT_M7,
            SUM(T1.OUTSTANDING_AMOUNT_M8) 		            OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_OUTSTANDING_AMOUNT_M8,
            SUM(T1.OUTSTANDING_AMOUNT_M9) 		            OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_OUTSTANDING_AMOUNT_M9,
            SUM(T1.OUTSTANDING_AMOUNT_M10) 	                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_OUTSTANDING_AMOUNT_M10,
            SUM(T1.OUTSTANDING_AMOUNT_M11) 	                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_OUTSTANDING_AMOUNT_M11,
            SUM(T1.OUTSTANDING_AMOUNT_M12) 	                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_OUTSTANDING_AMOUNT_M12,
            SUM(T1.OUTSTANDING_AMOUNT_M13) 	                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_OUTSTANDING_AMOUNT_M13,
            SUM(T1.OUTSTANDING_AMOUNT_M14) 	                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_OUTSTANDING_AMOUNT_M14,
            SUM(T1.OUTSTANDING_AMOUNT_M15) 	                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_OUTSTANDING_AMOUNT_M15,
            SUM(T1.OUTSTANDING_AMOUNT_M16) 	                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_OUTSTANDING_AMOUNT_M16,
            SUM(T1.OUTSTANDING_AMOUNT_M17) 	                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_OUTSTANDING_AMOUNT_M17,
            SUM(T1.OUTSTANDING_AMOUNT_M18) 	                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_OUTSTANDING_AMOUNT_M18,
            SUM(T1.OUTSTANDING_AMOUNT_M19) 	                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_OUTSTANDING_AMOUNT_M19,
            SUM(T1.OUTSTANDING_AMOUNT_M20) 	                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_OUTSTANDING_AMOUNT_M20,
            SUM(T1.OUTSTANDING_AMOUNT_M21) 	                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_OUTSTANDING_AMOUNT_M21,
            SUM(T1.OUTSTANDING_AMOUNT_M22) 	                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_OUTSTANDING_AMOUNT_M22,
            SUM(T1.OUTSTANDING_AMOUNT_M23) 	                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_OUTSTANDING_AMOUNT_M23,
            SUM(T1.OUTSTANDING_AMOUNT_M24) 	                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_OUTSTANDING_AMOUNT_M24,   
            SUM(T1.ACCRUED_INT) 	                        OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_ACCRUED_INT,
            SUM(T1.BALLOON_AMOUNT)                          OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_BALLOON_AMOUNT,
            SUM(T1.CUR_BOOK_BAL)                            OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_CUR_BOOK_BAL,
            SUM(T1.CURR_PAY)                                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_CURR_PAY,
            SUM(T1.DISBURSEMENT_AMOUNT)                     OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DISBURSEMENT_AMOUNT,
            MAX(T1.DISBURSEMENT_DATE)                       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DISBURSEMENT_DATE,
            SUM(T1.DOWNPAYMENT_AMT)                         OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_DOWNPAYMENT_AMT,
            SUM(T1.FEES)                                    OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_FEES,
            SUM(T1.FINANCE_AMT)                             OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_FINANCE_AMT,
            MIN(T1.APPLICATION_DATE)                        OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_FIRST_APPLICATION_DATE,
            MIN(T1.APPROVAL_DATE)                           OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_FIRST_APPROVAL_DATE,
            MIN(T1.OPEN_DATE)                               OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_FIRST_OPEN_DATE,
            SUM(T1.INSTAL_AMT)                              OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_INSTAL_AMT,
            SUM(T1.INSTALMENT_WITH_INSURANCE)               OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_INSTAL_WITH_INSURANCE,
            MAX(T1.APPLICATION_DATE)                        OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_LAST_APPLICATION_DATE,
            MAX(T1.APPROVAL_DATE)                           OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_LAST_APPROVAL_DATE,
            MAX(T1.OPEN_DATE)                               OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_LAST_OPEN_DATE,
            MAX(T1.LAST_PAYMENT)                            OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_LAST_PAYMENT_DATE,
            MAX(T1.MATURE_DATE)                             OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_MATURE_DATE,
            SUM(T1.NET_BAL)                                 OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_NET_BAL,
            MIN(T1.NEXT_PAY)                                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_NEXT_PAY_DATE,
            SUM(T1.NO_OF_DELINQ_INST)                       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_NO_OF_DELINQ_INST,
            SUM(T1.ORIG_APPROVAL_AMT)                       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_ORIG_APPROVAL_AMT,
            SUM(T1.ORIG_BALANCE)                            OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_ORIG_BALANCE,
            SUM(T1.ORIG_PAY)                                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_ORIG_PAY,
            SUM(T1.ORIG_PROFIT)                             OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_ORIG_PROFIT,
            SUM(T1.OUTSTANDING_WITH_ACCRUAL_PFT)            OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_OUTSTANDING_ACCRUAL_PFT,
            SUM(T1.OUTSTANDING_WITH_TOTAL_PROFIT)           OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_OUTSTANDING_TOTAL_PFT,
            SUM(T1.PAYMENT_PRINCIPAL_AMT)                   OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_PAYMENT_PRINCIPAL_AMT,
            SUM(T1.REMAIN_PAYMENTS)                         OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_REMAIN_PAYMENTS,
            MAX(T1.REMAIN_TERM)                             OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_REMAIN_TERM,
            MAX(T1.TERM)                                    OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_TERM,
            SUM(T1.TOTAL_PAYMENTS)                          OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_TOTAL_PAYMENTS,
            SUM(T1.TOTAL_EARLY_PAYMENT_AMT)                 OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_TOTAL_EARLY_PAYMENT_AMT,
            SUM(T1.TOTAL_INSTALLMENT_DUE_AMT)               OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_TOTAL_INSTALL_DUE_AMT,
            MAX(T1.SUB_CODE)                                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_SUB_CODE,
            SUM(T1.ADD_RATE)                                OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_ADD_RATE,
            COUNT (*)                                       OVER (PARTITION BY T1.CIC )                                      AS CUST_TOT_NO_ACTIVE_CONTRACTS,
            COUNT (*)                                       OVER (PARTITION BY T1.CIC, M1.PRODUCT_TYPE, M1.CUSTOMER_SEGMENT) AS PROD_TOTAL_NO_OPEN_CONTRACTS
        FROM STG_SCORE_REQUEST T1, B_SCORE_TEMP M1
        WHERE       T1.CIC             = M1.CIC
                AND T1.CONTRACT_NUMBER = M1.CONTRACT_NUMBER );

        V_ROWCOUNT := V_ROWCOUNT + SQL%ROWCOUNT;
    EXCEPTION    
        WHEN OTHERS THEN
            V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                          SQLERRM || ' -- Error in inserting data into B_SCORE_REQUEST -- STOPPED';
            DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
            PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,V_RUN_ID);
            P_STATUS := 1;
            RETURN;
    END;
      --  Logging the completion of inserting data into B_SCORE_REQUEST 
      V_LOG_MSG := 'Records are successfully inserted into B_SCORE_REQUEST, RECORD_COUNT = ' || V_ROWCOUNT ;
      DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
      PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'I',NULL,V_LOG_MSG,V_RUN_ID);
      COMMIT;
      V_ROWCOUNT := 0;        
    --  Inserting data into B_SCORE_REQUEST -- END

    --  Updating aggregation completion flag in APP_PARAM for B-SCORE -- START   
    BEGIN
        UPDATE  APP_PARAM 
        SET     ATTRIBUTE_VALUE_C2 = 1                
        WHERE   PARAM_CODE = 'AGG_COMPLETE';        
    EXCEPTION 
        WHEN OTHERS THEN
        V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                      SQLERRM || ' -- Error in updating aggregation completion flag in APP_PARAM table for B-SCORE -- STOPPED';
        DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
        PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,V_RUN_ID);
    END;
    --  Updating aggregation completion flag in APP_PARAM for B-SCORE -- END
    COMMIT;

EXCEPTION
  WHEN OTHERS THEN
    V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '|| 
                  SQLERRM ||' -- Error in LOAD_B_SCORE_REQUEST -- ROLLBACKED';
    DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
    PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,V_RUN_ID);
    ROLLBACK;      
    P_STATUS := 1;   
END LOAD_B_SCORE_REQUEST;

---------------------------------------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------------------------------------------


PROCEDURE LOAD_LGD_REQUEST (P_STATUS OUT NUMBER) AS
    /******************************************************************************
    NAME:    LOAD_LGD_REQUEST
    PURPOSE: Insert Data into LGD_REQUEST table.
    COMPANY: EJADA SYSTEMS

    REVISIONS:
    Version   Date        Author
    --------- ----------- ---------------
    1.0       3-APRIL-2022  msfarghaly@ejada.com

    ******************************************************************************/
    --  General use variable declaration
    V_ROWCOUNT                                        NUMBER(9)         := 0;
    V_LOG_MSG                                         VARCHAR2(1000)    := NULL;
    V_LOG_PARAM                                       VARCHAR2(250)     := NULL;
    V_PROCEDURE_NAME                                  VARCHAR(32)       := 'LOAD_LGD_REQUEST';
    V_PACKAGE_NAME                                    VARCHAR(32)       := 'DATA_LOAD';
    V_SQL_STMT                                        CLOB;
    V_RUN_ID                                          NUMBER := 0;
    -------------------------------------------------------------------------------
BEGIN
    --  Inserting data into LOAD_LGD_REQUEST -- START
        P_STATUS := 0;

        BEGIN
            SELECT NVL(MAX(RUN_ID),0) INTO V_RUN_ID FROM STG_SCORE_REQUEST;
        EXCEPTION
            WHEN OTHERS THEN
            V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                          SQLERRM || ' -- Error in fetching RUN_ID from STG_SCORE_REQUEST table -- STOPPED';
            DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
            PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,V_RUN_ID);
        END;

        BEGIN
            V_SQL_STMT := 'TRUNCATE TABLE LGD_TEMP';
            EXECUTE IMMEDIATE V_SQL_STMT;
        EXCEPTION
            WHEN OTHERS THEN
            V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                          SQLERRM || ' -- Error in truncating LGD_TEMP table -- STOPPED';
            DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
            PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,V_RUN_ID);
        END;

        BEGIN
            INSERT INTO   LGD_TEMP
            SELECT DISTINCT T3.CONTRACT_NUMBER, P.PRODUCT_TYPE, T3.PRODUCT_CODE,
                    ( SELECT CUSTOMER_SEGMENT FROM ST_MAPPING S3
                        WHERE
                            (S3.PRODUCT_CODE = T3.PRODUCT_CODE AND S3.SALATRY_TRANSFER_TYPE_CTF = T3.SALARY_TRANSFER)
                          OR(S3.PRODUCT_CODE = T3.PRODUCT_CODE AND S3.SALATRY_TRANSFER_TYPE_CTF = 'Others' AND NVL(T3.SALARY_TRANSFER,'XYZ') NOT IN (SELECT S1.SALATRY_TRANSFER_TYPE_CTF FROM ST_MAPPING S1 WHERE S1.PRODUCT_CODE = T3.PRODUCT_CODE ) )
                          OR(S3.SALATRY_TRANSFER_TYPE_CTF = T3.SALARY_TRANSFER AND S3.PRODUCT_CODE = 'Others' AND NVL(T3.PRODUCT_CODE,'XYZ') NOT IN (SELECT S2.PRODUCT_CODE FROM ST_MAPPING S2 WHERE S2.SALATRY_TRANSFER_TYPE_CTF = T3.SALARY_TRANSFER ) )
                          OR(S3.SALATRY_TRANSFER_TYPE_CTF = 'Others' AND S3.PRODUCT_CODE = 'Others'  AND NVL(T3.SALARY_TRANSFER,'XYZ') NOT IN (SELECT SALATRY_TRANSFER_TYPE_CTF FROM ST_MAPPING )
                          AND NVL(T3.PRODUCT_CODE,'XYZ') NOT IN (SELECT PRODUCT_CODE FROM ST_MAPPING ) )) CUSTOMER_SEGMENT
                    FROM
                    STG_SCORE_REQUEST T3 , PRODUCT P
                    WHERE
                    T3.PRODUCT_CODE   = P.PRODUCT_CODE;
                    --AND T3.OPEN_DATE >= ADD_MONTHS(T3.RUN_DATE,-12) ;
        EXCEPTION
            WHEN OTHERS THEN
            V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                          SQLERRM || ' -- Error in populating A_SCORE_TEMP table -- STOPPED';
            DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
            PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,V_RUN_ID);
        END;

        BEGIN
            INSERT INTO LGD_REQUEST (
           REQUEST_ID,
                RUN_ID,
                PROCESS_STATUS,
                CONT_ACCOUNT_ID,
				CASHFLOW_DATE,
				CONT_OPEN_DATE,
				CONT_DISBURSEMENT_AMOUNT,
				CONT_PRINCIPAL_OUTSTANDING,
				MILITARY_RANK,
				CONT_DURATION_OF_CONTARCT,
				CONT_PRICE_AT_ORIGINATION,
				CAR_MAKE_YEAR,
				PROPERTY_VALUE_ACQUISITION,
				CONT_DURATION_MONTHS,
				PRODUCT_CODE,
				SALARY_TRANSFER_TYPE,
				CONT_CONTRACT_NUMBER,
				CIC,
				CONT_BALLOON_PAYMENT,
				CONT_DOWN_PAYMENT
				)
            SELECT
                LGD_REQUEST_ID_SEQ.NEXTVAL   		                            AS REQUEST_ID,
                RUN_ID                                                          AS RUN_ID,
                NULL                                                            AS PROCESS_STATUS,
                S.ACCOUNT_1                                                     AS CONT_ACCOUNT_ID,
				NVL(S.RUN_DATE, TO_DATE('19000101','YYYYMMDD')) 		        AS CONT_CASHFLOW_DATE,
				NVL(S.OPEN_DATE, TO_DATE('19000101','YYYYMMDD')) 		        AS CONT_OPEN_DATE,
				NVL (NVL (S.DISBURSEMENT_AMOUNT, S.Orig_Approval_Amt), 0)       AS CONT_DISBURSEMENT_AMOUNT,
				NVL(S.PRINCIPAL_OUTSTANDING,0)                                  AS CONT_PRINCIPAL_OUTSTANDING,
				S.MILITARY_RANK                                                 AS CONT_MILITARY_RANK,
				S.DURATION_IN_MONTH                                             AS CONT_DURATION_OF_THE_CONTARCT,
				NVL(S.ARMS_MITIGANT_VALUE_BY_OWNER,0)                           AS CONT_PRICE_AT_ORIGINATION,
				NVL (NVL (S.ARMS_VEHICLE_MANUFACTURE_YEAR,TO_CHAR (S.OPEN_DATE, 'YYYY')), 0) AS CONT_CAR_MAKES_YEAR,
				NVL(S.ARMS_MITIGANT_VALUE_BY_OWNER,0)                           AS CONT_PROPERTY_VALUE_ACQUISITION,
				NVL(S.DURATION_IN_MONTH,0)                                      AS CONT_DURATION_IN_MONTH,
				S.PRODUCT_CODE                                                  AS CONT_PRODUCT_CODE,
				S.SALARY_TRANSFER_TYPE                                          AS CONT_SALARY_TRANSFER_TYPE,
				S.CONTRACT_NUMBER                                               AS CONT_CONTRACT_NUMBER,
				NVL(S.CIC,0)									                AS CONT_CIC,
				NVL(S.BALLOON_AMOUNT,0)                                         AS CONT_BALLOON_PAYMENT,
				NVL(S.DOWNPAYMENT_AMT,0)                                        AS CONT_DOWN_PAYMENT
        FROM    STG_SCORE_REQUEST S, LGD_TEMP M
        WHERE   S.CONTRACT_NUMBER = M.CONTRACT_NUMBER;

        V_ROWCOUNT := V_ROWCOUNT + SQL%ROWCOUNT;
    EXCEPTION 
        WHEN OTHERS THEN
        V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                      SQLERRM || ' -- Error in inserting data into LGD_REQUEST -- STOPPED';
        DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
        PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,V_RUN_ID);
        P_STATUS := 1;
        RETURN;
    END;

    --  Logging the completion of inserting data into LGD_REQUEST 
    V_LOG_MSG := 'Records are successfully inserted into LGD_REQUEST, RECORD_COUNT = ' || V_ROWCOUNT ;
    DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
    PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'I',NULL,V_LOG_MSG,V_RUN_ID);
    COMMIT;
    V_ROWCOUNT := 0;
    --  Inserting data into LGD_REQUEST -- END

    --  Updating aggregation completion flag in APP_PARAM for LGD -- START   
    BEGIN
        UPDATE  APP_PARAM 
        SET     ATTRIBUTE_VALUE_C3 = 1                
        WHERE   PARAM_CODE = 'AGG_COMPLETE';        
    EXCEPTION 
        WHEN OTHERS THEN
        V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                      SQLERRM || ' -- Error in updating aggregation completion flag in APP_PARAM table for LGD -- STOPPED';
        DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
        PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,V_RUN_ID);
    END;
    --  Updating aggregation completion flag in APP_PARAM for LGD -- END
    COMMIT;

EXCEPTION
  WHEN OTHERS THEN
    V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                  SQLERRM ||' -- Error in LOAD_LGD_REQUEST -- ROLLBACKED';
    DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
    PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,V_RUN_ID);
    ROLLBACK;
    P_STATUS := 1;
END LOAD_LGD_REQUEST;
---------------------------------------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------------------------------------------


PROCEDURE MOVE_DATA_STG_SCORE_REQUEST (P_STATUS OUT NUMBER) AS
    /******************************************************************************
    NAME:    MOVE_DATA_STG_SCORE_REQUEST
    PURPOSE: Move data from STG_SCORE_REQUEST to STG_SCORE_REQUES_HIST.
    COMPANY: EJADA SYSTEMS

    REVISIONS:
    Version   Date        Author
    --------- ----------- ---------------
    1.0       24-AUG-2020  mgebba@ejada.com

    ******************************************************************************/
    --  General use variable declaration
    V_ROWCOUNT                                        NUMBER(9)         := 0;
    V_LOG_MSG                                         VARCHAR2(1000)    := NULL;
    V_LOG_PARAM                                       VARCHAR2(250)     := NULL;
    V_PROCEDURE_NAME                                  VARCHAR(32)       := 'MOVE_DATA_STG_SCORE_REQUEST';
    V_PACKAGE_NAME                                    VARCHAR(32)       := 'DATA_LOAD';
    V_SQL_STMT                                        CLOB;
    V_LOG_ID                                          NUMBER;
    V_RUN_ID                                          NUMBER := 0;
    -------------------------------------------------------------------------------
    -------------------------------------------------------------------------------
BEGIN
    --  Moving data into STG_SCORE_REQUEST_HIST -- START
    P_STATUS := 0;

    BEGIN
        SELECT NVL(MAX(RUN_ID),0) INTO V_RUN_ID FROM STG_SCORE_REQUEST;
    EXCEPTION 
        WHEN OTHERS THEN
        V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                      SQLERRM || ' -- Error in fetching RUN_ID from STG_SCORE_REQUEST table -- STOPPED';
        DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
        PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG, V_RUN_ID);
    END;

    BEGIN
        UPDATE  BATCH_LOG
        SET     BATCH_ID = NVL((SELECT MAX(RUN_ID) FROM STG_SCORE_REQUEST),0)
        WHERE   BATCH_ID = 0;
        V_ROWCOUNT := V_ROWCOUNT + SQL%ROWCOUNT;
    EXCEPTION    
        WHEN OTHERS THEN
            V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                          SQLERRM || ' -- Error in updating data in BATCH_LOG -- STOPPED';
            DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
            PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,V_RUN_ID);
            P_STATUS := 1;
            RETURN;
    END;

      --  Logging the completion of inserting data into B_SCORE_REQUEST 
      V_LOG_MSG := 'Records are successfully updated in BATCH_LOG, RECORD_COUNT = ' || V_ROWCOUNT ;
      DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
      PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'I',NULL,V_LOG_MSG,V_RUN_ID);
      COMMIT;
      V_ROWCOUNT := 0;    

    BEGIN
        SELECT  NVL(MAX(LOG_ID),0)
        INTO    V_LOG_ID
        FROM    INPUT_BAD_RECORDS_LOG;
    EXCEPTION    
        WHEN OTHERS THEN
            V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                          SQLERRM || ' -- Error in fetching latest LOG_ID from INPUT_BAD_RECORDS_LOG -- STOPPED';
            DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
            PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,V_RUN_ID);
            P_STATUS := 1;
            RETURN;
    END;

    BEGIN
        UPDATE  STG_SCORE_REQUEST_BAD_RECORDS
        SET     LOG_ID = V_LOG_ID
        WHERE   RUN_ID = NVL((SELECT MAX(RUN_ID) FROM STG_SCORE_REQUEST),0);
        V_ROWCOUNT := V_ROWCOUNT + SQL%ROWCOUNT;
    EXCEPTION    
        WHEN OTHERS THEN
            V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                          SQLERRM || ' -- Error in updating data in STG_SCORE_REQUEST_BAD_RECORDS -- STOPPED';
            DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
            PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG);
            P_STATUS := 1;
            RETURN;
    END;

      --  Logging the completion of updating data into STG_SCORE_REQUEST_BAD_RECORDS 
      V_LOG_MSG := 'Records are successfully updated in STG_SCORE_REQUEST_BAD_RECORDS, RECORD_COUNT = ' || V_ROWCOUNT ;
      DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
      PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'I',NULL,V_LOG_MSG,V_RUN_ID);
      COMMIT;
      V_ROWCOUNT := 0;  

    BEGIN
        INSERT INTO STG_SCORE_REQUEST_HIST (
            RUN_ID,
            RUN_DATE,
            CONTRACT_NUMBER,
            CIC,
            PRODUCT_CODE,
            SALARY_TRANSFER,
            OPEN_DATE,
            BRANCH_SHOWROOM_ACC,
            EMP_COMPANY,
            EMP_DEPARTMENT,
            MILITARY_RANK,
            DURATION_IN_MONTH,
            GROSS_SALARY,
            DEPENDENTS,
            DATE_OF_BIRTH,
            EMPLOYER_ENGAGEMENT_DT,
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
            CIC_OPEN_DATE,
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
            DISBURSEMENT_DATE,
            EMPLOYEE_TYPE,
            EMPLOYER_CLASS_CODE,
            END_OF_SERVICE_BENEFIT_AMOUNT,
            FEES,
            FINANCE_AMT,
            INSTAL_AMT,
            INSTALMENT_WITH_INSURANCE,
            MATURE_DATE,
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
            EXECUTION_DATE_TIME,
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
            PORTFOLIO_DATE,
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
            APPLICATION_DATE,
            APPROVAL_DATE,
            BRANCH_LOAN_APPLIED,
            H_CATEGORY_PRODUCT,
            LAST_PAYMENT,
            NEXT_PAY,
            ORG_UNIT,
            ORIG_TERM,
            PAY_FREQUENCY,
            FTV,
            OUTSTANDING_WITH_ACCRUAL_PFT,
            TRANSACTION_DATE,
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
            B_SPARE_50)
        SELECT
            RUN_ID,
            RUN_DATE,
            CONTRACT_NUMBER,
            CIC,
            PRODUCT_CODE,
            SALARY_TRANSFER,
            OPEN_DATE,
            BRANCH_SHOWROOM_ACC,
            EMP_COMPANY,
            EMP_DEPARTMENT,
            MILITARY_RANK,
            DURATION_IN_MONTH,
            GROSS_SALARY,
            DEPENDENTS,
            DATE_OF_BIRTH,
            EMPLOYER_ENGAGEMENT_DT,
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
            CIC_OPEN_DATE,
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
            DISBURSEMENT_DATE,
            EMPLOYEE_TYPE,
            EMPLOYER_CLASS_CODE,
            END_OF_SERVICE_BENEFIT_AMOUNT,
            FEES,
            FINANCE_AMT,
            INSTAL_AMT,
            INSTALMENT_WITH_INSURANCE,
            MATURE_DATE,
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
            EXECUTION_DATE_TIME,
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
            PORTFOLIO_DATE,
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
            APPLICATION_DATE,
            APPROVAL_DATE,
            BRANCH_LOAN_APPLIED,
            H_CATEGORY_PRODUCT,
            LAST_PAYMENT,
            NEXT_PAY,
            ORG_UNIT,
            ORIG_TERM,
            PAY_FREQUENCY,
            FTV,
            OUTSTANDING_WITH_ACCRUAL_PFT,
            TRANSACTION_DATE,
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
        FROM STG_SCORE_REQUEST;            
        V_ROWCOUNT := V_ROWCOUNT + SQL%ROWCOUNT;      
    EXCEPTION    
        WHEN OTHERS THEN
            V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                          SQLERRM || ' -- Error in moving data into STG_SCORE_REQUEST_HIST -- STOPPED';
            DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
            PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,V_RUN_ID);
            P_STATUS := 1;
            RETURN;
    END;
      --  Logging the completion of moving data into STG_SCORE_REQUEST_HIST 
      V_LOG_MSG := 'Records are successfully moved into STG_SCORE_REQUEST_HIST, RECORD_COUNT = ' || V_ROWCOUNT ;
      DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
      PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'I',NULL,V_LOG_MSG,V_RUN_ID);
      COMMIT;
      V_ROWCOUNT := 0;        
      --  Moving data into STG_SCORE_REQUEST_HIST -- END

    BEGIN
        V_SQL_STMT := 'TRUNCATE TABLE STG_SCORE_REQUEST';
        EXECUTE IMMEDIATE V_SQL_STMT;
    EXCEPTION 
        WHEN OTHERS THEN
        V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                      SQLERRM || ' -- Error in truncating STG_SCORE_REQUEST table -- STOPPED';
        DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
        PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'I',NULL,V_LOG_MSG,V_RUN_ID);
        P_STATUS := 1;
        RETURN;
    END;

EXCEPTION
  WHEN OTHERS THEN
    V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '|| 
                  SQLERRM ||' -- Error in MOVE_DATA_STG_SCORE_REQUEST -- ROLLBACKED';
    DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
    PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,V_RUN_ID);
    ROLLBACK;      
    P_STATUS := 1;   
END MOVE_DATA_STG_SCORE_REQUEST;    
---------------------------------------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------------------------------------------

PROCEDURE MOVE_DATA_A_SCORE_REQUEST (P_STATUS OUT NUMBER) AS
    /******************************************************************************
    NAME:    MOVE_DATA_A_SCORE_REQUEST
    PURPOSE: Move data from A_SCORE_REQUEST to A_SCORE_REQUEST_HIST.
    COMPANY: EJADA SYSTEMS

    REVISIONS:
    Version   Date        Author
    --------- ----------- ---------------
    1.0       24-AUG-2020  mgebba@ejada.com

    ******************************************************************************/
    --  General use variable declaration
    V_ROWCOUNT                                        NUMBER(9)         := 0;
    V_LOG_MSG                                         VARCHAR2(1000)    := NULL;
    V_LOG_PARAM                                       VARCHAR2(250)     := NULL;
    V_PROCEDURE_NAME                                  VARCHAR(32)       := 'MOVE_DATA_A_SCORE_REQUEST';
    V_PACKAGE_NAME                                    VARCHAR(32)       := 'DATA_LOAD';
    V_SQL_STMT                                        CLOB;
    V_RUN_ID_QUERY                                    CLOB;
    V_RUN_ID                                          NUMBER := 0;
    -------------------------------------------------------------------------------
    RUN_ID_CUR         SYS_REFCURSOR;

    TYPE RUN_ID_REC IS RECORD
    (
        RUN_ID                        NUMBER
    );

    RUN_ID_RES                      RUN_ID_REC;
    -------------------------------------------------------------------------------
BEGIN
    --  Moving data into A_SCORE_REQUEST_HIST -- START
    P_STATUS := 0;

    V_RUN_ID_QUERY := 
    'SELECT DISTINCT    RUN_ID AS RUN_ID
    FROM                A_SCORE_REQUEST
    ORDER BY            RUN_ID';

    OPEN RUN_ID_CUR FOR V_RUN_ID_QUERY;
    LOOP
        BEGIN
            FETCH RUN_ID_CUR INTO RUN_ID_RES;              
            EXIT WHEN RUN_ID_CUR%NOTFOUND;

            /*
            BEGIN
                UPDATE  A_SCORE_REQUEST REQ
                SET     REQ.PROCESS_STATUS = 'Failed'
                WHERE   REQ.REQUEST_ID NOT IN (
                        SELECT  DISTINCT RES.REQUEST_ID
                        FROM    A_SCORE_RESPONSE RES
                        WHERE   RES.RUN_ID = RUN_ID_RES.RUN_ID)
                AND     REQ.RUN_ID = RUN_ID_RES.RUN_ID;        
                V_ROWCOUNT := V_ROWCOUNT + SQL%ROWCOUNT;      
            EXCEPTION    
                WHEN OTHERS THEN
                    V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                                  SQLERRM || ' -- Error in updating data in A_SCORE_REQUEST -- STOPPED';
                    DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
                    PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,RUN_ID_RES.RUN_ID);
                    P_STATUS := 1;
            END;
              --  Logging the completion of updating failed records data into A_SCORE_REQUEST
              V_LOG_MSG := 'Records are successfully updated in A_SCORE_REQUEST, RECORD_COUNT = ' || V_ROWCOUNT ;
              DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
              PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'I',NULL,V_LOG_MSG,RUN_ID_RES.RUN_ID);
              COMMIT;
              V_ROWCOUNT := 0;        
            */

            BEGIN
                INSERT INTO A_SCORE_REQUEST_HIST (
                        REQUEST_ID,
                        RUN_ID,
                        PROCESS_STATUS,
                        CONT_ACCOUNT_ID,
                        CONT_ACCRUED_INT,
                        CONT_ADD_RATE,
                        CONT_APPLICATION_DATE,
                        CONT_APPROVAL_DATE,
                        CONT_BALLOON_AMOUNT,
                        CONT_BASIC_SALARY_AMOUNT,
                        CONT_BRANCH_LOAN_APPLIED,
                        CONT_BRANCH_SHOWROOM_ACC,
                        CONT_BUSINESS_POSITION,
                        CONT_CIC,
                        CONT_CONTRACT_NUMBER,
                        CONT_CUR_BOOK_BAL,
                        CONT_CURR_PAY,
                        CONT_CURRENCY,
                        CONT_CUS_SUBTYPE,
                        CONT_DEBT_BURDEN_RATIO,
                        CONT_DELINQ_DAYS,
                        CONT_DEPENDENTS,
                        CONT_DEPT_CODE,
                        CONT_DISBURSEMENT_DATE,
                        CONT_DISBURSEMENT_AMOUNT,
                        CONT_DOWNPAYMENT_AMT,
                        CONT_RUN_DATE,
                        CONT_EMP_DEPARTMENT,
                        CONT_EMP_COMPANY,
                        CONT_EMPLOYER_ENGAGEMENT_DATE,
                        CONT_FEES,
                        CONT_FINANCE_AMT,
                        CONT_GROSS_SALARY,
                        CONT_H_CATEGORY_PRODUCT,
                        CONT_INSTAL_AMT,
                        CONT_INSTAL_WITH_INSURANCE,
                        CONT_LAST_PAYMENT_DATE,
                        CONT_MATURE_DATE,
                        CONT_MILITARY_RANK,
                        CONT_NET_BAL,
                        CONT_NEXT_PAY_DATE,
                        CONT_NO_OF_DELINQ_INST,
                        CONT_OPEN_DATE,
                        CONT_ORG_UNIT,
                        CONT_ORIG_APPROVAL_AMT,
                        CONT_ORIG_BALANCE,
                        CONT_ORIG_PAY,
                        CONT_ORIG_PROFIT,
                        CONT_ORIG_TERM,
                        CONT_PAY_FREQUENCY,
                        CONT_PAYMENT_PRINCIPAL_AMT,
                        CONT_PROFIT_RATE_SUB_TYPE,
                        CONT_RATE,
                        CONT_TOTAL_PAYMENTS,
                        CONT_REMAIN_PAYMENTS,
                        CONT_REMAIN_TERM,
                        CUST_RESIDENT_STATUS,
                        CUST_RESIDENT_TYPE,
                        CONT_SALARY_TRANSFER_TYPE,
                        CUST_SALARY_TRANSFER_TYPE_CIF,
                        CONT_SALARY_TRANSFER_TYPE_CTF,
                        CONT_SALES_BRANCH,
                        CONT_SALES_CD,
                        CONT_SALES_USERID,
                        CONT_TERM,
                        CONT_TOT_GRACE_PRD_PROFIT,
                        CONT_TOTAL_EARLY_PAYMENT_AMT,
                        CONT_TOTAL_INSTAL_DUE_AMT,
                        CUST_GENDER,
                        CUST_MARITAL_STATUS,
                        CUST_DATE_OF_BIRTH,
                        CONT_BRANCH_SHOWROOM_ACC_CODE,
                        CONT_BRANCH_SHOWROOM_CODE,
                        CONT_CHANNEL_CODE,
                        CUST_CITY,
                        CUST_CIVIL_STATUS,
                        CONT_CUSTOMER_SEGMENT,
                        CUST_DISTRICT_CODE,
                        CONT_DURATION_IN_MONTH,
                        CUST_EDUCATION_LEVEL,
                        CONT_EMPLOYEE_TYPE,
                        CONT_EMPLOYER_CLASS_CODE,
                        CONT_END_SERVICE_BENEFIT_AMT,
                        CUST_HOUSE_OWNED_STATUS,
                        CONT_MONTHLY_ALLOWANCE_AMOUNT,
                        CONT_MONTHLY_OTHER_INCOME_AMT,
                        CUST_NATIONALITY,
                        CUST_NUMBER_OF_CARS,
                        CUST_OCCUPATION_TYPE,
                        CONT_OTHER_MONTHLY_DEDUCT_AMT,
                        CONT_PRODUCT_CODE,
                        CONT_PRODUCT_TYPE,
                        CUST_REGION,
                        CONT_RELATION_CONTRACT_TYPE,
                        RESP_RL_FOOD_BEVERAGES,
                        RESP_RL_HOUSING,
                        RESP_RL_UTILITIES,
                        RESP_RL_HEALTHCARE,
                        RESP_RL_TRANSPORT,
                        RESP_RL_COMMUNICATIONS,
                        RESP_RL_EDUCATION_FEES,
                        RESP_RL_HOME_SERVANTS,
                        RESP_RL_FEES_ON_EXPATS,
                        RESP_RL_OTHER_FUTURE_EXPENSES,
                        RESP_RL_OTHER_INCOME,
                        RESP_RL_TOTAL_EXPENSES,
                        RESP_RL_OTHER_OBLIGATIONS,
                        ARMS_ARMS_MITIGANT_CODE,
                        ARMS_ARMS_MITIGANT_DESC,
                        ARMS_ARMS_MITIGANT_VALUE,
                        ARMS_ARMS_COLL_AREA,
                        ARMS_ARMS_VEHICLE_BRAND_NAME,
                        ARMS_ARMS_VEHICLE_BRAND_TYPE,
                        ARMS_ARMS_PROP_EVAL_STATUS,
                        ARMS_ARMS_MITIGANT_VAL_OWNER,
                        ARMS_ARMS_BOOK_VALUE,
                        ARMS_ARMS_VALUATION_DIFF,
                        ARMS_ARMS_CONTRACT_NUMBER,
                        ARMS_ARMS_MANUFACTURE_YEAR,
                        ARMS_ARMS_VEHI_MANUFACT_YEAR,
                        ARMS_ARMS_REGION,
                        ARMS_ARMS_PROPERTY_TYPE,
                        SIMAH_TOTAL_LIABILITIES,
                        SIMAH_NO_OF_LOANS,
                        SIMAH_TOTAL_LIMIT,
                        SIMAH_TOTAL_REVOLVING_LIMIT,
                        SIMAH_TOTAL_REVOLVING_LIAB,
                        SIMAH_NO_OF_ENQUIRIES_12M,
                        SIMAH_NO_OF_ENQUIRIES_30D,
                        SIMAH_NO_OF_BOUNCED_CHEQUE,
                        SIMAH_SIMAH_SCORE,
                        SIMAH_SIMAH_SCORE_VERSION,
                        SIMAH_WORST_DELINQ_24M_CRC,
                        SIMAH_WORST_DELINQ_24M_PLN,
                        SIMAH_WORST_DELINQ_24M_AUTO,
                        SIMAH_WORST_DELINQ_24M_MTG,
                        SIMAH_WORST_DELINQ_24M_OTHER,
                        SIMAH_CUR_WORST_DELINQ_CRC,
                        SIMAH_CUR_WORST_DELINQ_PLN,
                        SIMAH_CUR_WORST_DELINQ_AUTO,
                        SIMAH_CUR_WORST_DELINQ_MTG,
                        SIMAH_CUR_WORST_DELINQ_OTHER,
                        SIMAH_CONTRACTUAL_PAY_CRC,
                        SIMAH_CONTRACTUAL_PAY_PLN,
                        SIMAH_CONTRACTUAL_PAY_AUTO,
                        SIMAH_CONTRACTUAL_PAY_MTG,
                        SIMAH_CONTRACTUAL_PAY_OTHER,
                        SIMAH_NO_OF_DEFAULT_CRC,
                        SIMAH_NO_OF_DEFAULT_PLN,
                        SIMAH_NO_OF_DEFAULT_AUTO,
                        SIMAH_NO_OF_DEFAULT_MTG,
                        SIMAH_NO_OF_DEFAULT_OTHER,
                        SIMAH_NO_OF_CI_DEFAULT_CRC,
                        SIMAH_NO_OF_CI_DEFAULT_PLN,
                        SIMAH_NO_OF_CI_DEFAULT_AUTO,
                        SIMAH_NO_OF_CI_DEFAULT_MTG,
                        SIMAH_NO_OF_CI_DEFAULT_OTHER,
                        SIMAH_SUMMED_SALARY,
                        SIMAH_DEBT_BURDEN,
                        SIMAH_DEBT_BURDEN_RATIO,
                        SIMAH_NO_OF_EXECUTED_EXJUDG,
                        SIMAH_NO_OF_NOTEXEC_EXJUDG,
                        SIMAH_OUTSTAND_BAL_NOTEXJUDG,
                        CONT_PRINCIPAL_OUTSTANDING,
                        CONT_OUTSTANDING_ACCRUVAL_PFT,
                        CONT_OUTSTANDING_TOTAL_PFT,
                        CONT_SUB_CODE,
                        CASA_AVERAGE_BAL_MONTH_M0,
                        CASA_AVERAGE_BAL_MONTH_M1,
                        CASA_AVERAGE_BAL_MONTH_M2,
                        CASA_AVERAGE_BAL_MONTH_M3,
                        CASA_AVERAGE_BAL_MONTH_M4,
                        CASA_AVERAGE_BAL_MONTH_M5,
                        CASA_AVERAGE_BAL_MONTH_M6,
                        CASA_AVERAGE_BAL_MONTH_M7,
                        CASA_AVERAGE_BAL_MONTH_M8,
                        CASA_AVERAGE_BAL_MONTH_M9,
                        CASA_AVERAGE_BAL_MONTH_M10,
                        CASA_AVERAGE_BAL_MONTH_M11,
                        CARD_BRANCH_SHOWROOM_ACC,
                        SIMAH_CARD_PRODUCT_LIMIT,
                        SIMAH_CARD_PRODUCT_CODE,
                        SIMAH_CARD_OUTSTANDING_BAL,
                        CARD_PRIMARY_CARD_FLG,
                        CARD_SUPPLEMENTARY_CARD_LIMIT,
                        SCOR_SCORING_REQUEST_TYPE,
                        SCOR_SCORING_STAGE,
                        SCOR_SCORING_SOURCE,
                        SCOR_APPEND_DB_CODE,
                        SCOR_APPLICATION_ID,
                        SCOR_NATIONAL_ID,
                        SCOR_DB_TABLE_CODE,
                        SCOR_TRANSACTION_ID,
                        SCOR_EXECUTION_DATE_TIME,
                        SCOR_CODE_01,
                        SCOR_CODE_02,
                        SCOR_CODE_03,
                        SCOR_CODE_04,
                        SCOR_CODE_05,
                        SCOR_CODE_06,
                        SCOR_CODE_07,
                        SCOR_CODE_08,
                        SCOR_CODE_09,
                        SCOR_CODE_10,
                        SCOR_PROGRESS_NUMBER,
                        SPARE_SPARE_01,
                        SPARE_SPARE_02,
                        SPARE_SPARE_03,
                        SPARE_SPARE_04,
                        SPARE_SPARE_05,
                        SPARE_SPARE_06,
                        SPARE_SPARE_07,
                        SPARE_SPARE_08,
                        SPARE_SPARE_09,
                        SPARE_SPARE_10,
                        SPARE_SPARE_11,
                        SPARE_SPARE_12,
                        SPARE_SPARE_13,
                        SPARE_SPARE_14,
                        SPARE_SPARE_15,
                        SPARE_SPARE_16,
                        SPARE_SPARE_17,
                        SPARE_SPARE_18,
                        SPARE_SPARE_19,
                        SPARE_SPARE_20,
                        SPARE_SPARE_21,
                        SPARE_SPARE_22,
                        SPARE_SPARE_23,
                        SPARE_SPARE_24,
                        SPARE_SPARE_25,
                        SPARE_SPARE_26,
                        SPARE_SPARE_27,
                        SPARE_SPARE_28,
                        SPARE_SPARE_29,
                        SPARE_SPARE_30,
                        SPARE_SPARE_31,
                        SPARE_SPARE_32,
                        SPARE_SPARE_33,
                        SPARE_SPARE_34,
                        SPARE_SPARE_35,
                        SPARE_SPARE_36,
                        SPARE_SPARE_37,
                        SPARE_SPARE_38,
                        SPARE_SPARE_39,
                        SPARE_SPARE_40,
                        SPARE_SPARE_41,
                        SPARE_SPARE_42,
                        SPARE_SPARE_43,
                        SPARE_SPARE_44,
                        SPARE_SPARE_45,
                        SPARE_SPARE_46,
                        SPARE_SPARE_47,
                        SPARE_SPARE_48,
                        SPARE_SPARE_49,
                        SPARE_SPARE_50,
                        CUST_CIC_OPEN_DATE,
                        CONT_TRANSACTION_DATE)
                SELECT
                        REQUEST_ID,
                        RUN_ID,
                        PROCESS_STATUS,
                        CONT_ACCOUNT_ID,
                        CONT_ACCRUED_INT,
                        CONT_ADD_RATE,
                        CONT_APPLICATION_DATE,
                        CONT_APPROVAL_DATE,
                        CONT_BALLOON_AMOUNT,
                        CONT_BASIC_SALARY_AMOUNT,
                        CONT_BRANCH_LOAN_APPLIED,
                        CONT_BRANCH_SHOWROOM_ACC,
                        CONT_BUSINESS_POSITION,
                        CONT_CIC,
                        CONT_CONTRACT_NUMBER,
                        CONT_CUR_BOOK_BAL,
                        CONT_CURR_PAY,
                        CONT_CURRENCY,
                        CONT_CUS_SUBTYPE,
                        CONT_DEBT_BURDEN_RATIO,
                        CONT_DELINQ_DAYS,
                        CONT_DEPENDENTS,
                        CONT_DEPT_CODE,
                        CONT_DISBURSEMENT_DATE,
                        CONT_DISBURSEMENT_AMOUNT,
                        CONT_DOWNPAYMENT_AMT,
                        CONT_RUN_DATE,
                        CONT_EMP_DEPARTMENT,
                        CONT_EMP_COMPANY,
                        CONT_EMPLOYER_ENGAGEMENT_DATE,
                        CONT_FEES,
                        CONT_FINANCE_AMT,
                        CONT_GROSS_SALARY,
                        CONT_H_CATEGORY_PRODUCT,
                        CONT_INSTAL_AMT,
                        CONT_INSTAL_WITH_INSURANCE,
                        CONT_LAST_PAYMENT_DATE,
                        CONT_MATURE_DATE,
                        CONT_MILITARY_RANK,
                        CONT_NET_BAL,
                        CONT_NEXT_PAY_DATE,
                        CONT_NO_OF_DELINQ_INST,
                        CONT_OPEN_DATE,
                        CONT_ORG_UNIT,
                        CONT_ORIG_APPROVAL_AMT,
                        CONT_ORIG_BALANCE,
                        CONT_ORIG_PAY,
                        CONT_ORIG_PROFIT,
                        CONT_ORIG_TERM,
                        CONT_PAY_FREQUENCY,
                        CONT_PAYMENT_PRINCIPAL_AMT,
                        CONT_PROFIT_RATE_SUB_TYPE,
                        CONT_RATE,
                        CONT_TOTAL_PAYMENTS,
                        CONT_REMAIN_PAYMENTS,
                        CONT_REMAIN_TERM,
                        CUST_RESIDENT_STATUS,
                        CUST_RESIDENT_TYPE,
                        CONT_SALARY_TRANSFER_TYPE,
                        CUST_SALARY_TRANSFER_TYPE_CIF,
                        CONT_SALARY_TRANSFER_TYPE_CTF,
                        CONT_SALES_BRANCH,
                        CONT_SALES_CD,
                        CONT_SALES_USERID,
                        CONT_TERM,
                        CONT_TOT_GRACE_PRD_PROFIT,
                        CONT_TOTAL_EARLY_PAYMENT_AMT,
                        CONT_TOTAL_INSTAL_DUE_AMT,
                        CUST_GENDER,
                        CUST_MARITAL_STATUS,
                        CUST_DATE_OF_BIRTH,
                        CONT_BRANCH_SHOWROOM_ACC_CODE,
                        CONT_BRANCH_SHOWROOM_CODE,
                        CONT_CHANNEL_CODE,
                        CUST_CITY,
                        CUST_CIVIL_STATUS,
                        CONT_CUSTOMER_SEGMENT,
                        CUST_DISTRICT_CODE,
                        CONT_DURATION_IN_MONTH,
                        CUST_EDUCATION_LEVEL,
                        CONT_EMPLOYEE_TYPE,
                        CONT_EMPLOYER_CLASS_CODE,
                        CONT_END_SERVICE_BENEFIT_AMT,
                        CUST_HOUSE_OWNED_STATUS,
                        CONT_MONTHLY_ALLOWANCE_AMOUNT,
                        CONT_MONTHLY_OTHER_INCOME_AMT,
                        CUST_NATIONALITY,
                        CUST_NUMBER_OF_CARS,
                        CUST_OCCUPATION_TYPE,
                        CONT_OTHER_MONTHLY_DEDUCT_AMT,
                        CONT_PRODUCT_CODE,
                        CONT_PRODUCT_TYPE,
                        CUST_REGION,
                        CONT_RELATION_CONTRACT_TYPE,
                        RESP_RL_FOOD_BEVERAGES,
                        RESP_RL_HOUSING,
                        RESP_RL_UTILITIES,
                        RESP_RL_HEALTHCARE,
                        RESP_RL_TRANSPORT,
                        RESP_RL_COMMUNICATIONS,
                        RESP_RL_EDUCATION_FEES,
                        RESP_RL_HOME_SERVANTS,
                        RESP_RL_FEES_ON_EXPATS,
                        RESP_RL_OTHER_FUTURE_EXPENSES,
                        RESP_RL_OTHER_INCOME,
                        RESP_RL_TOTAL_EXPENSES,
                        RESP_RL_OTHER_OBLIGATIONS,
                        ARMS_ARMS_MITIGANT_CODE,
                        ARMS_ARMS_MITIGANT_DESC,
                        ARMS_ARMS_MITIGANT_VALUE,
                        ARMS_ARMS_COLL_AREA,
                        ARMS_ARMS_VEHICLE_BRAND_NAME,
                        ARMS_ARMS_VEHICLE_BRAND_TYPE,
                        ARMS_ARMS_PROP_EVAL_STATUS,
                        ARMS_ARMS_MITIGANT_VAL_OWNER,
                        ARMS_ARMS_BOOK_VALUE,
                        ARMS_ARMS_VALUATION_DIFF,
                        ARMS_ARMS_CONTRACT_NUMBER,
                        ARMS_ARMS_MANUFACTURE_YEAR,
                        ARMS_ARMS_VEHI_MANUFACT_YEAR,
                        ARMS_ARMS_REGION,
                        ARMS_ARMS_PROPERTY_TYPE,
                        SIMAH_TOTAL_LIABILITIES,
                        SIMAH_NO_OF_LOANS,
                        SIMAH_TOTAL_LIMIT,
                        SIMAH_TOTAL_REVOLVING_LIMIT,
                        SIMAH_TOTAL_REVOLVING_LIAB,
                        SIMAH_NO_OF_ENQUIRIES_12M,
                        SIMAH_NO_OF_ENQUIRIES_30D,
                        SIMAH_NO_OF_BOUNCED_CHEQUE,
                        SIMAH_SIMAH_SCORE,
                        SIMAH_SIMAH_SCORE_VERSION,
                        SIMAH_WORST_DELINQ_24M_CRC,
                        SIMAH_WORST_DELINQ_24M_PLN,
                        SIMAH_WORST_DELINQ_24M_AUTO,
                        SIMAH_WORST_DELINQ_24M_MTG,
                        SIMAH_WORST_DELINQ_24M_OTHER,
                        SIMAH_CUR_WORST_DELINQ_CRC,
                        SIMAH_CUR_WORST_DELINQ_PLN,
                        SIMAH_CUR_WORST_DELINQ_AUTO,
                        SIMAH_CUR_WORST_DELINQ_MTG,
                        SIMAH_CUR_WORST_DELINQ_OTHER,
                        SIMAH_CONTRACTUAL_PAY_CRC,
                        SIMAH_CONTRACTUAL_PAY_PLN,
                        SIMAH_CONTRACTUAL_PAY_AUTO,
                        SIMAH_CONTRACTUAL_PAY_MTG,
                        SIMAH_CONTRACTUAL_PAY_OTHER,
                        SIMAH_NO_OF_DEFAULT_CRC,
                        SIMAH_NO_OF_DEFAULT_PLN,
                        SIMAH_NO_OF_DEFAULT_AUTO,
                        SIMAH_NO_OF_DEFAULT_MTG,
                        SIMAH_NO_OF_DEFAULT_OTHER,
                        SIMAH_NO_OF_CI_DEFAULT_CRC,
                        SIMAH_NO_OF_CI_DEFAULT_PLN,
                        SIMAH_NO_OF_CI_DEFAULT_AUTO,
                        SIMAH_NO_OF_CI_DEFAULT_MTG,
                        SIMAH_NO_OF_CI_DEFAULT_OTHER,
                        SIMAH_SUMMED_SALARY,
                        SIMAH_DEBT_BURDEN,
                        SIMAH_DEBT_BURDEN_RATIO,
                        SIMAH_NO_OF_EXECUTED_EXJUDG,
                        SIMAH_NO_OF_NOTEXEC_EXJUDG,
                        SIMAH_OUTSTAND_BAL_NOTEXJUDG,
                        CONT_PRINCIPAL_OUTSTANDING,
                        CONT_OUTSTANDING_ACCRUVAL_PFT,
                        CONT_OUTSTANDING_TOTAL_PFT,
                        CONT_SUB_CODE,
                        CASA_AVERAGE_BAL_MONTH_M0,
                        CASA_AVERAGE_BAL_MONTH_M1,
                        CASA_AVERAGE_BAL_MONTH_M2,
                        CASA_AVERAGE_BAL_MONTH_M3,
                        CASA_AVERAGE_BAL_MONTH_M4,
                        CASA_AVERAGE_BAL_MONTH_M5,
                        CASA_AVERAGE_BAL_MONTH_M6,
                        CASA_AVERAGE_BAL_MONTH_M7,
                        CASA_AVERAGE_BAL_MONTH_M8,
                        CASA_AVERAGE_BAL_MONTH_M9,
                        CASA_AVERAGE_BAL_MONTH_M10,
                        CASA_AVERAGE_BAL_MONTH_M11,
                        CARD_BRANCH_SHOWROOM_ACC,
                        SIMAH_CARD_PRODUCT_LIMIT,
                        SIMAH_CARD_PRODUCT_CODE,
                        SIMAH_CARD_OUTSTANDING_BAL,
                        CARD_PRIMARY_CARD_FLG,
                        CARD_SUPPLEMENTARY_CARD_LIMIT,
                        SCOR_SCORING_REQUEST_TYPE,
                        SCOR_SCORING_STAGE,
                        SCOR_SCORING_SOURCE,
                        SCOR_APPEND_DB_CODE,
                        SCOR_APPLICATION_ID,
                        SCOR_NATIONAL_ID,
                        SCOR_DB_TABLE_CODE,
                        SCOR_TRANSACTION_ID,
                        SCOR_EXECUTION_DATE_TIME,
                        SCOR_CODE_01,
                        SCOR_CODE_02,
                        SCOR_CODE_03,
                        SCOR_CODE_04,
                        SCOR_CODE_05,
                        SCOR_CODE_06,
                        SCOR_CODE_07,
                        SCOR_CODE_08,
                        SCOR_CODE_09,
                        SCOR_CODE_10,
                        SCOR_PROGRESS_NUMBER,
                        SPARE_SPARE_01,
                        SPARE_SPARE_02,
                        SPARE_SPARE_03,
                        SPARE_SPARE_04,
                        SPARE_SPARE_05,
                        SPARE_SPARE_06,
                        SPARE_SPARE_07,
                        SPARE_SPARE_08,
                        SPARE_SPARE_09,
                        SPARE_SPARE_10,
                        SPARE_SPARE_11,
                        SPARE_SPARE_12,
                        SPARE_SPARE_13,
                        SPARE_SPARE_14,
                        SPARE_SPARE_15,
                        SPARE_SPARE_16,
                        SPARE_SPARE_17,
                        SPARE_SPARE_18,
                        SPARE_SPARE_19,
                        SPARE_SPARE_20,
                        SPARE_SPARE_21,
                        SPARE_SPARE_22,
                        SPARE_SPARE_23,
                        SPARE_SPARE_24,
                        SPARE_SPARE_25,
                        SPARE_SPARE_26,
                        SPARE_SPARE_27,
                        SPARE_SPARE_28,
                        SPARE_SPARE_29,
                        SPARE_SPARE_30,
                        SPARE_SPARE_31,
                        SPARE_SPARE_32,
                        SPARE_SPARE_33,
                        SPARE_SPARE_34,
                        SPARE_SPARE_35,
                        SPARE_SPARE_36,
                        SPARE_SPARE_37,
                        SPARE_SPARE_38,
                        SPARE_SPARE_39,
                        SPARE_SPARE_40,
                        SPARE_SPARE_41,
                        SPARE_SPARE_42,
                        SPARE_SPARE_43,
                        SPARE_SPARE_44,
                        SPARE_SPARE_45,
                        SPARE_SPARE_46,
                        SPARE_SPARE_47,
                        SPARE_SPARE_48,
                        SPARE_SPARE_49,
                        SPARE_SPARE_50,
                        CUST_CIC_OPEN_DATE,
                        CONT_TRANSACTION_DATE
                FROM A_SCORE_REQUEST
                WHERE RUN_ID = RUN_ID_RES.RUN_ID;             
                V_ROWCOUNT := V_ROWCOUNT + SQL%ROWCOUNT;      
            EXCEPTION    
                WHEN OTHERS THEN
                    V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                                  SQLERRM || ' -- Error in moving data into A_SCORE_REQUEST_HIST -- STOPPED';
                    DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
                    PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,RUN_ID_RES.RUN_ID);
                    P_STATUS := 1;
            END;
              --  Logging the completion of moving data into A_SCORE_REQUEST_HIST 
              V_LOG_MSG := 'Records are successfully moved into A_SCORE_REQUEST_HIST, RECORD_COUNT = ' || V_ROWCOUNT ;
              DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
              PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'I',NULL,V_LOG_MSG,RUN_ID_RES.RUN_ID);
              COMMIT;
              V_ROWCOUNT := 0;        
              --  Moving data into A_SCORE_REQUEST_HIST -- END
        EXCEPTION
            WHEN OTHERS THEN
            V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                          SQLERRM || ' -- Error in the RUN_ID cursor for A_SCORE_REQUEST -- STOPPED';
            DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
            PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'I',NULL,V_LOG_MSG,RUN_ID_RES.RUN_ID);
            P_STATUS := 1;
        END;
    END LOOP;              

    BEGIN
        V_SQL_STMT := 'TRUNCATE TABLE A_SCORE_REQUEST';
        EXECUTE IMMEDIATE V_SQL_STMT;
    EXCEPTION 
        WHEN OTHERS THEN
        V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                      SQLERRM || ' -- Error in truncating A_SCORE_REQUEST table -- STOPPED';
        DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
        PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'I',NULL,V_LOG_MSG,V_RUN_ID);
        P_STATUS := 1;
        RETURN;
    END;

EXCEPTION
  WHEN OTHERS THEN
    V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '|| 
                  SQLERRM ||' -- Error in MOVE_DATA_A_SCORE_REQUEST -- ROLLBACKED';
    DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
    PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,V_RUN_ID);
    ROLLBACK;      
    P_STATUS := 1;   
END MOVE_DATA_A_SCORE_REQUEST;    
---------------------------------------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------------------------------------------

PROCEDURE MOVE_DATA_B_SCORE_REQUEST (P_STATUS OUT NUMBER) AS
    /******************************************************************************
    NAME:    MOVE_DATA_B_SCORE_REQUEST
    PURPOSE: Move data from B_SCORE_REQUEST to B_SCORE_REUEST_HIST.
    COMPANY: EJADA SYSTEMS

    REVISIONS:
    Version   Date        Author
    --------- ----------- ---------------
    1.0       24-AUG-2020  mgebba@ejada.com

    ******************************************************************************/
    --  General use variable declaration
    V_ROWCOUNT                                        NUMBER(9)         := 0;
    V_LOG_MSG                                         VARCHAR2(1000)    := NULL;
    V_LOG_PARAM                                       VARCHAR2(250)     := NULL;
    V_PROCEDURE_NAME                                  VARCHAR(32)       := 'MOVE_DATA_B_SCORE_REQUEST';
    V_PACKAGE_NAME                                    VARCHAR(32)       := 'DATA_LOAD';
    V_SQL_STMT                                        CLOB;
    V_RUN_ID_QUERY                                    CLOB;
    V_RUN_ID                                          NUMBER := 0;
    -------------------------------------------------------------------------------
    RUN_ID_CUR         SYS_REFCURSOR;

    TYPE RUN_ID_REC IS RECORD
    (
        RUN_ID                        NUMBER
    );

    RUN_ID_RES                      RUN_ID_REC;
    -------------------------------------------------------------------------------
BEGIN
    --  Moving data into B_SCORE_REQUEST_HIST -- START
    P_STATUS := 0;

    V_RUN_ID_QUERY := 
    'SELECT DISTINCT    RUN_ID AS RUN_ID
    FROM                B_SCORE_REQUEST
    ORDER BY            RUN_ID';

    OPEN RUN_ID_CUR FOR V_RUN_ID_QUERY;
    LOOP
        BEGIN
            FETCH RUN_ID_CUR INTO RUN_ID_RES;              
            EXIT WHEN RUN_ID_CUR%NOTFOUND;

            /*
            BEGIN
                UPDATE  B_SCORE_REQUEST REQ
                SET     REQ.PROCESS_STATUS = 'Failed'
                WHERE   REQ.REQUEST_ID NOT IN (
                        SELECT  DISTINCT RES.REQUEST_ID
                        FROM    B_SCORE_RESPONSE RES
                        WHERE   RES.RUN_ID = RUN_ID_RES.RUN_ID)
                AND     REQ.RUN_ID = RUN_ID_RES.RUN_ID;                        
                V_ROWCOUNT := V_ROWCOUNT + SQL%ROWCOUNT;      
            EXCEPTION    
                WHEN OTHERS THEN
                    V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                                  SQLERRM || ' -- Error in updating data in B_SCORE_REQUEST -- STOPPED';
                    DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
                    PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,RUN_ID_RES.RUN_ID);
                    P_STATUS := 1;
            END;
              --  Logging the completion of updating failed records data into B_SCORE_REQUEST
              V_LOG_MSG := 'Records are successfully updated in B_SCORE_REQUEST, RECORD_COUNT = ' || V_ROWCOUNT ;
              DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
              PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'I',NULL,V_LOG_MSG,RUN_ID_RES.RUN_ID);
              COMMIT;
              V_ROWCOUNT := 0;   
            */

            BEGIN
                INSERT INTO B_SCORE_REQUEST_HIST (
                    REQUEST_ID,
                    RUN_ID,
                    PROCESS_STATUS,
                    CASA_AVERAGE_BAL_MONTH_M0,
                    CASA_AVERAGE_BAL_MONTH_M1,
                    CASA_AVERAGE_BAL_MONTH_M2,
                    CASA_AVERAGE_BAL_MONTH_M3,
                    CASA_AVERAGE_BAL_MONTH_M4,
                    CASA_AVERAGE_BAL_MONTH_M5,
                    CASA_AVERAGE_BAL_MONTH_M6,
                    CASA_AVERAGE_BAL_MONTH_M7,
                    CASA_AVERAGE_BAL_MONTH_M8,
                    CASA_AVERAGE_BAL_MONTH_M9,
                    CASA_AVERAGE_BAL_MONTH_M10,
                    CASA_AVERAGE_BAL_MONTH_M11,
                    CASA_AVERAGE_BAL_MONTH_M12,
                    CASA_AVERAGE_BAL_MONTH_M13,
                    CASA_AVERAGE_BAL_MONTH_M14,
                    CASA_AVERAGE_BAL_MONTH_M15,
                    CASA_AVERAGE_BAL_MONTH_M16,
                    CASA_AVERAGE_BAL_MONTH_M17,
                    CASA_AVERAGE_BAL_MONTH_M18,
                    CASA_AVERAGE_BAL_MONTH_M19,
                    CASA_AVERAGE_BAL_MONTH_M20,
                    CASA_AVERAGE_BAL_MONTH_M21,
                    CASA_AVERAGE_BAL_MONTH_M22,
                    CASA_AVERAGE_BAL_MONTH_M23,
                    CASA_AVERAGE_BAL_MONTH_M24,
                    CUST_CIC_OPEN_DATE,
                    CUST_CITY,
                    CUST_CIVIL_STATUS,
                    CUST_DATE_OF_BIRTH,
                    CUST_DISTRICT_CODE,
                    CUST_EDUCATION_LEVEL,
                    CUST_GENDER,
                    CUST_HOUSE_OWNED_STATUS,
                    CUST_LATEST_EMP_COMPANY,
                    CUST_LATEST_EMP_DEPARTMENT,
                    CUST_MARITAL_STATUS,
                    CUST_NATIONALITY,
                    CUST_NUMBER_OF_CARS,
                    CUST_OCCUPATION_TYPE,
                    CUST_REGION,
                    CUST_RESIDENT_STATUS,
                    CUST_RESIDENT_TYPE,
                    CUST_SALARY_TRANSFER_TYPE_CIF,
                    CUST_TOT_NO_ACTIVE_CONTRACTS,
                    PROD_ARMS_BOOK_VALUE,
                    PROD_ARMS_COLL_AREA,
                    PROD_ARMS_CONTRACT_NUMBER,
                    PROD_ARMS_MANUFACTURE_YEAR,
                    PROD_ARMS_MITIGANT_CODE,
                    PROD_ARMS_MITIGANT_DESC,
                    PROD_ARMS_MITIGANT_VALUE,
                    PROD_ARMS_MITIGANT_VAL_OWNER,
                    PROD_ARMS_PROPERTY_TYPE,
                    PROD_ARMS_PROP_EVAL_STATUS,
                    PROD_ARMS_REGION,
                    PROD_ARMS_VALUATION_DIFF,
                    PROD_ARMS_VEHICLE_BRAND_CAT,             
                    PROD_ARMS_VEHICLE_BRAND_NAME,
                    PROD_ARMS_VEHICLE_BRAND_TYPE,
                    PROD_ARMS_VEHI_MANUFACT_YEAR,
                    PROD_DELINQ_AMOUNT_M0,
                    PROD_DELINQ_AMOUNT_M1,
                    PROD_DELINQ_AMOUNT_M2,
                    PROD_DELINQ_AMOUNT_M3,
                    PROD_DELINQ_AMOUNT_M4,
                    PROD_DELINQ_AMOUNT_M5,
                    PROD_DELINQ_AMOUNT_M6,
                    PROD_DELINQ_AMOUNT_M7,
                    PROD_DELINQ_AMOUNT_M8,
                    PROD_DELINQ_AMOUNT_M9,
                    PROD_DELINQ_AMOUNT_M10,
                    PROD_DELINQ_AMOUNT_M11,
                    PROD_DELINQ_AMOUNT_M12,
                    PROD_DELINQ_AMOUNT_M13,
                    PROD_DELINQ_AMOUNT_M14,
                    PROD_DELINQ_AMOUNT_M15,
                    PROD_DELINQ_AMOUNT_M16,
                    PROD_DELINQ_AMOUNT_M17,
                    PROD_DELINQ_AMOUNT_M18,
                    PROD_DELINQ_AMOUNT_M19,
                    PROD_DELINQ_AMOUNT_M20,
                    PROD_DELINQ_AMOUNT_M21,
                    PROD_DELINQ_AMOUNT_M22,
                    PROD_DELINQ_AMOUNT_M23,
                    PROD_DELINQ_AMOUNT_M24,
                    PROD_DELINQ_DAYS_M0,
                    PROD_DELINQ_DAYS_M1,
                    PROD_DELINQ_DAYS_M2,
                    PROD_DELINQ_DAYS_M3,
                    PROD_DELINQ_DAYS_M4,
                    PROD_DELINQ_DAYS_M5,
                    PROD_DELINQ_DAYS_M6,
                    PROD_DELINQ_DAYS_M7,
                    PROD_DELINQ_DAYS_M8,
                    PROD_DELINQ_DAYS_M9,
                    PROD_DELINQ_DAYS_M10,
                    PROD_DELINQ_DAYS_M11,
                    PROD_DELINQ_DAYS_M12,
                    PROD_DELINQ_DAYS_M13,
                    PROD_DELINQ_DAYS_M14,
                    PROD_DELINQ_DAYS_M15,
                    PROD_DELINQ_DAYS_M16,
                    PROD_DELINQ_DAYS_M17,
                    PROD_DELINQ_DAYS_M18,
                    PROD_DELINQ_DAYS_M19,
                    PROD_DELINQ_DAYS_M20,
                    PROD_DELINQ_DAYS_M21,
                    PROD_DELINQ_DAYS_M22,
                    PROD_DELINQ_DAYS_M23,
                    PROD_DELINQ_DAYS_M24,
                    PROD_EMI_M0,
                    PROD_EMI_M1,
                    PROD_EMI_M2,
                    PROD_EMI_M3,
                    PROD_EMI_M4,
                    PROD_EMI_M5,
                    PROD_EMI_M6,
                    PROD_EMI_M7,
                    PROD_EMI_M8,
                    PROD_EMI_M9,
                    PROD_EMI_M10,
                    PROD_EMI_M11,
                    PROD_EMI_M12,
                    PROD_EMI_M13,
                    PROD_EMI_M14,
                    PROD_EMI_M15,
                    PROD_EMI_M16,
                    PROD_EMI_M17,
                    PROD_EMI_M18,
                    PROD_EMI_M19,
                    PROD_EMI_M20,
                    PROD_EMI_M21,
                    PROD_EMI_M22,
                    PROD_EMI_M23,
                    PROD_EMI_M24,
                    PROD_OUTSTANDING_AMOUNT_M0,
                    PROD_OUTSTANDING_AMOUNT_M1,
                    PROD_OUTSTANDING_AMOUNT_M2,
                    PROD_OUTSTANDING_AMOUNT_M3,
                    PROD_OUTSTANDING_AMOUNT_M4,
                    PROD_OUTSTANDING_AMOUNT_M5,
                    PROD_OUTSTANDING_AMOUNT_M6,
                    PROD_OUTSTANDING_AMOUNT_M7,
                    PROD_OUTSTANDING_AMOUNT_M8,
                    PROD_OUTSTANDING_AMOUNT_M9,
                    PROD_OUTSTANDING_AMOUNT_M10,
                    PROD_OUTSTANDING_AMOUNT_M11,
                    PROD_OUTSTANDING_AMOUNT_M12,
                    PROD_OUTSTANDING_AMOUNT_M13,
                    PROD_OUTSTANDING_AMOUNT_M14,
                    PROD_OUTSTANDING_AMOUNT_M15,
                    PROD_OUTSTANDING_AMOUNT_M16,
                    PROD_OUTSTANDING_AMOUNT_M17,
                    PROD_OUTSTANDING_AMOUNT_M18,
                    PROD_OUTSTANDING_AMOUNT_M19,
                    PROD_OUTSTANDING_AMOUNT_M20,
                    PROD_OUTSTANDING_AMOUNT_M21,
                    PROD_OUTSTANDING_AMOUNT_M22,
                    PROD_OUTSTANDING_AMOUNT_M23,
                    PROD_OUTSTANDING_AMOUNT_M24,
                    PROD_ACCRUED_INT,
                    PROD_ADD_RATE,
                    PROD_BALLOON_AMOUNT,
                    PROD_BASIC_SALARY_AMOUNT,
                    PROD_BRANCH_SHOWROOM_ACC,
                    PROD_BRANCH_SHOWROOM_ACC_CODE,
                    PROD_BRANCH_SHOWROOM_CODE,
                    PROD_BUSINESS_POSITION,
                    PROD_CHANNEL_CODE,
                    PROD_CUR_BOOK_BAL,
                    PROD_CURR_PAY,
                    PROD_CURRENCY,
                    PROD_CUS_SUBTYPE,
                    PROD_CUSTOMER_SEGMENT,
                    PROD_DEBT_BURDEN_RATIO,
                    PROD_DEPENDENTS,
                    PROD_DEPT_CODE,
                    PROD_DISBURSEMENT_AMOUNT,
                    PROD_DISBURSEMENT_DATE,
                    PROD_DOWNPAYMENT_AMT,
                    PROD_DURATION_IN_MONTH,
                    PROD_EMP_COMPANY,
                    PROD_EMP_DEPARTMENT,
                    PROD_EMPLOYEE_TYPE,
                    PROD_EMPLOYER_CLASS_CODE,
                    PROD_EMPLOYER_ENGAGEMENT_DATE,
                    PROD_END_SERVICE_BENEFIT_AMT,
                    PROD_FEES,
                    PROD_FINANCE_AMT,
                    PROD_FIRST_APPLICATION_DATE,
                    PROD_FIRST_APPROVAL_DATE,
                    PROD_FIRST_OPEN_DATE,
                    PROD_GROSS_SALARY,
                    PROD_INSTAL_AMT,
                    PROD_INSTAL_WITH_INSURANCE,
                    PROD_LAST_APPLICATION_DATE,
                    PROD_LAST_APPROVAL_DATE,
                    PROD_LAST_OPEN_DATE,
                    PROD_LAST_PAYMENT_DATE,
                    PROD_MATURE_DATE,
                    PROD_MILITARY_RANK,
                    PROD_MONTHLY_ALLOWANCE_AMT,
                    PROD_MONTHLY_OTHER_INCOME_AMT,
                    PROD_NET_BAL,
                    PROD_NEXT_PAY_DATE,
                    PROD_NO_OF_DELINQ_INST,
                    PROD_ORIG_APPROVAL_AMT,
                    PROD_ORIG_BALANCE,
                    PROD_ORIG_PAY,
                    PROD_ORIG_PROFIT,
                    PROD_OTH_MONTHLY_DEDUCT_AMT,
                    PROD_OUTSTANDING_ACCRUAL_PFT,
                    PROD_OUTSTANDING_TOTAL_PFT,
                    PROD_PAYMENT_PRINCIPAL_AMT,
                    PROD_PRODUCT_CODE,
                    PROD_PRODUCT_TYPE,
                    PROD_PROFIT_RATE_SUB_TYPE,
                    PROD_RATE,
                    PROD_RELATION_CONTRACT_TYPE,
                    PROD_REMAIN_PAYMENTS,
                    PROD_REMAIN_TERM,
                    PROD_SALARY_TRANSFER_TYPE,
                    PROD_SALARY_TRANSFER_TYPE_CTF,
                    PROD_SALES_BRANCH,
                    PROD_SALES_CD,
                    PROD_SALES_USERID,
                    PROD_SUB_CODE,
                    PROD_TERM,
                    PROD_TOT_GRACE_PRD_PROFIT,
                    PROD_TOTAL_PAYMENTS,
                    PROD_TOTAL_EARLY_PAYMENT_AMT,
                    PROD_TOTAL_INSTALL_DUE_AMT,
                    PROD_TOTAL_NO_OPEN_CONTRACTS,
                    PROD_SPARE_101,
                    PROD_SPARE_102,
                    PROD_SPARE_103,
                    PROD_SPARE_104,
                    PROD_SPARE_105,
                    PROD_SPARE_106,
                    PROD_SPARE_107,
                    PROD_SPARE_108,
                    PROD_SPARE_109,
                    PROD_SPARE_110,
                    PROD_SPARE_111,
                    PROD_SPARE_112,
                    PROD_SPARE_113,
                    PROD_SPARE_114,
                    PROD_SPARE_115,
                    PROD_SPARE_116,
                    PROD_SPARE_117,
                    PROD_SPARE_118,
                    PROD_SPARE_119,
                    PROD_SPARE_120,
                    RESP_RL_COMMUNICATIONS,
                    RESP_RL_EDUCATION_FEES,
                    RESP_RL_FEES_ON_EXPATS,
                    RESP_RL_FOOD_BEVERAGES,
                    RESP_RL_HEALTHCARE,
                    RESP_RL_HOME_SERVANTS,
                    RESP_RL_HOUSING,
                    RESP_RL_OTHER_FUTURE_EXPENSES,
                    RESP_RL_OTHER_INCOME,
                    RESP_RL_OTHER_OBLIGATIONS,
                    RESP_RL_TOTAL_EXPENSES,
                    RESP_RL_TRANSPORT,
                    RESP_RL_UTILITIES,
                    SCOR_CIC,
                    SCOR_CODE_01,
                    SCOR_CODE_02,
                    SCOR_CODE_03,
                    SCOR_CODE_04,
                    SCOR_CODE_05,
                    SCOR_CODE_06,
                    SCOR_CODE_07,
                    SCOR_CODE_08,
                    SCOR_CODE_09,
                    SCOR_CODE_10,
                    SCOR_NATIONAL_ID,
                    SCOR_PORTFOLIO_DATE,
                    SCOR_SCORING_REQUEST_TYPE,
                    SCOR_SCORING_SOURCE,
                    SCOR_TRANSACTION_ID,
                    SIMAH_CARD_OUTSTANDING_BAL,
                    SIMAH_CARD_PRODUCT_CODE,
                    SIMAH_CARD_PRODUCT_LIMIT,
                    SIMAH_CONTRACTUAL_PAY_AUTO,
                    SIMAH_CONTRACTUAL_PAY_CRC,
                    SIMAH_CONTRACTUAL_PAY_MTG,
                    SIMAH_CONTRACTUAL_PAY_OTHER,
                    SIMAH_CONTRACTUAL_PAY_PLN,
                    SIMAH_CUR_WORST_DELINQ_AUTO,
                    SIMAH_CUR_WORST_DELINQ_CRC,
                    SIMAH_CUR_WORST_DELINQ_MTG,
                    SIMAH_CUR_WORST_DELINQ_OTHER,
                    SIMAH_CUR_WORST_DELINQ_PLN,
                    SIMAH_DEBT_BURDEN,
                    SIMAH_DEBT_BURDEN_RATIO,
                    SIMAH_NO_OF_BOUNCED_CHEQUE,
                    SIMAH_NO_OF_ENQUIRIES_12M,
                    SIMAH_NO_OF_ENQUIRIES_30D,
                    SIMAH_NO_OF_LOANS,
                    SIMAH_NO_OF_CI_DEFAULT_AUTO,
                    SIMAH_NO_OF_CI_DEFAULT_CRC,
                    SIMAH_NO_OF_CI_DEFAULT_MTG,
                    SIMAH_NO_OF_CI_DEFAULT_OTHER,
                    SIMAH_NO_OF_CI_DEFAULT_PLN,
                    SIMAH_NO_OF_DEFAULT_AUTO,
                    SIMAH_NO_OF_DEFAULT_CRC,
                    SIMAH_NO_OF_DEFAULT_MTG,
                    SIMAH_NO_OF_DEFAULT_OTHER,
                    SIMAH_NO_OF_DEFAULT_PLN,
                    SIMAH_NO_OF_EXEC_EXJUDG,
                    SIMAH_NO_OF_NOTEXEC_EXJUDG,
                    SIMAH_OUTSTAND_BAL_NOTEXJUDG,
                    SIMAH_SIMAH_SCORE,
                    SIMAH_SIMAH_SCORE_VERSION,
                    SIMAH_SUMMED_SALARY,
                    SIMAH_TOTAL_LIABILITIES,
                    SIMAH_TOTAL_LIMIT,
                    SIMAH_TOTAL_REVOLVING_LIAB,
                    SIMAH_TOTAL_REVOLVING_LIMIT,
                    SIMAH_WORST_DELINQ_24M_AUTO,
                    SIMAH_WORST_DELINQ_24M_OTHER,
                    SIMAH_WORST_DELINQ_24M_PLN,
                    SIMAH_WORST_DELINQ_24M_CRC,
                    SIMAH_WORST_DELINQ_24M_MTG,
                    SPARE_SPARE_01,
                    SPARE_SPARE_02,
                    SPARE_SPARE_03,
                    SPARE_SPARE_04,
                    SPARE_SPARE_05,
                    SPARE_SPARE_06,
                    SPARE_SPARE_07,
                    SPARE_SPARE_08,
                    SPARE_SPARE_09,
                    SPARE_SPARE_10,
                    SPARE_SPARE_11,
                    SPARE_SPARE_12,
                    SPARE_SPARE_13,
                    SPARE_SPARE_14,
                    SPARE_SPARE_15,
                    SPARE_SPARE_16,
                    SPARE_SPARE_17,
                    SPARE_SPARE_18,
                    SPARE_SPARE_19,
                    SPARE_SPARE_20,
                    SPARE_SPARE_21,
                    SPARE_SPARE_22,
                    SPARE_SPARE_23,
                    SPARE_SPARE_24,
                    SPARE_SPARE_25,
                    SPARE_SPARE_26,
                    SPARE_SPARE_27,
                    SPARE_SPARE_28,
                    SPARE_SPARE_29,
                    SPARE_SPARE_30,
                    SPARE_SPARE_31,
                    SPARE_SPARE_32,
                    SPARE_SPARE_33,
                    SPARE_SPARE_34,
                    SPARE_SPARE_35,
                    SPARE_SPARE_36,
                    SPARE_SPARE_37,
                    SPARE_SPARE_38,
                    SPARE_SPARE_39,
                    SPARE_SPARE_40,
                    SPARE_SPARE_41,
                    SPARE_SPARE_42,
                    SPARE_SPARE_43,
                    SPARE_SPARE_44,
                    SPARE_SPARE_45,
                    SPARE_SPARE_46,
                    SPARE_SPARE_47,
                    SPARE_SPARE_48,
                    SPARE_SPARE_49,
                    SPARE_SPARE_50)
                SELECT
                    REQUEST_ID,
                    RUN_ID,
                    PROCESS_STATUS,
                    CASA_AVERAGE_BAL_MONTH_M0,
                    CASA_AVERAGE_BAL_MONTH_M1,
                    CASA_AVERAGE_BAL_MONTH_M2,
                    CASA_AVERAGE_BAL_MONTH_M3,
                    CASA_AVERAGE_BAL_MONTH_M4,
                    CASA_AVERAGE_BAL_MONTH_M5,
                    CASA_AVERAGE_BAL_MONTH_M6,
                    CASA_AVERAGE_BAL_MONTH_M7,
                    CASA_AVERAGE_BAL_MONTH_M8,
                    CASA_AVERAGE_BAL_MONTH_M9,
                    CASA_AVERAGE_BAL_MONTH_M10,
                    CASA_AVERAGE_BAL_MONTH_M11,
                    CASA_AVERAGE_BAL_MONTH_M12,
                    CASA_AVERAGE_BAL_MONTH_M13,
                    CASA_AVERAGE_BAL_MONTH_M14,
                    CASA_AVERAGE_BAL_MONTH_M15,
                    CASA_AVERAGE_BAL_MONTH_M16,
                    CASA_AVERAGE_BAL_MONTH_M17,
                    CASA_AVERAGE_BAL_MONTH_M18,
                    CASA_AVERAGE_BAL_MONTH_M19,
                    CASA_AVERAGE_BAL_MONTH_M20,
                    CASA_AVERAGE_BAL_MONTH_M21,
                    CASA_AVERAGE_BAL_MONTH_M22,
                    CASA_AVERAGE_BAL_MONTH_M23,
                    CASA_AVERAGE_BAL_MONTH_M24,
                    CUST_CIC_OPEN_DATE,
                    CUST_CITY,
                    CUST_CIVIL_STATUS,
                    CUST_DATE_OF_BIRTH,
                    CUST_DISTRICT_CODE,
                    CUST_EDUCATION_LEVEL,
                    CUST_GENDER,
                    CUST_HOUSE_OWNED_STATUS,
                    CUST_LATEST_EMP_COMPANY,
                    CUST_LATEST_EMP_DEPARTMENT,
                    CUST_MARITAL_STATUS,
                    CUST_NATIONALITY,
                    CUST_NUMBER_OF_CARS,
                    CUST_OCCUPATION_TYPE,
                    CUST_REGION,
                    CUST_RESIDENT_STATUS,
                    CUST_RESIDENT_TYPE,
                    CUST_SALARY_TRANSFER_TYPE_CIF,
                    CUST_TOT_NO_ACTIVE_CONTRACTS,
                    PROD_ARMS_BOOK_VALUE,
                    PROD_ARMS_COLL_AREA,
                    PROD_ARMS_CONTRACT_NUMBER,
                    PROD_ARMS_MANUFACTURE_YEAR,
                    PROD_ARMS_MITIGANT_CODE,
                    PROD_ARMS_MITIGANT_DESC,
                    PROD_ARMS_MITIGANT_VALUE,
                    PROD_ARMS_MITIGANT_VAL_OWNER,
                    PROD_ARMS_PROPERTY_TYPE,
                    PROD_ARMS_PROP_EVAL_STATUS,
                    PROD_ARMS_REGION,
                    PROD_ARMS_VALUATION_DIFF,
                    PROD_ARMS_VEHICLE_BRAND_CAT,             
                    PROD_ARMS_VEHICLE_BRAND_NAME,
                    PROD_ARMS_VEHICLE_BRAND_TYPE,
                    PROD_ARMS_VEHI_MANUFACT_YEAR,
                    PROD_DELINQ_AMOUNT_M0,
                    PROD_DELINQ_AMOUNT_M1,
                    PROD_DELINQ_AMOUNT_M2,
                    PROD_DELINQ_AMOUNT_M3,
                    PROD_DELINQ_AMOUNT_M4,
                    PROD_DELINQ_AMOUNT_M5,
                    PROD_DELINQ_AMOUNT_M6,
                    PROD_DELINQ_AMOUNT_M7,
                    PROD_DELINQ_AMOUNT_M8,
                    PROD_DELINQ_AMOUNT_M9,
                    PROD_DELINQ_AMOUNT_M10,
                    PROD_DELINQ_AMOUNT_M11,
                    PROD_DELINQ_AMOUNT_M12,
                    PROD_DELINQ_AMOUNT_M13,
                    PROD_DELINQ_AMOUNT_M14,
                    PROD_DELINQ_AMOUNT_M15,
                    PROD_DELINQ_AMOUNT_M16,
                    PROD_DELINQ_AMOUNT_M17,
                    PROD_DELINQ_AMOUNT_M18,
                    PROD_DELINQ_AMOUNT_M19,
                    PROD_DELINQ_AMOUNT_M20,
                    PROD_DELINQ_AMOUNT_M21,
                    PROD_DELINQ_AMOUNT_M22,
                    PROD_DELINQ_AMOUNT_M23,
                    PROD_DELINQ_AMOUNT_M24,
                    PROD_DELINQ_DAYS_M0,
                    PROD_DELINQ_DAYS_M1,
                    PROD_DELINQ_DAYS_M2,
                    PROD_DELINQ_DAYS_M3,
                    PROD_DELINQ_DAYS_M4,
                    PROD_DELINQ_DAYS_M5,
                    PROD_DELINQ_DAYS_M6,
                    PROD_DELINQ_DAYS_M7,
                    PROD_DELINQ_DAYS_M8,
                    PROD_DELINQ_DAYS_M9,
                    PROD_DELINQ_DAYS_M10,
                    PROD_DELINQ_DAYS_M11,
                    PROD_DELINQ_DAYS_M12,
                    PROD_DELINQ_DAYS_M13,
                    PROD_DELINQ_DAYS_M14,
                    PROD_DELINQ_DAYS_M15,
                    PROD_DELINQ_DAYS_M16,
                    PROD_DELINQ_DAYS_M17,
                    PROD_DELINQ_DAYS_M18,
                    PROD_DELINQ_DAYS_M19,
                    PROD_DELINQ_DAYS_M20,
                    PROD_DELINQ_DAYS_M21,
                    PROD_DELINQ_DAYS_M22,
                    PROD_DELINQ_DAYS_M23,
                    PROD_DELINQ_DAYS_M24,
                    PROD_EMI_M0,
                    PROD_EMI_M1,
                    PROD_EMI_M2,
                    PROD_EMI_M3,
                    PROD_EMI_M4,
                    PROD_EMI_M5,
                    PROD_EMI_M6,
                    PROD_EMI_M7,
                    PROD_EMI_M8,
                    PROD_EMI_M9,
                    PROD_EMI_M10,
                    PROD_EMI_M11,
                    PROD_EMI_M12,
                    PROD_EMI_M13,
                    PROD_EMI_M14,
                    PROD_EMI_M15,
                    PROD_EMI_M16,
                    PROD_EMI_M17,
                    PROD_EMI_M18,
                    PROD_EMI_M19,
                    PROD_EMI_M20,
                    PROD_EMI_M21,
                    PROD_EMI_M22,
                    PROD_EMI_M23,
                    PROD_EMI_M24,
                    PROD_OUTSTANDING_AMOUNT_M0,
                    PROD_OUTSTANDING_AMOUNT_M1,
                    PROD_OUTSTANDING_AMOUNT_M2,
                    PROD_OUTSTANDING_AMOUNT_M3,
                    PROD_OUTSTANDING_AMOUNT_M4,
                    PROD_OUTSTANDING_AMOUNT_M5,
                    PROD_OUTSTANDING_AMOUNT_M6,
                    PROD_OUTSTANDING_AMOUNT_M7,
                    PROD_OUTSTANDING_AMOUNT_M8,
                    PROD_OUTSTANDING_AMOUNT_M9,
                    PROD_OUTSTANDING_AMOUNT_M10,
                    PROD_OUTSTANDING_AMOUNT_M11,
                    PROD_OUTSTANDING_AMOUNT_M12,
                    PROD_OUTSTANDING_AMOUNT_M13,
                    PROD_OUTSTANDING_AMOUNT_M14,
                    PROD_OUTSTANDING_AMOUNT_M15,
                    PROD_OUTSTANDING_AMOUNT_M16,
                    PROD_OUTSTANDING_AMOUNT_M17,
                    PROD_OUTSTANDING_AMOUNT_M18,
                    PROD_OUTSTANDING_AMOUNT_M19,
                    PROD_OUTSTANDING_AMOUNT_M20,
                    PROD_OUTSTANDING_AMOUNT_M21,
                    PROD_OUTSTANDING_AMOUNT_M22,
                    PROD_OUTSTANDING_AMOUNT_M23,
                    PROD_OUTSTANDING_AMOUNT_M24,
                    PROD_ACCRUED_INT,
                    PROD_ADD_RATE,
                    PROD_BALLOON_AMOUNT,
                    PROD_BASIC_SALARY_AMOUNT,
                    PROD_BRANCH_SHOWROOM_ACC,
                    PROD_BRANCH_SHOWROOM_ACC_CODE,
                    PROD_BRANCH_SHOWROOM_CODE,
                    PROD_BUSINESS_POSITION,
                    PROD_CHANNEL_CODE,
                    PROD_CUR_BOOK_BAL,
                    PROD_CURR_PAY,
                    PROD_CURRENCY,
                    PROD_CUS_SUBTYPE,
                    PROD_CUSTOMER_SEGMENT,
                    PROD_DEBT_BURDEN_RATIO,
                    PROD_DEPENDENTS,
                    PROD_DEPT_CODE,
                    PROD_DISBURSEMENT_AMOUNT,
                    PROD_DISBURSEMENT_DATE,
                    PROD_DOWNPAYMENT_AMT,
                    PROD_DURATION_IN_MONTH,
                    PROD_EMP_COMPANY,
                    PROD_EMP_DEPARTMENT,
                    PROD_EMPLOYEE_TYPE,
                    PROD_EMPLOYER_CLASS_CODE,
                    PROD_EMPLOYER_ENGAGEMENT_DATE,
                    PROD_END_SERVICE_BENEFIT_AMT,
                    PROD_FEES,
                    PROD_FINANCE_AMT,
                    PROD_FIRST_APPLICATION_DATE,
                    PROD_FIRST_APPROVAL_DATE,
                    PROD_FIRST_OPEN_DATE,
                    PROD_GROSS_SALARY,
                    PROD_INSTAL_AMT,
                    PROD_INSTAL_WITH_INSURANCE,
                    PROD_LAST_APPLICATION_DATE,
                    PROD_LAST_APPROVAL_DATE,
                    PROD_LAST_OPEN_DATE,
                    PROD_LAST_PAYMENT_DATE,
                    PROD_MATURE_DATE,
                    PROD_MILITARY_RANK,
                    PROD_MONTHLY_ALLOWANCE_AMT,
                    PROD_MONTHLY_OTHER_INCOME_AMT,
                    PROD_NET_BAL,
                    PROD_NEXT_PAY_DATE,
                    PROD_NO_OF_DELINQ_INST,
                    PROD_ORIG_APPROVAL_AMT,
                    PROD_ORIG_BALANCE,
                    PROD_ORIG_PAY,
                    PROD_ORIG_PROFIT,
                    PROD_OTH_MONTHLY_DEDUCT_AMT,
                    PROD_OUTSTANDING_ACCRUAL_PFT,
                    PROD_OUTSTANDING_TOTAL_PFT,
                    PROD_PAYMENT_PRINCIPAL_AMT,
                    PROD_PRODUCT_CODE,
                    PROD_PRODUCT_TYPE,
                    PROD_PROFIT_RATE_SUB_TYPE,
                    PROD_RATE,
                    PROD_RELATION_CONTRACT_TYPE,
                    PROD_REMAIN_PAYMENTS,
                    PROD_REMAIN_TERM,
                    PROD_SALARY_TRANSFER_TYPE,
                    PROD_SALARY_TRANSFER_TYPE_CTF,
                    PROD_SALES_BRANCH,
                    PROD_SALES_CD,
                    PROD_SALES_USERID,
                    PROD_SUB_CODE,
                    PROD_TERM,
                    PROD_TOT_GRACE_PRD_PROFIT,
                    PROD_TOTAL_PAYMENTS,
                    PROD_TOTAL_EARLY_PAYMENT_AMT,
                    PROD_TOTAL_INSTALL_DUE_AMT,
                    PROD_TOTAL_NO_OPEN_CONTRACTS,
                    PROD_SPARE_101,
                    PROD_SPARE_102,
                    PROD_SPARE_103,
                    PROD_SPARE_104,
                    PROD_SPARE_105,
                    PROD_SPARE_106,
                    PROD_SPARE_107,
                    PROD_SPARE_108,
                    PROD_SPARE_109,
                    PROD_SPARE_110,
                    PROD_SPARE_111,
                    PROD_SPARE_112,
                    PROD_SPARE_113,
                    PROD_SPARE_114,
                    PROD_SPARE_115,
                    PROD_SPARE_116,
                    PROD_SPARE_117,
                    PROD_SPARE_118,
                    PROD_SPARE_119,
                    PROD_SPARE_120,
                    RESP_RL_COMMUNICATIONS,
                    RESP_RL_EDUCATION_FEES,
                    RESP_RL_FEES_ON_EXPATS,
                    RESP_RL_FOOD_BEVERAGES,
                    RESP_RL_HEALTHCARE,
                    RESP_RL_HOME_SERVANTS,
                    RESP_RL_HOUSING,
                    RESP_RL_OTHER_FUTURE_EXPENSES,
                    RESP_RL_OTHER_INCOME,
                    RESP_RL_OTHER_OBLIGATIONS,
                    RESP_RL_TOTAL_EXPENSES,
                    RESP_RL_TRANSPORT,
                    RESP_RL_UTILITIES,
                    SCOR_CIC,
                    SCOR_CODE_01,
                    SCOR_CODE_02,
                    SCOR_CODE_03,
                    SCOR_CODE_04,
                    SCOR_CODE_05,
                    SCOR_CODE_06,
                    SCOR_CODE_07,
                    SCOR_CODE_08,
                    SCOR_CODE_09,
                    SCOR_CODE_10,
                    SCOR_NATIONAL_ID,
                    SCOR_PORTFOLIO_DATE,
                    SCOR_SCORING_REQUEST_TYPE,
                    SCOR_SCORING_SOURCE,
                    SCOR_TRANSACTION_ID,
                    SIMAH_CARD_OUTSTANDING_BAL,
                    SIMAH_CARD_PRODUCT_CODE,
                    SIMAH_CARD_PRODUCT_LIMIT,
                    SIMAH_CONTRACTUAL_PAY_AUTO,
                    SIMAH_CONTRACTUAL_PAY_CRC,
                    SIMAH_CONTRACTUAL_PAY_MTG,
                    SIMAH_CONTRACTUAL_PAY_OTHER,
                    SIMAH_CONTRACTUAL_PAY_PLN,
                    SIMAH_CUR_WORST_DELINQ_AUTO,
                    SIMAH_CUR_WORST_DELINQ_CRC,
                    SIMAH_CUR_WORST_DELINQ_MTG,
                    SIMAH_CUR_WORST_DELINQ_OTHER,
                    SIMAH_CUR_WORST_DELINQ_PLN,
                    SIMAH_DEBT_BURDEN,
                    SIMAH_DEBT_BURDEN_RATIO,
                    SIMAH_NO_OF_BOUNCED_CHEQUE,
                    SIMAH_NO_OF_ENQUIRIES_12M,
                    SIMAH_NO_OF_ENQUIRIES_30D,
                    SIMAH_NO_OF_LOANS,
                    SIMAH_NO_OF_CI_DEFAULT_AUTO,
                    SIMAH_NO_OF_CI_DEFAULT_CRC,
                    SIMAH_NO_OF_CI_DEFAULT_MTG,
                    SIMAH_NO_OF_CI_DEFAULT_OTHER,
                    SIMAH_NO_OF_CI_DEFAULT_PLN,
                    SIMAH_NO_OF_DEFAULT_AUTO,
                    SIMAH_NO_OF_DEFAULT_CRC,
                    SIMAH_NO_OF_DEFAULT_MTG,
                    SIMAH_NO_OF_DEFAULT_OTHER,
                    SIMAH_NO_OF_DEFAULT_PLN,
                    SIMAH_NO_OF_EXEC_EXJUDG,
                    SIMAH_NO_OF_NOTEXEC_EXJUDG,
                    SIMAH_OUTSTAND_BAL_NOTEXJUDG,
                    SIMAH_SIMAH_SCORE,
                    SIMAH_SIMAH_SCORE_VERSION,
                    SIMAH_SUMMED_SALARY,
                    SIMAH_TOTAL_LIABILITIES,
                    SIMAH_TOTAL_LIMIT,
                    SIMAH_TOTAL_REVOLVING_LIAB,
                    SIMAH_TOTAL_REVOLVING_LIMIT,
                    SIMAH_WORST_DELINQ_24M_AUTO,
                    SIMAH_WORST_DELINQ_24M_OTHER,
                    SIMAH_WORST_DELINQ_24M_PLN,
                    SIMAH_WORST_DELINQ_24M_CRC,
                    SIMAH_WORST_DELINQ_24M_MTG,
                    SPARE_SPARE_01,
                    SPARE_SPARE_02,
                    SPARE_SPARE_03,
                    SPARE_SPARE_04,
                    SPARE_SPARE_05,
                    SPARE_SPARE_06,
                    SPARE_SPARE_07,
                    SPARE_SPARE_08,
                    SPARE_SPARE_09,
                    SPARE_SPARE_10,
                    SPARE_SPARE_11,
                    SPARE_SPARE_12,
                    SPARE_SPARE_13,
                    SPARE_SPARE_14,
                    SPARE_SPARE_15,
                    SPARE_SPARE_16,
                    SPARE_SPARE_17,
                    SPARE_SPARE_18,
                    SPARE_SPARE_19,
                    SPARE_SPARE_20,
                    SPARE_SPARE_21,
                    SPARE_SPARE_22,
                    SPARE_SPARE_23,
                    SPARE_SPARE_24,
                    SPARE_SPARE_25,
                    SPARE_SPARE_26,
                    SPARE_SPARE_27,
                    SPARE_SPARE_28,
                    SPARE_SPARE_29,
                    SPARE_SPARE_30,
                    SPARE_SPARE_31,
                    SPARE_SPARE_32,
                    SPARE_SPARE_33,
                    SPARE_SPARE_34,
                    SPARE_SPARE_35,
                    SPARE_SPARE_36,
                    SPARE_SPARE_37,
                    SPARE_SPARE_38,
                    SPARE_SPARE_39,
                    SPARE_SPARE_40,
                    SPARE_SPARE_41,
                    SPARE_SPARE_42,
                    SPARE_SPARE_43,
                    SPARE_SPARE_44,
                    SPARE_SPARE_45,
                    SPARE_SPARE_46,
                    SPARE_SPARE_47,
                    SPARE_SPARE_48,
                    SPARE_SPARE_49,
                    SPARE_SPARE_50
                FROM B_SCORE_REQUEST
                WHERE RUN_ID = RUN_ID_RES.RUN_ID;                                  
                V_ROWCOUNT := V_ROWCOUNT + SQL%ROWCOUNT;    
            EXCEPTION    
                WHEN OTHERS THEN
                    V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                                  SQLERRM || ' -- Error in moving data into B_SCORE_REQUEST_HIST -- STOPPED';
                    DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
                    PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,RUN_ID_RES.RUN_ID);
                    P_STATUS := 1;
            END;
              --  Logging the completion of moving data into B_SCORE_REQUEST_HIST 
              V_LOG_MSG := 'Records are successfully moved into B_SCORE_REQUEST_HIST, RECORD_COUNT = ' || V_ROWCOUNT ;
              DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
              PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'I',NULL,V_LOG_MSG,RUN_ID_RES.RUN_ID);
              COMMIT;
              V_ROWCOUNT := 0;        
              --  Moving data into B_SCORE_REQUEST_HIST -- END
        EXCEPTION
            WHEN OTHERS THEN
            V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                          SQLERRM || ' -- Error in the RUN_ID cursor for B_SCORE_REQUEST -- STOPPED';
            DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
            PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'I',NULL,V_LOG_MSG,RUN_ID_RES.RUN_ID);
            P_STATUS := 1;
        END;
    END LOOP; 

    BEGIN
        V_SQL_STMT := 'TRUNCATE TABLE B_SCORE_REQUEST';
        EXECUTE IMMEDIATE V_SQL_STMT;
    EXCEPTION 
        WHEN OTHERS THEN
        V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                      SQLERRM || ' -- Error in truncating B_SCORE_REQUEST table -- STOPPED';
        DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
        PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'IA',NULL,V_LOG_MSG,V_RUN_ID);
        P_STATUS := 1;
        RETURN;
    END;

EXCEPTION
  WHEN OTHERS THEN
    V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '|| 
                  SQLERRM ||' -- Error in MOVE_DATA_B_SCORE_REQUEST -- ROLLBACKED';
    DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
    PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,V_RUN_ID);
    ROLLBACK;      
    P_STATUS := 1;   
END MOVE_DATA_B_SCORE_REQUEST;    
---------------------------------------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------  
---------------------------------------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------------------------------------------

PROCEDURE MOVE_DATA_LGD_REQUEST (P_STATUS OUT NUMBER) AS
    /******************************************************************************
    NAME:    MOVE_DATA_LGD_REQUEST
    PURPOSE: Move data from LGD_REQUEST to LGD_REUEST_HIST.
    COMPANY: EJADA SYSTEMS

    REVISIONS:
    Version   Date        Author
    --------- ----------- ---------------
    1.0       17-APRIL-2020  msfarghaly@ejada.com

    ******************************************************************************/
    --  General use variable declaration
    V_ROWCOUNT                                        NUMBER(9)         := 0;
    V_LOG_MSG                                         VARCHAR2(1000)    := NULL;
    V_LOG_PARAM                                       VARCHAR2(250)     := NULL;
    V_PROCEDURE_NAME                                  VARCHAR(32)       := 'MOVE_DATA_LGD_REQUEST';
    V_PACKAGE_NAME                                    VARCHAR(32)       := 'DATA_LOAD';
    V_SQL_STMT                                        CLOB;
    V_RUN_ID_QUERY                                    CLOB;
    V_RUN_ID                                          NUMBER := 0;
    -------------------------------------------------------------------------------
    RUN_ID_CUR         SYS_REFCURSOR;

    TYPE RUN_ID_REC IS RECORD
    (
        RUN_ID                        NUMBER
    );

    RUN_ID_RES                      RUN_ID_REC;
    -------------------------------------------------------------------------------
BEGIN
    --  Moving data into LGD_REQUEST_HIST -- START
    P_STATUS := 0;

    V_RUN_ID_QUERY := 
    'SELECT DISTINCT    RUN_ID AS RUN_ID
    FROM                LGD_REQUEST
    ORDER BY            RUN_ID';

    OPEN RUN_ID_CUR FOR V_RUN_ID_QUERY;
    LOOP
        BEGIN
            FETCH RUN_ID_CUR INTO RUN_ID_RES;              
            EXIT WHEN RUN_ID_CUR%NOTFOUND;

            /*
            BEGIN
                UPDATE  LGD_REQUEST REQ
                SET     REQ.PROCESS_STATUS = 'Failed'
                WHERE   REQ.REQUEST_ID NOT IN (
                        SELECT  DISTINCT RES.REQUEST_ID
                        FROM    LGD_RESPONSE RES
                        WHERE   RES.RUN_ID = RUN_ID_RES.RUN_ID)
                AND     REQ.RUN_ID = RUN_ID_RES.RUN_ID;                        
                V_ROWCOUNT := V_ROWCOUNT + SQL%ROWCOUNT;      
            EXCEPTION    
                WHEN OTHERS THEN
                    V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                                  SQLERRM || ' -- Error in updating data in LGD_REQUEST -- STOPPED';
                    DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
                    PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,RUN_ID_RES.RUN_ID);
                    P_STATUS := 1;
            END;
              --  Logging the completion of updating failed records data into LGD_REQUEST
              V_LOG_MSG := 'Records are successfully updated in LGD_REQUEST, RECORD_COUNT = ' || V_ROWCOUNT ;
              DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
              PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'I',NULL,V_LOG_MSG,RUN_ID_RES.RUN_ID);
              COMMIT;
              V_ROWCOUNT := 0;   
            */

            BEGIN
                INSERT INTO LGD_REQUEST_HIST(
                    REQUEST_ID,
                    RUN_ID,
                    CIC,
                    PROCESS_STATUS,
                    CONT_ACCOUNT_ID,
                    CONT_CONTRACT_NUMBER,
                    CONT_BALLOON_PAYMENT,
                    CONT_DOWN_PAYMENT,
                    CONT_OPEN_DATE,
                    CONT_DISBURSEMENT_AMOUNT,
                    CONT_PRINCIPAL_OUTSTANDING,
                    CONT_DURATION_OF_CONTARCT,
                    CONT_PRICE_AT_ORIGINATION,
                    CONT_DURATION_MONTHS,
                    CASHFLOW_DATE,
                    PRODUCT_CODE,
                    SALARY_TRANSFER_TYPE,
                    MILITARY_RANK,
                    CAR_MAKE_YEAR,
                    PROPERTY_VALUE_ACQUISITION,
                    NEW
                     )
                SELECT
                    REQUEST_ID,
                    RUN_ID,
                    CIC,
                    PROCESS_STATUS,
                    CONT_ACCOUNT_ID,
                    CONT_CONTRACT_NUMBER,
                    CONT_BALLOON_PAYMENT,
                    CONT_DOWN_PAYMENT,
                    CONT_OPEN_DATE,
                    CONT_DISBURSEMENT_AMOUNT,
                    CONT_PRINCIPAL_OUTSTANDING,
                    CONT_DURATION_OF_CONTARCT,
                    CONT_PRICE_AT_ORIGINATION,
                    CONT_DURATION_MONTHS,
                    CASHFLOW_DATE,
                    PRODUCT_CODE,
                    SALARY_TRANSFER_TYPE,
                    MILITARY_RANK,
                    CAR_MAKE_YEAR,
                    PROPERTY_VALUE_ACQUISITION,
                    NEW
                FROM LGD_REQUEST
                WHERE RUN_ID = RUN_ID_RES.RUN_ID;                                  
                V_ROWCOUNT := V_ROWCOUNT + SQL%ROWCOUNT;    
            EXCEPTION    
                WHEN OTHERS THEN
                    V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                                  SQLERRM || ' -- Error in moving data into LGD_REQUEST_HIST -- STOPPED';
                    DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
                    PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,RUN_ID_RES.RUN_ID);
                    P_STATUS := 1;
            END;
              --  Logging the completion of moving data into LGD_REQUEST_HIST 
              V_LOG_MSG := 'Records are successfully moved into LGD_REQUEST_HIST, RECORD_COUNT = ' || V_ROWCOUNT ;
              DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
              PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'I',NULL,V_LOG_MSG,RUN_ID_RES.RUN_ID);
              COMMIT;
              V_ROWCOUNT := 0;        
              --  Moving data into LGD_REQUEST_HIST -- END
        EXCEPTION
            WHEN OTHERS THEN
            V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                          SQLERRM || ' -- Error in the RUN_ID cursor for LGD_REQUEST -- STOPPED';
            DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
            PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'I',NULL,V_LOG_MSG,RUN_ID_RES.RUN_ID);
            P_STATUS := 1;
        END;
    END LOOP; 

    BEGIN
        V_SQL_STMT := 'TRUNCATE TABLE LGD_REQUEST';
        EXECUTE IMMEDIATE V_SQL_STMT;
    EXCEPTION 
        WHEN OTHERS THEN
        V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                      SQLERRM || ' -- Error in truncating LGD_REQUEST table -- STOPPED';
        DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
        PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'IA',NULL,V_LOG_MSG,V_RUN_ID);
        P_STATUS := 1;
        RETURN;
    END;

EXCEPTION
  WHEN OTHERS THEN
    V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '|| 
                  SQLERRM ||' -- Error in MOVE_DATA_LGD_REQUEST -- ROLLBACKED';
    DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
    PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,V_RUN_ID);
    ROLLBACK;      
    P_STATUS := 1;   
END MOVE_DATA_LGD_REQUEST;
------------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------------------
PROCEDURE LOAD_STG_SCORE_REQUEST (P_STATUS OUT NUMBER) AS
    /******************************************************************************
    NAME:    LOAD_STG_SCORE_REQUEST
    PURPOSE: Insert Data into STG_SCORE_REQUEST table.
    COMPANY: EJADA SYSTEMS

    REVISIONS:
    Version   Date        Author
    --------- ----------- ---------------
    1.0       24-AUG-2020  mgebba@ejada.com

    ******************************************************************************/
    --  General use variable declaration
    V_ROWCOUNT                      NUMBER(9) := 0;
    V_LOG_MSG                       VARCHAR2(1000) := NULL;
    V_LOG_PARAM                     VARCHAR2(250)  := NULL;
    V_PROCEDURE_NAME                VARCHAR(32)    := 'LOAD_STG_SCORE_REQUEST';
    V_PACKAGE_NAME                  VARCHAR(32)    := 'DATA_LOAD';
    V_SQL_STMT                      CLOB;
    V_RUN_ID                        NUMBER := 0;
    -------------------------------------------------------------------------------
BEGIN

    P_STATUS := 0;

    --  Generating RUN_ID -- START
    BEGIN
        SELECT RUN_ID_SEQUENCE.NEXTVAL INTO V_RUN_ID FROM DUAL ;
    EXCEPTION
        WHEN OTHERS THEN
        V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                      SQLERRM || ' -- Error in fetching RUN_ID from RUN_ID_SEQ -- STOPPED';
        DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
        PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,V_RUN_ID);
    END;
   --  Generating RUN_ID -- END

    --  Updating aggregation completion flag in APP_PARAM -- START   
    BEGIN
        UPDATE  APP_PARAM 
        SET     ATTRIBUTE_VALUE_C1 = 0,
                ATTRIBUTE_VALUE_C2 = 0                
        WHERE   PARAM_CODE = 'AGG_COMPLETE';        
    EXCEPTION 
        WHEN OTHERS THEN
        V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                      SQLERRM || ' -- Error in updating aggregation completion flag in APP_PARAM table -- STOPPED';
        DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
        PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,V_RUN_ID);
    END;
    --  Updating aggregation completion flag in APP_PARAM -- END
    COMMIT; 

    /*
    --  truncating STG_SCORE_REQUEST Data -- START
    BEGIN
        V_SQL_STMT := 'TRUNCATE TABLE STG_SCORE_REQUEST';
        EXECUTE IMMEDIATE V_SQL_STMT;
    EXCEPTION
        WHEN OTHERS THEN
        V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                      SQLERRM || ' -- Error in truncating STG_SCORE_REQUEST table -- STOPPED';
        DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
        PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,V_RUN_ID);
    END;
    --  truncating STG_SCORE_REQUEST Data -- END   

    --  Moving EXPR_CONT duplicate data to bad records table -- START
    BEGIN
        INSERT INTO EXPR_CONT_BAD_RECORDS
        SELECT  V_RUN_ID, CONT.*
                FROM    EXPR_CONT CONT
                WHERE   ROWID NOT IN (
                        SELECT      MIN(ROWID)
                        FROM        EXPR_CONT
                        GROUP BY    AS_OF_DATE, CONTRACT_NUMBER);
        V_ROWCOUNT := V_ROWCOUNT + SQL%ROWCOUNT;                           
    EXCEPTION
        WHEN OTHERS THEN
        V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                      SQLERRM || ' -- Error in moving duplicate data for EXPR_CONT table to bad records table -- STOPPED';
        DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
        PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,V_RUN_ID);
    END;
      --  Logging the completion of inserting data into EXPR_CONT_BAD_RECORDS
      V_LOG_MSG := 'Records are successfully inserted into EXPR_CONT_BAD_RECORDS, RECORD_COUNT = ' || V_ROWCOUNT ;
      DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
      PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'I',NULL,V_LOG_MSG,V_RUN_ID);
      COMMIT;
      V_ROWCOUNT := 0;    
    --  Moving EXPR_CONT duplicate data to bad records table  -- END

    --  Moving EXPR_CUST duplicate data to bad records table -- START
    BEGIN
        INSERT INTO EXPR_CUST_BAD_RECORDS
        SELECT  V_RUN_ID, CUST.*
                FROM    EXPR_CUST CUST
                WHERE   ROWID NOT IN (
                        SELECT      MIN(ROWID)
                        FROM        EXPR_CUST
                        GROUP BY    CUSTOMER_NUMBER);
        V_ROWCOUNT := V_ROWCOUNT + SQL%ROWCOUNT;                                    
    EXCEPTION
        WHEN OTHERS THEN
        V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                      SQLERRM || ' -- Error in moving duplicate data for EXPR_CUST table to bad records table -- STOPPED';
        DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
        PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,V_RUN_ID);
    END;
      --  Logging the completion of inserting data into EXPR_CUST_BAD_RECORDS
      V_LOG_MSG := 'Records are successfully inserted into EXPR_CUST_BAD_RECORDS, RECORD_COUNT = ' || V_ROWCOUNT ;
      DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
      PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'I',NULL,V_LOG_MSG,V_RUN_ID);
      COMMIT;
      V_ROWCOUNT := 0;     
    --  Moving EXPR_CUST duplicate data to bad records table  -- END

    --  Moving EXPR_SIMAH duplicate data to bad records table -- START
    BEGIN
        INSERT INTO EXPR_SIMAH_BAD_RECORDS
        SELECT  V_RUN_ID, SIMAH.*
                FROM    EXPR_SIMAH SIMAH 
                WHERE   ROWID NOT IN (
                        SELECT      MIN(ROWID)
                        FROM        EXPR_SIMAH
                        GROUP BY    AS_OF_DATE, CONTRACT_NUMBER);   
        V_ROWCOUNT := V_ROWCOUNT + SQL%ROWCOUNT;                                 
    EXCEPTION
        WHEN OTHERS THEN
        V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                      SQLERRM || ' -- Error in moving duplicate data for EXPR_SIMAH table to bad records table -- STOPPED';
        DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
        PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,V_RUN_ID);
    END;
      --  Logging the completion of inserting data into EXPR_SIMAH_BAD_RECORDS
      V_LOG_MSG := 'Records are successfully inserted into EXPR_SIMAH_BAD_RECORDS, RECORD_COUNT = ' || V_ROWCOUNT ;
      DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
      PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'I',NULL,V_LOG_MSG,V_RUN_ID);
      COMMIT;
      V_ROWCOUNT := 0;     
    --  Moving EXPR_SIMAH duplicate data to bad records table  -- END

    --  Deleting EXPR_CONT duplicate data -- START
    BEGIN
        DELETE  EXPR_CONT
        WHERE   ROWID NOT IN (
                    SELECT      MIN(ROWID)
                    FROM        EXPR_CONT
                    GROUP BY    AS_OF_DATE, CONTRACT_NUMBER);
        V_ROWCOUNT := V_ROWCOUNT + SQL%ROWCOUNT;                           
    EXCEPTION
        WHEN OTHERS THEN
        V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                      SQLERRM || ' -- Error in deleting duplicate data for EXPR_CONT table -- STOPPED';
        DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
        PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,V_RUN_ID);
    END;
      --  Logging the completion of deleting data from EXPR_CONT
      V_LOG_MSG := 'Records are successfully deleted from EXPR_CONT, RECORD_COUNT = ' || V_ROWCOUNT ;
      DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
      PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'I',NULL,V_LOG_MSG,V_RUN_ID);
      COMMIT;
      V_ROWCOUNT := 0;        
    --  Deleting EXPR_CONT duplicate data  -- END

    --  Deleting EXPR_CUST duplicate data -- START
    BEGIN
        DELETE  EXPR_CUST
        WHERE   ROWID NOT IN (
                    SELECT      MIN(ROWID)
                    FROM        EXPR_CUST
                    GROUP BY    CUSTOMER_NUMBER);
        V_ROWCOUNT := V_ROWCOUNT + SQL%ROWCOUNT;                           
    EXCEPTION
        WHEN OTHERS THEN
        V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                      SQLERRM || ' -- Error in deleting duplicate data for EXPR_CUST table -- STOPPED';
        DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
        PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,V_RUN_ID);
    END;
      --  Logging the completion of deleting data from EXPR_CUST
      V_LOG_MSG := 'Records are successfully deleted from EXPR_CUST, RECORD_COUNT = ' || V_ROWCOUNT ;
      DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
      PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'I',NULL,V_LOG_MSG,V_RUN_ID);
      COMMIT;
      V_ROWCOUNT := 0;        
    --  Deleting EXPR_CUST duplicate data  -- END

    --  Deleting EXPR_SIMAH duplicate data -- START
    BEGIN
        DELETE  EXPR_SIMAH
        WHERE   ROWID NOT IN (
                    SELECT      MIN(ROWID)
                    FROM        EXPR_SIMAH
                    GROUP BY    AS_OF_DATE, CONTRACT_NUMBER);    
        V_ROWCOUNT := V_ROWCOUNT + SQL%ROWCOUNT;                           
    EXCEPTION
        WHEN OTHERS THEN
        V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                      SQLERRM || ' -- Error in deleting duplicate data for EXPR_SIMAH table -- STOPPED';
        DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
        PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,V_RUN_ID);
    END;
      --  Logging the completion of deleting data from EXPR_SIMAH
      V_LOG_MSG := 'Records are successfully deleted from EXPR_SIMAH, RECORD_COUNT = ' || V_ROWCOUNT ;
      DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
      PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'I',NULL,V_LOG_MSG,V_RUN_ID);
      COMMIT;
      V_ROWCOUNT := 0;        
    --  Deleting EXPR_SIMAH duplicate data  -- END
    */
    
    --  Inserting Data into STG_SCORE_REQUEST -- START   
    BEGIN
        INSERT INTO STG_SCORE_REQUEST (
                RUN_ID,
                RUN_DATE,
                CONTRACT_NUMBER,
                CIC,
                PRODUCT_CODE,
                SALARY_TRANSFER,
                OPEN_DATE,
                BRANCH_SHOWROOM_ACC,
                EMP_COMPANY,
                EMP_DEPARTMENT,
                MILITARY_RANK,
                DURATION_IN_MONTH,
                GROSS_SALARY,
                DEPENDENTS,
                DATE_OF_BIRTH,
                EMPLOYER_ENGAGEMENT_DT,
                ARMS_PROPERTY_TYPE,
                ARMS_REGION,
                DOWNPAYMENT_AMT,
                BALLOON_AMOUNT,
                ARMS_VEHICLE_BRAND_NAME,
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
                CIC_OPEN_DATE,
                ACCRUED_INT,
                BASIC_SALARY_AMOUNT,
                BRANCH_SHOWROOM_ACCOUNT,
                BRANCH_SHOWROOM_ACCOUNT_CODE,
                BRANCH_SHOWROOM_CODE,
                BUSINESS_POSITION,
                CHANNEL_CODE,
                CURRENCY,
                CUS_SUBTYPE,
                DEPT_CODE,
                DISBURSEMENT_AMOUNT,
                DISBURSEMENT_DATE,
                EMPLOYEE_TYPE,
                EMPLOYER_CLASS_CODE,
                END_OF_SERVICE_BENEFIT_AMOUNT,
                FEES,
                FINANCE_AMT,
                INSTAL_AMT,
                MATURE_DATE,
                MONTHLY_ALLOWANCE_AMOUNT,
                MONTHLY_OTHER_INCOME_AMOUNT,
                NO_OF_DELINQ_INST,
                ORIG_BALANCE,
                ORIG_PROFIT,
                PAYMENT_PRINCIPAL_AMT,
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
                SCORING_REQUEST_TYPE,
                SCORING_SOURCE,
                NATIONAL_ID,
                PORTFOLIO_DATE,
                TOTAL_REVOLVING_LIMIT,
                TOTAL_REVOLVING_LIAB,
                NO_OF_ENQUIRIES_30D,
                CARD_PRODUCT_LIMIT,
                CARD_OUTSTANDING_BALANCE,
                ACCOUNT_1,
                APPLICATION_DATE,
                APPROVAL_DATE,
                BRANCH_LOAN_APPLIED,
                LAST_PAYMENT,
                NEXT_PAY,
                ORG_UNIT,
                ORIG_TERM,
                PAY_FREQUENCY,
                FTV)
           SELECT 
                V_RUN_ID,
                N.AS_OF_DATE AS RUN_DATE,
                N.CONTRACT_NUMBER AS CONTRACT_NUMBER,
                N.CIC AS CIC,
                N.LOAN_PRODUCT_CODE AS PRODUCT_CODE,
                LTRIM(N.SALARY_TRANSFER_TYPE_CTF,'0') AS SALARY_TRANSFER,
                N.OPEN_DATE AS OPEN_DATE,
                N.BRANCH_SHOWROOM_ACC AS BRANCH_SHOWROOM_ACC,
                N.EMP_COMPANY AS EMP_COMPANY,
                N.DEPT_CODE AS EMP_DEPARTMENT,
                N.MILITARY_RANK AS MILITARY_RANK,
                N.DURATION_IN_MONTH AS DURATION_IN_MONTH,
                N.GROSS_SALARY AS GROSS_SALARY,
                N.DEPENDENTS AS DEPENDENTS,
                C.CUSTOMER_DATE_OF_BIRTH AS DATE_OF_BIRTH,
                N.EMPLOYER_ENGAGEMENT_DT AS EMPLOYER_ENGAGEMENT_DT,
                N.ARMS_PROPERTY_TYPE AS ARMS_PROPERTY_TYPE,
                N.ARMS_REGION AS ARMS_REGION,
                N.DOWNPAYMENT_AMT AS DOWNPAYMENT_AMT,
                N.BALLOON_PAYMENT_PERCENTAGE * N.ORIG_BALANCE / 100 AS BALLOON_AMOUNT,
                N.ARMS_VEHICLE_BRAND_NAME AS ARMS_VEHICLE_BRAND_NAME,
                N.RATE AS RATE,
                N.ADD_RATE AS ADD_RATE,
                N.ORIG_APPROVAL_AMT AS ORIG_APPROVAL_AMT,
                N.SUB_CODE AS SUB_CODE,
                N.DELINQ_DAYS AS DELINQ_DAYS,
                N.PRINCIPAL_OUTSTANDING AS PRINCIPAL_OUTSTANDING,
                N.DELQ_DAYS_M24 AS DELINQ_DAYS_M24,
                N.DELQ_DAYS_M23 AS DELINQ_DAYS_M23,
                N.DELQ_DAYS_M22 AS DELINQ_DAYS_M22,
                N.DELQ_DAYS_M21 AS DELINQ_DAYS_M21,
                N.DELQ_DAYS_M20 AS DELINQ_DAYS_M20,
                N.DELQ_DAYS_M19 AS DELINQ_DAYS_M19,
                N.DELQ_DAYS_M18 AS DELINQ_DAYS_M18,
                N.DELQ_DAYS_M17 AS DELINQ_DAYS_M17,
                N.DELQ_DAYS_M16 AS DELINQ_DAYS_M16,
                N.DELQ_DAYS_M15 AS DELINQ_DAYS_M15,
                N.DELQ_DAYS_M14 AS DELINQ_DAYS_M14,
                N.DELQ_DAYS_M13 AS DELINQ_DAYS_M13,
                N.DELQ_DAYS_M12 AS DELINQ_DAYS_M12,
                N.DELQ_DAYS_M11 AS DELINQ_DAYS_M11,
                N.DELQ_DAYS_M10 AS DELINQ_DAYS_M10,
                N.DELQ_DAYS_M09 AS DELINQ_DAYS_M9,
                N.DELQ_DAYS_M08 AS DELINQ_DAYS_M8,
                N.DELQ_DAYS_M07 AS DELINQ_DAYS_M7,
                N.DELQ_DAYS_M06 AS DELINQ_DAYS_M6,
                N.DELQ_DAYS_M05 AS DELINQ_DAYS_M5,
                N.DELQ_DAYS_M04 AS DELINQ_DAYS_M4,
                N.DELQ_DAYS_M03 AS DELINQ_DAYS_M3,
                N.DELQ_DAYS_M02 AS DELINQ_DAYS_M2,
                N.DELQ_DAYS_M01 AS DELINQ_DAYS_M1,
                N.DELQ_DAYS_M0 AS DELINQ_DAYS_M0,
                N.EMI_M24 AS EMI_M24,
                N.EMI_M23 AS EMI_M23,
                N.EMI_M22 AS EMI_M22,
                N.EMI_M21 AS EMI_M21,
                N.EMI_M20 AS EMI_M20,
                N.EMI_M19 AS EMI_M19,
                N.EMI_M18 AS EMI_M18,
                N.EMI_M17 AS EMI_M17,
                N.EMI_M16 AS EMI_M16,
                N.EMI_M15 AS EMI_M15,
                N.EMI_M14 AS EMI_M14,
                N.EMI_M13 AS EMI_M13,
                N.EMI_M12 AS EMI_M12,
                N.EMI_M11 AS EMI_M11,
                N.EMI_M10 AS EMI_M10,
                N.EMI_M09 AS EMI_M9,
                N.EMI_M08 AS EMI_M8,
                N.EMI_M07 AS EMI_M7,
                N.EMI_M06 AS EMI_M6,
                N.EMI_M05 AS EMI_M5,
                N.EMI_M04 AS EMI_M4,
                N.EMI_M03 AS EMI_M3,
                N.EMI_M02 AS EMI_M2,
                N.EMI_M01 AS EMI_M1,
                N.EMI_M00 AS EMI_M0,
                N.DELQ_AMT_M24 AS DELINQ_AMOUNT_M24,
                N.DELQ_AMT_M23 AS DELINQ_AMOUNT_M23,
                N.DELQ_AMT_M22 AS DELINQ_AMOUNT_M22,
                N.DELQ_AMT_M21 AS DELINQ_AMOUNT_M21,
                N.DELQ_AMT_M20 AS DELINQ_AMOUNT_M20,
                N.DELQ_AMT_M19 AS DELINQ_AMOUNT_M19,
                N.DELQ_AMT_M18 AS DELINQ_AMOUNT_M18,
                N.DELQ_AMT_M17 AS DELINQ_AMOUNT_M17,
                N.DELQ_AMT_M16 AS DELINQ_AMOUNT_M16,
                N.DELQ_AMT_M15 AS DELINQ_AMOUNT_M15,
                N.DELQ_AMT_M14 AS DELINQ_AMOUNT_M14,
                N.DELQ_AMT_M13 AS DELINQ_AMOUNT_M13,
                N.DELQ_AMT_M12 AS DELINQ_AMOUNT_M12,
                N.DELQ_AMT_M11 AS DELINQ_AMOUNT_M11,
                N.DELQ_AMT_M10 AS DELINQ_AMOUNT_M10,
                N.DELQ_AMT_M09 AS DELINQ_AMOUNT_M9,
                N.DELQ_AMT_M08 AS DELINQ_AMOUNT_M8,
                N.DELQ_AMT_M07 AS DELINQ_AMOUNT_M7,
                N.DELQ_AMT_M06 AS DELINQ_AMOUNT_M6,
                N.DELQ_AMT_M05 AS DELINQ_AMOUNT_M5,
                N.DELQ_AMT_M04 AS DELINQ_AMOUNT_M4,
                N.DELQ_AMT_M03 AS DELINQ_AMOUNT_M3,
                N.DELQ_AMT_M02 AS DELINQ_AMOUNT_M2,
                N.DELQ_AMT_M01 AS DELINQ_AMOUNT_M1,
                N.DELQ_AMT_M00 AS DELINQ_AMOUNT_M0,
                N.OUTSTANDING_AMOUNT_M24 AS OUTSTANDING_AMOUNT_M24,
                N.OUTSTANDING_AMOUNT_M23 AS OUTSTANDING_AMOUNT_M23,
                N.OUTSTANDING_AMOUNT_M22 AS OUTSTANDING_AMOUNT_M22,
                N.OUTSTANDING_AMOUNT_M21 AS OUTSTANDING_AMOUNT_M21,
                N.OUTSTANDING_AMOUNT_M20 AS OUTSTANDING_AMOUNT_M20,
                N.OUTSTANDING_AMOUNT_M19 AS OUTSTANDING_AMOUNT_M19,
                N.OUTSTANDING_AMOUNT_M18 AS OUTSTANDING_AMOUNT_M18,
                N.OUTSTANDING_AMOUNT_M17 AS OUTSTANDING_AMOUNT_M17,
                N.OUTSTANDING_AMOUNT_M16 AS OUTSTANDING_AMOUNT_M16,
                N.OUTSTANDING_AMOUNT_M15 AS OUTSTANDING_AMOUNT_M15,
                N.OUTSTANDING_AMOUNT_M14 AS OUTSTANDING_AMOUNT_M14,
                N.OUTSTANDING_AMOUNT_M13 AS OUTSTANDING_AMOUNT_M13,
                N.OUTSTANDING_AMOUNT_M12 AS OUTSTANDING_AMOUNT_M12,
                N.OUTSTANDING_AMOUNT_M11 AS OUTSTANDING_AMOUNT_M11,
                N.OUTSTANDING_AMOUNT_M10 AS OUTSTANDING_AMOUNT_M10,
                N.OUTSTANDING_AMOUNT_M9 AS OUTSTANDING_AMOUNT_M9,
                N.OUTSTANDING_AMOUNT_M8 AS OUTSTANDING_AMOUNT_M8,
                N.OUTSTANDING_AMOUNT_M7 AS OUTSTANDING_AMOUNT_M7,
                N.OUTSTANDING_AMOUNT_M6 AS OUTSTANDING_AMOUNT_M6,
                N.OUTSTANDING_AMOUNT_M5 AS OUTSTANDING_AMOUNT_M5,
                N.OUTSTANDING_AMOUNT_M4 AS OUTSTANDING_AMOUNT_M4,
                N.OUTSTANDING_AMOUNT_M3 AS OUTSTANDING_AMOUNT_M3,
                N.OUTSTANDING_AMOUNT_M2 AS OUTSTANDING_AMOUNT_M2,
                N.OUTSTANDING_AMOUNT_M1 AS OUTSTANDING_AMOUNT_M1,
                N.PRINCIPAL_OUTSTANDING AS OUTSTANDING_AMOUNT_M0,
                C.M23_AVG_BAL AS AVERAGE_BALANCE_MONTH_M23,
                C.M22_AVG_BAL AS AVERAGE_BALANCE_MONTH_M22,
                C.M21_AVG_BAL AS AVERAGE_BALANCE_MONTH_M21,
                C.M20_AVG_BAL AS AVERAGE_BALANCE_MONTH_M20,
                C.M19_AVG_BAL AS AVERAGE_BALANCE_MONTH_M19,
                C.M18_AVG_BAL AS AVERAGE_BALANCE_MONTH_M18,
                C.M17_AVG_BAL AS AVERAGE_BALANCE_MONTH_M17,
                C.M16_AVG_BAL AS AVERAGE_BALANCE_MONTH_M16,
                C.M15_AVG_BAL AS AVERAGE_BALANCE_MONTH_M15,
                C.M14_AVG_BAL AS AVERAGE_BALANCE_MONTH_M14,
                C.M13_AVG_BAL AS AVERAGE_BALANCE_MONTH_M13,
                C.M12_AVG_BAL AS AVERAGE_BALANCE_MONTH_M12,
                C.M11_AVG_BAL AS AVERAGE_BALANCE_MONTH_M11,
                C.M10_AVG_BAL AS AVERAGE_BALANCE_MONTH_M10,
                C.M9_AVG_BAL AS AVERAGE_BALANCE_MONTH_M9,
                C.M8_AVG_BAL AS AVERAGE_BALANCE_MONTH_M8,
                C.M7_AVG_BAL AS AVERAGE_BALANCE_MONTH_M7,
                C.M6_AVG_BAL AS AVERAGE_BALANCE_MONTH_M6,
                C.M5_AVG_BAL AS AVERAGE_BALANCE_MONTH_M5,
                C.M4_AVG_BAL AS AVERAGE_BALANCE_MONTH_M4,
                C.M3_AVG_BAL AS AVERAGE_BALANCE_MONTH_M3,
                C.M2_AVG_BAL AS AVERAGE_BALANCE_MONTH_M2,
                C.M1_AVG_BAL AS AVERAGE_BALANCE_MONTH_M1,
                C.M0_AVG_BAL AS AVERAGE_BALANCE_MONTH_M0,
                N.ARMS_MITIGANT_CODE AS ARMS_MITIGANT_CODE,
                N.ARMS_MITIGANT_DESC AS ARMS_MITIGANT_DESC,
                N.ARMS_MITIGANT_VALUE AS ARMS_MITIGANT_VALUE,
                N.ARMS_COLL_AREA AS ARMS_COLL_AREA,
                N.ARMS_VEHICLE_BRAND_TYPE AS ARMS_VEHICLE_BRAND_TYPE,
                N.ARMS_PROPERTY_EVAL_STATUS AS ARMS_PROPERTY_EVAL_STATUS,
                N.ARMS_MITIGANT_VALUE_BY_OWNER AS ARMS_MITIGANT_VALUE_BY_OWNER,
                N.ARMS_BOOK_VALUE AS ARMS_BOOK_VALUE,
                N.ARMS_VALUATION_DIFF AS ARMS_VALUATION_DIFF,
                N.ARMS_CONTRACT_NUMBER AS ARMS_CONTRACT_NUMBER,
                N.ARMS_MANUFACTURE_YEAR AS ARMS_MANUFACTURE_YEAR,
                N.ARMS_VEHICLE_MANUFACTURE_YEAR AS ARMS_VEHICLE_MANUFACTURE_YEAR,
                N.PRIMARY_CARD_FLG AS PRIMARY_CARD_FLG,
                N.SUPPLEMENTARY_CARD_LIMIT AS SUPPLEMENTARY_CARD_LIMIT,
                C.RESIDENT_STATUS AS RESIDENT_STATUS,
                C.RESIDENT_TYPE AS RESIDENT_TYPE,
                LTRIM(N.SALARY_TRANSFER_TYPE_CTF,'0') AS SALARY_TRANSFER_TYPE_CIF,
                C.GENDER AS GENDER,
                C.CUSTOMER_MARITAL_STATUS AS MARITAL_STATUS,
                C.RESIDENT_CITY AS CITY,
                C.CIVIL_STATUS AS CIVIL_STATUS,
                C.DISTRICT AS DISTRICT_CODE,
                C.CUSTOMER_EDUCATION AS EDUCATION_LEVEL,
                C.CUSTOMER_HOUSE_OWNED_INDICATOR AS HOUSE_OWNED_STATUS,
                C.NATIONALITY AS NATIONALITY,
                C.CUSTOMER_NUMBER_OF_CARS AS NUMBER_OF_CARS,
                C.OCCUPATION_TYPE AS OCCUPATION_TYPE,
                C.CUSTOMER_REGION AS REGION,
                C.CUSTOMER_OPEN_DATE AS CIC_OPEN_DATE,
                N.ACCRUED_INT AS ACCRUED_INT,
                N.BASIC_SALARY_AMOUNT AS BASIC_SALARY_AMOUNT,
                N.BRANCH_SHOWROOM_ACC AS BRANCH_SHOWROOM_ACCOUNT,
                N.BRANCH_SHOWROOM_ACCOUNT_CODE AS BRANCH_SHOWROOM_ACCOUNT_CODE,
                N.BRANCH_SHOWROOM_CODE AS BRANCH_SHOWROOM_CODE,
                N.BUSINESS_POSITION AS BUSINESS_POSITION,
                N.CHANNEL_CODE AS CHANNEL_CODE,
                N.CURRENCY AS CURRENCY,
                N.CUS_SUBTYPE AS CUS_SUBTYPE,
                N.DEPT_CODE AS DEPT_CODE,
                N.DISBURSEMENT_AMOUNT AS DISBURSEMENT_AMOUNT,
                N.DISBURSEMENT_DATE AS DISBURSEMENT_DATE,
                N.EMPLOYEE_TYPE AS EMPLOYEE_TYPE,
                N.EMPLOYER_CLASS_CODE AS EMPLOYER_CLASS_CODE,
                N.END_OF_SERVICE_BENEFIT_AMOUNT AS END_OF_SERVICE_BENEFIT_AMOUNT,
                N.FEES AS FEES,
                N.FINANCE_AMT AS FINANCE_AMT,
                N.EMI_M00 AS INSTAL_AMT,
                N.MATURE_DATE AS MATURE_DATE,
                N.MONTHLY_ALLOWANCE_AMOUNT AS MONTHLY_ALLOWANCE_AMOUNT,
                N.MONTHLY_OTHER_INCOME_AMOUNT AS MONTHLY_OTHER_INCOME_AMOUNT,
                N.NO_OF_DELINQ_INST AS NO_OF_DELINQ_INST,
                N.ORIG_BALANCE AS ORIG_BALANCE,
                N.ORIG_PROFIT AS ORIG_PROFIT,
                N.PAYMENT_PRINCIPAL_AMT AS PAYMENT_PRINCIPAL_AMT,
                N.RELATION_CONTRACT_TYPE AS RELATION_CONTRACT_TYPE,
                N.REMAIN_PAYMENTS AS REMAIN_PAYMENTS,
                N.REMAIN_TERM AS REMAIN_TERM,
                LTRIM(N.SALARY_TRANSFER_TYPE_CTF,'0') AS SALARY_TRANSFER_TYPE,
                N.CUSTOMER_SEGMENT AS CUSTOMER_SEGMENT,
                N.SALES_BRANCH AS SALES_BRANCH,
                N.SALES_CD AS SALES_CD,
                N.SALES_USERID AS SALES_USERID,
                N.TERM AS TERM,
                N.TOT_GRACE_PRD_PROFIT AS TOT_GRACE_PRD_PROFIT,
                N.TOTAL_PAYMENTS AS TOTAL_PAYMENTS,
                N.TOTAL_EARLY_PAYMENT_AMT AS TOTAL_EARLY_PAYMENT_AMT,
                N.TOTAL_INSTALLMENT_DUE_AMT AS TOTAL_INSTALLMENT_DUE_AMT,
                'EDW Monthly Batch' AS SCORING_REQUEST_TYPE,
                'EDW' AS SCORING_SOURCE,
                CUSTOMER_LEGAL_ID_NUMBER AS NATIONAL_ID,
                TRUNC (N.AS_OF_DATE, 'MM') AS PORTFOLIO_DATE,
                S.TOTAL_REVOLVING_LIMIT AS TOTAL_REVOLVING_LIMIT,
                S.TOTAL_REVOLVING_LIAB AS TOTAL_REVOLVING_LIAB,
                S.NO_OF_ENQUIRIES_30D AS NO_OF_ENQUIRIES_30D,
                S.TOTAL_REVOLVING_LIMIT AS CARD_PRODUCT_LIMIT,
                S.TOTAL_REVOLVING_LIAB AS CARD_OUTSTANDING_BALANCE,
                N.ACCOUNT_ID AS ACCOUNT_1,
                N.APPLICATION_DATE AS APPLICATION_DATE,
                N.APPROVAL_DATE AS APPROVAL_DATE,
                N.BRANCH_LOAN_APPLIED AS BRANCH_LOAN_APPLIED,
                N.LAST_PAYMENT AS LAST_PAYMENT,
                N.NEXT_PAY AS NEXT_PAY,
                N.ORG_UNIT AS ORG_UNIT,
                N.ORIG_TERM AS ORIG_TERM,
                N.PAY_FREQUENCY AS PAY_FREQUENCY,
                N.FTV AS FTV
             FROM EXPR_CUST C, EXPR_CONT N, EXPR_SIMAH S
            WHERE     LTRIM(C.CUSTOMER_NUMBER,'0') = N.CIC(+)
                  AND N.CONTRACT_NUMBER = S.CONTRACT_NUMBER(+) ;
        V_ROWCOUNT := V_ROWCOUNT + SQL%ROWCOUNT;
    EXCEPTION    
        WHEN OTHERS THEN
            V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                          SQLERRM || ' -- Error in inserting data into STG_SCORE_REQUEST -- STOPPED';
            DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
            PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,V_RUN_ID);
            P_STATUS := 1;
            RETURN;
    END;
      --  Logging the completion of inserting data into STG_SCORE_REQUEST
      V_LOG_MSG := 'Records are successfully inserted into STG_SCORE_REQUEST, RECORD_COUNT = ' || V_ROWCOUNT ;
      DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
      PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'I',NULL,V_LOG_MSG,V_RUN_ID);
      COMMIT;
      V_ROWCOUNT := 0;
    --  Inserting Data into STG_SCORE_REQUEST -- END   

    --  Inserting Data into BATCH_LOG -- START   
    BEGIN
        INSERT INTO BATCH_LOG (BATCH_ID, BATCH_TIMESTAMP, BATCH_FILE_NAME)  --- CHANGE INSERT 
        VALUES (V_RUN_ID,SYSTIMESTAMP,'EDW_BATCH'||'_'||V_RUN_ID||'_'||TO_CHAR(SYSDATE,('YYYYMMDD_HH24MISS'))) ;        
    EXCEPTION 
        WHEN OTHERS THEN
        V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                      SQLERRM || ' -- Error in inserting batch record in BATCH_LOG table -- STOPPED';
        DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
        PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,V_RUN_ID);
    END;
    --  Inserting Data into BATCH_LOG -- END       

EXCEPTION
  WHEN OTHERS THEN
    V_LOG_MSG :=  SQLCODE ||' '|| DBMS_UTILITY.FORMAT_ERROR_BACKTRACE ||' '||
                  SQLERRM ||' -- Error in LOAD_STG_SCORE_REQUEST -- ROLLBACKED';
    DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
    PLSQL_LOG_INSERT(SYSDATE,SYSTIMESTAMP,V_PACKAGE_NAME||'.'||V_PROCEDURE_NAME,'E',SQLCODE,V_LOG_MSG,V_RUN_ID);
    ROLLBACK;      
    P_STATUS := 1;

END LOAD_STG_SCORE_REQUEST;
---------------------------------------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------------------------------------------
END DATA_LOAD;
/

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
