package com.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public WebDriver driver;

	@FindBy(xpath = "//input[@id='username']")
	private WebElement userid;

	public WebElement getUserid() {
		return userid;
	}

	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(xpath = "//input[@id='login']")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}

	@FindBy(xpath = "//select[@id='location']")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}

	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement hotels;

	public WebElement getHotels() {
		return hotels;
	}

	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement roomtype;

	public WebElement getRoomtype() {
		return roomtype;
	}
	
	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement room_nos;

	public WebElement getRoom_nos() {
		return room_nos;
	}

	@FindBy(xpath="//input[@id='datepick_in']")
	private WebElement datepickin;
	
	public WebElement getDatepickin() {
		return datepickin;
	}
	@FindBy(xpath="//input[@id='datepick_out']")
	private WebElement datepickout;
	
	public WebElement getDatepickout() {
		return datepickout;
	}

	@FindBy(xpath="//select[@id='adult_room']")
	private WebElement Adult_room;
	
	public WebElement getAdult_room() {
		return Adult_room;
	}
	
	@FindBy(xpath="//select[@id='child_room']")
	private WebElement Child_room;
	
	public WebElement getChild_room() {
		return Child_room;
	}

	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;
	
	public WebElement submit() {
		return submit;
	}
	@FindBy(xpath="//input[@type='radio']")
	private WebElement radiobutton;
	
	public WebElement radiobutton() {
		return radiobutton;
	}
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit1;
	
	public WebElement submit1() {
		return submit1;
	}
	

	public Login_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

}
