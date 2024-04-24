package com.in28Minutes.Springboot.learnjapandhibernate;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataRepository extends JpaRepository<Course, Long> {
	List<Course> findByAuthor(String author);
}
