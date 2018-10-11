package com.example.rest.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.rest.models.User;

public interface UserRepo extends CrudRepository<User, Long>{

}
