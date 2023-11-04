package com.OrangeHRMApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.BaseTest;
import com.Utility.Log;

public class OrangeHRMApplicationLoginPage  extends BaseTest

{


	// This class is referred to as  an Object Repository Class	
	//1.identification of the element of the webpage
	//2.creating user define method as business logic to perform the operation on the webElement
	//id="logInPanelHeading"
	//whenever class name is similar to method name then it is called as constructor
 
	public OrangeHRMApplicationLoginPage()
	{
		PageFactory.initElements(driver,this);
		
	}
	//identification element of the webpage
	@FindBy(id="logInPanelHeading")
	//@FindBy(id="logInPanelHeading")
	WebElement loginPanel;
	
	// creating a user-define method as a business logic to perform the operation on the webelement
	
	
	public void orangeHRMApplication_loginPage_loginPanel() 
	{
		
		String expected_orangeHRMApplication_LoginPageText="LOGIN Panel";
		//System.out.println("The Expected Text of OrangeHRM Application login page Text is :-"+expected_orangeHRMApplication_LoginPageText);
		Log.info("The Expected Text of OrangeHRM Application login page Text is :-\"+expected_orangeHRMApplication_LoginPageText");
		
		String actual_orangeHRMApplication_LoginPageText=loginPanel.getText();
		//System.out.println("The Actual text of the login page text is :-"+actual_orangeHRMApplication_LoginPageText);
		Log.info("The Actual text of the login page text is :-"+actual_orangeHRMApplication_LoginPageText); 
		 if(actual_orangeHRMApplication_LoginPageText.equals(expected_orangeHRMApplication_LoginPageText))
	  {
			 
			 
			// System.out.println("Sucessfully navigate to orange HRMApplication login page -Login page Text validation is sucessfull-PASS");
			 Log.info("Sucessfully navigate to orange HRMApplication login page -Login page Text validation is sucessfull-PASS");
	 }
		 else 
		 {
			 
			 //System.out.println("Failed to navigate the OrangeHRMApplication Login Page -Login page Text validation is not sucessfull -FAIL");
			 Log.info("Failed to navigate the OrangeHRMApplication Login Page -Login page Text validation is not sucessfull -FAIL");
		 }
		 
		 
		 

		 
			
	}
	

}
