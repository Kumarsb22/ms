package com.example.onetomany.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onetomany.entity.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer>{

}
