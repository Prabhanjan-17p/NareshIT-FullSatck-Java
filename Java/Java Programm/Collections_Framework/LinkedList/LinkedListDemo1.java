package Collections_Framework.LinkedList;

import java.util.*;
public class LinkedListDemo1
{
      public static void main(String args[])
      {
           LinkedList<String> list= new LinkedList<>(); //generic
           list.add("Item 2");//2  
           list.add("Item 3");//3   
           list.add("Item 4");// 4  
           list.add("Item 5");// 5  
           list.add("Item 6");// 6 
           list.add("Item 7");// 7
           
           list.add("Item 9"); //10  

           list.add(0,"Item 0");//0
           list.add(1,"Item 1"); //1
           
           

           list.add(8,"Item 8");//8
		   list.add(9,"Item 10");//9
            System.out.println(list);
			
         
			list.remove("Item 5"); 
			  
			  System.out.println(list);
			  
			  
			   list.removeLast(); 
			    System.out.println(list);
			   
			     list.removeFirst(); 
			    System.out.println(list);
			   
			  list.set(0,"Ajay"); //set() will replace the existing value
			  list.set(1,"Vijay"); 
			  list.set(2,"Anand"); 
			  list.set(3,"Aman");
			  list.set(4,"Suresh"); 
			  list.set(5,"Ganesh");
			  list.set(6,"Ramesh");
			  list.forEach(x -> System.out.println(x)); 		
			
      } 
}