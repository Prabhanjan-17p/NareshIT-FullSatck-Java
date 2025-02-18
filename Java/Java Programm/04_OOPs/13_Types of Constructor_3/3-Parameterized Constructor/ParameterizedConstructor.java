//ELC Class---------------------------
public class ParameterizedConstructor {

	public static void main(String[] args) 
	{
		Dog tommy = new Dog("Tommy", 3, 2.3, "Grey");
		System.out.println(tommy);

		System.out.println("...............");
		Dog tiger = new Dog("Tiger", 5, 4.4, "Black");
		System.out.println(tiger);
	}

}


//BLC Class----------------------------
class Dog 
{
	private String dogName;
	private int dogAge;
	private double dogHeight;
	private String dogColor;
	
		
	public Dog(String dogName, int dogAge, double dogHeight, String dogColor) 
	{
		super();
		this.dogName = dogName;
		this.dogAge = dogAge;
		this.dogHeight = dogHeight;
		this.dogColor = dogColor;
	}

	@Override
	public String toString() 
	{
		return "Dog [dogName=" + dogName + ", dogAge=" + dogAge + ", dogHeight=" + dogHeight + ", dogColor=" + dogColor+ "]";
	}

}
