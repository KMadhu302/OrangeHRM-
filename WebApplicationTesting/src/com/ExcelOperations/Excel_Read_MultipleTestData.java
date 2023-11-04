package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.eventusermodel.dummyrecord.LastCellOfRowDummyRecord;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class Excel_Read_MultipleTestData 
{

	public static void main(String[] args) throws IOException
	{
		
        FileInputStream excelData=new FileInputStream("C:\\Users\\madhu\\Desktop\\excel\\test.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(excelData);
		
		XSSFSheet sheet=workbook.getSheet("testData");
		
		//identify the number of rows in the active sheet
		int  rowsCount=sheet.getLastRowNum();
		
		//to get every active row of the sheet
		for(int rowindex=0;rowindex<rowsCount;rowindex++) {
			
			 Row row=sheet.getRow(rowindex);
			 
		//in the row -identify the  number of active cells 
			  int rowOfCellCount=row.getLastCellNum();
		
		 //to go to active row of all the active cells
		for(int rowOfCellindex=0;rowOfCellindex<rowOfCellCount; rowOfCellindex++) 
		{
			//going to particular row of active of active row cell
				
			 Cell rowOfCell=row.getCell(rowOfCellindex);
			 
			 //get the Value from the active row of the active cell
			  String testData=rowOfCell.getStringCellValue();
	
		
		System.out.println(testData);
		}
				
	}
		
	}
	
	}

		