package com.example.mswelcomeapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@Autowired
	private Environment environment;

	@GetMapping("/welcome")
	public String gerWelcomeMesg() {
//		int port2 = ((ServletWebServerApplicationContext) applicationContext).getWebServer().getPort();

		String port = environment.getProperty("server.port");
		String msg = "Welcome to Kolkata " + port;
		return msg;
	}
}
