package com.robert.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.robert.dto.AddressDTO;
import com.robert.entity.StreetAddress;
import com.robert.service.PhoneBookService;

@RestController 
@RequestMapping("/streetAddress")
public class StreetAddressController {


	private final PhoneBookService phoneBookService;
	
	@Autowired
	public StreetAddressController(PhoneBookService phoneBookService) {
		this.phoneBookService = phoneBookService;
	}
	@GetMapping("/getByContact/{contactID}")
	public List<StreetAddress> getByContactID(@PathVariable Integer contactID) throws Exception {
		return phoneBookService.getByContactID(contactID);}
	
	@GetMapping("/getAll")
	public List<StreetAddress> getAllStreetAddress() throws Exception {
		return phoneBookService.getAllStreetAddress();
	}	
	
	@PostMapping // post-ul spre deosebire de get va avea body, nu mai are nevoie de url, deoarece spring-ul va stii cand apelezi metoda fiind o singura metoda de tip post pe aceasta clasa 
	public void addNewStreetAddress(@RequestBody AddressDTO addressDTO) throws Exception {
		phoneBookService.addNewStreetAddress(addressDTO);
	}
		
}
