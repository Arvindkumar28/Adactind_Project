package com.SDP;

import org.openqa.selenium.WebDriver;

import com.pom_class.Booking_AP;
import com.pom_class.Details_2;
import com.pom_class.Login_Page;
import com.pom_class.Signin_AP;

public class Page_Manager {

	public WebDriver driver; // null driver

	// Collection of POM class Objects nd Store it in Private

	private Signin_AP si;
	private Booking_AP b;

	public Page_Manager(WebDriver driver2) {
		this.driver = driver2;
	}

	public Signin_AP Signin_AP() {
		if (si == null) {
			si = new Signin_AP();
		}
		return si;

	}

	public Booking_AP Booking_AP() {
		if (b == null) {
			b = new Booking_AP();
		}

		return b;

	}

}
