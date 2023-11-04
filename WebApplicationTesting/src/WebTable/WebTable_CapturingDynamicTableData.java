package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTable_CapturingDynamicTableData extends BaseTest
{
@Test
	public void capturingDynamicTableData()
	
	{
	
	//identify the webTable 
	///html/body/div[5]/section[1]/div-property of the webTable
	
	 By webTableProperty=By.xpath("/html/body/div[5]/section[1]/div");
	  WebElement webTable=driver.findElement(webTableProperty);
	  
	  //in the webtable -identify the number of Rows
	  ///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
	  
	 By webTableRowsProperty= By.tagName("tr");
     List < WebElement> webTableRows= webTable.findElements(webTableRowsProperty);
       
       //To go to webtable-to all the rows of the webtable
     for(int rowindex=0;rowindex<webTableRows.size();rowindex++) 
     {
    	 
    	 
    	 //going to particular Row in the webTable
    	 WebElement webTableRow= webTableRows.get(rowindex);
    	 
    	 //going to row and identify the number of cells in row
    	 By rowOfCell=By.tagName("td");
    	 List<WebElement> webTableRowOfCells=webTableRow.findElements(rowOfCell);
    	 //going to every row of its corresponding cells
    	 for(int rowOfCellindex=0;rowOfCellindex<webTableRowOfCells.size();rowOfCellindex++) 
    	 {
    		 
    		 //get the data from the row of cell index
    		 String webTableData=webTableRowOfCells.get(rowOfCellindex).getText();    	
    		 System.out.print(webTableData+" | ");
    		 }
    	 System.out.println();
     }
	  
		
	}
}
