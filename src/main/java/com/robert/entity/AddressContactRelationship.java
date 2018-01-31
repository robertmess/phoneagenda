package com.robert.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class AddressContactRelationship {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer addressContactRelationshipID;
	
	private Integer addressContactID;
	
	private Integer streetAddressID;
	
	private Integer typeID;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private AddressContact addressContacts;
	
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private AddressType addressType;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private StreetAddress streetAddress;

	public AddressType getAddressType() {
		return addressType;
	}

	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}

	public Integer getAddressContactRelationshipID() {
		return addressContactRelationshipID;
	}

	public void setAddressContactRelationshipID(Integer addressContactRelationshipID) {
		this.addressContactRelationshipID = addressContactRelationshipID;
	}

	public Integer getAddressContactID() {
		return addressContactID;
	}

	public void setAddressContactID(Integer addressContactID) {
		this.addressContactID = addressContactID;
	}

	public Integer getStreetAddressID() {
		return streetAddressID;
	}

	public void setStreetAddressID(Integer streetAddressID) {
		this.streetAddressID = streetAddressID;
	}

	public Integer getTypeID() {
		return typeID;
	}

	public void setTypeID(Integer typeID) {
		this.typeID = typeID;
	}

	public AddressContact getAddressContacts() {
		return addressContacts;
	}

	public void setAddressContacts(AddressContact addressContacts) {
		this.addressContacts = addressContacts;
	}

	public StreetAddress getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(StreetAddress streetAddress) {
		this.streetAddress = streetAddress;
	}

}
