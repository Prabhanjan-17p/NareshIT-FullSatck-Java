public class PassByValueDemo2
{
	public static void main(String[] args) 
	{		
        int x = 100;
        int y = accept(x);
        System.out.println(x +" : "+y);
	}
	public static int accept(int val)
	{
		val = 500;
		return val;
	}
	
}