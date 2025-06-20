package Collections_Framework.Generic;
//Mixing generic to non-generic
import java.util.*; 
public class Test7 
{
	public static void main(String[] args) 
	{ 
		List<Integer> myList = new ArrayList<>();	

		myList.add(4); 
		myList.add(6); 
		UnknownClass u = new UnknownClass(); 
		int total = u.addValues(myList); 
		System.out.println(total); 
	} 
}  
class UnknownClass1
{ 
    public int addValues(List list)  //Generic to raw
	{ 
		list.add(5);	//adding object to raw type
		Iterator it = list.iterator(); 
		int total = 0; 
		while (it.hasNext()) 
		{
		int i = ((Integer)it.next()); 
		total += i; 
		} 
		return total; 
	} 
}
//Here Compiler will generate warning message because the unsafe object is inserting the value 5 to safe object so caller method has problem.