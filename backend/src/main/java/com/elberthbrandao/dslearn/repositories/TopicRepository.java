package com.elberthbrandao.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elberthbrandao.dslearn.entities.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long>{

}
