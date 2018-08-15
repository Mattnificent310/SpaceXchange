package com.example.rest.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Aircraft {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long aircraftId;
private String registration;
private String avatar;
private String classification;
private String type;
private String make;
private String model;
private String colour;
private String alias;
private double wingSpan;
@OneToOne(optional = true)
@JoinColumn(name = "dimension_id", insertable = true, updatable = true)
private Dimension dimension;
@OneToOne(optional = true)
@JoinColumn(name = "capacity_id", insertable = true, updatable = true)
private Capacity capacity;
/**
 * @return the aircraftId
 */
public Long getAircraftId() {
	return aircraftId;
}
/**
 * @param aircraftId the aircraftId to set
 */
public void setAircraftId(Long aircraftId) {
	this.aircraftId = aircraftId;
}
/**
 * @return the registration
 */
public String getRegistration() {
	return registration;
}
/**
 * @param registration the registration to set
 */
public void setRegistration(String registration) {
	this.registration = registration;
}
/**
 * @return the avatar
 */
public String getAvatar() {
	return avatar;
}
/**
 * @param avatar the avatar to set
 */
public void setAvatar(String avatar) {
	this.avatar = avatar;
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
 * @return the make
 */
public String getMake() {
	return make;
}
/**
 * @param make the make to set
 */
public void setMake(String make) {
	this.make = make;
}
/**
 * @return the model
 */
public String getModel() {
	return model;
}
/**
 * @param model the model to set
 */
public void setModel(String model) {
	this.model = model;
}
/**
 * @return the colour
 */
public String getColour() {
	return colour;
}
/**
 * @param colour the colour to set
 */
public void setColour(String colour) {
	this.colour = colour;
}
/**
 * @return the alias
 */
public String getAlias() {
	return alias;
}
/**
 * @param alias the alias to set
 */
public void setAlias(String alias) {
	this.alias = alias;
}
/**
 * @return the wingSpan
 */
public double getWingSpan() {
	return wingSpan;
}
/**
 * @param wingSpan the wingSpan to set
 */
public void setWingSpan(double wingSpan) {
	this.wingSpan = wingSpan;
}

/**
 * @return the dimension
 */
public Dimension getDimension() {
	return dimension;
}
/**
 * @param dimension the dimension to set
 */
public void setDimension(Dimension dimension) {
	this.dimension = dimension;
}
/**
 * @return the capacity
 */
public Capacity getCapacity() {
	return capacity;
}
/**
 * @param capacity the capacity to set
 */
public void setCapacity(Capacity capacity) {
	this.capacity = capacity;
}

}
