package com.robert.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.robert.entity.StreetAddress;

@Repository
public interface StreetAddressRepository extends JpaRepository<StreetAddress, Integer> {

	public List<StreetAddress> findByStreetName(String streetName);
	public StreetAddress findByStreetNumber(Integer streetNumber);
	
}
