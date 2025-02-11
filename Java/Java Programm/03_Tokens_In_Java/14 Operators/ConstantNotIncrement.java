public class ConstantNotIncrement
{

	public static void main(String[] args) 
	{
                 int x = 20;
		 int y = ++x; 
		//  int y = ++20; //error
		System.out.println(x + " : "+ y);
	}
}
