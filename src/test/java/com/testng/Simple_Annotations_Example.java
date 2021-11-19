package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Simple_Annotations_Example {
	
	//Before class ----> Before Method ---> Test ----> After Method ---> After Class

	@BeforeClass
	private void url() {
		System.out.println("Launching url");

	}
	
	
	@BeforeMethod
	private void signin() {
		System.out.println("signin");

	}


	@Test
	private void mens() {

		System.out.println("MNS");

	}

	@Test
	private void Women() {

		System.out.println("wms");

	}

	@Test
	private void dress() {

		System.out.println("all");

	}
	

	@AfterMethod
	private void signoff() {
		System.out.println("signout");

	}

	@AfterClass
	private void Homepage() {
		System.out.println("Homepage");

	}
}
