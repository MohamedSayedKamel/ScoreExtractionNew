package com.alrajhi.score.ScoreExtraction.service.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.ParameterMode;
import javax.persistence.Persistence;
import javax.persistence.StoredProcedureQuery;

import org.apache.commons.beanutils.PropertyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.alrajhi.score.ScoreExtraction.dto.DataArea;
import com.alrajhi.score.ScoreExtraction.dto.RowOutput;
import com.alrajhi.score.ScoreExtraction.entity.AScoreRequest;
import com.alrajhi.score.ScoreExtraction.entity.AScoreResponse;
import com.alrajhi.score.ScoreExtraction.entity.AppParam;
import com.alrajhi.score.ScoreExtraction.entity.BScoreRequest;
import com.alrajhi.score.ScoreExtraction.entity.BScoreResponse;
import com.alrajhi.score.ScoreExtraction.entity.BatchLog;
import com.alrajhi.score.ScoreExtraction.entity.InputBadRecordsLog;
import com.alrajhi.score.ScoreExtraction.entity.LGDRequest;
import com.alrajhi.score.ScoreExtraction.entity.LGDResponse;
import com.alrajhi.score.ScoreExtraction.entity.RunLog;
import com.alrajhi.score.ScoreExtraction.repository.AScoreRequestRepository;
import com.alrajhi.score.ScoreExtraction.repository.AScoreResponseRepository;
import com.alrajhi.score.ScoreExtraction.repository.AppParamRepository;
import com.alrajhi.score.ScoreExtraction.repository.BScoreRequestRepository;
import com.alrajhi.score.ScoreExtraction.repository.BScoreResponseRepository;
import com.alrajhi.score.ScoreExtraction.repository.BatchLogRepository;
import com.alrajhi.score.ScoreExtraction.repository.InputBadRecordsLogRepository;
import com.alrajhi.score.ScoreExtraction.repository.LGDRequestRepository;
import com.alrajhi.score.ScoreExtraction.repository.LGDResponseRepository;
import com.alrajhi.score.ScoreExtraction.repository.RunLogRepository;
import com.alrajhi.score.ScoreExtraction.service.DecisionAgentService;
import com.alrajhi.score.ScoreExtraction.service.ScoreParserService;
import com.alrajhi.score.ScoreExtraction.utils.GeneralUtils;
import com.experian.stratman.datasources.runtime.IData;
import com.google.common.base.Stopwatch;

import lombok.extern.slf4j.Slf4j;


@EnableJpaRepositories("com.alrajhi.score.ScoreExtraction.repository")
@EntityScan("com.alrajhi.score.ScoreExtraction.entity")
@Slf4j
@Service
public class ScoreParserServiceImpl implements ScoreParserService {

	private SimpleDateFormat timeStampStringFormatter = new SimpleDateFormat("yyyyMMdd_HHmmss");	
	
    @Autowired
    private AScoreResponseRepository expAdhAScoreOutputRepository;

    @Autowired
    private AScoreRequestRepository expAdhAScoreInputRepository;

    @Autowired
    private BScoreResponseRepository expAdhBScoreOutputRepository;

    @Autowired
    private BScoreRequestRepository expAdhBScoreInputRepository;
    
    //////////////
    @Autowired
    private LGDResponseRepository expAdhLgdOutputRepository;

    @Autowired
    private LGDRequestRepository expAdhLgdInputRepository;

    /////////////

    @Autowired
    private InputBadRecordsLogRepository sql_loader_log_Repo;

    @Autowired
    private RunLogRepository RunLogRepository;

    @Autowired
    private BatchLogRepository BatchLogRepository;

    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    
    private int RecordsFound = 0;

    @Autowired
    GeneralUtils parserUtils;

    @Autowired
    DecisionAgentService decisionAgentService;
    //Dynamic loaded    

    @Value("${spring.jpa.properties.hibernate.dialect}")
    private String dbDialect;

    @Value("${spring.datasource.driver-class-name}")
    private String dbDriverClassName;

    @Value("${spring.datasource.url}")
    private String dbUrl;

    @Value("${spring.datasource.username}")
    private String dbUsername;

    @Value("${spring.datasource.password}")
    private String dbPassword;

    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String dbDdlAuto;

    @Value("${file-size-limit.in.bytes}")
    private long fileSizeLimit;

    @Value("${app.StoredProcedure.a-score.Name}")
    private String StoredProcedureNameaScore;

    @Value("${app.StoredProcedure.b-score.Name}")
    private String StoredProcedureNamebScore;
    
    @Value("${app.StoredProcedure.lgd.Name}")
    private String StoredProcedureNameLgd;

    @Value("${app.StoredProcedure.stg-move.Name}")
    private String StoredProcedureNameSTGmove;

    @Value("${app.StoredProcedure.a-score-move.Name}")
    private String StoredProcedureNameaScoremove;

    @Value("${app.StoredProcedure.b-score-move.Name}")
    private String StoredProcedureNamebScoremove;
    
    @Value("${app.StoredProcedure.lgd-move.Name}")
    private String StoredProcedureNameLgdmove;


    @Value("${app.input.directory}")
    private String inputDirectory;

    @Value("${app.output.fileName.a-score}")
    private String outputFileNameaScore;

    @Value("${app.output.fileName.b-score}")
    private String outputFileNamebScore;
    
    @Value("${app.output.fileName.lgd}")
    private String outputFileNameLgd;

    @Value("${file.insert.enabled.a-score}")
    private boolean fileInsertEnabledaScore;

    @Value("${file.insert.enabled.b-score}")
    private boolean fileInsertEnabledbScore;
    
    @Value("${file.insert.enabled.lgd}")
    private boolean fileInsertEnabledLgd;

    @Value("${scoring.enabled.a-score}")
    private boolean scoringEnabledaScore;

    @Value("${scoring.enabled.b-score}")
    private boolean scoringEnabledbScore;
    
    @Value("${scoring.enabled.lgd}")
    private boolean scoringEnabledLgd; 
    
    @Value("${app.sqlLoader.datafile}")
    private String Datafile;

    @Value("${app.sqlLoader.badfile}")
    private String badfile;

    @Value("${app.sqlLoader.command1logFile}")
    private String command1logFile;

    @Value("${app.sqlLoader.command2logFile}")
    private String command2logFile;

    @Value("${app.sqlLoader.Command1}")
    private String sqlLdrCommand1;

    @Value("${app.sqlLoader.Command2}")
    private String sqlLdrCommand2;

    @Value("${app.sqlLoaderout.directory}")
    private String sqlLoaderoutDirectory;

    @Value("${dbinsert.enabled.a-score}")
    private boolean dbInsertEnabledaScore;
    
    @Value("${dbinsert.enabled.b-score}")
    private boolean dbInsertEnabledbScore;
    
    @Value("${dbinsert.enabled.lgd}")
    private boolean dbInsertEnabledLgd;
    
    @Value("${app.processing.directory}")
    private String processingDirectory;

    @Value("${filesqlloader.insert.enabled}")
    private boolean filesqlloaderInsertEnabled;

    @Value("${app.sqlLoader.directory}")
    private String sqlLoaderDirectory;

    @Autowired
    AppParamRepository AppParamRepository;

    private String logResult;

    @Value("${app.logging.fileName}")
    private String logFileName;

    @Value("${app.logging.directory}")
    private String loggingDirectory;

    @Value("${app.logging.loglevel}")
    private String logLevel;

    @Value("${app.project.name}")
    private String logUser;
    
    private String aScoreAggregationFinished;
    
    private String bScoreAggregationFinished;
    
    private String lgdAggregationFinished;

    
    
    @Override
    public void startExecution() {

        log.info("Score Extraction Application Started ....");
        logResult = this.getClass().getName() + ": " + "Score Extraction Application Started :: Execution Time - " + dateTimeFormatter.format(LocalDateTime.now());
        if (logLevel.toUpperCase().equals("INFO")) {
        parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
        saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel.toUpperCase(), logResult, "APPLICATION", logUser, "Start", BigDecimal.valueOf(0));
    }
    }


    @Scheduled(fixedDelayString = "${fixed-rate.in.milliseconds}")
    public void startFolderScan() {
        try {
        	
        	
        	String timeStampString = timeStampStringFormatter.format(new Date());
            Stopwatch timer_scoreApplication = Stopwatch.createStarted();
            RecordsFound = 0;
            
            AppParam appParamObj = AppParamRepository.findByParamCode("AGG_COMPLETE");           
            
            aScoreAggregationFinished = appParamObj.getAttributeValueC1();
            bScoreAggregationFinished = appParamObj.getAttributeValueC2();
            
            lgdAggregationFinished = appParamObj.getAttributeValueC3();
            
            log.info("Fixed Rate Task :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));

            Map < String, String > entitymanagerfactoryproperties = new HashMap < String, String > ();

            entitymanagerfactoryproperties.put("hibernate.dialect", dbDialect);
            entitymanagerfactoryproperties.put("hibernate.hbm2ddl.auto", dbDdlAuto);
            entitymanagerfactoryproperties.put("javax.persistence.jdbc.driver", dbDriverClassName);
            entitymanagerfactoryproperties.put("javax.persistence.jdbc.url", dbUrl);
            entitymanagerfactoryproperties.put("javax.persistence.jdbc.user", dbUsername);
            entitymanagerfactoryproperties.put("javax.persistence.jdbc.password", dbPassword);

            EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("ScoreExtraction", entitymanagerfactoryproperties);
            EntityManager entitymanager = entitymanagerfactory.createEntityManager();

            log.info("---- I will scan input folders now ---- ");

            List < File > inputFiles = getInputFiles(inputDirectory);
            
            if (!CollectionUtils.isEmpty(inputFiles)) {
            	RecordsFound = 1;
                for (File file: inputFiles) {
                    String currentInputFilename = file.getName();
                    parserUtils.movFilestoProcessing(file, inputDirectory, processingDirectory);
                    loadDataFromSqlLoader(file, currentInputFilename, timeStampString);

                    //CALL PL/SQL PROCEDURE TO LOAD DATA IN A_SCORE_REQUEST

                    int p_status = loadSTGData(StoredProcedureNameaScore, entitymanager);

                    if (p_status == 1) {
                        logResult = StoredProcedureNameaScore + " procedure is failed.";
                        log.error(logResult);                        

                        if (logLevel.toUpperCase().equals("ERROR")) {
                        	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                            saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "A-SCORE", logUser, "Error", BigDecimal.valueOf(0));
                        }
                    } else {
                        logResult = StoredProcedureNameaScore + " procedure is successful.";
                        log.info(logResult);

                        if (logLevel.toUpperCase().equals("INFO")) {
                        	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                            saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "A-SCORE", logUser, "Processing", BigDecimal.valueOf(0));
                        }
                    }
                    //CALL PL/SQL PROCEDURE TO LOAD DATA IN B_SCORE_REQUEST

                    p_status = loadSTGData(StoredProcedureNamebScore, entitymanager);

                    if (p_status == 1) {
                        logResult = StoredProcedureNamebScore + " BSCORE procedure is failed.";
                        log.error(logResult);

                        if (logLevel.toUpperCase().equals("ERROR")) {
                        	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                            saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "B-SCORE", logUser, "Error", BigDecimal.valueOf(0));
                        }
                    } else {
                        logResult = StoredProcedureNamebScore + " BSCORE procedure is successful.";
                        log.info(logResult);

                        if (logLevel.toUpperCase().equals("INFO")) {
                        	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                            saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "B-SCORE", logUser, "Processing", BigDecimal.valueOf(0));
                        }
                    }
                    
                    
                    //CALL PL/SQL PROCEDURE TO LOAD DATA IN LGD_REQUEST

                    p_status = loadSTGData(StoredProcedureNameLgd, entitymanager);

                    if (p_status == 1) {
                        logResult = StoredProcedureNameLgd + " LGD procedure is failed.";
                        log.error(logResult);

                        if (logLevel.toUpperCase().equals("ERROR")) {
                        	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                            saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "LGD", logUser, "Error", BigDecimal.valueOf(0));
                        }
                    } else {
                        logResult = StoredProcedureNameLgd + " LGD procedure is successful.";
                        log.info(logResult);

                        if (logLevel.toUpperCase().equals("INFO")) {
                        	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                            saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "LGD", logUser, "Processing", BigDecimal.valueOf(0));
                        }
                    }

                    //CALL PL/SQL PROCEDURE TO MOVE DATA TO STG_SCORE_REQUEST_HIST

                    p_status = loadSTGData(StoredProcedureNameSTGmove, entitymanager);

                    if (p_status == 1) {
                        logResult = StoredProcedureNameSTGmove + " procedure is failed.";
                        log.error(logResult);

                        if (logLevel.toUpperCase().equals("ERROR")) {
                        	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                            saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "AAPLICATION", logUser, "Error", BigDecimal.valueOf(0));
                        }
                    } else {
                        logResult = StoredProcedureNameSTGmove + " procedure is successful.";
                        log.info(logResult);

                        if (logLevel.toUpperCase().equals("INFO")) {
                        	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                            saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "APPLICATION", logUser, "Processing", BigDecimal.valueOf(0));
                        }
                    }

                }
            } else {
                log.info("No new files at input dir {} ", inputDirectory);
            }           
            
            entitymanager.close();
            entitymanagerfactory.close();
            
            try {
                a_Score_thread_runnable a_Score_thread_runnable = new a_Score_thread_runnable();
                Thread a_Score_thread = new Thread(a_Score_thread_runnable);
                
                b_Score_thread_runnable b_Score_thread_runnable = new b_Score_thread_runnable();
                Thread b_Score_thread = new Thread(b_Score_thread_runnable);
                
                lgd_thread_runnable lgd_thread_runnable = new lgd_thread_runnable();
                Thread lgd_thread = new Thread(lgd_thread_runnable);
                
                               
            	if(scoringEnabledaScore && aScoreAggregationFinished.equals("1") && bScoreAggregationFinished.equals("1") && lgdAggregationFinished.equals("1"))
            	{
            		a_Score_thread.start();
            		log.info("Thread a_Score started.");
            	}
            	
            	if(scoringEnabledbScore && aScoreAggregationFinished.equals("1") && bScoreAggregationFinished.equals("1") && lgdAggregationFinished.equals("1"))
            	{
                    b_Score_thread.start();
                    log.info("Thread b_Score started.");
            	}
            	 if(scoringEnabledLgd && aScoreAggregationFinished.equals("1") && bScoreAggregationFinished.equals("1") && lgdAggregationFinished.equals("1"))
             	{
                     lgd_thread.start();
                     log.info("Thread LGD started.");
             	}
            	
                a_Score_thread.join();
                log.info("Thread a_Score finished.");
                b_Score_thread.join();
                log.info("Thread b_Score finished.");    
                lgd_thread.join();
	            log.info("Thread LGD finished.");
                
            } catch (Exception ex) {
                log.error(ex.getMessage(), ex);
                logResult = this.getClass().getName() + ": " + "Error in a_Score and b_Score threads, " + ex.getMessage();

                if (logLevel.toUpperCase().equals("ERROR")) {
                	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                    saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "APPLICATION", logUser, "Error", BigDecimal.valueOf(0));
                }
            }
            
            if(RecordsFound != 0)
            {
            entitymanagerfactory = Persistence.createEntityManagerFactory("ScoreExtraction", entitymanagerfactoryproperties);
            entitymanager = entitymanagerfactory.createEntityManager();
            //CALL PL/SQL PROCEDURE TO MOVE DATA TO A_SCORE_REQUEST_HIST

            int p_status = loadSTGData(StoredProcedureNameaScoremove, entitymanager);

            if (p_status == 1) {
                logResult = StoredProcedureNameaScoremove + " procedure is failed.";
                log.error(logResult);

                if (logLevel.toUpperCase().equals("ERROR")) {
                	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                    saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "A-SCORE", logUser, "Error", BigDecimal.valueOf(0));
                }
            } else {
                logResult = StoredProcedureNameaScoremove + " procedure is successful.";
                log.info(logResult);

                if (logLevel.toUpperCase().equals("INFO")) {
                	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                    saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "A-SCORE", logUser, "Processing", BigDecimal.valueOf(0));
                }
            }
            
            //CALL PL/SQL PROCEDURE TO MOVE DATA TO B_SCORE_REQUEST_HIST

            p_status = loadSTGData(StoredProcedureNamebScoremove, entitymanager);

            if (p_status == 1) {
                logResult = StoredProcedureNamebScoremove + " procedure is failed.";
                log.error(logResult);

                if (logLevel.toUpperCase().equals("ERROR")) {
                	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                    saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "B-SCORE", logUser, "Error", BigDecimal.valueOf(0));
                }
            } else {
                logResult = StoredProcedureNamebScoremove + " procedure is successful.";
                log.info(logResult);

                if (logLevel.toUpperCase().equals("INFO")) {
                	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                    saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "B-SCORE", logUser, "Processing", BigDecimal.valueOf(0));
                }
            }
            
            
            
            //CALL PL/SQL PROCEDURE TO MOVE DATA TO LGD_REQUEST_HIST

            p_status = loadSTGData(StoredProcedureNameLgdmove, entitymanager);

            if (p_status == 1) {
                logResult = StoredProcedureNameLgdmove + " procedure is failed.";
                log.error(logResult);

                if (logLevel.toUpperCase().equals("ERROR")) {
                	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                    saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "LGD", logUser, "Error", BigDecimal.valueOf(0));
                }
            } else {
                logResult = StoredProcedureNameLgdmove + " procedure is successful.";
                log.info(logResult);

                if (logLevel.toUpperCase().equals("INFO")) {
                	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                    saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "LGD", logUser, "Processing", BigDecimal.valueOf(0));
                }
            }
            entitymanager.close();
            entitymanagerfactory.close();
            }
            
            timer_scoreApplication.stop();
            log.info("Score application method took : {} Mill Seconds",
                timer_scoreApplication.elapsed(TimeUnit.MILLISECONDS));
            logResult = this.getClass().getName() + ": " + "Score application method took : " + timer_scoreApplication.elapsed(TimeUnit.MILLISECONDS) + " milliseconds";

            if (logLevel.toUpperCase().equals("INFO")) {
            	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "APPLICATION", logUser, "End", BigDecimal.valueOf(0));
            }
            
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            logResult = this.getClass().getName() + ": " + "Error in score extraction application, " + ex.getMessage();

            if (logLevel.toUpperCase().equals("ERROR")) {
            	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "APPLICATION", logUser, "Error", BigDecimal.valueOf(0));
            }
        }
        /////////// new Task ///////////
