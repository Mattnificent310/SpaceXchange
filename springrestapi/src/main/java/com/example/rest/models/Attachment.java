package com.example.rest.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Attachment {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long attachmentId;
private String name;
private String type;
private int size;
private String file;
/**
 * @return the attachmentId
 */
public Long getAttachmentId() {
	return attachmentId;
}
/**
 * @param attachmentId the attachmentId to set
 */
public void setAttachmentId(Long attachmentId) {
	this.attachmentId = attachmentId;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the type
 */
public String getType() {
	return type;
}
/**
 * @param type the type to set
 */
public void setType(String type) {
	this.type = type;
}
/**
 * @return the size
 */
public int getSize() {
	return size;
}
/**
 * @param size the size to set
 */
public void setSize(int size) {
	this.size = size;
}
/**
 * @return the file
 */
public String getFile() {
	return file;
}
/**
 * @param file the file to set
 */
public void setFile(String file) {
	this.file = file;
}


}
