package com.example.msgreetapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.msgreetapi.service.WelcomeFienClientService;

@RestController
public class GreetRestController {
	private Environment env;

	@Autowired
	private WelcomeFienClientService clientService;

	@GetMapping("/greet")
	public String greetMsg() {
	//String port=env.getProperty("server.port");
		String msg = "Good Afternoon ";
		String welcomeMsg = this.clientService.invokeWelcomeApi();
		return msg.concat(welcomeMsg);
	}
}
