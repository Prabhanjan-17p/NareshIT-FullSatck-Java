//Role of hashCode() and equals(Object obj) while working with HashSet and HashMap key.

package Collections_Framework.Set_E.HashMap_K_V;

import java.util.HashSet;

public class Testing
{
	public static void main(String[] args) 
	{
		
	  String s1 = "india";	  
	  String s2 = new String("india");  
	  System.out.println(s1.hashCode() +" : "+s2.hashCode());
	  	        
	  StringBuffer sb1 = new StringBuffer("Java");
	  StringBuffer sb2 = new StringBuffer("Java");
	  System.out.println(sb1.hashCode() +" : "+sb2.hashCode());
	  
	  HashSet<String> hsString = new HashSet<String>();
	  hsString.add(s1);
	  hsString.add(s2);
	  System.out.println(hsString.size());
	  System.out.println(hsString);
	  
	  System.out.println(".................");
	  
	  HashSet<StringBuffer> hsBuffer = new HashSet<>();
	  hsBuffer.add(sb1);
	  hsBuffer.add(sb2);
	  System.out.println(hsBuffer.size());
	  System.out.println(hsBuffer);
	    
	}
}