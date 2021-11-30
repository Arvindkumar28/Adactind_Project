package com.testng_Basics;

import org.testng.annotations.Test;

public class priority_Test {

	@Test(priority = -1)
	private void setProperty() {
		
		System.out.println("Set Property");

	}
	
	@Test(priority = 0)
	private void Browser() {
		
		System.out.println("Browser Launch");

	}
	
	@Test(priority = 1)
	private void URL() {
		
		System.out.println("URL Launch");

	}
	
	@Test(priority = 2)
	private void Maximize() {
		
		System.out.println("Window Maximize");

	}

}
