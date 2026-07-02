package com.job.service.impl;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.job.model.Users;
import com.job.payload.UserDetailsImp;
import com.job.repository.UserRepository;

@Service
public class UserDetailServiceImpl  implements UserDetailsService{
	
	@Autowired
	UserRepository userRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users users = userRepository.findByEmail(username);
		if (users==null) {
			throw new RuntimeErrorException(null,"User is not present in the database");
		}else {
				return new UserDetailsImp(users);
		}
	}

}
