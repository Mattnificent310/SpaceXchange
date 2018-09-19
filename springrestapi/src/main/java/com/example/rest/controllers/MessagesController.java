package com.example.rest.controllers;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.rest.models.Attachment;
import com.example.rest.models.Message;
import com.example.rest.services.AttachmentService;
import com.example.rest.services.MessageService;
import io.swagger.annotations.ApiOperation;

@RestController
public class MessagesController {
	@Autowired
	MessageService service;
	@Autowired
	AttachmentService attach;
	
	@RequestMapping(value = "/messages", method = RequestMethod.GET)
	@ApiOperation(value = "Retrieves a paged set of messages", response = Message.class, produces = "application/json")
	public List<Message> getMessagess(Pageable pageable) {
		Page<Message> page = service.findAllMessages(pageable);
		return page.getContent();
	}
	@RequestMapping(value = "/messages/{Id}", method = RequestMethod.GET)
	@ApiOperation(value = "Retrieves a specified message", response = Message.class, produces = "application/json")
	public Optional<Message> getMessage(@PathVariable Long Id) {
		return service.findMessageById(Id);
	}

	@RequestMapping(value = "/messages", method = RequestMethod.POST)
	@ApiOperation(value = "Creates a specified message", response = Message.class, produces = "application/json")
	public void post(@RequestBody Message model) {
		Set<Attachment> set = new HashSet<Attachment>();
		for (Attachment item : model.getAttachments()) {
			set.add(attach.createAttachment(item));
		}
		model.setAttachments(set);				
		service.createMessage(model);
	}

	@RequestMapping(value = "/messages/{Id}", method = RequestMethod.PUT)
	@ApiOperation(value = "Modifies a specified message", response = Message.class, produces = "application/json")
	public void put(@PathVariable Long Id, @RequestBody Message model) {
		Set<Attachment> set = new HashSet<Attachment>();
		for (Attachment item : model.getAttachments()) {
			set.add(attach.createAttachment(item));
		}
		model.setAttachments(set);
		service.createMessage(model);
	}

	@RequestMapping(value = "/messages/{Id}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Removes a specified message", response = Message.class, produces = "application/json")
	public void delete(@PathVariable Long Id) {		
		service.removeMessage(Id);
	}

}
