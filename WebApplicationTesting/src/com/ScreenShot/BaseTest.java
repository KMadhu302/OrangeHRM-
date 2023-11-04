package com.ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest

{
	WebDriver driver;
	String applicationUrlAddress="http://bing.com";
	public void applicationLaunch() throws IOException
{
		System.setProperty("webdriver.chrome.driver","./Browserdriverfiles/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		//System.out.println("**********chrome browser launched sucessfully************");
		driver.get(applicationUrlAddress);
		
		 File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(screenShot,new File("./ScreenShots/BingHomePage.png"));
	
		driver.manage().window().maximize();
		
	}
	public void applicationClose()
	{
		driver.quit();
		System.out.println("*********chrome browser will be closed*********");
	}
	
public static void main(String[] args) throws IOException
{
	BaseTest test=new BaseTest();
	test.applicationLaunch();
	test.applicationClose();
	
}
}