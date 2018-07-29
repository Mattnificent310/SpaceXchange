package com.example.rest.repositories;
import org.springframework.data.repository.CrudRepository;

import com.example.rest.models.Tracking;;

public interface
TrackingRepo extends CrudRepository<Tracking, Long> {

}
