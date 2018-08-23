package com.example.rest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.rest.models.City;
import com.example.rest.repositories.CityRepo;

@Service
public class CityService {
@Autowired
CityRepo repo;
public Iterable<City>findAllCities()
{
	return repo.findAll();
}

public Optional<City> findCityById(long id)
{
	return repo.findById(id);
}

public City createCity(City model)
{
	return repo.save(model);
}

public void removeCity(long id)
{
	repo.deleteById(id);
}
}
