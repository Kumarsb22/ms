package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.request.PostRequest;

@RestController
public class ProductController {
	String apurl = "https://dummyjson.com/products/";
	String users = "https://jsonplaceholder.typicode.com/users";
	String post = "https://jsonplaceholder.typicode.com/posts";

	@GetMapping("/posts")
	public ResponseEntity<String> getProduct() {

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> forEntity = restTemplate.getForEntity(post, String.class);
		String body = forEntity.getBody();
		System.out.println(body);
		return new ResponseEntity<String>(body, HttpStatus.OK);
	}

//	 {
//		    "userId":"10",
//
//		   "title":"Testing the rest template",
//		   "body":"Testing the rest template"
//		  }
	@PostMapping("/post")
	public ResponseEntity<String> post(@RequestBody PostRequest postRequest) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> postForEntity = restTemplate.postForEntity(post,
				postRequest, String.class);
		String body = postForEntity.getBody();
		System.out.println(body);
		return new ResponseEntity<String>(body, HttpStatus.CREATED);
	}
}
