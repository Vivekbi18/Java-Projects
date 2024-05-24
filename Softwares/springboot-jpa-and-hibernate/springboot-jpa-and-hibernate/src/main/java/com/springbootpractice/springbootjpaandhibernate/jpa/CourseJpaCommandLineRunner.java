//package com.springbootpractice.springbootjpaandhibernate.jpa;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import com.springbootpractice.springbootjpaandhibernate.course.Course;
//import com.springbootpractice.springbootjpaandhibernate.jpa.CourseDetails;
//import com.springbootpractice.springbootjpaandhibernate.jpa.CourseJpaRepository;
//
//@Component
//public class CourseJpaCommandLineRunner implements CommandLineRunner{
//
//	
//	@Autowired
//	private CourseJpaRepository courseJpaRepository;
//	@Override
//	public void run(String... args) throws Exception {
//		 
//		//courseJdbcRepository.insert();
//		CourseDetails c1 = new CourseDetails(101, "Python", "Vivek by Jpa");
//		CourseDetails c2 = new CourseDetails(102, "Java", "Vivek by Jpa");
//		CourseDetails c3 = new CourseDetails(103, "C++", "Vivek by Jpa");
//		CourseDetails c4 = new CourseDetails(104, "C", "Vivek by Jpa");
//		
//		courseJpaRepository.insertByObject(c1);
//		courseJpaRepository.insertByObject(c2);
//		courseJpaRepository.insertByObject(c3);
//		courseJpaRepository.insertByObject(c4);
//		
//		System.out.println(courseJpaRepository.selectById(c1));
//		
//		courseJpaRepository.deleteById(c4);
//
//	}
//
//	
//}
