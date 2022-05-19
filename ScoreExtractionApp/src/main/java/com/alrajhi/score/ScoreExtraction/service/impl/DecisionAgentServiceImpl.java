package com.alrajhi.score.ScoreExtraction.service.impl;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.alrajhi.score.ScoreExtraction.dto.DataArea;
import com.alrajhi.score.ScoreExtraction.dto.RowOutput;
import com.alrajhi.score.ScoreExtraction.repository.AppParamRepository;
import com.alrajhi.score.ScoreExtraction.service.DecisionAgentService;
import com.alrajhi.score.ScoreExtraction.service.ScoreParserService;
import com.alrajhi.score.ScoreExtraction.utils.GeneralUtils;
import com.experian.eda.decisionagent.interfaces.os390.BatchJSEMObjectInterface;
import com.experian.stratman.datasources.runtime.IData;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DecisionAgentServiceImpl implements DecisionAgentService {

    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    @Autowired
    GeneralUtils parserUtils;

    @Autowired
    ScoreParserService scoreParserService;

    @Autowired
    AppParamRepository AppParamRepository;

    @Value("${app.output.directory}")
    private String outputDirectory;

    @Value("${app.logging.fileName}")
    private String logFileName;

    @Value("${app.logging.directory}")
    private String loggingDirectory;

    @Value("${traceflag.insert.number}")
    private int traceflagInsertNumber;

    @Value("${app.logging.loglevel}")
    private String logLevel;

    @Value("${app.project.name}")
    private String logUser;

    private String logResult;

    @Override
    public DataArea buildInputFromDB_ascore(Map < String, Object > DBRow) {
    	DataArea inputData = new DataArea("APPINPUT");
        try {            
            Properties props = parserUtils.getInputColumnsProperties_ascore();
            String[] headers = Arrays.copyOf(props.keySet().toArray(), props.keySet().toArray().length, String[].class);
            //parserUtils.printHeaders(headers);
            parserUtils.prepareHeaderList(headers);

            Map < String, String > propMap = new LinkedHashMap < > ();

            for (int i = 0; i < headers.length; i++) {
                propMap.put(props.get(headers[i]).toString(), headers[i]);
            }

            //build input data
            for (Map.Entry < String, Object > mapEntry: DBRow.entrySet()) {
                log.debug("{}# Name [{}]  Value [{}]", mapEntry.getValue(), mapEntry.getKey(), mapEntry.getValue());
                inputData.setValue(propMap.get(mapEntry.getKey()), mapEntry.getValue());
            }           
            
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            logResult = this.getClass().getName() + ": " + "Error in building input for experian service, " + e.getMessage();
            if (logLevel.toUpperCase().equals("ERROR")) {
            	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "A-SCORE", logUser, "Error", BigDecimal.valueOf(0));
            }

        }
		return inputData;        
    }

    @Override
    public DataArea buildInputFromDB_bscore(Map < String, Object > DBRow) {
    	DataArea inputData = new DataArea("BEHINPUT");
        try {
            Properties props = parserUtils.getInputColumnsProperties_bscore();
            String[] headers = Arrays.copyOf(props.keySet().toArray(), props.keySet().toArray().length, String[].class);
            //parserUtils.printHeaders(headers);
            parserUtils.prepareHeaderList(headers);

            Map < String, String > propMap = new LinkedHashMap < > ();

            for (int i = 0; i < headers.length; i++) {
                propMap.put(props.get(headers[i]).toString(), headers[i]);
            }

            //build input data
            for (Map.Entry < String, Object > mapEntry: DBRow.entrySet()) {
                log.debug("{}# Name [{}]  Value [{}]", mapEntry.getValue(), mapEntry.getKey(), mapEntry.getValue());
                inputData.setValue(propMap.get(mapEntry.getKey()), mapEntry.getValue());
            }

        } catch (Exception e) {
            log.error(e.getMessage(), e);
            logResult = this.getClass().getName() + ": " + "Error in building input for experian service, " + e.getMessage();
            if (logLevel.toUpperCase().equals("ERROR")) {
            	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "B-SCORE", logUser, "Error", BigDecimal.valueOf(0));
            }
        }
        return inputData;
    }

    // new buildInputFromDB_LGD
    
    @Override
    public DataArea buildInputFromDB_lgd(Map < String, Object > DBRow) {
    	DataArea inputData = new DataArea("INPUT");
        try {
            Properties props = parserUtils.getInputColumnsProperties_lgd();
            String[] headers = Arrays.copyOf(props.keySet().toArray(), props.keySet().toArray().length, String[].class);
            //parserUtils.printHeaders(headers);
            parserUtils.prepareHeaderList(headers);

            Map < String, String > propMap = new LinkedHashMap < > ();

            for (int i = 0; i < headers.length; i++) {
                propMap.put(props.get(headers[i]).toString(), headers[i]);
            }

            //build input data
            for (Map.Entry < String, Object > mapEntry: DBRow.entrySet()) {
                log.debug("{}# Name [{}]  Value [{}]", mapEntry.getValue(), mapEntry.getKey(), mapEntry.getValue());
                inputData.setValue(propMap.get(mapEntry.getKey()), mapEntry.getValue());
            }

        } catch (Exception e) {
            log.error(e.getMessage(), e);
            logResult = this.getClass().getName() + ": " + "Error in building input for experian service, " + e.getMessage();
            if (logLevel.toUpperCase().equals("ERROR")) {
            	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "LGD-SCORE", logUser, "Error", BigDecimal.valueOf(0));
            }
        }
        return inputData;
    }
    
    
    @Override
    public IData[] runAgent_ascore(DataArea inputData, long requestId) {
        log.info("Run Agent .... started");

        //build OCONTROL
        DataArea oControlData = new DataArea("OCONTROL");
        oControlData.setValue("ALIAS", "APPSCORE");
        oControlData.setValue("SIGNATURE", "PCSM_ARB");
        
        // Populate result data
        DataArea outputData = new DataArea("APPOUTPT");
        
        // Put the data in an array of IData objects.
        IData[] dataAreas = new IData[3];
        dataAreas[0] = (IData) oControlData;
        dataAreas[1] = (IData) inputData;
        dataAreas[2] = (IData) outputData;

        // Print Data Population is Ok
        log.info("Data populate is ok...");

        int returnCode = 0;
        int traceFlag = traceflagInsertNumber;

        log.info("Decision Agent Execute Start!");
        logResult = this.getClass().getName() + ": " + "Decision agent execution started :: Execution Time - " + dateTimeFormatter.format(LocalDateTime.now());

        if (logLevel.toUpperCase().equals("INFO")) {
        	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
            scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "A-SCORE", logUser, "Processing", BigDecimal.valueOf(0));
        }

        returnCode = BatchJSEMObjectInterface.instance().execute(dataAreas, traceFlag);
        
        log.info("Decision Agent Execute Finish!");
        log.info("ReturnCode : " + returnCode);
        log.info("errorcount :" + oControlData.getValue("ERRORCOUNT"));
        int errors = Integer.parseInt((String) oControlData.getValue("ERRORCOUNT"));

        if (errors == 0) {
            logResult = this.getClass().getName() + ": " + "Decision agent execution finished successfully with return code = " + returnCode + " and errorcount = " + errors;
            if (logLevel.toUpperCase().equals("INFO")) {
            	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "A-SCORE", logUser, "Processing", BigDecimal.valueOf(requestId));
            }
        } else {
        	logResult = this.getClass().getName() + ": " + "Decision agent execution finished successfully with return code = " + returnCode + " and errorcount = " + errors;
            if (logLevel.toUpperCase().equals("ERROR")) {
            	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "A-SCORE", logUser, "Error", BigDecimal.valueOf(requestId));
            }
        }


        if (errors > 0) {
            String error1 = (String) oControlData.getValue("ERROR[1]");
            log.info("Error 1: " + error1);
            logResult = this.getClass().getName() + ": " + "Error 1: " + error1;
            if (logLevel.toUpperCase().equals("ERROR")) {
            	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "A-SCORE", logUser, "Error", BigDecimal.valueOf(requestId));
            }

            log.info("Error 2: " + (String) oControlData.getValue("ERROR[2]"));
            logResult = this.getClass().getName() + ": " + "Error 2: " + (String) oControlData.getValue("ERROR[2]");
            if (logLevel.toUpperCase().equals("ERROR")) {
            	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "A-SCORE", logUser, "Error", BigDecimal.valueOf(requestId));
            }

            log.info("Error 3: " + (String) oControlData.getValue("ERROR[3]"));
            logResult = this.getClass().getName() + ": " + "Error 3: " + (String) oControlData.getValue("ERROR[3]");
            if (logLevel.toUpperCase().equals("ERROR")) {
            	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "A-SCORE", logUser, "Error", BigDecimal.valueOf(requestId));
            }
        }
        return dataAreas;
    }

    @Override
    public IData[] runAgent_bscore(DataArea inputData, long requestId) {
        log.info("Run Agent .... started");

        //build OCONTROL
        DataArea oControlData = new DataArea("OCONTROL");
        oControlData.setValue("ALIAS", "BEHSCORE");
        oControlData.setValue("SIGNATURE", "PCSM_ARB");
        
        // Populate result data
        DataArea outputData = new DataArea("BEHOUTPT");
        
        // Put the data in an array of IData objects.
        IData[] dataAreas = new IData[3];
        dataAreas[0] = (IData) oControlData;
        dataAreas[1] = (IData) inputData;
        dataAreas[2] = (IData) outputData;        

        // Print Data Population is Ok
        log.info("Data populate is ok...");

        int returnCode = 0;
        int traceFlag = traceflagInsertNumber;

        log.info("Decision Agent Execute Start!");
        logResult = this.getClass().getName() + ": " + "Decision agent execution started :: Execution Time - " + dateTimeFormatter.format(LocalDateTime.now());

        if (logLevel.toUpperCase().equals("INFO")) {
        	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
            scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "B-SCORE", logUser, "Processing", BigDecimal.valueOf(0));
        }

        returnCode = BatchJSEMObjectInterface.instance().execute(dataAreas, traceFlag);
        log.info("Decision Agent Execute Finish!");
        log.info("ReturnCode : " + returnCode);
        log.info("errorcount :" + oControlData.getValue("ERRORCOUNT"));
        int errors = Integer.parseInt((String) oControlData.getValue("ERRORCOUNT"));

        if (errors == 0) {
            logResult = this.getClass().getName() + ": " + "Decision agent execution finished successfully with return code = " + returnCode + " and errorcount = " + errors;
            if (logLevel.toUpperCase().equals("INFO")) {
            	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "B-SCORE", logUser, "Processing", BigDecimal.valueOf(requestId));
            }
        } else {
            logResult = this.getClass().getName() + ": " + "Decision agent execution finished successfully with return code = " + returnCode + " and errorcount = " + errors;
            if (logLevel.toUpperCase().equals("ERROR")) {
            	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "B-SCORE", logUser, "Error", BigDecimal.valueOf(requestId));
            }
        }


        if (errors > 0) {
            String error1 = (String) oControlData.getValue("ERROR[1]");
            log.info("Error 1: " + error1);
            logResult = this.getClass().getName() + ": " + "Error 1: " + error1;
            if (logLevel.toUpperCase().equals("ERROR")) {
            	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "B-SCORE", logUser, "Error", BigDecimal.valueOf(requestId));
            }

            log.info("Error 2: " + (String) oControlData.getValue("ERROR[2]"));
            logResult = this.getClass().getName() + ": " + "Error 2: " + (String) oControlData.getValue("ERROR[2]");
            if (logLevel.toUpperCase().equals("ERROR")) {
            	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "B-SCORE", logUser, "Error", BigDecimal.valueOf(requestId));
            }

            log.info("Error 3: " + (String) oControlData.getValue("ERROR[3]"));
            logResult = this.getClass().getName() + ": " + "Error 3: " + (String) oControlData.getValue("ERROR[3]");
            if (logLevel.toUpperCase().equals("ERROR")) {
            	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "B-SCORE", logUser, "Error", BigDecimal.valueOf(requestId));
            }
        }
        return dataAreas;
    }

    // new runAgent_lgd
    
    @Override
    public IData[] runAgent_lgd(DataArea inputData, long requestId) {
        log.info("Run Agent .... started");

        //build OCONTROL
        DataArea oControlData = new DataArea("OCONTROL");
        oControlData.setValue("ALIAS", "ARB");
        oControlData.setValue("SIGNATURE", "ARB");
        
        // Populate result data
        DataArea outputData = new DataArea("OUTPUT");
        
        // Put the data in an array of IData objects.
        IData[] dataAreas = new IData[3];
        dataAreas[0] = (IData) oControlData;
        dataAreas[1] = (IData) inputData;
        dataAreas[2] = (IData) outputData;        

        // Print Data Population is Ok
        log.info("Data populate is ok...");

        int returnCode = 0;
        int traceFlag = traceflagInsertNumber;

        log.info("Decision Agent Execute Start!");
        logResult = this.getClass().getName() + ": " + "Decision agent execution started :: Execution Time - " + dateTimeFormatter.format(LocalDateTime.now());

        if (logLevel.toUpperCase().equals("INFO")) {
        	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
            scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "LGD-SCORE", logUser, "Processing", BigDecimal.valueOf(0));
        }

        returnCode = BatchJSEMObjectInterface.instance().execute(dataAreas, traceFlag);
        log.info("Decision Agent Execute Finish!");
        log.info("ReturnCode : " + returnCode);
        log.info("errorcount :" + oControlData.getValue("ERRORCOUNT"));
        int errors = Integer.parseInt((String) oControlData.getValue("ERRORCOUNT"));

        if (errors == 0) {
            logResult = this.getClass().getName() + ": " + "Decision agent execution finished successfully with return code = " + returnCode + " and errorcount = " + errors;
            if (logLevel.toUpperCase().equals("INFO")) {
            	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "LGD-SCORE", logUser, "Processing", BigDecimal.valueOf(requestId));
            }
        } else {
            logResult = this.getClass().getName() + ": " + "Decision agent execution finished successfully with return code = " + returnCode + " and errorcount = " + errors;
            if (logLevel.toUpperCase().equals("ERROR")) {
            	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "LGD-SCORE", logUser, "Error", BigDecimal.valueOf(requestId));
            }
        }


        if (errors > 0) {
            String error1 = (String) oControlData.getValue("ERROR[1]");
            log.info("Error 1: " + error1);
            logResult = this.getClass().getName() + ": " + "Error 1: " + error1;
            if (logLevel.toUpperCase().equals("ERROR")) {
            	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "LGD-SCORE", logUser, "Error", BigDecimal.valueOf(requestId));
            }

            log.info("Error 2: " + (String) oControlData.getValue("ERROR[2]"));
            logResult = this.getClass().getName() + ": " + "Error 2: " + (String) oControlData.getValue("ERROR[2]");
            if (logLevel.toUpperCase().equals("ERROR")) {
            	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "LGD-SCORE", logUser, "Error", BigDecimal.valueOf(requestId));
            }

            log.info("Error 3: " + (String) oControlData.getValue("ERROR[3]"));
            logResult = this.getClass().getName() + ": " + "Error 3: " + (String) oControlData.getValue("ERROR[3]");
            if (logLevel.toUpperCase().equals("ERROR")) {
            	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "LGD-SCORE", logUser, "Error", BigDecimal.valueOf(requestId));
            }
        }
        return dataAreas;
    }

    
    @Override
    public RowOutput buildRowOutput_ascore(IData[] dataAreas, String requestId, String runId) {

        RowOutput scoreOutput = new RowOutput();
        String emptyString = "";

        try {
            // print control data
            log.info("--- OCONTROL ---");
            log.info("BUSINESS OBJECTIVE NAME: " + dataAreas[0].getValue("OBJECTIVE"));
            log.info("EDITION: " + dataAreas[0].getValue("EDITION"));
            log.info("EDITION CRATION DATE: " + dataAreas[0].getValue("EDITIONDATE"));

            // ***********************************************
            // ***********************************************
            // print output data
            log.info("--- OUTPUT ---");
            Set < String > outPutColumns = parserUtils.getOutputColumns_ascore();
            List < String > outputList = new ArrayList < > ();
            List < String > outputHeaders = new ArrayList < > ();
            Map < String, Object > outputMap = new LinkedHashMap < > ();

            for (String name: outPutColumns) {

                log.debug("Name [{}] Value [{}] , type [{}] ", name, dataAreas[2].getValue(name), parserUtils.getFieldType(dataAreas[2].getValue(name)));
                outputHeaders.add(name);

                if (dataAreas[2].getValue(name) != null) {
                    outputMap.put(name, dataAreas[2].getValue(name));
                } else {
                    outputMap.put(name, emptyString);
                }

                if (dataAreas[2].getValue(name) != null) {
                    if (dataAreas[2].getValue(name) instanceof String) {
                        outputList.add((String) dataAreas[2].getValue(name));
                    } else {
                        outputList.add(dataAreas[2].getValue(name) + "");
                    }
                } else {
                    outputList.add(emptyString + "");
                }
            }

            scoreOutput.setOutputHeaders(outputHeaders);
            scoreOutput.setRowData(outputList);
            scoreOutput.setOutputMap(outputMap);

        } catch (Exception e) {
            log.error(e.getMessage(), e);
            logResult = this.getClass().getName() + ": " + "Error in building row output map from experian service, " + e.getMessage();
            if (logLevel.toUpperCase().equals("ERROR")) {
            	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "A-SCORE", logUser, "Error", BigDecimal.valueOf(0));
            }
        }

        return scoreOutput;
    }

    @Override
    public RowOutput buildRowOutput_bscore(IData[] dataAreas, String requestId, String runId) {

    	RowOutput scoreOutput = new RowOutput();
        String emptyString = "";

        try {
            // print control data
            log.info("--- OCONTROL ---");
            log.info("BUSINESS OBJECTIVE NAME: " + dataAreas[0].getValue("OBJECTIVE"));
            log.info("EDITION: " + dataAreas[0].getValue("EDITION"));
            log.info("EDITION CRATION DATE: " + dataAreas[0].getValue("EDITIONDATE"));

            // ***********************************************
            // ***********************************************
            // print output data
            log.info("--- OUTPUT ---");
            Set < String > outPutColumns = parserUtils.getOutputColumns_bscore();
            List < String > outputList = new ArrayList < > ();
            List < String > outputHeaders = new ArrayList < > ();
            Map < String, Object > outputMap = new LinkedHashMap < > ();

            for (String name: outPutColumns) {

                log.debug("Name [{}] Value [{}] , type [{}] ", name, dataAreas[2].getValue(name), parserUtils.getFieldType(dataAreas[2].getValue(name)));
                outputHeaders.add(name);

                if (dataAreas[2].getValue(name) != null) {
                    outputMap.put(name, dataAreas[2].getValue(name));
                } else {
                    outputMap.put(name, emptyString);
                }

                if (dataAreas[2].getValue(name) != null) {
                    if (dataAreas[2].getValue(name) instanceof String) {
                        outputList.add((String) dataAreas[2].getValue(name));
                    } else {
                        outputList.add(dataAreas[2].getValue(name) + "");
                    }
                } else {
                    outputList.add(emptyString + "");
                }
            }

            scoreOutput.setOutputHeaders(outputHeaders);
            scoreOutput.setRowData(outputList);
            scoreOutput.setOutputMap(outputMap);

        } catch (Exception e) {
            log.error(e.getMessage(), e);
            logResult = this.getClass().getName() + ": " + "Error in building row output map from experian service, " + e.getMessage();
            if (logLevel.toUpperCase().equals("ERROR")) {
            	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "B-SCORE", logUser, "Error", BigDecimal.valueOf(0));
            }
        }

        return scoreOutput;
    }

     // new buildRowOutput_lgd
    
    @Override
    public RowOutput buildRowOutput_lgd(IData[] dataAreas, String requestId, String runId) {

    	RowOutput scoreOutput = new RowOutput();
        String emptyString = "";

        try {
            // print control data
            log.info("--- OCONTROL ---");
            log.info("BUSINESS OBJECTIVE NAME: " + dataAreas[0].getValue("OBJECTIVE"));
            log.info("EDITION: " + dataAreas[0].getValue("EDITION"));
            log.info("EDITION CRATION DATE: " + dataAreas[0].getValue("EDITIONDATE"));

            // ***********************************************
            // ***********************************************
            // print output data
            log.info("--- OUTPUT ---");
            Set < String > outPutColumns = parserUtils.getOutputColumns_lgd();
            List < String > outputList = new ArrayList < > ();
            List < String > outputHeaders = new ArrayList < > ();
            Map < String, Object > outputMap = new LinkedHashMap < > ();

            for (String name: outPutColumns) {

                log.debug("Name [{}] Value [{}] , type [{}] ", name, dataAreas[2].getValue(name), parserUtils.getFieldType(dataAreas[2].getValue(name)));
                outputHeaders.add(name);

                if (dataAreas[2].getValue(name) != null) {
                    outputMap.put(name, dataAreas[2].getValue(name));
                } else {
                    outputMap.put(name, emptyString);
                }

                if (dataAreas[2].getValue(name) != null) {
                    if (dataAreas[2].getValue(name) instanceof String) {
                        outputList.add((String) dataAreas[2].getValue(name));
                    } else {
                        outputList.add(dataAreas[2].getValue(name) + "");
                    }
                } else {
                    outputList.add(emptyString + "");
                }
            }

            scoreOutput.setOutputHeaders(outputHeaders);
            scoreOutput.setRowData(outputList);
            scoreOutput.setOutputMap(outputMap);

        } catch (Exception e) {
            log.error(e.getMessage(), e);
            logResult = this.getClass().getName() + ": " + "Error in building row output map from experian service, " + e.getMessage();
            if (logLevel.toUpperCase().equals("ERROR")) {
            	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "LGD-SCORE", logUser, "Error", BigDecimal.valueOf(0));
            }
        }

        return scoreOutput;
    }


    
    @Override
    public synchronized void writOutput_aScore(long requestId, String runId, String scoringType, RowOutput rowOutput, String fileName, String timeStampString) {

        String outPutFileName = fileName.replace(".csv", "_output_" + runId + "_" + timeStampString + ".csv");
        String[] data;
        RowOutput dataOutput = rowOutput;
        data = dataOutput.getRowData().toArray(new String[0]);          
        parserUtils.writeDataLineByLine_aScore(rowOutput.getOutputHeaders().toArray(new String[0]), data, scoringType, requestId, outputDirectory, outPutFileName);
        }    

	@Override
	public synchronized void writOutput_bScore(long requestId, String runId, String scoringType, RowOutput rowOutput, String fileName, String timeStampString) {

    String outPutFileName = fileName.replace(".csv", "_output_" + runId + "_" + timeStampString + ".csv");
    String[] data;
    RowOutput dataOutput = rowOutput;
    data = dataOutput.getRowData().toArray(new String[0]);          
    parserUtils.writeDataLineByLine_bScore(rowOutput.getOutputHeaders().toArray(new String[0]), data, scoringType, requestId, outputDirectory, outPutFileName);
    }

	// new writOutput_lgd
	
	@Override
	public synchronized void writOutput_lgd(long requestId, String runId, String scoringType, RowOutput rowOutput, String fileName, String timeStampString) {

    String outPutFileName = fileName.replace(".csv", "_output_" + runId + "_" + timeStampString + ".csv");
    String[] data;
    RowOutput dataOutput = rowOutput;
    data = dataOutput.getRowData().toArray(new String[0]);          
    parserUtils.writeDataLineByLine_lgd(rowOutput.getOutputHeaders().toArray(new String[0]), data, scoringType, requestId, outputDirectory, outPutFileName);
    }


}