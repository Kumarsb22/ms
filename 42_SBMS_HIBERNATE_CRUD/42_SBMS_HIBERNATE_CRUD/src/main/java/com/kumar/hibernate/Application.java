package com.kumar.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.kumar.hibernate.dao.StudentDao;
import com.kumar.hibernate.entities.Student;

@SpringBootApplication
public class Application implements ApplicationRunner {

	@Autowired
	private StudentDao studentDao;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Student student = new Student();
		student.setName("Kumar Balambeed");
		student.setEmail("kumar@gmail.com");
		student.setAge(26);

		Student save = studentDao.save(student);
		System.out.println(save);

		boolean update = studentDao.update(student);

		Student fetchById = studentDao.fetchById(1);
		System.out.println(fetchById);

		boolean deleteById = studentDao.deleteById(1);

	}

}
