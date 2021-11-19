package com.SDP;

import org.openqa.selenium.WebDriver;

import com.pom_class.Details_2;
import com.pom_class.Login_Page;

public class Page_Object_Manager {

	public WebDriver driver; // null driver

	// Collection of POM class Objects nd Store it in Private

	private Login_Page lp;
	private Details_2 d;

	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
	}
	
	

	public Login_Page Login_Page() {
		if (lp == null) {
			lp = new Login_Page(driver);
		}
		return lp;

	}
	
	public Details_2 Details_2() {
		if (d == null) {
			d = new Details_2(driver);
		}

		return d;
		
	}

}
