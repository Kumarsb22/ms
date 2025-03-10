package com.example.manytomany.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.manytomany.entity.BookEntity;
import com.example.manytomany.entity.CategoryEntity;
import com.example.manytomany.repo.BookRepo;
import com.example.manytomany.repo.CategoryRepo;

@Service
public class BookService {

	@Autowired
	private BookRepo bookRepo;

	@Autowired
	private CategoryRepo categoryRepo;

	public void saveBook() {

		CategoryEntity categoryEntity1 = new CategoryEntity();

		categoryEntity1.setName("Java 8");
		CategoryEntity categoryEntity2 = new CategoryEntity();

		categoryEntity2.setName("Threads");
		CategoryEntity categoryEntity3 = new CategoryEntity();

		categoryEntity3.setName("Docker");
		CategoryEntity categoryEntity4 = new CategoryEntity();

		categoryEntity4.setName("Kubernatis");
		BookEntity bookEntity1 = new BookEntity();
		bookEntity1.setName("Java");
		bookEntity1.setCategoryEntity(Arrays.asList(categoryEntity1, categoryEntity2));
		BookEntity bookEntity2 = new BookEntity();
		bookEntity2.setName("AWS");
		bookEntity2.setCategoryEntity(Arrays.asList(categoryEntity3, categoryEntity4));
		bookRepo.saveAll(Arrays.asList(bookEntity1, bookEntity2));

	}

	public void getAllBook() {
		bookRepo.findAll().forEach(e -> System.out.println(e));
	}

	public void getCegory() {
		categoryRepo.findAll().forEach(e -> System.out.println(e));
	}
}
