public class AreaOfRectangle 
{
	public static void main(String[] args) 
	{
		double length = Double.parseDouble(args[0]);
		double breadth = Double.parseDouble(args[1]);
		
		double area = length * breadth;
		
		System.out.println("Area of Rectangle is :"+area);	

	}

}