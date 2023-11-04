package assginmentof_OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Madhu {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://orangehrm.qedgetech.com/");
		String applicationUrlAdress="http://orangehrm.qedgetech.com/";
		driver.get(applicationUrlAdress);
		System.out.println("the url adress of orange hrm:-"+applicationUrlAdress);
		
		System.out.println();
		
		//validating login page
		
		//<input name="txtUsername" id="txtUsername" type="text">
		driver.findElement(By.name("txtUsername")).sendKeys("madhu");
		
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		driver.findElement(By.name("txtPassword")).sendKeys("madhu123");
		
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		driver.findElement(By.className("button"));
		
		
		
		
	}

}
