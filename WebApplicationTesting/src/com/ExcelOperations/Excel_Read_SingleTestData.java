package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_SingleTestData 
{
	

	

	public static void main(String[] args) throws IOException
	{
		//identify the File(Excel File)in the system
		FileInputStream excelTestData=new FileInputStream("C:\\Users\\madhu\\Desktop\\excel\\test.xlsx");
		
		//identify the WorkBook in the File
		Workbook wb=new XSSFWorkbook(excelTestData);
		
		//Identify a particular sheet in the workBook
		Sheet testDataSheet=wb.getSheet("testData");
		for(int index=0;index<=4;index++) {
		
		//identfy the row in the sheet
		Row sheetRow=testDataSheet.getRow(index);
		
		//identify the row of the cell in the Row
		Cell sheetRowOfCell=sheetRow.getCell(index);
		
		//Get the data from the Row of a cell
		String testData=sheetRowOfCell.getStringCellValue();
		
		System.out.println(testData);
		
		FileOutputStream Test =new FileOutputStream(testData);
		wb.write(Test);
		
	}

}
	}
