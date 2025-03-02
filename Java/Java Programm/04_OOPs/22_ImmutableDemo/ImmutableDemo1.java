public class ImmutableDemo1 {

	public static void main(String[] args) 
	{
		String str = new String("Hello");
		System.out.println("Before Method call :"+str);
        accept(str);
		str = "Change"; // it will change and create a new memory
        System.out.println("After Method call :"+str);
	}
	
	public static void accept(String s1)
	{
		s1 = "Hello World";// it will not afect and create a new memory
	}

}