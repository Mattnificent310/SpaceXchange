package com.example.rest.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.rest.models.Supplier;
public interface SupplierRepo extends PagingAndSortingRepository<Supplier, Long> {

}
