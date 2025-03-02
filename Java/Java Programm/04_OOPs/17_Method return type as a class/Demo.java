// When a method return a class object

public class Demo
{
	public Demo(int x)
	{
		
	}
	
		
    public Demo m1()
    {
    	//return null;
    	
    	//return new Demo(10);
    	
    	Demo d1 = new Demo(100);
    	return d1;    	
    }
}