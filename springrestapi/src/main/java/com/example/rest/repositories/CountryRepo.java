package com.example.rest.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.rest.models.Country;

public interface CountryRepo extends CrudRepository<Country, Long>{

}
