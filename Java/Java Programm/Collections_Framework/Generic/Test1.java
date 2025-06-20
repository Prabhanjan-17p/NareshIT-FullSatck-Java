package Collections_Framework.Generic;
/*
What is the need of Generics ?
-------------------------------
As we know our compiler is known for Strict type checking because java is a statically typed checked language.

The basic problem with collection is, It can hold any kind of Object.

ArrayList al = new ArrayList();
al.add("Ravi");
al.add("Aswin");
al.add("Rahul");
al.add("Raj");
al.add("Samir");

for(int i =0; i<al.size(); i++)
{
   String s = (String) al.get(i);
   System.out.println(s);
}

By looking the above code it is clear that Collection stores everything in the form of Object so here even after adding String type only we need to provide casting as shown below.
 */
import java.util.*;
class Test1 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList(); //raw type
		al.add("Ravi");
		al.add("Ajay");
		al.add("Vijay");
							
		for(int i=0; i<al.size(); i++)
		{
		String name =  (String) al.get(i); //type casting is required
		System.out.println(name.toUpperCase());
		}	
		
	}
}