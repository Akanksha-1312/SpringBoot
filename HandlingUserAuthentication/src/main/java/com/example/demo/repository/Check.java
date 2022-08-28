package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.example.demo.entity.UserAuthentication;

public class Check {
	@Autowired
	ApplicationContext context;
	
	UserRepository repo = context.getBean(UserRepository.class);
	public void CheckUser(String name,String pass){
	
			List<UserAuthentication> user = (List<UserAuthentication>) repo.findAll();
			int c=0;
			for(UserAuthentication i:user) {
				if (name.equals(i.getUsername()) && pass.equals(i.getPassword())){
					c++;
				}
					}
				if(c!=0) {
					System.out.println("Valid User");
				}
				else
			System.out.println(" INVALID USER !!!!!!");		
			
			


}}
