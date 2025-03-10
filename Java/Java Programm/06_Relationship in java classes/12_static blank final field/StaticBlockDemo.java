//static block
class Foo
{		
	Foo()
	{
		System.out.println("No Argument constructor..");
	}

	{
		System.out.println("Non static Block..");
	}

	static
	{
		System.out.println("Static block...");
	}
	
}
public class StaticBlockDemo 
{	
	public static void main(String [] args) 
	{		
		System.out.println("Main Method Executed ");	
			
	}	
}

// Note : Here Foo.class file is not loaded hence static block will not be executed.