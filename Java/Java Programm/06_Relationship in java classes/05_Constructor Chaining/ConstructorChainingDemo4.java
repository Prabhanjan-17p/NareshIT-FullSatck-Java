/*
this("Smith");  : It is explicitly written by user in the first
                  line of the constructor. It is used to call 
		  parameterized constructor of current class.
 */

class Parent
{
	public Parent()
	{
		this("Smith");
		System.out.println("No Argument Constructor of Parent class");
	}
	
	public Parent(String name)
	{
		System.out.println("Parameterized Constructor :"+name);
	}
}
class Child extends Parent
{
	public Child()
	{
		System.out.println("No Argument Constructor of Child class");
	}
}

public class ConstructorChainingDemo4 
{
	public static void main(String[] args) 
	{
		new Child();
	}

}