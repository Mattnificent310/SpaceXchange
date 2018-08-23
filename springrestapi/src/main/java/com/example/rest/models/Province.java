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
public class Province {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long provinceId;
	private String provinceName;
	private String provinceCode;
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@NotFound(action = NotFoundAction.IGNORE)
    public Country country = new Country();
	/**
	 * @return the id
	 */
	public Long getId() {
		return provinceId;
	}
	/**
	 * @param id the id to set
	 */

	public void setId(Long id) {
		this.provinceId = id;
	}
	/**
	 * @return the province
	 */
	public String getProvinceName() {
		return provinceName;
	}
	/**
	 * @param province the province to set
	 */
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	/**
	 * @return the provinceCode
	 */
	public String getProvinceCode() {
		return provinceCode;
	}
	/**
	 * @param provinceCode the provinceCode to set
	 */
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	/**
	 * @return the country
	 */
	public Country getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(Country country) {
		this.country = country;
	}


}
