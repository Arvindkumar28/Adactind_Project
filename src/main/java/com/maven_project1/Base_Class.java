package com.maven_project1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {

	public static WebDriver driver; // -------> Null Driver
	
	public static String value; 

	public static WebDriver getBrowser(String type) {

		try {
			if (type.equalsIgnoreCase("chrome")) {

				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "//Driver//chromedriver.exe");
				driver = new ChromeDriver();

			} else if (type.equalsIgnoreCase("Firefox")) {

				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "//Driver//geckodriver.exe");
				// driver = new geckoDriver();

			}

			driver.manage().window().maximize();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;

	}
	
	public static String Particular_Excel_Data(String path, int row_Index, int cell_Index) throws Throwable {
		
		File D = new File(path);

		FileInputStream fis = new FileInputStream(D);

		Workbook WB = new XSSFWorkbook(fis);

		Sheet sheetAt = WB.getSheetAt(0);

		Row row = sheetAt.getRow(row_Index);

		Cell cell = row.getCell(cell_Index);

		CellType cellType = cell.getCellType();

		if (cellType.equals(cellType.STRING)) {

			value = cell.getStringCellValue();

		} else if (cellType.equals(cellType.NUMERIC)) {

			double numericCellValue = cell.getNumericCellValue();

			int val= (int) numericCellValue;

			value = String.valueOf(val);

		}
		return value;

	}

	public static void implicity_wait(int seconds, TimeUnit format) {

		driver.manage().timeouts().implicitlyWait(seconds, format);

	}

	public static void Explicit_wait(int seconds, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void Fluent_wait() {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(60, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

	}

	public static void screenshot() throws IOException {
		TakesScreenshot ss = (TakesScreenshot) driver;

		File sc = ss.getScreenshotAs(OutputType.FILE);

		File destination = new File(
				"C:\\Users\\arvim.000\\eclipse-workspace\\maven_project1\\Screenshot\\HotelBookingTNG.png");

		FileHandler.copy(sc, destination);
	}

	public static void AcceptAlert() {
		Alert Alert = driver.switchTo().alert();
		Alert.accept();

	}

	public static void RejAlert() {
		Alert Alert = driver.switchTo().alert();
		Alert.dismiss();

	}
	
	public static void frame(String frame) {
		
		try {
			if (frame.equalsIgnoreCase("frame1")) {
				driver.switchTo().frame(0);
			}else if (frame.equalsIgnoreCase("frame2")) {
				
			}else {
				driver.switchTo().defaultContent();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	

	public static void Sleep(int milliseconds) throws InterruptedException {

		try {
			Thread.sleep(milliseconds);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void ClickOnElement(WebElement e) {

		try {
			e.click();
		} catch (Exception b) {
			b.printStackTrace();
		}
	}

	public static void InputValue(WebElement element, String value) {

		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void getURL(String url) {

		driver.get(url);

	}

	public static void scrollupanddown(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void actionClass(String actionName, WebElement element) {
		try {
			Actions a = new Actions(driver);
			if (actionName.equalsIgnoreCase("moveto")) {
				a.moveToElement(element).build().perform();

			} else if (actionName.equalsIgnoreCase("clickon")) {
				a.click(element).build().perform();

			} else if (actionName.equalsIgnoreCase("doubleclick")) {
				a.contextClick(element).build().perform();

			} else if (actionName.equalsIgnoreCase("click")) {
				a.click(element).build().perform();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void minimizewindow() {
		Dimension d = new Dimension(150, 160);
		driver.manage().window().setSize(d);

	}

	public static void Dropdown(String type, WebElement element, String value) {

		Select s = new Select(element);

		try {
			if (type.equalsIgnoreCase("byValue")) {
				s.deselectByValue(value);

			} else if (type.equalsIgnoreCase("byVisibleText")) {
				s.selectByVisibleText(value);
			} else if (type.equalsIgnoreCase("byIndex")) {
				int data = Integer.parseInt(value);
				s.selectByIndex(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}
}
