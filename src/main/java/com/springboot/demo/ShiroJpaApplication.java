package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ShiroJpaApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ShiroJpaApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
		System.out.println("外部tomcat,chapter启动!");
		return application.sources(ShiroJpaApplication.class);
	}

}
