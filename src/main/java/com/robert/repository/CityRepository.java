package com.robert.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.robert.entity.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {

		public City findByCityName(String cityName);
	
}
