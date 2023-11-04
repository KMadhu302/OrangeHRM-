package com.TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
public class Annotation extends BaseClass
{
   @Test
	public void madhu() 
	{
		System.out.println("The gmail application launch succedssfully");
		//id="txtUsername"
		//driver.findElement(By.id("txtUsername")).sendKeys("admin");
	}
   
   @Test
   public void venu()
   {
	   System.out.println("The gmail loginTest launch successfully");
   }
   @Test
	public void GmailSentdata() {
		
		System.out.println("The gmail sentdata is done");
	}
   
  
}
