package com.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropOperation

{
	WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException
	{
		DragAndDropOperation drag=new DragAndDropOperation();
		drag.applicationLaunch();
		drag.dragAndDrop_GetText();
		drag.applicationClose();
	}
public void applicationLaunch()
{
	System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
	driver=new ChromeDriver();
	
	String applicationUrlAddress="https://jqueryui.com/droppable/";
	driver.get(applicationUrlAddress);
}
public void applicationClose()
{
	driver.close();
}
public void dragAndDrop_GetText() throws InterruptedException
{
	//<iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>
	  By webPageframeProperty=By.className("demo-frame");
	  WebElement WebPageframe=driver.findElement(webPageframeProperty);
	  
	  //getting into the frame of the webpage
	  
	  driver.switchTo().frame(WebPageframe);
	  
	 
	    //Thread.sleep(10000);
	  
	    By dragMeToMyTargetProperty=By.id("draggable");
	    WebElement dragMeToMyTarget=driver.findElement(dragMeToMyTargetProperty);

	    String dragMeToMyTargetText=dragMeToMyTarget.getText();
	    System.out.println(" The text of an Element Drag Me To My Target is :- "+dragMeToMyTargetText);
	    
	     //<div id="droppable" class="ui-widget-header ui-droppable">
	     //<div id="droppable" class="ui-widget-header ui-droppable">
		  
		 By droppableProperty=By.id("droppable");
		 WebElement droppable=driver.findElement(droppableProperty);
		  
		 String droppableText=droppable.getText();
		 System.out.println("The droppable text is :-"+droppableText);
		 
		 //perform DragAndDrop operation
		 
		 Actions action=new Actions(driver);
		
		 action.dragAndDrop(dragMeToMyTarget,droppable).build().perform();
		 
		
		//driver focus should back to the actual webpage because the resizeable element is not
		//in the same frame
		
		driver.switchTo().defaultContent();
		
		//automating ResizeElement
		//<a href="https://jqueryui.com/resizable/">Resizable</a>
		//<a href="https://jqueryui.com/resizable/">Resizable</a>
		//Thread.sleep(50000);
		
		By resizeableProperty=By.linkText("Resizable");
		WebElement resizeable=driver.findElement(resizeableProperty);
		resizeable.click();
		System.out.println(driver.getTitle());
		 
		
}
}
