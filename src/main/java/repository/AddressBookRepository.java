package com.robert.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.robert.entity.AddressBook;

@Repository
public interface AddressBookRepository extends JpaRepository<AddressBook, Integer> {
	
}
