package com.example.rest.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dimension {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long dimensionId;
private double height;
private double width;
private double length;
private String type;
private double diameter;
private double surfaceArea;
/**
 * @return the dimensionId
 */
public Long getDimensionId() {
	return dimensionId;
}
/**
 * @param dimensionId the dimensionId to set
 */
public void setDimensionId(Long dimensionId) {
	this.dimensionId = dimensionId;
}
/**
 * @return the height
 */
public double getHeight() {
	return height;
}
/**
 * @param height the height to set
 */
public void setHeight(double height) {
	this.height = height;
}
/**
 * @return the width
 */
public double getWidth() {
	return width;
}
/**
 * @param width the width to set
 */
public void setWidth(double width) {
	this.width = width;
}
/**
 * @return the length
 */
public double getLength() {
	return length;
}
/**
 * @param length the length to set
 */
public void setLength(double length) {
	this.length = length;
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
 * @return the diameter
 */
public double getDiameter() {
	return diameter;
}
/**
 * @param diameter the diameter to set
 */
public void setDiameter(double diameter) {
	this.diameter = diameter;
}
/**
 * @return the surfaceArea
 */
public double getSurfaceArea() {
	return surfaceArea;
}
/**
 * @param surfaceArea the surfaceArea to set
 */
public void setSurfaceArea(double surfaceArea) {
	this.surfaceArea = surfaceArea;
}

}
