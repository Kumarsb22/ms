package com.example.circuitbreaker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.circuitbreaker.entitey.Activily;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class MsgRestContrller {

	@GetMapping("/data")
	@CircuitBreaker(name = "getDataFromRedis", fallbackMethod = "getDataFromDB")
	public String getDataFromRedis() {
		System.out.println("Redis method executed");
		int i = 10 / 0;
		return "Data fetching from redis";
	}

	public String getDataFromDB(Throwable t) {
		System.out.println("Db method executed");
		return "Data Fetching from db";
	}

	@GetMapping("/redis")
	@CircuitBreaker(name = "getRandomActivily", fallbackMethod = "fallbackRandomActivily")
	public String getRandomActivily() {
		System.out.println("Redis method executed");
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Activily> forEntity = restTemplate.getForEntity("", Activily.class);
		Activily body = forEntity.getBody();
		System.out.println("Activily Reciever : " + body);

		int i = 10 / 0;

		return "Redis cache";
	}

	public String fallbackRandomActivily(Throwable t) {
		System.out.println("fallback method executed");
		return "Data from db";
	}

}
