package com.StringComparison;

public class StringCompareExample 
{
	public static void main(String[] args)
	{
		String string1="LiveTech";
		String string2="Livetech";//should be "LiveTech"
		
		if (string1.equals(string2))
		
		{
			System.out.println("String2 variable value is equal to String1 variable value ");
	
		}
		else
		{
			System.out.println("String2 variable value is NOT equal to String1 variable value");
		}
		System.out.println();
		System.out.println("**********************");
		
		String string3="LiveTech";
		String string4="Livetech";//should be "LiveTech"-but not exactly  the similar characters
		
		if (string3.equalsIgnoreCase(string4)) 
		{
			System.out.println("string3 variable value is equal to string4 variable value");
			
		}
		else
		{
			System.out.println("string3 variable value is equal to string4 variable value");
			
		}
		System.out.println();
		System.out.println("**************************");
		
		String string5="Tech";//should have a text "Tech":-expected
		String string6="LiveTech";//-actual
		
		if (string5.contains(string6)) 
		{
			System.out.println("string5 variable value is existing in string6 variable value");
	
		}
		else 
		{
			System.out.println("string5 varible value is NOT existing in string6 variable value");
		}
	
		System.out.println();
		System.out.println("************String to lowercase*******");
		
		String string7="LiveTech";
		String string7LowerCase=string7.toLowerCase();
		
		System.out.println("string7 value is converting to LowerCase is :-"+string7LowerCase);
		
		System.out.println();
		System.out.println("***********string to UpperCase******** ");
		
		String string7UpperCase=string7.toUpperCase();
		
		System.out.println("string7 value is converting to Uppercase:-"+string7UpperCase);
				
		System.out.println();
		System.out.println("***************************");
		
		int  string7length=string7.length();
		System.out.println("The number of characters of the string string7 is:-"+string7length);
		
		System.out.println();
		System.out.println("***********************");
		
		String string8="LiveTech";
		String string9="LiveTech Testing";
		
		int string8length=string8.length();
		System.out.println(string8length);
		
		int string9length=string9.length();
		System.out.println(string9length);
		if (string8length>string9length)
		{
			System.out.println("string8 length is greater than string9 length");
			
		}
		else 
		{
			System.out.println("string 8 length is less than string9 length");

		}
			System.out.println();
			System.out.println("***********************");
		if (string8.length()<string9.length())
		{
			System.out.println("string 8 length is less than string9 length");
		}
		else
		{
			System.out.println("string 8 length is greater than string9 length");
		}
		
				
		System.out.println();
		System.out.println("*************************");
		
		String string10="10.2333";
		System.out.println("The string value variable is:-"+string10);
		
		String string11="A";
		System.out.println("The string value variable is:-"+string11);
		
		
		
	}
	

}

