package com.ExcelOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadData 

{

	  WebDriver driver;
	    String applicationUrlAddrss="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";


		public void applicationLaunch() throws IOException
		{
			
			System.setProperty("webdriver.chrome.driver","./Browserdriverfiles/chromedriver.exe");
			ChromeDriver driver =new ChromeDriver();
			
		     driver.get(applicationUrlAddrss);
		    driver.manage().window().maximize();
		    
		    FileInputStream data=new FileInputStream("C:\\Users\\madhu\\Desktop\\excel\\test.xlsx");
		    XSSFWorkbook workBook=new XSSFWorkbook(data);
		    XSSFSheet sheet=workBook.getSheet("validData");
		    
		     int rowCount=sheet.getLastRowNum();
		     for(int index=1;index<=rowCount;index++) 
		    	 
		     {
		    	 
		    	    XSSFRow row=sheet.getRow(1);
		    	    String uName=row.getCell(0).getStringCellValue();
		    	    String password=row.getCell(1).getStringCellValue();
		    	    //id="txtUsername"
		    	    driver.findElement(By.id("txtUsername")).sendKeys(uName);
		    	    //id="txtPassword"
		    	    driver.findElement(By.id("txtPassword")).sendKeys(password);
		    	    //name="Submit"
		    	    driver.findElement(By.name("Submit")).click();
		    	    //File screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    	    //FileUtils.copyFile(screenShot, new File("./ScreenShots/ohrm.png"));
		    	
	    String message=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[5]/span")).getText();
	  
	   
	    if(message.equalsIgnoreCase("validUser"))
	  {
		  sheet.getRow(1).createCell(2).setCellValue("pass");
		  
	 }
	  else
	  
	  {
		  sheet.getRow(1).createCell(2).setCellValue("fail");
		   
	  }
	     FileOutputStream file=new FileOutputStream("C:\\\\Users\\\\madhu\\\\Desktop\\\\excel\\\\test.xlsx");
	     
	  workBook.write(file);
	  driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard");
	  
     }
		    
					
  }
		public static void main(String[] args) throws IOException {
			
			ReadData data=new ReadData();
			data.applicationLaunch();
		}
		
		}
			
			
		
			


