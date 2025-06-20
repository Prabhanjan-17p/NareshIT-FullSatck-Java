package Collections_Framework.Generic;//Mixing generic with non-generic
import java.util.*;

class Car
{
}
public class Test5
{
	public static void main(String [] args) 
	{
	ArrayList<Car> a = new ArrayList<>();
	a.add(new Car());
	a.add(new Car());
    a.add(new Car());

	ArrayList b = a;  //assigning Generic to raw type 	      
		
    System.out.println(b);   
	}
}