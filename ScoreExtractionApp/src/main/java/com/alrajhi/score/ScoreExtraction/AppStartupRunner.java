package com.alrajhi.score.ScoreExtraction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.alrajhi.score.ScoreExtraction.service.ScoreParserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class AppStartupRunner implements ApplicationRunner {
    @Autowired
    ScoreParserService scoreParserService;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("Your application started with option names : {}", args.getOptionNames());
        scoreParserService.startExecution();
    }
}