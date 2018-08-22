package com.example.rest.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Passenger {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long passengerId;
	@ManyToOne(optional = true)
	private Buyer buyer;
	private String title;
	private String name;
	private String surname;
	private Date birthDate;
	private String gender;
	private String phone;
	private String email;
	@ManyToOne(optional = true)
	private Suburb suburb;
	private String unitNumber;
	private String complexName;
	private String farmName;
	private String streetNumber;
	private String streetName;
	private boolean deleted;
	/**
	 * @return the passengerId
	 */
	public Long getPassengerId() {
		return passengerId;
	}
	/**
	 * @param passengerId the passengerId to set
	 */
	public void setPassengerId(Long passengerId) {
		this.passengerId = passengerId;
	}
	/**
	 * @return the buyer
	 */
	public Buyer getBuyer() {
		return buyer;
	}
	/**
	 * @param buyer the buyer to set
	 */
	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
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
	 * @return the birthDate
	 */
	public Date getBirthDate() {
		return birthDate;
	}
	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
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
	 * @return the location
	 */
	public Suburb getSuburb() {
		return suburb;
	}
	/**
	 * @param location the location to set
	 */
	public void setSuburb(Suburb suburb) {
		this.suburb = suburb;
	}
	/**
	 * @return the deleted
	 */
	public boolean isDeleted() {
		return deleted;
	}
	/**
	 * @param deleted the deleted to set
	 */
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
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