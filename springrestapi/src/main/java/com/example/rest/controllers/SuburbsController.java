
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
import com.example.rest.models.Suburb;
import com.example.rest.services.SuburbService;
@CrossOrigin(origins = {"http://localhost:4200"}, maxAge = 6000, allowCredentials = "false")
@RestController
public class SuburbsController {

@Autowired
SuburbService service;

@RequestMapping(value = "/suburbs", method = RequestMethod.GET)
public Page<Suburb>getCities(Pageable pageable)
{
  Page page = service.findAllSuburbs(pageable);
  return page;
}

@RequestMapping(value = "/suburb/{Id}", method = RequestMethod.GET)
public Optional<Suburb> getSuburb(@PathVariable Long Id)
{
  return service.findSuburbById(Id);
}

@RequestMapping(value = "/suburb", method = RequestMethod.POST)
public void post(@RequestBody Suburb model)
{
   service.createSuburb(model);
}

@RequestMapping(value = "/suburb/{Id}", method = RequestMethod.PUT)
public void put(@PathVariable Long Id, @RequestBody Suburb model)
{
  service.createSuburb(model);
}

@RequestMapping(value = "/suburb/{Id}", method = RequestMethod.DELETE)
public void delete(@PathVariable Long Id)
{
  service.removeSuburb(Id);
}

}