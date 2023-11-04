package ReadOutAllEmployeeListData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WriteDataIntoExcelSheet extends BaseTest

{
	@Test
public void employeeListData() throws IOException, InterruptedException
	{
		String usernameTestData="admin";
		By usernameProperty=By.name("txtUsername");
		WebElement  userName=driver.findElement(usernameProperty);
		userName.sendKeys(usernameTestData);
	
			//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		String passwordTestData="Madhu@123";
		By passwordProperty=By.name("txtPassword");
		WebElement password=driver.findElement(passwordProperty);
		password.sendKeys(passwordTestData);
		
		//<input type="submit" name="Submit" bclass="button" id="btnLogin" value="LOGIN">
		
		//driver.findElement(By.id("btnLogin")).click();
		 By loginProperty=By.name("Submit");
		  WebElement login=driver.findElement(loginProperty);
         login.click();
         
		
       //id="menu_pim_viewPimModule"
		 By pimProperty=By.id("menu_pim_viewPimModule");
		 WebElement pim=driver.findElement(pimProperty);
		 Actions pimAction=new Actions(driver);
		 pimAction.moveToElement(pim).build().perform();
		 
		 //id="id="menu_pim_viewEmployeeList""
		  By employeeListProperty=By.id("menu_pim_viewEmployeeList");
		 WebElement employeeList=driver.findElement(employeeListProperty);
		 employeeList.click();
		 
		 ///html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[1]/td[2]/a
		 //html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[34]/td[4]/a
	     //html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[1]/td[2]/a
		 ///html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[34]/td[4]
		 
		 for(int index=1;index<=34;index++)
		 {
			 for(int cellindex=2;cellindex<=4;cellindex++)
			 {
				  By employeeTableProperty=By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr["+index+"]/td["+cellindex+"]/a");
				  WebElement employeeTable=driver.findElement(employeeTableProperty);
				   String employeeTableText=employeeTable.getText();
				 System.out.print(employeeTableText+"!");
				 
				 FileInputStream cityNames=new FileInputStream("C:\\Users\\madhu\\Desktop\\excel\\madhu.xlsx");
				  XSSFWorkbook wb=new XSSFWorkbook(cityNames);
				  
				  XSSFSheet sheetNames=wb.getSheet("EmployeeList");
				 //to create a row in the sheet 
				  XSSFRow row=sheetNames.createRow(0);
				  
				  //create new cell in the excel sheet and set the value 
				  Row excelRow= sheetNames.getRow(index);
				  if(excelRow==null)
				  {
					 excelRow= sheetNames.createRow(index);
				  }
				  
				  //in the excelRow variable using create one cell 
				  
				  Cell cell= excelRow.createCell(cellindex);
				 
				  
				  cell.setCellValue(employeeTableText);
				  
				  FileOutputStream filename=new FileOutputStream("C:\\Users\\madhu\\Desktop\\excel\\madhu.xlsx");
				  wb.write(filename);
				  
                 // id="welcome
				    By welcomeAdminProperty=By.id("welcome");
				    WebElement welcomeAdmin= driver.findElement(welcomeAdminProperty);
				    welcomeAdmin.click();
				    Thread.sleep(5000);
				    
				    //Logout
				       By logoutProperty=By.linkText("Logout");
				       WebElement logout=driver.findElement(logoutProperty);
				       logout.click();
			 }
			 System.out.println();
			 
		 }
}
}
