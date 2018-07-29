package com.example.rest.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.rest.models.Contract;

public interface ContractRepo extends CrudRepository<Contract, Long>{

}
