package OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class OHRM_LoginTest 
{
	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver","./Browserdriverfiles/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("http://orangehrm.qedgetech.com/");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
        driver.findElement(By.className("button")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/a/b")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/ul/li[3]/a")).click();
        driver.findElement( By.name("firstName")).sendKeys("K");
        driver.findElement(By.name("middleName")).sendKeys("Madhu");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[4]/label")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@type='button']")).click();
        
     
	}

}
