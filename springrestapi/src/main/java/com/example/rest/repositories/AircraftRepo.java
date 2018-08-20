package com.example.rest.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.rest.models.Aircraft;

public interface AircraftRepo extends PagingAndSortingRepository<Aircraft, Long>{

}
