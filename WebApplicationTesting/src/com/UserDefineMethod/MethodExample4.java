package com.UserDefineMethod;

public class MethodExample4
{
	public static void main(String[] args)
	{
		MethodExample4 m4=new MethodExample4();
		System.out.println("division method of methodexample4");
		m4.division();	
		System.out.println();
		MethodExample2 m2 =new MethodExample2();
		System.out.println("addition method of methodexample2");
		m2.addition();
		System.out.println();
		MethodExample3 m3 =new MethodExample3();
		//substraction method of methodexample3 class cannot be call here because it is private method
		System.out.println("multiplication method of methodexample3");
		//multiplicaion method is protected method
		m3.multiplication();
		System.out.println();
		
	}
     void division()//default method
     {
    	 int var1=60;
    	 int var2=30;
    	 int var3;
    	 var3=var1/var2;
    	 System.out.println("The value of the variable is after division :-"+var3);
    	 
    	 
	
    	 
}
}
