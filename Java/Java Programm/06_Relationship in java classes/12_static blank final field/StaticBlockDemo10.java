class Sample
{	
	static 
	{
		System.out.println("Static Block");
		x = m1();	
		System.out.println("x from static block :"+Sample.x);
	}
	
	public static int m1()
	{
	   System.out.println("Static Method");
	   return 100;	
	}
		
	static int x; 
}


public class StaticBlockDemo10 
{
	public static void main(String[] args) 
	{
		System.out.println("x from main method :"+Sample.x);
	}
}