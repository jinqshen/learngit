package com.jinqshen.springbootservlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan(basePackages = "com.jinqshen.springbootservlet.web.servlet")
@SpringBootApplication
public class SpringBootServletApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootServletApplication.class, args);
	}
}
