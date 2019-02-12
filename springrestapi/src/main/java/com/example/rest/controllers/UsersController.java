package com.example.rest.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.models.User;
import com.example.rest.services.UserService;

import io.swagger.annotations.ApiOperation;
@CrossOrigin(origins = {"http://localhost:4200", "http://spacexchange.net", "http://34.244.138.179", "http://www.spacexchange.net"}, maxAge = 6000, allowCredentials = "false")
@RestController

public class UsersController {
	
	@Autowired
	UserService service;
	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	@ApiOperation(value = "Retrieves a paged set of users", response = User.class, produces = "application/json")
	public Iterable<User> getUsers() {
		return service.findAllUsers();
		
	}

	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
	@ApiOperation(value = "Retrieves a specified user", response = User.class, produces = "application/json")
	public Optional<User> getUser(@PathVariable long id) {
		return service.findUserById(id);
	}

	@RequestMapping(value = "/users", method = RequestMethod.POST)
	@ApiOperation(value = "Creates a specified user", response = User.class, produces = "application/json")
	public ResponseEntity<User> post(@RequestBody User model) {
		if (service.exists(model.getId())) {
			return new ResponseEntity<User>(HttpStatus.CONFLICT); 			
		}
		service.createUser(model);
		return new ResponseEntity<User>(HttpStatus.OK);
	}

	@RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)
	@ApiOperation(value = "Modifies a specified user", response = User.class, produces = "application/json")
	public ResponseEntity<User> put(@PathVariable long id, @RequestBody User model) {
		if (!service.exists(id))
		{
			 return new ResponseEntity<User>(HttpStatus.NOT_FOUND); 				
		}
		service.createUser(model);
		return new ResponseEntity<User>(HttpStatus.OK); 
	}

	@RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Removes a specified user", response = User.class, produces = "application/json")
	public void delete(@PathVariable long id) {
		service.removeUser(id);
	}
}
