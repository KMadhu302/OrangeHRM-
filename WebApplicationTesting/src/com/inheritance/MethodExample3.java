package com.inheritance;

public class MethodExample3 extends MethodExample2
{
	void division()//default method
	
	//Exception-handling is used to handle the Exception and will allow to proceed to
	//perform the other operation of the program execution-it will not terminate the
	//execution process
    {
	try {
		int var1=60;
	   	 int var2=0;
	   	 int var3;
	   	 var3=var1/var2;
	   	 System.out.println("The value of the variable is after division :-"+var3);
	} 
	catch(Exception errorMessage)
	{
		System.out.println("The value of the Exception is:-"+errorMessage);
	}
	   	 
		
    }
	public static void main(String[] args) 
	{
		MethodExample3 m3=new MethodExample3();
		m3.division();
		m3.addition();
		m3.multiplication();
		
		
	}
}