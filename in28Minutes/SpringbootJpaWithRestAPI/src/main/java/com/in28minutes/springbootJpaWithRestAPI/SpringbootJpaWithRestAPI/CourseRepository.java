package com.in28minutes.springbootJpaWithRestAPI.SpringbootJpaWithRestAPI;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Courses, Long> {

}
