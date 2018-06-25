package com.subrat.ExceptionHandlingInMVC.service;

import java.util.ArrayList;


import javax.annotation.PostConstruct;


import org.springframework.stereotype.Service;

import com.subrat.ExceptionHandlingInMVC.controller.OrderException;
import com.subrat.ExceptionHandlingInMVC.model.Order;


@Service
public class OrderService {
    
	/*@Autowired
	OrderDao dao;*/
	
	@PostConstruct
	public void addOrder2DB() {
		ArrayList<Order> orders = new ArrayList<Order>();
		orders.add(new Order(1,"Mobile","screen touch",2778));
		orders.add(new Order(2,"Bike","two wheeler",27780));
		orders.add(new Order(3,"Bus","6 wheeler",277800));
		//dao.saveAll(orders);
	}
	
	
	public double getPrice(String orderName) throws OrderException {
		
		if(orderName.equalsIgnoreCase("Bike")) {
		return 2778;
		}else {
			throw new OrderException("the Order you given "+orderName+" is not available");
		}
	} 
}
