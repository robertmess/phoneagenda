package entity;

public class AddressContact {

	private Integer addressContactID;
	private Integer addressBookID;
	private String firstName;
	private String lastName;
	private String Company;
	private String homePhone;
	private String workPhone;
	private AddressBook addressBook;
	private AddressContactRelationship addressContactRelationship;

	public AddressContactRelationship getAddressContactRelationship() {
		return addressContactRelationship;
	}

	public void setAddressContactRelationship(AddressContactRelationship addressContactRelationship) {
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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

}
