package com.jenkins.jenkins;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsApplication {

public  static 	Logger LOGGER= LoggerFactory.getLogger(JenkinsApplication.class);
		@PostConstruct
		public void innt(){
			LOGGER.info("Applciation Started");
		}

	public static void main(String[] args) {
			LOGGER.info("Application executed ...");
		SpringApplication.run(JenkinsApplication.class, args);
	}

}
