
import java.util.Scanner;

class Customer {
	private int customerId;
	private String customerName;
	private double customerBill;

	public Customer(int customerId, String customerName, double customerBill) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerBill = customerBill;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerBill="
				+ customerBill + "]";
	}

	public static Customer getCustomerObject() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Customer Id :");
		int id = sc.nextInt();

		System.out.print("Enter Customer Name :");
		String name = sc.nextLine();
		name = sc.nextLine();

		System.out.print("Enter Customer Bill :");
		double bill = sc.nextDouble();

		Customer c1 = new Customer(id, name, bill);
		sc.close(); 
		return c1;
		
	}

}

// CustomerDemo.java
// ------------------

public class ReusebaleFactoryMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many objects you want to create :");
		int noOfObj = sc.nextInt();

		for (int i = 1; i <= noOfObj; i++) {
			Customer customer = Customer.getCustomerObject();
			System.out.println(customer);
		}

		sc.close();

	}

}