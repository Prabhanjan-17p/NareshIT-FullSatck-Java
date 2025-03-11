class Demo
{
	public static void print()
	{
		x = 120;
		System.out.println("x value is :"+x);
	}
	
	static int x;
}

public class StaticBlockDemo11 
{
	public static void main(String[] args) 
	{
		System.out.println(Demo.x);
		Demo.print();
	}
}