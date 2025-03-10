class Demo 
{
    static 
	{   
		i = 100;
		//System.out.println(i); //Illegal forward reference
		System.out.println(Demo.i);
    }

    static int i;
}

public class StaticBlockDemo6
{

    public static void main(String[] args) 
	{
		System.out.println(Demo.i);
	}
}