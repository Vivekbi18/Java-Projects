//package com.springbootpractice.springbootjpaandhibernate.course.jdbc;
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
//public class CourseJdbcCommandLineRunner implements CommandLineRunner{
//
//	@Autowired
//	private CourseJdbcRepository courseJdbcRepository;
//	
//	@Override
//	public void run(String... args) throws Exception {
//		 
//		//courseJdbcRepository.insert();
//		Course c1 = new Course(101, "Python", "Vivek");
//		Course c2 = new Course(102, "Java", "Vivek");
//		Course c3 = new Course(103, "C++", "Vivek");
//		Course c4 = new Course(104, "C", "Vivek");
//		
//		
//		courseJdbcRepository.insertByObject(c1);
//		courseJdbcRepository.insertByObject(c2);
//		courseJdbcRepository.insertByObject(c3);
//		courseJdbcRepository.insertByObject(c4);
//		
//		//System.out.println(courseJdbcRepository.selectById(101));
//				
//	}
//
//	
//}
