class Test
{	    
	public static final Test t1 = new Test(); 	//t1 = null
	
	static
	{
	   System.out.println("static block");
	}

	{
	   System.out.println("Non static block");
	}

	Test()
	{
		System.out.println("No Argument Constructor");
	}
	
	
}

public class StaticBlockDemo9
{
	public static void main(String[] args) 
	{
		new Test();  //2 steps (class loading + Object creation)
	}
}