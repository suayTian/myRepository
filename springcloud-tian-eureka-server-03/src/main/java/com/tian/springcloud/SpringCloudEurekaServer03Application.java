package com.tian.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaServer03Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaServer03Application.class, args);
    }
}
