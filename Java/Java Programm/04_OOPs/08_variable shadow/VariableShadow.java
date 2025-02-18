// /*
//  * If class level variables and method level variables are having exactly same name then method level variable will hide class level variable inside the method body OR c`1onstructor OR block, This concept is known as Variable Shadow.
//  */

// //ELC Class-----------------------------
// public class VariableShadow {

// 	public static void main(String[] args) 
// 	{
// 		Customer cust = new Customer();
// 		cust.show(18000);

// 	}

// }



// //BLC Class ------------------------------
// class Customer
// {
// 	int customerId = 111;
// 	String customerName = "Scott";
// 	double customerBill = 12000;
	
// 	public void show(double customerBill)
// 	{
// 		int customerId = 222;  // It will access beacuse it local lavel variable
// 		String customerName = "Alen";
		
// 		System.out.println(customerId); //222
// 		System.out.println(customerName); //Alen	
// 		System.out.println(customerBill); //18000	
		
// 	}
	
// }
