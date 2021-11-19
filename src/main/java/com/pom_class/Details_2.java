package com.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Details_2{

	public WebDriver driver;

	@FindBy(xpath = "//input[@id='username']")
	private WebElement userid;

	public WebElement getUserid() {
		return userid;
	}

	@FindBy(xpath = "(//input[@type='text'])[11]")
	private WebElement first_name;

	public WebElement getFirst_name() {
		return first_name;
	}

	@FindBy(xpath = "(//input[@type='text'])[12]")
	private WebElement second_name;

	public WebElement getsecond_name() {
		return second_name;
	}

	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement address;

	public WebElement getaddress() {
		return address;
	}

	@FindBy(xpath = "(//input[@type='text'])[13]")
	private WebElement cardnumber;

	public WebElement getcardnumber() {
		return cardnumber;
	}

	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement cc_type;

	public WebElement getcc_type() {
		return cc_type;
	}

	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement cc_month;

	public WebElement getcc_month() {
		return cc_month;
	}

	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement cc_year;

	public WebElement getcc_year() {
		return cc_year;
	}

	@FindBy(xpath = "(//input[@type='text'])[14]")
	private WebElement cc_cvv;

	public WebElement getcc_cvv() {
		return cc_cvv;
	}

	@FindBy(xpath = "//input[@id='book_now']")
	private WebElement book_now;

	public WebElement getbook_now() {
		return book_now;
	}
	
	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	private WebElement booked;

	public WebElement getbooked() {
		return booked;
	}

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement checkbox;

	public WebElement getcheckbox() {
		return checkbox;
	}

	@FindBy(xpath = "(//input[@type='button'])[1]")
	private WebElement button;

	public WebElement getbutton() {
		return button;
	}

	@FindBy(xpath = "//input[@id='logout']")
	private WebElement logout;

	public WebElement getlogout() {
		return logout;
	}

	@FindBy(xpath = "//a[text()='Click here to login again']")
	private WebElement page1;

	public WebElement getpage1() {
		return page1;
	}

	public Details_2(WebDriver driver3) {
		this.driver = driver3;
		PageFactory.initElements(driver, this);
	}

}
