package com.StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Utility.Log;

import io.cucumber.java.Before;

public class Hooks 
{
	
  WebDriver driver;
  	@Before
   public void setup() 
  {
  	
  		System.setProperty("webdriver.chrome.driver", "./OrangeHRMApplication_CUCUMBER/BrowserDriverFiles/chromedriver.exe");
  		driver=new ChromeDriver();
  		Log.info("****Chrome Browser Successfully Launched ****");
	   
   }
  	public void tearDown() 
  	{
  		driver.quit();
  		Log.info("*****Chrome Browser Along with OrangeHRM Application Closed****");
  		
  	}
	
}
