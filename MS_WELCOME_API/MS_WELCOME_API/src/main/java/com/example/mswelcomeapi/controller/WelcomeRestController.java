package com.example.mswelcomeapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mswelcomeapi.entity.Student;
import com.example.mswelcomeapi.repository.StudentRepo;

@RestController
public class WelcomeRestController {

	@Autowired
	private Environment environment;

	@Autowired
	private StudentRepo repo;

//	@Value("${msg}")
//	private String msg;

	private List<Student> students = null;

	@GetMapping("/welcome")
	public String gerWelcomeMesg() {
//		int port2 = ((ServletWebServerApplicationContext) applicationContext).getWebServer().getPort();

		if (students == null) {
			students = this.repo.findAll();
		}
		//students.forEach(s -> System.out.println(s));
		String port = environment.getProperty("server.port");
		String msg1 = students + port;
		return msg1;
	}
}
