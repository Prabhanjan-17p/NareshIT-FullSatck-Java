package Collections_Framework.ArrayList_E;

import java.util.ArrayList;
import java.util.ListIterator;

record Customer(Integer custId, String custName, Double custBill)
{	
}

public class ArrayListDemo1
{
	public static void main(String[] args) 
	{
		ArrayList<Customer> listOfCustomer = new ArrayList<>();
		listOfCustomer.add(new Customer(111, "Scott", 12000D));
		listOfCustomer.add(new Customer(222, "Smith", 12000D));
		listOfCustomer.add(new Customer(333, "Alen", 12000D));
		listOfCustomer.add(new Customer(444, "John", 12000D));
		
		listOfCustomer.forEach(System.out::println);
		System.out.println("---------------------");
		listOfCustomer.forEach(customer -> System.out.println(customer));
		System.out.println("---------------------");
		ListIterator ls = listOfCustomer.listIterator();
		ls.forEachRemaining(Cus -> System.out.println(Cus));

	}
}