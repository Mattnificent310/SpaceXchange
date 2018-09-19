package com.example.rest.controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.rest.models.Tracking;
import com.example.rest.services.TrackingService;
import io.swagger.annotations.ApiOperation;
@CrossOrigin(origins = {"http://localhost:4200"}, maxAge = 6000, allowCredentials = "false")
@RestController
public class TrackingsController {

	@Autowired
	TrackingService service;

	@RequestMapping(value = "/trackings", method = RequestMethod.GET)
	@ApiOperation(value = "Retrieves a paged set of trackings", response = Tracking.class, produces = "application/json")
	public List<Tracking> getTrackings(Pageable pageable)
	{
		Page<Tracking> page = service.findAllTrackings(pageable);
		return page.getContent();
	}

	@RequestMapping(value = "/trackings/{Id}", method = RequestMethod.GET)
	@ApiOperation(value = "Retrieves a specified tracking", response = Tracking.class, produces = "application/json")
	public Optional<Tracking> getTracking(@PathVariable Long Id)
	{
	  return service.findTrackingById(Id);
	}

	@RequestMapping(value = "/trackings", method = RequestMethod.POST)
	@ApiOperation(value = "Creates a specified tracking", response = Tracking.class, produces = "application/json")
	public void post(@RequestBody Tracking model)
	{
	   service.createTracking(model);
	}

	@RequestMapping(value = "/trackings/{Id}", method = RequestMethod.PUT)
	@ApiOperation(value = "Modified a specified tracking", response = Tracking.class, produces = "application/json")
	public void put(@PathVariable Long Id, @RequestBody Tracking model)
	{
	  service.createTracking(model);
	}

	@RequestMapping(value = "/trackings/{Id}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Removes a specified tracking", response = Tracking.class, produces = "application/json")
	public void delete(@PathVariable Long Id)
	{
	  service.removeTracking(Id);
	}
}
