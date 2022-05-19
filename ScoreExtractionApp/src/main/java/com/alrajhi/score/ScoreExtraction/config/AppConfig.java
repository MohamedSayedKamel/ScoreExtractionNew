package com.alrajhi.score.ScoreExtraction.config;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
@Order(Ordered.LOWEST_PRECEDENCE)
@ComponentScan(basePackages = {
    "com.alrajhi.score.ScoreExtraction"
})
public class AppConfig {

    @PostConstruct
    public void runAppConfig() {
        log.info("---- App Config Started ---");
    }
}