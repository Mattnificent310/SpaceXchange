package com.example.rest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest.models.Buyer;
import com.example.rest.models.Supplier;
import com.example.rest.repositories.SupplierRepo;

@Service
public class SupplierService {

	 @Autowired
	 SupplierRepo repo;
	 public Iterable <Supplier>findAllSuppliers()
		{
			return repo.findAll();
		}
		
		public Optional<Supplier> findSupplierById(long id)
		{
			return repo.findById(id);
		}
		
		public void createSupplier(Supplier model)
		{
			 repo.save(model);
		}
		
		public void removeSupplier(long id)
		{
			repo.deleteById(id);
		}
}
