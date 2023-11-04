package MouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HelloSignIn
{
	
	public static void main(String[] args) 
	 {
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		 ChromeDriver driver =new ChromeDriver();
		 
		 String applicationUrlAdress="http://amazon.in";
		 driver.get(applicationUrlAdress);
		 
		 //hello signin property
	     //id="nav-link-accountList-nav-line-1"
		 
		 By helloSignInProperty=By.id("nav-link-accountList");
		 WebElement helloSignIn=driver.findElement(helloSignInProperty);
		
		 //performing action on the current webpage
		 //actions class of the webdriver is used to perform operations related to mouse and
		 //functions key of the keyboard
		  
		 Actions action=new Actions(driver);
		 
		 //a mousehover operation is done on the element hello sign in
		 
		 action.moveToElement(helloSignIn).build().perform();
		 
		// Operation on YourOrders - is an Hidden Element

		// Selenium WebDriver cannot directly recognize the Hidden Elements - first the element which
		// is hidden should be made visible - then the webdriver can recognize and Automate the element

		// <a id="nav_prefetch_yourorders" href="/gp/css/order-history?ref_=nav_AccountFlyout_orders" class="nav-link nav-item"><span class="nav-text">Your Orders</span></a>

		// The type of element is link

		 
		 By yourOrdersProperty=By.linkText("Your Orders");
		 
		 WebElement yourOrders=driver.findElement(yourOrdersProperty);
		 
		 yourOrders.click();
		
		 
		 System.out.println(driver.getTitle());
		 
		 driver.close();
		 
		 
		 
	} 
}
