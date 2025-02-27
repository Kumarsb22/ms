package com.example.msgreetapi.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="MS-WELCOME-API")
public interface WelcomeFienClientService {

	@GetMapping("/welcome")
	public String invokeWelcomeApi();
}
