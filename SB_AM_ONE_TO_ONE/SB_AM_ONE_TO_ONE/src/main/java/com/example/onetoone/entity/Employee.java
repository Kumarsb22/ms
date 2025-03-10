package com.example.onetoone.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;

	@OneToOne()
	@JoinColumn(name = "emp_dts_id")
	private EmployeeDetails EmployeeDetails;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer id, String name, com.example.onetoone.entity.EmployeeDetails employeeDetails) {
		super();
		this.id = id;
		this.name = name;
		EmployeeDetails = employeeDetails;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EmployeeDetails getEmployeeDetails() {
		return EmployeeDetails;
	}

	public void setEmployeeDetails(EmployeeDetails employeeDetails) {
		EmployeeDetails = employeeDetails;
	}

//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + "]";
//	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", EmployeeDetails=" + EmployeeDetails + "]";
	}

}
