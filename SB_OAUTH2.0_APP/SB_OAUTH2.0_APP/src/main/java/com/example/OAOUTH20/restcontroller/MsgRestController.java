package com.example.OAOUTH20.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	@GetMapping("/")
	public String getMsg() {
		return "Welcome to kolkata";
	}
}
