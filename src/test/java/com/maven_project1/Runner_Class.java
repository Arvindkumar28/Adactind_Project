package com.maven_project1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Runner_Class extends Base_Class {
	public static WebDriver driver; // -------> null
	private static WebElement s;

	public static void main(String[] args) throws InterruptedException, IOException {
		driver = getBrowser("chrome");
		getURL("https://adactinhotelapp.com/");
		

		// Login Page
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		InputValue(username, "ArvindKumar");

		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		InputValue(password, "Arvind0241");

		WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
		ClickOnElement(login);

		// Hotel Selection
		WebElement location = driver.findElement(By.id("location"));
		Dropdown("byIndex",location, "2");

		WebElement Hotels = driver.findElement(By.xpath("//select[@id='hotels']"));
		Dropdown("byIndex", Hotels, "3");


		WebElement Roomtype = driver.findElement(By.xpath("//select[@id='room_type']"));
		Dropdown("byIndex", Roomtype, "3");

		WebElement room_nos = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Dropdown("byIndex",room_nos, "2");

		WebElement checkin = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		InputValue(checkin, "22/10/2021");

		WebElement checkout = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		InputValue(checkout, "25/10/2021");

		WebElement Adultroom = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Dropdown("byIndex",Adultroom, "1");

		WebElement childroom = driver.findElement(By.xpath("//select[@id='child_room']"));
		Dropdown("byIndex",childroom, "1");

		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		ClickOnElement(submit);

		WebElement radio = driver.findElement(By.xpath("//input[@type='radio']"));
		ClickOnElement(radio);

		WebElement submit1 = driver.findElement(By.xpath("//input[@type='submit']"));
		ClickOnElement(submit1);

		// Details Fill Up

		WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[11]"));
		InputValue(firstname, "Arvind");

		WebElement secondname = driver.findElement(By.xpath("(//input[@type='text'])[12]"));
		InputValue(secondname, "Kumar");

		WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
		InputValue(address, "No:6524, south Melbourne, View point,Ostrich end");

		WebElement cardnumber = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
		InputValue(cardnumber, "1573904482493415");

		WebElement creditcard = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Dropdown("byIndex",creditcard, "1");

		WebElement cmonth = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Dropdown("byIndex",cmonth, "3");

		WebElement cyear = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Dropdown("byIndex",cyear, "12");

		WebElement cvv = driver.findElement(By.xpath("(//input[@type='text'])[14]"));
		InputValue(cvv, "452");

		WebElement booknow = driver.findElement(By.xpath("//input[@id='book_now']"));
		ClickOnElement(booknow);

		WebElement Booked_Itinerary = driver.findElement(By.xpath("//a[text()='Booked Itinerary']"));
		ClickOnElement(Booked_Itinerary);

		WebElement checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		ClickOnElement(checkbox);

		implicity_wait(30, TimeUnit.SECONDS);

		// Screen Shot

		screenshot();

		// Selection Delection

		WebElement button = driver.findElement(By.xpath("(//input[@type='button'])[1]"));
		ClickOnElement(button);

		implicity_wait(30, TimeUnit.SECONDS);

		AcceptAlert();

		//scrollupandd(button);

		WebElement logout = driver.findElement(By.xpath("//input[@id='logout']"));
		ClickOnElement(logout);

		WebElement page1 = driver.findElement(By.xpath("//a[text()='Click here to login again']"));
		ClickOnElement(page1);

		quit();

	}

}
