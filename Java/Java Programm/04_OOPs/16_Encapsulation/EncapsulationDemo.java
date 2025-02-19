
import java.util.Scanner;

public class EncapsulationDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee Id :");
		int id = sc.nextInt();
		System.out.print("Enter Employee Name :");
		String name = sc.nextLine();
		name = sc.nextLine();
		System.out.print("Enter Employee Salary :");
		double salary = sc.nextDouble();

		Employee scott = new Employee(id, name, salary);
		System.out.println("Original Data :" + scott);

		System.out.print("Enter the updated Salary :");
		double increment = sc.nextDouble();

		if (increment <= 0) {
			System.err.println("Increment amount must be positive");
		} else {
			scott.setEmployeeSalary(scott.getEmployeeSalary() + increment);
			System.out.println("After Salary Increment :" + scott);
		}

		/*
		 * Based on the Salary print whether the Employee is Developer, Designer
		 * OR Tester
		 * Salary >= 50000 -> Developer
		 * Salary >= 35000 -> Designer
		 * else Tester
		 */

		double employeeSalary = scott.getEmployeeSalary();

		if (employeeSalary >= 50000) {
			System.out.println(scott.getEmployeeName() + " is a Developer");
		} else if (employeeSalary >= 35000) {
			System.out.println(scott.getEmployeeName() + " is a Designer");
		} else {
			System.out.println(scott.getEmployeeName() + " is a Tester");
		}
		sc.close();
	}

}

class Employee {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;

	public Employee(int employeeId, String employeeName, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}

	public int getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return this.employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getEmployeeSalary() {
		return this.employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

}
