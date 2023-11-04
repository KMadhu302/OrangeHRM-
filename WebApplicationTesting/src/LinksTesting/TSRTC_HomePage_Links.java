package LinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElements;

public class TSRTC_HomePage_Links {
	private static List<WebElement> tsrtc_HomePageLinks;
	private static Object HomePageLinkName;
	private static int index;

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
		driver.get(applicationUrlAddress);
	/*	
		<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">
		Home</a>
		<a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>
		
		<a class="tabcopy" href="/oprs-web/guest/ticket/cancel.do" target="_top" title="Cancel Tickets">Cancel Tickets</a>
		<a class="tabcopy" href="/oprs-web/services/cancel.do" target="_top" title="Cancelled Services">Cancelled Services</a>
		
		*/
		// acommon property to find the number of links;-anachor-'a'
		
		By linksProperty=By.tagName("a");
		List<WebElement>tsrtc_HomePageLinks=driver.findElements(linksProperty);
	
		int tsrtc_HomePageLinksCount=tsrtc_HomePageLinks.size();
	     
		System.out.println("the number of tsrtc home page links are:-"+tsrtc_HomePageLinksCount);
		
		for (int index=0;index<tsrtc_HomePageLinksCount;index++)
		
		{
		
			// gettting the names of links
			
			 String tsrtc_HomePageLinkName=tsrtc_HomePageLinks.get(index).getText();
			 System.out.println(index+""+tsrtc_HomePageLinkName);
			 
		}
		driver.close();
	}


		}

		
	
	

