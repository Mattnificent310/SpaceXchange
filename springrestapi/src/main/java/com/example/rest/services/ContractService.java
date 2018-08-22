package com.example.rest.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.example.rest.models.Contract;
import com.example.rest.repositories.ContractRepo;

@Service
public class ContractService {
	@Autowired
	ContractRepo repo;
	public Page<Contract>findAllContracts(Pageable pageable)
	{
		return repo.findAll(pageable);
	}

	public Optional<Contract> findContractById(long id)
	{
		return repo.findById(id);
	}

	public void createContract(Contract model)
	{
		 repo.save(model);
	}

	public void removeContract(long id)
	{
		repo.deleteById(id);
	}
}
