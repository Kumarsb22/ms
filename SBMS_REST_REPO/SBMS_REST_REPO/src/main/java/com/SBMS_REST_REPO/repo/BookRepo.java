package com.SBMS_REST_REPO.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.SBMS_REST_REPO.entities.Book;

@RepositoryRestResource(path = "book")
public interface BookRepo extends JpaRepository<Book, Integer> {

	public List<Book> findByBookName(String name);
	// url
	// http://localhost:8080/book/search/findByBookName?name=Java
}
