package com.Utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class LoginTest  extends BaseTest
{
	FileInputStream testDataFile;
	XSSFWorkbook workBook;
	XSSFSheet sheet;
     Row testdataRow;
	 
	FileInputStream  propertiesFile;
	Properties properties;
	
	@Test(priority=1,description="validating login test")
	public void loginTest() throws IOException 
	{
	   //identify the excel File
		testDataFile=new FileInputStream("C:\\Users\\madhu\\Desktop\\excel\\test.xlsx");
		workBook=new XSSFWorkbook(testDataFile);
		sheet=workBook.getSheet("validData");
		
		//identify the properties file
		 propertiesFile=new FileInputStream("C:\\Users\\madhu\\Desktop\\AUT\\WebApplicationTesting\\src\\com\\properties\\OHRMApplication.properties");
	      properties=new Properties();
	      properties.load(propertiesFile);
		//get the username test data
	      
	       Row testdataRow=sheet.getRow(1);
	       Cell testdataRowOfCell=testdataRow.getCell(0);
	    
	        String userNameTestData=testdataRowOfCell.getStringCellValue();
	       // String userNameTestData="admin";
	        Log.info("The username:-"+userNameTestData);
	        
	         By userNameproperty=By.name(properties.getProperty("ohrmApplicationLoginUserNameproperty"));
	          WebElement userName=driver.findElement(userNameproperty);
	         userName.sendKeys(userNameTestData);
	         
	         //get the  testdata from the excel file-password
	         
	          Cell passwordTestdataCell=testdataRow.getCell(1);
	          
	         String passwordData= passwordTestdataCell.getStringCellValue();
	         Log.info("The password :-"+passwordData);
	          By passwordProperty=By.id(properties.getProperty("ohrmApplicationLoginPasswordproperty"));
	          WebElement password=driver.findElement(passwordProperty);
	          password.sendKeys(passwordData);
	          
	        By  loginproperty= By.id(properties.getProperty("ohrmApplicationLoginInLoginButtonproperty"));
	        WebElement login=driver.findElement(loginproperty); 
	        login.click();
	        Log.info("Click on Login button");
	        
	        
	        //properties.getProperty("OrangeHRMApplicationTestResultLogFiles\\OHRM.Log");
	        
	       }
	
	@Test(priority=2,description="validating logout test")
	
	public void logoutTest() throws IOException, InterruptedException
	{
		
		 By welcomeProperty=By.id(properties.getProperty("ohrmWelcomeAdminProperty"));
		 
		  WebElement welcome=driver.findElement(welcomeProperty);
		 // welcome.click();
		  
		  String expected_OHRM_applicationHomePageText="Welcome Admin";
		  Log.info("The expected OHRM application Home page text is:-"+expected_OHRM_applicationHomePageText);
		  
		  //System.out.println("The expected OHRM application Home page text is:-"+expected_OHRM_applicationHomePageText);
		  
		   String actual_OHRM_applicationHomePageText=welcome.getText();
		   Log.info("The actual text of ohrm application home page text is:-"+actual_OHRM_applicationHomePageText);
		   
		   //System.out.println("The actual text of ohrm application home page text is:-"+actual_OHRM_applicationHomePageText);
		  
		  if(actual_OHRM_applicationHomePageText.equals(expected_OHRM_applicationHomePageText))
		  	{
			 // System.out.println("sucessfully navigate to ohrm application home page:-PASS");
			  Log.info("sucessfully navigate to ohrm application home page:-PASS");
			  
			  // Cell testResultCell=testdataRow.createCell(3);
			   
			  //testResultCell.setCellValue("successfully navigate to ohrm application home page :-PASS");
			  
		  }
		  else
		  {
			  //System.out.println("failed to  navigate to ohrm application home page:-FAIL");
			  Log.info("failed to  navigate to ohrm application home page:-FAIL");
			  
			 // Cell testResultCell=testdataRow.createCell(3);
			  
			  //testResultCell.setCellValue("failed to  navigate to ohrm application home page :-FAIL");
			  
		  }
		  FileOutputStream testResultFile=new FileOutputStream("C:\\\\Users\\\\madhu\\\\Desktop\\\\excel\\\\test.xlsx");
		  
		  workBook.write(testResultFile);
		  
		  welcome.click();
		  
		  //synchronization
		  Thread.sleep(5000);
		  
		  //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
		 // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
		  
		  By logoutProperty= By.linkText(properties.getProperty("ohrmLinkTextLogoutButtonproperty"));
		   WebElement logout=driver.findElement(logoutProperty);
		   logout.click();
		   Log.info("click on Logout button");

}
}
