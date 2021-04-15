package com.elberthbrandao.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elberthbrandao.dslearn.entities.Resource;

public interface ResourceRepository extends JpaRepository<Resource, Long>{

}
