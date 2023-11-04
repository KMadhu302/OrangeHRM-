package OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class OrangeHRMapplication_loginTest 
{
    WebDriver driver;
    String applicationUrlAddrss="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";


	public void applicationLaunch()
	{
		
		System.setProperty("webdriver.chrome.driver","./Browserdriverfiles/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		
	     driver.get(applicationUrlAddrss);
	    driver.manage().window().maximize();
				

	}
	public void applicationClose()
	{
		driver.close();
	}
	
	public void loginTest()
	{
		String usernameTestData="admin";
		By usernameProperty=By.name("txtUsername");
		WebElement  userName=driver.findElement(usernameProperty);
		userName.sendKeys(usernameTestData);
		
		
		String passwordTestData="Madhu@123";
		By passwordProperty=By.name("txtPassword");
		WebElement password=driver.findElement(passwordProperty);
		password.sendKeys(passwordTestData);
		
		
	}
	public static void main(String[] args) 
	{
		
		OrangeHRMapplication_loginTest login=new OrangeHRMapplication_loginTest();
		login.applicationLaunch();
		login.loginTest();
	}
}

