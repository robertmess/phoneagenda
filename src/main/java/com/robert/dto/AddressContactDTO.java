package com.robert.dto;

public class AddressContactDTO {

	private String firstName;
	private String lastName;
	private String Company;
	private String homePhone;
	private String workPhone;
	private Integer addressContactID;
	private AddressDTO addressDTO;
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
	public Integer getAddressContactID() {
		return addressContactID;
	}
	public void setAddressContactID(Integer addressContactID) {
		this.addressContactID = addressContactID;
	}
	public AddressDTO getAddressDTO() {
		return addressDTO;
	}
	public void setAddressDTO(AddressDTO addressDTO) {
		this.addressDTO = addressDTO;
	}
	
}
