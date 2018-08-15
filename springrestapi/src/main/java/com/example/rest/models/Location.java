package com.example.rest.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Location {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long locationId;
	private String unitNumber;
	private String complexName;
	private String streetNumber;
	private String streetName;
	private String suburbName;
	private String zipCode;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "city_id")
	private City city;

	/**
	 * @return the id
	 */
	public Long getId() {
		return locationId;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	
	public void setId(Long id) {
		this.locationId = id;
	}

	/**
	 * @return the unitNumber
	 */
	public String getUnitNumber() {
		return unitNumber;
	}

	/**
	 * @param unitNumber
	 *            the unitNumber to set
	 */
	public void setUnitNumber(String unitNumber) {
		this.unitNumber = unitNumber;
	}

	/**
	 * @return the complexName
	 */
	public String getComplexName() {
		return complexName;
	}

	/**
	 * @param complexName
	 *            the complexName to set
	 */
	public void setComplexName(String complexName) {
		this.complexName = complexName;
	}

	/**
	 * @return the streetNumber
	 */
	public String getStreetNumber() {
		return streetNumber;
	}

	/**
	 * @param streetNumber
	 *            the streetNumber to set
	 */
	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	/**
	 * @return the streetName
	 */
	public String getStreetName() {
		return streetName;
	}

	/**
	 * @param streetName
	 *            the streetName to set
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	/**
	 * @return the suburbName
	 */
	public String getSuburbName() {
		return suburbName;
	}

	/**
	 * @param suburbName
	 *            the suburbName to set
	 */
	public void setSuburbName(String suburbName) {
		this.suburbName = suburbName;
	}

	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode
	 *            the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * @return the city
	 */
	public City getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(City city) {
		this.city = city;
	}

}
