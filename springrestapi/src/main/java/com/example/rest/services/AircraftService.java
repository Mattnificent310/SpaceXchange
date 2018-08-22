package com.example.rest.services;

import java.util.Optional;

import com.example.rest.models.Aircraft;
import com.example.rest.repositories.AircraftRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class AircraftService {

	@Autowired
	AircraftRepo repo;
	public Page<Aircraft>findAllAircrafts(Pageable pageable)
	{
		return repo.findAll(pageable);
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
