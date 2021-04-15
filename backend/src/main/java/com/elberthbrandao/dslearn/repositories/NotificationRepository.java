package com.elberthbrandao.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elberthbrandao.dslearn.entities.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long>{

}
