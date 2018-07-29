package com.example.rest.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cargo {
@Id
private Long cargoId;
private String category;
private String type;
private String brand;
private String model;
private String dimension;
private String description;
private Double capacityCost;
/**
 * @return the cargoId
 */
public Long getCargoId() {
	return cargoId;
}
/**
 * @param cargoId the cargoId to set
 */
public void setCargoId(Long cargoId) {
	this.cargoId = cargoId;
}
/**
 * @return the category
 */
public String getCategory() {
	return category;
}
/**
 * @param category the category to set
 */
public void setCategory(String category) {
	this.category = category;
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
 * @return the brand
 */
public String getBrand() {
	return brand;
}
/**
 * @param brand the brand to set
 */
public void setBrand(String brand) {
	this.brand = brand;
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
 * @return the dimension
 */
public String getDimension() {
	return dimension;
}
/**
 * @param dimension the dimension to set
 */
public void setDimension(String dimension) {
	this.dimension = dimension;
}
/**
 * @return the description
 */
public String getDescription() {
	return description;
}
/**
 * @param description the description to set
 */
public void setDescription(String description) {
	this.description = description;
}
/**
 * @return the capacityCost
 */
public Double getCapacityCost() {
	return capacityCost;
}
/**
 * @param capacityCost the capacityCost to set
 */
public void setCapacityCost(Double capacityCost) {
	this.capacityCost = capacityCost;
}


}
