package com.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class CheckAlerts 
{

	WebDriver driver;
	String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
	public void applicationLaunch() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Browserdriverfiles/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		
		//System.out.println("**********chrome browser launched sucessfully************");
		
				driver.get(applicationUrlAddress);
				//System.out.println("navigate to OrangeHRM application login page");
				driver.manage().window().maximize();	
				//Thread.sleep(5000);
				//id="searchBtn"
		 By checkProperty=By.id("searchBtn");
		 WebElement check=driver.findElement(checkProperty);
		 check.click();
		 Alert alert=driver.switchTo().alert();
		  String message=alert.getText();
		  Thread.sleep(5000);
		  System.out.println(message);
		  alert.accept();
		  
		//name="fromPlaceName"
		  String fromData="hyderbad";
		  By fromProerty=By.name("fromPlaceName");
		  WebElement from= driver.findElement(fromProerty);
		  from.sendKeys(fromData);
	}
	public static void main(String[] args) throws InterruptedException
	{
		CheckAlerts alert =new CheckAlerts();
		alert.applicationLaunch();
	
	}
}
