package com.vaibhavi.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vaibhavi.Model.Posts;
import com.vaibhavi.Model.Users;
import com.vaibhavi.Services.UserService;

@RestController
@RequestMapping(value="/user")
public class UsersController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public List<Users> getAllUsers()
	{
		
		return userService.getAllUsers();
		
	}
	
	@GetMapping(value="/{id}")
	public Optional<Users> getUserByIntegerId(@PathVariable Integer id)
	{
		
		return userService.getUserByIntegerId(id);
		
	}
	
	@GetMapping(value="/{id}/post")
	public List<Posts> getPostsByUserId(@PathVariable Integer id)
	{
		Optional<Users> user = userService.getUserByIntegerId(id);
		if(user.isPresent())
		  return user.get().getPosts();
		return null;
	}

}
