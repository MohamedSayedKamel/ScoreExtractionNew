package com.alrajhi.score.ScoreExtraction.service;

import java.util.Map;

import com.alrajhi.score.ScoreExtraction.dto.DataArea;
import com.alrajhi.score.ScoreExtraction.dto.RowOutput;
import com.experian.stratman.datasources.runtime.IData;

public interface DecisionAgentService {

    public DataArea buildInputFromDB_ascore(Map < String, Object > DBRow);

    public DataArea buildInputFromDB_bscore(Map < String, Object > DBRow);
    
    public DataArea buildInputFromDB_lgd(Map < String, Object > DBRow);

    public IData[] runAgent_ascore(DataArea inputData, long requestId);

    public IData[] runAgent_bscore(DataArea inputData, long requestId);
    
    public IData[] runAgent_lgd(DataArea inputData, long requestId);

    public RowOutput buildRowOutput_ascore(IData[] dataAreas, String requestId, String runID);

    public RowOutput buildRowOutput_bscore(IData[] dataAreas, String requestId, String runID);
    
    public RowOutput buildRowOutput_lgd(IData[] dataAreas, String requestId, String runID);

    public void writOutput_aScore(long requestId, String runId, String scoringType, RowOutput outputMap, String fileName, String timeStampString);

    public void writOutput_bScore(long requestId, String runId, String scoringType, RowOutput outputMap, String fileName, String timeStampString);
    
    public void writOutput_lgd(long requestId, String runId, String scoringType, RowOutput outputMap, String fileName, String timeStampString);
}