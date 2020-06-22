package com.inventsale.inventorysales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//SpringBootApplication annotation is equivalent to:
//EnableAutoConfiguration: enables spring boot auto configuration support
//CompementScan: enables component scanning of current package also recursively scans sub-packages
//Configuration: able to register extra beans with @Bean or import other configuration classes
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		final Logger log = LoggerFactory.getLogger(App.class);
		//springApplication Bootstrap spring boot application
		SpringApplication.run(App.class, args);
		log.info("this is the looger talking");
	}

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("*");         //'*' allows all endpoints, Provide your URL/endpoint, if any.
        config.addAllowedHeader("*");         
        config.addAllowedMethod("POST");   //add the methods you want to allow like 'GET', 'PUT',etc. using similar statements.
        config.addAllowedMethod("GET");
        config.addAllowedMethod("DELETE");
        config.addAllowedMethod("PUT");
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
	
}
