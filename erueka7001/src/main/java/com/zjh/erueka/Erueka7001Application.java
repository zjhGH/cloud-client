package com.zjh.erueka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Erueka7001Application {

    public static void main(String[] args) {
        SpringApplication.run(Erueka7001Application.class, args);
    }

}
