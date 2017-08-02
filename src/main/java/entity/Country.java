package entity;

public class Country {

	private Integer countryID;
	private String countryName;
	private CountryCities countryCities;

	public Integer getCountryID() {
		return countryID;
	}

	public void setCountryID(Integer countryID) {
		this.countryID = countryID;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public CountryCities getCountryCities() {
		return countryCities;
	}

	public void setCountryCities(CountryCities countryCities) {
		this.countryCities = countryCities;
	}

}
