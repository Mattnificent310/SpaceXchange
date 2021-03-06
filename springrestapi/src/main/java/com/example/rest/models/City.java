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
public class City {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)	
		private Long cityId;
		private String cityName;
		private String cityCode;
		@OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "province_id")
	    private Province provinceId;
		/**
		 * @return the id
		 */
		public Long getId() {
			return cityId;
		}
		/**
		 * @param id the id to set
		 */
		
		public void setId(Long id) {
			this.cityId = id;
		}
		/**
		 * @return the cityName
		 */
		public String getCityName() {
			return cityName;
		}
		/**
		 * @param cityName the cityName to set
		 */
		public void setCityName(String cityName) {
			this.cityName = cityName;
		}
		/**
		 * @return the cityCode
		 */
		public String getCityCode() {
			return cityCode;
		}
		/**
		 * @param cityCode the cityCode to set
		 */
		public void setCityCode(String cityCode) {
			this.cityCode = cityCode;
		}
		/**
		 * @return the province
		 */
		public Province getProvince() {
			return provinceId;
		}
		/**
		 * @param province the province to set
		 */
		public void setProvince(Province province) {
			this.provinceId = province;
		}
		
		
}
