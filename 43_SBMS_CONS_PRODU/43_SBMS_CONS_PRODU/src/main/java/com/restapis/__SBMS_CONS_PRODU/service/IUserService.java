package com.restapis.__SBMS_CONS_PRODU.service;

import java.util.List;

import com.restapis.__SBMS_CONS_PRODU.dto.UserRequest;

public interface IUserService {

	public boolean saveUser(UserRequest request);

	public boolean updateUser(UserRequest request);

	public List<UserRequest> getAllUser();

	public UserRequest getUserById(Integer id);

	public boolean deleteUserById(Integer id);
}
