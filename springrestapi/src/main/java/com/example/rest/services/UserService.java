package com.example.rest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest.models.User;
import com.example.rest.repositories.UserRepo;
@Service
public class UserService {
	@Autowired
	UserRepo repo;
	public Iterable<User>findAllUsers()
	{
		return repo.findAll();
	}

	public Optional<User> findUserById(long id)
	{
		return repo.findById(id);
	}

	public User createUser(User model)
	{
		 return repo.save(model);
	}

	public void removeUser(long id)
	{
		repo.deleteById(id);
	}
}
