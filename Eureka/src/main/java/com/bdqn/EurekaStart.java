package com.bdqn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //标明是一个server
public class EurekaStart {
    public static void main(String[] args) {
        SpringApplication.run(EurekaStart.class);
    }
}
