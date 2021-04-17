package com.elberthbrandao.dslearn.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.elberthbrandao.dslearn.dto.NotificationDTO;
import com.elberthbrandao.dslearn.entities.Notification;
import com.elberthbrandao.dslearn.entities.User;
import com.elberthbrandao.dslearn.repositories.NotificationRepository;

@Service
public class NotificationService {

	@Autowired
	private NotificationRepository repository;
	
	@Autowired
	private AuthService authService;
	
	public Page<NotificationDTO> notificationForCurrentUser(Boolean unreadOnly, Pageable pageable) {
		User user = authService.authenticated();
		Page<Notification> page = repository.find(user, unreadOnly, pageable);
		return page.map(notification -> new NotificationDTO(notification));
	}
}
