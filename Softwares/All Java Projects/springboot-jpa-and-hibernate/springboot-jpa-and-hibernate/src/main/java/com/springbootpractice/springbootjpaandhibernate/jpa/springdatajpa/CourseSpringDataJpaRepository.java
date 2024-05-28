package com.springbootpractice.springbootjpaandhibernate.jpa.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootpractice.springbootjpaandhibernate.jpa.CourseDetails;

public interface CourseSpringDataJpaRepository extends JpaRepository<CourseDetails, Long>{
 
	List<CourseDetails> findByAuthor(String author);
	
	List<CourseDetails> findByName(String name);
}
