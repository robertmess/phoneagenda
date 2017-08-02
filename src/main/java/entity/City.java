package entity;

public class City {

	private Integer cityID;
	private String cityName;
	private CountryCities countrycities;

	public Integer getCityID() {
		return cityID;
	}

	public void setCityID(Integer cityID) {
		this.cityID = cityID;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public CountryCities getCountrycities() {
		return countrycities;
	}

	public void setCountrycities(CountryCities countrycities) {
		this.countrycities = countrycities;
	}

}
