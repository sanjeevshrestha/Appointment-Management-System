package com.cs4.appointmentManagement.service;

import java.util.List;

import com.cs4.appointmentManagement.domain.Authority;
import com.cs4.appointmentManagement.domain.UserCredentials;

public interface UserCredentialsService {
	void save(UserCredentials userCredentials);

	void delete(Long id);

	UserCredentials findOne(Long id);

	UserCredentials update(UserCredentials userCredentials);

	List<UserCredentials> findAll();

	public UserCredentials findByUsername(String username);
	
	public List<Authority> getAllAuthorities();
}
