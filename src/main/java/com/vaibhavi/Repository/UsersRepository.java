package com.vaibhavi.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.vaibhavi.Model.Users;


@Repository
public interface UsersRepository extends CrudRepository<Users, Integer>{

}
