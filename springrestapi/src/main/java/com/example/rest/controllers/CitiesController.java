
package com.example.rest.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.models.Buyer;
import com.example.rest.models.City;
import com.example.rest.models.Location;
import com.example.rest.models.Vehicle;
import com.example.rest.services.CityService;
import com.example.rest.services.VehicleService;

@RestController
public class CitiesController {
	
@Autowired
CityService service;

@RequestMapping(value = "/cities", method = RequestMethod.GET)
public Iterable<City> getLocations()
{
  return service.findAllCities();
}

@RequestMapping(value = "/cities/{Id}", method = RequestMethod.GET)
public Optional<City> getLocation(@PathVariable Long Id)
{
  return service.findCityById(Id);
}

@RequestMapping(value = "/cities", method = RequestMethod.POST)
public void post(@RequestBody City model)
{
   service.createCity(model);
}

@RequestMapping(value = "/cities/{Id}", method = RequestMethod.PUT)
public void put(@PathVariable Long Id, @RequestBody City model)
{
  service.createCity(model);
}

@RequestMapping(value = "/locations/{Id}", method = RequestMethod.DELETE)
public void delete(@PathVariable Long Id)
{
  service.removeCity(Id);
}

}