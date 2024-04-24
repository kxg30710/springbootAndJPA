package com.in28Minutes.Springboot.learnjapandhibernate;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {

	@PersistenceContext // @Autowired will also work
	private EntityManager entityManager;

	public void insert(Course course) {
		entityManager.merge(course); // merge is for inserting rows in a table
	}

	public Course findByID(long id) {
		return entityManager.find(Course.class, id);
	}

	public void deleteById(long id) {
		Course course = findByID(id);
		entityManager.remove(course);
	}

}
