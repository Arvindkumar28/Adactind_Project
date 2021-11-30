package com.testng_Basics;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Concept {

//	@Test
//	private void demo() {
//
//		String actual_Username = "ironman";
//
//		String expected_Username = "tony";
//
//		// validation
//
//		Assert.assertEquals(actual_Username, expected_Username);
//
//		System.out.println("Data Validation");
//
//	}
//
//	@Test
//	private void Demo() {
//		
//		String actual_Username = "ironman";
//
//		String expected_Username = "tony";
//
//		// validation
//
//		Assert.assertNotEquals(actual_Username, expected_Username);
//
//		System.out.println("Data Validation");
//
//	}

	private void DeMo() {

		// Verification soft.assertEquals

		String actual_Username = "ironman";

		String expected_Username = "tony";

		SoftAssert soft = new SoftAssert();

		soft.assertEquals(actual_Username, expected_Username);

		System.out.println("Data Validation");

	}

	private void dEmO() {

		// Verification soft.assertNotEquals

		String actual_Username = "ironman";

		String expected_Username = "tony";

		SoftAssert soft = new SoftAssert();

		soft.assertNotEquals(actual_Username, expected_Username);

		System.out.println("Data Validation");

	}

}
