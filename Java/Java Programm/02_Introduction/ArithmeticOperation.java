public class ArithmeticOperation 
{
	public static void main(String[] args) 
	{
		int result = Calculate.getSqureOfNum(9);
		System.out.println("Square is :"+result);
		
		result =   Calculate.getCubeOfNum(3);  
		System.out.println("Cube is :"+result);
		
		result =  Calculate.doSum(12, 12);
		System.out.println("Sum is :"+result);

	}

}

class Calculate
{
	public static int getSqureOfNum(int num)
	{
		return num*num;
	}
	
	public static int getCubeOfNum(int num)
	{
		return num*num*num;
	}
	
	public static int doSum(int x, int y)
	{
		return x+y;		
	}
	
}