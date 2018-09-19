
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
import com.example.rest.models.Capacity;
import com.example.rest.models.Dimension;
import com.example.rest.models.Vehicle;
import com.example.rest.services.CapacityService;
import com.example.rest.services.DimensionService;
import com.example.rest.services.VehicleService;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = { "http://localhost:4200" }, maxAge = 6000, allowCredentials = "false")
@RestController
public class VehiclesController {
	@Autowired
	VehicleService service;
	@Autowired
	CapacityService cap;
	@Autowired
	DimensionService dim;

	@RequestMapping(value = "/vehicles", method = RequestMethod.GET)
	@ApiOperation(value = "Retrieves a paged set of vehicles", response = Vehicle.class, produces = "application/json")
	public List<Vehicle> getVehicles(Pageable pageable) {
		Page<Vehicle> page = service.findAllVehicles(pageable);
		return page.getContent();
	}

	@RequestMapping(value = "/vehicles/{Id}", method = RequestMethod.GET)
	@ApiOperation(value = "Retrieves a specified vehicle", response = Vehicle.class, produces = "application/json")
	public Optional<Vehicle> getVehicle(@PathVariable Long Id) {
		return service.findVehicleById(Id);
	}

	@RequestMapping(value = "/vehicles", method = RequestMethod.POST)
	@ApiOperation(value = "Creates a specified vehicle", response = Vehicle.class, produces = "application/json")
	public void post(@RequestBody Vehicle model) {
		Capacity capacity = cap.createCapacity(model.getCapacity());
		Dimension dimension = dim.createDimension(model.getDimension());
		model.setDimension(dimension);
		model.setCapacity(capacity);
		service.createVehicle(model);
	}

	@RequestMapping(value = "/vehicles/{Id}", method = RequestMethod.PUT)
	@ApiOperation(value = "Modifies a specified vehicle", response = Vehicle.class, produces = "application/json")
	public void put(@PathVariable Long Id, @RequestBody Vehicle model) {
		service.createVehicle(model);
	}

	@RequestMapping(value = "/vehicles/{Id}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Removes a specified vehicle", response = Vehicle.class, produces = "application/json")
	public void delete(@PathVariable Long Id) {
		service.removeVehicle(Id);
	}

}