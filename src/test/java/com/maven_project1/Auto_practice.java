package com.maven_project1;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.SDP.Page_Manager;

public class Auto_practice extends Base_Class {

	public static WebDriver driver = Base_Class.getBrowser("chrome");
	
	public static Page_Manager pom = new Page_Manager(driver);
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		getURL("http://automationpractice.com/index.php");

		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		
		ClickOnElement(signin);
		// Login Page
		WebElement mailid = driver.findElement(By.xpath("//input[@id='email']"));
		InputValue(mailid, "arvimech1995@gmail.com");

		WebElement pass = driver.findElement(By.xpath("//input[@id='passwd']"));
		InputValue(pass, "Arvind@0241");

		WebElement signin1 = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		ClickOnElement(signin1);
		// Shopping Page

		WebElement tshirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		ClickOnElement(tshirt);

		WebElement size = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		ClickOnElement(size);

		WebElement color = driver.findElement(By.xpath("(//input[@type='button'])[2]"));
		ClickOnElement(size);

		WebElement composition = driver.findElement(By.xpath("(//input[@type='checkbox'])[4]"));
		ClickOnElement(composition);

		WebElement style = driver.findElement(By.xpath("(//input[@type='checkbox'])[5]"));
		ClickOnElement(style);

		// Arvindkumar
		
		WebElement cart = driver.findElement(By.xpath("//a[@title='Add to cart']"));
		ClickOnElement(cart);
		
		WebElement checkout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		ClickOnElement(checkout);
		
		WebElement qty = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		ClickOnElement(qty);
		
		WebElement icon = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		ClickOnElement(icon);
		
		WebElement icon2 = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[7]"));
		ClickOnElement(icon2);
		//shipping
		
		WebElement radio = driver.findElement(By.xpath("//input[@type='radio']"));
		ClickOnElement(radio);
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		ClickOnElement(checkbox);
		
		WebElement icon3 = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		ClickOnElement(icon3);
		//payment
		WebElement bankwire = driver.findElement(By.xpath("//a[@class='bankwire']"));
		ClickOnElement(bankwire);
		//submit
		WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		ClickOnElement(submit);
		//back
		WebElement backtoorders = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		ClickOnElement(backtoorders);
		
		

	}

}
