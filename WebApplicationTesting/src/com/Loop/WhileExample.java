package com.Loop;

public class WhileExample
{
public static void main(String[] args)
{
	int index=2;
	while (index<=5)
	{
		System.out.println(index+""+"selenium");
		index=index+1;
	}
	System.out.println();
	System.out.println("*******1*******");
	System.out.println();
	
	index=5;
	while (index<=10)
	{
		System.out.println(index+""+"webdriver");
		index=index+4;	
	}
	System.out.println();
	System.out.println("*******2******");
	System.out.println();
	
	System.out.println("The value of index is:-"+index);
	
	while (index<=20);
	{
		System.out.println(index+""+"selenium");
        index=index+2;
	}
	System.out.println();
	System.out.println("******3*******");
	System.out.println();
	
	System.out.println("The value of index is:-"+index);
	
	while (index<=25);
	{
		System.out.println(index+""+"jmeter");
		index=index+6;
	}
	

}
}
