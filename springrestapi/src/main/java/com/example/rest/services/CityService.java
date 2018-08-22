package com.example.rest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.rest.models.City;
import com.example.rest.repositories.CityRepo;

@Service
public class CityService {
	 @Autowired
	 CityRepo repo;
	 public Page<City>findAllCities(Pageable pageable)
		{
			return repo.findAll(pageable);
		}

		public Optional<City> findCityById(long id)
		{
			return repo.findById(id);
		}

		public void createCity(City model)
		{
			 repo.save(model);
		}

		public void removeCity(long id)
		{
			repo.deleteById(id);
		}
}
