package com.BE.RedLine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;

@SpringBootApplication
public class RedLineApplication {
	private String ExpectedURL = "http://localhost:3000";
	private String internalIP = "127.0.0.1:3000";
	private String outsideIP = "198.213.89.195"; //ip of school
	private String outsideIP2 = "198.213.89.145"; //ip of school 2

	public static void main(String[] args) {
		SpringApplication.run(RedLineApplication.class, args);
	}

//for cors
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/requests")
						.allowedMethods("GET")
//						.allowedHeaders("Access-Control-Allow-Headers", "Access-Control-Allow-Origin",
//								"Access-Control-Request-Method", "Access-Control-Request-Headers", "Origin",
//								"Cache-Control", "Content-Type")
//						.allowedOrigins(ExpectedURL)
//						.allowedOrigins(internalIP)
//						.allowedOrigins(outsideIP)
						.allowedOrigins(outsideIP2)

				;
				registry.addMapping("/requests/{id}")
						.allowedMethods("GET","PATCH")
//						.allowedHeaders("Access-Control-Allow-Headers", "Access-Control-Allow-Origin",
//								"Access-Control-Request-Method", "Access-Control-Request-Headers", "Origin",
//								"Cache-Control", "Content-Type")
//						.allowedOrigins(ExpectedURL)
//						.allowedOrigins(internalIP)
//						.allowedOrigins(outsideIP)
						.allowedOrigins(outsideIP2)
				;
				registry.addMapping("/responder/{name}")
						.allowedMethods("GET")
//						.allowedHeaders("Access-Control-Allow-Headers", "Access-Control-Allow-Origin",
//								"Access-Control-Request-Method", "Access-Control-Request-Headers", "Origin",
//								"Cache-Control", "Content-Type")
//						.allowedOrigins(ExpectedURL)
//						.allowedOrigins(internalIP)
//						.allowedOrigins(outsideIP)
						.allowedOrigins(outsideIP2)
				;
				registry.addMapping("/nineline")
						.allowedMethods("POST")
//						.allowedHeaders("Access-Control-Allow-Headers", "Access-Control-Allow-Origin",
//								"Access-Control-Request-Method", "Access-Control-Request-Headers", "Origin",
//								"Cache-Control", "Content-Type")
//						.allowedOrigins(ExpectedURL)
//						.allowedOrigins(internalIP)
//						.allowedOrigins(outsideIP)
						.allowedOrigins(outsideIP2)
				;
			}
		};
	}
}
