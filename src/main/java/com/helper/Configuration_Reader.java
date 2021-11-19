package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;// ----> Null

	public Configuration_Reader() throws Throwable {

		File f = new File(
				"C:\\Users\\arvim.000\\eclipse-workspace\\maven_project1\\src\\main\\java\\com\\properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);

		p = new Properties(); // ----> Null

		p.load(fis);

	}

	public String getURL() {

		String url = p.getProperty("URL");

		return url;

	}

	public String getUsername() {

		String Username = p.getProperty("Username");

		return Username;

	}

	public String getPassword() {

		String Password = p.getProperty("Password");

		return Password;

	}

	public String getLocation() {

		String Location = p.getProperty("Location");

		return Location;

	}

	public String getHotel() {

		String Hotel = p.getProperty("Hotel");

		return Hotel;

	}

	public String getRoomtype() {

		String Roomtype = p.getProperty("Roomtype");

		return Roomtype;

	}

	public String getRoom_nos() {

		String Room_nos = p.getProperty("Room_nos");

		return Room_nos;

	}

	public String getDatepickin() {

		String Datepickin = p.getProperty("Datepickin");

		return Datepickin;

	}

	public String getDatepickout() {

		String Datepickout = p.getProperty("Datepickout");

		return Datepickout;

	}

	public String getAdult_Room() {

		String Adult_Room = p.getProperty("Adult_Room");

		return Adult_Room;

	}

	public String getChild_Room() {

		String Child_Room = p.getProperty("Child_Room");

		return Child_Room;

	}

	public String getFirstname() {

		String Firstname = p.getProperty("Firstname");

		return Firstname;

	}

	public String getLastname() {

		String LastName = p.getProperty("LastName");

		return LastName;

	}

	public String getAddress() {

		String Address = p.getProperty("Address");

		return Address;

	}

	public String getcardnumber() {

		String cardnumber = p.getProperty("cardnumber");

		return cardnumber;

	}

	public String getcctype() {

		String cctype = p.getProperty("cctype");

		return cctype;

	}

	public String getccmonth() {

		String ccmonth = p.getProperty("ccmonth");

		return ccmonth;

	}

	public String getccyear() {

		String ccyear = p.getProperty("ccyear");

		return ccyear;

	}

	public String getcvvnumber() {

		String cvvnumber = p.getProperty("cvvnumber");

		return cvvnumber;

	}

}
