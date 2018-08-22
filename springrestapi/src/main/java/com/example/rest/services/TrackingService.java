package com.example.rest.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.example.rest.models.Tracking;
import com.example.rest.repositories.TrackingRepo;

@Service
public class TrackingService {
	@Autowired
	 TrackingRepo repo;
	 public Page<Tracking>findAllTrackings(Pageable pageable)
		{
			return repo.findAll(pageable);
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
