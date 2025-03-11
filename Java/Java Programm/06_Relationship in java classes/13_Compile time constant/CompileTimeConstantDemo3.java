//You should be maintan 2 different file 

// Foo.java
// ---------
class  Foo
{
	public static final int MAX_PRIORITY = 72;
}


// CompileTimeConstantDemo3.java
// -------------------------------
//ELC
public class CompileTimeConstantDemo3 
{
	public static void main(String[] args) 
	{
		System.out.println(Foo.MAX_PRIORITY);
	}
}


/*
 * Note : If we compile and execute both programs we will get 72 value, now change the 72 to 95, Re- compile only Foo.java so a new .class file will be created which will hold 95 value. Now without re-compilation of CompileTimeConstantDemo3.java if we execute CompileTimeConstantDemo3.java then we wil get 72 so it takes the value at compile time.
 */
