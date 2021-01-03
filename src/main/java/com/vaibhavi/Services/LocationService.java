package com.vaibhavi.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaibhavi.Model.Location;
import com.vaibhavi.Repository.LocationRepository;

@Service
public class LocationService {

    @Autowired
	private LocationRepository locationRepository;
	
	public List<Location> getAllLocation() {
		return (List<Location>) locationRepository.findAll();
		
	}

	public Optional<Location> getLocationrByIntegerId(Integer id) {
		 return locationRepository.findById(id);
	}

	public void addLocation(Location location) {
		 locationRepository.save(location);
		
	}

	public void deleteLocation(Integer id) {
	      locationRepository.deleteById(id);
	}
}
