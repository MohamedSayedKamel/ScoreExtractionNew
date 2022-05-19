package com.alrajhi.score.ScoreExtraction;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ConcurrentTaskScheduler;

import com.alrajhi.score.ScoreExtraction.config.AppConfig;
import com.alrajhi.score.ScoreExtraction.config.DatabaseConfig;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Import({
    DatabaseConfig.class,
    AppConfig.class
})

@Configuration
@EnableScheduling
public class ScoreExtractionApplication {


    @Bean
    public TaskScheduler taskScheduler() {
        return new ConcurrentTaskScheduler();
    }

    public static void main(String[] args) {

        log.info("Classpath is : " + System.getProperty("java.class.path"));

        SpringApplication application = new SpringApplication(ScoreExtractionApplication.class);
        addInitHooks(application);
        application.run(args);

        log.info("Application should start here, active  ");
    }

    static void addInitHooks(SpringApplication application) {
        application.addListeners((ApplicationListener < ApplicationEnvironmentPreparedEvent > ) event -> {
            String version = event.getEnvironment().getProperty("java.runtime.version");
            log.info("Running with Java {}", version);
        });
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            log.debug("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName: beanNames) {
                log.debug(beanName);
            }
        };
    }

}