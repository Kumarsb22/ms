package com.example.unit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.unit.service.MsgService;

@RestController
public class MsgRestController {

	@Autowired
	private MsgService msgService;

	@GetMapping("/welcome")
	public String welcomeMsg() {
		String welcomeMsg = this.msgService.getWelcomeMsg();
		return welcomeMsg;
	}

	@GetMapping("/greet")
	public String greetMsg() {
		String greetMsg = this.msgService.getGreetMsg();
		greetMsg = greetMsg.toUpperCase();
		return greetMsg;
	}
}
