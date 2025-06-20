package Collections_Framework.IdentityHashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo 
{
	public static void main(String[] args) 
	{
		HashMap<String,String> map = new HashMap<>();
		map.put("india", "Asia");
		map.put(new String("india"), "Asia");
		System.out.println(map.size());
		System.out.println(map);
		
		IdentityHashMap<String, String> ihm = new IdentityHashMap<String, String>();
		ihm.put("india", "Asia");
		ihm.put(new String("india"), "Asia");
		System.out.println(ihm.size());
		System.out.println(ihm);

	}

}