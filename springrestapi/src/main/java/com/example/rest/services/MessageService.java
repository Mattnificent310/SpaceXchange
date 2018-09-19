package com.example.rest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.rest.models.Message;
import com.example.rest.repositories.MessageRepo;

@Service
public class MessageService {
	@Autowired
	MessageRepo repo;

	public Page<Message> findAllMessages(Pageable pageable) {
		return repo.findAll(pageable);
	}

	public Optional<Message> findMessageById(long id) {
		return repo.findById(id);
	}

	public Message createMessage(Message model) {
		return repo.save(model);
	}

	public void removeMessage(long id) {
		repo.deleteById(id);
	}
}
