package com.example.rest.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.example.rest.models.Passenger;
import com.example.rest.repositories.PassengerRepo;
@Service
public class PassengerService {
@Autowired
PassengerRepo repo;
public Page<Passenger>findAllPassengers(Pageable pageable)
{
	return repo.findAll(pageable);
}

	public Optional<Passenger> findPassengerById(long id) {
		return repo.findById(id);
	}

	public void createPassenger(Passenger model) {
		repo.save(model);
	}

	public void removePassenger(long id) {
		repo.deleteById(id);
	}
}
