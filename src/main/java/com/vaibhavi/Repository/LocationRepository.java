package com.vaibhavi.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vaibhavi.Model.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {
	
	

}
