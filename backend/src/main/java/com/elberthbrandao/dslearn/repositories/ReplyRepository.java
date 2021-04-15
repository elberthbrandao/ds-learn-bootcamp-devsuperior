package com.elberthbrandao.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elberthbrandao.dslearn.entities.Offer;

public interface ReplyRepository extends JpaRepository<Offer, Long>{

}
