package com.job.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.job.dto.UserDto;
import com.job.model.Users;
import com.job.repository.UserRepository;
import com.job.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private	UserRepository userRepository;
	@Autowired
	private	ModelMapper modelMapper;
	@Autowired
	private	PasswordEncoder encoder;
	
	@Override
	public UserDto registerUser(UserDto userDto) {
		userDto.setPassword(encoder.encode(userDto.getPassword()));
		Users users = modelMapper.map(userDto, Users.class);
		Users savedUser = userRepository.save(users);
		return modelMapper.map(savedUser, UserDto.class);
	}

	@Override
	public UserDto getUserById(Integer userId) {
		Users users  = userRepository.findById(userId).orElse(null);
		return modelMapper.map(users, UserDto.class);
	}
}
