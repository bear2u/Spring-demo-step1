package com.example.demo.basic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.demo.basic")
public class DemoApplication {

	public static void main(String[] args) {
		
//		BinarySearchImpl binaraySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		
		try(AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(DemoApplication.class)) {
//				SpringApplication.run(DemoApplication.class, args);
			BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
			BinarySearchImpl binarySearchImpl2 = applicationContext.getBean(BinarySearchImpl.class);
			System.out.println(binarySearchImpl);
			System.out.println(binarySearchImpl2);
			int result = binarySearchImpl.binarySearch(new int[]{12, 4, 6}, 3);
			System.out.println(result);				
		}
	}
}

