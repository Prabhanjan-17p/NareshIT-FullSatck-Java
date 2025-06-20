package Collections_Framework.Generic;

import java.util.*;
class Test2
{
	public static void main(String[] args) 
	{
		ArrayList t = new ArrayList(); //raw type
		t.add("alpha");
		t.add("beta");
		for (int i = 0; i < t.size(); i++) 
		{
		  String str =(String) t.get(i);
		  System.out.println(str);
		}

		 t.add(1234);
		 t.add(1256);
		  for (int i = 0; i < t.size(); ++i)
	       {	 
			 String obj= (String)t.get(i); //we can't perform type casting here
			 System.out.println(obj);
		  }
	}
}
/*
Even after type casting there is no guarantee that the things which are coming from ArrayList Object is String only because we can add anything in the Collection as a result java.lang.ClassCastException.
 */