package Collections_Framework.Generic;//program on wild-card chracter
import java.util.*;
class Parent1
{

}
class Child1 extends Parent1
{
}
public class Test12
{
public static void main(String [] args)
	{	
		ArrayList<?> lp = new ArrayList<Parent1>();
		System.out.println("Wild card....");
	}
}