package com.ScreenShot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bing_ScreenShot 
{
	public static void main(String[] args) 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./Browserdriverfiles/chromedriver.exe");
		ChromeDriver driver1 =new ChromeDriver();
		 String applicationUrlAddress="http://bing.com";
		 driver1.manage().window().maximize();
	}

}
