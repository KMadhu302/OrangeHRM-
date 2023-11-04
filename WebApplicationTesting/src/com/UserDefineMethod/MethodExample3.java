package com.UserDefineMethod;

public class MethodExample3 
{
	public static void main(String[] args) 
	{
		
		MethodExample3 m3= new MethodExample3();
		System.out.println("subtraction method of methodexample3 java class");
		m3.subtraction();
		System.out.println("multiplication method of methodexample3 java class");
		m3.multiplication();
		MethodExample2 m2= new MethodExample2();
		System.out.println("addition method of methodexample2 java class");
		m2.addition();
		
		
	}
	private void subtraction() //can be accessed only within in the class in which it is created
	                         //can also be  access in multiple number of times
	                         // private method can not be access in any other different class
	
	{
		
		int var1=40;
		int var2=30;
		int var3;
		var3=var1-var2;
		System.out.println("the value of variable var3 after subtraction is:-"+var3);
		
	}
	protected void multiplication()//can be accessed in the  same class
	                               //can also be accessed in another class of the same package
	{
		int var1=20;
		int var2=10;
		int var3;
		var3=var1*var2;
		System.out.println("the value of variable is after multiplication is :-"+var3);
		
		
	}

}
