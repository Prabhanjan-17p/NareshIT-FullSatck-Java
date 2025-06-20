package Collections_Framework.Set_E.TreeSet_E;

import java.util.TreeSet;

record Student(Integer id, String name, Integer age)
{	
}

public class TreeSetDemo7 
{
	public static void main(String[] args)
	{
		TreeSet<Student> ts1 = new TreeSet<Student>((s1,s2)-> s1.id() - s2.id());
		ts1.add(new Student(333,"Aryan",24));
		ts1.add(new Student(111,"Zuber",26));
		ts1.add(new Student(222,"Raj",22));
		
		System.out.println("Sorting Student Based on the Id :");
		ts1.forEach(std -> System.out.println(std));

		
		TreeSet<Student> ts2 = new TreeSet<Student>((s1,s2)-> s1.name().compareTo(s2.name()));
		ts2.add(new Student(333,"Aryan",24));
		ts2.add(new Student(111,"Zuber",26));
		ts2.add(new Student(222,"Raj",22));
		
		System.out.println("Sorting Student Based on the Name :");
		ts2.forEach(std -> System.out.println(std));
	}

}