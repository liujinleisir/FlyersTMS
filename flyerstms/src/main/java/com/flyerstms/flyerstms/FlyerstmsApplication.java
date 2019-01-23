package com.flyerstms.flyerstms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@MapperScan(value = "com.flyerstms.flyerstms.dao")
public class FlyerstmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(FlyerstmsApplication.class, args);
    }
}

