package com.robert.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.robert.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	public User findByUserName(String userName);

}
