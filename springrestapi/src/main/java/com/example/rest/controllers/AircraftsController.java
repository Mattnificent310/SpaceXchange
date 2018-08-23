package com.example.rest.controllers;

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
import io.swagger.annotations.ApiOperation;
import com.example.rest.models.Aircraft;
import com.example.rest.models.Capacity;
import com.example.rest.models.Dimension;
import com.example.rest.services.AircraftService;
import com.example.rest.services.CapacityService;
import com.example.rest.services.DimensionService;

@CrossOrigin(origins = { "http://localhost:4200" }, maxAge = 6000, allowCredentials = "false")
@RestController
public class AircraftsController {

	@Autowired
	AircraftService service;
	@Autowired
	CapacityService cap;
	@Autowired
	DimensionService dim;

	@RequestMapping(value = "/aircrafts", method = RequestMethod.GET)
	@ApiOperation(value = "Retrieves a paged set of aircrafts", response = Aircraft.class, produces = "application/json")	
	public Page<Aircraft> getAircrafts(Pageable pageable) {
		Page page = service.findAllAircrafts(pageable);
		return page;
	}

	@RequestMapping(value = "/aircrafts/{Id}", method = RequestMethod.GET)
	@ApiOperation(value = "Retrieves a specified aircraft", response = Aircraft.class, produces = "application/json")
	public Optional<Aircraft> getAircraft(@PathVariable Long Id) {
		return service.findAircraftById(Id);
	}

	@RequestMapping(value = "/aircrafts", method = RequestMethod.POST)
	@ApiOperation(value = "Creates a specified aircraft", response = Aircraft.class, produces = "application/json")	
	public void post(@RequestBody Aircraft model) {

		Capacity capacity = cap.createCapacity(model.getCapacity());
		Dimension dimension = dim.createDimension(model.getDimension());
		model.setDimension(dimension);
		model.setCapacity(capacity);
		service.createAircraft(model);

	}

	@RequestMapping(value = "/aircrafts/{Id}", method = RequestMethod.PUT)
	@ApiOperation(value = "Modifies a specified aircraft", response = Aircraft.class, produces = "application/json")
	public void put(@PathVariable Long Id, @RequestBody Aircraft model) {
		service.createAircraft(model);
	}

	@RequestMapping(value = "/aircrafts/{Id}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Removes a specified aircraft", response = Aircraft.class, produces = "application/json")
	public void delete(@PathVariable Long Id) {
		service.removeAircraft(Id);
	}
}
