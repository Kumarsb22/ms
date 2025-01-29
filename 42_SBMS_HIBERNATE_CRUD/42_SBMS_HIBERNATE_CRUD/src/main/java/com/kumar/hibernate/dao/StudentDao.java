package com.kumar.hibernate.dao;

import org.springframework.stereotype.Repository;

import com.kumar.hibernate.entities.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class StudentDao {

	@PersistenceContext
	private EntityManager entityManager;

	public Student save(Student student) {
		entityManager.persist(student);
		System.out.println("Student saved successfully");
		return student;
	}

//	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//
//	public Student save(Student student) {
//		Student student1 = null;
//		Transaction transaction = null;
//		try (Session openSession = sessionFactory.openSession()) {
//			transaction = openSession.beginTransaction();
//			student1 = (Student) openSession.save(student);
//			transaction.commit();
//			System.out.println("Student saved successfully");
//		} catch (Exception e) {
//			if (transaction != null)
//				transaction.rollback();
//			e.printStackTrace();
//		}
//
//		return student1;
//	}
//
//	public boolean update(Student student) {
//		Transaction transaction = null;
//		Student student1 = null;
//		try (Session openSession = sessionFactory.openSession()) {
//			transaction = openSession.beginTransaction();
//			openSession.update(student);
//			transaction.commit();
//			System.out.println("Student upadated");
//		} catch (Exception e) {
//			if (transaction != null)
//				transaction.rollback();
//			e.printStackTrace();
//		}
//
//		return true;
//	}

	public boolean update(Student student) {
		entityManager.merge(student);
		System.out.println("student updated successfully");
		return true;
	}

//
//	public Student fetchById(Integer id) {
//		Student student = null;
//		try (Session openSession = sessionFactory.openSession()) {
//			student = openSession.find(Student.class, id);
//			System.out.println("Student Fetched successfully");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return student;
//	}

	public Student fetchById(Integer id) {
		Student student = entityManager.find(Student.class, id);
		System.out.println("student fecthed successfully");
		return student;
	}
//
//	public boolean deleteById(Integer id) {
//		Transaction transaction = null;
//
//		try (Session openSession = sessionFactory.openSession()) {
//			transaction = openSession.beginTransaction();
//			Student student = openSession.get(Student.class, id);
//			if (student != null) {
//				openSession.delete(student);
//				System.out.println("student deleted successfully");
//			}
//			transaction.commit();
//
//		} catch (Exception e) {
//			if (transaction != null)
//				e.printStackTrace();
//			e.printStackTrace();
//		}
//
//		return true;
//	}

	public boolean deleteById(Integer id) {
		Student student = entityManager.find(Student.class, id);
		if (student != null)
			entityManager.remove(id);
		System.out.println("Student deleted successfully");
		return true;
	}
}
