package com.example.demo.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.xml.XmlPersonDAO;

@Configuration
@ComponentScan("com.example.demo.basic")
public class DemoXMLApplication {

	private static Logger logger = LoggerFactory.getLogger(DemoXMLApplication.class);
	
	public static void main(String[] args) {			
		
		try(ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("applicationContext.xml")) {
			
			logger.info("Beans Loaded -> {}", 
					(Object)applicationContext.getBeanDefinitionNames());
//				
			XmlPersonDAO xmlPersonDAO = applicationContext.getBean(XmlPersonDAO.class);
			
			logger.info("{}, jdbc connection {}", xmlPersonDAO, xmlPersonDAO.getXmlJdbcConnection());				
		}
	}
}

