package com.example.rest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest.models.City;
import com.example.rest.models.Dimension;
import com.example.rest.repositories.DimensionRepo;

@Service
public class DimensionService {
@Autowired
DimensionRepo repo;

public Iterable<Dimension>findAllDimensions()
{
	return repo.findAll();
}

public Optional<Dimension> findDimensionById(long id)
{
	return repo.findById(id);
}

public Dimension createDimension(Dimension model)
{
	return repo.save(model);
}

public void removeDimension(long id)
{
	repo.deleteById(id);
}
}
