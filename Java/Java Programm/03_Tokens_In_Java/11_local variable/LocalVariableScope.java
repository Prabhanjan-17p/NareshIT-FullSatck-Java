public class LocalVariableScope 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method Started!!!"); // 1
		m1(); // in this case m1() calling 
		System.out.println("Main method ended!!!"); // last print //6
	}
	
	public static void m1()
	{
		System.out.println("M1 method Started!!!"); // 2
		m2(); // m2() calling 
		System.out.println("M1 method ended!!!"); // 2nd last print // 5 
	}
	
	public static void m2()
	{
		System.out.println("Inside the m2 method body!!!"); // 3
		int x = 100; 
		System.out.println(x); // 1st last print // 4
	}	
	
	//Note - Accoriding to the number output will show
}
