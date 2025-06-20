package Collections_Framework.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductComparator {

	public static void main(String[] args) 
	{
		ArrayList<Product> listOfProduct = new ArrayList<>();
		listOfProduct.add(new Product(333, "Mobile"));
		listOfProduct.add(new Product(111, "Laptop"));
		listOfProduct.add(new Product(222, "Camera"));
		
		System.out.println("Original Data :");
		listOfProduct.forEach(System.out::println);
		
		System.out.println("Sorting Based on the Product Id :");		
		Comparator<Product> compId = (p1,p2)-> p1.id().compareTo(p2.id());		
		Collections.sort(listOfProduct, compId);		
		listOfProduct.forEach(System.out::println);
		

		System.out.println("Sorting Based on the Product Name :");	
		Collections.sort(listOfProduct, (p1,p2)-> p1.name().compareTo(p2.name()));
		listOfProduct.forEach(System.out::println);
	}

}