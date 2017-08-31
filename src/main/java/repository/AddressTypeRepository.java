package com.robert.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.robert.entity.AddressType;

@Repository
public interface AddressTypeRepository extends JpaRepository<AddressType, Integer> {
	
	public List<AddressType> findByTypeName (String typeName);
	
}
