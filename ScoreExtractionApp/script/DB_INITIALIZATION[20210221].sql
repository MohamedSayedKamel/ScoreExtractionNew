-- This script truncates all the tables used by SCORE_EXTRACTION app for initializing the DB
TRUNCATE TABLE STG_SCORE_REQUEST;
TRUNCATE TABLE STG_SCORE_REQUEST_HIST;
TRUNCATE TABLE STG_SCORE_REQUEST_BAD_RECORDS;
TRUNCATE TABLE A_SCORE_REQUEST;
TRUNCATE TABLE A_SCORE_REQUEST_HIST;
TRUNCATE TABLE A_SCORE_TEMP;
TRUNCATE TABLE A_SCORE_RESPONSE;
TRUNCATE TABLE B_SCORE_REQUEST;
TRUNCATE TABLE B_SCORE_REQUEST_HIST;
TRUNCATE TABLE B_SCORE_TEMP;
TRUNCATE TABLE BATCH_LOG;
TRUNCATE TABLE INPUT_BAD_RECORDS_LOG;
TRUNCATE TABLE PLSQL_LOG;
TRUNCATE TABLE RUN_LOG;
COMMIT;