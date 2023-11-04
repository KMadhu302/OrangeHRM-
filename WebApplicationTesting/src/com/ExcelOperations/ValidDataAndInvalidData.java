package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidDataAndInvalidData 
{
	
	FileInputStream testDataFile;
	XSSFWorkbook workBook;
	XSSFSheet testDataSheet;
	Row testDataRow;
    
     public void loginTest() throws IOException 
     {
          testDataFile =new FileInputStream("C:\\Users\\madhu\\Desktop\\excel\\test.xlsx");
          
    	 workBook=new XSSFWorkbook(testDataFile);
    	 
    	 testDataSheet=workBook.getSheet("testData");
    	 
    	 //getting the username TestData
    	 testDataRow=testDataSheet.getRow(1);
    	 
    	  Cell cellUserNameTestData=testDataRow.getCell(0);
    	   String UserName=cellUserNameTestData.getStringCellValue();
    	   //String UserName="admin";
    	   
    	   	
    			   
     }
     
}
