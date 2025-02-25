package com.kumar.MS_SERVICE_RESGISTERY;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MsServiceResgisteryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsServiceResgisteryApplication.class, args);
	}

}
