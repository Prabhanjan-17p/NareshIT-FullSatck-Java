package Collections_Framework.Comparable;

public record Employee(Integer id, String name, Double salary) implements Comparable<Employee>
{
	@Override
	public int compareTo(Employee e2) 
	{	
		return this.id - e2.id; // 0 OR +ve OR -ve
	}
}