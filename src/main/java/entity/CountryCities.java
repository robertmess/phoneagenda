package entity;

import java.util.List;

public class CountryCities {

	private Integer countryCitiesID;
	private Integer countryID;
	private Integer cityID;
	private List<StreetAddress> streetAddress;
	private Country country;
	private City city;

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Integer getCountryCitiesID() {
		return countryCitiesID;
	}

	public void setCountryCitiesID(Integer countryCitiesID) {
		this.countryCitiesID = countryCitiesID;
	}

	public Integer getCountryID() {
		return countryID;
	}

	public void setCountryID(Integer countryID) {
		this.countryID = countryID;
	}

	public Integer getCityID() {
		return cityID;
	}

	public void setCityID(Integer cityID) {
		this.cityID = cityID;
	}

	public List<StreetAddress> getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(List<StreetAddress> streetAddress) {
		this.streetAddress = streetAddress;
	}

}
