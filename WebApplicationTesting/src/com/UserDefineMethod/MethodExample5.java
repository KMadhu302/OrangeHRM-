package com.UserDefineMethod;

public class MethodExample5 
{
	public static void main(String[] args)
	{
		MethodExample4 m4=new MethodExample4();
		System.out.println("division method of methodexample4");
		m4.division();
		System.out.println();
		
		MethodExample2 m2=new MethodExample2();
		System.out.println("addition method of methodexample2");
		m2.addition();
		System.out.println();
		
		MethodExample3 m3= new MethodExample3();
		//subtraction method of methodexample3 cannot be here because it is private method
		System.out.println("multiplication method of methodexample3");
		//multiplication method of methodexample3 is protection method
		m3.multiplication();
		System.out.println();
		
	}
	

}
