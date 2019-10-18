package com.config.testconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootConfiguration
@EnableAutoConfiguration
public class TestConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestConfigApplication.class, args);
    }

}
