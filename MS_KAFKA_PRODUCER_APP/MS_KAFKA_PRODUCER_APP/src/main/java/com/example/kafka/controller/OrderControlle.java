package com.example.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.kafka.entity.Order;
import com.example.kafka.service.OrderService;

@RestController
public class OrderControlle {

	@Autowired
	private OrderService orderService;

	@PostMapping("/order")
	public String placeOrder(@RequestBody Order order) {
		return this.orderService.publishMsg(order);
	}
}
