package com.example.jwt.service;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.jwt.entity.UserEntity;
import com.example.jwt.repository.UserRepo;

@Service
public class MyUserService implements UserDetailsService {

	@Autowired
	private UserRepo repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserEntity entity = this.repo.findByUsername(username);
		return new User(entity.getUsername(), entity.getPassword(), Collections.emptyList());
	}

	public boolean saveUser(UserEntity userEntity) {
		userEntity = repo.save(userEntity);
		return userEntity.getId() != null;
	}
	
	
}
