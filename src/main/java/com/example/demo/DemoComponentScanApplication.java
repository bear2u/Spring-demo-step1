package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.componentscan.ComponentDAO;

@SpringBootApplication
@ComponentScan("com.example.componentscan") //패키지가 달라지면 스캔하기 위해 설정
public class DemoComponentScanApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(DemoComponentScanApplication.class);

	public static void main(String[] args) {
		
//		BinarySearchImpl binaraySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		
		ApplicationContext applicationContext =SpringApplication.run(DemoComponentScanApplication.class, args);
		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);				
		
		LOGGER.info("{}", componentDAO);
		LOGGER.info("{}", componentDAO.getJdbcConnection());
		
	}
}

