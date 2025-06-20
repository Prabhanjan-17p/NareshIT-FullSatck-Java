package Collections_Framework.Generic;//Mixing generic to non-generic
import java.util.*; 
public class Test6 
{
	public static void main(String[] args) 
	{ 
		List<Integer> myList = new ArrayList<>(); 
		myList.add(4); 
		myList.add(6); 
		myList.add(5);
        
		UnknownClass u = new UnknownClass(); 
		int total = u.addValues(myList); 
		System.out.println("The sum of Integer Object is :"+total); 
	} 
}  
class UnknownClass 
{ 
	public int addValues(List list)  //generic to raw type OR 
	{ 
	Iterator it = list.iterator();    
	int total = 0; 
	while (it.hasNext()) 
	{
		int i = ((Integer)it.next());
		total += i;                           //total =  15
	} 
	return total; 
	} 
}

/*
Note :-
In the above program the compiler will not generate any warning message because even though we are assigning type safe Integer Object to unsafe or raw type List Object but this List Object is not inserting anything new in the collection so there is no risk to the caller.
 */