package com.Loop;

public class DoWhileExample 
{
	public static void main(String[] args) 
	{
		int index=1;
		
		do
		{
			System.out.println(index+""+"selenium");
			index++;
		}
		while (index<=3);
		
		System.out.println();
		System.out.println("************");
		System.out.println();
		
		index=1;
		
		do
		{
			System.out.println(index+""+"webdriver");
			index++;
		}
		while (index>=3);
	}

}
