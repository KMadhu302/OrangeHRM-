package LinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HomePage_HeaderBlock_LinksCount
{
private static List<WebElement> tsrtc_HeaderBlockLinks;

public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	
	String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
	driver.get(applicationUrlAddress);
	
	//identifying the haeader block of the webpage
	//class="menu wrap"-property of the header block
	
	 By tsrtc_HeaderBlockProperty=By.className("menu-wrap");
	 WebElement tsrtc_HeaderBlock=driver.findElement(tsrtc_HeaderBlockProperty);
	 
	 /*
	  <div class="menu">
			<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">
					Home</a>
				<a class="tabcopy blinking" href="/oprs-web/guest/specialHire.do" target="_top" title="Bus on Contract">Bus on Contract</a>
				<a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>
				<a class="tabcopy" href="/oprs-web/guest/ticket/cancel.do" target="_top" title="Cancel Tickets">Cancel Tickets</a>
				<a class="tabcopy" href="/oprs-web/services/cancel.do" target="_top" title="Cancelled Services">Cancelled Services</a>
				<a class="tabcopy" href="/oprs-web/home/aboutus.do" target="_top" title="About Us">About Us</a>
				<a class="tabcopy blinking" href="/oprs-web/services/packagetours.do" target="_top" title="Tourism">Tourism</a>
				<a class="tabcopy" href="/oprs-web/services/driverInfo.do" target="_top" title="Driver Info">Driver Info</a>
				<!-- <a class="tabcopy" href="https://forms.gle/BVVhmKJ8gnd7rWvr8" target="_blank" title="Customer Survey Form" style="float: right !important;">Customer Survey Form</a> -->

	  */
	 By tsrtc_HeaderBlockLinksProperty=By.tagName("a");
	 List<WebElement>tsrtc_HeaderBlockLinks=tsrtc_HeaderBlock.findElements(tsrtc_HeaderBlockLinksProperty);
	 
	 int tsrtc_HeaderBlockLinksCount=tsrtc_HeaderBlockLinks.size();
	 System.out.println("the number of links  in TSRTC home page application are:-"+tsrtc_HeaderBlockLinksCount);
		 


	 }
}

