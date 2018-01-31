package com.robert.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.robert.entity.Country;
import com.robert.service.PhoneBookService;

/**
 * face legatura cu browserul; mappeaza urlul tau pe niste clase
 * de java
 * @author robert.mesescu
 *
 */
@RestController 
@RequestMapping("/countries")
public class CountryController {

	private final PhoneBookService phoneBookService;
	
	@Autowired
	public CountryController(PhoneBookService phoneBookService) {
		this.phoneBookService = phoneBookService;
	}
	
	@GetMapping("/getAll")
	public List<Country> getAllCountries() throws Exception {
		return phoneBookService.getAllCountries();
	}
	
	@GetMapping("/add/{countryName}") 
	public void addNewCountry(@PathVariable String countryName) throws Exception {
		phoneBookService.addNewCountry(countryName);
	}
	
	@DeleteMapping("/remove/{countryName}")
	public void removeCountry(@PathVariable String countryName) throws Exception {
		phoneBookService.removeCountry(countryName);
	}	

}
