package com.test.lzeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LzEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LzEurekaApplication.class, args);
    }

}
