package com.springbootpractice.springbootjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springbootpractice.springbootjpaandhibernate.course.Course;



@Repository
public class CourseJdbcRepository {

	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
//	String INSERT_QUERY = """
//			insert into course values(10,'Java','Vivek')
//			
//			""";
	
//	public void insert() {
//	springJdbcTemplate.update(INSERT_QUERY);
//}
    String INSERT_QUERY = """
			
			insert into course(id,name,author) values(?,?,?)
			
			""";
    
    String DELETE_QUERY = """
			
		    delete from course where id = ?
			
			""";
    
 String SELECT_QUERY = """
			
		    select * from course where id = ?
			
			""";

	public void insertByObject(Course course) {
		springJdbcTemplate.update(INSERT_QUERY,course.getId(),course.getName(),course.getAuthor());
	}
	
	public void deleteById(Course course) {
		springJdbcTemplate.update(DELETE_QUERY,course.getId());
		
	}
	
//	public Course selectById(long id){
//		return (Course) springJdbcTemplate.queryForList(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class));	
//		
//}
}
