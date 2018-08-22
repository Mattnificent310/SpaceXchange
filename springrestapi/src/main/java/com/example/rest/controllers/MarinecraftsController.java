package com.example.rest.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.models.Contract;
import com.example.rest.models.Marinecraft;
import com.example.rest.services.MarinecraftService;
@CrossOrigin(origins = {"http://localhost:4200"}, maxAge = 6000, allowCredentials = "false")
@RestController
public class MarinecraftsController {

@Autowired
MarinecraftService service;

@RequestMapping(value = "/marinecrafts", method = RequestMethod.GET)
public Page<Marinecraft> getMarinecrafts(Pageable pageable)
{
  Page page = service.findAllMarinecrafts(pageable);
  return page;
}

@RequestMapping(value = "/marinecrafts/{Id}", method = RequestMethod.GET)
public Optional<Marinecraft> getMarinecraft(@PathVariable Long Id)
{
  return service.findMarinecraftById(Id);
}

@RequestMapping(value = "/marinecrafts", method = RequestMethod.POST)
public void post(@RequestBody Marinecraft model)
{
   service.createMarinecraft(model);
}

@RequestMapping(value = "/marinecrafts/{Id}", method = RequestMethod.PUT)
public void put(@PathVariable Long Id, @RequestBody Marinecraft model)
{
  service.createMarinecraft(model);
}

@RequestMapping(value = "/marinecrafts/{Id}", method = RequestMethod.DELETE)
public void delete(@PathVariable Long Id)
{
  service.removeMarinecraft(Id);
}
}
