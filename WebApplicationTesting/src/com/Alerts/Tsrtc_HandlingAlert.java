package com.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Tsrtc_HandlingAlert extends BaseTest

{
@Test(priority=1,description="validating the alert window test")
	public void checkAvalibilityTest() 
	{
	//property of check availability element
		//id="searchBtn"
	 By checkAvalibilityproperty=By.id("searchBtn");
	  WebElement checkAvalibility=driver.findElement(checkAvalibilityproperty);
	  checkAvalibility.click();
		
	}
 @Test(priority=2,description="validating handling alert ")
 
    public void HandlingAlert() throws InterruptedException 
 {
	 
	 //since the alert window is not identified within in the  browser -we are unable to identified properties
	 //of the element of an alert-so is the reason the driver should be made to shift into the 
	 //alert window and then handle the element of the alert 
	 Alert tsrtcAlertWindow=driver.switchTo().alert();
	 
	 Thread.sleep(5000);
	 
	  String alertWindowMessage=tsrtcAlertWindow.getText();
	
	  System.out.println("The text of the alert window message:-"+alertWindowMessage);
	  
	  //accept  button will perform on operation Ok button in the alert window
	  
	  tsrtcAlertWindow.accept();
	  //dismiss method will perform on the cancel button
	 // tsrtcAlertWindow.dismiss();
	  //to send a test data into the alert window 
	 // tsrtcAlertWindow.sendKeys(alertWindowMessage);
	 
	 
}
}
