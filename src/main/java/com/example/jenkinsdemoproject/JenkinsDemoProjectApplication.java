package com.example.jenkinsdemoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDemoProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(JenkinsDemoProjectApplication.class, args);
		System.out.println("Hello jenkins");
	}

}
