package com.robert.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AddressType {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer addressTypeID;
	private String typeName;
		
	public Integer getAddressTypeID() {
		return addressTypeID;
	}
	public void setAddressTypeID(Integer addressTypeID) {
		this.addressTypeID = addressTypeID;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
}
