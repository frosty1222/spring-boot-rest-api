package com.thinkconstructiverestdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@ComponentScan(basePackages = "com.thinkconstructiverestdemo")
@EnableJpaAuditing 
public class RestDemosApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestDemosApplication.class, args);
	}

}
