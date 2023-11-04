package CapturingTittle;

import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingTittle_BingHomePage 
{
	public static void main(String[] args) 
	{
		// Automating Chrome Browser
		System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// Navigating to Bing HomePage
		String applicationUrlAddress="http://bing.com";
		driver.get(applicationUrlAddress);

		// getting the Bing Home Page Title
				String bingHomePageTitle=driver.getTitle();
				System.out.println(" The title of the Bing Home Page is :- "+bingHomePageTitle);
                 driver.close();

	}

}
