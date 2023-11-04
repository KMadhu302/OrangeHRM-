package Arrrays;

public class ObjectArraysExample 
{
	public static void main(String[] args)
	{
		Object array1[]=new Object[4];
		
		array1[0]=20;
		array1[1]="Testing";
		array1[2]='A';
		array1[3]=10.235;
		
   /*
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		System.out.println(array1[3]);
		
		
	*/	
		
		for(int index=0;index<array1.length;index++)
		{
			System.out.println(array1[index]);
		}
	System.out.println("**********For Each Loop************");
	
	for(Object index:array1)
	{
		System.out.println(index);
		
	}
	}

}
