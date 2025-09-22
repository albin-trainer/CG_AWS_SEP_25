package com.cg.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.service.OrderService;

@RestController
public class MyRestApi {
	@Autowired
	private OrderService service;
@GetMapping("/order")
	public String order() {
		return service.placeOrder("SamsungMobile", 1);
	}
}
