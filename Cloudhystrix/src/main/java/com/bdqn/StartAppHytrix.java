package com.bdqn;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


@SpringCloudApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrixDashboard
public class StartAppHytrix {
    public static void main(String[] args) {
        SpringApplication.run(StartAppHytrix.class);
    }
}
