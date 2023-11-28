package com.learn.jpa.hibernate.learnJPAandHibernate.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learn.jpa.hibernate.learnJPAandHibernate.jpa.Course;

@Component
public class SpringDataJPACommandLineRunner implements CommandLineRunner {

	@Autowired 
	private CourseSpringDataJPARepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		
		repository.save(new Course(7,"Spring","Abdullah"));
		repository.save(new Course(8,"AWS","ALI"));
		repository.save(new Course(9,"Azure","Hamza"));
		repository.deleteById(8l);
		
		System.out.println(repository.findById(7l));
		System.out.println(repository.findById(9l));
		
	}
	
	
}
