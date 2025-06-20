package Collections_Framework.Set_E.TreeSet_E;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetDemo5 {

	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("A");
		list.add("B");
		list.add("C");
		
		TreeSet<String> ts = new TreeSet<>(list);
		System.out.println(ts);
		

	}

}