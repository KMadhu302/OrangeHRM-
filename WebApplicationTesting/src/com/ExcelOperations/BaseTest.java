package com.ExcelOperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest 
{
	WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
	
	@BeforeTest
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver","./Browserdriverfiles/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		
		//System.out.println("**********chrome browser launched sucessfully************");
		
				driver.get(applicationUrlAddress);
				System.out.println("navigate to OrangeHRM application login page");
				driver.manage().window().maximize();
				
	}
	
	@AfterTest
	public void tearDown()
	
	{
		driver.quit();
		System.out.println("OrangeHRM application along with chrome Browser Closed");
		
	}

}
