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
import com.example.rest.models.City;
import com.example.rest.models.Country;
import com.example.rest.models.Passenger;
import com.example.rest.models.Province;
import com.example.rest.models.Suburb;
import com.example.rest.services.CityService;
import com.example.rest.services.CountryService;
import com.example.rest.services.PassengerService;
import com.example.rest.services.ProvinceService;
import com.example.rest.services.SuburbService;

import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = { "http://localhost:4200" }, maxAge = 6000, allowCredentials = "false")
@RestController
public class PassengersController {

	@Autowired
	PassengerService service;
	@Autowired
	SuburbService sub;
	@Autowired
	CityService city;
	@Autowired
	ProvinceService prov;
	@Autowired
	CountryService country;

	@RequestMapping(value = "/passengers", method = RequestMethod.GET)
	@ApiOperation(value = "Retrieves a paged set of passengers", response = Passenger.class, produces = "application/json")
	public Page<Passenger> getPassengers(Pageable pageable) {
		Page page = service.findAllPassengers(pageable);
		return page;
	}

	@RequestMapping(value = "/passengers/{Id}", method = RequestMethod.GET)
	@ApiOperation(value = "Retrieves a specified passenger", response = Passenger.class, produces = "application/json")
	public Optional<Passenger> getPassenger(@PathVariable Long Id) {
		return service.findPassengerById(Id);
	}

	@RequestMapping(value = "/passengers", method = RequestMethod.POST)
	@ApiOperation(value = "Creates a specified passenger", response = Passenger.class, produces = "application/json")
	public void post(@RequestBody Passenger model) {
		Suburb suburb = sub.createSuburb(model.getSuburb());
		City cty = city.createCity(model.getSuburb().getCity());
		Province prv = prov.createProvince(model.getSuburb().getCity().getProvince());
		Country ctry = country.createCountry(model.getSuburb().getCity().getProvince().getCountry());
		model.suburb = suburb;
		model.suburb.city = cty;
		model.suburb.city.province = prv;
		model.suburb.city.province.country = ctry;
		service.createPassenger(model);
	}

	@RequestMapping(value = "/passengers/{Id}", method = RequestMethod.PUT)
	@ApiOperation(value = "Modifies a specified passenger", response = Passenger.class, produces = "application/json")
	public void put(@PathVariable Long Id, @RequestBody Passenger model) {
		service.createPassenger(model);
	}

	@RequestMapping(value = "/passengers/{Id}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Removes a specified passenger", response = Passenger.class, produces = "application/json")
	public void delete(@PathVariable Long Id) {
		service.removePassenger(Id);
	}
}
