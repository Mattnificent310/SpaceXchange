package com.example.rest.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.rest.models.Buyer;

public interface BuyerRepo extends PagingAndSortingRepository<Buyer, Long>{

}
