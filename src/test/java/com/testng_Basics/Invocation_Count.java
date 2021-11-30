package com.testng_Basics;

import org.testng.annotations.Test;

public class Invocation_Count {

	@Test(priority = -1)
	private void Browser() {

		System.out.println("Browser Launch");

	}
	@Test(invocationCount = 3)
	private void Refresh() {

		System.out.println("Refresh");

	}
	@Test(priority = 1)
	private void Click() {

		System.out.println("Click");

	}
}
