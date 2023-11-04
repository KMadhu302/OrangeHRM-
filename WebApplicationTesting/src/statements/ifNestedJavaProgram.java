package statements;

public class ifNestedJavaProgram 
{
	public static void main(String[] args)
	{
		int a=20;
		int b=10;
		int c=40;
		if(a>b)
		{
			System.out.println("The value of a is greater than b");
			
				if(a<c) 
		
			{
				System.out.println("The value of a is less than c");
			}
		}
		
	}

}