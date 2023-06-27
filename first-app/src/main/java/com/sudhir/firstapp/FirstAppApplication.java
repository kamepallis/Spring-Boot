package com.sudhir.firstapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstAppApplication {

	public static void main(String[] args) {
		System.out.println("Hello World");
		SpringApplication.run(FirstAppApplication.class, args);
	}

}
