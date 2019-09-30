package com.Vinith.BlogApp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Vinith.BlogApp.models.Location;
import com.Vinith.BlogApp.services.LocationService;

@RestController
public class LocationController {

	@Autowired
	LocationService locationService;

	@GetMapping("/locations")
	public List<Location> getAllLocations() {
		return locationService.getAllLocations();
	}
	
	@GetMapping("/location/{id}")
	public Optional<Location> getLocationByID(@PathVariable("id") Integer id) {
		return locationService.getLocationById(id);
	}
}
