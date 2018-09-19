package com.example.rest.controllers;

import java.util.Optional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.rest.models.Contract;
import com.example.rest.services.ContractService;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = {"http://localhost:4200"}, maxAge = 6000, allowCredentials = "false")


@RestController
public class ContractsController {

	@Autowired
	ContractService service;

	@RequestMapping(value = "/contracts", method = RequestMethod.GET)
	@ApiOperation(value = "Retrieves a paged set of contracts", response = Contract.class, produces = "application/json")
	public List<Contract> getContracts(Pageable pageable)
	{
		Page<Contract> page = service.findAllContracts(pageable);
		return page.getContent();
	}

	@RequestMapping(value = "/contract/{Id}", method = RequestMethod.GET)
	@ApiOperation(value = "Retrieves a specified contract", response = Contract.class, produces = "application/json")
	public Optional<Contract> getContract(@PathVariable Long Id)
	{
	  return service.findContractById(Id);
	}

	@RequestMapping(value = "/contracts", method = RequestMethod.POST)
	@ApiOperation(value = "Creates a specified contract", response = Contract.class, produces = "application/json")
	public void post(@RequestBody Contract model)
	{
	   service.createContract(model);
	}

	@RequestMapping(value = "/contracts/{Id}", method = RequestMethod.PUT)
	@ApiOperation(value = "Modifies a specified contract", response = Contract.class, produces = "application/json")
	public void put(@PathVariable Long Id, @RequestBody Contract model)
	{
	  service.createContract(model);
	}

	@RequestMapping(value = "/contracts/{Id}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Removes a specified contract", response = Contract.class, produces = "application/json")
	public void delete(@PathVariable Long Id)
	{
	  service.removeContract(Id);
	}
}
