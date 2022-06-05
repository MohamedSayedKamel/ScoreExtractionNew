-- PLSQL_LOG_INSERT procedure for logging PL/SQL packages used for aggregation
create or replace PROCEDURE "PLSQL_LOG_INSERT" 
        (P_AS_OF_DATE DATE,
        P_LOG_DATE TIMESTAMP,
        P_PROCEDURE_NAME VARCHAR2,
        P_LOG_TYPE CHAR,
        P_SQL_ERR_CODE VARCHAR2 DEFAULT NULL,
        P_LOG_MSG  VARCHAR2 DEFAULT NULL,
        P_RUN_ID   NUMBER DEFAULT 0) IS

        V_AS_OF_DATE            DATE := P_AS_OF_DATE;
        V_LOG_DATE              TIMESTAMP(6) := P_LOG_DATE;
        V_PROCEDURE_NAME        VARCHAR2(100 BYTE) := P_PROCEDURE_NAME;
        V_LOG_TYPE              CHAR := P_LOG_TYPE;
        V_SQL_ERR_CODE          VARCHAR2(1024 BYTE) := P_SQL_ERR_CODE;
        V_LOG_MSG               VARCHAR2(4000 BYTE) := P_LOG_MSG;
        V_COUNT                 NUMBER := 0;
        V_RUN_ID                NUMBER := P_RUN_ID;
        -------------------------------------------------------------------------------
BEGIN
        BEGIN
                INSERT INTO     PLSQL_LOG
                (AS_OF_DATE,LOG_DATE,PROCEDURE_NAME,LOG_TYPE,SQL_ERR_CODE,LOG_MSG,RUN_ID)
                VALUES
                (V_AS_OF_DATE,V_LOG_DATE,V_PROCEDURE_NAME,V_LOG_TYPE,V_SQL_ERR_CODE,V_LOG_MSG,V_RUN_ID);    
        EXCEPTION 
                WHEN OTHERS THEN
                DBMS_OUTPUT.PUT_LINE ('-- '||SQLCODE||' - '||SQLERRM||' - while inserting into PLSQL_LOG table for '||V_PROCEDURE_NAME);
        END;
EXCEPTION
        WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE ('-- '||SQLCODE||' - '||SQLERRM||' - error in PLSQL_LOG procedure');
END PLSQL_LOG_INSERT;

-- SCORE_EXTRACTION_RUN_UNDO procedure for removing data of an old run
CREATE OR REPLACE PROCEDURE "SCORE_EXTRACTION_RUN_UNDO" 
        (P_RUN_ID   NUMBER DEFAULT 0) IS

        V_PROCEDURE_NAME        VARCHAR2(100 BYTE) := 'SCORE_EXTRACTION_RUN_UNDO';
        V_LOG_MSG               VARCHAR2(4000 BYTE);
        V_COUNT                 NUMBER := 0;
        V_RUN_ID                NUMBER := P_RUN_ID;
        -------------------------------------------------------------------------------
