package com.example.rest.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.rest.models.Contract;

public interface ContractRepo extends PagingAndSortingRepository<Contract, Long>{

}
