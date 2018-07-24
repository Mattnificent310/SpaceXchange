package com.example.rest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest.models.Location;
import com.example.rest.models.Supplier;
import com.example.rest.repositories.LocationRepo;
import com.example.rest.repositories.SupplierRepo;

@Service
public class LocationService {
	 @Autowired
	 LocationRepo repo;
	 public Iterable <Location>findAllLocations()
		{
			return repo.findAll();
		}
		
		public Optional<Location> findLocationById(long id)
		{
			return repo.findById(id);
		}
		
		public void createLocation(Location model)
		{
			 repo.save(model);
		}
		
		public void removeLocation(long id)
		{
			repo.deleteById(id);
		}
}
