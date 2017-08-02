package entity;

import java.util.List;

public class AddressContactRelationship {

	private Integer addressContactRelationshipID;
	private Integer addressContactID;
	private Integer streetAddressID;
	private Integer typeID;
	private List<AddressContact> addressContacts;
	private AddressType addressType;
	private List<StreetAddress> streetAddress;

	public AddressType getAddressType() {
		return addressType;
	}

	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}

	public List<StreetAddress> getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(List<StreetAddress> streetAddress) {
		this.streetAddress = streetAddress;
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

	public List<AddressContact> getAddressContacts() {
		return addressContacts;
	}

	public void setAddressContacts(List<AddressContact> addressContacts) {
		this.addressContacts = addressContacts;
	}

}
