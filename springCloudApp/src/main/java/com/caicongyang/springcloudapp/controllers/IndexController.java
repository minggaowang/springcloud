package com.caicongyang.springcloudapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@RestController
public class IndexController {


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes sra = (ServletRequestAttributes) ra;
        HttpServletRequest request = sra.getRequest();
        String content = "hello, sping Cloud!" + request.getRequestURL().toString();
        return content;
    }

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    public String hello1(@RequestParam String name) {
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes sra = (ServletRequestAttributes) ra;
        HttpServletRequest request = sra.getRequest();
        String content = "hello1, " + name + "!" + request.getRequestURL().toString();
        return content;
    }
}
