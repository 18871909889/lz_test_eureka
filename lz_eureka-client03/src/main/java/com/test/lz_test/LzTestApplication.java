package com.test.lz_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LzTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(LzTestApplication.class, args);
    }

}

