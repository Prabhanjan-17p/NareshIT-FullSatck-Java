


public class PassByValueDemo4 
{
	public static void main(String[] args)
	{
		Customer c1 = new Customer(); 
		System.out.println(c1.getCustomerBill()); //12000
		
		accept(c1);
		System.out.println("After Method Calling :");
		System.out.println(c1.getCustomerBill()); //12000		
	}
	
	public static void accept(Customer cust)  //cust = c1
	{
		cust = new Customer();
		cust.setCustomerBill(25000);
	}
}

class Customer 
{
	private double customerBill = 12000;

	public double getCustomerBill() 
	{
		return customerBill;
	}

	public void setCustomerBill(double customerBill)
	{
		this.customerBill = customerBill;
	}
}
