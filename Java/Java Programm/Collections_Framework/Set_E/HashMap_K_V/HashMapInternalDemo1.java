package Collections_Framework.Set_E.HashMap_K_V;

import java.util.HashMap;

public class HashMapInternalDemo1 {

	public static void main(String[] args) 
	{
		HashMap<String,Integer> hm1 = new HashMap<>();
		hm1.put("A", 1);
		hm1.put("A", 2);
		hm1.put(new String("A"), 3);
		System.out.println("Size is :"+hm1.size());
		System.out.println(hm1);
		
		System.out.println("....................");
		
		
		HashMap<Integer,Integer> hm2 = new HashMap<>();
		hm2.put(128, 1);
		hm2.put(128, 2);
		System.out.println("Size is :"+hm2.size());
		System.out.println(hm2);
		System.out.println("....................");
				
		
		HashMap<Object,Object> hm3 = new HashMap<>();
		hm3.put("A", 1);
		hm3.put("A", 2);
		hm3.put(new String("A"), 3);
		hm3.put(65, 4);
		System.out.println("Size is :"+hm3.size());
		System.out.println(hm3);    

	}

}