package com.example.onetoone.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onetoone.entity.Passport;

@Repository
public interface PassportRepo extends JpaRepository<Passport, Integer>{

}
