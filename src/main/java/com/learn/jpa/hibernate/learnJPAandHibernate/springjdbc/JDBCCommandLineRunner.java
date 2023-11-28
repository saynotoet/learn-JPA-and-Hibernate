package com.learn.jpa.hibernate.learnJPAandHibernate.springjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JDBCCommandLineRunner implements CommandLineRunner {

	@Autowired 
	private CourseJDBCRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.insert();
		repository.insert(new Course(2,"AWS","ALI"));
		repository.insert(new Course(3,"Azure","Hamza"));
		repository.delete(2);
		
		System.out.println(repository.findById(1));
		System.out.println(repository.findById(3));
		
	}
	
	
}
