package entity;

import java.util.List;

public class AddressBook {

	private Integer addressBookID;
	private Integer userID;
    private List<AddressContact> addressContacts;
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
