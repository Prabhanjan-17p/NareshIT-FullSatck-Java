class Shape
{
	protected int x;
	
	public Shape(int x)
	{
		this.x = x; 
		System.out.println("x value is :"+x);
	}	
}
class Square extends Shape
{	
	public Square(int side)
	{
		super(side);
	}
	
	public void getAreaOfSquare()
	{
		double area = x * x;
		System.out.println("Area of Square is :"+area);
	}
	
}

class Rectangle extends Shape
{
	protected int breadth;
	
	public Rectangle(int length, int breadth)
	{
		super(length);
		this.breadth = breadth;
	}
	
	public void getAreaOfRectangle()
	{
		double area = x * breadth;
		System.out.println("Area of Rectangle is :"+area);
	}	
	
}
public class HierarchicalDemo1 
{
	public static void main(String[] args) 
	{
		Square ss = new Square(10);
		ss.getAreaOfSquare();
		
		Rectangle rr = new Rectangle(8, 9);
		rr.getAreaOfRectangle();
		
	}

}