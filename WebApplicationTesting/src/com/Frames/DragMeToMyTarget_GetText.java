package com.Frames;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragMeToMyTarget_GetText 
{
	WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		
		//BaseTest application=new BaseTest();
		//application.applicationlaunch();
		 DragMeToMyTarget_GetText  drag=new  DragMeToMyTarget_GetText();
		 drag.applicationLaunch();
		 drag.DragAndDrop_GetText();
	 drag.applicationClose();
	
	}
		
	
	public void applicationLaunch()
	{
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		
		String applicationUrlAddress="https://jqueryui.com/droppable/";
		driver.get(applicationUrlAddress);
	}
		
	
	public void DragAndDrop_GetText() throws InterruptedException 
	{
		//properties of the frame of the webpage
		//<iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>
		
		By webPageFrameProperty=By.className("demo-frame");
	    WebElement webPageFrame=driver.findElement(webPageFrameProperty);
	    
	    //getting the frame of the webpage
		 driver.switchTo().frame(webPageFrame);

		
		//id="draggable"
		//id="draggable"
		//Thread.sleep(10000);
		
      
		By dragMeToMyTargetProperty=By.id("draggable");
		WebElement dragMeToMyTarget=driver.findElement(dragMeToMyTargetProperty);
		
		String dragMeToMyTargetText=dragMeToMyTarget.getText();
		System.out.println("The text of element is drag me to my target:-"+dragMeToMyTargetText);
		
		//<div id="droppable" class="ui-widget-header ui-droppable">
		 By droppableProperty=By.id("droppable");
		 WebElement droppable=driver.findElement(dragMeToMyTargetProperty);
		 
		 String droppableText=droppable.getText();
		 System.out.println("The text of the Element droppable is:-"+droppableText);
		  
		
        
	
	}
	public void applicationClose()
	{
	driver.close();
	}

}
