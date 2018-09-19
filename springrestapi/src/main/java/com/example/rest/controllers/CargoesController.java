
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
import com.example.rest.models.Cargo;
import com.example.rest.services.CargoService;

import io.swagger.annotations.ApiOperation;
@CrossOrigin(origins = {"http://localhost:4200"}, maxAge = 6000, allowCredentials = "false")
@RestController
public class CargoesController {

	@Autowired
	CargoService service;

	@RequestMapping(value = "/cargoes", method = RequestMethod.GET)
	@ApiOperation(value = "Retrieves a paged set of cargoes", response = Cargo.class, produces = "application/json")
	public List<Cargo> getCargoes(Pageable pageable) {
		Page<Cargo> page = service.findAllCargoes(pageable);
		return page.getContent();
	}

	@RequestMapping(value = "/cargoes/{Id}", method = RequestMethod.GET)
	@ApiOperation(value = "Retrieves a specified cargo", response = Cargo.class, produces = "application/json")
	public Optional<Cargo> getCargo(@PathVariable Long Id) {
		return service.findCargoById(Id);
	}

	@RequestMapping(value = "/cargoes", method = RequestMethod.POST)
	@ApiOperation(value = "Creates a specified cargo", response = Cargo.class, produces = "application/json")
	public void post(@RequestBody Cargo model) {
		service.createCargo(model);
	}

	@RequestMapping(value = "/cargoes/{Id}", method = RequestMethod.PUT)
	@ApiOperation(value = "Modifies a specified cargo", response = Cargo.class, produces = "application/json")
	public void put(@PathVariable Long Id, @RequestBody Cargo model) {
		service.createCargo(model);
	}

	@RequestMapping(value = "/cargoes/{Id}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Removes a specified cargo", response = Cargo.class, produces = "application/json")
	public void delete(@PathVariable Long Id) {
		service.removeCargo(Id);
	}

}