BEGIN
        BEGIN
                DELETE      A_SCORE_REQUEST
                WHERE       RUN_ID = V_RUN_ID;
                V_COUNT := V_COUNT + SQL%ROWCOUNT;
        EXCEPTION 
                WHEN OTHERS THEN
                DBMS_OUTPUT.PUT_LINE ('-- '||SQLCODE||' - '||SQLERRM||' - while deleting records in A_SCORE_REQUEST for RUN_ID = '||V_RUN_ID);
        END;

        V_LOG_MSG := 'Records are successfully deleted from A_SCORE_REQUEST for RUN_ID = '||V_RUN_ID||', RECORD_COUNT = '||V_COUNT;
        DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
        COMMIT;
        V_COUNT := 0;  

        BEGIN
                DELETE      A_SCORE_REQUEST_HIST
                WHERE       RUN_ID = V_RUN_ID;
                V_COUNT := V_COUNT + SQL%ROWCOUNT;
        EXCEPTION 
                WHEN OTHERS THEN
                DBMS_OUTPUT.PUT_LINE ('-- '||SQLCODE||' - '||SQLERRM||' - while deleting records in A_SCORE_REQUEST_HIST for RUN_ID = '||V_RUN_ID);
        END;

        V_LOG_MSG := 'Records are successfully deleted from A_SCORE_REQUEST_HIST for RUN_ID = '||V_RUN_ID||', RECORD_COUNT = '||V_COUNT;
        DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
        COMMIT;
        V_COUNT := 0;                 

        BEGIN
                DELETE      A_SCORE_RESPONSE
                WHERE       RUN_ID = V_RUN_ID;
                V_COUNT := V_COUNT + SQL%ROWCOUNT;
        EXCEPTION 
                WHEN OTHERS THEN
                DBMS_OUTPUT.PUT_LINE ('-- '||SQLCODE||' - '||SQLERRM||' - while deleting records in A_SCORE_RESPONSE for RUN_ID = '||V_RUN_ID);
        END;

        V_LOG_MSG := 'Records are successfully deleted from A_SCORE_RESPONSE for RUN_ID = '||V_RUN_ID||', RECORD_COUNT = '||V_COUNT;
        DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
        COMMIT;
        V_COUNT := 0;

        BEGIN
                DELETE      B_SCORE_REQUEST
                WHERE       RUN_ID = V_RUN_ID;
                V_COUNT := V_COUNT + SQL%ROWCOUNT;
        EXCEPTION 
                WHEN OTHERS THEN
                DBMS_OUTPUT.PUT_LINE ('-- '||SQLCODE||' - '||SQLERRM||' - while deleting records in B_SCORE_REQUEST for RUN_ID = '||V_RUN_ID);
        END;

        V_LOG_MSG := 'Records are successfully deleted from B_SCORE_REQUEST for RUN_ID = '||V_RUN_ID||', RECORD_COUNT = '||V_COUNT;
        DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
        COMMIT;
        V_COUNT := 0;  

        BEGIN
                DELETE      B_SCORE_REQUEST_HIST
                WHERE       RUN_ID = V_RUN_ID;
                V_COUNT := V_COUNT + SQL%ROWCOUNT;
        EXCEPTION 
                WHEN OTHERS THEN
                DBMS_OUTPUT.PUT_LINE ('-- '||SQLCODE||' - '||SQLERRM||' - while deleting records in B_SCORE_REQUEST_HIST for RUN_ID = '||V_RUN_ID);
        END;

        V_LOG_MSG := 'Records are successfully deleted from B_SCORE_REQUEST_HIST for RUN_ID = '||V_RUN_ID||', RECORD_COUNT = '||V_COUNT;
        DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
        COMMIT;
        V_COUNT := 0;  

        BEGIN
                DELETE      B_SCORE_RESPONSE
                WHERE       RUN_ID = V_RUN_ID;
                V_COUNT := V_COUNT + SQL%ROWCOUNT;
        EXCEPTION 
                WHEN OTHERS THEN
                DBMS_OUTPUT.PUT_LINE ('-- '||SQLCODE||' - '||SQLERRM||' - while deleting records in B_SCORE_RESPONSE for RUN_ID = '||V_RUN_ID);
        END;

        V_LOG_MSG := 'Records are successfully deleted from B_SCORE_RESPONSE for RUN_ID = '||V_RUN_ID||', RECORD_COUNT = '||V_COUNT;
        DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
        COMMIT;
        V_COUNT := 0;

        BEGIN
                DELETE      STG_SCORE_REQUEST
                WHERE       RUN_ID = V_RUN_ID;
                V_COUNT := V_COUNT + SQL%ROWCOUNT;
        EXCEPTION 
                WHEN OTHERS THEN
                DBMS_OUTPUT.PUT_LINE ('-- '||SQLCODE||' - '||SQLERRM||' - while deleting records in STG_SCORE_REQUEST for RUN_ID = '||V_RUN_ID);
        END;

        V_LOG_MSG := 'Records are successfully deleted from STG_SCORE_REQUEST for RUN_ID = '||V_RUN_ID||', RECORD_COUNT = '||V_COUNT;
        DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
        COMMIT;
        V_COUNT := 0;  

        BEGIN
                DELETE      STG_SCORE_REQUEST_HIST
                WHERE       RUN_ID = V_RUN_ID;
                V_COUNT := V_COUNT + SQL%ROWCOUNT;
        EXCEPTION 
                WHEN OTHERS THEN
                DBMS_OUTPUT.PUT_LINE ('-- '||SQLCODE||' - '||SQLERRM||' - while deleting records in STG_SCORE_REQUEST_HIST for RUN_ID = '||V_RUN_ID);
        END;

        V_LOG_MSG := 'Records are successfully deleted from STG_SCORE_REQUEST_HIST for RUN_ID = '||V_RUN_ID||', RECORD_COUNT = '||V_COUNT;
        DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
        COMMIT;
        V_COUNT := 0;  

        BEGIN
                DELETE      STG_SCORE_REQUEST_BAD_RECORDS
                WHERE       RUN_ID = V_RUN_ID;
                V_COUNT := V_COUNT + SQL%ROWCOUNT;
        EXCEPTION 
                WHEN OTHERS THEN
                DBMS_OUTPUT.PUT_LINE ('-- '||SQLCODE||' - '||SQLERRM||' - while deleting records in STG_SCORE_REQUEST_BAD_RECORDS for RUN_ID = '||V_RUN_ID);
        END;

        V_LOG_MSG := 'Records are successfully deleted from STG_SCORE_REQUEST_BAD_RECORDS for RUN_ID = '||V_RUN_ID||', RECORD_COUNT = '||V_COUNT;
        DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
        COMMIT;
        V_COUNT := 0;  

        BEGIN
                DELETE      BATCH_LOG
                WHERE       BATCH_ID = V_RUN_ID;
                V_COUNT := V_COUNT + SQL%ROWCOUNT;
        EXCEPTION 
                WHEN OTHERS THEN
                DBMS_OUTPUT.PUT_LINE ('-- '||SQLCODE||' - '||SQLERRM||' - while deleting records in BATCH_LOG for RUN_ID = '||V_RUN_ID);
        END;

        V_LOG_MSG := 'Records are successfully deleted from BATCH_LOG for RUN_ID = '||V_RUN_ID||', RECORD_COUNT = '||V_COUNT;
        DBMS_OUTPUT.PUT_LINE (V_LOG_MSG);
        COMMIT;
        V_COUNT := 0;  

EXCEPTION
        WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE ('-- '||SQLCODE||' - '||SQLERRM||' - error in SCORE_EXTRACTION_RUN_UNDO procedure');
END SCORE_EXTRACTION_RUN_UNDO;