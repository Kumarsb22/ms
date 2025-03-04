package com.example.inmemory.restcontroller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestContrller {

	@GetMapping("/admin")
	public String getAdmin() {
		return "Hello Admin";
	}

	@GetMapping("/adminanduser")
	public String getAdminAndUser() {
		return "Hello Admin and user";
	}
}
