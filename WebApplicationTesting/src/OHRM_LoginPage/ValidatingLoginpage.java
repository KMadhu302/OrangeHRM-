package OHRM_LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.interactions.touch.Move;

public class ValidatingLoginpage 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		String applicationUrlAddress="http://orangehrm.qedgetech.com/";
		driver.get(applicationUrlAddress);
		
	//<input name="txtUsername" id="txtUsername" type="text">	
		
		String userNameTestData="Admin";
		By userNameProperty=By.id("txtUsername");
		WebElement userName=driver.findElement(userNameProperty);
		userName.sendKeys(userNameTestData);
		
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		
        String passwordTestData="Qedge123!@#";
		By passwordProperty=By.name("txtPassword");
		WebElement password=driver.findElement(passwordProperty);
		password.sendKeys(passwordTestData);
		
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		
		driver.findElement(By.name("Submit")).click();
		
		//expected login page title is
		String expected_loginPageTitle=driver.getTitle();
		System.out.println("the title of the login page is:-"+expected_loginPageTitle);
		
		//actual login page title is
		String actual_loginPageTitle=driver.getTitle();
		System.out.println("the actual login page title is:-"+actual_loginPageTitle);
		
		if (actual_loginPageTitle.equals(expected_loginPageTitle))
		{
			System.out.println("the actaual login page title MATCHES:-PASS");
		}
		else	
		{
			System.out.println("the expected login page title NOT MATCHES:-FAIL");
		}
		
		
		System.out.println("*******************");
		System.out.println();
		
		
		//<b>PIM</b>
		 By pimProperty=By.linkText("PIM");
		 WebElement pim=driver.findElement(pimProperty);
		 pim.click();
		 
		 String expected_addEmployeePageTitle=driver.getTitle();
		 System.out.println("The expected add Employee Page Title is:-"+expected_addEmployeePageTitle);
		 
		 String actual_addEmployeePageTitle=driver.getTitle();
		 System.out.println("The actual add Employee page Title is:-"+actual_addEmployeePageTitle);
		 
		 if(actual_addEmployeePageTitle.equals(expected_addEmployeePageTitle))
		 {
			 System.out.println("the actual add Employee page Title is  MATCHED:-PASS"+actual_addEmployeePageTitle);
			 
		 }
		 else
		 {
			 System.out.println("the expected add Employee page title is NOT MATCHED:-FAIL"+expected_addEmployeePageTitle);
			 
		 }
		 
		 
		 
		 //<a href="/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
		 By addEmployeeProperty=By.linkText("Add Employee");
		 WebElement addEmployee=driver.findElement(addEmployeeProperty);
		 addEmployee.click();
		 
		 
		 //<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
		 String firstNameData="K";
		 By firstNameProperty=By.id("firstName");
		 WebElement firstName=driver.findElement(firstNameProperty);
		 firstName.sendKeys(firstNameData);
		 
		 //<input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">
		 String middleNameData="Madhu";
		 By middleNameProperty=By.name("middleName");
		 WebElement middleName=driver.findElement(middleNameProperty);
		 middleName.sendKeys(middleNameData);
		 
		 //<input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
		 String lastNameData="Madhu01";
		 By lastNameProperty=By.name("lastName");
		 WebElement lastName=driver.findElement(lastNameProperty);
		 lastName.sendKeys(lastNameData);
		 
		 //<input type="button" class="" id="btnSave" value="Save">
		 By saveProperty=By.id("btnSave");
		 WebElement save=driver.findElement(saveProperty);
		 save.click();
		 
		 //<a href="#" id="welcome" class="panelTrigger">Welcome Suresh</a>
		 
		 By welcomeProperty=By.id("welcome");
		 WebElement welcome=driver.findElement(welcomeProperty);
		 welcome.click();
		 
		 //<li><a href="/symfony/web/index.php/auth/logout">Logout</a></li>
		  
		 
		By logoutPropery=By.linkText("Logout");
		 WebElement logout=driver.findElement(logoutPropery);
		 logout.click();
		
		 
		// Actions action=new Actions(driver);
		 
		//action.moveToElement(logout).build().perform();
		
	}
	
	}


