package com.robert.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.robert.entity.AddressContact;
import com.robert.service.PhoneBookService;

@RestController 
@RequestMapping("/contactAddress")
public class AddressContactController {

	private final PhoneBookService phoneBookService;
	
	@Autowired
	public AddressContactController(PhoneBookService phoneBookService) {
		this.phoneBookService = phoneBookService;
	}
	
	@GetMapping("/getAll")
	public List<AddressContact> getAllCAddressContact() throws Exception {
		return phoneBookService.getAllAddressContact();
	}
	
	@GetMapping("/add/{addressContactName}") 
	public void addAddressContact(@PathVariable String addressContactName) throws Exception {
		phoneBookService.addAddressContact(addressContactName);
	}
	
	@DeleteMapping("/remove/{cityName}")
	public void removeAddressContact(@PathVariable String addressContactName) throws Exception {
		phoneBookService.removeAddressContact(addressContactName);
	}
}
