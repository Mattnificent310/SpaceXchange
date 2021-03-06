package com.example.rest.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.models.Supplier;
import com.example.rest.services.SupplierService;

@RestController
public class SuppliersController {

	@Autowired
	SupplierService service;

	@RequestMapping(value = "/suppliers", method = RequestMethod.GET)
	public Iterable<Supplier> getTrackings()
	{
	  return service.findAllSuppliers();
	}
	
	@RequestMapping(value = "/suppliers/{Id}", method = RequestMethod.GET)
	public Optional<Supplier> getSupplier(@PathVariable Long Id)
	{
	  return service.findSupplierById(Id);
	}
	
	@RequestMapping(value = "/suppliers", method = RequestMethod.POST)
	public void post(@RequestBody Supplier model)
	{
	   service.createSupplier(model);
	}
	
	@RequestMapping(value = "/suppliers/{Id}", method = RequestMethod.PUT)
	public void put(@PathVariable Long Id, @RequestBody Supplier model)
	{
	  service.createSupplier(model);
	}
	
	@RequestMapping(value = "/suppliers/{Id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Long Id)
	{
	  service.removeSupplier(Id);
	}
}
