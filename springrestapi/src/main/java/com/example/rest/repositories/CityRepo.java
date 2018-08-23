package com.example.rest.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.rest.models.City;

public interface CityRepo extends CrudRepository<City, Long>{

}
