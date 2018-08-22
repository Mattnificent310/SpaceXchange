package com.example.rest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.rest.models.City;
import com.example.rest.models.Suburb;
import com.example.rest.repositories.SuburbRepo;

@Service
public class SuburbService {
	 @Autowired
	 SuburbRepo repo;
	 public Page<Suburb>findAllSuburbs(Pageable pageable)
		{
			return repo.findAll(pageable);
		}

		public Optional<Suburb> findSuburbById(long id)
		{
			return repo.findById(id);
		}

		public void createSuburb(Suburb model)
		{
			 repo.save(model);
		}

		public void removeSuburb(long id)
		{
			repo.deleteById(id);
		}
}
