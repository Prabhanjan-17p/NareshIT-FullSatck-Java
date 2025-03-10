// IQ :
// ---
class A
{
	public A()
	{
		System.out.println("A");
	}
}
class B extends A
{	
}

class C extends B
{
	public C()
	{
		System.out.println("C");
	}
}
public class IQ   
{                   
   public static void main(String [] args)
   {
       new C();	   
   }	
}  

// Output is : AC