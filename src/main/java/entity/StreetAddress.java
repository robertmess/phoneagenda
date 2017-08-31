package com.robert.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class StreetAddress {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer streetAddressID;
	private String streetName;
	private String streetNumber;
		
	private Integer countryCitiesID;
	private String ZIP;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "streetAddress")
	private List<AddressContactRelationship> addressContactRelationship;
	
	@ManyToOne(fetch = FetchType.LAZY)
	//@JoinColumn(name = "countryCitiesID", nullable = false)
	private CountryCities countryCities;

	public Integer getStreetAddressID() {
		return streetAddressID;
	}

	public void setStreetAddressID(Integer streetAddressID) {
		this.streetAddressID = streetAddressID;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String street) {
		this.streetName = street;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public Integer getCountryCitiesID() {
		return countryCitiesID;
	}

	public void setCountryCitiesID(Integer countryCitiesID) {
		this.countryCitiesID = countryCitiesID;
	}

	public String getZIP() {
		return ZIP;
	}

	public void setZIP(String zIP) {
		ZIP = zIP;
	}

	public CountryCities getCountryCities() {
		return countryCities;
	}

	public void setCountryCities(CountryCities countryCities) {
		this.countryCities = countryCities;
	}

	public List<AddressContactRelationship> getAddressContactRelationship() {
		return addressContactRelationship;
	}

	public void setAddressContactRelationship(List<AddressContactRelationship> addressContactRelationship) {
		this.addressContactRelationship = addressContactRelationship;
	}

}
