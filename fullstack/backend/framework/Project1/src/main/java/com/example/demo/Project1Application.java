package com.example.demo;

import java.util.concurrent.TimeUnit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.CacheControl;
import org.springframework.web.reactive.config.ResourceHandlerRegistry;

@SpringBootApplication
public class Project1Application {

	public static void main(String[] args) {
		SpringApplication.run(Project1Application.class, args);
	}
	//@Override
	   public void addResourceHandlers(ResourceHandlerRegistry registry) {

	        // Register resource handler for images
	        registry.addResourceHandler("/images/**").addResourceLocations("/WEB-INF/images/")
	                .setCacheControl(CacheControl.maxAge(2, TimeUnit.HOURS).cachePublic());
	    }

}
