package LinksTesting;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HomePage_HeaderBlock_DisplayLinkNames 
{
	
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
		driver.get(applicationUrlAddress);
		
		
		 
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
		
		System.out.println("the number of links of header block of TSRTC application page is:-"+tsrtc_HeaderBlockLinksCount);
				
		//go to the array list to get the names and links assigned to stored
		for(int index=0;index<tsrtc_HeaderBlockLinksCount;index++)
			
		{
			
			String tsrtc_HeaderBlockLinkName=tsrtc_HeaderBlockLinks.get(index).getText();
			 System.out.println(index+""+tsrtc_HeaderBlockLinkName);
			 

			 //performing on operation on the header block links
			 tsrtc_HeaderBlockLinks.get(index).click();
			 
			 String WebPageTitle=driver.getTitle();
			 System.out.println(WebPageTitle);
			 
			 String WebPageCurrentUrlAdress=driver.getCurrentUrl();
			 System.out.println(WebPageCurrentUrlAdress);

			 File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(screenShot,new File("./ScreenShots/"+tsrtc_HeaderBlockLinkName+".png"));
		
			 
			 
			 System.out.println();
			 
			 driver.navigate().back();
			 	
			// Identifying the Header Block for another Time
			 tsrtc_HeaderBlock=driver.findElement(tsrtc_HeaderBlockProperty);
			 
			 // of the header Block - finding all the elements and storing back to the ArrayList
			 // we are creating the arrayList for another time - because when the driver focus shifts to
			 // the next page the information stored in the arrayList of the driver will be cleared off
			 // - so create the arrayList to identify the elements of the Header Block for another time
			 // after coming back to WebPage

			 
			 tsrtc_HeaderBlockLinks=tsrtc_HeaderBlock.findElements(tsrtc_HeaderBlockLinksProperty);
		}
		 
		
		driver.close();		
	
}

}
