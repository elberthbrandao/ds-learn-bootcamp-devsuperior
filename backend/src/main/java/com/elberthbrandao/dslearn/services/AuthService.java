package com.elberthbrandao.dslearn.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.elberthbrandao.dslearn.entities.User;
import com.elberthbrandao.dslearn.repositories.UserRepository;
import com.elberthbrandao.dslearn.services.exceptions.ForbiddenException;
import com.elberthbrandao.dslearn.services.exceptions.UnauthorizedException;

@Service
public class AuthService {

	@Autowired
	UserRepository repository;

	@Transactional(readOnly = true)
	public User authenticated() {
		try {
			String userName = SecurityContextHolder.getContext().getAuthentication().getName();
			return repository.findByEmail(userName);
		} catch (Exception e) {
			throw new UnauthorizedException("Invalid user");
		}
	}
	
	public void validateSelfOrAdmin(Long userId) {
		User user = authenticated();
		if(!user.getId().equals(userId) && !user.hasHole("ROLE_ADMIN")) {
			throw new ForbiddenException("Access denied");
		}
	}
}
