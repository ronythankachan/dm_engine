package com.cognicor.configurations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cognicor.*")
public class DmEngineApplication {

	public static void main(String[] args) {
		SpringApplication.run(DmEngineApplication.class, args);
	}

}
