package com.learn.jpa.hibernate.learnJPAandHibernate.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJPARepository {

	//@Autowired we can mention any of them
	@PersistenceContext
	private EntityManager entityManager;
	
	public void insert(Course course) {
		entityManager.merge(course);
	}
	
	public void delete(long id) {
		Course course= entityManager.find(Course.class,id);
		entityManager.remove(course);
	}
	
	public Course findById(long id) {
		return (Course) entityManager.find(Course.class,id);
	}
}
