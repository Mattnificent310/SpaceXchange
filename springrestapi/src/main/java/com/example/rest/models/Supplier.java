package com.example.rest.models;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
public class Supplier {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long supplierId;
	private String alias;
	private String title;
	private String name;
	private String surname;
	private String gender;
	private Date brithDate;
	private String phone;
	private String email;
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@NotFound(action = NotFoundAction.IGNORE)
	public Suburb suburb;
	private String unitNumber;
	private String complexName;
	private String farmName;
	private String streetNumber;
	private String streetName;

	/**
	 * @return the suburb
	 */
	public Suburb getSuburb() {
		return suburb;
	}

	/**
	 * @param suburb the location to set
	 */
	public void setSuburb(Suburb sub) {
		this.suburb = sub;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return supplierId;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.supplierId = id;
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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
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
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return the gender
	 */
	public String isGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the brithDate
	 */
	public Date getBrithDate() {
		return brithDate;
	}

	/**
	 * @param brithDate the brithDate to set
	 */
	public void setBrithDate(Date brithDate) {
		this.brithDate = brithDate;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the unit
	 */
	public String getUnitNumber() {
		return this.unitNumber;
	}
/**
	 * @param unit the unit to set
	 */
	public void setUnitNumber(String unit) {
		this.unitNumber = unit;
	}
	/**
	 * @return the complex
	 */
	public String getComplexName() {
		return complexName;
	}
/**
	 * @param complex the complex to set
	 */
	public void setComplexName(String complex) {
		this.complexName = complex;
	}
	/**
	 * @return the farm
	 */
	public String getFarmName() {
		return farmName;
	}
/**
	 * @param farm the suburb to set
	 */
	public void setFarmName(String farm) {
		this.farmName = farm;
	}
	/**
	 * @return the streetName
	 */
	public String getStreetName() {
		return streetName;
	}
/**
	 * @param streetName the suburb to set
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	/**
	 * @return the streetNu
	 */
	public String getStreetNumber() {
		return streetNumber;
	}
/**
	 * @param streetNumber the streetNumber to set
	 */
	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}
}
