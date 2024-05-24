package com.springbootpractice.springbootjpaandhibernate.jpa.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.springbootpractice.springbootjpaandhibernate.course.Course;
import com.springbootpractice.springbootjpaandhibernate.jpa.CourseDetails;
import com.springbootpractice.springbootjpaandhibernate.jpa.CourseJpaRepository;

@Component
public class CourseSpringDataJpaCommandLineRunner implements CommandLineRunner{

	
	@Autowired
	private CourseSpringDataJpaRepository courseSpringDataJpaRepository;

	@Override
	public void run(String... args) throws Exception {
		 
		//courseJdbcRepository.insert();
		CourseDetails c1 = new CourseDetails(101, "Python", "Vivek by SpringDataJpa");
		CourseDetails c2 = new CourseDetails(102, "Java", "Vivek by SpringDataJpa");
		CourseDetails c3 = new CourseDetails(103, "C++", "Vivek by SpringDataJpa");
		CourseDetails c4 = new CourseDetails(104, "C", "Vivek by SpringDataJpa");
		CourseDetails c5 = new CourseDetails(105, "C", "Vivek by SpringDataJpa");
		CourseDetails c6 = new CourseDetails(106, "C", "Vivek by SpringDataJpa");
		
		courseSpringDataJpaRepository.save(c1);
		courseSpringDataJpaRepository.save(c2);
		courseSpringDataJpaRepository.save(c3);
		courseSpringDataJpaRepository.save(c4);
		courseSpringDataJpaRepository.save(c5);
		courseSpringDataJpaRepository.save(c6);
		
		courseSpringDataJpaRepository.deleteById(105l);
		courseSpringDataJpaRepository.count();
		System.out.println(courseSpringDataJpaRepository.findById((long)(c4.getId())));
		
		System.out.println(courseSpringDataJpaRepository.findByName(c2.getName()));
		
		
		System.out.println(courseSpringDataJpaRepository.findByAuthor(c6.getAuthor()));
	}
}