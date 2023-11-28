package com.learn.jpa.hibernate.learnJPAandHibernate.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JPACommandLineRunner implements CommandLineRunner {

	@Autowired 
	private CourseJPARepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		
		repository.insert(new Course(4,"Spring","Abdullah"));
		repository.insert(new Course(5,"AWS","ALI"));
		repository.insert(new Course(6,"Azure","Hamza"));
		repository.delete(5);
		
		System.out.println(repository.findById(4));
		System.out.println(repository.findById(6));
		
	}
	
	
}
