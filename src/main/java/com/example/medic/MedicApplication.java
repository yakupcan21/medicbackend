package com.example.medic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.medic.repos")
public class MedicApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicApplication.class, args);
	}

}
