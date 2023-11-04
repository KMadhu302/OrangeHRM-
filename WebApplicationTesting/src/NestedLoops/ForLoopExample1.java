package NestedLoops;

public class ForLoopExample1
{
	public static void main(String[] args)
	{
		for (int index1=1;index1<=3;index1++)//outerLoop
		{
			for (int index2=1;index2<=2;index2++)//innerLoop
			{
				System.out.println(index1);
			}
		}
		System.out.println();
        System.out.println("********2********");
        System.out.println();
        
        for (int index1=1;index1<=5;index1++)
        {
        	for (int index2=0;index2<=2;index2++)
        	{
        		System.out.println(index1);
        		
        	}
        }
        System.out.println();
        System.out.println("********3********");
        System.out.println();
        
        for (int index1=1;index1<=5;index1++)
        {
        	for (int index2=0;index2<=5;index2++)
        	{
        		System.out.println(index2);
        	}
        }
        System.out.println();
        System.out.println("*********4*************");
        System.out.println();
        
        for (int index1=1;index1<=5;index1++) 
        {
        	for (int index2=0;index2<=5;index2++) 
        	{
        		System.out.print(index1+"");
        	}
            System.out.println();
        }
        
        System.out.println();
        System.out.println("********5*********");
        System.out.println();
        
        for (int index1=5;index1>=0;index1--) 
        {
        	for (int index2=index1;index2>=0;index2--)
        	{
        		System.out.print(index2+"");
        	}
        	System.out.println();
        }
        System.out.println();
        System.out.println("*********6************");
        System.out.println();
        
        for (int index1=5;index1>=0;index1--) 
        {
        	for (int index2=index1;index2>=0;index2--) 
        	{
        		System.out.print("*"+"");
        	}
        	System.out.println();
        }
        System.out.println();
        System.out.println("********7**********");
        System.out.println();
        
        for (int index1=5;index1>=0;index1--) 
        {
        	for (int index2=index1;index2>=0;index2--) 
        	{
        		System.out.print(index1+index2+"");
        	}
        }
        System.out.println();
	}  

}
