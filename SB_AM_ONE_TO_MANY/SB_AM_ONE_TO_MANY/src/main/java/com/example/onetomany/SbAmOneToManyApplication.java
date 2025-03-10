package com.example.onetomany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.onetomany.service.EmpService;

@SpringBootApplication
public class SbAmOneToManyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SbAmOneToManyApplication.class, args);

		EmpService empService = run.getBean(EmpService.class);
//
//		empService.save();
//		empService.getAllEmployee();
//		System.out.println("-----------------");
//		empService.getAllAddress();
//		
//		empService.deleteEmployee();

		empService.saveEmployeeEntity();

		empService.getAllEmployeeentity();

		System.out.println("-------------------");
		empService.getAlldepartment();
	}

}
