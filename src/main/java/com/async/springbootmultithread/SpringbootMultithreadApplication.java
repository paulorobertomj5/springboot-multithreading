package com.async.springbootmultithread;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SpringbootMultithreadApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMultithreadApplication.class, args);
		System.out.println("Spring Boot started");
	}
}
