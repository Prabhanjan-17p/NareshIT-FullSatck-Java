package Collections_Framework.Set_E.TreeSet_E;

import java.util.TreeSet;

public class TreeSetDemo6 {

	public static void main(String[] args) 
	{
		TreeSet<Double> ts1 = new TreeSet<Double>();
		ts1.add(30.5);
		ts1.add(20.5);
		ts1.add(10.5);
		
		TreeSet<Double> ts2 = new TreeSet<Double>(ts1);
		System.out.println(ts2);

	}

}