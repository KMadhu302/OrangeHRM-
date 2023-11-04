package com.UserDefineMethod;

public class MethodExample1 
{

	public void hello() //user define method
	                    // user define methods are using Re -usability purpose
	
	{
		
		System.out.println("Hello Dear Students");
		
	}
	public void hi() 
	{
		System.out.println("Learning selenium webdriver");
		
		
	}
	
	
	public static void main(String[] args) {
		// creating on object for current class
		MethodExample1 m1=new MethodExample1();
		
		//using the object calling the user define method
		m1.hello();
		
		MethodExample1 m11=new MethodExample1();
		m11.hi();
		m1.hello();
	    m11.hi();
	}

}
