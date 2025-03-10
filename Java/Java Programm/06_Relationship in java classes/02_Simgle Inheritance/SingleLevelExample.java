//Program on Single Level Inheritance :
// ----------------------------------------

class Super
{
	private int x, y;
    
	public void setData(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public int getX() 
	{
		return x;
	}
	
	public int getY() 
	{
		return y;
	}

	
}
class Sub extends Super
{
	public void showData()
	{
		System.out.println("x value is :"+getX());
		System.out.println("y value is :"+getY());
	}
}
public class SingleLevelExample {

	public static void main(String[] args) 
	{
       Sub s1 = new Sub();
       s1.setData(100, 200);
       s1.showData();
	}

}