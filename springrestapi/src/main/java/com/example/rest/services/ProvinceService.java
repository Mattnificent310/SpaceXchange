package com.example.rest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.rest.models.Cargo;
import com.example.rest.models.Province;
import com.example.rest.repositories.ProvinceRepo;

@Service
public class ProvinceService {
@Autowired
ProvinceRepo repo;
public Iterable<Province>findAllProvinces()
{
	return repo.findAll();
}

public Optional<Province> findProvinceById(long id)
{
	return repo.findById(id);
}

public Province createProvince(Province model)
{
	 return repo.save(model);
}

public void removeProvince(long id)
{
	repo.deleteById(id);
}
}
