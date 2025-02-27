package com.example.mswelcomeapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsWelcomeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsWelcomeApiApplication.class, args);
	}

}
