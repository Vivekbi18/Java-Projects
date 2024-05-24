package com.springboot.learnspringboot;

public class Course {

	private int id;
	private String course_name;
	private String author_name;
	public Course(int id, String course_name, String author_name) {
		super();
		this.id = id;
		this.course_name = course_name;
		this.author_name = author_name;
	}
	public int getId() {
		return id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public String getAuthor_name() {
		return author_name;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", course_name=" + course_name + ", author_name=" + author_name + "]";
	}
}
