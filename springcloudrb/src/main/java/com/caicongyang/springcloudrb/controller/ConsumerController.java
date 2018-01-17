package com.caicongyang.springcloudrb.controller;

import com.caicongyang.springcloudrb.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    HelloService helloService;

    @RequestMapping(value="/ribbon-consumer",method = RequestMethod.GET)
    public String helloConsumer() throws Exception{
        return helloService.helloService();
    }

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello() throws Exception{
        return helloService.hello();
    }
}
