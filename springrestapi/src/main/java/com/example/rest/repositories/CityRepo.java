package com.example.rest.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.rest.models.City;

public interface CityRepo extends PagingAndSortingRepository<City, Long> {

}
