
package com.example.rest.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.models.Buyer;
import com.example.rest.models.Location;
import com.example.rest.models.Vehicle;
import com.example.rest.services.LocationService;
import com.example.rest.services.VehicleService;

@RestController
public class LocationsController {
	
@Autowired
LocationService service;

@RequestMapping(value = "/locations", method = RequestMethod.GET)
public Iterable<Location> getLocations()
{
  return service.findAllLocations();
}

@RequestMapping(value = "/locations/{Id}", method = RequestMethod.GET)
public Optional<Location> getLocation(@PathVariable Long Id)
{
  return service.findLocationById(Id);
}

@RequestMapping(value = "/locations", method = RequestMethod.POST)
public void post(@RequestBody Location model)
{
   service.createLocation(model);
}

@RequestMapping(value = "/locations/{Id}", method = RequestMethod.PUT)
public void put(@PathVariable Long Id, @RequestBody Location model)
{
  service.createLocation(model);
}

@RequestMapping(value = "/locations/{Id}", method = RequestMethod.DELETE)
public void delete(@PathVariable Long Id)
{
  service.removeLocation(Id);
}

}