
package com.example.rest.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.models.Buyer;
import com.example.rest.models.Vehicle;
import com.example.rest.services.VehicleService;
@CrossOrigin(origins = {"http://localhost:4200"}, maxAge = 6000, allowCredentials = "false") 
@RestController
public class VehiclesController {
@Autowired
VehicleService service;
@RequestMapping(value = "/vehicles", method = RequestMethod.GET)
public Iterable<Vehicle> getVehicles()
{
  return service.findAllVehicles();
}

@RequestMapping(value = "/vehicles/{Id}", method = RequestMethod.GET)
public Optional<Vehicle> getVehicle(@PathVariable Long Id)
{
  return service.findVehicleById(Id);
}

@RequestMapping(value = "/vehicles", method = RequestMethod.POST)
public void post(@RequestBody Vehicle model)
{
   service.createVehicle(model);
}

@RequestMapping(value = "/vehicles/{Id}", method = RequestMethod.PUT)
public void put(@PathVariable Long Id, @RequestBody Vehicle model)
{
  service.createVehicle(model);
}

@RequestMapping(value = "/vehicles/{Id}", method = RequestMethod.DELETE)
public void delete(@PathVariable Long Id)
{
  service.removeVehicle(Id);
}

}