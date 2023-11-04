import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","./Browserdriverfiles/chromedriver.exe");
				ChromeDriver driver =new ChromeDriver();
				driver.get("http://flights.qedgetech.com/");
				driver.findElement(By.linkText("Register")).click();
				driver.findElement(By.id("name")).sendKeys("Madhu");
				driver.findElement(By.id("contact")).sendKeys("6303753966");
				driver.findElement(By.name("email")).sendKeys("madhu6303753966@gmail.com");
		        driver.findElement(By.name("password")).sendKeys("1640107592");
		        driver.findElement(By.name("gender")).sendKeys("Male");
		        driver.findElement(By.name("dob")).sendKeys("15/06/2000");
		        driver.findElement(By.className("form-check-label")).click();
		        driver.findElement(By.name("submit")).click();
		       //<input type="email" name="email" class="form-control" placeholder="Email ID" required=""> 
		        driver.findElement(By.name("email")).sendKeys("madhu6303753966@gmail.com");
		        //<input type="password" name="password" class="form-control" placeholder="Password" required="">
		        driver.findElement(By.name("password")).sendKeys("1640107592");
		        //<button type="submit" class="btn btn-primary btn-block btn-flat">Sign In</button>
		        
		        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[3]/div[2]/button")).click();		 
		 
		        
	}

}
