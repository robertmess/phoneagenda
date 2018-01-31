package com.robert.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.robert.entity.AddressContact;

@Repository
public interface AddressContactRepository extends JpaRepository<AddressContact, Integer> {

	/**
	 * vreau sa aduc o lista de address contact pe baza userName, hence trebuie sa trec prin addressbook ca sa aung la user 
	 * findByAddressBook apeleaza campul addressBook din addressContact
	 * findByCampulDeCareAveaiNevoie
	 */
	public List<AddressContact>  findByAddressBookUserUserName (String username);
}
