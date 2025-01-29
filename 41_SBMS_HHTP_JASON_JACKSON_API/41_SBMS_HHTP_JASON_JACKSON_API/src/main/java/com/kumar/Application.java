package com.kumar;

import java.io.File;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kumar.entiteies.Product;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		Product product = new Product(1, "Laptop", "52,000.00");

		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(new File("product.json"), product);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File f = new File("product.json");
		try {
			Product readValue = mapper.readValue(f, Product.class);
			System.out.println(readValue);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
