package com.cs4.appointmentManagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cs4.appointmentManagement.dao.UserDao;
import com.cs4.appointmentManagement.domain.Authority;
import com.cs4.appointmentManagement.domain.Doctor;
import com.cs4.appointmentManagement.domain.Patient;
import com.cs4.appointmentManagement.domain.User;
import com.cs4.appointmentManagement.domain.UserCredentials;
import com.cs4.appointmentManagement.service.EncryptService;
import com.cs4.appointmentManagement.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private EncryptService encryptService;
	
	@Override
	public User findByUsername(String username) {
		return userDao.findByUsername(username);
	}


	@Override
	@Transactional
	public void save(User user) {
		User userToSave = null;
		String role="";
		if(user.getUserType().equalsIgnoreCase("DOCTOR")) {			
			Doctor tempUser = new Doctor(user);
			tempUser.setFirstName(user.getFname());
			tempUser.setLastName(user.getLname());
			role = "ROLE_DOCTOR";
			
			userToSave = tempUser;
		} else if(user.getUserType().equalsIgnoreCase("PATIENT")) {
			Patient tempUser = new Patient(user);
			tempUser.setFirstName(user.getFname());
			tempUser.setLastName(user.getLname());
			role="ROLE_PATIENT";
			
			userToSave = tempUser;
		}
		
		userDao.save(createUserStub(userToSave, role));
	}


	@Override
	public List<User> search(String name) {
		return (List<User>) userDao.search(name);
	}


	
	
	private User createUserStub(User user, String role) {
		UserCredentials userCredentials = new UserCredentials();
		userCredentials.setEnabled(true);
		userCredentials.setUser(user);
		userCredentials.setUserName(user.getEmail());
		userCredentials.setPassword(encryptService.encrypt(user.getUserCredentials().getPassword()));
		userCredentials.setVerifyPassword(encryptService.encrypt(user.getUserCredentials().getVerifyPassword()));
		
		List<Authority> auths = new ArrayList<>();
		auths.add(new Authority(user.getEmail(), role));
		
		userCredentials.setAuthority(auths);
		
		user.setUserCredentials(userCredentials);
		
		return user;
	}


	@Override
	public Long findUserID(String username) {
		System.out.println("UService Impl: "+username);
		return  (Long)userDao.findUserID(username);
	}
	
	@Override
		public User findUserByID(Long id) {
			
			return (User) userDao.findUserByID(id);
		}
	
}
