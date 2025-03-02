class Product
{
	private double price = 12000;

	public double getPrice() 
	{
		return price;
	}

	public void setPrice(double price) 
	{
		this.price = price;
	}
}

public class PassByValueDemo3 {

	public static void main(String[] args) 
	{
		Product p1 = new Product();
		System.out.println(p1.getPrice()); //12000		
		accept(p1);		
		System.out.println("After Method calling :");
		System.out.println(p1.getPrice());//18000		
	}

	public static void accept(Product prod)
	{
		prod.setPrice(18000);
	}	
}