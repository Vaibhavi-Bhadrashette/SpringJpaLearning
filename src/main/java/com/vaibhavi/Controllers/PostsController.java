package com.vaibhavi.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vaibhavi.Model.Posts;
import com.vaibhavi.Services.PostsService;

@RestController
@RequestMapping(value ="/Post")
public class PostsController {
	
	@Autowired
	private PostsService postService;
	
	@GetMapping
	public List<Posts> getAllUsers()
	{
		
		return postService.getAllPosts();
		
	}
	
	@GetMapping(value="/{id}")
	public Optional<Posts> getUserByIntegerId(@PathVariable Integer id)
	{
		
		return postService.getPostByIntegerId(id);
		
	}
	

}
