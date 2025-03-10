package com.example.onetoone;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.onetoone.entity.Passport;
import com.example.onetoone.entity.Person;
import com.example.onetoone.service.UserService;

@SpringBootApplication
public class SbAmOneToOneApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SbAmOneToOneApplication.class, args);

		UserService userService = run.getBean(UserService.class);
		// bi directional association mapping

//		userService.savePerson();
//		List<Passport> getAllPassport = userService.GetAllPassport();
//		getAllPassport.stream().forEach(e -> System.out.println(e));
//		System.out.println("-----------------------------------");
//
//		List<Person> getAllPerson = userService.GetAllPerson();
//		getAllPerson.stream().forEach(e -> System.out.println(e));

		// userService.deleteBYPassport();
		// userService.deleteBYPerson();

		// unidirectional association mapping

		userService.saveEmp();

		userService.getAllEMp();
		System.out.println("-----------------");

		userService.getAllEMpDtls();
	}

}
