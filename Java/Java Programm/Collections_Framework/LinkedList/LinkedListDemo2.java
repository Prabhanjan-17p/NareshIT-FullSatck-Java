package Collections_Framework.LinkedList;//Methods of LinkedList class
import java.util.LinkedList;
public class LinkedListDemo2
{
    public static void main(String[] argv) 
    {
          LinkedList<String> list = new LinkedList<>();
          
          list.addFirst("Ravi");  // Ravi  Rahul  Anand
          list.add("Rahul"); 
          list.addLast("Anand");	
          
          System.out.println(list.getFirst()); 
          System.out.println(list.getLast()); 
          
          list.removeFirst();
          list.removeLast(); 
          
          System.out.println(list); //[Rahul]        
         
    }
}