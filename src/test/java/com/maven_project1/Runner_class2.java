package com.maven_project1;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.SDP.Page_Object_Manager;
import com.helper.File_Reader_Manager;

public class Runner_class2 extends Base_Class {

	public static WebDriver driver = Base_Class.getBrowser("chrome");

	public static WebElement s;

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	static Logger log = Logger.getLogger(Runner_class2.class);

	public static void main(String[] args) throws Throwable {
		
		PropertyConfigurator.configure("log4j.properties");
		log.info("Initilizing Url");
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getURL();
		getURL(url);

		log.info("Initilizing username and Password");
		// String username =
		// File_Reader_Manager.getInstanceFRM().getInstanceCR().getUsername();
		String username = Particular_Excel_Data("C:\\Users\\arvim.000\\eclipse-workspace\\maven_project1\\Adactin.xlsx",
				1, 5);
		InputValue(pom.Login_Page().getUserid(), username);
		// String password =
		// File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
		String password = Particular_Excel_Data("C:\\Users\\arvim.000\\eclipse-workspace\\maven_project1\\Adactin.xlsx",
				2, 5);
		InputValue(pom.Login_Page().getPassword(), password);
		ClickOnElement(pom.Login_Page().getLogin());
		log.info("Booking Session Started");
		log.info("Initilizing Booking");
		String location = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLocation();
		Dropdown("byIndex", pom.Login_Page().getLocation(), location);
		String hotel = File_Reader_Manager.getInstanceFRM().getInstanceCR().getHotel();
		Dropdown("byIndex", pom.Login_Page().getHotels(), hotel);
		String roomtype = File_Reader_Manager.getInstanceFRM().getInstanceCR().getRoomtype();
		Dropdown("byIndex", pom.Login_Page().getRoomtype(), roomtype);
		String room_nos = File_Reader_Manager.getInstanceFRM().getInstanceCR().getRoom_nos();
		Dropdown("byIndex", pom.Login_Page().getRoom_nos(), room_nos);
		String datepickin = File_Reader_Manager.getInstanceFRM().getInstanceCR().getDatepickin();
		clear(pom.Login_Page().getDatepickin());
		InputValue(pom.Login_Page().getDatepickin(), datepickin);
		clear(pom.Login_Page().getDatepickout());
		String datepickout = File_Reader_Manager.getInstanceFRM().getInstanceCR().getDatepickout();
		InputValue(pom.Login_Page().getDatepickout(), datepickout);
		String adult_Room = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAdult_Room();
		Dropdown("byIndex", pom.Login_Page().getAdult_room(), adult_Room);
		String child_Room = File_Reader_Manager.getInstanceFRM().getInstanceCR().getChild_Room();
		Dropdown("byIndex", pom.Login_Page().getChild_room(), child_Room);
		ClickOnElement(pom.Login_Page().submit());
		ClickOnElement(pom.Login_Page().radiobutton());
		ClickOnElement(pom.Login_Page().submit1());
		log.info("Initilizing Personal Informations");
		String firstname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFirstname();
		InputValue(pom.Details_2().getFirst_name(), firstname);
		String lastname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLastname();
		InputValue(pom.Details_2().getsecond_name(), lastname);
		String address = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAddress();
		InputValue(pom.Details_2().getaddress(), address);
		log.info("Initilizing Payment");
		String cardnumber = File_Reader_Manager.getInstanceFRM().getInstanceCR().getcardnumber();
		InputValue(pom.Details_2().getcardnumber(), cardnumber);
		String cctype = File_Reader_Manager.getInstanceFRM().getInstanceCR().getcctype();
		Dropdown("byIndex", pom.Details_2().getcc_type(), cctype);
		String ccmonth = File_Reader_Manager.getInstanceFRM().getInstanceCR().getccmonth();
		Dropdown("byIndex", pom.Details_2().getcc_month(), ccmonth);
		String ccyear = File_Reader_Manager.getInstanceFRM().getInstanceCR().getccyear();
		Dropdown("byIndex", pom.Details_2().getcc_year(), ccyear);
		String cvvnumber = File_Reader_Manager.getInstanceFRM().getInstanceCR().getcvvnumber();
		InputValue(pom.Details_2().getcc_cvv(), cvvnumber);
		ClickOnElement(pom.Details_2().getbook_now());
		Sleep(2000);
		ClickOnElement(pom.Details_2().getbooked());
		log.info("Booking Confirmed");
		ClickOnElement(pom.Details_2().getcheckbox());
		//implicity_wait(30, TimeUnit.SECONDS);
		screenshot();
		ClickOnElement(pom.Details_2().getbutton());
		//implicity_wait(30, TimeUnit.SECONDS);
		AcceptAlert();
		ClickOnElement(pom.Details_2().getlogout());
		ClickOnElement(pom.Details_2().getpage1());
		quit();
		log.info("Booking Session Ended");

	}

}
