package com.example.redisdbapp.redisrepo;

import org.springframework.data.repository.CrudRepository;

import com.example.redisdbapp.biding.Student;

public interface StudentRedisRepo extends CrudRepository<Student, Integer> {

}
