package com.robert.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.robert.entity.AddressContactRelationship;

@Repository
public interface AddressContactRelationshipRepository extends JpaRepository<AddressContactRelationship, Integer> {

	public List<AddressContactRelationship> findByAddressContactID(Integer addressContactID);
}
