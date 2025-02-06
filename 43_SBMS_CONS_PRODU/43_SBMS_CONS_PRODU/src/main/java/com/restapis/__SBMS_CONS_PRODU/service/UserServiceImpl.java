package com.restapis.__SBMS_CONS_PRODU.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapis.__SBMS_CONS_PRODU.controller.UserRepository;
import com.restapis.__SBMS_CONS_PRODU.dto.UserRequest;
import com.restapis.__SBMS_CONS_PRODU.entities.User;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserRepository repository;

	@Override
	public boolean saveUser(UserRequest request) {
		User user = new User();
		BeanUtils.copyProperties(request, user);
		User save = repository.save(user);
		if (save != null)
			return true;
		return false;
	}

	@Override
	public boolean updateUser(UserRequest request) {
		User user = new User();
		BeanUtils.copyProperties(request, user);
		User save = repository.save(user);
		if (save != null)
			return true;
		return false;
	}

	@Override
	public List<UserRequest> getAllUser() {
		List<UserRequest> requests = new ArrayList<>();
		List<User> findAll = repository.findAll();
		for (User user : findAll) {
			UserRequest request = new UserRequest();
			BeanUtils.copyProperties(user, request);
			requests.add(request);
		}
		return requests;
	}

	@Override
	public UserRequest getUserById(Integer id) {
		Optional<User> findById = this.repository.findById(id);
		if (findById.isPresent()) {
			UserRequest request = new UserRequest();
			BeanUtils.copyProperties(findById.get(), request);
			return request;
		}
		return null;
	}

	@Override
	public boolean deleteUserById(Integer id) {
		this.repository.deleteById(id);
		return true;
	}

}
