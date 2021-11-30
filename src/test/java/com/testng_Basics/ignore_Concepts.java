package com.testng_Basics;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ignore_Concepts {

	@Test
	private void dress() {

		System.out.println("Dress");

	}

	@Test
	private void WomenTshirts() {

		System.out.println("Tshirts");

	}

	@Ignore
	@Test
	private void books() {

		System.out.println("Books");

	}
	@Test(enabled = false)
	private void children() {

		System.out.println("Children");

	}

}
