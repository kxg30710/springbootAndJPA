package com.in28Minutes.Springboot.learnjapandhibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;
	@Autowired
	Course course;

	private static String INSERT_QUERY = """
			insert into course (id, name, author) values (? , ? , ?); 			""";

	private static String DELETE_QUERY = """
			delete course where id = ?;			""";

	private static String SELECT_QUERY = """
			select * from course where id = ?; 			""";

	public void insert(Course course) {
		jdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
	}

	public void deleteByID(int id) {
		jdbcTemplate.update(DELETE_QUERY, id);
	}

	public Course findByID(long id) {
		return jdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
		// ResultSet -> Bean => Row mappers
	}
}
