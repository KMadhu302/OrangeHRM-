package com.Loop;

public class forLoopExample1 
{
	public static void main(String[] args)
	{
		System.out.println("*********!*******");
		//for(int index=1;index<=3;index++)
		for(int index=1;index<=3;index=index+1) 
		{    
			//True block
			System.out.println(index+""+"selenium");
		}
		
		System.out.println();
		System.out.println("******2*****");
		System.out.println();
			
		for (int index=0;index<=5;index=index+2) 
		{
			System.out.println(index+""+"webdriver");
		}
		System.out.println();
		System.out.println("*******3********");
		System.out.println();
		
		for(int index=3;index<=-9;index=index--)
		{
			System.out.println(index+""+"Testing");
			
		}
		System.out.println();
		System.out.println("******4*******");
		System.out.println();
		
		for(int index=-5;index<=-9;index--) 
		{
			System.out.println(index+""+"loadrunner");
			
		}
		System.out.println();
		System.out.println("*******5********");
		System.out.println();
		
		for (int index=-5;index<=0;index=index++)
		{
			System.out.println(index+""+"Testing");
		}
		System.out.println();
		System.out.println("*******6*********");
		System.out.println();
		
		for (int index=-5;index<=0;index=index+3)
		{
			System.out.println(index+""+"loadrunner");
		}
	}

}