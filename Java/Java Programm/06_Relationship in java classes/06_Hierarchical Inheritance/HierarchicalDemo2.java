class Employee
{
	protected double salary;

	public Employee(double salary) 
	{
		super();
		this.salary = salary;
	}	
}
class Developer extends Employee
{
	public Developer(double salary) 
	{
		super(salary);		
	}

	@Override
	public String toString() 
	{
		return "Developer [salary=" + salary + "]";
	}
	
}

class Designer extends Employee
{
	public Designer(double salary) 
	{
		super(salary);		
	}

	@Override
	public String toString() 
	{
		return "Designer [salary=" + salary + "]";
	}	
}
public class HierarchicalDemo2 {

	public static void main(String[] args) 
	{
		Developer d1 = new Developer(60000);
		System.out.println(d1);
		
		Designer d2 = new Designer(35000);
		System.out.println(d2);

	}

}