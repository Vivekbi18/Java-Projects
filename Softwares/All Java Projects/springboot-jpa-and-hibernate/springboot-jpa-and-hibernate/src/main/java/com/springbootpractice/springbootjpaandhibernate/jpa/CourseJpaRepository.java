package com.springbootpractice.springbootjpaandhibernate.jpa;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {

	@PersistenceContext // or we can use Autowired as well but @PersistenceContext is more specefic
	private EntityManager entityManager;
	
	public void insertByObject(CourseDetails courseDetails) {
		entityManager.merge(courseDetails);
	}
	
	public CourseDetails selectById(CourseDetails courseDetails) {
	return entityManager.find(CourseDetails.class, courseDetails.getId());
	}
	
	public void deleteById(CourseDetails courseDetails) {
		CourseDetails cd = entityManager.find(CourseDetails.class, courseDetails.getId());
		entityManager.remove(cd);
		}
	
}
