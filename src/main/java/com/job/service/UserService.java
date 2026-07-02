package com.job.service;

import com.job.dto.UserDto;

public interface UserService {
	
	public UserDto registerUser(UserDto userDto);
	public UserDto getUserById(Integer userId);
}
