package com.caicongyang.springcloudfeign.service;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceFallback implements HelloService{
    @Override
    public String hello() {
        return "error";
    }

    @Override
    public String hello1(String name) {
        return "error";
    }
}
