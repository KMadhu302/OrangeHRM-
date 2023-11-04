package ValidatingTitle;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ValidatingTitle_BingHomePage 
{
	private static RemoteWebDriver driver;

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./Browserdriverfiles/chromedriver.exe");
		ChromeDriver chromeDriver =new ChromeDriver();
		
		//navigate to bing home page
		String applicationUrlAddress="http://bing.com";
		chromeDriver.get(applicationUrlAddress);
		
		// Expected bing home page:-client Requirement
		 String expected_BingHomePageTitle="Bing";
		 System.out.println("The  expected bing home page title is:-"+expected_BingHomePageTitle);
		 
		 //getting the home page is developed by developer
		 String actual_bingHomePageTitle=chromeDriver.getTitle();
		 System.out.println(" The actual title of the Bing Home Page is :- "+actual_bingHomePageTitle);
		 
		 //validating bing home page title
		 
		 if(actual_bingHomePageTitle.equals(expected_BingHomePageTitle)) 
		 {
			 System.out.println("Title of the Bing home page is MATCHED:-PASS");
			 
		 }
		 else 
		 {
			 System.out.println("Title of the Bing home page is NOT MATCHED:-FAIL");
		 }
		 
              // chromeDriver.close();
		 
	}



}
