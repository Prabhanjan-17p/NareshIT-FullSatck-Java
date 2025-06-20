package Collections_Framework.Set_E.TreeMap_K_V;

import java.util.TreeMap;

record Employee(Integer id, String name, Integer age)
{
	
}


public class TreeMapSorting {

	public static void main(String[] args) 
	{
		System.out.println("Sorting name -> Ascending Order");
		
		TreeMap<Employee,String> tm1 = new TreeMap<Employee,String>((e1,e2)->e1.name().compareTo(e2.name()) );
		tm1.put(new Employee(101, "Zaheer", 24),"Hyderabad");
		tm1.put(new Employee(201, "Aryan", 27),"Jamshedpur");
		tm1.put(new Employee(301, "Pooja", 26),"Mumbai");
		tm1.forEach((k,v)-> System.out.println(k+" : "+v));
	}

}