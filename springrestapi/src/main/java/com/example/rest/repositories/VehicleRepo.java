package com.example.rest.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.rest.models.Vehicle;

public interface VehicleRepo extends CrudRepository<Vehicle, Long> {

}