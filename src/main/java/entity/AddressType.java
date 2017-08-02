package entity;

import java.util.List;

public class AddressType {

	private Integer addressTypeID;
	private String typeName;
	private List<AddressContactRelationship> addressContactsRelationship;
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
	public List<AddressContactRelationship> getAddressContactsRelationship() {
		return addressContactsRelationship;
	}
	public void setAddressContactsRelationship(List<AddressContactRelationship> addressContactsRelationship) {
		this.addressContactsRelationship = addressContactsRelationship;
	}
	
	
	
}
