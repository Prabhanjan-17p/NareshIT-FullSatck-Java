class Foo
{	
	static int x;

    static
	{		
		System.out.println("x value is :"+x);
	}	
}

public class StaticBlockDemo2 
{
	public static void main(String[] args) 
	{
		 new Foo();
	}
}

// Note : static variables are also having default value.