package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.basic.BinarySearchImpl;

//@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
//		BinarySearchImpl binaraySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		
		ApplicationContext applicationContext =SpringApplication.run(DemoApplication.class, args);
		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);		
		System.out.println(binarySearchImpl);		
		int result = binarySearchImpl.binarySearch(new int[]{12, 4, 6}, 3);
		System.out.println(result);
	}
}

