package com.example.mswelcomeapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mswelcomeapi.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
