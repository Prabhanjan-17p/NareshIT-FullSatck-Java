//Assigning smaller data type value to bigger data type
public class Test5
{
public static void main(String[] args)
	{
   	    byte b = 125;  
		short s = b;  //Automatic type casting OR Widening 
		System.out.println(s);
		
		short x = 345;
		int y = x;  //Automatic type casting OR Widening 
		System.out.println(y);
	}
}