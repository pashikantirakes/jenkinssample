package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@SpringBootApplication
public class JenkinsExampleApplication {

	@PostConstruct
	public void init() {
		log.info("App started");
	}
	public static void main(String[] args) {
		log.info("App execute...");
		SpringApplication.run(JenkinsExampleApplication.class, args);
	}

}
