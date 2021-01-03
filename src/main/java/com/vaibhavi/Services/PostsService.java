package com.vaibhavi.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaibhavi.Model.Posts;
import com.vaibhavi.Repository.PostsRepository;

@Service
public class PostsService {


@Autowired
private PostsRepository postsRepository;	

	public List<Posts> getAllPosts() {
		
		return (List<Posts>)postsRepository.findAll();
	}

	public Optional<Posts> getPostByIntegerId(Integer id) {
		return postsRepository.findById(id);
	}

}
