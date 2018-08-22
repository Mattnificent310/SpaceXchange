package com.example.rest.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.rest.models.Passenger;

public interface PassengerRepo extends PagingAndSortingRepository<Passenger, Long>{

}
