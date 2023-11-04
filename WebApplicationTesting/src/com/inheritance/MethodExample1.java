package com.inheritance;

public class MethodExample1 
{
	public void addition() //public method access in any java class
	{
		   
		   int var1=20;
		   int var2=40;
		    int  var3;
		    var3=var1+var2;
		    
		    System.out.println("the value of the variable is after addition is :- "+ var3);
	   }
	public static void main(String[] args)
	{
		MethodExample1 m1=new MethodExample1();
		m1.addition();
		
	}

}
