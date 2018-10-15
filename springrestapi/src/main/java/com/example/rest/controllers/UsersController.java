package com.example.rest.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.models.User;
import com.example.rest.services.UserService;

import io.swagger.annotations.ApiOperation;
@CrossOrigin(origins = {"http://34.244.138.179"}, maxAge = 6000, allowCredentials = "false")
@RestController

public class UsersController {
	
	@Autowired
	UserService service;
	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	@ApiOperation(value = "Retrieves a paged set of users", response = User.class, produces = "application/json")
	public Iterable<User> getUsers() {
		return service.findAllUsers();
		
	}

	@RequestMapping(value = "/users/{Id}", method = RequestMethod.GET)
	@ApiOperation(value = "Retrieves a specified user", response = User.class, produces = "application/json")
	public Optional<User> getUser(@PathVariable Long Id) {
		return service.findUserById(Id);
	}

	@RequestMapping(value = "/users", method = RequestMethod.POST)
	@ApiOperation(value = "Creates a specified user", response = User.class, produces = "application/json")
	public void post(@RequestBody User model) {
		service.createUser(model);
	}

	@RequestMapping(value = "/users/{Id}", method = RequestMethod.PUT)
	@ApiOperation(value = "Modifies a specified user", response = User.class, produces = "application/json")
	public void put(@PathVariable Long Id, @RequestBody User model) {
		service.createUser(model);
	}

	@RequestMapping(value = "/users/{Id}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Removes a specified user", response = User.class, produces = "application/json")
	public void delete(@PathVariable Long Id) {
		service.removeUser(Id);
	}
}
