package com.kumar.httpstatuscode.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {

	@GetMapping("/welcome")
	public String welcome() {
		// by default response status code is 200 ok if we want customize the status
		// code
		return "Welcome to Kumbmela";
	}

	@GetMapping("/hello")
	public ResponseEntity<String> msg() {
		// 200 to 299 success status codes
		// 400 to 499 client error status codes client is not sending the proper request
		// 500 to 599 server error in server or application fucntionality is not working
		// some exception occured or some proble in server
		return new ResponseEntity<>("Hello Kumar Balambeed", HttpStatus.CREATED);
	}

}
