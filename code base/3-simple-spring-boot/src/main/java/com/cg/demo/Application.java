package com.cg.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import com.cg.service.OrderServiceImpl;

@SpringBootApplication//@SpringBootConfiguration + @EnableAutoConfiguration + @ComponentScan
@ComponentScan(basePackages = "com.cg")
@ImportResource("beans.xml")
public class Application {
	public static void main(String[] args) {
		//initialized ApplicationContext
		//Scans components in  packages
		//By scanning the class path it autoconfigure tomcat server , jpa  etc.. 
		//starts the tomcat
		//returns ApplicationContext
		ApplicationContext ctx=  SpringApplication.run(Application.class, args);
	}
//	@Bean
//	public OrderServiceImpl getService() {
//		return new OrderServiceImpl();
//	}
}
