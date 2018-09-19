package com.example.rest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest.models.Attachment;
import com.example.rest.repositories.AttachmentRepo;

@Service
public class AttachmentService {
	@Autowired
	AttachmentRepo repo;
	
	public Iterable<Attachment> findAllAttachments()
	{
		return repo.findAll();
	}
	public Optional<Attachment> findAttachmentById(long id) {
		return repo.findById(id);
	}
	public Attachment createAttachment(Attachment model) {
		return repo.save(model);
	}
	public void removeAttachment(long id)
	{
		repo.deleteById(id);
		}

}