//        AScoreResponse firstResponse = expAdhAScoreOutputRepository.findTop1ByRunIdIsNotNullOrderByResponseIdAsc().get(0);
//        long maxResponseId = expAdhAScoreOutputRepository.getMaxId();
//        System.out.println(">>>>>>>>First Response "+firstResponse);
//        for (int i = 0; i < 10; i++) {
//        	firstResponse.setResponseId(maxResponseId+1);
//        	expAdhAScoreOutputRepository.saveAndFlush(firstResponse);
//            //expAdhAScoreOutputRepository.flush();
//		}
        ///////////// end of new Task //////////
    }

    private class a_Score_thread_runnable implements Runnable{  
    	public void run(){
    		try {
            Stopwatch timer_ascore = Stopwatch.createStarted();
            String timeStampString = timeStampStringFormatter.format(new Date());
            while (true) {            	
            //Processing a_Score
                log.info("---- I will scan next 10000 records in A_SCORE_REQUEST table now ----");
                List < AScoreRequest > all_requests_ascore = expAdhAScoreInputRepository.findTop10000ByProcessStatusIsNullOrderByRequestIdAsc();

                if (all_requests_ascore.size() != 0) {
                	RecordsFound = 1;
                    log.info("{} record(s) found to be scored in A_SCORE_REQUEST Table", all_requests_ascore.size());
                    logResult = this.getClass().getName() + ": " + all_requests_ascore.size() + " record(s) found to be scored in A_SCORE_REQUEST Table";

                    if (logLevel.toUpperCase().equals("INFO")) {
                    	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                        saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "A-SCORE", logUser, "Processing", BigDecimal.valueOf(0));
                    }

                    //for (AScoreRequest aScoreRequest: all_requests_ascore) {
                    //	executor_aScore(aScoreRequest, timeStampString);                        
                    //}
                    //all_requests_ascore.parallelStream().forEach(AScoreRequest -> executor_aScore(AScoreRequest, timeStampString));
                   
                    List < AScoreResponse > all_responses_ascore = all_requests_ascore.parallelStream().map(AScoreRequest -> executor_aScore(AScoreRequest, timeStampString)).filter(AScoreResponse -> AScoreResponse != null).collect(Collectors.toList());
                    if (dbInsertEnabledaScore) {
                    log.info("List of responses to be inserted = {} - application scorecard", all_responses_ascore.size());
                    expAdhAScoreOutputRepository.saveAll(all_responses_ascore);
                    expAdhAScoreOutputRepository.flush();
                    log.info("List of responses with size {} are inserted successfully - application scorecard", all_responses_ascore.size());
                    logResult = this.getClass().getName() + ": " + "List of responses with size " + all_responses_ascore.size() + " are inserted successfully in response - application scorecard";
                    if (logLevel.toUpperCase().equals("INFO")) {
                    	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                        saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "A-SCORE", logUser, "Processing", BigDecimal.valueOf(0));
                    }}
                    
                } else {                	
                    log.info("No new records in A_SCORE_REQUEST table");
                    break;
                }}
            timer_ascore.stop();
            log.info("A-Score method took : {} Mill Seconds",
                timer_ascore.elapsed(TimeUnit.MILLISECONDS));
            logResult = this.getClass().getName() + ": " + "A-Score method took : " + timer_ascore.elapsed(TimeUnit.MILLISECONDS) + " milliseconds";

            if (logLevel.toUpperCase().equals("INFO")) {
            	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "A-SCORE", logUser, "End", BigDecimal.valueOf(0));
            }
            } catch (Exception e) {
                log.error(e.getMessage(), e);
                logResult = this.getClass().getName() + ": " + "Error in processing A-Score thread runnable, " + e.getMessage();

                if (logLevel.toUpperCase().equals("ERROR")) {
                	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                    saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "A-SCORE", logUser, "Error", BigDecimal.valueOf(0));
                }
            }
    		}}

    private class b_Score_thread_runnable implements Runnable{  
    	public void run(){
    		try {
            //Processing b_Score
            Stopwatch timer_bscore = Stopwatch.createStarted();
            String timeStampString = timeStampStringFormatter.format(new Date());
            while (true) {
            log.info("---- I will scan next 10000 records in B_SCORE_REQUEST table now ----");
            List < BScoreRequest > all_requests_bscore = expAdhBScoreInputRepository.findTop10000ByProcessStatusIsNullOrderByRequestIdAsc();
            
                if (all_requests_bscore.size() != 0) {
                	RecordsFound = 1;
                    log.info("{} record(s) found to be scored in B_SCORE_REQUEST Table", all_requests_bscore.size());
                    logResult = this.getClass().getName() + ": " + all_requests_bscore.size() + " record(s) found to be scored in B_SCORE_REQUEST Table";

                    if (logLevel.toUpperCase().equals("INFO")) {
                    	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                        saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "B-SCORE", logUser, "Processing", BigDecimal.valueOf(0));
                    }

                    //for (BScoreRequest bScoreRequest: all_requests_bscore) {
                    //        	executor_bScore(bScoreRequest, timeStampString);
                    //}                    
                    //all_requests_bscore.parallelStream().forEach(BScoreRequest -> executor_bScore(BScoreRequest, timeStampString));
                    List < BScoreResponse > all_responses_bscore = all_requests_bscore.parallelStream().map(BScoreRequest -> executor_bScore(BScoreRequest, timeStampString)).filter(BScoreResponse -> BScoreResponse != null).collect(Collectors.toList());                                      
                    
                    if (dbInsertEnabledbScore) {
                    log.info("List of responses to be inserted = {} - behaviour scorecard", all_responses_bscore.size());
                    expAdhBScoreOutputRepository.saveAll(all_responses_bscore);
                    expAdhBScoreOutputRepository.flush();
                    log.info("List of responses with size {} are inserted successfully - behaviour scorecard", all_responses_bscore.size());
                    logResult = this.getClass().getName() + ": " + "List of responses with size " + all_responses_bscore.size() + " are inserted successfully in response - behaviour scorecard";
                    if (logLevel.toUpperCase().equals("INFO")) {
                    	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                        saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "B-SCORE", logUser, "Processing", BigDecimal.valueOf(0));
                    }}

                } else {
                    log.info("No new records in B_SCORE_REQUEST table");
                    break;
                }}
            timer_bscore.stop();
            log.info("B-Score method took : {} Mill Seconds",
                timer_bscore.elapsed(TimeUnit.MILLISECONDS));
            logResult = this.getClass().getName() + ": " + "B-Score method took : " + timer_bscore.elapsed(TimeUnit.MILLISECONDS) + " milliseconds";

            if (logLevel.toUpperCase().equals("INFO")) {
            	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "B-SCORE", logUser, "End", BigDecimal.valueOf(0));
            }
            } catch (Exception e) {
                log.error(e.getMessage(), e);
                logResult = this.getClass().getName() + ": " + "Error in processing B-Score thread runnable, " + e.getMessage();

                if (logLevel.toUpperCase().equals("ERROR")) {
                	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                    saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "B-SCORE", logUser, "Error", BigDecimal.valueOf(0));
                }
            }
    		}}
    
    ////////LGD_thread_runnable/////////
    private class lgd_thread_runnable implements Runnable{  
    	public void run(){
    		try {
            //Processing Lgd
            Stopwatch timer_lgd = Stopwatch.createStarted();
            String timeStampString = timeStampStringFormatter.format(new Date());
            while (true) {
            log.info("---- I will scan next 10000 records in LGD_REQUEST table now ----");
            List < LGDRequest > all_requests_lgd = expAdhLgdInputRepository.findTop10000ByProcessStatusIsNullOrderByRequestIdAsc();
            
                if (all_requests_lgd.size() != 0) {
                	RecordsFound = 1;
                    log.info("{} record(s) found to be scored in LGD_REQUEST Table", all_requests_lgd.size());
                    logResult = this.getClass().getName() + ": " + all_requests_lgd.size() + " record(s) found to be scored in LGD_REQUEST Table"+" "+ dateTimeFormatter.format(LocalDateTime.now());

                    if (logLevel.toUpperCase().equals("INFO")) {
                    	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                        saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "LGD", logUser, "Processing", BigDecimal.valueOf(0));
                    }

                    
                    List < LGDResponse > all_responses_lgd = all_requests_lgd.parallelStream().map(LGDRequest -> executor_lgd(LGDRequest, timeStampString)).filter(LGDResponse -> LGDResponse != null).collect(Collectors.toList());                                      
                    
                    if (dbInsertEnabledLgd) {
                    log.info("List of responses to be inserted = {} - LGD scorecard", all_responses_lgd.size());
                    expAdhLgdOutputRepository.saveAll(all_responses_lgd);
                    expAdhLgdOutputRepository.flush();
                    log.info("List of responses with size {} are inserted successfully - LGD scorecard", all_responses_lgd.size());
                    logResult = this.getClass().getName() + ": " + "List of responses with size " + all_responses_lgd.size() + " are inserted successfully in response - LGD scorecard";
                    if (logLevel.toUpperCase().equals("INFO")) {
                    	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                        saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "LGD", logUser, "Processing", BigDecimal.valueOf(0));
                    }}

                } else {
                    log.info("No new records in LGD_REQUEST table");
                    break;
                }}
            timer_lgd.stop();
            log.info("LGD-Score method took : {} Mill Seconds",
                timer_lgd.elapsed(TimeUnit.MILLISECONDS));
            logResult = this.getClass().getName() + ": " + "LGD-Score method took : " + timer_lgd.elapsed(TimeUnit.MILLISECONDS) + " milliseconds";

            if (logLevel.toUpperCase().equals("INFO")) {
            	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "LGD-SCORE", logUser, "End", BigDecimal.valueOf(0));
            }
            } catch (Exception e) {
                log.error(e.getMessage(), e);
                logResult = this.getClass().getName() + ": " + "Error in processing LGD-Score thread runnable, " + e.getMessage()+" "+ dateTimeFormatter.format(LocalDateTime.now());

                if (logLevel.toUpperCase().equals("ERROR")) {
                	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                    saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "LGD-SCORE", logUser, "Error", BigDecimal.valueOf(0));
                }
            }
    		}}

   ////////////////////////////////////////
    private AScoreResponse executor_aScore(AScoreRequest aScoreRequest, String timeStampString) {
    	AScoreResponse ascoreOutput = null;
    	try {
            RowOutput rowOutput_ascore = null;
            rowOutput_ascore = processInputRowByRow_ascore(aScoreRequest);
            //log.info("Scoring_Segment A = {}",rowOutput_ascore.getOutputMap().get("Scoring_Segment").toString());
            
            if (rowOutput_ascore.getOutputMap().get("Scoring_Segment").toString().length() != 0 &&
            		!rowOutput_ascore.getOutputMap().get("Scoring_Segment").toString().equalsIgnoreCase("No_Scorecard") &&
            		rowOutput_ascore.getOutputHeaders().size() != 0 && rowOutput_ascore.getRowData().size() != 0 &&
            		rowOutput_ascore.getOutputMap().size() != 0) {
                expAdhAScoreInputRepository.setProcessStatusForAScoreRequest("Proceed", aScoreRequest.getRequestId());
                log.info("Row with request_id {} is scored successfully - application scorecard", aScoreRequest.getRequestId());
                logResult = "Row is scored successfully ASCORE "+" "+BigDecimal.valueOf(aScoreRequest.getRequestId())+" "+ dateTimeFormatter.format(LocalDateTime.now());
                if (logLevel.toUpperCase().equals("INFO")) {
                	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                    saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "A-SCORE", logUser, "Processing", BigDecimal.valueOf(aScoreRequest.getRequestId()));
                }
                if (fileInsertEnabledaScore) {
                    // Call The write function
                    decisionAgentService.writOutput_aScore(aScoreRequest.getRequestId(), aScoreRequest.getRunId().toString(), "application scorecard", rowOutput_ascore, outputFileNameaScore, timeStampString);
                }
                    ascoreOutput = buildExpAdhAScoreOutput(rowOutput_ascore.getOutputMap(), aScoreRequest.getRequestId(), aScoreRequest.getRunId());
            } else {
                expAdhAScoreInputRepository.setProcessStatusForAScoreRequest("Failed", aScoreRequest.getRequestId());
                log.info("Row with request_id {} is failed - application scorecard", aScoreRequest.getRequestId());
                logResult =  "Row failed ASCORE" +" "+BigDecimal.valueOf(aScoreRequest.getRequestId())+" "+ dateTimeFormatter.format(LocalDateTime.now());
                if (rowOutput_ascore.getOutputMap().size() == 0)
					logResult += " because stratgy output size is = " + rowOutput_ascore.getOutputMap().size();
				if (rowOutput_ascore.getOutputMap().size() != 0
						&& rowOutput_ascore.getOutputMap().get("Scoring_Segment").toString().length() == 0)
					logResult += " because Scoring_Segment is  = "
							+ rowOutput_ascore.getOutputMap().get("Scoring_Segment").toString().length();
				if (rowOutput_ascore.getOutputMap().size() != 0
						&& rowOutput_ascore.getOutputMap().get("Scoring_Segment").toString().length() != 0)
					logResult += " because Scoring_Segment is  = "
							+ rowOutput_ascore.getOutputMap().get("Scoring_Segment").toString();
                if (logLevel.toUpperCase().equals("ERROR")) {
                	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                    saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "A-SCORE", logUser, "Error", BigDecimal.valueOf(aScoreRequest.getRequestId()));
                }
            }

        } catch (Exception e) {
            log.error(e.getMessage(), e);
            logResult= "Error in processing input row by row for A-Score, " + e.getMessage()+" "+BigDecimal.valueOf(aScoreRequest.getRequestId())+" "+ dateTimeFormatter.format(LocalDateTime.now());

            if (logLevel.toUpperCase().equals("ERROR")) {
            	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "A-SCORE", logUser, "Error", BigDecimal.valueOf(0));
            }
        }
    	return ascoreOutput;
    }

    private BScoreResponse executor_bScore(BScoreRequest bScoreRequest, String timeStampString) {
    	BScoreResponse bscoreOutput = null;
        try {
            RowOutput rowOutput_bscore = null;
            rowOutput_bscore = processInputRowByRow_bscore(bScoreRequest);
            //log.info("Scoring_Segment B = {}",rowOutput_bscore.getOutputMap().get("B_Scorecard.Scoring_Segment").toString());
            if (rowOutput_bscore.getOutputMap().get("B_Scorecard.Scoring_Segment").toString().length() != 0 && !rowOutput_bscore.getOutputMap().get("B_Scorecard.Scoring_Segment").toString().equalsIgnoreCase("No_Scorecard") && rowOutput_bscore.getOutputHeaders().size() != 0 && rowOutput_bscore.getRowData().size() != 0 && rowOutput_bscore.getOutputMap().size() != 0) {
                expAdhBScoreInputRepository.setProcessStatusForBScoreRequest("Proceed", bScoreRequest.getRequestId());
                log.info("Row with request_id {} is scored successfully - behaviour scorecard", bScoreRequest.getRequestId());
                logResult =  "Row is scored successfully BSCORE"+" "+BigDecimal.valueOf(bScoreRequest.getRequestId())+" "+ dateTimeFormatter.format(LocalDateTime.now());
                if (logLevel.toUpperCase().equals("INFO")) {
                	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                    saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "B-SCORE", logUser, "Processing", BigDecimal.valueOf(bScoreRequest.getRequestId()));
                }
                if (fileInsertEnabledbScore) {
                    // Call The write function
                    decisionAgentService.writOutput_bScore(bScoreRequest.getRequestId(), bScoreRequest.getRunId().toString(), "behaviour scorecard", rowOutput_bscore, outputFileNamebScore, timeStampString);
                }              
                    bscoreOutput = buildExpAdhBScoreOutput(rowOutput_bscore.getOutputMap(), bScoreRequest.getRequestId(), bScoreRequest.getRunId());                    
            } else {
				expAdhBScoreInputRepository.setProcessStatusForBScoreRequest("Failed", bScoreRequest.getRequestId());
				log.info("Row with request_id {} is failed - behaviour scorecard", bScoreRequest.getRequestId());
				logResult =  "Row failed BSCORE "+" "+BigDecimal.valueOf(bScoreRequest.getRequestId())+" "+ dateTimeFormatter.format(LocalDateTime.now());
				if (rowOutput_bscore.getOutputMap().size() == 0)
					logResult += " because stratgy output size is = " + rowOutput_bscore.getOutputMap().size();
				if (rowOutput_bscore.getOutputMap().size() != 0
						&& rowOutput_bscore.getOutputMap().get("B_Scorecard.Scoring_Segment").toString().length() == 0 && rowOutput_bscore.getOutputMap().get("B_Scorecard.Scoring_Segment").toString().isEmpty())
					logResult += " because B_Scorecard.Scoring_Segment is  = "
							+ rowOutput_bscore.getOutputMap().get("B_Scorecard.Scoring_Segment").toString().length();
				if (rowOutput_bscore.getOutputMap().size() != 0
						&& rowOutput_bscore.getOutputMap().get("B_Scorecard.Scoring_Segment").toString().length() != 0 && !rowOutput_bscore.getOutputMap().get("B_Scorecard.Scoring_Segment").toString().isEmpty())
					logResult += " because B_Scorecard.Scoring_Segment is  = "
							+ rowOutput_bscore.getOutputMap().get("B_Scorecard.Scoring_Segment").toString();
				if (logLevel.toUpperCase().equals("ERROR")) {
					parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
					saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "B-SCORE", logUser, "Error", BigDecimal.valueOf(bScoreRequest.getRequestId()));
                }
            }
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            logResult = "Error in processing input row by row for B-Score, " + e.getMessage()+" "+BigDecimal.valueOf(bScoreRequest.getRequestId())+" "+ dateTimeFormatter.format(LocalDateTime.now());

            if (logLevel.toUpperCase().equals("ERROR")) {
            	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "B-SCORE", logUser, "Error", BigDecimal.valueOf(0));
            }
        }
        return bscoreOutput;
    }

		 ////////executor_lgd////////////////
    private LGDResponse executor_lgd(LGDRequest lgdRequest, String timeStampString) {
    	LGDResponse lgdOutput = null;
        try {
            RowOutput rowOutput_lgd = null;
            rowOutput_lgd = processInputRowByRow_lgd(lgdRequest);
            //log.info(" LGD = {}",rowOutput_lgd.getOutputMap().get("Model.Modelid").toString());
            //rowOutput_lgd.getOutputMap().get("Requestid").toString();
            
            if (rowOutput_lgd.getOutputMap().size() != 0 && rowOutput_lgd.getOutputMap().get("Model.Modelid").toString().length() != 0 && !rowOutput_lgd.getOutputMap().get("Model.Modelid").toString().isEmpty()) {
                expAdhLgdInputRepository.setProcessStatusForLGDRequest("Proceed", lgdRequest.getRequestId());
                log.info("Row with request_id {} is scored successfully - LGD ", lgdRequest.getRequestId());
                logResult =  "Row  is scored successfully LGD SCORE" +" "+BigDecimal.valueOf(lgdRequest.getRequestId())+" "+ dateTimeFormatter.format(LocalDateTime.now());
                if (logLevel.toUpperCase().equals("INFO")) {
                	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                    saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "LGD", logUser, "Processing", BigDecimal.valueOf(lgdRequest.getRequestId()));
                }
                if (fileInsertEnabledLgd) {
                    // Call The write function
                    decisionAgentService.writOutput_lgd(lgdRequest.getRequestId(), lgdRequest.getRunId().toString(), "LGD", rowOutput_lgd, outputFileNameLgd, timeStampString);
                }              
                    lgdOutput = buildExpAdhLgdOutput(rowOutput_lgd.getOutputMap(), lgdRequest.getRequestId(), lgdRequest.getRunId());                    
            } else {
                expAdhLgdInputRepository.setProcessStatusForLGDRequest("Failed", lgdRequest.getRequestId());
                log.info("Row with request_id {} is failed - LGD ", lgdRequest.getRequestId());
                logResult =  "Row failed LGD SCORE"+" "+BigDecimal.valueOf(lgdRequest.getRequestId())+" "+ dateTimeFormatter.format(LocalDateTime.now());
                if (rowOutput_lgd.getOutputMap().size() == 0)
                	logResult += " because stratgy output size is = " +rowOutput_lgd.getOutputMap().size();
                	if (rowOutput_lgd.getOutputMap().size() != 0 && rowOutput_lgd.getOutputMap().get("Model.Modelid").toString().length() == 0)
                		logResult += " because Model.Modelid is  = " +rowOutput_lgd.getOutputMap().get("Model.Modelid").toString().length() ;
                if (logLevel.toUpperCase().equals("ERROR")) {
                	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                    saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "LGD", logUser, "Error", BigDecimal.valueOf(lgdRequest.getRequestId()));
                }
            }
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            logResult =  "Error in processing input row by row for LGD-Score, " + e.getMessage()+" "+BigDecimal.valueOf(lgdRequest.getRequestId())+" "+ dateTimeFormatter.format(LocalDateTime.now());

            if (logLevel.toUpperCase().equals("ERROR")) {
            	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "LGD", logUser, "Error", BigDecimal.valueOf(0));
            }
        }
        return lgdOutput;
    }


		///////////////////////////////////////
    
    private void loadDataFromSqlLoader(File file, String currentInputFilename, String timeStampString) {
        try {
            Timestamp batchTimestamp = new Timestamp(System.currentTimeMillis());

            Process sqlLoaderProcess = Runtime.getRuntime().exec(sqlLdrCommand1);

            StringBuffer processInputStringBuffer = new StringBuffer();
            BufferedReader processBufferedReader = new BufferedReader(new InputStreamReader(sqlLoaderProcess.getInputStream()));
            String processBufferedReaderline = null;
            int processBufferedReaderCounter = 0;
            while ((processBufferedReaderline = processBufferedReader.readLine()) != null) {
                if (0 != processBufferedReaderCounter)
                    processInputStringBuffer.append("\r\n");
                processBufferedReaderCounter++;
                processInputStringBuffer.append(processBufferedReaderline);
            }

            sqlLoaderProcess.waitFor();
            if (sqlLoaderProcess.exitValue() == 1) {
                log.error("Sql loader command for uploading data in STG_SCORE_Requests is failed");
            } else {
                log.info("Sql loader command for uploading data in STG_SCORE_Requests is successful");
                batchTimestamp = new Timestamp(System.currentTimeMillis());
                saveBatchLogOutputToDB(Long.valueOf("0"), file.getName(), batchTimestamp);
                if (filesqlloaderInsertEnabled) {
                    parserUtils.movFile(processingDirectory + File.separator + Datafile, sqlLoaderoutDirectory + File.separator + currentInputFilename.replace(".csv", "") + timeStampString + ".csv");
                }
            }

            boolean error = false;
            if (parserUtils.findFile(badfile, new File(processingDirectory))) {
                Process sqlLoaderBadRecordsProcess = Runtime.getRuntime().exec(sqlLdrCommand2);

                processInputStringBuffer = new StringBuffer();
                processBufferedReader = new BufferedReader(new InputStreamReader(sqlLoaderBadRecordsProcess.getInputStream()));
                processBufferedReaderline = null;
                processBufferedReaderCounter = 0;
                while ((processBufferedReaderline = processBufferedReader.readLine()) != null) {
                    if (0 != processBufferedReaderCounter)
                        processInputStringBuffer.append("\r\n");
                    processBufferedReaderCounter++;
                    processInputStringBuffer.append(processBufferedReaderline);
                }

                sqlLoaderBadRecordsProcess.waitFor();
                if (sqlLoaderBadRecordsProcess.exitValue() == 1) {
                    log.error("Sql loader command for uploading data in STG_SCORE_Requests_Bad_Records is failed");
                    error = true;
                } else {
                    log.info("Sql loader command for uploading data in STG_SCORE_Requests_Bad_Records is successful");
                    parserUtils.movFile(processingDirectory + File.separator + badfile, sqlLoaderoutDirectory + File.separator + currentInputFilename.replace(".csv", "") + "_Bad_Records" + timeStampString + ".csv");
                }
            }

            SQLLoaderLoging(file.getName(), command1logFile);

            if (error) {
                SQLLoaderLoging(file.getName(), command2logFile);
            }
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            logResult = this.getClass().getName() + ": " + "Error during data load from SQL Loader, " + ex.getMessage();

            if (logLevel.toUpperCase().equals("ERROR")) {
            	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "APPLICATION", logUser, "Error", BigDecimal.valueOf(0));
            }
        }
    }

    private void SQLLoaderLoging(String orignalFileName, String logFileName) {
        try {
            File file = new File(sqlLoaderDirectory + File.separator + logFileName);
            BufferedReader br = new BufferedReader(new FileReader(file));

            List < String > errorMessages = new ArrayList < String > ();
            List < String > infoMessages = new ArrayList < String > ();
            String currentline;
            String previousline = null;
            while ((currentline = br.readLine()) != null) {
                if (currentline.startsWith("ORA-")) {
                    errorMessages.add(previousline + " " + currentline);
                } else if (currentline.startsWith("SQL*Loader-")) {
                    errorMessages.add(currentline);
                } else if (currentline.startsWith("Total logical records skipped:")) {
                    infoMessages.add(currentline);
                } else if (currentline.startsWith("Total logical records read:")) {
                    infoMessages.add(currentline);
                } else if (currentline.startsWith("Total logical records rejected:")) {
                    infoMessages.add(currentline);
                } else if (currentline.startsWith("Total logical records discarded:")) {
                    infoMessages.add(currentline);
                }

                previousline = currentline;
            }
            br.close();
            Timestamp ts = new Timestamp(System.currentTimeMillis());

            List < InputBadRecordsLog > all_logs = sql_loader_log_Repo.findByOrderByLogIdDesc();

            BigDecimal logId = null;

            if (all_logs.size() == 0) {
                logId = new BigDecimal(0);
            } else {
                logId = all_logs.get(0).getLogId();
            }

            logId = logId.add(new BigDecimal(1));

            for (String msg: errorMessages) {
                InputBadRecordsLog sql_loader_log = new InputBadRecordsLog();

                sql_loader_log.setLogId(logId);
                sql_loader_log.setLogDate(ts);
                sql_loader_log.setLogType("Error");
                sql_loader_log.setLogMsg(msg);
                sql_loader_log.setFileName(orignalFileName);

                sql_loader_log_Repo.saveAndFlush(sql_loader_log);

                ts = new Timestamp(ts.getTime() + 5 * 1000);
            }

            List < InputBadRecordsLog > all_new_logs = new ArrayList < InputBadRecordsLog > ();
            for (String msg: infoMessages) {
                InputBadRecordsLog sql_loader_log = new InputBadRecordsLog();

                sql_loader_log.setLogId(logId);
                sql_loader_log.setLogDate(ts);
                sql_loader_log.setLogType("Information");
                sql_loader_log.setLogMsg(msg);
                sql_loader_log.setFileName(orignalFileName);
                all_new_logs.add(sql_loader_log);
                ts = new Timestamp(ts.getTime() + 5 * 1000);
            }

            sql_loader_log_Repo.saveAll(all_new_logs);


        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            logResult = this.getClass().getName() + ": " + "Error during writing log of SQL loader, " + ex.getMessage();

            if (logLevel.toUpperCase().equals("ERROR")) {
            	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "APPLICATION", logUser, "Error", BigDecimal.valueOf(0));
            }
        }
    }

    private RowOutput processInputRowByRow_ascore(AScoreRequest aScoreRequest) {
        RowOutput output = null;
        DataArea inputData;
        IData[] dataAreas = new IData[3];
        try {
            Map < String, Object > Entity_data = PropertyUtils.describe(aScoreRequest);
            inputData = decisionAgentService.buildInputFromDB_ascore(Entity_data);
            dataAreas = decisionAgentService.runAgent_ascore(inputData, aScoreRequest.getRequestId());
            output = decisionAgentService.buildRowOutput_ascore(dataAreas, String.valueOf(aScoreRequest.getRequestId()), String.valueOf(aScoreRequest.getRunId()));
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            logResult = this.getClass().getName() + ": " + "Error in processing records row by row, " + ex.getMessage()+" "+BigDecimal.valueOf(aScoreRequest.getRequestId())+" "+ dateTimeFormatter.format(LocalDateTime.now());

            if (logLevel.toUpperCase().equals("ERROR")) {
            	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "A-SCORE", logUser, "Error", BigDecimal.valueOf(0));
            }
        }
        return output;
    }

    private RowOutput processInputRowByRow_bscore(BScoreRequest bScoreRequest) {
        RowOutput output = null;
        DataArea inputData;
        IData[] dataAreas = new IData[3];
        try {
            Map < String, Object > Entity_data = PropertyUtils.describe(bScoreRequest);
            inputData = decisionAgentService.buildInputFromDB_bscore(Entity_data);
            dataAreas = decisionAgentService.runAgent_bscore(inputData, bScoreRequest.getRequestId());
            output = decisionAgentService.buildRowOutput_bscore(dataAreas, String.valueOf(bScoreRequest.getRequestId()), String.valueOf(bScoreRequest.getRunId()));
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            logResult = this.getClass().getName() + ": " + "Error in processing records row by row, " + ex.getMessage()+" "+BigDecimal.valueOf(bScoreRequest.getRequestId())+" "+ dateTimeFormatter.format(LocalDateTime.now());

            if (logLevel.toUpperCase().equals("ERROR")) {
            	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "B-SCORE", logUser, "Error", BigDecimal.valueOf(0));
            }
        }
        return output;
    }

    	////////processInputRowByRow_lgd/////////
    private RowOutput processInputRowByRow_lgd(LGDRequest lgdRequest) {
        RowOutput output = null;
        DataArea inputData;
        IData[] dataAreas = new IData[3];
        try {
            Map < String, Object > Entity_data = PropertyUtils.describe(lgdRequest);
            inputData = decisionAgentService.buildInputFromDB_lgd(Entity_data);
            dataAreas = decisionAgentService.runAgent_lgd(inputData, lgdRequest.getRequestId());
            output = decisionAgentService.buildRowOutput_lgd(dataAreas, String.valueOf(lgdRequest.getRequestId()), String.valueOf(lgdRequest.getRunId()));
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            logResult = this.getClass().getName() + ": " + "Error in processing records row by row, " + ex.getMessage()+" "+BigDecimal.valueOf(lgdRequest.getRequestId())+" "+ dateTimeFormatter.format(LocalDateTime.now());

            if (logLevel.toUpperCase().equals("ERROR")) {
            	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "LGD-SCORE", logUser, "Error", BigDecimal.valueOf(0));
            }
        }
        return output;
    }

	   ////////////////////////////////////////////
    
    @Override
    public List < File > getInputFiles(String path) {
        log.info("Read input files in path {} ", path);
        List < File > result = null;
        try (Stream < Path > walk = Files.walk(Paths.get(path), 1)) {
            result = walk.filter(f -> f.getFileName().toString().toLowerCase().endsWith(".csv") &&
                f.toFile().length() < fileSizeLimit).map(x -> x.toFile()).collect(Collectors.toList());
            if (!CollectionUtils.isEmpty(result)) {
                log.info("I found the following files..");
                result.forEach(f -> {
                    log.info("-> " + f.getName());
                });
            }

        } catch (IOException e) {
            log.error(e.getMessage(), e);
        }

        return result;
    }

    public void saveLogOutputToDB(Date logDate, String logLevel, String logResult, String logType, String logUser, String runStatus, BigDecimal requestID) {
        try {
            RunLog logObj = new RunLog();
            long logID = logObj.getLogId();

            //setting log table columns
            logObj.setLogId(logID);
            logObj.setLogDate(logDate);
            logObj.setLogLevel(logLevel);
            logObj.setLogResult(logResult);
            logObj.setLogType(logType);
            logObj.setLogUser(logUser);
            logObj.setRunStatus(runStatus);
            logObj.setRequestId(requestID);

            RunLogRepository.saveAndFlush(logObj);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
    }

    public void saveBatchLogOutputToDB(long batchId, String batchFileName, Timestamp batchTimestamp) {
        try {
            BatchLog logObj = new BatchLog();

            //setting log table columns
            logObj.setBatchId(batchId);
            logObj.setBatchFileName(batchFileName);
            logObj.setBatchTimestamp(batchTimestamp);

            BatchLogRepository.saveAndFlush(logObj);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
    }
    
    private AScoreResponse buildExpAdhAScoreOutput(Map < String, Object > outputMap, long requestId, BigDecimal runId) {
        AScoreResponse output = new AScoreResponse();
        try {
        	output.setRequestId(new BigDecimal(requestId, MathContext.DECIMAL64));
        	output.setRunId(runId);
        	output.setAScorApprovalDelegation(outputMap.get("A_Scorecard.Approval_Delegation").toString());
        	output.setAScorElement01(outputMap.get("A_Scorecard.Element_01").toString());
        	output.setAScorElement02(outputMap.get("A_Scorecard.Element_02").toString());
        	output.setAScorElement03(outputMap.get("A_Scorecard.Element_03").toString());
        	output.setAScorElement04(outputMap.get("A_Scorecard.Element_04").toString());
        	output.setAScorElement05(outputMap.get("A_Scorecard.Element_05").toString());
        	output.setAScorElement06(outputMap.get("A_Scorecard.Element_06").toString());
        	output.setAScorElement07(outputMap.get("A_Scorecard.Element_07").toString());
        	output.setAScorElement08(outputMap.get("A_Scorecard.Element_08").toString());
        	output.setAScorElement09(outputMap.get("A_Scorecard.Element_09").toString());
        	output.setAScorElement10(outputMap.get("A_Scorecard.Element_10").toString());
        	output.setAScorElement11(outputMap.get("A_Scorecard.Element_11").toString());
        	output.setAScorElement12(outputMap.get("A_Scorecard.Element_12").toString());
        	output.setAScorElement13(outputMap.get("A_Scorecard.Element_13").toString());
        	output.setAScorElement14(outputMap.get("A_Scorecard.Element_14").toString());
        	output.setAScorElement15(outputMap.get("A_Scorecard.Element_15").toString());
        	output.setAScorElement16(outputMap.get("A_Scorecard.Element_16").toString());
        	output.setAScorElement17(outputMap.get("A_Scorecard.Element_17").toString());
        	output.setAScorElement18(outputMap.get("A_Scorecard.Element_18").toString());
        	output.setAScorElement19(outputMap.get("A_Scorecard.Element_19").toString());
        	output.setAScorElement20(outputMap.get("A_Scorecard.Element_20").toString());
        	output.setAScorField01(outputMap.get("A_Scorecard.Field_01").toString());
        	output.setAScorField02(outputMap.get("A_Scorecard.Field_02").toString());
        	output.setAScorField03(outputMap.get("A_Scorecard.Field_03").toString());
        	output.setAScorField04(outputMap.get("A_Scorecard.Field_04").toString());
        	output.setAScorField05(outputMap.get("A_Scorecard.Field_05").toString());
        	output.setAScorField06(outputMap.get("A_Scorecard.Field_06").toString());
        	output.setAScorField07(outputMap.get("A_Scorecard.Field_07").toString());
        	output.setAScorField08(outputMap.get("A_Scorecard.Field_08").toString());
        	output.setAScorField09(outputMap.get("A_Scorecard.Field_09").toString());
        	output.setAScorField10(outputMap.get("A_Scorecard.Field_10").toString());
        	output.setAScorField11(outputMap.get("A_Scorecard.Field_11").toString());
        	output.setAScorField12(outputMap.get("A_Scorecard.Field_12").toString());
        	output.setAScorField13(outputMap.get("A_Scorecard.Field_13").toString());
        	output.setAScorField14(outputMap.get("A_Scorecard.Field_14").toString());
        	output.setAScorField15(outputMap.get("A_Scorecard.Field_15").toString());
        	output.setAScorField16(outputMap.get("A_Scorecard.Field_16").toString());
        	output.setAScorField17(outputMap.get("A_Scorecard.Field_17").toString());
        	output.setAScorField18(outputMap.get("A_Scorecard.Field_18").toString());
        	output.setAScorField19(outputMap.get("A_Scorecard.Field_19").toString());
        	output.setAScorField20(outputMap.get("A_Scorecard.Field_20").toString());
        	output.setAScorOutcome01(outputMap.get("A_Scorecard.Outcome_01").toString());
        	output.setAScorOutcome02(outputMap.get("A_Scorecard.Outcome_02").toString());
        	output.setAScorOutcome03(outputMap.get("A_Scorecard.Outcome_03").toString());
        	output.setAScorOutcome04(outputMap.get("A_Scorecard.Outcome_04").toString());
        	output.setAScorOutcome05(outputMap.get("A_Scorecard.Outcome_05").toString());
        	output.setAScorOutcome06(outputMap.get("A_Scorecard.Outcome_06").toString());
        	output.setAScorOutcome07(outputMap.get("A_Scorecard.Outcome_07").toString());
        	output.setAScorOutcome08(outputMap.get("A_Scorecard.Outcome_08").toString());
        	output.setAScorOutcome09(outputMap.get("A_Scorecard.Outcome_09").toString());
        	output.setAScorOutcome10(outputMap.get("A_Scorecard.Outcome_10").toString());
        	output.setAScorOutcome11(outputMap.get("A_Scorecard.Outcome_11").toString());
        	output.setAScorOutcome12(outputMap.get("A_Scorecard.Outcome_12").toString());
        	output.setAScorOutcome13(outputMap.get("A_Scorecard.Outcome_13").toString());
        	output.setAScorOutcome14(outputMap.get("A_Scorecard.Outcome_14").toString());
        	output.setAScorOutcome15(outputMap.get("A_Scorecard.Outcome_15").toString());
        	output.setAScorOutcome16(outputMap.get("A_Scorecard.Outcome_16").toString());
        	output.setAScorOutcome17(outputMap.get("A_Scorecard.Outcome_17").toString());
        	output.setAScorOutcome18(outputMap.get("A_Scorecard.Outcome_18").toString());
        	output.setAScorOutcome19(outputMap.get("A_Scorecard.Outcome_19").toString());
        	output.setAScorOutcome20(outputMap.get("A_Scorecard.Outcome_20").toString());
        	output.setAScorPdEstimate(new BigDecimal(outputMap.get("A_Scorecard.PD_Estimate").toString(), MathContext.DECIMAL64));
        	output.setAScorPdFactor(new BigDecimal(outputMap.get("A_Scorecard.PD_Factor").toString(), MathContext.DECIMAL64));
        	output.setAScorPdOffset(new BigDecimal(outputMap.get("A_Scorecard.PD_Offset").toString(), MathContext.DECIMAL64));
        	output.setAScorProductFamily(outputMap.get("A_Scorecard.Product_Family").toString());
        	output.setAScorRiskProfile(outputMap.get("A_Scorecard.Risk_Profile").toString());
        	output.setAScorRiskRating(outputMap.get("A_Scorecard.Risk_Rating").toString());
        	output.setAScorScore(new BigDecimal(outputMap.get("A_Scorecard.Score").toString(), MathContext.DECIMAL64));
        	output.setAScorScoreValue01(new BigDecimal(outputMap.get("A_Scorecard.Score_Value_01").toString(), MathContext.DECIMAL64));
        	output.setAScorScoreValue02(new BigDecimal(outputMap.get("A_Scorecard.Score_Value_02").toString(), MathContext.DECIMAL64));
        	output.setAScorScoreValue03(new BigDecimal(outputMap.get("A_Scorecard.Score_Value_03").toString(), MathContext.DECIMAL64));
        	output.setAScorScoreValue04(new BigDecimal(outputMap.get("A_Scorecard.Score_Value_04").toString(), MathContext.DECIMAL64));
        	output.setAScorScoreValue05(new BigDecimal(outputMap.get("A_Scorecard.Score_Value_05").toString(), MathContext.DECIMAL64));
        	output.setAScorScoreValue06(new BigDecimal(outputMap.get("A_Scorecard.Score_Value_06").toString(), MathContext.DECIMAL64));
        	output.setAScorScoreValue07(new BigDecimal(outputMap.get("A_Scorecard.Score_Value_07").toString(), MathContext.DECIMAL64));
        	output.setAScorScoreValue08(new BigDecimal(outputMap.get("A_Scorecard.Score_Value_08").toString(), MathContext.DECIMAL64));
        	output.setAScorScoreValue09(new BigDecimal(outputMap.get("A_Scorecard.Score_Value_09").toString(), MathContext.DECIMAL64));
        	output.setAScorScoreValue10(new BigDecimal(outputMap.get("A_Scorecard.Score_Value_10").toString(), MathContext.DECIMAL64));
        	output.setAScorScoreValue11(new BigDecimal(outputMap.get("A_Scorecard.Score_Value_11").toString(), MathContext.DECIMAL64));
        	output.setAScorScoreValue12(new BigDecimal(outputMap.get("A_Scorecard.Score_Value_12").toString(), MathContext.DECIMAL64));
        	output.setAScorScoreValue13(new BigDecimal(outputMap.get("A_Scorecard.Score_Value_13").toString(), MathContext.DECIMAL64));
        	output.setAScorScoreValue14(new BigDecimal(outputMap.get("A_Scorecard.Score_Value_14").toString(), MathContext.DECIMAL64));
        	output.setAScorScoreValue15(new BigDecimal(outputMap.get("A_Scorecard.Score_Value_15").toString(), MathContext.DECIMAL64));
        	output.setAScorScoreValue16(new BigDecimal(outputMap.get("A_Scorecard.Score_Value_16").toString(), MathContext.DECIMAL64));
        	output.setAScorScoreValue17(new BigDecimal(outputMap.get("A_Scorecard.Score_Value_17").toString(), MathContext.DECIMAL64));
        	output.setAScorScoreValue18(new BigDecimal(outputMap.get("A_Scorecard.Score_Value_18").toString(), MathContext.DECIMAL64));
        	output.setAScorScoreValue19(new BigDecimal(outputMap.get("A_Scorecard.Score_Value_19").toString(), MathContext.DECIMAL64));
        	output.setAScorScoreValue20(new BigDecimal(outputMap.get("A_Scorecard.Score_Value_20").toString(), MathContext.DECIMAL64));
        	output.setAScorScorecardId(outputMap.get("A_Scorecard.Scorecard_ID").toString());
        	output.setAScorScorecardName(outputMap.get("A_Scorecard.Scorecard_Name").toString());
        	output.setAScorSumScores(new BigDecimal(outputMap.get("A_Scorecard.Sum_Scores").toString(), MathContext.DECIMAL64));
        	output.setAScorValuea01(outputMap.get("A_Scorecard.ValueA_01").toString());
        	output.setAScorValuea02(outputMap.get("A_Scorecard.ValueA_02").toString());
        	output.setAScorValuea03(outputMap.get("A_Scorecard.ValueA_03").toString());
        	output.setAScorValuea04(outputMap.get("A_Scorecard.ValueA_04").toString());
        	output.setAScorValuea05(outputMap.get("A_Scorecard.ValueA_05").toString());
        	output.setAScorValuea06(outputMap.get("A_Scorecard.ValueA_06").toString());
        	output.setAScorValuea07(outputMap.get("A_Scorecard.ValueA_07").toString());
        	output.setAScorValuea08(outputMap.get("A_Scorecard.ValueA_08").toString());
        	output.setAScorValuea09(outputMap.get("A_Scorecard.ValueA_09").toString());
        	output.setAScorValuea10(outputMap.get("A_Scorecard.ValueA_10").toString());
        	output.setAScorValuea11(outputMap.get("A_Scorecard.ValueA_11").toString());
        	output.setAScorValuea12(outputMap.get("A_Scorecard.ValueA_12").toString());
        	output.setAScorValuea13(outputMap.get("A_Scorecard.ValueA_13").toString());
        	output.setAScorValuea14(outputMap.get("A_Scorecard.ValueA_14").toString());
        	output.setAScorValuea15(outputMap.get("A_Scorecard.ValueA_15").toString());
        	output.setAScorValuea16(outputMap.get("A_Scorecard.ValueA_16").toString());
        	output.setAScorValuea17(outputMap.get("A_Scorecard.ValueA_17").toString());
        	output.setAScorValuea18(outputMap.get("A_Scorecard.ValueA_18").toString());
        	output.setAScorValuea19(outputMap.get("A_Scorecard.ValueA_19").toString());
        	output.setAScorValuea20(outputMap.get("A_Scorecard.ValueA_20").toString());
        	output.setAScorValueb01(outputMap.get("A_Scorecard.ValueB_01").toString());
        	output.setAScorValueb02(outputMap.get("A_Scorecard.ValueB_02").toString());
        	output.setAScorValueb03(outputMap.get("A_Scorecard.ValueB_03").toString());
        	output.setAScorValueb04(outputMap.get("A_Scorecard.ValueB_04").toString());
        	output.setAScorValueb05(outputMap.get("A_Scorecard.ValueB_05").toString());
        	output.setAScorValueb06(outputMap.get("A_Scorecard.ValueB_06").toString());
        	output.setAScorValueb07(outputMap.get("A_Scorecard.ValueB_07").toString());
        	output.setAScorValueb08(outputMap.get("A_Scorecard.ValueB_08").toString());
        	output.setAScorValueb09(outputMap.get("A_Scorecard.ValueB_09").toString());
        	output.setAScorValueb10(outputMap.get("A_Scorecard.ValueB_10").toString());
        	output.setAScorValueb11(outputMap.get("A_Scorecard.ValueB_11").toString());
        	output.setAScorValueb12(outputMap.get("A_Scorecard.ValueB_12").toString());
        	output.setAScorValueb13(outputMap.get("A_Scorecard.ValueB_13").toString());
        	output.setAScorValueb14(outputMap.get("A_Scorecard.ValueB_14").toString());
        	output.setAScorValueb15(outputMap.get("A_Scorecard.ValueB_15").toString());
        	output.setAScorValueb16(outputMap.get("A_Scorecard.ValueB_16").toString());
        	output.setAScorValueb17(outputMap.get("A_Scorecard.ValueB_17").toString());
        	output.setAScorValueb18(outputMap.get("A_Scorecard.ValueB_18").toString());
        	output.setAScorValueb19(outputMap.get("A_Scorecard.ValueB_19").toString());
        	output.setAScorValueb20(outputMap.get("A_Scorecard.ValueB_20").toString());
        	output.setAScorVersionDate(outputMap.get("A_Scorecard.Version_Date").toString());
        	output.setAScorVersionNumber(outputMap.get("A_Scorecard.Version_Number").toString());
        	output.setCic(new BigDecimal(outputMap.get("Cic").toString(), MathContext.DECIMAL64));
        	output.setCompTreeLeafNodeId(outputMap.get("Component_Tree.Leaf_Node_ID").toString());
        	output.setCompTreeLeafNodeName(outputMap.get("Component_Tree.Leaf_Node_Name").toString());
        	output.setContractNumber(new BigDecimal(outputMap.get("Contract_Number").toString(), MathContext.DECIMAL64));
        	output.setScorAppendDbCode(outputMap.get("SCORING.Append_DB_Code").toString());
        	output.setScorApplicationId(outputMap.get("SCORING.Application_ID").toString());
        	output.setScorCode01(outputMap.get("SCORING.Code_01").toString());
        	output.setScorCode02(outputMap.get("SCORING.Code_02").toString());
        	output.setScorCode03(outputMap.get("SCORING.Code_03").toString());
        	output.setScorCode04(outputMap.get("SCORING.Code_04").toString());
        	output.setScorCode05(outputMap.get("SCORING.Code_05").toString());
        	output.setScorCode06(outputMap.get("SCORING.Code_06").toString());
        	output.setScorCode07(outputMap.get("SCORING.Code_07").toString());
        	output.setScorCode08(outputMap.get("SCORING.Code_08").toString());
        	output.setScorCode09(outputMap.get("SCORING.Code_09").toString());
        	output.setScorCode10(outputMap.get("SCORING.Code_10").toString());
        	output.setScorDbTableCode(outputMap.get("SCORING.DB_Table_Code").toString());
        	output.setScorDeploymentDate(outputMap.get("SCORING.Deployment_Date").toString());
        	output.setScorDeploymentNotes(outputMap.get("SCORING.Deployment_Notes").toString());
        	output.setScorDeploymentVersion(outputMap.get("SCORING.Deployment_Version").toString());
        	output.setScorExecutionDateTime(outputMap.get("SCORING.Execution_Date_Time").toString());
        	output.setScorNationalId(outputMap.get("SCORING.National_ID").toString());
        	output.setScorProgressNumber(new BigDecimal(outputMap.get("SCORING.Progress_Number").toString(), MathContext.DECIMAL64));
        	output.setScorScoringRequestType(outputMap.get("SCORING.Scoring_Request_Type").toString());
        	output.setScorScoringSource(outputMap.get("SCORING.Scoring_Source").toString());
        	output.setScorScoringStage(outputMap.get("SCORING.Scoring_Stage").toString());
        	output.setScorTransactionId(outputMap.get("SCORING.Transaction_ID").toString());
        	output.setScoringRunDate(outputMap.get("Scoring_Run_Date").toString());
        	output.setScoringSegment(outputMap.get("Scoring_Segment").toString());
        	output.setSpareSpare01(outputMap.get("SPARE.Spare_01").toString());
        	output.setSpareSpare02(outputMap.get("SPARE.Spare_02").toString());
        	output.setSpareSpare03(outputMap.get("SPARE.Spare_03").toString());
        	output.setSpareSpare04(outputMap.get("SPARE.Spare_04").toString());
        	output.setSpareSpare05(outputMap.get("SPARE.Spare_05").toString());
        	output.setSpareSpare06(outputMap.get("SPARE.Spare_06").toString());
        	output.setSpareSpare07(outputMap.get("SPARE.Spare_07").toString());
        	output.setSpareSpare08(outputMap.get("SPARE.Spare_08").toString());
        	output.setSpareSpare09(outputMap.get("SPARE.Spare_09").toString());
        	output.setSpareSpare10(outputMap.get("SPARE.Spare_10").toString());
        	output.setSpareSpare11(outputMap.get("SPARE.Spare_11").toString());
        	output.setSpareSpare12(outputMap.get("SPARE.Spare_12").toString());
        	output.setSpareSpare13(outputMap.get("SPARE.Spare_13").toString());
        	output.setSpareSpare14(outputMap.get("SPARE.Spare_14").toString());
        	output.setSpareSpare15(outputMap.get("SPARE.Spare_15").toString());
        	output.setSpareSpare16(outputMap.get("SPARE.Spare_16").toString());
        	output.setSpareSpare17(outputMap.get("SPARE.Spare_17").toString());
        	output.setSpareSpare18(outputMap.get("SPARE.Spare_18").toString());
        	output.setSpareSpare19(outputMap.get("SPARE.Spare_19").toString());
        	output.setSpareSpare20(outputMap.get("SPARE.Spare_20").toString());
        	output.setSpareSpare21(outputMap.get("SPARE.Spare_21").toString());
        	output.setSpareSpare22(outputMap.get("SPARE.Spare_22").toString());
        	output.setSpareSpare23(outputMap.get("SPARE.Spare_23").toString());
        	output.setSpareSpare24(outputMap.get("SPARE.Spare_24").toString());
        	output.setSpareSpare25(outputMap.get("SPARE.Spare_25").toString());
        	output.setSpareSpare26(outputMap.get("SPARE.Spare_26").toString());
        	output.setSpareSpare27(outputMap.get("SPARE.Spare_27").toString());
        	output.setSpareSpare28(outputMap.get("SPARE.Spare_28").toString());
        	output.setSpareSpare29(outputMap.get("SPARE.Spare_29").toString());
        	output.setSpareSpare30(outputMap.get("SPARE.Spare_30").toString());
        	output.setSpareSpare31(outputMap.get("SPARE.Spare_31").toString());
        	output.setSpareSpare32(outputMap.get("SPARE.Spare_32").toString());
        	output.setSpareSpare33(outputMap.get("SPARE.Spare_33").toString());
        	output.setSpareSpare34(outputMap.get("SPARE.Spare_34").toString());
        	output.setSpareSpare35(outputMap.get("SPARE.Spare_35").toString());
        	output.setSpareSpare36(outputMap.get("SPARE.Spare_36").toString());
        	output.setSpareSpare37(outputMap.get("SPARE.Spare_37").toString());
        	output.setSpareSpare38(outputMap.get("SPARE.Spare_38").toString());
        	output.setSpareSpare39(outputMap.get("SPARE.Spare_39").toString());
        	output.setSpareSpare40(outputMap.get("SPARE.Spare_40").toString());
        	output.setSpareSpare41(outputMap.get("SPARE.Spare_41").toString());
        	output.setSpareSpare42(outputMap.get("SPARE.Spare_42").toString());
        	output.setSpareSpare43(outputMap.get("SPARE.Spare_43").toString());
        	output.setSpareSpare44(outputMap.get("SPARE.Spare_44").toString());
        	output.setSpareSpare45(outputMap.get("SPARE.Spare_45").toString());
        	output.setSpareSpare46(outputMap.get("SPARE.Spare_46").toString());
        	output.setSpareSpare47(outputMap.get("SPARE.Spare_47").toString());
        	output.setSpareSpare48(outputMap.get("SPARE.Spare_48").toString());
        	output.setSpareSpare49(outputMap.get("SPARE.Spare_49").toString());
        	output.setSpareSpare50(outputMap.get("SPARE.Spare_50").toString());
        	output.setTestGrpRandomNumber(BigDecimal.valueOf(0));
        	output.setTestGrpTestGroupId(outputMap.get("Test_Group.Test_Group_ID").toString());
        	output.setTestGrpTestGroupName(outputMap.get("Test_Group.Test_Group_Name").toString());
        	output.setTestGrpTestGroupSetId(outputMap.get("Test_Group.Test_Group_Set_ID").toString());
        	output.setTestGrpTestGroupSetName(outputMap.get("Test_Group.Test_Group_Set_Name").toString());
        	output.setUniqueGeneratedId(outputMap.get("Unique_Generated_ID").toString());
        	output.setUniqueId(BigDecimal.valueOf(0));
        	
            } catch (Exception e) {
                log.error(e.getMessage(), e);
                logResult = this.getClass().getName() + ": " + "Error when building A_SCORE_RESPONSE output map, " + e.getMessage();

                if (logLevel.toUpperCase().equals("ERROR")) {
                	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                    saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "A-SCORE", logUser, "Error", BigDecimal.valueOf(0));
                }
            }        
        return output;
    }

    private BScoreResponse buildExpAdhBScoreOutput(Map < String, Object > outputMap, long requestId, BigDecimal runId) {
        BScoreResponse output = new BScoreResponse();      
    	SimpleDateFormat dateFormatter = new SimpleDateFormat("EEE MMM d HH:mm:ss z yyyy");
    	SimpleDateFormat timestampFormatter = new SimpleDateFormat("YYYYMMdd HH:mm:ss");
    	try {           
        	
        output.setRequestId(new BigDecimal(requestId, MathContext.DECIMAL64));
        output.setRunId(runId);
        output.setBScorElement01(outputMap.get("B_Scorecard.Element_01").toString());
        output.setBScorElement02(outputMap.get("B_Scorecard.Element_02").toString());
        output.setBScorElement03(outputMap.get("B_Scorecard.Element_03").toString());
        output.setBScorElement04(outputMap.get("B_Scorecard.Element_04").toString());
        output.setBScorElement05(outputMap.get("B_Scorecard.Element_05").toString());
        output.setBScorElement06(outputMap.get("B_Scorecard.Element_06").toString());
        output.setBScorElement07(outputMap.get("B_Scorecard.Element_07").toString());
        output.setBScorElement08(outputMap.get("B_Scorecard.Element_08").toString());
        output.setBScorElement09(outputMap.get("B_Scorecard.Element_09").toString());
        output.setBScorElement10(outputMap.get("B_Scorecard.Element_10").toString());
        output.setBScorElement11(outputMap.get("B_Scorecard.Element_11").toString());
        output.setBScorElement12(outputMap.get("B_Scorecard.Element_12").toString());
        output.setBScorElement13(outputMap.get("B_Scorecard.Element_13").toString());
        output.setBScorElement14(outputMap.get("B_Scorecard.Element_14").toString());
        output.setBScorElement15(outputMap.get("B_Scorecard.Element_15").toString());
        output.setBScorElement16(outputMap.get("B_Scorecard.Element_16").toString());
        output.setBScorElement17(outputMap.get("B_Scorecard.Element_17").toString());
        output.setBScorElement18(outputMap.get("B_Scorecard.Element_18").toString());
        output.setBScorElement19(outputMap.get("B_Scorecard.Element_19").toString());
        output.setBScorElement20(outputMap.get("B_Scorecard.Element_20").toString());
        output.setBScorField01(outputMap.get("B_Scorecard.Field_01").toString());
        output.setBScorField02(outputMap.get("B_Scorecard.Field_02").toString());
        output.setBScorField03(outputMap.get("B_Scorecard.Field_03").toString());
        output.setBScorField04(outputMap.get("B_Scorecard.Field_04").toString());
        output.setBScorField05(outputMap.get("B_Scorecard.Field_05").toString());
        output.setBScorField06(outputMap.get("B_Scorecard.Field_06").toString());
        output.setBScorField07(outputMap.get("B_Scorecard.Field_07").toString());
        output.setBScorField08(outputMap.get("B_Scorecard.Field_08").toString());
        output.setBScorField09(outputMap.get("B_Scorecard.Field_09").toString());
        output.setBScorField10(outputMap.get("B_Scorecard.Field_10").toString());
        output.setBScorField11(outputMap.get("B_Scorecard.Field_11").toString());
        output.setBScorField12(outputMap.get("B_Scorecard.Field_12").toString());
        output.setBScorField13(outputMap.get("B_Scorecard.Field_13").toString());
        output.setBScorField14(outputMap.get("B_Scorecard.Field_14").toString());
        output.setBScorField15(outputMap.get("B_Scorecard.Field_15").toString());
        output.setBScorField16(outputMap.get("B_Scorecard.Field_16").toString());
        output.setBScorField17(outputMap.get("B_Scorecard.Field_17").toString());
        output.setBScorField18(outputMap.get("B_Scorecard.Field_18").toString());
        output.setBScorField19(outputMap.get("B_Scorecard.Field_19").toString());
        output.setBScorField20(outputMap.get("B_Scorecard.Field_20").toString());
        output.setBScorFinalScorePoints(new BigDecimal(outputMap.get("B_Scorecard.Final_Score_Points").toString(), MathContext.DECIMAL64));
        output.setBScorInitialScorePoints(new BigDecimal(outputMap.get("B_Scorecard.Initial_Score_Points").toString(), MathContext.DECIMAL64));
        output.setBScorOutcome01(outputMap.get("B_Scorecard.Outcome_01").toString());
        output.setBScorOutcome02(outputMap.get("B_Scorecard.Outcome_02").toString());
        output.setBScorOutcome03(outputMap.get("B_Scorecard.Outcome_03").toString());
        output.setBScorOutcome04(outputMap.get("B_Scorecard.Outcome_04").toString());
        output.setBScorOutcome05(outputMap.get("B_Scorecard.Outcome_05").toString());
        output.setBScorOutcome06(outputMap.get("B_Scorecard.Outcome_06").toString());
        output.setBScorOutcome07(outputMap.get("B_Scorecard.Outcome_07").toString());
        output.setBScorOutcome08(outputMap.get("B_Scorecard.Outcome_08").toString());
        output.setBScorOutcome09(outputMap.get("B_Scorecard.Outcome_09").toString());
        output.setBScorOutcome10(outputMap.get("B_Scorecard.Outcome_10").toString());
        output.setBScorOutcome11(outputMap.get("B_Scorecard.Outcome_11").toString());
        output.setBScorOutcome12(outputMap.get("B_Scorecard.Outcome_12").toString());
        output.setBScorOutcome13(outputMap.get("B_Scorecard.Outcome_13").toString());
        output.setBScorOutcome14(outputMap.get("B_Scorecard.Outcome_14").toString());
        output.setBScorOutcome15(outputMap.get("B_Scorecard.Outcome_15").toString());
        output.setBScorOutcome16(outputMap.get("B_Scorecard.Outcome_16").toString());
        output.setBScorOutcome17(outputMap.get("B_Scorecard.Outcome_17").toString());
        output.setBScorOutcome18(outputMap.get("B_Scorecard.Outcome_18").toString());
        output.setBScorOutcome19(outputMap.get("B_Scorecard.Outcome_19").toString());
        output.setBScorOutcome20(outputMap.get("B_Scorecard.Outcome_20").toString());
        output.setBScorPdEstimate(new BigDecimal(outputMap.get("B_Scorecard.PD_Estimate").toString(), MathContext.DECIMAL64));
        output.setBScorPdFactor(new BigDecimal(outputMap.get("B_Scorecard.PD_Factor").toString(), MathContext.DECIMAL64));
        output.setBScorPdOffset(new BigDecimal(outputMap.get("B_Scorecard.PD_Offset").toString(), MathContext.DECIMAL64));
        output.setBScorProductFamily(outputMap.get("B_Scorecard.Product_Family").toString());
        output.setBScorRiskProfile(outputMap.get("B_Scorecard.Risk_Profile").toString());
        output.setBScorRiskRating(outputMap.get("B_Scorecard.Risk_Rating").toString());
        output.setBScorScoreValue01(new BigDecimal(outputMap.get("B_Scorecard.Score_Value_01").toString(), MathContext.DECIMAL64));
        output.setBScorScoreValue02(new BigDecimal(outputMap.get("B_Scorecard.Score_Value_02").toString(), MathContext.DECIMAL64));
        output.setBScorScoreValue03(new BigDecimal(outputMap.get("B_Scorecard.Score_Value_03").toString(), MathContext.DECIMAL64));
        output.setBScorScoreValue04(new BigDecimal(outputMap.get("B_Scorecard.Score_Value_04").toString(), MathContext.DECIMAL64));
        output.setBScorScoreValue05(new BigDecimal(outputMap.get("B_Scorecard.Score_Value_05").toString(), MathContext.DECIMAL64));
        output.setBScorScoreValue06(new BigDecimal(outputMap.get("B_Scorecard.Score_Value_06").toString(), MathContext.DECIMAL64));
        output.setBScorScoreValue07(new BigDecimal(outputMap.get("B_Scorecard.Score_Value_07").toString(), MathContext.DECIMAL64));
        output.setBScorScoreValue08(new BigDecimal(outputMap.get("B_Scorecard.Score_Value_08").toString(), MathContext.DECIMAL64));
        output.setBScorScoreValue09(new BigDecimal(outputMap.get("B_Scorecard.Score_Value_09").toString(), MathContext.DECIMAL64));
        output.setBScorScoreValue10(new BigDecimal(outputMap.get("B_Scorecard.Score_Value_10").toString(), MathContext.DECIMAL64));
        output.setBScorScoreValue11(new BigDecimal(outputMap.get("B_Scorecard.Score_Value_11").toString(), MathContext.DECIMAL64));
        output.setBScorScoreValue12(new BigDecimal(outputMap.get("B_Scorecard.Score_Value_12").toString(), MathContext.DECIMAL64));
        output.setBScorScoreValue13(new BigDecimal(outputMap.get("B_Scorecard.Score_Value_13").toString(), MathContext.DECIMAL64));
        output.setBScorScoreValue14(new BigDecimal(outputMap.get("B_Scorecard.Score_Value_14").toString(), MathContext.DECIMAL64));
        output.setBScorScoreValue15(new BigDecimal(outputMap.get("B_Scorecard.Score_Value_15").toString(), MathContext.DECIMAL64));
        output.setBScorScoreValue16(new BigDecimal(outputMap.get("B_Scorecard.Score_Value_16").toString(), MathContext.DECIMAL64));
        output.setBScorScoreValue17(new BigDecimal(outputMap.get("B_Scorecard.Score_Value_17").toString(), MathContext.DECIMAL64));
        output.setBScorScoreValue18(new BigDecimal(outputMap.get("B_Scorecard.Score_Value_18").toString(), MathContext.DECIMAL64));
        output.setBScorScoreValue19(new BigDecimal(outputMap.get("B_Scorecard.Score_Value_19").toString(), MathContext.DECIMAL64));
        output.setBScorScoreValue20(new BigDecimal(outputMap.get("B_Scorecard.Score_Value_20").toString(), MathContext.DECIMAL64));
        output.setBScorScorecardId(outputMap.get("B_Scorecard.Scorecard_ID").toString());
        output.setBScorScorecardName(outputMap.get("B_Scorecard.Scorecard_Name").toString());
        output.setBScorScoringSegment(outputMap.get("B_Scorecard.Scoring_Segment").toString());
        output.setBScorValuea01(outputMap.get("B_Scorecard.ValueA_01").toString());
        output.setBScorValuea02(outputMap.get("B_Scorecard.ValueA_02").toString());
        output.setBScorValuea03(outputMap.get("B_Scorecard.ValueA_03").toString());
        output.setBScorValuea04(outputMap.get("B_Scorecard.ValueA_04").toString());
        output.setBScorValuea05(outputMap.get("B_Scorecard.ValueA_05").toString());
        output.setBScorValuea06(outputMap.get("B_Scorecard.ValueA_06").toString());
        output.setBScorValuea07(outputMap.get("B_Scorecard.ValueA_07").toString());
        output.setBScorValuea08(outputMap.get("B_Scorecard.ValueA_08").toString());
        output.setBScorValuea09(outputMap.get("B_Scorecard.ValueA_09").toString());
        output.setBScorValuea10(outputMap.get("B_Scorecard.ValueA_10").toString());
        output.setBScorValuea11(outputMap.get("B_Scorecard.ValueA_11").toString());
        output.setBScorValuea12(outputMap.get("B_Scorecard.ValueA_12").toString());
        output.setBScorValuea13(outputMap.get("B_Scorecard.ValueA_13").toString());
        output.setBScorValuea14(outputMap.get("B_Scorecard.ValueA_14").toString());
        output.setBScorValuea15(outputMap.get("B_Scorecard.ValueA_15").toString());
        output.setBScorValuea16(outputMap.get("B_Scorecard.ValueA_16").toString());
        output.setBScorValuea17(outputMap.get("B_Scorecard.ValueA_17").toString());
        output.setBScorValuea18(outputMap.get("B_Scorecard.ValueA_18").toString());
        output.setBScorValuea19(outputMap.get("B_Scorecard.ValueA_19").toString());
        output.setBScorValuea20(outputMap.get("B_Scorecard.ValueA_20").toString());
        output.setBScorValueb01(outputMap.get("B_Scorecard.ValueB_01").toString());
        output.setBScorValueb02(outputMap.get("B_Scorecard.ValueB_02").toString());
        output.setBScorValueb03(outputMap.get("B_Scorecard.ValueB_03").toString());
        output.setBScorValueb04(outputMap.get("B_Scorecard.ValueB_04").toString());
        output.setBScorValueb05(outputMap.get("B_Scorecard.ValueB_05").toString());
        output.setBScorValueb06(outputMap.get("B_Scorecard.ValueB_06").toString());
        output.setBScorValueb07(outputMap.get("B_Scorecard.ValueB_07").toString());
        output.setBScorValueb08(outputMap.get("B_Scorecard.ValueB_08").toString());
        output.setBScorValueb09(outputMap.get("B_Scorecard.ValueB_09").toString());
        output.setBScorValueb10(outputMap.get("B_Scorecard.ValueB_10").toString());
        output.setBScorValueb11(outputMap.get("B_Scorecard.ValueB_11").toString());
        output.setBScorValueb12(outputMap.get("B_Scorecard.ValueB_12").toString());
        output.setBScorValueb13(outputMap.get("B_Scorecard.ValueB_13").toString());
        output.setBScorValueb14(outputMap.get("B_Scorecard.ValueB_14").toString());
        output.setBScorValueb15(outputMap.get("B_Scorecard.ValueB_15").toString());
        output.setBScorValueb16(outputMap.get("B_Scorecard.ValueB_16").toString());
        output.setBScorValueb17(outputMap.get("B_Scorecard.ValueB_17").toString());
        output.setBScorValueb18(outputMap.get("B_Scorecard.ValueB_18").toString());
        output.setBScorValueb19(outputMap.get("B_Scorecard.ValueB_19").toString());
        output.setBScorValueb20(outputMap.get("B_Scorecard.ValueB_20").toString());
        output.setBScorVersionDate(outputMap.get("B_Scorecard.Version_Date").toString());
        output.setBScorVersionNumber(outputMap.get("B_Scorecard.Version_Number").toString());
        output.setScorCic(new BigDecimal(outputMap.get("SCORING.Cic").toString(), MathContext.DECIMAL64));
        output.setScorCode01(outputMap.get("SCORING.Code_01").toString());
        output.setScorCode02(outputMap.get("SCORING.Code_02").toString());
        output.setScorCode03(outputMap.get("SCORING.Code_03").toString());
        output.setScorCode04(outputMap.get("SCORING.Code_04").toString());
        output.setScorCode05(outputMap.get("SCORING.Code_05").toString());
        output.setScorCode06(outputMap.get("SCORING.Code_06").toString());
        output.setScorCode07(outputMap.get("SCORING.Code_07").toString());
        output.setScorCode08(outputMap.get("SCORING.Code_08").toString());
        output.setScorCode09(outputMap.get("SCORING.Code_09").toString());
        output.setScorCode10(outputMap.get("SCORING.Code_10").toString());
        output.setScorCustomerSegment(outputMap.get("SCORING.Customer_Segment").toString());
        output.setScorDeploymentDate(outputMap.get("SCORING.Deployment_Date").toString());
        output.setScorDeploymentNotes(outputMap.get("SCORING.Deployment_Notes").toString());
        output.setScorDeploymentVersion(outputMap.get("SCORING.Deployment_Version").toString());
        output.setScorExecutionDateTime(timestampFormatter.format(new Date()).toString());
        output.setScorNationalId(outputMap.get("SCORING.National_ID").toString());
        output.setScorPortfolioDate(dateFormatter.parse(outputMap.get("SCORING.Portfolio_Date").toString()));
        output.setScorProductType(outputMap.get("SCORING.Product_Type").toString());
        output.setScorScoringRequestType(outputMap.get("SCORING.Scoring_Request_Type").toString());
        output.setScorScoringSource(outputMap.get("SCORING.Scoring_Source").toString());
        output.setScorTransactionId(outputMap.get("SCORING.Transaction_ID").toString());
        output.setSpareSpare01(outputMap.get("SPARE.Spare_01").toString());
        output.setSpareSpare02(outputMap.get("SPARE.Spare_02").toString());
        output.setSpareSpare03(outputMap.get("SPARE.Spare_03").toString());
        output.setSpareSpare04(outputMap.get("SPARE.Spare_04").toString());
        output.setSpareSpare05(outputMap.get("SPARE.Spare_05").toString());
        output.setSpareSpare06(outputMap.get("SPARE.Spare_06").toString());
        output.setSpareSpare07(outputMap.get("SPARE.Spare_07").toString());
        output.setSpareSpare08(outputMap.get("SPARE.Spare_08").toString());
        output.setSpareSpare09(outputMap.get("SPARE.Spare_09").toString());
        output.setSpareSpare10(outputMap.get("SPARE.Spare_10").toString());
        output.setSpareSpare11(outputMap.get("SPARE.Spare_11").toString());
        output.setSpareSpare12(outputMap.get("SPARE.Spare_12").toString());
        output.setSpareSpare13(outputMap.get("SPARE.Spare_13").toString());
        output.setSpareSpare14(outputMap.get("SPARE.Spare_14").toString());
        output.setSpareSpare15(outputMap.get("SPARE.Spare_15").toString());
        output.setSpareSpare16(outputMap.get("SPARE.Spare_16").toString());
        output.setSpareSpare17(outputMap.get("SPARE.Spare_17").toString());
        output.setSpareSpare18(outputMap.get("SPARE.Spare_18").toString());
        output.setSpareSpare19(outputMap.get("SPARE.Spare_19").toString());
        output.setSpareSpare20(outputMap.get("SPARE.Spare_20").toString());
        output.setSpareSpare21(outputMap.get("SPARE.Spare_21").toString());
        output.setSpareSpare22(outputMap.get("SPARE.Spare_22").toString());
        output.setSpareSpare23(outputMap.get("SPARE.Spare_23").toString());
        output.setSpareSpare24(outputMap.get("SPARE.Spare_24").toString());
        output.setSpareSpare25(outputMap.get("SPARE.Spare_25").toString());
        output.setSpareSpare26(outputMap.get("SPARE.Spare_26").toString());
        output.setSpareSpare27(outputMap.get("SPARE.Spare_27").toString());
        output.setSpareSpare28(outputMap.get("SPARE.Spare_28").toString());
        output.setSpareSpare29(outputMap.get("SPARE.Spare_29").toString());
        output.setSpareSpare30(outputMap.get("SPARE.Spare_30").toString());
        output.setSpareSpare31(outputMap.get("SPARE.Spare_31").toString());
        output.setSpareSpare32(outputMap.get("SPARE.Spare_32").toString());
        output.setSpareSpare33(outputMap.get("SPARE.Spare_33").toString());
        output.setSpareSpare34(outputMap.get("SPARE.Spare_34").toString());
        output.setSpareSpare35(outputMap.get("SPARE.Spare_35").toString());
        output.setSpareSpare36(outputMap.get("SPARE.Spare_36").toString());
        output.setSpareSpare37(outputMap.get("SPARE.Spare_37").toString());
        output.setSpareSpare38(outputMap.get("SPARE.Spare_38").toString());
        output.setSpareSpare39(outputMap.get("SPARE.Spare_39").toString());
        output.setSpareSpare40(outputMap.get("SPARE.Spare_40").toString());
        output.setSpareSpare41(outputMap.get("SPARE.Spare_41").toString());
        output.setSpareSpare42(outputMap.get("SPARE.Spare_42").toString());
        output.setSpareSpare43(outputMap.get("SPARE.Spare_43").toString());
        output.setSpareSpare44(outputMap.get("SPARE.Spare_44").toString());
        output.setSpareSpare45(outputMap.get("SPARE.Spare_45").toString());
        output.setSpareSpare46(outputMap.get("SPARE.Spare_46").toString());
        output.setSpareSpare47(outputMap.get("SPARE.Spare_47").toString());
        output.setSpareSpare48(outputMap.get("SPARE.Spare_48").toString());
        output.setSpareSpare49(outputMap.get("SPARE.Spare_49").toString());
        output.setSpareSpare50(outputMap.get("SPARE.Spare_50").toString());
        output.setTestGrpRandomNumber(Integer.parseInt(outputMap.get("Test_Group.Random_Number").toString()));
        output.setTestGrpTestGroupId(outputMap.get("Test_Group.Test_Group_ID").toString());
        output.setTestGrpTestGroupName(outputMap.get("Test_Group.Test_Group_Name").toString());
        output.setTestGrpTestGroupSetId(outputMap.get("Test_Group.Test_Group_Set_ID").toString());
        output.setTestGrpTestGroupSetName(outputMap.get("Test_Group.Test_Group_Set_Name").toString());
        
            } catch (Exception e) {
                log.error(e.getMessage(), e);
                logResult = this.getClass().getName() + ": " + "Error when building B_SCORE_RESPONSE output map, " + e.getMessage();

                if (logLevel.toUpperCase().equals("ERROR")) {
                	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                    saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "B-SCORE", logUser, "Error", BigDecimal.valueOf(0));
                }
            }
        return output;
    }
		
    ////////buildExpAdhlgdOutput/////////
    
    private BigDecimal checkNull(Object s) {
    	if(s !=null && s.toString() !=null && !s.toString().isEmpty())
    		return new BigDecimal(s.toString(), MathContext.DECIMAL64);
    	else
    		return new BigDecimal("0.0");
    }
    
    
    
    private LGDResponse buildExpAdhLgdOutput(Map < String, Object > outputMap, long requestId, BigDecimal runId) {
        LGDResponse output = new LGDResponse();
        SimpleDateFormat dateFormatter = new SimpleDateFormat("EEE MMM d HH:mm:ss z yyyy");
        try {
        	output.setRequestId(new BigDecimal(requestId, MathContext.DECIMAL64));
        	output.setRunId(runId);
        	output.setYear(checkNull(outputMap.get("Year")));
        	output.setMonth(checkNull(outputMap.get("Month")));
        	output.setProductType(outputMap.get("Producttype").toString());
        	output.setModelId(checkNull(outputMap.get("Model.Modelid")));
        	output.setModelName(outputMap.get("Model.Modelname").toString());
        	output.setCashRecoverySegment(checkNull(outputMap.get("Recovery.Cashrecoverysegment")));
        	output.setCureRate(checkNull(outputMap.get("Recovery.Curerate")));
        	output.setNoncuredLoss(checkNull(outputMap.get("Recovery.Noncuredloss")));
        	output.setCashRecovery(checkNull(outputMap.get("Recovery.Cashrecovery")));
        	output.setCombinedExpectedRecovery(checkNull(outputMap.get("Recovery.Combinedexpectedrecovery")));
        	output.setNoncuredLossStandardDeviation(checkNull(outputMap.get("Recovery.Noncuredlossstandarddeviation")));
        	output.setEadPcnt(checkNull(outputMap.get("Variables.Eadpcnt")));
        	output.setTermElapsedDef(checkNull(outputMap.get("Variables.Termelapseddef")));
        	output.setTermElapsedDefPcnt(checkNull(outputMap.get("Variables.Termelapseddefpcnt")));
        	output.setCurVal(checkNull(outputMap.get("Variables.Curval")));
        	output.setDefLtv(checkNull(outputMap.get("Variables.Defltv")));
        	output.setLgdBaseline(checkNull(outputMap.get("Lgd.Lgdbaseline")));
        	output.setImpliedLgd(checkNull(outputMap.get("Lgd.Impliedlgd")));
        	output.setLgdRec1(checkNull(outputMap.get("Lgd.Lgdrec1")));
        	output.setLgdRec2(checkNull(outputMap.get("Lgd.Lgdrec2")));
        	output.setLgdOpt1(checkNull(outputMap.get("Lgd.Lgdopt1")));
        	output.setLgdOpt2(checkNull(outputMap.get("Lgd.Lgdopt2")));
        	output.setUnicondicionalLgd(checkNull(outputMap.get("Lgd.Unconditionallgd")));
        	output.setDeploymentDate(outputMap.get("Model.Deploymentdate").toString());
        	output.setDeploymentVersion(outputMap.get("Model.Deploymentversion").toString());
        	output.setDeploymentNotes(outputMap.get("Model.Deploymentnotes").toString());
            output.setExecutionDateTime(dateFormatter.parse(outputMap.get("Executiondatetime").toString()));
        	output.setScorecardVersionNumber(outputMap.get("Model.Scorecardversionnumber").toString());
        	output.setScorecardVersionDate(outputMap.get("Model.Scorecardversiondate").toString());
        	output.setAScorecardProductFamily(outputMap.get("Productfamily").toString());
        	output.setCarAgeAtAuctionInYears(checkNull(outputMap.get("Carlease.Carageatauctioninyears")));
        	output.setCarFairValuationAtAuction(checkNull(outputMap.get("Carlease.Carfairvaluationatauction")));
        	output.setCarPostHaircutValuationAtAuction(checkNull(outputMap.get("Carlease.Carposthaircutvaluationatauction")));
        	output.setCarAgeAtDefault(checkNull(outputMap.get("Carlease.Carageatdefault")));
        	output.setEstDefVehicleInYear(checkNull(outputMap.get("Carlease.Estdefvehicleinyears")));
        	output.setDepriciationFactor(checkNull(outputMap.get("Carlease.Depriciationfactor")));
        	output.setProbOfAuction(checkNull(outputMap.get("Carlease.Probofauction")));
        	output.setHaircutStandardDeviation(checkNull(outputMap.get("Carlease.Haircutstandarddeviation")));
        	output.setCollateralValuationGrowth(checkNull(outputMap.get("Realestate.Collateralvaluationgrowth")));
        	output.setAvgTimeOnBookInMonths(checkNull(outputMap.get("Realestate.Avgtimeonbookinmonths")));
        	output.setAvgTimeToRecoveryInMonths(checkNull(outputMap.get("Realestate.Avgtimetorecoveryinmonths")));
        	output.setHairAdjusted(checkNull(outputMap.get("Realestate.Haircutadjusted")));
        	output.setProbOfReposession(checkNull(outputMap.get("Realestate.Probofreposession")));
        	output.setCollateralSaleCost(checkNull(outputMap.get("Realestate.Collateralsalecost")));
        	output.setDistressSale(checkNull(outputMap.get("Realestate.Distresssale")));
        	output.setMilitaryLevel(outputMap.get("Watani.Militarylevel").toString());
        	output.setRealestateAvgTimeToRepoInMonths(checkNull(outputMap.get("Realestate.Avgtimetorepoinmonths")));
        	output.setCarleaseAvgTimeToRepoInMonths(checkNull(outputMap.get("Carlease.Avgtimetorepoinmonths")));
        	output.setRealestateAvgTimeToAuctionOrSellPostRepoInMonths(checkNull(outputMap.get("Realestate.Avgtimetoauctionorsellpostrepoinmonths")));
        	output.setCarleaseAvgTimeToAuctionOrSellPostRepoInMonths(checkNull(outputMap.get("Carlease.Avgtimetoauctionorsellpostrepoinmonths")));
        	output.setCarleaseDiscountRate(checkNull(outputMap.get("Carlease.Discountrate")));
        	output.setRealestateDiscountRate(checkNull(outputMap.get("Realestate.Discountrate")));
        	output.setRealstatePostHaircutValuationAtAuction(checkNull(outputMap.get("Realestate.Realestateposthaircutvaluationatauction")));
            output.set_new(outputMap.get("Creditcard.New").toString());
            output.setCarLeaseHaircutPercentage(checkNull(outputMap.get("Carlease.HaircutPercentage")));
            output.setRealestateHaircutPercentage(checkNull(outputMap.get("Realestate.HaircutPercentage")));
        	output.setSpareSpare01(outputMap.get("Spare.Spare01").toString());
        	output.setSpareSpare02(outputMap.get("Spare.Spare02").toString());
        	output.setSpareSpare03(outputMap.get("Spare.Spare03").toString());
        	output.setSpareSpare04(outputMap.get("Spare.Spare04").toString());
        	output.setSpareSpare05(outputMap.get("Spare.Spare05").toString());
        	output.setSpareSpare06(outputMap.get("Spare.Spare06").toString());
        	output.setSpareSpare07(outputMap.get("Spare.Spare07").toString());
        	output.setSpareSpare08(outputMap.get("Spare.Spare08").toString());
        	output.setSpareSpare09(outputMap.get("Spare.Spare09").toString());
        	output.setSpareSpare10(outputMap.get("Spare.Spare10").toString());
        	output.setSpareSpare11(outputMap.get("Spare.Spare11").toString());
        	output.setSpareSpare12(outputMap.get("Spare.Spare12").toString());
        	output.setSpareSpare13(outputMap.get("Spare.Spare13").toString());
        	output.setSpareSpare14(outputMap.get("Spare.Spare14").toString());
        	output.setSpareSpare15(outputMap.get("Spare.Spare15").toString());
        	output.setSpareSpare16(outputMap.get("Spare.Spare16").toString());
        	output.setSpareSpare17(outputMap.get("Spare.Spare17").toString());
        	output.setSpareSpare18(outputMap.get("Spare.Spare18").toString());
        	output.setSpareSpare19(outputMap.get("Spare.Spare19").toString());
        	output.setSpareSpare20(outputMap.get("Spare.Spare20").toString());
        	output.setSpareSpare21(outputMap.get("Spare.Spare21").toString());
        	output.setSpareSpare22(outputMap.get("Spare.Spare22").toString());
        	output.setSpareSpare24(outputMap.get("Spare.Spare24").toString());
        	output.setSpareSpare25(outputMap.get("Spare.Spare25").toString());
        	output.setSpareSpare26(outputMap.get("Spare.Spare26").toString());
        	output.setSpareSpare27(outputMap.get("Spare.Spare27").toString());
        	output.setSpareSpare28(outputMap.get("Spare.Spare28").toString());
        	output.setSpareSpare29(outputMap.get("Spare.Spare29").toString());
        	output.setSpareSpare30(outputMap.get("Spare.Spare30").toString());
        	output.setSpareSpare31(outputMap.get("Spare.Spare31").toString());
        	output.setSpareSpare32(outputMap.get("Spare.Spare32").toString());
        	output.setSpareSpare33(outputMap.get("Spare.Spare33").toString());
        	output.setSpareSpare34(outputMap.get("Spare.Spare34").toString());
        	output.setSpareSpare35(outputMap.get("Spare.Spare35").toString());
        	output.setSpareSpare36(outputMap.get("Spare.Spare36").toString());
        	output.setSpareSpare37(outputMap.get("Spare.Spare37").toString());
        	output.setSpareSpare38(outputMap.get("Spare.Spare38").toString());
        	output.setSpareSpare39(outputMap.get("Spare.Spare39").toString());
        	output.setSpareSpare40(outputMap.get("Spare.Spare40").toString());
        	output.setSpareSpare41(outputMap.get("Spare.Spare41").toString());
        	output.setSpareSpare42(outputMap.get("Spare.Spare42").toString());
        	output.setSpareSpare43(outputMap.get("Spare.Spare43").toString());
        	output.setSpareSpare44(outputMap.get("Spare.Spare44").toString());
        	output.setSpareSpare45(outputMap.get("Spare.Spare45").toString());
        	output.setSpareSpare46(outputMap.get("Spare.Spare46").toString());
        	output.setSpareSpare47(outputMap.get("Spare.Spare47").toString());
        	output.setSpareSpare48(outputMap.get("Spare.Spare48").toString());
        	output.setSpareSpare49(outputMap.get("Spare.Spare49").toString());
        	output.setSpareSpare50(outputMap.get("Spare.Spare50").toString());
        } catch (Exception e) {
                log.error(e.getMessage(), e);
                logResult = this.getClass().getName() + ": " + "Error when building LGD_RESPONSE output map, " + e.getMessage();

                if (logLevel.toUpperCase().equals("ERROR")) {
                	parserUtils.writeIntoLogFile(loggingDirectory, logFileName, logResult);
                    saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "LGD-SCORE", logUser, "Error", BigDecimal.valueOf(0));
                }
            }        
        return output;
    }
	   ///////////////////////////////////////
    private int loadSTGData(String StoredProcedureName, EntityManager entitymanager) {
        int p_status;

        StoredProcedureQuery storedProcedure = entitymanager.createStoredProcedureQuery(StoredProcedureName);

        // set parameters
        storedProcedure.registerStoredProcedureParameter("P_STATUS", int.class, ParameterMode.OUT);

        // execute SP
        storedProcedure.execute();

        // get result
        p_status = (int) storedProcedure.getOutputParameterValue("P_STATUS");

        return p_status;
    }

    
}