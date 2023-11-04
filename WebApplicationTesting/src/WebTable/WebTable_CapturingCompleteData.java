package WebTable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTable_CapturingCompleteData extends BaseTest

{
	@Test
	public void capturingCompleteTableData() throws IOException 
	
	{
		//first row of first cell
      ///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[]/td[]/a
		
		//last row of last cell
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
		
		//To goto every row
		for(int Index=1;Index<=36;Index++) 
		{
			//of every should goto all its respective cells
			for(int CellIndex=1;CellIndex<=8;CellIndex++)
			{
				 By completeNamesProperty=By.xpath("html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+Index+"]/td["+CellIndex+"]");
				WebElement completeNames=driver.findElement(completeNamesProperty);
				 String completeNamesText=completeNames.getText();
				System.out.print(completeNamesText+"!");
				
			/*	String xpathExpressionPart1="html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
				 String xpathExpressionPart2="]/td[";
				 String xpathExpressionPart3="]/a";
				 
				  By tableNamesProperty=By.xpath(xpathExpressionPart1+Index+xpathExpressionPart2+CellIndex+xpathExpressionPart3);
				 WebElement tableNames= driver.findElement(tableNamesProperty);
				 String tableNamesText=tableNames.getText();
				 System.out.println(tableNamesText+" ! ");*/
				  
				  FileInputStream cityNames=new FileInputStream("C:\\Users\\madhu\\Desktop\\excel\\madhu.xlsx");
				  XSSFWorkbook wb=new XSSFWorkbook(cityNames);
				  
				  XSSFSheet sheetNames=wb.getSheet("TableData");
				 //to create a row in the sheet 
				  XSSFRow row=sheetNames.createRow(0);
				  
				  //create new cell in the excel sheet and set the value 
				  Row excelRow= sheetNames.getRow(Index);
				  if(excelRow==null)
				  {
					 excelRow= sheetNames.createRow(Index);
				  }
				  
				  //in the excelRow variable using create one cell 
				  
				  Cell cell= excelRow.createCell(CellIndex);
				 
				  
				  cell.setCellValue(completeNamesText);
				  
				  FileOutputStream filename=new FileOutputStream("C:\\Users\\madhu\\Desktop\\excel\\madhu.xlsx");
				  wb.write(filename);
				  
				
				
			}
			System.out.println();
			
			///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
			///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[7]
		}
		
	}

}
