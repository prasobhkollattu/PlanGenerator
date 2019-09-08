package com.company.plangenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * Application entry point
 * 
 * @author PRASOBH KOLLATTU
 *
 */
@SpringBootApplication
@EnableCaching
public class PlanGeneratorApp {

	public static void main(String[] args) {
		SpringApplication.run(PlanGeneratorApp.class, args);
	}

}
