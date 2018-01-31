package com.robert.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.robert.entity.City;
import com.robert.service.PhoneBookService;

@RestController 
@RequestMapping("/cities")
public class CityController {

	private final PhoneBookService phoneBookService;
	
	@Autowired
	public CityController(PhoneBookService phoneBookService) {
		this.phoneBookService = phoneBookService;
	}
	
	@GetMapping("/getAll")
	public List<City> getAllCountries() throws Exception {
		return phoneBookService.getAllCities();
	}
	
	@GetMapping("/add/{cityName}") 
	public void addNewCity(@PathVariable String cityName) throws Exception {
		phoneBookService.addNewCity(cityName);
	}
	
	@DeleteMapping("/remove/{cityName}")
	public void removeCity(@PathVariable String cityName) throws Exception {
		phoneBookService.removeCity(cityName);
	}
	
}
