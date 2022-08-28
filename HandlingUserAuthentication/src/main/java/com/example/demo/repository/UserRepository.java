package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.example.demo.entity.UserAuthentication;

public interface UserRepository extends CrudRepository<UserAuthentication, Integer> {
	List<UserAuthentication>findByUsername(String username);
	
	
	
	


}