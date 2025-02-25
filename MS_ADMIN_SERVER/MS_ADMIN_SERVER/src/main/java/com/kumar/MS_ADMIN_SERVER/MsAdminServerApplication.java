package com.kumar.MS_ADMIN_SERVER;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class MsAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsAdminServerApplication.class, args);
	}

}
