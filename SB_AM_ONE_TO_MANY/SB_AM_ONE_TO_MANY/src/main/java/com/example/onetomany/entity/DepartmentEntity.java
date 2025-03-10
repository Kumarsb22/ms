package com.example.onetomany.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class DepartmentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String position;

	@OneToMany(mappedBy = "departmentEntity")
	private List<EmployeeEntity> employeeEntities;

	public DepartmentEntity() {
		// TODO Auto-generated constructor stub
	}

	public DepartmentEntity(Integer id, String position, List<EmployeeEntity> employeeEntities) {
		super();
		this.id = id;
		this.position = position;
		this.employeeEntities = employeeEntities;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public List<EmployeeEntity> getEmployeeEntities() {
		return employeeEntities;
	}

	public void setEmployeeEntities(List<EmployeeEntity> employeeEntities) {
		this.employeeEntities = employeeEntities;
	}

}
