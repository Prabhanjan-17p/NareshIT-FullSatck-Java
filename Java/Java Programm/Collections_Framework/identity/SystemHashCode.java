//How to generate OR find out System hashcode value

package Collections_Framework.identity;

class Employee
{
	
}

record Customer()
{
	
}


public class SystemHashCode 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee();

		System.out.println(System.identityHashCode(e1));
		System.out.println(System.identityHashCode(e2));
		
		System.out.println(".....................");
		
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		System.out.println(c1.hashCode()+" : "+c2.hashCode());
		
		System.out.println(System.identityHashCode(c1));
		System.out.println(System.identityHashCode(c2));
		
		
		System.out.println("....................");
		
		String s1 = new String("india");
		String s2 = "india";
		
		System.out.println(s1.hashCode()+" : "+s2.hashCode());
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		
	}

}