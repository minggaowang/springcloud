package com.caicongyang.springcloudfeign.controller;

import com.caicongyang.springcloudfeign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    HelloService helloService;

    @RequestMapping(value="/feign-consumer",method = RequestMethod.GET)
    public String helloConsumer(){
        return helloService.hello();
    }

    @RequestMapping(value="/feign-consumer1",method = RequestMethod.GET)
    public String helloConsumer1(){
        return helloService.hello1("wmg");
    }
}
