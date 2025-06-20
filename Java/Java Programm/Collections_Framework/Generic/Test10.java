package Collections_Framework.Generic;

import java.util.Arrays;

public class Test10
{
public static void main(String [] args)
	{	
	   /*ArrayList<Object> al = new ArrayList<String>(); [Compile time ]
	   ArrayList al = new ArrayList();  [Runtime, Type Erasure]
	   al.add(true);*/
	     

		Object []obj = new String[3]; //valid with Array
		obj[0] = "Ravi";
		obj[1] = "hyd";
		obj[2] =  90; //java.lang.ArrayStoreException
		System.out.println(Arrays.toString(obj));
	}
}
/*
Note :- Program will generate java.lang.ArrayStoreException because we are trying to insert 90 (integer value) into String array.

In Array we have an Exception called ArrayStoreException (Which protect us to assign some illegal value in the array at runtime) but the same Exception or such type of exception, is not available with Generics (due to Type Erasure) that is the reason in generics, compiler does not allow upcasting concept.
(It is a strict compile time protection)
 */