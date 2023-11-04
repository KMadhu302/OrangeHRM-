package WebTable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Utility.Log;

public class BaseTest 
{
	WebDriver driver;
	String applicationUrlAddress="https://www.timeanddate.com/worldclock/";
	
	@BeforeTest
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver","./Browserdriverfiles/chromedriver.exe");
		 driver =new ChromeDriver();
		
		//System.out.println("**********chrome browser launched sucessfully************");
		
				driver.get(applicationUrlAddress);
				System.out.println("navigate to OrangeHRM application login page");
				driver.manage().window().maximize();
				
	}
	
	/*@AfterTest
	public void tearDown()
	
	{
		driver.quit();
		System.out.println("OrangeHRM application along with chrome Browser Closed");
		
	}*/
}
