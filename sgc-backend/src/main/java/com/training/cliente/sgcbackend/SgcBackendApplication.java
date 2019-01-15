package com.training.cliente.sgcbackend;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SgcBackendApplication {

	private static final Logger logger = LogManager.getLogger(SgcBackendApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SgcBackendApplication.class, args);
		logger.debug("This is debug message");
		logger.info("This is info message");
		logger.warn("This is warn message");
		logger.fatal("This is fatal message");
		logger.error("This is error message");
		System.out.println("Logic executed successfully....");
	}

}
