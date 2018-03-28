package com.eamilingservice.emailapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.emailingservice")

public class EmailAPIApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailAPIApplication.class, args);
	}
}