package com.cg;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.service.OrderService;
public class Main {
	public static void main(String[] args) {
		//initialize spring container ApplicationContext
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("initialized spring container ...");
		//client needs to invoke the service
	     OrderService service=	(OrderService) ctx.getBean("service");
	     String r=service.placeOrder("HeadPhone", 2);
	     System.out.println(r);
	}
}
