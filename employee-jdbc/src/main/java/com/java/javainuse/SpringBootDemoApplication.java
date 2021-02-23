package com.java.javainuse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//@EnableAutoConfiguration
@SpringBootApplication
public class SpringBootDemoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

}
