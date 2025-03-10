class  A        
{
	static 
	{
		System.out.println("A");
	}
	 
	{
		System.out.println("B");
	}

	A() 
	{	
		super();
		System.out.println("C");
	}
}
class B extends A
{
	static 
	{
		System.out.println("D");
	}
	 
	{
		System.out.println("E");
	}

	B() 
	{
		super();
		System.out.println("F");
	}

}
public class StaticBlockDemo4 
{
	public static void main(String[] args) 
	{
		new B();  //class loading + Object Creation
	}
}

//Output - ADBCEF

// Note : Always Parent class will be loaded first before Child. 