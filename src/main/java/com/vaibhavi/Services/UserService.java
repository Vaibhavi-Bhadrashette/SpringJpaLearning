package com.vaibhavi.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaibhavi.Model.Users;
import com.vaibhavi.Repository.UsersRepository;

@Service
public class UserService {

@Autowired
private UsersRepository userRepository;	

	public List<Users> getAllUsers() {
		return (List<Users>)userRepository.findAll();
	}

	public Optional<Users> getUserByIntegerId(Integer id) {
		return userRepository.findById(id);
	}
	

}
