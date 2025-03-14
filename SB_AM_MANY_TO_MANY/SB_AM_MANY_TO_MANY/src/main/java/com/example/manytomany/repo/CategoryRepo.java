package com.example.manytomany.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.manytomany.entity.CategoryEntity;

@Repository
public interface CategoryRepo extends JpaRepository<CategoryEntity, Integer> {

}
