package com.example.rest.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.rest.models.Aircraft;

public interface AircraftRepo extends CrudRepository<Aircraft, Long>{

}
