package com.example.rest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.rest.models.Marinecraft;
import com.example.rest.repositories.MarinecraftRepo;



@Service
public class MarinecraftService {
	@Autowired
	MarinecraftRepo repo;

	public Page<Marinecraft>findAllMarinecrafts(Pageable pageable)
	{
		return repo.findAll(pageable);
	}

	public Optional<Marinecraft> findMarinecraftById(long id)
	{
		return repo.findById(id);
	}

	public void createMarinecraft(Marinecraft model)
	{
		 repo.save(model);
	}

	public void removeMarinecraft(long id)
	{
		repo.deleteById(id);
	}
}
