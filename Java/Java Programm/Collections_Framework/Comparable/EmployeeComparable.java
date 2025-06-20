package Collections_Framework.Comparable;
/*
Limitation of Comparable<T> interface :
----------------------------------------
1) Due to the current object support we need to modify the BLC
   class so Lambda Expression will not work with Comparable even it is a functional interface.

2) We can write only one sorting logic.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class EmployeeComparable 
{
	public static void main(String[] args) 
	{
		ArrayList<Employee> listOfEmployee = new ArrayList<>();
		listOfEmployee.add(new Employee(333, "Aryan", 34789D));
		listOfEmployee.add(new Employee(111, "Zuber", 35789D));
		listOfEmployee.add(new Employee(222, "Raj", 32789D));
		
		System.out.println("Original Data :");
		listOfEmployee.forEach(System.out::println);
		
		Collections.sort(listOfEmployee);	
		System.out.println("Data after Sorting based on the ID:");
		listOfEmployee.forEach(System.out::println);	

	}

}