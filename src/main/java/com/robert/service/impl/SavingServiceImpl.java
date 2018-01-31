package com.robert.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.robert.dto.AddressContactDTO;
import com.robert.dto.CountryCitiesDTO;
import com.robert.entity.AddressContact;
import com.robert.entity.City;
import com.robert.entity.Country;
import com.robert.entity.CountryCities;
import com.robert.repository.AddressContactRepository;
import com.robert.repository.CityRepository;
import com.robert.repository.CountryCitiesRepository;
import com.robert.repository.CountryRepository;
import com.robert.service.PhoneBookService;
import com.robert.service.SavingService;

@Service
public class SavingServiceImpl implements SavingService {

	private final CountryCitiesRepository countryCitiesRepository;
	private final CityRepository cityRepository;
	private final CountryRepository countryRepository;
	private final AddressContactRepository addressContactRepository;
	private final PhoneBookService phoneBookService;
	
	@Autowired
	public SavingServiceImpl(CountryCitiesRepository countryCitiesRepository,
			CityRepository cityRepository,
			CountryRepository countryRepository,
			AddressContactRepository addressContactRepository,
			PhoneBookService phoneBookService) {
		this.countryCitiesRepository = countryCitiesRepository;
		this.countryRepository = countryRepository;
		this.cityRepository = cityRepository;
		this.addressContactRepository = addressContactRepository;
		this.phoneBookService = phoneBookService;
	}
	
	/**
	 * Vreau sa salvez un nume nou de tara si de oras, pe care le avem in nomenclatoare deja 
	 * Steps: 
	 * 1. creez un obiect de tip countryCities in care sa imi vars noile salvari, de aceea avem setCityID
	 * 2.Trebuie sa aduc pe baza cityNameului ID-ul, la fel si pentru country 
	 * Fac doua obiecte de country si city si le salvez si imi aduc cityName si ctrName ca sa pot dupa sa le iau ID-ul si sa populez lista.
	 */
	@Override
	public void addNewCountryCityRelationship(CountryCitiesDTO countryCitiesDTO) throws Exception {
		CountryCities countryCities = new CountryCities();
		City city = cityRepository.findByCityName(countryCitiesDTO.getCityName());
		Country country = countryRepository.findByCountryName(countryCitiesDTO.getCountryName());
		if(city == null || country == null){
			throw new Exception("could not find country or city ");
		}
		CountryCities existingCountryCities = countryCitiesRepository.findByCountryIDAndCityID(country.getCountryID(), city.getCityID());
		if(existingCountryCities != null){
			throw new Exception("Country - city rel already exists.");
		}
		countryCities.setCityID(city.getCityID());
		countryCities.setCountryID(country.getCountryID());
		countryCitiesRepository.save(countryCities);
	}
	
	/**
	 * vreau sa salvez o persoana de contact si adresa acesteia
	 * 1. imi aduc numele de strada, numarul si zip-ul
	 * 2. apelez repository de addressContact si dau save pe addressContact.
	 */
	@Override
	public void addNewAddressContact(AddressContactDTO addressContactDTO) throws Exception {
		phoneBookService.addNewStreetAddress(addressContactDTO.getAddressDTO());
		AddressContact addressContact = new AddressContact();
		addressContact.setFirstName(addressContactDTO.getFirstName());
		addressContact.setLastName(addressContactDTO.getLastName());
		addressContact.setCompany(addressContactDTO.getCompany());
		addressContact.setHomePhone(addressContactDTO.getHomePhone());
		addressContact.setWorkPhone(addressContactDTO.getWorkPhone());
		
	}
	

	
	
	
	
	
	
	
	
	
	
}
