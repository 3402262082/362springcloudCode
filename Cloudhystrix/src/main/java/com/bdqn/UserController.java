package com.bdqn;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/getdata")
    @HystrixCommand(fallbackMethod = "helloFallback")
    public Object hello(){
        String url = "http://provider-user/user/Data";
        return restTemplate.getForObject(url, String.class);
    }


    public String helloFallback(){
        return "您请求的数据没拿到，我是hystrix返回的默认数据--helloxxxxx";
    }
}
