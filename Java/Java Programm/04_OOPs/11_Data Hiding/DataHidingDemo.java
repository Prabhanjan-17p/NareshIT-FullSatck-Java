/*
 * Using Private key word data can hide
 */

//ELC Class-----------------------------------
public class DataHidingDemo {

	public static void main(String[] args) 
	{
		Customer scott = new Customer();
		scott.deposit(1000);
		scott.withdraw(5000);
	}

}


// BLC Class--------------------------------------------
class Customer 
{
   private double balance = 10000;  //Data Hiding
   
   public void deposit(double amount)
   {
	   //Data Validation
	   if(amount <=0)
	   {
		   System.err.println("Amount can't deposited");
		   System.exit(0);
	   }
	   else
	   {
		   this.balance = this.balance + amount;
		   System.out.println("Balance After Deposit is :"+this.balance);
	   }
   }
   
   public void withdraw(double amount)
   {
	   if(amount > this.balance)
	   {
		   System.err.println("Withdraw is not possible, Low Balance");
	   }
	   else
	   {
		   this.balance = this.balance - amount;
		   System.out.println("Balance After Withdraw is :"+this.balance);
	   }
	   
   } 
   
}