package com.springbootpractice.springbootjpaandhibernate.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="Course")
public class CourseDetails {

	@Id
	private int id;
	private String name;
	private String author;
	
	
	public CourseDetails() {
		
	}
	
	public CourseDetails(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
}
