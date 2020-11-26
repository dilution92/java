package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.domain.User;

@Repository
public interface UserRepository {
	// create
	int createUser(User user);
	
	// read
	User findById(long id);
	List<User> findAll();
	
	// update
	int updateUser(User user);
	
	// delete
	int deleteUser(long id);
}
