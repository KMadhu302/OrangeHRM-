package Arrrays;

public class SingleDimensionalArraysExample 
{
public static void main(String[] args) 
{
	//dataType arrayName[]=new dataType[size];
	int array1[]=new  int[3];
	
	array1[0]=20;
	array1[1]=30;
	array1[2]=40;
	/*
	System.out.println(array1[0]);
	System.out.println(array1[1]);
	System.out.println(array1[2]);
	*/
	//for(int arrayindex=0;arrayindex<=4;arrayindex++)
	for(int arrayindex=0;arrayindex<array1.length;arrayindex++)
	{
		System.out.println(array1[arrayindex]);
		
	}
	
	    
}
}
