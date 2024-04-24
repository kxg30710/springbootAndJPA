package com.in28minutes.springbootJpaWithRestAPI.SpringbootJpaWithRestAPI;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity // @Entity(name="different name for table")
public class Courses {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String author;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Courses [id=" + id + ", name=" + name + ", author=" + author + "]";
	}

	public Courses() {

	}

	public Courses(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

}
