package com.robert.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Country {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer countryID;
	private String countryName;

	public Country(Integer countryID, String countryName) {
		super();
		this.countryID = countryID;
		this.countryName = countryName;
	}
	
	public Country() {
		super();
	}

	public Integer getCountryID() {
		return countryID;
	}

	public void setCountryID(Integer countryID) {
		this.countryID = countryID;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

}
