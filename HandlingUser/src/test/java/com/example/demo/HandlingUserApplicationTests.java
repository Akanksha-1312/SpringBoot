package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HandlingUserApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	@DisplayName("Testcase for Authentication of User")
	void userAuthenticate() {
		assertNotNull(App.id);
		assertEquals(App.Defineid,App.id);
	}
	
	@Test
	@DisplayName("Testcase for Authentication of Password")
	void passwordAuthenticate() {
		assertNotNull(App.pass);
		assertEquals(App.Definepass, App.pass);
	}
	
	@BeforeAll
	@DisplayName("First Testcase.")
	static void authenticationTestCase() {
		App.inputID();
	    App.inputPassword();
	    
	    assertNotNull(App.id);
	    assertNotNull(App.pass);		
	}
	
	@AfterAll
	@DisplayName("Last Testcase.")
	static void last() {
		
		if (App.authenticate())
			System.out.println("Authentication Successfull...");
		else System.out.println("Authentication Failed...");
		
		App.id = null;
		App.pass = null;
		
		assertNull(App.id);
		assertNull(App.pass);
	}


}
