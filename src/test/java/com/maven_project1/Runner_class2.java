package com.maven_project1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pom_class.Details;
import com.pom_class.Login_Page;

public class Runner_class2 extends Base_Class {

	public static WebDriver driver  = Base_Class .getBrowser("chrome") ;
	//public static WebDriver driver; // -------> null
	public static WebElement s;
	public static Login_Page lp = new Login_Page(driver);
	public static Details d = new Details(driver);

	public static void main(String[] args) throws InterruptedException, IOException {
		//driver = getBrowser("chrome");
		getURL("https://adactinhotelapp.com/");
		InputValue(lp.getUserid(), "ArvindKumar");
		InputValue(lp.getPassword(), "Arvind0241");
		ClickOnElement(lp.getLogin());
		Dropdown("byIndex", lp.getLocation(), "2");
		Dropdown("byIndex", lp.getHotels(), "3");
		Dropdown("byIndex", lp.getRoomtype(), "3");
		Dropdown("byIndex", lp.getRoom_nos(), "2");
		InputValue(lp.getDatepickin(), "22/11/2021");
		InputValue(lp.getDatepickout(), "25/11/2021");
		Dropdown("byIndex", lp.getAdult_room(), "1");
		Dropdown("byIndex", lp.getChild_room(), "1");
		ClickOnElement(lp.submit());
		ClickOnElement(lp.radiobutton());
		ClickOnElement(lp.submit1());
		InputValue(d.getFirst_name(), "Arvind");
		InputValue(d.getsecond_name(), "Kumar");
		InputValue(d.getaddress(), "No:6524, south Melbourne, View point,Ostrich end");
		InputValue(d.getcardnumber(), "1573904482493415");
		Dropdown("byIndex", d.getcc_type(), "1");
		Dropdown("byIndex", d.getcc_month(), "3");
		Dropdown("byIndex", d.getcc_year(), "12");
		InputValue(d.getcc_cvv(), "452");
		ClickOnElement(d.getbook_now());
		ClickOnElement(d.getbooked());
		ClickOnElement(d.getcheckbox());
		implicity_wait(30, TimeUnit.SECONDS);
		screenshot();
		ClickOnElement(d.getbutton());
		implicity_wait(30, TimeUnit.SECONDS);
		AcceptAlert();
		ClickOnElement(d.getlogout());
		ClickOnElement(d.getpage1());
		quit();

	}

}
