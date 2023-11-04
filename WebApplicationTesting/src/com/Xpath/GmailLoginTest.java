package com.Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Utility.Log;

public class GmailLoginTest 
{

	WebDriver driver;
	String applicationUrlAddress="http://gmail.com";
	
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
	public void gmailLoginTest() 
	{
		
		//<input type="email" class="whsOnd zHQkBf" jsname="YPqjbf" 
		//autocomplete="username" spellcheck="false" tabindex="0" aria-label="Email or phone"
		//name="identifier" value="" autocapitalize="none" 
		//id="identifierId" dir="ltr" data-initial-dir="ltr" data-initial-value="">
		
		//input[@jsname='YPqjbf' and @id='identifierId']
		 By emailIdProperty=By.xpath("//input[@jsname='YPqjbf' and @id='identifierId']");
		 WebElement emailId=driver.findElement(emailIdProperty);
		 emailId.sendKeys("madhu6303753966@gmail.com");
		 
		 //<span jsname="V67aGc" class="VfPpkd-vQzf8d">Next</span>
		 
		 //span[text()='Next']
		  By nextButtonProperty=By.xpath(" //span[text()='Next']");
		  WebElement nextButton= driver.findElement(nextButtonProperty);
		  nextButton.click();
		  
		
	}
}
