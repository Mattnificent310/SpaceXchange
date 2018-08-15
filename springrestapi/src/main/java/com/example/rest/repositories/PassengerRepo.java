package com.example.rest.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.rest.models.Passenger;

public interface PassengerRepo extends CrudRepository<Passenger, Long>{

}
