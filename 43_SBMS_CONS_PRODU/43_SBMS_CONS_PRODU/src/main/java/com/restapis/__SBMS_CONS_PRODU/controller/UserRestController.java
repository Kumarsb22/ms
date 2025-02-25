package com.restapis.__SBMS_CONS_PRODU.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restapis.__SBMS_CONS_PRODU.dto.UserRequest;
import com.restapis.__SBMS_CONS_PRODU.service.UserServiceImpl;

import jakarta.validation.Valid;

@RestController
public class UserRestController {

	@Autowired
	private UserServiceImpl serviceImpl;

	@PostMapping(value = "/user")
	public ResponseEntity<String> resgisterUser(@Valid @RequestBody UserRequest request) {
		System.out.println(request);
		boolean saveUser = this.serviceImpl.saveUser(request);
		if (saveUser) {
			if (request.getUserId() == null) {
				return ResponseEntity.ok("User Register successfully");
			} else {
				return ResponseEntity.ok("User Updated successfully");
			}
		}
		return new ResponseEntity("Internal Server Error", HttpStatus.INTERNAL_SERVER_ERROR);

	}

	@GetMapping(value = "/users", produces = "application/json")
	public ResponseEntity<List<UserRequest>> getAllUsers() {
		return new ResponseEntity<List<UserRequest>>(this.serviceImpl.getAllUser(), HttpStatus.ACCEPTED);
	}

	@GetMapping("/user")
	public ResponseEntity<UserRequest> getUserById(@RequestParam("userId") Integer userId) {
		return new ResponseEntity(this.serviceImpl.getUserById(userId), HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/user")
	public ResponseEntity<String> deleteUserById(@RequestParam("userId") Integer userId) {
		boolean deleteUserById = this.serviceImpl.deleteUserById(userId);
		if (deleteUserById) {
			return new ResponseEntity("User Deleted Successfully", HttpStatus.OK);
		}
		return new ResponseEntity("Internal Server Error", HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
