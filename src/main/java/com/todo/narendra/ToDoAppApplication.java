package com.todo.narendra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class ToDoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run (ToDoAppApplication.class, args);
	}

}