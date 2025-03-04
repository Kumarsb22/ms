package com.example.springsecurityba.restcontrller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgContrller {

	@GetMapping("/msg")
	public String getMsg() {
		return "Hello, Welcome to Banglore";
	}
}
