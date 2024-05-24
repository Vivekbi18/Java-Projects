package com.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course(1,"java","vivek"),
				new Course(2,"c","dheeraj"),
				new Course(3,"c++","yash"),
				new Course(4,"python","laxman")
				
				);
				
	}
}
