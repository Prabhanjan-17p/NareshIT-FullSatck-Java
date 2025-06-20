package Collections_Framework.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class LinkedListDemo
{
 public static void main(String args[])
 { 
      LinkedList<Object> list=new LinkedList<>();
	  list.add("Ravi");
	  list.add("Vijay");
	  list.add("Ravi");
	  list.add(null);
	  list.add(42);	  
	  
	  System.out.println("1st Position Element is :"+list.get(1));
	  //Iterator interface 	  
	   Iterator<Object> itr = list.iterator();
	   itr.forEachRemaining(System.out::println); //JDK 1.8	 
  }
}