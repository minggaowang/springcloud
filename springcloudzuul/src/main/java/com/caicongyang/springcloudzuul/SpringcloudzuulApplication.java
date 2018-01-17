package com.caicongyang.springcloudzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringCloudApplication
public class SpringcloudzuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudzuulApplication.class, args);
	}
}
