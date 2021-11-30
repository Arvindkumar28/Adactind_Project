package com.testng_Basics;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_1 {
	
	@Test
	@Parameters({"username", "password"})

	private void credentials(@Optional("ARVINDKUMAR")String username , String password) {
		
		System.out.println("username: "+ username);
		System.out.println("password: "+ password);
		
		
		
	}

}
