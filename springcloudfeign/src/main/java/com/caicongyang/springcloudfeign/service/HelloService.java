package com.caicongyang.springcloudfeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "springCloudApp",fallback = HelloServiceFallback.class)
public interface HelloService {
    @RequestMapping("/hello")
    String hello();

    @RequestMapping("hello1")
    String hello1(@RequestParam("name") String name);
}
