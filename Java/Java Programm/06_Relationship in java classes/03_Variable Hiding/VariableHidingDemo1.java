class Father
{
	protected double balance = 50000;
}

class Son extends Father
{
	protected double balance = 20000;  //Variable Hiding
	
	public void printBalance()
	{
		System.out.println("Son balance is :"+this.balance);
		System.out.println("Father balance is :"+super.balance);
	}	
}
public class VariableHidingDemo1 
{
	public static void main(String[] args) 
	{
		Son raj = new Son();
		raj.printBalance();
	}

}
