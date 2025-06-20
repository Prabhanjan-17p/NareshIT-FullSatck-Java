package Collections_Framework.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

record Product(Integer productId, String productName)
{
	
}

public class LinkedListDemo6 {

	public static void main(String[] args)
	{
		List<Product> listOfProduct = new LinkedList<Product>();
		listOfProduct.add(new Product(1, "ApplePhone"));
		listOfProduct.add(new Product(2, "MiPhone"));
		listOfProduct.add(new Product(3, "VivoPhone"));
		
		System.out.println("Is list empty :"+listOfProduct.isEmpty());
		
		Iterator<Product> iterator = listOfProduct.iterator();
		iterator.forEachRemaining(prod -> System.out.println(prod.productName().toUpperCase()));
		
		Product product = listOfProduct.get(2);
        System.out.println(product);
	}

}