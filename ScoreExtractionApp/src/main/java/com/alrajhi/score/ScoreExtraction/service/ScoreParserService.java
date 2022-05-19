package com.alrajhi.score.ScoreExtraction.service;

import java.io.File;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface ScoreParserService {

    public void startExecution();

    public List < File > getInputFiles(String workingDirectory);

    public void saveLogOutputToDB(Date logDate, String logLevel, String logResult, String logType, String logUser, String runStatus, BigDecimal s);

}