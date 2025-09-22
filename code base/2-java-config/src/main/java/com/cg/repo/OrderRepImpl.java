package com.cg.repo;
import java.util.HashMap;
import org.springframework.stereotype.Component;
@Component 
public class OrderRepImpl implements OrderRepo {
	HashMap<String, Float> products=new HashMap<>();
	public OrderRepImpl() {
		System.out.println("constructor of order repo");
		products.put("SamsungMobile", 30000F);
		products.put("LaptopLenova", 100000F);
		products.put("HeadPhone", 2000F);
		products.put("Shoes", 5000F);
		products.put("Glasses", 1000F);
	}
	public String orderProduct(String prodCode, int quantity) {
		//returns your order  confirmed plz pay the amount of ____ 
		//if the prodcode not present returns "Sorry product not found"
		String msg="";
		if(products.containsKey(prodCode)) {
			float price=products.get(prodCode);
			float totPrice=price*quantity;
			msg="Your order is confirmed plz pay the amt of "+totPrice;
		}
		else
			msg="Sorry product not found";
		return msg;
	}

}
