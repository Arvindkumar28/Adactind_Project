package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {

	public static void main(String[] args) throws Throwable {
		
		File f = new File("C:\\Users\\arvim\\OneDrive\\Desktop\\Create_Data.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);
		
		w.createSheet("Datas").createRow(0).createCell(0).setCellValue("Email-ID");
		
		w.getSheet("Datas").getRow(0).createCell(1).setCellValue("Password");
		
		w.getSheet("Datas").createRow(1).createCell(0).setCellValue("ArvindKumar");
		
		w.getSheet("Datas").getRow(1).createCell(1).setCellValue("Arvind0241");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		w.write(fos);
		
		w.close();
		
		System.out.println("Completed");
			
		
		
		
		
		
		
		
	}

}
