package com.alrajhi.score.ScoreExtraction.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.lang.SystemUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import com.alrajhi.score.ScoreExtraction.dto.ScoreInput;
import com.alrajhi.score.ScoreExtraction.repository.AppParamRepository;
import com.alrajhi.score.ScoreExtraction.service.ScoreParserService;
import com.opencsv.CSVWriter;
import com.univocity.parsers.csv.CsvParserSettings;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@EnableJpaRepositories("com.alrajhi.score.ScoreExtraction.repository")
@EntityScan("com.alrajhi.score.ScoreExtraction.entity")
@Service
public class GeneralUtils {
    private SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyyMMdd");

    @Autowired
    ScoreParserService scoreParserService;

    @Autowired
    AppParamRepository AppParamRepository;

    @Value("${app.logging.directory}")
    private String loggingDirectory;

    @Value("${app.logging.fileName}")
    private String logFileName;

    @Value("${log-file-size-limit.in.bytes}")
    private String log_file_limit;

    @Value("${app.sqlLoader.datafile}")
    private String Datafile;

    @Value("${app.logging.loglevel}")
    private String logLevel;

    @Value("${app.project.name}")
    private String logUser;

    private String logResult;

    public String getFieldType(Object o) {
        if (o == null) {
            return "Unable to identify the class name";
        }
        return o.getClass().getName();
    }

    public String getOperatingSystemSystemUtils() {
        String os = SystemUtils.OS_NAME;
        log.info("Using SystemUtils: " + os);
        return os;
    }

    public void writeCSVFile(List < String > input, String outputFolderPath, String fileName) {
        log.info("Start generate output file {}", fileName);
        FileWriter writer = null;
        StringBuilder stringBuilder = new StringBuilder();
        boolean nextLine = false;
        try {

            File file = new File(outputFolderPath + File.separator + fileName);

            if (file.exists()) {
                log.info("File Exist , I will appened on it");
                writer = new FileWriter(file, true); //if file exists append to file. Works fine.
            } else {
                log.info("File Not Exist , I will Create it");
                file.createNewFile();
                writer = new FileWriter(file);
                nextLine = true;
            }
            if (nextLine) {
                stringBuilder.append("\n");
            }
            for (Object o: input) {
                stringBuilder.append(o);
                stringBuilder.append(",");
            }

            writer.write(stringBuilder.toString());
            writer.flush();
            writer.close();

        } catch (IOException e) {
            log.error(e.getMessage(), e);
        }

        log.info("Finish generate CSV for file {} ", fileName);
    }

    public synchronized void writeDataLineByLine_aScore(String[] headers, String[] data, String scoringType, long requestId, String outputFolderPath, String fileName) {

        try {
            FileWriter outputfile = null;
            File file = new File(outputFolderPath + File.separator + fileName);

            CSVWriter writer = null;

            if (file.exists()) {
                log.info("File exists , It will be appended");
                logResult = this.getClass().getName() + ": " + fileName + " exists, appending on it";

                if (logLevel.toUpperCase().equals("INFO")) {
                	writeIntoLogFile(loggingDirectory, logFileName, logResult);
                    scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "A-SCORE", logUser, "Processing", BigDecimal.valueOf(0));
                }                
                outputfile = new FileWriter(file, true); //if file exists append to file. Works fine.
                writer = new CSVWriter(outputfile);

            } else {
                log.info("File does not exist , It will be created");
                logResult = this.getClass().getName() + ": " + fileName + " does not exist, It will be created";

                if (logLevel.toUpperCase().equals("INFO")) {
                	writeIntoLogFile(loggingDirectory, logFileName, logResult);
                    scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "A-SCORE", logUser, "Processing", BigDecimal.valueOf(0));
                }
                file.createNewFile();
                outputfile = new FileWriter(file);
                    writer = new CSVWriter(outputfile);
                    writer.writeNext(headers);
            }

            // create CSVWriter object filewriter object as parameter
            // adding header to csv
            // add data to csv
                writer.writeNext(data);
                log.info("Row with request_id {} is written successfully - {}", requestId, scoringType);  

