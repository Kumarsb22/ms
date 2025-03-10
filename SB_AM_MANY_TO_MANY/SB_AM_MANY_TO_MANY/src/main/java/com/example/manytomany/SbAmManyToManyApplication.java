package com.example.manytomany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.manytomany.service.BookService;

@SpringBootApplication
public class SbAmManyToManyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SbAmManyToManyApplication.class, args);

		BookService bookService = run.getBean(BookService.class);

		bookService.saveBook();
		bookService.getAllBook();
		System.out.println("--------------------");
		bookService.getCegory();
	}

}
