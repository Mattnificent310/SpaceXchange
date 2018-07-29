package com.example.rest.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.models.City;
import com.example.rest.models.Contract;
import com.example.rest.services.ContractService;

@RestController
public class ContractsController {

	@Autowired
	ContractService service;
	
	@RequestMapping(value = "/contracts", method = RequestMethod.GET)
	public Iterable<Contract> getContracts()
	{
	  return service.findAllContracts();
	}

	@RequestMapping(value = "/contract/{Id}", method = RequestMethod.GET)
	public Optional<Contract> getContract(@PathVariable Long Id)
	{
	  return service.findContractById(Id);
	}

	@RequestMapping(value = "/contracts", method = RequestMethod.POST)
	public void post(@RequestBody Contract model)
	{
	   service.createContract(model);
	}

	@RequestMapping(value = "/contracts/{Id}", method = RequestMethod.PUT)
	public void put(@PathVariable Long Id, @RequestBody Contract model)
	{
	  service.createContract(model);
	}

	@RequestMapping(value = "/contracts/{Id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Long Id)
	{
	  service.removeContract(Id);
	}
}