            // closing writer connection
            writer.close();
        } catch (IOException e) {
            log.error(e.getMessage(), e);
            logResult = this.getClass().getName() + ": " + "Error in writing output file, " + e.getMessage();

            if (logLevel.toUpperCase().equals("ERROR")) {
            	writeIntoLogFile(loggingDirectory, logFileName, logResult);
                scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "A-SCORE", logUser, "Error", BigDecimal.valueOf(0));
            }
        }
    }

    public synchronized void writeDataLineByLine_bScore(String[] headers, String[] data, String scoringType, long requestId, String outputFolderPath, String fileName) {

        try {
            FileWriter outputfile = null;
            File file = new File(outputFolderPath + File.separator + fileName);

            CSVWriter writer = null;

            if (file.exists()) {
                log.info("File exists , It will be appended");
                logResult = this.getClass().getName() + ": " + fileName + " exists, appending on it";

                if (logLevel.toUpperCase().equals("INFO")) {
                	writeIntoLogFile(loggingDirectory, logFileName, logResult);
                    scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "B-SCORE", logUser, "Processing", BigDecimal.valueOf(0));
                }                
                outputfile = new FileWriter(file, true); //if file exists append to file. Works fine.
                writer = new CSVWriter(outputfile);

            } else {
                log.info("File does not exist , It will be created");
                logResult = this.getClass().getName() + ": " + fileName + " does not exist, It will be created";

                if (logLevel.toUpperCase().equals("INFO")) {
                	writeIntoLogFile(loggingDirectory, logFileName, logResult);
                    scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "B-SCORE", logUser, "Processing", BigDecimal.valueOf(0));
                }
                file.createNewFile();
                outputfile = new FileWriter(file);
                    writer = new CSVWriter(outputfile);
                    writer.writeNext(headers);
            }

            // create CSVWriter object filewriter object as parameter
            // adding header to csv
            // add data to csv
                writer.writeNext(data);
                log.info("Row with request_id {} is written successfully - {}", requestId, scoringType);  

            // closing writer connection
            writer.close();
        } catch (IOException e) {
            log.error(e.getMessage(), e);
            logResult = this.getClass().getName() + ": " + "Error in writing output file, " + e.getMessage();

            if (logLevel.toUpperCase().equals("ERROR")) {
            	writeIntoLogFile(loggingDirectory, logFileName, logResult);
                scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "B-SCORE", logUser, "Error", BigDecimal.valueOf(0));
            }
        }
    }

    
    
    
    /////////////////new writeDataLineByLine_lgd/////////////
    public synchronized void writeDataLineByLine_lgd(String[] headers, String[] data, String scoringType, long requestId, String outputFolderPath, String fileName) {

        try {
            FileWriter outputfile = null;
            File file = new File(outputFolderPath + File.separator + fileName);

            CSVWriter writer = null;

            if (file.exists()) {
                log.info("File exists , It will be appended");
                logResult = this.getClass().getName() + ": " + fileName + " exists, appending on it";

                if (logLevel.toUpperCase().equals("INFO")) {
                	writeIntoLogFile(loggingDirectory, logFileName, logResult);
                    scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "LGD-SCORE", logUser, "Processing", BigDecimal.valueOf(0));
                }                
                outputfile = new FileWriter(file, true); //if file exists append to file. Works fine.
                writer = new CSVWriter(outputfile);

            } else {
                log.info("File does not exist , It will be created");
                logResult = this.getClass().getName() + ": " + fileName + " does not exist, It will be created";

                if (logLevel.toUpperCase().equals("INFO")) {
                	writeIntoLogFile(loggingDirectory, logFileName, logResult);
                    scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "LGD-SCORE", logUser, "Processing", BigDecimal.valueOf(0));
                }
                file.createNewFile();
                outputfile = new FileWriter(file);
                    writer = new CSVWriter(outputfile);
                    writer.writeNext(headers);
            }

            // create CSVWriter object filewriter object as parameter
            // adding header to csv
            // add data to csv
                writer.writeNext(data);
                log.info("Row with request_id {} is written successfully - {}", requestId, scoringType);  

            // closing writer connection
            writer.close();
        } catch (IOException e) {
            log.error(e.getMessage(), e);
            logResult = this.getClass().getName() + ": " + "Error in writing output file, " + e.getMessage();

            if (logLevel.toUpperCase().equals("ERROR")) {
            	writeIntoLogFile(loggingDirectory, logFileName, logResult);
                scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "LGD-SCORE", logUser, "Error", BigDecimal.valueOf(0));
            }
        }
    }

    ///////////////////////////////////////////////////////////
    public Reader getReader(String relativePath) {
        try {
            FileInputStream excelFile = new FileInputStream(new File(relativePath));

            return new InputStreamReader(excelFile, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException("Unable to read input", e);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    public Reader getReader(File inputFile) {
        try {
            FileInputStream excelFile = new FileInputStream(inputFile);

            return new InputStreamReader(excelFile, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException("Unable to read input", e);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void printRows(List < String[] > rows, boolean expand) {
        log.info("Rows : " + rows.size());
        log.info("------------------------- Rows --------------------");

        int rowCount = 0;
        for (String[] row: rows) {
            System.out.println("Row " + ++rowCount + " (length " + row.length + "): ");
            if (expand) {
                int valueCount = 0;
                for (String value: row) {
                    System.out.println("\tvalue " + ++valueCount + ": " + value);
                }
            }
        }
    }

    public CsvParserSettings getParserSettings() {
        CsvParserSettings settings = new CsvParserSettings();

        //turning off features enabled by default
        settings.getFormat().setLineSeparator("\n");
        //settings.setIgnoreLeadingWhitespaces(false);
        //settings.setIgnoreTrailingWhitespaces(false);
        //settings.setSkipEmptyLines(false);
        settings.setColumnReorderingEnabled(false);
        settings.setHeaderExtractionEnabled(true);
        settings.setNullValue("0");

        return settings;
    }

    public void printHeaders(String[] headers) {

        log.info("Columns size : {} ", headers.length);

        int colIndex = 0;
        for (String header: headers) {
            log.info("#" + colIndex + " - " + header);
            colIndex++;
        }
    }

    public ScoreInput prepareHeaderList(String[] headers) {
        log.info("Start prepare header list , size {} ", headers.length);
        ScoreInput result = new ScoreInput();

        try {
            if (headers != null && headers.length > 0) {
                String[] columnName = null;
                result.setArms(new ArrayList < > ());
                result.setContract(new ArrayList < > ());
                result.setSimah(new ArrayList < > ());
                result.setScoring(new ArrayList < > ());
                result.setResplend(new ArrayList < > ());
                result.setCard(new ArrayList < > ());
                result.setCasa(new ArrayList < > ());
                result.setSpare(new ArrayList < > ());
                result.setCreditcard(new ArrayList< > ());
                result.setRealestate(new ArrayList< > ());
                result.setWatani(new ArrayList< > ());
                result.setCarlease(new ArrayList< > ());

                for (int i = 0; i < headers.length; i++) {
                     log.info("-> Header {} , After Split {} ", headers[i], Arrays.toString(headers[i].split("\\.")));

                    columnName = headers[i].split("\\.");
                    if (columnName != null && columnName.length == 2 ) {
                    	System.out.println("columnName == "+columnName);
                        switch (columnName[1]) {
                            case "CONTRACT":
                                result.getContract().add(columnName[2]);
                                break;
                            case "ARMS":
                                result.getArms().add(columnName[2]);
                                break;
                            case "SPARE":
                                result.getSpare().add(columnName[2]);
                                break;
                            case "SIMAH":
                                result.getSimah().add(columnName[2]);
                                break;
                            case "RESPLEND":
                                result.getResplend().add(columnName[2]);
                                break;
                            case "SCORING":
                                result.getScoring().add(columnName[2]);
                                break;
                            case "CARD":
                                result.getCard().add(columnName[2]);
                                break;
                            case "CASA":
                                result.getCasa().add(columnName[2]);
                                break;
                            case "Watani":
                            	result.getWatani().add(columnName[2]);
                            	break;
                            case "Carlease":
                            	result.getCarlease().add(columnName[2]);
                            	break;
                            case "Realestate":
                            	result.getRealestate().add(columnName[2]);
                            	break;
                            case "Creditcard":
                            	result.getCreditcard().add(columnName[2]);
                            	break;
                            default:
                                break;
                        }
                    }
//                    else {
//                        log.error("Column Names Array is not correct");
//                        logResult = this.getClass().getName() + ": " + "Error in the column names array, check log file";
//
//                        if (logLevel.toUpperCase().equals("ERROR")) {
//                        	writeIntoLogFile(loggingDirectory, logFileName, logResult);
//                            scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "APPLICATION", logUser, "Error", BigDecimal.valueOf(0));
//                        }
//                    }
                }
            }
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            logResult =  "Error in preparing header list, " + e.getMessage();

            if (logLevel.toUpperCase().equals("ERROR")) {
            	writeIntoLogFile(loggingDirectory, logFileName, logResult);
                scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "APPLICATION", logUser, "Error", BigDecimal.valueOf(0));
            }
        }

        log.debug("Contract" + result.getContract().toString());
        log.debug("Arms" + result.getArms().toString());
        log.debug("Card" + result.getCard().toString());
        log.debug("Casa" + result.getCasa().toString());
        log.debug("Scoring" + result.getScoring().toString());
        log.debug("Resplend" + result.getResplend().toString());
        log.debug("Simah" + result.getSimah().toString());
        log.debug("Spare" + result.getSpare().toString());
        log.debug("Watani" +result.getWatani().toString());
        log.debug("Creditcard" + result.getCreditcard().toString());
        log.debug("Realestate" + result.getRealestate().toString());
        log.debug("Carlease" + result.getCarlease().toString());
        return result;
    }

    public Set < String > getOutputColumns_ascore() {
        Resource resource = new ClassPathResource(Constants.OUTPUT_COLUMNS_PROPS_ASCORE);
        try {
            Properties props = PropertiesLoaderUtils.loadProperties(resource);

            return props.stringPropertyNames();

        } catch (IOException e) {
            log.error(e.getMessage(), e);
            logResult = this.getClass().getName() + ": " + "Error in getting output column names, " + e.getMessage();

            if (logLevel.toUpperCase().equals("ERROR")) {
            	writeIntoLogFile(loggingDirectory, logFileName, logResult);
                scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "A-SCORE", logUser, "Error", BigDecimal.valueOf(0));
            }
        }
        return null;
    }

    public Set < String > getOutputColumns_bscore() {
        Resource resource = new ClassPathResource(Constants.OUTPUT_COLUMNS_PROPS_BSCORE);
        try {
            Properties props = PropertiesLoaderUtils.loadProperties(resource);

            return props.stringPropertyNames();

        } catch (IOException e) {
            log.error(e.getMessage(), e);
            logResult = this.getClass().getName() + ": " + "Error in getting output column names, " + e.getMessage();

            if (logLevel.toUpperCase().equals("ERROR")) {
            	writeIntoLogFile(loggingDirectory, logFileName, logResult);
                scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "B-SCORE", logUser, "Error", BigDecimal.valueOf(0));
            }
        }
        return null;
    }
    ///////////// new getOutputColumns_lgd //////////////////
    public Set < String > getOutputColumns_lgd() {
        Resource resource = new ClassPathResource(Constants.OUTPUT_COLUMNS_PROPS_LGD);
        try {
            Properties props = PropertiesLoaderUtils.loadProperties(resource);

            return props.stringPropertyNames();

        } catch (IOException e) {
            log.error(e.getMessage(), e);
            logResult = this.getClass().getName() + ": " + "Error in getting output column names, " + e.getMessage();

            if (logLevel.toUpperCase().equals("ERROR")) {
            	writeIntoLogFile(loggingDirectory, logFileName, logResult);
                scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "LGD-SCORE", logUser, "Error", BigDecimal.valueOf(0));
            }
        }
        return null;
    }
    public Properties getOutputColumnsProperties_ascore() {
        Resource resource = new ClassPathResource(Constants.OUTPUT_COLUMNS_PROPS_ASCORE);
        try {
            Properties props = PropertiesLoaderUtils.loadProperties(resource);

            return props;

        } catch (IOException e) {
            log.error(e.getMessage(), e);
            logResult = this.getClass().getName() + ": " + "Error in getting output column properties, " + e.getMessage();

            if (logLevel.toUpperCase().equals("ERROR")) {
            	writeIntoLogFile(loggingDirectory, logFileName, logResult);
                scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "A-SCORE", logUser, "Error", BigDecimal.valueOf(0));
            }
        }
        return null;
    }

    public Properties getOutputColumnsProperties_bscore() {
        Resource resource = new ClassPathResource(Constants.OUTPUT_COLUMNS_PROPS_BSCORE);
        try {
            Properties props = PropertiesLoaderUtils.loadProperties(resource);

            return props;

        } catch (IOException e) {
            log.error(e.getMessage(), e);
            logResult = this.getClass().getName() + ": " + "Error in getting output column properties, " + e.getMessage();

            if (logLevel.toUpperCase().equals("ERROR")) {
            	writeIntoLogFile(loggingDirectory, logFileName, logResult);
                scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "B-SCORE", logUser, "Error", BigDecimal.valueOf(0));
            }
        }
        return null;
    }

    public Properties getOutputColumnsProperties_lgd() {
        Resource resource = new ClassPathResource(Constants.OUTPUT_COLUMNS_PROPS_LGD);
        try {
            Properties props = PropertiesLoaderUtils.loadProperties(resource);

            return props;

        } catch (IOException e) {
            log.error(e.getMessage(), e);
            logResult = this.getClass().getName() + ": " + "Error in getting output column properties, " + e.getMessage();

            if (logLevel.toUpperCase().equals("ERROR")) {
            	writeIntoLogFile(loggingDirectory, logFileName, logResult);
                scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "LGD-SCORE", logUser, "Error", BigDecimal.valueOf(0));
            }
        }
        return null;
    }
    
    
    public void movFilestoProcessing(File inputFiles, String inputDirectory, String processingDirectory) {

        Path from, to;
        from = Paths.get(inputDirectory, File.separator + inputFiles.getName());
        to = Paths.get(processingDirectory, File.separator + Datafile);
        try {
            Files.move(from, to, StandardCopyOption.REPLACE_EXISTING);
            log.info(" Moved the file {} to processing folder...", inputFiles.getName());
        } catch (IOException e) {
            log.error(e.getMessage(), e);
        } finally {
            log.info("Finish moving file in input folder to processing folder...");
        }
    }

    public Properties getInputColumnsProperties_ascore() {
        Resource resource = new ClassPathResource(Constants.INPUT_COLUMNS_PROPS_ASCORE);
        try {
            Properties props = PropertiesLoaderUtils.loadProperties(resource);

            return props;

        } catch (IOException e) {
            log.error(e.getMessage(), e);
            logResult = this.getClass().getName() + ": " + "Error in getting input column properties, " + e.getMessage();

            if (logLevel.toUpperCase().equals("ERROR")) {
            	writeIntoLogFile(loggingDirectory, logFileName, logResult);
                scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "A-SCORE", logUser, "Error", BigDecimal.valueOf(0));
            }
        }
        return null;
    }

    public Properties getInputColumnsProperties_bscore() {
        Resource resource = new ClassPathResource(Constants.INPUT_COLUMNS_PROPS_BSCORE);
        try {

            Properties props = PropertiesLoaderUtils.loadProperties(resource);

            return props;

        } catch (IOException e) {
            log.error(e.getMessage(), e);
            logResult = this.getClass().getName() + ": " + "Error in getting input column properties, " + e.getMessage();

            if (logLevel.toUpperCase().equals("ERROR")) {
            	writeIntoLogFile(loggingDirectory, logFileName, logResult);
                scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "B-SCORE", logUser, "Error", BigDecimal.valueOf(0));
            }
        }
        return null;
    }
    
    public Properties getInputColumnsProperties_lgd() {
        Resource resource = new ClassPathResource(Constants.INPUT_COLUMNS_PROPS_LGD);
        try {

            Properties props = PropertiesLoaderUtils.loadProperties(resource);

            return props;

        } catch (IOException e) {
            log.error(e.getMessage(), e);
            logResult = this.getClass().getName() + ": " + "Error in getting input column properties, " + e.getMessage();

            if (logLevel.toUpperCase().equals("ERROR")) {
            	writeIntoLogFile(loggingDirectory, logFileName, logResult);
                scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "LGD", logUser, "Error", BigDecimal.valueOf(0));
            }
        }
        return null;
    }


    public void writeIntoLogFile(String logFolderPath, String logFileName, String logResult) {
        try {
            BufferedWriter outputLogFile = null;
            String dateString = dateFormatter.format(new Date());

            //Check if log folder for current day exists  
            Path currentDayLogPath = Paths.get(logFolderPath + File.separator + dateString);
            if (Files.notExists(currentDayLogPath)) {
                File currentDayLogFolder = new File(logFolderPath + File.separator + dateString);
                currentDayLogFolder.mkdir();

            }

            File lastModifiedLogfile = getLastModifiedlogFile(logFolderPath + File.separator + dateString, logFileName, dateString);
            File defaultLogfile = new File(logFolderPath + File.separator + dateString + File.separator + dateString + "_" + logFileName + "_1.txt");

            if (lastModifiedLogfile.exists()) {
                if (lastModifiedLogfile.length() <= Long.parseLong(log_file_limit)) {
                    log.info("Log file exists , I will append on it");
                    outputLogFile = new BufferedWriter(new FileWriter(lastModifiedLogfile, true));
                    outputLogFile.write(logResult);
                    outputLogFile.newLine();
                } else {
                    log.info("Log file limit exceeded, creating new part of the log file");
                    String lastModifiedLogfileVersion = "_" + (Integer.parseInt(lastModifiedLogfile.getName().substring(lastModifiedLogfile.getName().lastIndexOf("_") + 1, lastModifiedLogfile.getName().lastIndexOf("."))) + 1);
                    log.info("Log file limit exceeded, creating new part of the log file with version {}", lastModifiedLogfileVersion);
                    File newlogfile = new File(logFolderPath + File.separator + dateString + File.separator + dateString + "_" + logFileName + lastModifiedLogfileVersion + ".txt");
                    newlogfile.createNewFile();
                    outputLogFile = new BufferedWriter(new FileWriter(newlogfile));
                    outputLogFile.write(logResult);
                    outputLogFile.newLine();
                }
            } else {
                log.info("Log file does not exist , I will Create it");
                defaultLogfile.createNewFile();
                outputLogFile = new BufferedWriter(new FileWriter(defaultLogfile));
                outputLogFile.write(logResult);
                outputLogFile.newLine();
            }

            outputLogFile.close();
        } catch (IOException e) {
            log.error(e.getMessage(), e);
            if (logLevel.toUpperCase().equals("ERROR")) {
                logResult = this.getClass().getName() + ": " + "Error in writing into log file, " + e.getMessage();
                scoreParserService.saveLogOutputToDB(java.util.Calendar.getInstance().getTime(), logLevel, logResult, "APPLICATION", logUser, "Error", BigDecimal.valueOf(0));
            }
        }
    }

    public static File getLastModifiedlogFile(String logFolderPath, String logFileName, String dateString) {
        File directory = new File(logFolderPath);
        File[] files = directory.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(".txt");
            }
        });

        long lastModifiedTime = Long.MIN_VALUE;
        File chosenFile = new File(logFolderPath + File.separator + dateString + "_" + logFileName + "_1.txt");

        if (files != null) {
            for (File file: files) {
                if (file.lastModified() > lastModifiedTime) {
                    chosenFile = file;
                    lastModifiedTime = file.lastModified();
                }
            }
        }
        return chosenFile;
    }

    public void copyFile(String from, String to) throws IOException {
        Path src;
        if (new File(from).exists()) {
            src = Paths.get(from);
        } else {
            return;
        }
        if (new File(to).exists()) {
            new File(to).delete();
        }

        Path dest = Paths.get(to);

        Files.copy(src, dest);
    }

    public void movFile(String from, String to) throws IOException {
        Path src;
        if (new File(from).exists()) {
            src = Paths.get(from);
        } else {
            return;
        }
        if (new File(to).exists()) {
            new File(to).delete();
        }

        Path dest = Paths.get(to);

        Files.move(src, dest);
    }

    public boolean findFile(String name, File file) {
        boolean found = false;
        File[] list = file.listFiles();
        if (list != null)
            for (File fil: list) {
                if (name.equalsIgnoreCase(fil.getName())) {
                    found = true;
                    break;
                }
            }
        return found;
    }

    public Long convertToLong(Object obj) {
    	Long convertedLong;
    	try {
        String stringToConvert = String.valueOf(obj);
        convertedLong = Long.parseLong(stringToConvert);
        }
       catch(Exception ex) 
        {
           return (long) 0; 
        }
        return convertedLong;
    }
}