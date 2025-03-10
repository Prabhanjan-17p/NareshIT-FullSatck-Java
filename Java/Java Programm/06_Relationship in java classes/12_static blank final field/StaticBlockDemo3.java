class Demo
{	
	final static int a ;	//Blank static final field

	static
	{	
		m1(); 
		a = 100;	
		System.out.println("User Value :"+a);
	}
	
	public static void m1()
	{
		System.out.println("Default Value :"+a);
	}
	
	
}	
public class  StaticBlockDemo3
{
	public static void main(String[] args) 
		{		
	         System.out.println("a value is :"+Demo.a);		
	    }
}

// Note : A statitc blank final field also have default value.