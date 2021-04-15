package com.elberthbrandao.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elberthbrandao.dslearn.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
