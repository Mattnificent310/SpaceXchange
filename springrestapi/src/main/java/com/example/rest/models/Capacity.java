package com.example.rest.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Capacity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long capacityId;
private double maxWeight;
private double loadWeight;
private double emptyWeight;
private double maxFuel;
private double fuelConsumption;
private double reserveFuel;
private int maxSeats;
private double maxSpeed;
private double fullyLoadedSpeed;
private double fullyLoadedFuelConsumption;
/**
 * @return the capacityId
 */
public Long getCapacityId() {
	return capacityId;
}
/**
 * @param capacityId the capacityId to set
 */
public void setCapacityId(Long capacityId) {
	this.capacityId = capacityId;
}
/**
 * @return the maxWeight
 */
public double getMaxWeight() {
	return maxWeight;
}
/**
 * @param maxWeight the maxWeight to set
 */
public void setMaxWeight(double maxWeight) {
	this.maxWeight = maxWeight;
}
/**
 * @return the loadWeight
 */
public double getLoadWeight() {
	return loadWeight;
}
/**
 * @param loadWeight the loadWeight to set
 */
public void setLoadWeight(double loadWeight) {
	this.loadWeight = loadWeight;
}
/**
 * @return the emptyWeight
 */
public double getEmptyWeight() {
	return emptyWeight;
}
/**
 * @param emptyWeight the emptyWeight to set
 */
public void setEmptyWeight(double emptyWeight) {
	this.emptyWeight = emptyWeight;
}
/**
 * @return the maxFuel
 */
public double getMaxFuel() {
	return maxFuel;
}
/**
 * @param maxFuel the maxFuel to set
 */
public void setMaxFuel(double maxFuel) {
	this.maxFuel = maxFuel;
}
/**
 * @return the fuelConsumption
 */
public double getFuelConsumption() {
	return fuelConsumption;
}
/**
 * @param fuelConsumption the fuelConsumption to set
 */
public void setFuelConsumption(double fuelConsumption) {
	this.fuelConsumption = fuelConsumption;
}
/**
 * @return the reserveFuel
 */
public double getReserveFuel() {
	return reserveFuel;
}
/**
 * @param reserveFuel the reserveFuel to set
 */
public void setReserveFuel(double reserveFuel) {
	this.reserveFuel = reserveFuel;
}
/**
 * @return the maxSeats
 */
public int getMaxSeats() {
	return maxSeats;
}
/**
 * @param maxSeats the maxSeats to set
 */
public void setMaxSeats(int maxSeats) {
	this.maxSeats = maxSeats;
}
/**
 * @return the maxSpeed
 */
public double getMaxSpeed() {
	return maxSpeed;
}
/**
 * @param maxSpeed the maxSpeed to set
 */
public void setMaxSpeed(double maxSpeed) {
	this.maxSpeed = maxSpeed;
}
/**
 * @return the fullyLoadedSpeed
 */
public double getFullyLoadedSpeed() {
	return fullyLoadedSpeed;
}
/**
 * @param fullyLoadedSpeed the fullyLoadedSpeed to set
 */
public void setFullyLoadedSpeed(double fullyLoadedSpeed) {
	this.fullyLoadedSpeed = fullyLoadedSpeed;
}
/**
 * @return the fullyLoadedFuelConsumption
 */
public double getFullyLoadedFuelConsumption() {
	return fullyLoadedFuelConsumption;
}
/**
 * @param fullyLoadedFuelConsumption the fullyLoadedFuelConsumption to set
 */
public void setFullyLoadedFuelConsumption(double fullyLoadedFuelConsumption) {
	this.fullyLoadedFuelConsumption = fullyLoadedFuelConsumption;
}


}

