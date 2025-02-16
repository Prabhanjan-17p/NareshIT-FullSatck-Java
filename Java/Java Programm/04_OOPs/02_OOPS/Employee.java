import java.util.Scanner;

public class Employee 
{
   int employeeNumber;  //0
   String employeeName; //null
   double employeeSalary; //0.0
   
   public void setEmployeeData()
   {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter employee Number :");
	   employeeNumber = sc.nextInt();
	   System.out.print("Enter employee Name :");
	   employeeName = sc.nextLine();
	   employeeName = sc.nextLine();
	   System.out.print("Enter employee Salary :");
	   employeeSalary = sc.nextDouble();
       
       sc.close();
   }
   
   public void getEmployeeData()
   {
	   System.out.println("Employee Number is :"+employeeNumber);
	   System.out.println("Employee Name is :"+employeeName);
	   System.out.println("Employee Salary is :"+employeeSalary);
   }  

   
   
}

class EmployeeDemo 
{
	public static void main(String[] args) 
	{
		Employee scott = new Employee();
		scott.setEmployeeData();
		scott.getEmployeeData();
		
		System.out.println(".............");
		
		Employee smith = new Employee();
		smith.setEmployeeData();
		smith.getEmployeeData();		
		
	}

}