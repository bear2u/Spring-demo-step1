package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.cdi.SomeCDIBusiness;

@SpringBootApplication
public class DemoCDIApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(DemoCDIApplication.class);

	public static void main(String[] args) {
		
		ApplicationContext applicationContext =SpringApplication.run(DemoCDIApplication.class, args);
		SomeCDIBusiness someCDIBusiness = applicationContext.getBean(SomeCDIBusiness.class);				
		
		LOGGER.info("{} dao-{}", someCDIBusiness, someCDIBusiness.getSomeCDIDAO());
		
	}
}

