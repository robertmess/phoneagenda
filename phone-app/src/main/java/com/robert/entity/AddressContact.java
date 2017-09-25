package com.robert.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class AddressContact {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Integer addressContactID;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private AddressBook addressBook;

	private Integer addressBookID;
	private String firstName;
	private String lastName;
	private String Company;
	private String homePhone;
	private String workPhone;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "addressContacts")
	private List<AddressContactRelationship> addressContactRelationship;

	public List<AddressContactRelationship> getAddressContactRelationship() {
		return addressContactRelationship;
	}

	public void setAddressContactRelationship(List<AddressContactRelationship> addressContactRelationship) {
		this.addressContactRelationship = addressContactRelationship;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getWorkPhone() {
		return workPhone;
	}

	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

	public AddressBook getAddressBook() {
		return addressBook;
	}

	public void setAddressBook(AddressBook addressBook) {
		this.addressBook = addressBook;
	}

	// private STring workPhone;
	public Integer getAddressContactID() {
		return addressContactID;
	}

	public void setAddressContactID(Integer addressContactID) {
		this.addressContactID = addressContactID;
	}

	public Integer getAddressBookID() {
		return addressBookID;
	}

	public void setAddressBookID(Integer addressBookID) {
		this.addressBookID = addressBookID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

}
