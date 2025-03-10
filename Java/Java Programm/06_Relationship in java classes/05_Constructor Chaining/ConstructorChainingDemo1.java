class Alpha
{
	public Alpha()
	{
		super(); //No Argument OR Default constructor of super class
		System.out.println("Alpha class Constructor");
	}
}
class Beta extends Alpha
{
	public Beta()
	{
		super();//No Argument OR Default constructor of super class		  
		System.out.println("Beta class Constructor");		
	}
}

public class ConstructorChainingDemo1 
{
	public static void main(String[] args) 
	{
		new Beta();
	}

}