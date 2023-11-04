package ReadOutAllEmployeeListData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



public class ReadValidAndInvalidDataFromExcelSheet extends BaseTest


{    
	@Test
	public void ReadData() throws IOException 
	{
		FileInputStream validData=new FileInputStream("C:\\Users\\madhu\\Desktop\\excel\\test.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(validData);
		XSSFSheet sheet=wb.getSheet("validData");
		int rowCount=sheet.getLastRowNum();
		
		for(int index=0;index<=rowCount;index++) 
	{
		
		 XSSFRow row=sheet.getRow(index);
		
		 String userNameData= row.getCell(0).getStringCellValue();
		
		 //id="txtUsername"
		  By userNameProperty=By.id("txtUsername");
		   WebElement  userName=driver.findElement(userNameProperty);
		   userName.sendKeys(userNameData);
		   String  passwordData=row.getCell(0).getStringCellValue();
		   //name="txtPassword"
		   By  passwordProperty=By.name("txtPassword");
		   WebElement password=driver.findElement(passwordProperty);
		   password.sendKeys(passwordData);
		   
		  XSSFCell cell=row.createCell(0);
		  File screenShots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(screenShots, new File("./ScreenShots/"+index+".png"));
		//id="btnLogin"
		   By loginButtonProperty=By.id("btnLogin");
		   WebElement loginButton=driver.findElement(loginButtonProperty);
		   loginButton.click();
		  
		  
		
	}

}
}
