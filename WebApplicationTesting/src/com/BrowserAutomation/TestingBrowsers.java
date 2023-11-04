package com.BrowserAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestingBrowsers {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./Browserdriverfiles/chromedriver.exe");
				ChromeDriver chromeDriver =new ChromeDriver();
				
              chromeDriver.get("https://google.com");
				
				chromeDriver.get("http://bing.com");
				
				chromeDriver.quit();			 
	}
				
			

				
}
