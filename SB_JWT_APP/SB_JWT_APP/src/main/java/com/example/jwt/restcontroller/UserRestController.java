package com.example.jwt.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jwt.entity.UserEntity;
import com.example.jwt.request.AuthRequest;
import com.example.jwt.service.MyUserService;

@RestController
public class UserRestController {

	@Autowired
	private MyUserService myUserService;

	@Autowired
	private AuthenticationManager authenticationManager;

	@PostMapping("/register")
	public ResponseEntity<String> registerUser(@RequestBody UserEntity entity) {
		boolean saveUser = this.myUserService.saveUser(entity);
		if (saveUser) {
			return new ResponseEntity<String>("User Registered", HttpStatus.CREATED);
		} else {
			return new ResponseEntity<String>("User Registration Failed", HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}

	@PostMapping("/login")
	public String userAuthentication(@RequestBody AuthRequest authRequest) {
		UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(authRequest.getUsername(),
				authRequest.getPassword());
		Authentication authenticate = authenticationManager.authenticate(token);
		if (authenticate.isAuthenticated()) {
			// genrate jwt token and send to user
		}
		return null;

	}

	@GetMapping("/welcome")
	public String welcomeMsg() {
		return "Welcome to Kolkata";
	}
}
