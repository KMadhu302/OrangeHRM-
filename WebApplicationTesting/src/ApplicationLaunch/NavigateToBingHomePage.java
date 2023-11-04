package ApplicationLaunch;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToBingHomePage {
	public static void main(String[] args) {
		   
		System.setProperty("webdriver.chrome.driver","./Browserdriverfiles/chromedriver.exe");
		ChromeDriver chromeDriver =new ChromeDriver();
		
		//chromeDriver.get("http://google.com");
		chromeDriver.navigate().to("http://google.com");
		
		//navigate to bing home page
		chromeDriver.get("http://bing.com"); 
		
		//chromeDriver.quit();//will close the all tabs once
		
		chromeDriver.close();//will close only one tab in it
		                        //and
		                        // will close the browser- with all the TABs opened it once
		
	}

}
