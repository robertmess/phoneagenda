package com.robert.service;

import java.util.List;

import com.robert.dto.AddressDTO;
import com.robert.entity.AddressContact;
import com.robert.entity.City;
import com.robert.entity.Country;
import com.robert.entity.StreetAddress;
import com.robert.entity.User;

public interface PhoneBookService {
	
	public List<Country> getAllCountries() throws Exception;
	
	public List<City> getCitiesForCountry(Integer countryId) throws Exception;

	void addNewCountry(String countryName) throws Exception;

	public void removeCountry(String countryName) throws Exception;

	public List<StreetAddress> getByContactID(Integer contactID) throws Exception;

	public List<City> getAllCities() throws Exception;

	void  addNewCity(String cityName) throws Exception;

	public void removeCity(String cityName) throws Exception;

	public List<User> getAllUsers() throws Exception;

	void addNewUser(String name) throws Exception;

	public void removeUser(String name) throws Exception;

	public List<StreetAddress> getAllStreetAddress() throws Exception;

	void addNewStreetAddress(AddressDTO addressDTO) throws Exception;

	public List<AddressContact> addNewAddressContact(String addressContactLastName, String addressContactFirstName) throws Exception;

	public List<AddressContact> getAllAddressContact() throws Exception;

	public void removeAddressContact(String addressContactLastName, String addressContactFirstName) throws Exception;

}
