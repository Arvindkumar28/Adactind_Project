package com.helper;

public class File_Reader_Manager {

	private File_Reader_Manager() {
		// restrict to create object for File Reader manager
	}

	public static File_Reader_Manager getInstanceFRM() {

		File_Reader_Manager reader = new File_Reader_Manager();

		return reader;

	}

	public Configuration_Reader getInstanceCR() throws Throwable {
		
		Configuration_Reader reader = new Configuration_Reader();

		return reader;

	}

}
