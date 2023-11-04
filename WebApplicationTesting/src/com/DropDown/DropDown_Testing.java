package com.DropDown;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown_Testing extends BaseTest
{
@Test
	public void dropDownTesting() throws IOException, InterruptedException
	{
		
		   
		By selectLaunguageProperty=By.id("gtranslate_selector");
		WebElement selectLaunguage=driver.findElement(selectLaunguageProperty);

		// <option value="en|hi">Hindi</option>
		//<option value="en|fr">French</option>
		//<option value="en|de">German</option>
		// <option value="en|el">Greek</option>

		// getting all the elments of the DropDown
		By dropDownProperty=By.tagName("option");
		List<WebElement>selectLanguages=selectLaunguage.findElements(dropDownProperty);

		// printing elements of the DropDown
		for(int index=0;index<selectLanguages.size();index++) 
		{
		
		String dropDownLanguageName=selectLanguages.get(index).getText();
	    System.out.println(dropDownLanguageName);
	    
	    //selection of multiple optional values from the dropDown successfully
	    
		Select selection=new Select(selectLaunguage);
		selection.selectByIndex(index);
		
		Thread.sleep(5000);
		
		 File screenShot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyDirectory(screenShot, new File("./OsmaniaUniversity/"+dropDownLanguageName+".png"));
		
		}
		
		//selectiin the particular optional value from the drop down
		//to perform the selection option value from the drop down-use select class(creatin 
		//an object for the class and providing an element as argument to the class object
		
		Select selection=new Select(selectLaunguage);
		selection.selectByIndex(7);
		selection.selectByValue("en|h");
		selection.selectByVisibleText("Greek");
		
		//will dis-selected the all selected optional values from the dropDown
		selection.deselectAll();
		//selection.deselectByIndex(3);
		//selection.deselectByVisibleText();
		//selection.deselectByValue();
		
	}

}
