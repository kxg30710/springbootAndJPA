package com.in28minutes.springbootJpaWithRestAPI.SpringbootJpaWithRestAPI;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@Autowired
	private CourseRepository courseRepository;

	@GetMapping("/courses")
	public List<Courses> getAllCourses() {
		return courseRepository.findAll();
	}

	@GetMapping("/courses/{id}")
	public Courses getCourseDetails(@PathVariable long id) {
		Optional<Courses> course = courseRepository.findById(id);
		if (course.isEmpty()) {
			throw new RuntimeException("The given id is not available" + id);
		}
		return course.get();
	}

	// POST - Create a new resource (/courses)
	@PostMapping("/courses")
	public void createCourse(@RequestBody Courses course) {
		courseRepository.save(course);
	}

	// PUT - update/Replace a resource (/courses/1)
	@PutMapping("/courses/{id}")
	public void updateCourse(@PathVariable long id, @RequestBody Courses course) {
		courseRepository.save(course);
	}

	// Delete - delete a resource
	@DeleteMapping("/courses/{id}")
	public void deleteCourseById(@PathVariable long id) {
		courseRepository.deleteById(id);
	}
}
