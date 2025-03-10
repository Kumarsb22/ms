package com.example.manytomany.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.manytomany.entity.BookEntity;

import jakarta.persistence.Entity;

@Repository
public interface BookRepo extends JpaRepository<BookEntity, Integer>{

}
 