package com.zsr.yygh.hosp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.zsr")
public class ServiceHospApplication {
    public static void main(String[] args) {

        SpringApplication.run(ServiceHospApplication.class, args);
    }
}
