package com.test.lzApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LzApplication {

    public static void main(String[] args) {
        SpringApplication.run(LzApplication.class, args);
    }

}
