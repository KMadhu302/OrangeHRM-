package com.UserDefineMethod;

public class MethodExample6
{
	//Global/instance variables
	int var1=100;
	int var2=50;
	
	public static void main(String[] args) 
	{
		MethodExample6 m6=new MethodExample6();
		m6.addition();
		m6.addition(50, 30);
		m6.addition(20, 10.10);
		m6.addition(30, 10.0, 30.20);
		m6.addition(20, 40);
		m6.subtraction();
	}
     public void addition()//user define method without parameters
     
                           //public methods can be access in any java class
                           
                           //user define methods names always be unique
     {
    	 //local variables
    	 int var1=30;
    	 int var2=20;
    	 int var3;
    	 
    	 var3=var1+var2;
    	 System.out.println("The value of the variable var3 is after addition is:-"+var3); 
     }
     public void addition(int var1,int var2)//user define method with parameters
                                           //user define method should be always be unique
     
     {
    	 int var3;
    	 var3= var1+var2;
    	 System.out.println("The value of the variable var3 is after addition is:-"+var3);
    	 
     }
     public void addition(int var1,double var2)//user define method as with parameters but , with different data types
                                              //user define method should always be unique
     {
    	 double var3;
    	 var3=var1+var2;
    	 System.out.println("The value of the variable var3 after addition :-"+var3);
     }
     public void addition(int var1,double var2,double var3)
     {
    	 double var4;
    	 
    	 var4=var1+var2+var3;
    	 System.out.println("The value of the variable var4 after addition:-"+var4);
    	 }
     public void subtraction()
     {
    	 int var3;
    	 
    	 var3=var1-var2;
    	 System.out.println("The value of the variable is after subtraction is:-"+var3);
     }
}
