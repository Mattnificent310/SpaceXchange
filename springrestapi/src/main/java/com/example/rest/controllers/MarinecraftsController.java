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
import com.example.rest.models.Capacity;
import com.example.rest.models.Dimension;
import com.example.rest.models.Marinecraft;
import com.example.rest.services.CapacityService;
import com.example.rest.services.DimensionService;
import com.example.rest.services.MarinecraftService;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = { "http://localhost:4200" }, maxAge = 6000, allowCredentials = "false")
@RestController
public class MarinecraftsController {

	@Autowired
	MarinecraftService service;
	@Autowired
	CapacityService cap;
	@Autowired
	DimensionService dim;

	@RequestMapping(value = "/marinecrafts", method = RequestMethod.GET)
	@ApiOperation(value = "Retrieves a paged set of marine crafts", response = Marinecraft.class, produces = "application/json")
	public Page<Marinecraft> getMarinecrafts(Pageable pageable) {
		Page page = service.findAllMarinecrafts(pageable);
		return page;
	}

	@RequestMapping(value = "/marinecrafts/{Id}", method = RequestMethod.GET)
	@ApiOperation(value = "Retrieves a specified marine craft", response = Marinecraft.class, produces = "application/json")
	public Optional<Marinecraft> getMarinecraft(@PathVariable Long Id) {
		return service.findMarinecraftById(Id);
	}

	@RequestMapping(value = "/marinecrafts", method = RequestMethod.POST)
	@ApiOperation(value = "Creates a specified marine craft", response = Marinecraft.class, produces = "application/json")
	public void post(@RequestBody Marinecraft model) {
		Capacity capacity = cap.createCapacity(model.getCapacity());
		Dimension dimension = dim.createDimension(model.getDimension());
		model.setDimension(dimension);
		model.setCapacity(capacity);
		service.createMarinecraft(model);
	}

	@RequestMapping(value = "/marinecrafts/{Id}", method = RequestMethod.PUT)
	@ApiOperation(value = "Modifies a specified marine craft", response = Marinecraft.class, produces = "application/json")
	public void put(@PathVariable Long Id, @RequestBody Marinecraft model) {
		service.createMarinecraft(model);
	}

	@RequestMapping(value = "/marinecrafts/{Id}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Removes a specified marine craft", response = Marinecraft.class, produces = "application/json")
	public void delete(@PathVariable Long Id) {
		service.removeMarinecraft(Id);
	}
}
