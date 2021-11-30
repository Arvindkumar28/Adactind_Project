package com.annotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo_Class {

	@Test(retryAnalyzer = Retry_Class.class)
	private void username() {

		String username = "Arvind";

		String Actual_username = "Arvind";

		Assert.assertEquals(Actual_username, username);

	}

	@Test(retryAnalyzer = Retry_Class.class)
	private void pass() {

		String pass = "Arvind2802";

		String Actual_pass = "Arvind2802";

		Assert.assertEquals(Actual_pass, pass);

	}

}
