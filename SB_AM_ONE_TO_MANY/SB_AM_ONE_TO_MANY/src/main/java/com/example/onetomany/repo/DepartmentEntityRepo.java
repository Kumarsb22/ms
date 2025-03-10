package com.example.onetomany.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onetomany.entity.DepartmentEntity;

@Repository
public interface DepartmentEntityRepo extends JpaRepository<DepartmentEntity, Integer> {

}
