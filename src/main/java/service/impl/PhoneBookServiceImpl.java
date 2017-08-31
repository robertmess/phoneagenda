package com.robert.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.robert.dto.AddressDTO;
import com.robert.entity.AddressContact;
import com.robert.entity.AddressContactRelationship;
import com.robert.entity.City;
import com.robert.entity.Country;
import com.robert.entity.CountryCities;
import com.robert.entity.StreetAddress;
import com.robert.entity.User;
import com.robert.repository.AddressContactRelationshipRepository;
import com.robert.repository.AddressContactRepository;
import com.robert.repository.CityRepository;
import com.robert.repository.CountryCitiesRepository;
import com.robert.repository.CountryRepository;
import com.robert.repository.StreetAddressRepository;
import com.robert.repository.UserRepository;
import com.robert.service.PhoneBookService;

@Service
public class PhoneBookServiceImpl implements PhoneBookService {
	
	private final CountryRepository countryRepository;
	private final AddressContactRelationshipRepository addressContactRelationshipRepository;
	private final CityRepository cityRepository;
	private final UserRepository userRepository;
	private final StreetAddressRepository streetAddressRepository;
	private final CountryCitiesRepository countryCitiesRepository;
	private final AddressContactRepository addressContactRepository;
	
	@Autowired
	public PhoneBookServiceImpl(CountryRepository countryRepository, 
			AddressContactRelationshipRepository addressContactRelationshipRepository,
			CityRepository cityRepository,
			UserRepository userRepository,
			StreetAddressRepository streetAddressRepository,
			CountryCitiesRepository countryCitiesRepository,
			AddressContactRepository addressContactRepository) {
		
		this.countryRepository = countryRepository;
		this.addressContactRelationshipRepository = addressContactRelationshipRepository;
		this.cityRepository = cityRepository;
		this.userRepository = userRepository;
		this.streetAddressRepository = streetAddressRepository;
		this.countryCitiesRepository = countryCitiesRepository;
		this.addressContactRepository = addressContactRepository;
	
	}

	@Override
	public List<Country> getAllCountries() throws Exception {
		return this.countryRepository.findAll();
	}

	@Override
	public List<City> getCitiesForCountry(Integer countryId) throws Exception {
		return null;
	}
	
	@Override
	public void addNewCountry(String countryName) throws Exception {
		Objects.requireNonNull(countryName, "country name cannot be null.");
	    Country country =  countryRepository.findByCountryName(countryName);
	    if (country != null){
	    	throw new Exception("country name allready exists");
	    }
	    country = new Country();
	    country.setCountryName(countryName);
	    countryRepository.save(country);
	}

	@Override
	public void removeCountry(String countryName) throws Exception {
        Country country = countryRepository.findByCountryName(countryName);
        if (country != null){
    		countryRepository.delete(country);
	    }
	}

	@Override
	public List<StreetAddress> getByContactID(Integer contactID) throws Exception {
		List<AddressContactRelationship> addressContactRelationshipList = addressContactRelationshipRepository.findByAddressContactID(contactID);
		List<StreetAddress> streetAddressList = new ArrayList<>();
		for(AddressContactRelationship rel : addressContactRelationshipList) {
			streetAddressList.add(rel.getStreetAddress());
		}
		return streetAddressList;
	}

	@Override
	public List<City> getAllCities() throws Exception {
		return this.cityRepository.findAll();
	}

	@Override
	public void addNewCity(String cityName) throws Exception {
		Objects.requireNonNull(cityName, "city name cannot be null");
		City city = cityRepository.findByCityName(cityName);
		if(city != null){
			throw new Exception("city name allready exists");
		}
		city = new City();
		city.setCityName(cityName);
		cityRepository.save(city);	
	}

	@Override
	public void removeCity(String cityName) throws Exception {
		City city = cityRepository.findByCityName(cityName);
		if (city != null){
			cityRepository.delete(city);
		}
		
	}

	@Override
	public List<User> getAllUsers() throws Exception {
		return this.userRepository.findAll();
	}

	@Override
	public void addNewUser(String name) throws Exception {
		Objects.requireNonNull(name, "city name cannot be null");
		User user = userRepository.findByUserName(name);
		if(user != null){
			throw new Exception("user name allready exists");
		}
		user = new User();
		user.setUserName(name);
		userRepository.save(user);	
		
	}

	@Override
	public void removeUser(String name) throws Exception {
		User user = userRepository.findByUserName(name);
		if (user != null){
			userRepository.delete(user);
		}
	}

	@Override
	public List<StreetAddress> getAllStreetAddress() throws Exception {
		return this.streetAddressRepository.findAll();
	}

	@Override
	public void addNewStreetAddress(AddressDTO addressDTO) throws Exception {
		StreetAddress streetAddress = new StreetAddress();
		streetAddress.setStreetName(addressDTO.getStreetName());
		streetAddress.setStreetNumber(addressDTO.getStreetNumber());
		streetAddress.setZIP(addressDTO.getZIP());
		Integer countryCitiesID = null;
		City city = cityRepository.findByCityName(addressDTO.getCityName());
		Country country = countryRepository.findByCountryName(addressDTO.getCountryName());
		if(city == null || country == null){
			throw new Exception("could not find country or city");
		}
		CountryCities countryCities = countryCitiesRepository.findByCountryIDAndCityID(country.getCountryID(), city.getCityID());
		if(countryCities ==  null){
			throw new Exception("could not find country-city");
		}
		countryCitiesID = countryCities.getCountryCitiesID();
		
		streetAddress.setCountryCitiesID(countryCitiesID);
		streetAddressRepository.save(streetAddress);	
		
	}

	@Override
	public List<AddressContact> addNewAddressContact(String addressContactLastName, String addressContactFirstName) throws Exception {
		Objects.requireNonNull(addressContactLastName, "contact first name cannot be null.");
		Objects.requireNonNull(addressContactLastName, "contact last name cannot be null.");
		addressContact = (List<AddressContact>) new AddressContact();
		addressContact.set;
			
		addressContactRepository.save(addressContact);
	}

	@Override
	public List<AddressContact> getAllAddressContact() throws Exception {
		
		return this.addressContactRepository.findAll();
		
	}

	@Override
	public void removeAddressContact(String addressContactLastName, String addressContactFirstName) throws Exception {
		
		List<AddressContact> addressContact = addressContactRepository.findByLastNameandFirstName(addressContactLastName, addressContactFirstName);
		if(addressContact != null){
			addressContactRepository.delete(addressContact);
		}
		
	}
	
}
