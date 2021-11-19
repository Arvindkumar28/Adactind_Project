package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven {

	public static void particular_data() throws IOException {

		System.out.println("Get Particular Data");

		File D = new File("C:\\Users\\arvim.000\\eclipse-workspace\\maven_project1\\Project.xlsx");

		FileInputStream fis = new FileInputStream(D);

		Workbook WB = new XSSFWorkbook(fis);

		Sheet sheetAt = WB.getSheetAt(0);

		Row row = sheetAt.getRow(2);

		Cell cell = row.getCell(1);

		CellType cellType = cell.getCellType();

		if (cellType.equals(cellType.STRING)) {

			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);

		} else if (cellType.equals(cellType.NUMERIC)) {

			double numericCellValue = cell.getNumericCellValue();

			int value = (int) numericCellValue;

			System.out.println(value);

		}

		System.out.println("Get All Data");

	}

	public static void All_Data() throws Throwable {

		File f = new File("C:\\Users\\arvim.000\\eclipse-workspace\\maven_project1\\Project.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);

		Sheet sheetAt = w.getSheetAt(0);

		int NumberOfRows = sheetAt.getPhysicalNumberOfRows();

		for (int i = 0; i < NumberOfRows; i++) {

			Row row = sheetAt.getRow(i);

			int numberOfCells = row.getPhysicalNumberOfCells();

			for (int j = 0; j < numberOfCells; j++) {

				Cell cell = row.getCell(j);

			 CellType cellType = cell.getCellType();

				if (cellType.equals(CellType.STRING)) {

					String value = cell.getStringCellValue();

					System.out.println(value);
				} else if (cellType.equals(CellType.NUMERIC)) {

					double cellValue = cell.getNumericCellValue();

					int value = (int) cellValue;

				}

			}

		}
		System.out.println("Get Row Data");

	}
	
	public static void Row_Data() throws Throwable {


		File f = new File("C:\\Users\\arvim.000\\eclipse-workspace\\maven_project1\\Project.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);

		Sheet sheetAt = w.getSheetAt(0);

		int NumberOfRows = sheetAt.getPhysicalNumberOfRows();

		for (int i = 0; i < NumberOfRows; i++) {

			Row row = sheetAt.getRow(i);

			int numberOfCells = row.getPhysicalNumberOfCells();
			
			Cell cell = row.getCell(1);
			
			CellType cellType = cell.getCellType();

				if (cellType.equals(CellType.STRING)) {

					String value = cell.getStringCellValue();

					System.out.println(value);
				} else if (cellType.equals(CellType.NUMERIC)) {

					double cellValue = cell.getNumericCellValue();

					int value = (int) cellValue;

				}

			}

		System.out.println("Get Column Data");
	}
	
	public static void Column_Data() throws Throwable {
		
		File f = new File("C:\\Users\\arvim.000\\eclipse-workspace\\maven_project1\\Project.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);

		Sheet sheetAt = w.getSheetAt(0);

		Row row = sheetAt.getRow(0);
		
		int numberOfCells = row.getPhysicalNumberOfCells();

		for (int i = 0; i < numberOfCells; i++) {
			
			Cell cell = row.getCell(1);
			
			CellType cellType = cell.getCellType();

				if (cellType.equals(CellType.STRING)) {

					String value = cell.getStringCellValue();

					System.out.println(value);
				} else if (cellType.equals(CellType.NUMERIC)) {

					double cellValue = cell.getNumericCellValue();

					int value = (int) cellValue;

				}

			}
		
	}

	
	public static void main(String[] args) throws Throwable {

		particular_data();
		
		//All_Data();
		
		Row_Data();
		
		Column_Data();
	}

}
