public class CommandValues 
{
	public static void main(String[] args) 
	{
		if(args.length == 0)
		{
		   System.out.println("No value is provided");	
		}
		else if(args.length == 1)
		{
			int num = Integer.parseInt(args[0]);
			System.out.println("Square of "+num+" is :"+(num*num));
		}
		else if(args.length == 2)
		{
		    int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println("Sum of "+a+" and "+b+ " is :"+(a+b));
		}
	}
}