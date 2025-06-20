package Collections_Framework.Set_E.LinkedHashMap_K_V;

import java.util.*;
public class LinkedHashMapDemo 
{
	public static void main(String[] args) 
	{
		LinkedHashMap<Integer,String> l = new LinkedHashMap<>();
		l.put(1,"abc");
		l.put(3,"xyz");
		l.put(2,"pqr");
		l.put(4,"def");
		l.put(null,"ghi");
		System.out.println(l);
	}
}