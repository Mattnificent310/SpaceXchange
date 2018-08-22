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

import com.example.rest.models.Buyer;
import com.example.rest.services.BuyerService;
@CrossOrigin(origins = {"http://localhost:4200"}, maxAge = 6000, allowCredentials = "false")
@RestController
public class BuyersController {

	@Autowired
	BuyerService service;

	@RequestMapping(value = "/buyers", method = RequestMethod.GET)
	public Page<Buyer> getBuyers(Pageable pageable)
	{
		Page page = service.findAllBuyers(pageable);
		return page;
	}

	@RequestMapping(value = "/buyers/{Id}", method = RequestMethod.GET)
	public Optional<Buyer> getBuyer(@PathVariable Long Id)
	{
	  return service.findBuyerById(Id);
	}

	@RequestMapping(value = "/buyers", method = RequestMethod.POST)
	public void post(@RequestBody Buyer model)
	{
	   service.createBuyer(model);
	}

	@RequestMapping(value = "/buyers/{Id}", method = RequestMethod.PUT)
	public void put(@PathVariable Long Id, @RequestBody Buyer model)
	{
	  service.createBuyer(model);
	}

	@RequestMapping(value = "/buyers/{Id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Long Id)
	{
	  service.removeBuyer(Id);
	}


}
