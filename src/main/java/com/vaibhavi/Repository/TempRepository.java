package com.vaibhavi.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.vaibhavi.Model.Location;
import com.vaibhavi.Model.Temp;

@org.springframework.stereotype.Repository
public interface TempRepository extends Repository<Temp, Integer> {

	Optional<Temp> findById(Integer id);
	Temp save(Temp entity);
	
	// Method 1:-Query method created using Query name Strategy
	public List<Temp> findByIdAndName(Integer id,String name);
	
	//Database Queries With the @Query Annotation
	@Query(value="Select * from Temp_table WHERE Id=:searchTerm", nativeQuery = true)
	public List<Temp> findByIdusingQuery(@Param("searchTerm") Integer Id);
	
	
	// calling named query created through annotation
	public List<Temp> findUsingAnnotatinNamedQuery(@Param("id") Integer id );
}