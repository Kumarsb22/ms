package com.example.onetoone.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onetoone.entity.EmployeeDetails;

@Repository
public interface EmpDtsRepo extends JpaRepository<EmployeeDetails, Integer> {

}
