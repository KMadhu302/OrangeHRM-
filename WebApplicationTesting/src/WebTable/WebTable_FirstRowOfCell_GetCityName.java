package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTable_FirstRowOfCell_GetCityName extends BaseTest

{
	@Test
public void getCityName()
	{
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
	 By cityNameProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a");
	 WebElement cityName=driver.findElement(cityNameProperty);
	  String cityNameText=cityName.getText();
	  System.out.println("City Name is :-"+cityNameText);
}
	
}
