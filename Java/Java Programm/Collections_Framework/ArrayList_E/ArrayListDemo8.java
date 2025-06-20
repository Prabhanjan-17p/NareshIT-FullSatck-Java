package Collections_Framework.ArrayList_E;

import java.util.ArrayList;

public class ArrayListDemo8
{
    public static void main(String[] args) 
    {
        ArrayList<String> original = new ArrayList<>();
        original.add("BCA");
        original.add("MCA");
        original.add("BBA");
        
        System.out.println("By using clone Method");
        @SuppressWarnings("unchecked")
		ArrayList<String> cloned = (ArrayList<String>) original.clone();
        System.out.println(cloned);    
        
        
      System.out.println("By using Copy Constructor");
      ArrayList<String> copyConstr = new ArrayList<String>(original);
      System.out.println(copyConstr);      
       
    }
}