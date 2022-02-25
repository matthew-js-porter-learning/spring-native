package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class SpringNativeExampleApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringNativeExampleApplication.class, args);
	}

	@Bean
	public Function<String, String> hello() {
		return value -> "hello";
	}
}
