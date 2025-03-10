package com.example.onetoone.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Passport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer passportId;
	private String name;
	private String email;

	@OneToOne(mappedBy = "passport")
	private Person person;

	public Passport() {
		// TODO Auto-generated constructor stub
	}

	public Passport(Integer passportId, String name, String email, Person person) {
		super();
		this.passportId = passportId;
		this.name = name;
		this.email = email;
		this.person = person;
	}

	public Integer getPassportId() {
		return passportId;
	}

	public void setPassportId(Integer passportId) {
		this.passportId = passportId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Passport [passportId=" + passportId + ", name=" + name + ", email=" + email + ", person=" + person
				+ "]";
	}

}
