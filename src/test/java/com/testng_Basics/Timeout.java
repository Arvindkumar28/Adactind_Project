package com.testng_Basics;

import org.testng.annotations.Test;

public class Timeout {

	@Test(timeOut = 7000)
	private void login() throws Throwable {
		
		// Process time to be Bleow the timeOut

		System.out.println("Browser Launch");
		
		Thread.sleep(2000);
		
		System.out.println("User to enter credentials");
		
		System.out.println("Click on Login Button");
		
		Thread.sleep(2000);
		
		System.out.println("Navigate to Home Page");
		
		Thread.sleep(2000);
		
		System.out.println("Perform Operations");

	}

}
