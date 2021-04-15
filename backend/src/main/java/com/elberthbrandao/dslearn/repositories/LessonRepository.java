package com.elberthbrandao.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elberthbrandao.dslearn.entities.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Long>{

}
