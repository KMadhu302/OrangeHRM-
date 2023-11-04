package Arrrays;

public class MultiDimensionalArrayExample 
{
	private static int arrayRowOfCellsIndex;

	public static void main(String[] args)
	{
	
		String array1[][]=new String[2][2];
		array1[0][0]="Venkat Sir";
		array1[0][1]="Manual Testing";
		
		array1[1][0]="Srini";
		array1[1][1]="Selenium Automated Testing";
		
		/* array1[2][0]="Load Runner";
		   array1[2][1]="Performance Testing";
		*/
		
		/*System.out.println(array1[0][0]);
		System.out.println(array1[0][1]);		
        //System.out.println(array1[2][0]);
		
		System.out.println(array1[1][0]);
		System.out.println(array1[1][1]);
		*/
	
		//go to every row
		
		for(int arrayRowIndex=0;arrayRowIndex<array1.length;arrayRowIndex++)
		{
			// go to every row cells
			for(int arrayRowofCellsIndex=0;arrayRowofCellsIndex<array1.length;arrayRowofCellsIndex++);
			{
				System.out.print(array1[arrayRowIndex][arrayRowOfCellsIndex]+"  |  ");	
			}
		
		}
	}
		
		
	}

	

