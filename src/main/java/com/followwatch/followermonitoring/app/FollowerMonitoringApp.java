package com.followwatch.followermonitoring.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by thomas on 21/04/16.
 */
@SpringBootApplication
public class FollowerMonitoringApp {

    private static final Logger LOGGER = LoggerFactory.getLogger(FollowerMonitoringApp.class);

        public static void main(String... args) {
            LOGGER.debug("Starting FollowerMonitoringApp !");
            SpringApplication.run(FollowerMonitoringApp.class, args);
        }

}

