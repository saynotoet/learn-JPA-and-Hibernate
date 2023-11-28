package com.learn.jpa.hibernate.learnJPAandHibernate.springjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJDBCRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static String INSERT_QUERY =

					"""
						insert into course (id, name, author)
						values(1,'Spring','Abdullah');
					""";

	public static String INSERT_QUERY_WITH_PARAMS =

					"""
						insert into course (id, name, author)
						values(?,?,?);
					""";

	public static String DELETE_QUERY =

					"""
						delete from course where id = ?;
					""";
	
	public static String SELECT_QUERY =

			"""
				select * from course where id = ?;
			""";
	public void insert() {
		jdbcTemplate.update(INSERT_QUERY);
	}
	
	public void insert(Course course) {
		jdbcTemplate.update(INSERT_QUERY_WITH_PARAMS,course.getId(),course.getName(),course.getAuthor());
	}
	
	public void delete(long id) {
		jdbcTemplate.update(DELETE_QUERY,id);
	}
	
	public Course findById(long id) {
		return (Course) jdbcTemplate.queryForObject(SELECT_QUERY,new BeanPropertyRowMapper(Course.class),id);
	}
}
