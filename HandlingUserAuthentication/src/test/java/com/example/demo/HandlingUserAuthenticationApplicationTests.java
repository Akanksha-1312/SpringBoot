package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.example.demo.entity.UserAuthentication;
import com.example.demo.repository.Check;
import com.example.demo.repository.UserRepository;

@SpringBootTest
class HandlingUserAuthenticationApplicationTests {

	@Autowired
	ApplicationContext context;
	@Test
	void contextLoads() {
	}
	@Test
	void check2(){
		String name="abc";
		String password="xyz";
		Check obj=new Check();
		obj.CheckUser(name, password);
		
	
	}
	
	
	
	
	@Test
	void check1(){
		String name="abc";
		String password="xyz";
		UserRepository repo = context.getBean(UserRepository.class);
		List<UserAuthentication> user = (List<UserAuthentication>) repo.findAll();
		int c=0;
		for(UserAuthentication i:user) {
			if (name.equals(i.getUsername()) && password.equals(i.getPassword())){
				c++;
			}
				}
			if(c!=0) {
				System.out.println("Valid User");
			}
			else
		System.out.println(" INVALID USER !!!!!!");		
		
		
		
	}
	@Test
	void readUser() {
		UserRepository repo = context.getBean(UserRepository.class);
		
		Optional<UserAuthentication> optionalProduct = repo.findById(1);
		if (optionalProduct.isPresent()) {
			UserAuthentication product = optionalProduct.get();
			System.out.println(product);
		}
	}
	@Test
	void saveProduct() {
		UserRepository repo = context.getBean(UserRepository.class);
		
		UserAuthentication product = new UserAuthentication();
		product.setPassword("156");
		product.setUsername("done");
		
		
		repo.save(product);
		
	}

}
