package com.Vinith.BlogApp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Vinith.BlogApp.models.Location;
import com.Vinith.BlogApp.repositories.LocationRepository;

@Service
public class LocationService {

	@Autowired
	LocationRepository locationRepository;

	public List<Location> getAllLocations() {
		return locationRepository.findAll();
	}

	public Optional<Location> getLocationById(Integer id) {
		return locationRepository.findById(id);
	}

}
