package com.caicongyang.springcloudrb.command;

import com.netflix.hystrix.HystrixCommand;
import org.springframework.web.client.RestTemplate;

public class HelloCommand extends HystrixCommand<String>{
    private RestTemplate restTemplate;

    public HelloCommand(Setter setter ,RestTemplate restTemplate) {
        super(setter);
        this.restTemplate = restTemplate;
    }

    @Override
    protected String run() throws Exception {
        return restTemplate.getForEntity("http://SPRINGCLOUDAPP/hello", String.class).getBody();
    }
}
