package com.alrajhi.score.ScoreExtraction.config;

import javax.annotation.PostConstruct;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Order(Ordered.HIGHEST_PRECEDENCE)
@Import({
    DatabaseConfig.WithDB.class,
})
public class DatabaseConfig {

    @PostConstruct
    public void start() {
        log.info("--- DB Config Started ---");
    }


    @Configuration
    @EnableAutoConfiguration
    static class WithDB {
        @PostConstruct
        public void load() {
            log.info("---- WithDB-----");
        }
    }
}