/*
Q) What will happen if we don't follow the contract ?
Case 1 :
--------
If we override only equals(Object obj)
---------------------------------------
If we override only equals(Object obj) method for content comparison
then same object (duplicate object) will have different hashcode (due to Object class hashCode()) hence same object (content wise) will move into two different buckets [Duplication].

Case 2 :
--------
If we override only hashCode() method
--------------------------------------
If we override only hashCode() method then two objects which are having same hashcode (due to overriding) will go to same bucket but == operator and equals(Object obj) method of Object class, both will return false hence duplicate object will be inserted into same bucket by using Singly LinkedList.

So, the conclusion is, compulsory we need to override both the methods for removing duplicate elements.

//Program
 */

package Collections_Framework.Set_E.HashMap_K_V;

import java.util.HashMap;
import java.util.Objects;

class Customer
{
	private Integer customerId;
	private String customerName;
		
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + "]";
	}

	public Customer(Integer customerId, String customerName) 
	{
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(customerId, customerName);
	}

   
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(customerId, other.customerId) && Objects.equals(customerName, other.customerName);
	}
	
	
}

public class HashMapInternalDemo2
{

	public static void main(String[] args) 
	{
	   Customer c1 = new Customer(111, "Scott");	
	   Customer c2 = new Customer(111, "Scott");	
	   	   
	   System.out.println(c1.equals(c2));
	   System.out.println(c1.hashCode()+" : "+c2.hashCode());
	   
	  
	   System.out.println("..............................");
	   HashMap<Customer,String> map = new HashMap<>();
	   map.put(c1, "A");   //c1 = A
	   map.put(c2, "B");   
	   
	   System.out.println(map.size()); 
	   System.out.println(map); 
	  
	}

}


//Solution of HashMapInternalDemo2
/*
Customer class we are using as a HashMap key so it must override
hashCode() and equals(Object obj) as well as at advanced level, It must be immutable class.

All the Wrapper classes and String class are immutable as well as
hashCode() and equals(Object obj) methods are overridden in these classes so perfectly suitable to becoming HashMap key.

so final conclusion is, In our user-defined class which we want to use as a HashMap key must be immutable and hashCode() and equals(Object obj) method must be overridden.
----------------------------------------------------------------------
While working with HashSet element OR HashMap key, If we accept custom
object then we should always prefer record because It is immutable as well as hashCode() and equals() methods are overridden.


 */
/*
import java.util.HashMap;
import java.util.Objects;

record Customer(Integer id, String name)
{

}

public class HashMapInternalDemo2
{
	public static void main(String[] args)
	{
		Customer c1 = new Customer(111, "Scott");
		Customer c2 = new Customer(111, "Scott");

		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode()+" : "+c2.hashCode());


		System.out.println("..............................");
		HashMap<Customer,String> map = new HashMap<>();
		map.put(c1, "A");
		map.put(c2, "B");

		System.out.println(map.size());
		System.out.println(map);

	}

}

 */