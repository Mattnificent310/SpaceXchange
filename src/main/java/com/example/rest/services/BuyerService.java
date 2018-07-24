package com.example.rest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest.models.Buyer;
import com.example.rest.repositories.BuyerRepo;

@Service
public class BuyerService {

	@Autowired
	BuyerRepo repo;
	
	public Iterable <Buyer>findAllBuyers()
	{
		return repo.findAll();
	}
	
	public Optional<Buyer> findBuyerById(long id)
	{
		return repo.findById(id);
	}
	
	public void createBuyer(Buyer model)
	{
		 repo.save(model);
	}
	
	public void removeBuyer(long id)
	{
		repo.deleteById(id);
	}
}
