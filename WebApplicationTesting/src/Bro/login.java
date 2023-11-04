package Bro;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class login extends BaseTest
{
	@Test
	public void loginTest() 
	{
		//name="txtUsername"
		//id="txtUsername"
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		//id="txtPassword"
		driver.findElement(By.id("txtPassword")).sendKeys("Madhu@123");
		//id="btnLogin"
		driver.findElement(By.id("btnLogin")).click();
	}

}
