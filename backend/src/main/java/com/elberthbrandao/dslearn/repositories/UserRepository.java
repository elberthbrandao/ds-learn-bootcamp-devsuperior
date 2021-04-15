package com.elberthbrandao.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elberthbrandao.dslearn.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
