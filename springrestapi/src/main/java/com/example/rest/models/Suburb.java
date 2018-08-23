package com.example.rest.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
public class Suburb {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long suburbId;
	private String suburbName;
	private String zipCode;
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@NotFound(action = NotFoundAction.IGNORE)
	public City city = new City();

	/**
	 * @return the id
	 */
	public Long getId() {
		return suburbId;
	}

	/**
	 * @param id
	 *            the id to set
	 */

	public void setId(Long id) {
		this.suburbId = id;
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
