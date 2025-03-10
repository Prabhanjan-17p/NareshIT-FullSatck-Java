class Base
{
	public void show()
	{
		System.out.println("Base class show method");
	}
}
class Derived extends Base
{
	public void show()
	{
		System.out.println("Derived class show method");
		super.show();
	}
}

public class MethodOverridingDemo2 {

	public static void main(String[] args) 
	{
		Derived d = new Derived();
		d.show();
	}

}