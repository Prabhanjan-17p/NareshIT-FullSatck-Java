public class EmployeeDemo{

	public static void main(String[] args) 
	{
		Employee scott = new Employee(); 
		scott.setEmployeeData(101, "Scott", 120000);
		scott.calculateEmployeeGrade();
		System.out.println(scott.getEmployeeData());

	}

}

class Employee
{
   int employeeId;
   String employeeName;
   double employeeSalary; 
   char employeeGrade;
   
   public void setEmployeeData(int id, String name, double salary)
   {
	   employeeId = id;
	   employeeName = name;
	   employeeSalary = salary;
   }
   
   public void calculateEmployeeGrade()
   {
	   if(employeeSalary >=100000)
	   {
		   employeeGrade = 'A';
	   }
	   else if(employeeSalary >=75000)
	   {
		   employeeGrade = 'B';
	   }
	   else if(employeeSalary >=50000)
	   {
		   employeeGrade = 'C';
	   } 
	   else
	   {
		   employeeGrade = 'D';
	   }
	   
   }
   
   
   
   public String getEmployeeData()
   {
	   return "[Id is :"+employeeId+", Name is :"+employeeName+", Salary is "+employeeSalary+", Grade is :"+employeeGrade+"]";
   } 
   
}
