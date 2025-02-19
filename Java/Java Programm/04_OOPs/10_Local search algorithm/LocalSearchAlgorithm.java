/*
 * In this bellow program shows that 
 * 		- All static variable are stored in "class area or Method area" (means loading the .class into jvm)
 * 		- All local and parameter variable are stored in "Stack memory" (it separate stack frame)
 * 		- All Non static variable are stored in "Heap Memory" (it allocate at the time object creation and with the help of new keyword default value will assign to the variable)
 */

class Test
{
	static int a = 100;  //static Field -- (means loading the .class into jvm)
	int b = 200; //Non static Field  -- ("Heap Memory")
	
	public void accept(int c)   //Parameter Variable
	{
		int d = 400;  //Local Variable --("Stack memory" )
		System.out.println("Static Field :"+Test.a);
		System.out.println("Non Static Field :"+this.b);
		System.out.println("Parameter Variable :"+c);
		System.out.println("Local Variable :"+d);
	}
}
public class LocalSearchAlgorithm 
{
	public static void main(String[] args) 
	{
		Test t1 = new Test();
		t1.accept(300);
	}

}
