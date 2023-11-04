package statements;

public class ifElseJavaProgram 
{
	public static void main(String[] args) 
	{
		int var1=10;
		int var2=30;
		int var3=40;
		
		if(var1<var2 &&var2<var3) 
		{
			System.out.println("True");
			System.out.println("var1 variable value is less than var2 and var3");
		}
		else
			if(var1>var2&&var2>var2)
		{
			System.err.println("var1 variable value is greater than var2 and var3");
		}
		
	}

}
