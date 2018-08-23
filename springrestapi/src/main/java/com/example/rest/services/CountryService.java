package com.example.rest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.rest.models.Cargo;
import com.example.rest.models.Country;
import com.example.rest.repositories.CountryRepo;

@Service
public class CountryService{
@Autowired
CountryRepo repo;
public Iterable<Country>findAllCountries()
{
	return repo.findAll();
}

public Optional<Country> findCountryById(long id)
{
	return repo.findById(id);
}

public Country createCountry(Country model)
{
	 return repo.save(model);
}

public void removeCountry(long id)
{
	repo.deleteById(id);
}
}
