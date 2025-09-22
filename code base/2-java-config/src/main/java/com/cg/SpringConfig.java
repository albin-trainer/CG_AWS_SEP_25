package com.cg;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.cg.service.OrderServiceImpl;
@Configuration
@ComponentScan(basePackages = "com.cg")
public class SpringConfig {
	@Bean("service") //<bean id ="" class ="">
	public OrderServiceImpl getService() {
		System.out.println("test");
		return new OrderServiceImpl();
	}
//	@Bean //<bean id ="" class ="">
//	public OrderRepImpl getRep() {
//		return new OrderRepImpl();
//	}
}
