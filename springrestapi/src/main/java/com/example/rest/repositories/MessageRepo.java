package com.example.rest.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.rest.models.Message;

public interface MessageRepo extends PagingAndSortingRepository<Message, Long>{

}
