public class AreaOfCircle 
{
	public static void main(String[] args) 
	{
		 final double PI = 3.14;		 
		 double radius = Double.parseDouble(args[0]);
		 
		 double area = PI * radius * radius;
		 
		 System.out.printf("Area of Circle is : %.2f ",area);
		 
	}

}
// 597 line