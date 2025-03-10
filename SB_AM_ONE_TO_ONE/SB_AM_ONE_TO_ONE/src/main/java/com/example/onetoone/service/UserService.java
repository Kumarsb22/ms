package com.example.onetoone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onetoone.entity.Employee;
import com.example.onetoone.entity.EmployeeDetails;
import com.example.onetoone.entity.Passport;
import com.example.onetoone.entity.Person;
import com.example.onetoone.repo.EmpDtsRepo;
import com.example.onetoone.repo.EmpRepo;
import com.example.onetoone.repo.PassportRepo;
import com.example.onetoone.repo.PersonRepo;

@Service
public class UserService {

	@Autowired
	private PassportRepo passportRepo;

	@Autowired
	private PersonRepo personRepo;

	@Autowired
	private EmpRepo empRepo;

	@Autowired
	private EmpDtsRepo dtsRepo;

	public String savePerson() {
//		Person person = new Person();
//		person.setName("Kumar");
//		person.setEmail("kumar@gmail.com");
//		person.setNo("8664656");
//		Passport passport = new Passport();
//		passport.setName("kumar");
//		passport.setEmail("kumar");
//		passport.setPerson(person);
//		person.setPassport(passport);
//		this.personRepo.save(person);
//		Person person1 = new Person();
//		person1.setName("Kumar");
//		person1.setEmail("kumar@gmail.com");
//		person1.setNo("8664656");
//		Passport passport1 = new Passport();
//		passport1.setName("kumar");
//		passport1.setEmail("kumar");
//		passport1.setPerson(person1);
//		person.setPassport(passport1);
//		this.personRepo.save(person1);

		Person person2 = new Person();
		person2.setName("Kumar");
		person2.setEmail("kumar@gmail.com");
		person2.setNo("8664656");

		Passport passport2 = new Passport();
		passport2.setName("kumar");
		passport2.setEmail("kumar");
		person2.setPassport(passport2);
		personRepo.save(person2);

//		Passport save = passportRepo.save(passport2);
//		person2.setPassport(save);
//		personRepo.save(person2);
		return "Person and passport saved";
	}

	public List<Person> GetAllPerson() {
		return this.personRepo.findAll();
	}

	public List<Passport> GetAllPassport() {
		return this.passportRepo.findAll();
	}

	public void deleteBYPerson() {
		this.personRepo.deleteAll();
	}

	public void deleteBYPassport() {
		this.passportRepo.deleteAll();
	}

	public void saveEmp() {
		Employee employee = new Employee();
		employee.setName("Kumar Balambeed");

		EmployeeDetails details = new EmployeeDetails();
		details.setPlace("Banglore");

		// if i dont use casecade
		EmployeeDetails employeeDetails = dtsRepo.save(details);
		employee.setEmployeeDetails(employeeDetails);
		empRepo.save(employee);

		// if i use cascadetype
//		employee.setEmployeeDetails(details);
//		empRepo.save(employee);
	}

	public void getAllEMp() {
		List<Employee> all = this.empRepo.findAll();
		System.out.println(all);

		this.empRepo.findAll().forEach(e -> System.out.println(e));
	}

	public void getAllEMpDtls() {
		this.dtsRepo.findAll().forEach(e -> System.out.println(e));
	}
}
