//Program on removeIf(Predicate<T> p) method :

package Collections_Framework.ArrayList_E;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfDemo {

	public static void main(String[] args) 
	{
		
		List<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Raj");
		listOfNames.add("Rohit");
		listOfNames.add("Rohan");
		listOfNames.add("Ankit");
		listOfNames.add("Scott");
		
		System.out.println("Original List :"+listOfNames);
				
		listOfNames.removeIf(str -> str.startsWith("R"));
		
		System.out.println("After Removing :"+listOfNames);		
	}
}