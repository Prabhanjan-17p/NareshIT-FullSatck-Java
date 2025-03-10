/*
 * super("Scott");  : User has to write explicitly to the first line 
                  	of the Constructor. It is used to call 
		   			Parameterized Constructor (Pramaterized constructor of super class which accepts a String value as a parameter) of super class.
 */

class Super
{
	public Super(String name)
	{
		super();
		System.out.println("My name is :"+name);
	}
}
class Sub extends Super
{
	public Sub()
	{
		super("Scott");
		System.out.println("No Argument constructor of sub class");
	}
}

public class ConstructorChainingDemo2 {

	public static void main(String[] args) 
	{
		new Sub();

	}

}