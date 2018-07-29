package com.example.rest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest.models.Cargo;
import com.example.rest.repositories.CargoRepo;
@Service
public class CargoService {
	@Autowired
	 CargoRepo repo;
	 public Iterable <Cargo>findAllCargoes()
		{
			return repo.findAll();
		}
		
		public Optional<Cargo> findCargoById(long id)
		{
			return repo.findById(id);
		}
		
		public void createCargo(Cargo model)
		{
			 repo.save(model);
		}
		
		public void removeCargo(long id)
		{
			repo.deleteById(id);
		}
}
