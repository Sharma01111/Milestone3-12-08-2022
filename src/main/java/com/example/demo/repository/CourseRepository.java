package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.course.Course;

public interface CourseRepository extends CrudRepository<Course,Integer>{
	

}
