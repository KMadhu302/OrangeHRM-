package com.AssignmentOfOHRMMadhu;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginAndValidatingOfAddEmployee 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
		
	   // File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   // FileUtils.copyFile(screenShot,new File(("./ScreenShots/OHRMHomePage.png")));
	 
		//<input name="txtUsername" id="txtUsername" type="text">
		String usernameTestData="admin";
		By usernameProperty=By.name("txtUsername");
		WebElement  userName=driver.findElement(usernameProperty);
		userName.sendKeys(usernameTestData);
	
			//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		String passwordTestData="Madhu@123";
		By passwordProperty=By.name("txtPassword");
		WebElement password=driver.findElement(passwordProperty);
		password.sendKeys(passwordTestData);
		
		//<input type="submit" name="Submit" bclass="button" id="btnLogin" value="LOGIN">
		
		//driver.findElement(By.id("btnLogin")).click();
		 By loginProperty=By.name("Submit");
		  WebElement login=driver.findElement(loginProperty);
         login.click();

 	    File screenShot1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 	    FileUtils.copyFile(screenShot1,new File(("./ScreenShots/OHRMHomePage1.png")));
 	 
		//Expected login page title
		String expected_loginPageTitle=driver.getTitle();
		System.out.println("The Expected login page Title is:-"+expected_loginPageTitle);
		
		//Actual login page Title
		 String actual_loginPageTitle=driver.getTitle();
		 System.out.println("The Actual Login page Title is:-"+actual_loginPageTitle);
		 
	if (actual_loginPageTitle.equals(expected_loginPageTitle))
	{
		System.out.println("The actual login page title is MATCHED:-PASS");
	}
	else
	{
		System.out.println("The expected login page title is NOT MATCHED:-FAIL");
	}
	System.out.println();
	System.out.println("********************");
	System.out.println();
		
		//<b>PIM</b>
		
		By pimProperty=By.linkText("PIM");
		WebElement pim=driver.findElement(pimProperty);
		pim.click();
		
		//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
		
		By addEmployeePropery=By.linkText("Add Employee");
		WebElement addEmployee=driver.findElement(addEmployeePropery);
		addEmployee.click();
		//<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
		
		String firstNameTestData="K";
		By firstNameProperty=By.name("firstName");
		WebElement firstName=driver.findElement(firstNameProperty);
		firstName.sendKeys(firstNameTestData);
		
		//<input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">
		String middleNameTestData="madhu";
		By middleNameProperty=By.name("middleName");
		WebElement middleName=driver.findElement(middleNameProperty);
		middleName.sendKeys(middleNameTestData);
		
		//<input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
		
		String  lastNameTestData="madhu01";
		By lastNameProperty=By.name("lastName");
		WebElement lastName=driver.findElement(lastNameProperty);
		lastName.sendKeys(lastNameTestData);

	    File screenShot2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(screenShot2,new File(("./ScreenShots/OHRMHomePage2.png")));
	 
		
		//<input class="formInputText valid" maxlength="10" type="text" name="employeeId" value="0001" id="employeeId">
	

		By employeeIdProerty=By.name("employeeId");
		WebElement employeeId=driver.findElement(employeeIdProerty);
		String expected_employeeId=employeeId.getAttribute("value");
		
		
		System.out.println("The value of the Employee id is:-"+expected_employeeId);
		
		//<input type="button" class="" id="btnSave" value="Save">
		By saveProperty=By.id("btnSave");
		WebElement save=driver.findElement(saveProperty);
		save.click();
		
		//Expected add employee page
		String expected_addEmployeeId=driver.getTitle();
		System.out.println("The expected of add employeeId is:-"+expected_addEmployeeId);
		
		String actual_addEmployeeId=driver.getTitle();
		System.out.println("The actual of addemployeeId is:-"+actual_addEmployeeId);
		
		if(actual_addEmployeeId.equals(expected_addEmployeeId))
		{
			System.out.println("The excpected add employeeId is MATCHED:-PASS ");
		}
		else
		{
			System.out.println("The acual add employeeId is NOT MATCHED;-FAIL");
			
		}
		//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		
		 By welcomeProperty=By.linkText("Welcome Admin");
		  WebElement welcome=driver.findElement(welcomeProperty);
		  welcome.click();	
		  
		  //<li><a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a></li>
	       //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
		  
		   Thread.sleep(10000);
		   
		    By logOutProperty=By.linkText("Logout");
		    WebElement logOut=driver.findElement(logOutProperty);
		    logOut.click();     
		    
		    driver.close();

		 	    
			
		
		
	}

}
