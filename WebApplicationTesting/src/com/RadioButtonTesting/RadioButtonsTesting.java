package com.RadioButtonTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RadioButtonsTesting  extends BaseTest
{
	@Test
	public void group1RadioButtonsTesting() throws InterruptedException 
	{
		
		// <input type="radio" name="group1" value="Milk">
		// <input type="radio" name="group1" value="Butter" checked="">
		// <input type="radio" name="group1" value="Cheese">
		
		// <input type="radio" name="group2" value="Water">
		// <input type="radio" name="group2" value="Beer">
		// <input type="radio" name="group2" value="Wine" checked="">
		
		 By group1RadioButtonsProperty=By.name("group1");
		 List <WebElement >group1RadioButtons= driver.findElements(group1RadioButtonsProperty);
		 
		 // To go to  every Group1 Radio Buttons to perform click Operation 
		 
		 for(int group1RadioButtonsIndexClick=0;group1RadioButtonsIndexClick<group1RadioButtons.size();group1RadioButtonsIndexClick++)
		 {
			 
			 group1RadioButtons.get(group1RadioButtonsIndexClick).click();
			 
			 Thread.sleep(5000);
			 // Getting the status of al the Group1 Radio Buttons
			 
			 for(int group1RadionButtonsStatusIndex=0;group1RadionButtonsStatusIndex<group1RadioButtons.size();group1RadionButtonsStatusIndex++)
			 {
				
				// System.out.println(group1RadioButtons.get(group1RadionButtonsStatusIndex).getAttribute("value")+"-");
				 
				// System.out.println(group1RadioButtons.get(group1RadionButtonsStatusIndex).getAttribute("checked")+"-");
            System.out.println(group1RadioButtons.get(group1RadionButtonsStatusIndex).getAttribute("value")+"-"
				+group1RadioButtons.get(group1RadionButtonsStatusIndex).getAttribute("checked"));
            
            Thread.sleep(5000);
			 }
			 System.out.println();
		}
		
	}

}
