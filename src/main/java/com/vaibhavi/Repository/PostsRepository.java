package com.vaibhavi.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.vaibhavi.Model.Posts;



@Repository
public interface PostsRepository extends CrudRepository<Posts, Integer> {

}
