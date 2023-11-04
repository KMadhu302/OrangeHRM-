package assginmentof_OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class LoginToAmazon 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]")).click();
	driver.findElement(By.name("email")).sendKeys("madhu6303753966@gmail.com");
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.name("password")).sendKeys("1640107592");
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[2]/div/form/div/div[2]/span/span/input")).click();
	driver.close();
	
}
}
