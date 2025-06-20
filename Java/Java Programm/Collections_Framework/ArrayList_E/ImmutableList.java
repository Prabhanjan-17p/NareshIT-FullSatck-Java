package Collections_Framework.ArrayList_E;

/*
It will create an immutable list, return type of this method is
List<E>. Once it is created after that we can't pefrom any kind of operation like add(),
remove() or replace [set(int index, Object obj)] otherwise we will get java.lang.UnsupportedOperationException

 */
import java.util.List;

public class ImmutableList {

	public static void main(String[] args) 
	{
		List<Integer> listOfNumber = List.of(1,2,3,4,5,6);		
		listOfNumber.set(0,100); //java.lang.UnsupportedOperationException
		listOfNumber.add(7); //java.lang.UnsupportedOperationException
		listOfNumber.remove(0); //java.lang.UnsupportedOperationException
	}

}