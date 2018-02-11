package com.ogasimov.labs.springcloud.microservices.eureka2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Eureka2App {
    public static void main(String[] args) {
        SpringApplication.run(Eureka2App.class, args);
    }
}
