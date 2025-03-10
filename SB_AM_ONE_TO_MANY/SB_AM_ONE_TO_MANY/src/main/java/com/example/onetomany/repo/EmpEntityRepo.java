package com.example.onetomany.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onetomany.entity.EmployeeEntity;

@Repository
public interface EmpEntityRepo extends JpaRepository<EmployeeEntity, Integer> {

}
