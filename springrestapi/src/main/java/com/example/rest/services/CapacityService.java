package com.example.rest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest.models.Capacity;
import com.example.rest.models.City;
import com.example.rest.repositories.CapacityRepo;

@Service
public class CapacityService {
	@Autowired
	CapacityRepo repo;
	
	public Iterable<Capacity>findAllCapacities()
	{
		return repo.findAll();
	}

	public Optional<Capacity> findCapacityById(long id)
	{
		return repo.findById(id);
	}

	public Capacity createCapacity(Capacity model)
	{
		return repo.save(model);
	}

	public void removeCapacity(long id)
	{
		repo.deleteById(id);
	}

}
