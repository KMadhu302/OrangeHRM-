package com.BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Utility.Log;

public class BaseTest 

{
	WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
	
	@BeforeTest
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver","./Browserdriverfiles/chromedriver.exe");
		 driver =new ChromeDriver();
		
		//System.out.println("**********chrome browser launched sucessfully************");
		Log.info("**********chrome browser launched sucessfully************");
				driver.get(applicationUrlAddress);
				System.out.println("navigate to OrangeHRM application login page");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
	}
	@AfterTest
	public void tearDown()
	
	{
		driver.quit();
		Log.info("OrangeHRM application along with chrome Browser Closed");
		//System.out.println("OrangeHRM application along with chrome Browser Closed");
		
	}

}
