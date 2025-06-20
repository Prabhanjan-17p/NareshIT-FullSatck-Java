package Collections_Framework.ArrayList_E;

import java.util.ArrayList;
import java.util.RandomAccess;

public class ArrayListDemo10 {

	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<>(100); 
        list.add("Java");
        list.add("World");          
        
        //public void trimToSize()
        list.trimToSize(); //Shrinks the capacity equal to the size
        System.out.println("Trimmed List Size: " + list.size()); 
        
        System.out.println(".........................");
        
        
        ArrayList<Integer> listOfNumber = new ArrayList<>();

        // public void ensureCapacity(int minCapacity)
        //Increase the capacity of the ArrayList to avoid frequent resizing.
        listOfNumber.add(999);
        
        
        
        listOfNumber.ensureCapacity(100);

        for (int i = 0; i < 50; i++) 
        {
        	listOfNumber.add(i);
        }

        System.out.println("List size: " + listOfNumber.size());
    }

}