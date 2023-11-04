package com.Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class LoginTest
{
     @Parameters("Browser")
     @Test
	public void LoginTest(String browserName) throws MalformedURLException 
	
	{
	System.out.println("The Name of the BrowserName is:-"+browserName);
	
	// Desired Capabilities-its a class
	// Desired Capabilities -it is used to set the browser information and the platform on which
	//                      the test should be excuted-NODE
	
	DesiredCapabilities desiredCapabilities=null;
	
	if(browserName.equals("Chrome")) // information of NODE Remote System
	{
		desiredCapabilities=DesiredCapabilities.chrome();
		desiredCapabilities.setBrowserName("Chrome");
		desiredCapabilities.setPlatform(Platform.WINDOWS);
		
	}
	else 
		if (browserName.equals("edge"))
	{
		
			desiredCapabilities=DesiredCapabilities.edge();
			desiredCapabilities.setBrowserName("edge");
			desiredCapabilities.setPlatform(Platform.WINDOWS);
	}
	
	// RemoteWebdriver-its a class
	// RemoteWebdriver-is used to provide the information related to connecting to HUB server
	//                and the nodes on which the test should be executed
	
	RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.100.5.1:4444/wd/hub"), desiredCapabilities);
	
	// Functionality Test for Browser Compatability and platform Compatability /Cross Browser
	//            and Cross Platform Testing /Distributed Testing 
	
	   String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
	   driver.get(applicationUrlAddress);
	
	
	
	
		
	}
	
}
