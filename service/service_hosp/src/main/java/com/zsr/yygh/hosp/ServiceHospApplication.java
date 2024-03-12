package com.zsr.yygh.hosp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.zsr")
@ComponentScan(basePackages = "com.zsr")
public class ServiceHospApplication {
    public static void main(String[] args) {

        SpringApplication.run(ServiceHospApplication.class, args);
    }
}
