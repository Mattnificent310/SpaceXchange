package com.example.rest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest.models.City;
import com.example.rest.models.Location;
import com.example.rest.models.Supplier;
import com.example.rest.repositories.CityRepo;
import com.example.rest.repositories.SupplierRepo;

@Service
public class CityService {
	 @Autowired
	 CityRepo repo;
	 public Iterable <City>findAllCities()
		{
			return repo.findAll();
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
