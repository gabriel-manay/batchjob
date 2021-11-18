package com.accenture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;


@SpringBootApplication
public class BatchjobApplication {

	public static void main(String[] args) {
		SpringApplication.run(BatchjobApplication.class, args);
	}

}
