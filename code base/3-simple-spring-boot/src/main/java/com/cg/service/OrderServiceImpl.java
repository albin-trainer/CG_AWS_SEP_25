package com.cg.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.repo.OrderRepo;

public class OrderServiceImpl implements OrderService
{
	private OrderRepo orderRepo=null;
	public OrderServiceImpl() {
		System.out.println("constructor of order service");
	}
	@Autowired
	public void setOrderRepo(OrderRepo orderRepo) {
		System.out.println("setter...");
		this.orderRepo = orderRepo;
	}
	public String placeOrder(String prodCode, int quantity) {
		return orderRepo.orderProduct(prodCode, quantity);
	}
}
