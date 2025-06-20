package Collections_Framework.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo5 {

	public static void main(String[] args) 
	{			
		
		List<String> listOfName = Arrays.asList("Ravi","Rahul","Ankit", "Rahul");
		
		LinkedList<String> list = new LinkedList<>(listOfName); 
		list.forEach(System.out::println);
		
		System.out.println("....................");
		
		ArrayList<String> listOfCity = new ArrayList<>();
		listOfCity.add("Hyderabad");
		listOfCity.add("Bhubneswar");
		listOfCity.add("Kolkata");	
		
		LinkedList<String> cities = new LinkedList<>(listOfCity);
		cities.add("Pune");		
		cities.forEach(System.out::println);
		
		
		System.out.println("....................");
		
		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Mango");
		
		List<String> synchronizedFruitList = Collections.synchronizedList(fruits);
		synchronizedFruitList.forEach(System.out::println);	
	}
}