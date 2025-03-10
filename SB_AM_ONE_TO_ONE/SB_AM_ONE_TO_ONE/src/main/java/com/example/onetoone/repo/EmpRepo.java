package com.example.onetoone.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onetoone.entity.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
