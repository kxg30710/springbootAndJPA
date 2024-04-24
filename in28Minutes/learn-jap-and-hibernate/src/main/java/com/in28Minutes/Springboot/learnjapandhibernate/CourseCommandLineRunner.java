package com.in28Minutes.Springboot.learnjapandhibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
	@Autowired
	private CourseSpringDataRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1, "Spring", "Kavitha")); // save is to insert and update
		repository.save(new Course(2, "Spring", "Kavitha"));
		repository.save(new Course(3, "Spring", "Kavitha"));
		repository.save(new Course(4, "Spring", "Kavitha"));

		repository.deleteById(1l);
		System.out.println(repository.findById(2l));
		System.out.println(repository.findAll());

		System.out.println(repository.findByAuthor("Kavitha"));
	}

}
