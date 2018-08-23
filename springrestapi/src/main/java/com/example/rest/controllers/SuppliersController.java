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
import com.example.rest.models.City;
import com.example.rest.models.Country;
import com.example.rest.models.Province;
import com.example.rest.models.Suburb;
import com.example.rest.models.Supplier;
import com.example.rest.services.CityService;
import com.example.rest.services.CountryService;
import com.example.rest.services.ProvinceService;
import com.example.rest.services.SuburbService;
import com.example.rest.services.SupplierService;

import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = { "http://localhost:4200" }, maxAge = 6000, allowCredentials = "false")
@RestController
public class SuppliersController {

	@Autowired
	SupplierService service;
	@Autowired
	SuburbService sub;
	@Autowired
	CityService city;
	@Autowired
	ProvinceService prov;
	@Autowired
	CountryService country;

	@RequestMapping(value = "/suppliers", method = RequestMethod.GET)
	@ApiOperation(value = "Retrieves a paged set of suppliers", response = Supplier.class, produces = "application/json")
	public Page<Supplier> getTrackings(Pageable pageable) {
		Page page = service.findAllSuppliers(pageable);
		return page;
	}

	@RequestMapping(value = "/suppliers/{Id}", method = RequestMethod.GET)
	@ApiOperation(value = "Retrieves a specified supplier", response = Supplier.class, produces = "application/json")
	public Optional<Supplier> getSupplier(@PathVariable Long Id) {
		return service.findSupplierById(Id);
	}

	@RequestMapping(value = "/suppliers", method = RequestMethod.POST)
	@ApiOperation(value = "Creates a specified supplier", response = Supplier.class, produces = "application/json")
	public void post(@RequestBody Supplier model) {
		Suburb suburb = sub.createSuburb(model.getSuburb());
		City cty = city.createCity(model.getSuburb().getCity());
		Province prv = prov.createProvince(model.getSuburb().getCity().getProvince());
		Country ctry = country.createCountry(model.getSuburb().getCity().getProvince().getCountry());
		model.suburb = suburb;
		model.suburb.city = cty;
		model.suburb.city.province = prv;
		model.suburb.city.province.country = ctry;
		service.createSupplier(model);
	}

	@RequestMapping(value = "/suppliers/{Id}", method = RequestMethod.PUT)
	@ApiOperation(value = "Modifies a specified supplier", response = Supplier.class, produces = "application/json")
	public void put(@PathVariable Long Id, @RequestBody Supplier model) {
		service.createSupplier(model);
	}

	@RequestMapping(value = "/suppliers/{Id}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Removes a specified supplier", response = Supplier.class, produces = "application/json")
	public void delete(@PathVariable Long Id) {
		service.removeSupplier(Id);
	}
}
