package com.robert.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.robert.entity.Country;
import com.robert.properties.DatabaseProperties;

//@Repository
public class CountryDAO {

	private final DatabaseProperties dbProps;

	@Autowired
	public CountryDAO(DatabaseProperties dbProps) {
		super();
		this.dbProps = dbProps;
	}

	public List<Country> getAll() throws Exception {
		List<Country> countries = new ArrayList<>();
		try (Connection dbConn = DriverManager.getConnection(this.dbProps.getUrl(), dbProps.getUsername(),
				dbProps.getPassword());) {
			PreparedStatement ps = dbConn.prepareStatement("select * from country");
			try (ResultSet rs = ps.executeQuery();) {
				while (rs.next()) {
					countries.add(new Country(rs.getInt(1), rs.getString(2)));
				}
			}
		}
		return countries;
	}

	public void deleteCountry(String countryName) throws Exception {
		try (Connection dbConn = DriverManager.getConnection(this.dbProps.getUrl(), dbProps.getUsername(),
				dbProps.getPassword());) {
			PreparedStatement ps = dbConn
					.prepareStatement("delete from country where countryName = ?");
			ps.setString(1, countryName);
			ps.executeUpdate();
		}
//		catch (Exception e) {
//			//log error
//		}
		
	}
	
	public void saveNewCountry(String countryName) throws Exception {
		try (Connection dbConn = DriverManager.getConnection(this.dbProps.getUrl(), dbProps.getUsername(),
				dbProps.getPassword());) {
			PreparedStatement ps = dbConn
					.prepareStatement("insert into country(countryname) values('" + countryName + "')");
			ps.executeUpdate();
		}
	}
	
	public Country getByName(String countryName) throws Exception {
		Country country = null;
		try (Connection dbConn = DriverManager.getConnection(this.dbProps.getUrl(), dbProps.getUsername(),
				dbProps.getPassword());) {
			PreparedStatement ps = dbConn
					.prepareStatement("select * from country where countryName = '" + countryName + "'");
			try(ResultSet rs = ps.executeQuery()) {
				while(rs.next()) {
					country = new Country(rs.getInt(1), rs.getString(2));
				}
			}
		}
		return country;
	}

	public Country getById(Integer countryId) {
		return null;
	};
}
