package com.example.rest.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contract {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long contractId;
private String classification;
private String type;
private String criteria;
private String restriction;
private String status;
/**
 * @return the contractId
 */
public Long getContractId() {
	return contractId;
}
/**
 * @param contractId the contractId to set
 */
public void setContractId(Long contractId) {
	this.contractId = contractId;
}
/**
 * @return the classification
 */
public String getClassification() {
	return classification;
}
/**
 * @param classification the classification to set
 */
public void setClassification(String classification) {
	this.classification = classification;
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
 * @return the criteria
 */
public String getCriteria() {
	return criteria;
}
/**
 * @param criteria the criteria to set
 */
public void setCriteria(String criteria) {
	this.criteria = criteria;
}
/**
 * @return the restriction
 */
public String getRestriction() {
	return restriction;
}
/**
 * @param restriction the restriction to set
 */
public void setRestriction(String restriction) {
	this.restriction = restriction;
}
/**
 * @return the status
 */
public String getStatus() {
	return status;
}
/**
 * @param status the status to set
 */
public void setStatus(String status) {
	this.status = status;
}


}
