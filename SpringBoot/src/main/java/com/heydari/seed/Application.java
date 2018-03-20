package com.heydari.seed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@ComponentScan(basePackages="be.heydari.seed")
@Configuration
@EnableAutoConfiguration

public class Application {
	
	public static void main(String[] args) {
		
		SpringApplication application = new SpringApplication(Application.class);
		application.setAdditionalProfiles(System.getProperty("dev"));
		application.run(args);
		
	}
	
	
}


