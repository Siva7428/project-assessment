package com.boot.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class BootRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootRestApiApplication.class, args);
	}

}
