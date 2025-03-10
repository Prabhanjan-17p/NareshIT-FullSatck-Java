class Emp
{
	protected int employeeId;
	protected String employeeName;
	protected double employeeSalary;
	
	public Emp(int employeeId, String employeeName, double employeeSalary) 
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}	
}
class Pemp extends Emp
{
	protected String department;
	protected String designation;
	
	public Pemp(int employeeId, String employeeName, double employeeSalary, String department, String designation) 
	{
		super(employeeId, employeeName, employeeSalary);
		this.department = department;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Pemp [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", department=" + department + ", designation=" + designation + "]";
	}	
}

public class SingleLevelDemo1 {

	public static void main(String[] args) 
	{
		Pemp p = new Pemp(1, "Scott", 90000, "IT", "Programmer");
		System.out.println(p);

	}

}