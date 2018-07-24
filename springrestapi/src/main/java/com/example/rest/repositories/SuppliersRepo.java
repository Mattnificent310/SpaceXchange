package com.example.rest.repositories;
import org.springframework.data.repository.CrudRepository;

import com.example.rest.models.Supplier;
public interface SuppliersRepo extends CrudRepository<Supplier, Long> {

}
