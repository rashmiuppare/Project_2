package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class CreateNewSheet {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\USER\\eclipse-workspace\\Demo_AprilMiniProject_2\\Excel\\Data.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		
		//wb.createSheet("Rashmi").createRow(0).createCell(0).setCellValue("Glory");
		wb.getSheet("Rashmi").getRow(0).createCell(1).setCellValue("25");
		wb.getSheet("Rashmi").createRow(1).createCell(0).setCellValue("Kala");
		wb.getSheet("Rashmi").getRow(1).createCell(1).setCellValue("24");
		
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		
		System.out.println("Successfull");
	}

}
