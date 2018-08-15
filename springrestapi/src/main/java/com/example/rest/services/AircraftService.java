package com.example.rest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest.models.Aircraft;
import com.example.rest.models.Buyer;
import com.example.rest.repositories.AircraftRepo;

@Service
public class AircraftService {
	
	@Autowired
	AircraftRepo repo;
	public Iterable <Aircraft>findAllAircrafts()
	{
		return repo.findAll();
	}
	
	public Optional<Aircraft> findAircraftById(long id)
	{
		return repo.findById(id);
	}
	
	public void createAircraft(Aircraft model)
	{
		 repo.save(model);
	}
	
	public void removeAircraft(long id)
	{
		repo.deleteById(id);
	}
}
