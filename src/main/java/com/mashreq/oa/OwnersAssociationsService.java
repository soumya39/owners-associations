package com.mashreq.oa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OwnersAssociationsService {
private static final Logger LOGGER=LoggerFactory.getLogger(OwnersAssociationsService.class);
	public static void main(String[] args) {
		SpringApplication.run(OwnersAssociationsService.class, args);
		LOGGER.info("OwnersAssociationsService-app is running...");
	}
}
