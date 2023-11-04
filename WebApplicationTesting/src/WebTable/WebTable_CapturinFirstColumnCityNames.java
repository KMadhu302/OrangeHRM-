package WebTable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.WriteAbortedException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

public class WebTable_CapturinFirstColumnCityNames  extends BaseTest
{
@Test
	public void capturingFirstColumn() throws IOException 
{
	
	
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
	  //last column
	///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]/a
	
	for(int index=1;index<=36;index++) 
	{
	
	 By firstColumnCityNamesProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+index+"]/td[1]/a");
	  WebElement firstColumnCityNames=driver.findElement(firstColumnCityNamesProperty);
	  String firstColumnCityNamesText= firstColumnCityNames.getText();
	  System.out.println("The First column names text is:-"+firstColumnCityNamesText);
	  
	  
	  FileInputStream cityNames=new FileInputStream("C:\\Users\\madhu\\Desktop\\excel\\test.xlsx");
	  XSSFWorkbook wb=new XSSFWorkbook(cityNames);
	  XSSFSheet sheetNames=wb.getSheet("names");
	  
	  //cteate a new row 
	   XSSFRow row=sheetNames.createRow(0);
	   row.setRowNum(index);
	   XSSFCell cell=row.createCell(0);
	  cell.setCellValue(firstColumnCityNamesText);
	  
	  //int row=sheetNames.getLastRowNum();
	 
	  FileOutputStream filename=new FileOutputStream("C:\\Users\\madhu\\Desktop\\excel\\test.xlsx");
	  wb.write(filename);
	  
	}
}
}


