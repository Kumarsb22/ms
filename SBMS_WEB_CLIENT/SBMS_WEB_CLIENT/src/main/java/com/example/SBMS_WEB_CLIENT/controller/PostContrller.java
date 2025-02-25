package com.example.SBMS_WEB_CLIENT.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class PostContrller {
	String post = "https://jsonplaceholder.typicode.com/posts";

	@GetMapping("/posts")
	public ResponseEntity<String> getPost() {
		WebClient client = WebClient.create();
		Mono<String> block = client.get().uri(post).retrieve().bodyToMono(String.class);
		Flux<String> bodyToFlux = client.get().uri(post).retrieve().bodyToFlux(String.class);
		System.out.println("bodyToMono" + block);
		// System.out.println("bodyToFlux" + bodyToFlux);
		return new ResponseEntity<String>( HttpStatus.OK);
	}

	@PostMapping("/post")
	public ResponseEntity<String> post(@RequestBody PostContrller postRequest) {
		WebClient webClient = WebClient.create();
		Mono<String> bodyToMono = webClient.post().uri(post).body(BodyInserters.fromValue(postRequest)).retrieve()
				.bodyToMono(String.class);
		System.out.println(bodyToMono);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}
}
