package Collections_Framework.ArrayList_E;
/*
In this fixed length array we can't perform add
or remove operation otherwise we will get  java.lang.UnsupportedOperationException but we can replace the existing element.
 */
import java.util.Arrays;
import java.util.List;

public class FixedLengthArray 
{
	public static void main(String[] args)
	{
		List<Integer> listOfNumber = Arrays.asList(1,2,3,4,5,6,7); // Fixed size
		System.out.println(listOfNumber);
		
//		listOfNumber.remove(0); //java.lang.UnsupportedOperationException
//		listOfNumber.add(8); //java.lang.UnsupportedOperationException
		
		listOfNumber.set(0, 100);
		System.out.println(listOfNumber);

	}

}