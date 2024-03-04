package com.zjh.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ConfigClient8010Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient8010Application.class, args);
    }

}
