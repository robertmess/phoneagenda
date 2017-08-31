package com.robert.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class AddressBook {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer addressBookID;
	
	private Integer userID;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "addressBook")
    private List<AddressContact> addressContacts;
    
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private User user;
    
  	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<AddressContact> getAddressContacts() {
		return addressContacts;
	}

	public void setAddressContacts(List<AddressContact> addressContacts) {
		this.addressContacts = addressContacts;
	}

	public Integer getAddressBookID() {
		return addressBookID;
	}

	public void setAddressBookID(Integer addressBookID) {
		this.addressBookID = addressBookID;
	}

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

}
