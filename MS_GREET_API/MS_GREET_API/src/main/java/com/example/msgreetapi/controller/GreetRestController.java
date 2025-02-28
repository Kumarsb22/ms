package com.example.msgreetapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.msgreetapi.service.WelcomeFienClientService;

@RefreshScope
@RestController
public class GreetRestController {
	private Environment env;

	@Value("${msg}")
	private String msg;

	@Autowired
	private WelcomeFienClientService clientService;

	@GetMapping("/greet")
	public String greetMsg() {
		// String port=env.getProperty("server.port");
		String msg1 = msg;
		String welcomeMsg = this.clientService.invokeWelcomeApi();
		return msg1.concat(welcomeMsg);
	}
}
