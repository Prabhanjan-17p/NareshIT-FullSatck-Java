public class CustomerDemo 
{
	public static void main(String[] args) 
	{
		Customer martin = new Customer();
		martin.setCustomerData(111, "Mr Martin");
		martin.getCustomerData();
		
		System.out.println("..............");
		
		Customer alen = new Customer();
		alen.setCustomerData(222, "Mr. Alen");
		alen.getCustomerData();		
		
	}

}
