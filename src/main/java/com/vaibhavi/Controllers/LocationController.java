package com.vaibhavi.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vaibhavi.Model.Location;
import com.vaibhavi.Model.Users;
import com.vaibhavi.Services.LocationService;

@RestController
@RequestMapping(value="/location")
public class LocationController {
	@Autowired
	private LocationService locationService;
	
	@GetMapping
	public List<Location> getAllUsers()
	{
		
		return locationService.getAllLocation();
	}
	
	@GetMapping(value="/{id}")
	public Optional<Location> getLocationByIntegerId(@PathVariable Integer id)
	{
		
		return locationService.getLocationrByIntegerId(id);
		
	}
	
	@GetMapping(value="/{id}/user")
	public List<Users> getUserByLocationId(@PathVariable Integer id)
	{
		Optional<Location> location=locationService.getLocationrByIntegerId(id);
		if(location.isPresent())
			return location.get().getUsers();
		return null;
		
	}
	
	@PostMapping
	public void addLocation(@RequestBody Location location)
	{
		locationService.addLocation(location);
	}
	
	//Update Location
	@PutMapping(value ="/{id}")
	public void updateLocation(@RequestBody Location location)
	{
		locationService.addLocation(location);
		
	}
	
	@DeleteMapping(value="/{id}")
	public void deleteLocation(@PathVariable Integer id)
	{
		locationService.deleteLocation(id);
	}
	

}
