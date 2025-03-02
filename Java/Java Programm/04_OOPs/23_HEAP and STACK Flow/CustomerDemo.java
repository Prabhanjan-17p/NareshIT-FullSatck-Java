
class Customer
{
	private String name; 
	private int id; 

	public Customer(String name , int id) 
	{
		super();
		this.name=name;
		this.id=id;
	}

	public void setId(int id)  
	{
		this.id=id;
	}
	public void setname(String name)  
	{
		this.name=name;
	}

	public int getId() 
	{
		return this.id;
	}
	public String getName() 
	{
		return this.name;
	}
}

public class CustomerDemo
{
	public static void main(String[] args) 
	{
		int val = 100;

		Customer c = new Customer("Ravi",2);

        m1(c);     
		
		//GC
		
		System.out.println(c.getId());
		System.out.println(val);
	}

	public static void m1(Customer cust) 
	{
		cust.setId(5);   

	    cust = new Customer("Rahul",7);

		cust.setId(9);
		System.out.println(cust.getId());
	}
}  