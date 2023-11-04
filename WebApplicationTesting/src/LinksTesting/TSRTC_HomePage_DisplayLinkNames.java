package LinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HomePage_DisplayLinkNames 
{
public static void main(String[] args)
{

	System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	
	String ApplicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
	driver.get(ApplicationUrlAddress);
	
	/*
	 <a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">
				Home</a>
		<a class="tabcopy blinking" href="/oprs-web/guest/specialHire.do" target="_top" title="Bus on Contract">Bus on Contract</a>
		<a class="tabcopy" href="/oprs-web/guest/ticket/cancel.do" target="_top" title="Cancel Tickets">Cancel Tickets</a>
		<input type="text" name="fromPlaceName" size="22" value="" onblur="setHelpText('Enter From City Name', 'fromPlaceName');" onfocus="clearHelpText('Enter From City Name', 'fromPlaceName');" id="fromPlaceName" class="ajxPlaceCs ui-autocomplete-input" title="Enter city name and select from the dropdown list." autocomplete="off">
		<input type="text" name="toPlaceName" size="22" value="" onblur="setHelpText('Enter To City Name', 'toPlaceName');" onfocus="clearHelpText('Enter To City Name', 'toPlaceName');" id="toPlaceName" class="ajxPlaceCs ui-autocomplete-input" title="Enter city name and select from the dropdown list." autocomplete="off">
				
	 */
	
	// a common property to find the number of links is -anchor tag-'a'

	
	By linksProperty=By.tagName("a");
	List<WebElement>tsrtc_HomePageLInks=driver.findElements(linksProperty);
	
	int tsrtc_HomePageLinksCount=tsrtc_HomePageLInks.size();
	System.out.println("the number of links in TSRTC home page application is:-"+tsrtc_HomePageLinksCount);
	
	for (int index=0;index<tsrtc_HomePageLinksCount;index++) {
		String tsrtc_HomePageLinkName=tsrtc_HomePageLInks.get(index).getText();
		System.out.println(index+""+tsrtc_HomePageLinkName);
		
	}
	
	driver.close();
}
}
