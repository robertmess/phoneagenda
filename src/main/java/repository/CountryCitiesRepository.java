package com.robert.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.robert.entity.CountryCities;

@Repository
public interface CountryCitiesRepository extends JpaRepository<CountryCities, Integer> {
	
	public List<CountryCities> findByCountryID(Integer countryId);
	public List<CountryCities> findByCityID(Integer cityId);
	public CountryCities findByCountryIDAndCityID(Integer countryId, Integer cityId);
	

}
