package com.tian.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.tian.springcloud.mapper")
public class SpringCloudProvider02Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProvider02Application.class, args);
    }
}
