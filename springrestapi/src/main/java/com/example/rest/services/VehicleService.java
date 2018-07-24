package com.example.rest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest.models.Vehicle;
import com.example.rest.repositories.VehicleRepo;

@Service
public class VehicleService {
	@Autowired
	 VehicleRepo repo;
	 public Iterable <Vehicle>findAllVehicles()
		{
			return repo.findAll();
		}
		
		public Optional<Vehicle> findVehicleById(long id)
		{
			return repo.findById(id);
		}
		
		public void createVehicle(Vehicle model)
		{
			 repo.save(model);
		}
		
		public void removeVehicle(long id)
		{
			repo.deleteById(id);
		}
}