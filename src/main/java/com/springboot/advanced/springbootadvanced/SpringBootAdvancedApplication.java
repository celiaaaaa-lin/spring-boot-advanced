package com.springboot.advanced.springbootadvanced;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.springboot.advanced")
public class SpringBootAdvancedApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAdvancedApplication.class, args);
	}

}
