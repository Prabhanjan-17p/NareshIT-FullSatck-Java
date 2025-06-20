package Collections_Framework.Set_E.TreeSet_E;

import java.util.TreeSet;

record Product(Integer id, String name) 
{
	
}

public class TreeSetDemo4 
{
	public static void main(String[] args) 
	{
		TreeSet<Product> products = new TreeSet<>((p1,p2)->p1.name().compareTo(p2.name()));
		products.add(new Product(333, "Camera"));
		products.add(new Product(222, "Mobile"));
		products.add(new Product(111, "Laptop"));
		
		products.forEach(System.out::println);
		

	}

}