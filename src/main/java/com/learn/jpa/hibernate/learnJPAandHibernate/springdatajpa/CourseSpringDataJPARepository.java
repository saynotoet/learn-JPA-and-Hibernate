package com.learn.jpa.hibernate.learnJPAandHibernate.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learn.jpa.hibernate.learnJPAandHibernate.jpa.Course;

@Repository
public interface CourseSpringDataJPARepository extends JpaRepository<Course,Long> {	
	
}