package Collections_Framework.Set_E.HashMap_K_V;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo3 
{
  public static void main(String[] args) 
  {
	    HashMap<Integer,String> newmap1 = new HashMap<>();

		HashMap<Integer,String> newmap2 = new HashMap<>();	  

		newmap1.put(1, "OCPJP");
		newmap1.put(2, "is");
		newmap1.put(3, "best");
			  
		System.out.println("Values in newmap1: "+ newmap1);

		newmap2.put(4, "Exam");

		newmap2.putAll(newmap1);

		System.out.println("Iterating through forEach()");
		newmap2.forEach((k,v)->System.out.println(k+" : "+v));
		
		System.out.println("All the Unique keys");
		Set<Integer> setOfKeys = newmap2.keySet();
		System.out.println(setOfKeys); //[]
		
		System.out.println("All the values");
		Collection<String> values = newmap2.values();
		System.out.println(values);	//[]	
		
		System.out.println("..............................");
		
		System.out.println("Loose Coupling for Merging one Map to another");
		
		HashMap<Integer, String> hm1 = new HashMap<>();

		hm1.put(1, "Ravi");
		hm1.put(2, "Rahul");
		hm1.put(3, "Rajen");

		HashMap<Integer, String> hm2 = new HashMap<>(hm1);

		System.out.println("Mapping of HashMap hm1 are : "	+ hm1);
	
		System.out.println("Mapping of HashMap hm2 are : " + hm2);
		
  }
}