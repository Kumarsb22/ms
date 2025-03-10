package com.example.manytomany.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class BookEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "book-category", // join table for manytomany association
			joinColumns = @JoinColumn(name = "book_id"), // foreinkey of book entity
			inverseJoinColumns = @JoinColumn(name = "category_id")// foreinkey for category
	)
	private List<CategoryEntity> categoryEntity;

	public BookEntity() {
		// TODO Auto-generated constructor stub
	}

	public BookEntity(Integer id, String name, List<CategoryEntity> categoryEntity) {
		super();
		this.id = id;
		this.name = name;
		this.categoryEntity = categoryEntity;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<CategoryEntity> getCategoryEntity() {
		return categoryEntity;
	}

	public void setCategoryEntity(List<CategoryEntity> categoryEntity) {
		this.categoryEntity = categoryEntity;
	}

	@Override
	public String toString() {
		return "BookEntity [id=" + id + ", name=" + name + ", categoryEntity=" + categoryEntity + "]";
	}

}
