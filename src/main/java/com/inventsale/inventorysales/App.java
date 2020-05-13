package com.inventsale.inventorysales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//SpringBootApplication annotation is equivalent to:
//EnableAutoConfiguration: enables spring boot auto configuration support
//CompementScan: enables component scanning of current package also recursively scans sub-packages
//Configuration: able to register extra beans with @Bean or import other configuration classes
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		//springApplication Bootstrap spring boot application
		SpringApplication.run(App.class, args);
	}

}
