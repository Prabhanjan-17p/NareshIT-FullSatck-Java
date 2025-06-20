package Collections_Framework.Comparator;
/*
//Ascending and Descending of Integer class :
---------------------------------------------
 */
import java.util.ArrayList;
import java.util.Collections;

public class IntegerDesc {

	public static void main(String[] args) 
	{
		ArrayList<Integer> listOfNumber = new ArrayList<Integer>();
		listOfNumber.add(78);
		listOfNumber.add(12);
		listOfNumber.add(9);
		listOfNumber.add(45);		
		
		
		listOfNumber.sort((i1,i2)-> i1.compareTo(i2));
		System.out.println("Ascending Order");
		listOfNumber.forEach(System.out::println);
		
		listOfNumber.sort((i1,i2)-> i2.compareTo(i1));
		System.out.println("Descending Order");
		listOfNumber.forEach(System.out::println);
		
	}

}