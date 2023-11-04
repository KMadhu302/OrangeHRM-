package com.Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Utility.Log;

public class FaceBookLoginTest
{


	WebDriver driver;
	String applicationUrlAddress="http://facebook.com";
	
	@BeforeTest
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver","./Browserdriverfiles/chromedriver.exe");
		 driver =new ChromeDriver();
		
		//System.out.println("**********chrome browser launched sucessfully************");
		 Log.info("**********chrome browser launched sucessfully************\"");
		 
		 driver.get(applicationUrlAddress);
		//System.out.println("navigate to OrangeHRM application login page");
				
		 Log.info("navigate to OrangeHRM application login page");
				
		 driver.manage().window().maximize();
		 //Implicitly wait -its a Global wait/Smart wait /intelligent wait
		 //Implicitly wait will wait for the every element on the webpage for duration of 10 seconds 
		 //for the element to be identify-once the elemement loaded on the  webpage with the given
		 //property webdriver will immediately Automate the element and will not wait for the 
		 //rest of  the time
		 //this wait is applicable for the driver
		 
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		 //pageLoad TimeOut-The webdriver will wait for the application webpage to be loaded on the 
		 //                browser and will wait for maximum of 30 seconds of the duration -even 
		 //                after the 30 seconds if the application is not loaded on the browser
		 //                the webdiver will through and exception related to page load timeOut
		 driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		 
				
	}
	
 /* @AfterTest
	public void tearDown()
	
	{
		driver.quit();
		Log.info("OrangeHRM application along with chrome Browser Closed");
		//System.out.println("OrangeHRM application along with chrome Browser Closed");
		
	}*/
	@Test
	public void FacebookLoginTest()
	{
		
		//<input type="text" class="inputtext _55r1 _6luy" name="email" 
		//id="email" data-testid="royal_email" placeholder="Email address or phone number"
		//autofocus="1" aria-label="Email address or phone number">
		
		//input[@name='email']
		By emailIdProperty=By.xpath("//input[@name='email']");
	  WebElement 	emailId=driver.findElement(emailIdProperty);
	  emailId.sendKeys("9966569315");
		
	  //<input type="password" class="inputtext _55r1 _6luy _9npi" name="pass" 
	  //id="pass" data-testid="royal_pass"
	  //placeholder="Password" aria-label="Password">
	  
	  //input[@aria-label='Password']
	  
	  By passwordProperty=By.xpath(" //input[@aria-label='Password']");
	  WebElement password=driver.findElement(passwordProperty);
	  password.sendKeys("madhu5");
	  
	  
	  //<button value="1" class="_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy" name="login" 
	  //data-testid="royal_login_button" type="submit" id="u_0_5_04">Log in</button>
	  
	  //button[@type='submit']
	   By loginButtonProperty=By.xpath("//button[@type='submit']");
	   WebElement loginButton=driver.findElement(loginButtonProperty);
	   loginButton.click();
	  
	}
}
