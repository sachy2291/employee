package com.smarte.empservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class EmployeeManagementServiceApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementServiceApplication.class, args);
	}

	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {

		return builder.sources(EmployeeManagementServiceApplication.class);
	}

}
