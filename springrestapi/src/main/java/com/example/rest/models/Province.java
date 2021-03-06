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
public class Province {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long provinceId;
	private String province;
	private String provinceCode;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "country_id")
    private Country country;
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
	public String getProvince() {
		return province;
	}
	/**
	 * @param province the province to set
	 */
	public void setProvince(String province) {
		this.province = province;
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
