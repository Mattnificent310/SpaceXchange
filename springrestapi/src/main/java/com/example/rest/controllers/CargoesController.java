
package com.example.rest.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.models.Cargo;
import com.example.rest.services.CargoService;
@CrossOrigin(origins = {"http://localhost:4200"}, maxAge = 6000, allowCredentials = "false") 
@RestController
public class CargoesController {

	@Autowired
	CargoService service;

	@RequestMapping(value = "/cargoes", method = RequestMethod.GET)
	public Iterable<Cargo> getCargoes() {
		return service.findAllCargoes();
	}

	@RequestMapping(value = "/cargoes/{Id}", method = RequestMethod.GET)
	public Optional<Cargo> getCargo(@PathVariable Long Id) {
		return service.findCargoById(Id);
	}

	@RequestMapping(value = "/cargoes", method = RequestMethod.POST)
	public void post(@RequestBody Cargo model) {
		service.createCargo(model);
	}

	@RequestMapping(value = "/cargoes/{Id}", method = RequestMethod.PUT)
	public void put(@PathVariable Long Id, @RequestBody Cargo model) {
		service.createCargo(model);
	}

	@RequestMapping(value = "/cargoes/{Id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Long Id) {
		service.removeCargo(Id);
	}

}