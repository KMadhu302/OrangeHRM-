package com.OHRMApplicationTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Utility.Log;

public class AddEmployeeTest extends BaseTest


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
	        
	         By userNameproperty=By.name(properties.getProperty("ohrmApplicationLoginUserNameproperty"));
	          WebElement userName=driver.findElement(userNameproperty);
	         userName.sendKeys(userNameTestData);
	         
	         //get the  testdata from the excel file-password
	         
	          Cell passwordTestdataCell=testdataRow.getCell(1);
	          
	         String passwordData= passwordTestdataCell.getStringCellValue();
	          By passwordProperty=By.id(properties.getProperty("ohrmApplicationLoginPasswordproperty"));
	          WebElement password=driver.findElement(passwordProperty);
	          password.sendKeys(passwordData);
	          
	        By  loginproperty= By.id(properties.getProperty("ohrmApplicationLoginInLoginButtonproperty"));
	        WebElement login=driver.findElement(loginproperty); 
	        login.click();

}
	@Test(priority=2,description="validating pim in OHRM application home page")
	public void pimTest()
	{
		//id="menu_pim_viewPimModule"
		 By pimProperty=By.id("menu_pim_viewPimModule");
		 WebElement pim=driver.findElement(pimProperty);
		 Actions pimAction=new Actions(driver);
		 pimAction.moveToElement(pim).build().perform();
		
	}
	@Test(priority=3)
	public void pimAddEmployeeTest() 
	{
		
		//id="menu_pim_addEmployee
		 By addEmployeeProperty=By.id("menu_pim_addEmployee");
		  WebElement addEmployee=driver.findElement(addEmployeeProperty);
		  addEmployee.click();
		}
	
	@Test(priority=4)
	public void AddNewEmployeeTest()
	{
		//validating the add employee page
		//id="menu_pim_addEmployee
		 By addEmployeeProperty=By.id("menu_pim_addEmployee");
		WebElement addEmployee=driver.findElement(addEmployeeProperty);
	     addEmployee.click();
		 String expected_OHRMApplicationAddEmployeeText="Add Employee";
		 Log.info("The Expected ohrm Application addEmployee Text:-"+expected_OHRMApplicationAddEmployeeText);
		 //System.out.println("The Expected ohrm Application addEmployee Text:- "+expected_OHRMApplicationAddEmployeeText);
		 String  actual_OHRMApplicationAddEmployeeText=addEmployee.getText();
	}
	@Test(priority=5)
	public void CreatingAddNewEmployeeTest()
	{
		//name="firstName"
		 By firstNameProperty=By.name("firstName");
		  WebElement firstName=driver.findElement(firstNameProperty);
		  firstName.sendKeys("madhu002");
		
		  Actions keyBoardActions=new Actions(driver);
		  keyBoardActions.sendKeys(Keys.TAB).build().perform();
		  
		  //without identifying the middle name properties 
		  //we are able to automate the element-because of the action class object
		  //focus is moved to Middle Name,using the same object directly 
		  //performin operation or automating the Middle name element
		  
		  /*name="middleName"
		  By middleNameProperty= By.name("middleName");
		   WebElement middleName=driver.findElement(middleNameProperty);
		   middleName.sendKeys("hello001");*/
		  
		   keyBoardActions.sendKeys("hello001").build().perform();
		   
		   /*id="lastName"
		    By lastNameProperty=By.id("lastName");
		     WebElement lastName=driver.findElement(lastNameProperty);
		    lastName.sendKeys("chello001");*/
		   
		    keyBoardActions.sendKeys(Keys.TAB).build().perform();
		    
		    keyBoardActions.sendKeys("chello001").build().perform();
		    //id="employeeId"
		     By employeeIdProperty=By.id("employeeId");
		      WebElement employeeId=driver.findElement(employeeIdProperty);
		       String employeeidValue=employeeId.getAttribute("value");
		       Log.info("The value of the employee id is:-"+employeeidValue);
		       //System.out.println("The value of the employee id is:-"The value of the employee id is:+employeeidValue);
		       keyBoardActions.sendKeys(Keys.TAB).build().perform();
		       
		       //focus to the photograph
		       keyBoardActions.sendKeys(Keys.TAB).build().perform();
		       keyBoardActions.sendKeys(Keys.ENTER).build().perform();
		       
		       	
	}
	}
