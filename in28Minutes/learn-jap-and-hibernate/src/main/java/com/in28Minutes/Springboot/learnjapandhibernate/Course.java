package com.in28Minutes.Springboot.learnjapandhibernate;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity // Mapping DB table with this class using entity
public class Course {
	@Id // represents id is the primary key
	private long id;
	@Column(name = "name") // String name is mapping to name in the course table. since
	private String name; //// variable name and column name are same no need to specify @column
	private String author;

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Course() {
	}

	public Course(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
}
