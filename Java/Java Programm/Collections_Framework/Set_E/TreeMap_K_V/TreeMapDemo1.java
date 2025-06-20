package Collections_Framework.Set_E.TreeMap_K_V;

import java.util.*;
public class TreeMapDemo1 
{
      public static void main(String args[]) 
      {
            TreeMap map = new TreeMap();
            map.put("one","1");
            map.put("two",null);
            map.put("three","3");
			map.put("four",4);

            displayMap(map);  

	map.forEach((k, v) -> System.out.println("Key = " + k + ", Value = " + v));	 	       
      }
      static void displayMap(TreeMap map) 
      {
           Collection c = map.entrySet();   //Set<Map.Entry>

           Iterator i = c.iterator();
           i.forEachRemaining(x -> System.out.println(x));
      }
}