//illegal forward reference

class Demo 
{	
    static
	{   
		i = 100;		
	}

    static int i;
}

public class StaticBlockDemo5
{
    public static void main(String[] args) 
	{
        System.out.println(Demo.i);
	}
}