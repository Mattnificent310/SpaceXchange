package com.example.rest.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.rest.models.Location;

public interface LocationRepo extends CrudRepository<Location, Long> {

}
