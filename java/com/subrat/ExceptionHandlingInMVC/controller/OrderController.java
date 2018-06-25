package com.subrat.ExceptionHandlingInMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.subrat.ExceptionHandlingInMVC.model.Order;
import com.subrat.ExceptionHandlingInMVC.model.Response;
import com.subrat.ExceptionHandlingInMVC.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService service;
	double amount = 0;

	@GetMapping("/order-amount/{orderName}")
	public String getAmount(@PathVariable String orderName) throws OrderException {
		amount = service.getPrice(orderName);
		System.out.println("========================Amount for the order " + orderName + ":-" + amount);
		return "Amount for the order " + orderName + ":-" + amount;
	}

	@GetMapping("/order-cat/{orderName}")
	public Response getCat(@PathVariable String orderName) throws OrderException {
		return new Response(orderName + " is the cat of " + "6 wheeler", true);
	}

	@PostMapping("/save-order/")
	public Response addOrder(@RequestBody Order order) throws OrderException {
		if (order != null) {
			Order oOreder = new Order(order.getId(), order.getName(), order.getCat(), order.getAmount());

			return new Response("Saved success fully " + order.getId(), true);
		} else {
			return new Response("Should not pass blank order", false);
		}
	}

}
