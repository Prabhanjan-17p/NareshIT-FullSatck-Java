public class Test11  
{
	public static void main(String[] args) 
	{
		System.out.println("Min Value :"+(int)Character.MIN_VALUE);
		System.out.println("Max Value :"+(int)Character.MAX_VALUE);
		
		int min = '\u0000';
		int max = '\uffff';
       
		System.out.println("Min Value :"+min);
		System.out.println("Max Value :"+max);
		
		
	}
}