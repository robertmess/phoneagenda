package entity;

public class StreetAddress {

	private Integer streetAddressID;
	private String street;
	private String streetNumber;
	private Integer countryCitiesID;
	private String ZIP;
	private AddressContactRelationship addressContactRelationship;
	private CountryCities countryCities;

	public Integer getStreetAddressID() {
		return streetAddressID;
	}

	public void setStreetAddressID(Integer streetAddressID) {
		this.streetAddressID = streetAddressID;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public Integer getCountryCitiesID() {
		return countryCitiesID;
	}

	public void setCountryCitiesID(Integer countryCitiesID) {
		this.countryCitiesID = countryCitiesID;
	}

	public String getZIP() {
		return ZIP;
	}

	public void setZIP(String zIP) {
		ZIP = zIP;
	}

	public AddressContactRelationship getAddressContactRelationship() {
		return addressContactRelationship;
	}

	public void setAddressContactRelationship(AddressContactRelationship addressContactRelationship) {
		this.addressContactRelationship = addressContactRelationship;
	}

	public CountryCities getCountryCities() {
		return countryCities;
	}

	public void setCountryCities(CountryCities countryCities) {
		this.countryCities = countryCities;
	}

}
