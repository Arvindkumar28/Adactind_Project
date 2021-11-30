package com.testng_Basics;

import org.testng.annotations.Test;

public class ExpectedExceptions {

	@Test(expectedExceptions = ArithmeticException.class)
	private void Demo() {

		int a = 10;
		
		System.out.println(a / 0);

	}

}
