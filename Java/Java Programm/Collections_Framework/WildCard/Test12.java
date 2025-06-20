package Collections_Framework.WildCard;//program on wild-card chracter
import java.util.*;
class Parent
{

}
class Child extends Parent
{
}
public class Test12
{
public static void main(String [] args)
	{	
		ArrayList<?> lp = new ArrayList<Parent>();
		System.out.println("Wild card....");
	}
}