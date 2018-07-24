package com.example.rest.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.rest.models.Buyer;

public interface BuyerRepo extends CrudRepository<Buyer, Long>{

}
