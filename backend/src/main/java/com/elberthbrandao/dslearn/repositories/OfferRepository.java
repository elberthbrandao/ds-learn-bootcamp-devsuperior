package com.elberthbrandao.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elberthbrandao.dslearn.entities.Reply;

public interface OfferRepository extends JpaRepository<Reply, Long>{

}
