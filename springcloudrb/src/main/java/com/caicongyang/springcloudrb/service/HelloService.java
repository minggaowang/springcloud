package com.caicongyang.springcloudrb.service;

import com.caicongyang.springcloudrb.command.HelloCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class HelloService {
    private static final Logger logger = LoggerFactory.getLogger(HelloService.class);
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloFallback")
    public String helloService() {
        return restTemplate.getForEntity("http://SPRINGCLOUDAPP/hello", String.class).getBody();
    }

    @HystrixCommand(fallbackMethod = "helloFallback",commandKey = "helloKey")
    public String hello() {
        long start = System.currentTimeMillis();
        String result = restTemplate.getForEntity("http://SPRINGCLOUDAPP/hello", String.class).getBody();
        long end = System.currentTimeMillis();
        logger.info("Spend time: " + (end - start));
        return result;
    }

    public String helloCommand(){
        String hello = new HelloCommand(null,restTemplate).execute();
        return hello;
    }

    public String helloFallback() {
        return "error";
    }
}
