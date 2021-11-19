package com.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Booking_AP {

	public WebDriver driver;

	@FindBy(xpath = "//input[@id='username']")
	private WebElement userid;

	public WebElement getUserid() {
		return userid;
	}
	
//	@FindBy(xpath = "//input[@id='username']")
//	private WebElement userid;
//
//	public WebElement getUserid() {
//		return userid;
//	}
//	
//	@FindBy(xpath = "//input[@id='username']")
//	private WebElement userid;
//
//	public WebElement getUserid() {
//		return userid;
//	}
//	
//	@FindBy(xpath = "//input[@id='username']")
//	private WebElement userid;
//
//	public WebElement getUserid() {
//		return userid;
//	}
//	
//	@FindBy(xpath = "//input[@id='username']")
//	private WebElement userid;
//
//	public WebElement getUserid() {
//		return userid;
//	}
	

}
