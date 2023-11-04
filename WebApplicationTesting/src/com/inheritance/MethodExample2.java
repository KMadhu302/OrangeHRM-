package com.inheritance;

public class MethodExample2 extends MethodExample1


    //extends:- its a keyword in java-used to perform inheritance
    //inheritace - acquiring the properties of one class into another class	
{
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
public static void main(String[] args) 
{
	MethodExample2 m2=new MethodExample2();
	m2.subtraction();
	m2.multiplication();
	m2.addition();
	
}

}
