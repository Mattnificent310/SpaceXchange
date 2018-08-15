package com.example.rest.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.models.Aircraft;
import com.example.rest.services.AircraftService;
@CrossOrigin(origins = {"http://localhost:4200"}, maxAge = 6000, allowCredentials = "false") 
@RestController
public class AircraftsController {

	@Autowired
	AircraftService service;
	
	@RequestMapping(value = "/aircrafts", method = RequestMethod.GET)
	public Iterable<Aircraft> getAircrafts()
	{
	  return service.findAllAircrafts();
	}
	
	@RequestMapping(value = "/aircrafts/{Id}", method = RequestMethod.GET)
	public Optional<Aircraft> getAircraft(@PathVariable Long Id)
	{
	  return service.findAircraftById(Id);
	}
	
	@RequestMapping(value = "/aircrafts", method = RequestMethod.POST)
	public void post(@RequestBody Aircraft model)
	{
	   service.createAircraft(model);
	}
	
	@RequestMapping(value = "/aircrafts/{Id}", method = RequestMethod.PUT)
	public void put(@PathVariable Long Id, @RequestBody Aircraft model)
	{
	  service.createAircraft(model);
	}
	
	@RequestMapping(value = "/aircrafts/{Id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Long Id)
	{
	  service.removeAircraft(Id);
	}
}
