package com.example.rest.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.rest.models.Attachment;

public interface AttachmentRepo extends CrudRepository<Attachment, Long>{

}
