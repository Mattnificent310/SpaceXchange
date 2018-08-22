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
import com.example.rest.models.Passenger;
import com.example.rest.services.PassengerService;
@CrossOrigin(origins = {"http://localhost:4200"}, maxAge = 6000, allowCredentials = "false")
@RestController
public class PassengersController {

	@Autowired
	PassengerService service;

	@RequestMapping(value = "/passengers", method = RequestMethod.GET)
	public Page<Passenger> getPassengers(Pageable pageable)
	{
		Page page = service.findAllPassengers(pageable);
		return page;
	}

	@RequestMapping(value = "/passengers/{Id}", method = RequestMethod.GET)
	public Optional<Passenger> getPassenger(@PathVariable Long Id)
	{
	  return service.findPassengerById(Id);
	}

	@RequestMapping(value = "/passengers", method = RequestMethod.POST)
	public void post(@RequestBody Passenger
			model)
	{
	   service.createPassenger(model);
	}

	@RequestMapping(value = "/passengers/{Id}", method = RequestMethod.PUT)
	public void put(@PathVariable Long Id, @RequestBody Passenger model)
	{
	  service.createPassenger(model);
	}

	@RequestMapping(value = "/passengers/{Id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Long Id)
	{
	  service.removePassenger(Id);
	}
}
