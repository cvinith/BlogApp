package com.Vinith.BlogApp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Vinith.BlogApp.models.Location;
import com.Vinith.BlogApp.models.User;
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

	@GetMapping("/location/{id}/users")
	public List<User> getUsersByLocationId(@PathVariable("id") Integer id) {
		Optional<Location> location = locationService.getLocationById(id);
		if (location.isPresent())
			return location.get().getUsers();
		return null;
	}

	@PostMapping("/location")
	public void addLocation(@RequestBody Location location) {
		locationService.addLocation(location);
	}

	@PutMapping("/location/{id}")
	public void updateLocation(@RequestBody Location location) {
		locationService.addLocation(location);
	}

	@DeleteMapping("/location/{id}")
	public void deleteLocationById(@PathVariable("id") Integer id) {
		locationService.deleteLocationById(id);
	}

}
