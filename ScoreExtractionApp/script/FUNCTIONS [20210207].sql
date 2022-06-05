-- RUN_ID_FNC function for initiating run ID for accepted records for each input file
create or replace FUNCTION RUN_ID_FNC RETURN NUMBER AS 
V_SEQVAL NUMBER;
BEGIN
    BEGIN
        V_SEQVAL := RUN_ID_SEQUENCE.CURRVAL;
    EXCEPTION 
        WHEN OTHERS THEN
            V_SEQVAL := RUN_ID_SEQUENCE.NEXTVAL;
    END;
    RETURN V_SEQVAL;
END;

-- BAD_RUN_ID_FNC function for initiating run ID for rejected records for each input file
create or replace FUNCTION BAD_RUN_ID_FNC RETURN NUMBER AS 
V_SEQVAL NUMBER;
BEGIN
    BEGIN
        SELECT NVL(MAX(RUN_ID),0)
        INTO V_SEQVAL
        FROM STG_SCORE_REQUEST;
    EXCEPTION 
        WHEN OTHERS THEN
            V_SEQVAL := 0;
    END;
    RETURN V_SEQVAL;
END;