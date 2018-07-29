package com.example.rest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest.models.Tracking;
import com.example.rest.repositories.TrackingRepo;
import com.example.rest.repositories.VehicleRepo;

@Service
public class TrackingService {
	@Autowired
	 TrackingRepo repo;
	 public Iterable <Tracking>findAllTrackings()
		{
			return repo.findAll();
		}
		
		public Optional<Tracking> findTrackingById(long id)
		{
			return repo.findById(id);
		}
		
		public void createTracking(Tracking model)
		{
			 repo.save(model);
		}
		
		public void removeTracking(long id)
		{
			repo.deleteById(id);
		}

}
