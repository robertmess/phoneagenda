package entity;

public class User {

	private Integer userID;
	private String name;
	private AddressBook addressBook;

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AddressBook getAddressBook() {
		return addressBook;
	}

	public void setAddressBook(AddressBook addressBook) {
		this.addressBook = addressBook;
	}

}
