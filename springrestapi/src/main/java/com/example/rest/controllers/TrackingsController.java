package com.example.rest.controllers;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.rest.models.Tracking;
import com.example.rest.services.TrackingService;
@CrossOrigin(origins = {"http://localhost:4200"}, maxAge = 6000, allowCredentials = "false") 
@RestController
public class TrackingsController {
	
	@Autowired
	TrackingService service;
	
	@RequestMapping(value = "/trackings", method = RequestMethod.GET)
	public Iterable<Tracking> getTrackings()
	{
	  return service.findAllTrackings();
	}
	
	@RequestMapping(value = "/trackings/{Id}", method = RequestMethod.GET)
	public Optional<Tracking> getTracking(@PathVariable Long Id)
	{
	  return service.findTrackingById(Id);
	}
	
	@RequestMapping(value = "/trackings", method = RequestMethod.POST)
	public void post(@RequestBody Tracking model)
	{
	   service.createTracking(model);
	}
	
	@RequestMapping(value = "/trackings/{Id}", method = RequestMethod.PUT)
	public void put(@PathVariable Long Id, @RequestBody Tracking model)
	{
	  service.createTracking(model);
	}
	
	@RequestMapping(value = "/trackings/{Id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Long Id)
	{
	  service.removeTracking(Id);
	}
}
