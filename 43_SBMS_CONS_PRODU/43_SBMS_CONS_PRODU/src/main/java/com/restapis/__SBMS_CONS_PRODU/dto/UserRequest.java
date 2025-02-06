package com.restapis.__SBMS_CONS_PRODU.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class UserRequest {
	private Integer userId;
	@NotNull(message = "Name cannot be null")
	@Size(min = 3, max = 50, message = "Name must be between 3 to 50 charactors")
	@NotBlank(message = "Name is mandatory")
	private String name;
	@Email(message = "Invalid email format")
	@NotBlank(message = "Email is mandatory")
	private String email;
	@NotBlank(message = "Phone is mandatory")
	@Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be 10 digits")
	private String phone;
	@NotNull(message = "Age is mandatory")
	@Min(value = 18, message = "Age must be at least 18")
	@Max(value = 60, message = "Age must not be exceed 60")
	private Integer age;

	public UserRequest() {
		// TODO Auto-generated constructor stub
	}

	public UserRequest(Integer userId, String name, String email, String phone, Integer age) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.age = age;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", phone=" + phone + ", age=" + age
				+ "]";
	}

}
