package com.example.rest.models;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Message {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long messageId;
private String to;
private String cc;
private String bcc;
private String from;
private String subject;
private String type;
private String letterHead;
private String body;
private String smtp;
@OneToMany
private Set<Attachment> attachments;
/**
 * @return the messageId
 */
public Long getMessageId() {
	return messageId;
}
/**
 * @param messageId the messageId to set
 */
public void setMessageId(Long messageId) {
	this.messageId = messageId;
}
/**
 * @return the to
 */
public String getTo() {
	return to;
}
/**
 * @param to the to to set
 */
public void setTo(String to) {
	this.to = to;
}
/**
 * @return the cc
 */
public String getCc() {
	return cc;
}
/**
 * @param cc the cc to set
 */
public void setCc(String cc) {
	this.cc = cc;
}
/**
 * @return the bcc
 */
public String getBcc() {
	return bcc;
}
/**
 * @param bcc the bcc to set
 */
public void setBcc(String bcc) {
	this.bcc = bcc;
}
/**
 * @return the from
 */
public String getFrom() {
	return from;
}
/**
 * @param from the from to set
 */
public void setFrom(String from) {
	this.from = from;
}
/**
 * @return the subject
 */
public String getSubject() {
	return subject;
}
/**
 * @param subject the subject to set
 */
public void setSubject(String subject) {
	this.subject = subject;
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
 * @return the letterHead
 */
public String getLetterHead() {
	return letterHead;
}
/**
 * @param letterHead the letterHead to set
 */
public void setLetterHead(String letterHead) {
	this.letterHead = letterHead;
}
/**
 * @return the body
 */
public String getBody() {
	return body;
}
/**
 * @param body the body to set
 */
public void setBody(String body) {
	this.body = body;
}
/**
 * @return the smtp
 */
public String getSmtp() {
	return smtp;
}
/**
 * @param smtp the smtp to set
 */
public void setSmtp(String smtp) {
	this.smtp = smtp;
}
/**
 * @return the attachments
 */
public Set<Attachment> getAttachments() {
	return attachments;
}
/**
 * @param attachments the attachments to set
 */
public void setAttachments(Set<Attachment> attachments) {
	this.attachments = attachments;
}


}
