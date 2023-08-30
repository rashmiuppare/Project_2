package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {
	public static void main(String[] args) throws IOException{
		File f=new File("C:\\Users\\USER\\eclipse-workspace\\Demo_AprilMiniProject_2\\Excel\\Data.xlsx");
		
		FileInputStream fis=new FileInputStream(f); //to read file we use fileInputStream
		Workbook wb=new XSSFWorkbook(fis);
		
		Sheet sheetAt=wb.getSheetAt(0);//index of sheet
		Row row=sheetAt.getRow(4);		//rows in the sheet
		Cell cell=row.getCell(0);		//column in the sheet
		
		CellType cellType = cell.getCellType();		
		if(cellType.equals(CellType.STRING)) {
			
			String stringCellValue=cell.getStringCellValue();
			System.out.println(stringCellValue);
			
			}
		else if(cellType.equals(CellType.NUMERIC)) {
			double numericCellValue=cell.getNumericCellValue();
			
			int value=(int)numericCellValue;
			System.out.println(value);
		}
	}

}
