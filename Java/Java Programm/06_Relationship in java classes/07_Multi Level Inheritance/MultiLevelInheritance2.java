class Vehicle
{
	protected String name;

	public Vehicle(String name) 
	{
		this.name = name;
	}
	
	public void run()
	{
		System.out.println(name+" Vehicle is Running");
	}	
}

class Car extends Vehicle
{
	public Car(String name) 
	{
		super(name);		
	}
	
	public void run()
	{
		System.out.println(name+" Car is Running");
	}	
	
}
public class MultiLevelInheritance2 
{
	public static void main(String[] args) 
	{
		Car car = new Car("Naxon");
		car.run();		

	}

}