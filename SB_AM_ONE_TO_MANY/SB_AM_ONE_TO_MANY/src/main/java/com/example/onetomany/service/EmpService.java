package com.example.onetomany.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onetomany.entity.Address;
import com.example.onetomany.entity.DepartmentEntity;
import com.example.onetomany.entity.Employee;
import com.example.onetomany.entity.EmployeeEntity;
import com.example.onetomany.repo.AddressRepo;
import com.example.onetomany.repo.DepartmentEntityRepo;
import com.example.onetomany.repo.EmpEntityRepo;
import com.example.onetomany.repo.EmpRepo;

@Service
public class EmpService {

	private EmpRepo empRepo;

	private AddressRepo addressRepo;

	@Autowired
	private EmpEntityRepo empEntityRepo;
	@Autowired
	private DepartmentEntityRepo departmentEntityRepo;

	public EmpService(EmpRepo empRepo, AddressRepo addressRepo) {
		this.empRepo = empRepo;
		this.addressRepo = addressRepo;
	}

	public void save() {
		Employee employee = new Employee();
		employee.setName("Kumar Balambeed");
		Address address = new Address();
		address.setPlace("Bengaluru");
		Address address1 = new Address();
		address1.setPlace("Bengaluru");
		employee.setAddress(Arrays.asList(address, address1));
		this.empRepo.save(employee);
	}

	public void getAllEmployee() {
		this.empRepo.findAll().forEach(e -> System.out.println(e));
	}

	public void getAllAddress() {
		this.addressRepo.findAll().forEach(e -> System.out.println(e));
	}

	public void deleteEmployee() {
		this.empRepo.deleteAll();
	}

	public void deleteAddress() {
		this.addressRepo.deleteAll();
	}

	public void saveEmployeeEntity() {
		EmployeeEntity employeeEntity1 = new EmployeeEntity();
		employeeEntity1.setName("Kumar Balambeed");
		EmployeeEntity employeeEntity2 = new EmployeeEntity();
		employeeEntity2.setName("Sunil Balambeed");
		EmployeeEntity employeeEntity3 = new EmployeeEntity();
		employeeEntity3.setName("Manju Balambeed");
		EmployeeEntity employeeEntity4 = new EmployeeEntity();
		employeeEntity4.setName("Manoj Balambeed");

		DepartmentEntity departmentEntity = new DepartmentEntity();
		departmentEntity.setPosition("Agriculture");
//
//		employeeEntity1.setDepartmentEntity(departmentEntity);
//		employeeEntity2.setDepartmentEntity(departmentEntity);
//		employeeEntity3.setDepartmentEntity(departmentEntity);
//		employeeEntity4.setDepartmentEntity(departmentEntity);

//		this.empEntityRepo
//				.saveAllAndFlush(Arrays.asList(employeeEntity1, employeeEntity2, employeeEntity3, employeeEntity4));

		departmentEntity
				.setEmployeeEntities(Arrays.asList(employeeEntity1, employeeEntity2, employeeEntity3, employeeEntity4));

		departmentEntityRepo.save(departmentEntity);

	}

	public void getAllEmployeeentity() {
		this.empEntityRepo.findAll().forEach(e -> System.out.println(e));
	}

	public void getAlldepartment() {
		this.departmentEntityRepo.findAll().forEach(e -> System.out.println(e));
	}

	public void deleteEmployeeentity() {
		this.empEntityRepo.deleteAll();
	}

	public void deleteDepartemententity() {
		this.departmentEntityRepo.deleteAll();
	}
}
