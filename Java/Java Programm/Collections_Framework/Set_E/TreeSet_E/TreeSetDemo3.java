package Collections_Framework.Set_E.TreeSet_E;

import java.util.TreeSet;

record Lion(Integer id, String name) implements Comparable<Lion>
{
	@Override
	public int compareTo(Lion y) 
	{
		return Integer.compare(this.id, y.id);		
	}	
}

public class TreeSetDemo3 
{
	public static void main(String[] args) 
	{
		TreeSet<Lion> sortedLion = new TreeSet<>();
		sortedLion.add(new Lion(2,"Simba"));
		sortedLion.add(new Lion(1,"Lion"));
		sortedLion.add(new Lion(3,"Tiger"));
		
		System.out.println("Soted By using ID :");
		System.out.println(sortedLion);

	}

}