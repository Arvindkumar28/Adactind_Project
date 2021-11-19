package com.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signin_AP {

	public WebDriver driver;

	@FindBy(xpath = "//a[@class='login']")
	private WebElement Signin;

	public WebElement getsignin() {
		return Signin;
	}
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement Mail;

	public WebElement getmailid() {
		return Mail;
	}
	
	@FindBy(xpath = "//input[@id='passwd']")
	private WebElement Password;

	public WebElement getPassword() {
		return Password;
	}
	
	@FindBy(xpath = "//button[@id='SubmitLogin']")
	private WebElement Login;

	public WebElement getLogin() {
		return Login;
	}
	

}
