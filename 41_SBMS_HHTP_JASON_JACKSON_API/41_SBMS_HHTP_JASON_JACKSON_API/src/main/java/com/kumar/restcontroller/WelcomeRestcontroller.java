package com.kumar.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestcontroller {

	@GetMapping("/welcome")
	public String welcome(@RequestParam("") String name) {
		return name + "Welcome to maha kumbmela";
	}
}
