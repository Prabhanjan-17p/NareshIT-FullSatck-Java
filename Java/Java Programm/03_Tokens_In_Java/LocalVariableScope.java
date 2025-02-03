public class LocalVariableScope 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method Started!!!");
		m1();
		System.out.println("Main method ended!!!");
	}
	
	public static void m1()
	{
		System.out.println("M1 method Started!!!");
		m2();
		System.out.println("M1 method ended!!!");
	}
	
	public static void m2()
	{
		System.out.println("Inside the m2 method body!!!");
		int x = 100;
		System.out.println(x);
	}	
	
}