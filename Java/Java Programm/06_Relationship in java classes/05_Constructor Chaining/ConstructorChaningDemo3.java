/*
 * this()  : Written by user in the first line of constructor. It is 
          	used to call no argument constructor of current class
	  		OR Same class.
*/

class Base
{
	public Base()
	{
		System.out.println("No Arg. constructor of super class ");
	}
	public Base(int x)
	{
		this();
		System.out.println("Parameterized constructor of super class :"+x);
	}
}

class Derived extends Base
{
	public Derived()
	{
		super(15);
		System.out.println("No Arg. constructor of Sub class ");
	}
}

public class ConstructorChaningDemo3 
{
	public static void main(String[] args)
	{
		new Derived();

	}

}