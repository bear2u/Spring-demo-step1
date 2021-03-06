package com.example.demo.basic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.example.demo.properties.SomeExternalService;

@Configuration
@ComponentScan("com.example.demo.properties")
@PropertySource("classpath:app.properties")
public class DemoPropertiesApplication {

	public static void main(String[] args) {
		
//		BinarySearchImpl binaraySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		
		try(AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(DemoPropertiesApplication.class)) {
//				SpringApplication.run(DemoApplication.class, args);
			SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);			
			System.out.println(someExternalService.returnServiceURL());						
		}
	}
}

