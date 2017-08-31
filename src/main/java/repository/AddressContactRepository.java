package com.robert.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.robert.entity.AddressContact;

@Repository
public interface AddressContactRepository extends JpaRepository<AddressContact, Integer> {

	public List<AddressContact> findByLastNameandFirstName (String addressContactLastName, String addressContactFirstName);
	
}
