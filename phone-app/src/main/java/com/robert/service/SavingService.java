package com.robert.service;

import com.robert.dto.AddressContactDTO;
import com.robert.dto.CountryCitiesDTO;

public interface SavingService {

	public void addNewCountryCityRelationship(CountryCitiesDTO countryCitiesDTO) throws Exception;

	public void addNewAddressContact(AddressContactDTO addressContactDTO) throws Exception;

}
