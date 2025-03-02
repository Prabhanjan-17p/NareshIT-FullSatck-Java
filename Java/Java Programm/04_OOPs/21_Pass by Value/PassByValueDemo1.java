public class PassByValueDemo1 {

	public static void main(String[] args) 
	{
		int x = 100;
		m1(x);
		System.out.println("x value is :"+x);
	}
	
	public static void m1(int val)
	{
		val = 200;		
	}

}